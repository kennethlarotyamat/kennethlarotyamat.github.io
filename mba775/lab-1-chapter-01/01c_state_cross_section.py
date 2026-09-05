"""MBA 775 - Chapter 1, Script C
A cross section is a claim about timing, not just a table of numbers.

Data file needed: state_unemployment.csv

Cross-sectional data are values collected from many subjects during the SAME
time period. Downloading fifty state unemployment rates does not by itself
produce a cross section: the states have to actually be reporting the same
period. This script checks that before comparing anything.
"""

# assignment notes

# The Forecast Project will count for 10% of the course grade. Each student must submit their own forecasts 
# in Canvas even if you work with someone else to calculate the forecast. The schedule of forecast periods is 
# provided below. This project is now built in Python: rather than reading numbers off a web page, you will pull 
# the series programmatically from FRED using the fredapi package (a free FRED API key takes about a minute to obtain), 
# and build a forecast from a script you can rerun each period. I will post a starter script that retrieves a series, 
# plots it, and produces a naive baseline forecast — your job is to beat that baseline and to be able to explain why your approach should work.

# more assignment notes author: john crooker, phd.
# Forecasting Schedule
# Submit your forecasts, see Canvas. US Weekly jobless claims are reported on CNBC Thursday mornings. The forecast period is the next period that will be released by the data provider. For the FRED data (all but Las Vegas Visitor Volume), you can see the next date to be released on the data series page.

# All of the FRED series below can be retrieved directly in Python with fredapi, so you should not be transcribing numbers by hand:

# from fredapi import Fred
# fred = Fred(api_key="YOUR_FREE_KEY")
# icsa = fred.get_series("ICSA")       # Weekly initial unemployment claims
# cpi  = fred.get_series("CPIAUCSL")   # Consumer Price Index
# hst  = fred.get_series("HOUST")      # New privately-owned housing starts
# nvhpi= fred.get_series("NVSTHPI")    # Nevada House Price Index (quarterly)
# Las Vegas Visitor Volume is not on FRED and must be taken from the LVCVA visitor statistics page. 
#
# [Claude Prompt] 

# Do I need to make any changes to these files to upload consumer 
# price index data? I need to make a forecast for the CPI - The August 
# 2026 Consumer Price Index for All Urban Consumers - for the september 11th 2026 release?
# it's this one: cpi  = fred.get_series("CPIAUCSL")   # Consumer Price Index

# [claude output]
# This conflicts with how this course's scripts are built. 
# COURSE_CONTEXT.md says explicitly: "Scripts read local files. They do not download anything."
# You pull the data yourself and upload it as a CSV

# [claude prompt]
# I'm about to download this one, would this be the correct one I'm looking for, 
# one is the assignment, one one is the fred page that I'm about to download the CSV file for.
# uploaded 2 images to claude.

# [claude output]

# Careful — these don't match. Look at the series 
# ID on the FRED page in your first screenshot: CPILFESL — that's "All Items Less Food and Energy" (core CPI). But the code line you showed me earlier was:
# v Go to https://fred.stlouisfed.org/series/CPIAUCSL directly, or

# [claude prompt] [okay, here is the correct file, or double check, I think that this is the correct one.]
# claude output : One missing value: October 2025 shows a blank/NaN, sitting in the middle of an otherwise complete series.
# aside. what a nightmare. I have to log into excel right now. One missing value: October 2025 shows a blank/NaN, sitting in the middle of an otherwise complete series.

# search - was there a cpi forcast for : 10/1/2025

# search response - There was no official U.S. Bureau of Labor Statistics 
# (BLS) CPI forecast for October 1, 2025, because the October 2025 CPI was never 
# published due to a federal government shutdown that halted data collection




import matplotlib.pyplot as plt
import pandas as pd

from _course import banner, load_state_unemployment

panel = load_state_unemployment("state_unemployment.csv")

# ---------------------------------------------------------------------------
banner("1. What is in the file?")

print(f"Rows    : {len(panel):,}")
print(f"States  : {panel['state'].nunique()}")
print(f"Dates   : {panel['date'].min().date()} to {panel['date'].max().date()}")
print(f"Missing : {int(panel['unemployment_rate'].isna().sum())}")

# ---------------------------------------------------------------------------
banner("2. Take the latest observation for each state")

latest = (panel.dropna(subset=["unemployment_rate"])
                .sort_values("date")
                .groupby("state", as_index=False)
                .last())

print(f"One observation for each of {len(latest)} states.")

# ---------------------------------------------------------------------------
banner("3. Is this actually a cross section?")

date_counts = latest["date"].value_counts().sort_index()
print(date_counts.to_string())

if len(date_counts) == 1:
    reference = date_counts.index[0]
    print(f"\nAll {len(latest)} states report {reference.date()}.")
    print("This is a clean cross section.")
else:
    reference = date_counts.index.max()
    lagging = sorted(latest.loc[latest["date"] != reference, "state"])
    print(f"\nWARNING: {len(date_counts)} distinct dates. These states are NOT")
    print("all measured in the same period.")
    print(f"Not reporting {reference.date()}: {', '.join(lagging)}")
    print("\nDo not quietly compare them. Either restrict to a common date or")
    print("say plainly in your write-up that the periods differ.")

# ---------------------------------------------------------------------------
banner("4. Census regions")

state_regions = {
    "New England":        ["CT", "ME", "MA", "NH", "RI", "VT"],
    "Mid-Atlantic":       ["NJ", "NY", "PA"],
    "East North Central": ["IL", "IN", "MI", "OH", "WI"],
    "West North Central": ["IA", "KS", "MN", "MO", "NE", "ND", "SD"],
    "South Atlantic":     ["DE", "FL", "GA", "MD", "NC", "SC", "VA", "WV"],
    "East South Central": ["AL", "KY", "MS", "TN"],
    "West South Central": ["AR", "LA", "OK", "TX"],
    "Mountain":           ["AZ", "CO", "ID", "MT", "NV", "NM", "UT", "WY"],
    "Pacific":            ["AK", "CA", "HI", "OR", "WA"],
}

lookup = {st: region for region, members in state_regions.items() for st in members}
latest["region"] = latest["state"].map(lookup)

unassigned = latest.loc[latest["region"].isna(), "state"].tolist()
print(f"States assigned to a region: {latest['region'].notna().sum()} "
      f"of {len(latest)}")
if unassigned:
    print(f"Unassigned: {unassigned}")

by_region = (latest.groupby("region")["unemployment_rate"]
                   .agg(["count", "mean", "min", "max"])
                   .round(2)
                   .sort_values("mean"))
print("\n" + by_region.to_string())

# ---------------------------------------------------------------------------
banner("5. Highest and lowest states")

ranked = latest.sort_values("unemployment_rate", ascending=False)
print("Highest five:")
print(ranked.head(5)[["state", "region", "unemployment_rate"]].to_string(index=False))
print("\nLowest five:")
print(ranked.tail(5)[["state", "region", "unemployment_rate"]].to_string(index=False))

nv = latest.loc[latest["state"] == "NV", "unemployment_rate"]
if len(nv):
    rank = int((latest["unemployment_rate"] > nv.iloc[0]).sum()) + 1
    print(f"\nNevada: {nv.iloc[0]:.1f}% -- {rank} of {len(latest)} states, "
          f"highest to lowest.")

# ---------------------------------------------------------------------------
banner("6. Distribution within each region")

order = by_region.index.tolist()
data = [latest.loc[latest["region"] == r, "unemployment_rate"].dropna()
        for r in order]

fig, ax = plt.subplots(figsize=(9, 5))
ax.boxplot(data, vert=False, widths=0.6, patch_artist=True,
           boxprops={"facecolor": "#a03123", "alpha": 0.75},
           medianprops={"color": "white"})
# Set the labels separately: boxplot's own keyword was renamed in matplotlib
# 3.9, and this works on every version.
ax.set_yticks(range(1, len(order) + 1))
ax.set_yticklabels(order)
ax.set_xlabel("Unemployment rate (percent)")
ax.set_title(f"State unemployment by Census region, {reference.date()}")
ax.grid(axis="x", color="#e6e6e6")
ax.spines[["top", "right"]].set_visible(False)
fig.tight_layout()
plt.show()

banner("Something to answer in writing")
print("The regional averages differ. In two or three sentences, say what this")
print("comparison can and cannot tell you about why. What would you need to")
print("know before treating a regional gap as evidence about policy?")
