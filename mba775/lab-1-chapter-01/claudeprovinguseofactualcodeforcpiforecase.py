"""MBA 775 - Chapter 1, Script D (student-written, not a provided course file)
Inspecting CPIAUCSL and forecasting August 2026.

Data file needed: CPIAUCSL.csv (FRED series CPIAUCSL, All Items CPI-U,
seasonally adjusted, index 1982-1984=100)

This script does two things:
  1. Runs the same kind of verification checks as 01a_inspect_dff.py, but on
     the CPI series, after filling a single known gap (October 2025) using
     an interpolation the student already checked against 78 years of
     history.
  2. Produces a one-step-ahead forecast for August 2026 (the value due for
     release September 11, 2026) using an analogous bias-adjusted approach,
     built from history rather than assumed.

This file was NOT provided with the course pack. It reuses find_data() from
_course.py but does not modify _course.py, per course convention.
"""

import pandas as pd

from _course import banner, find_data

# ---------------------------------------------------------------------------
banner("0. Load and document the known gap")

path = find_data("CPIAUCSL.csv")
raw = pd.read_csv(path, parse_dates=["observation_date"])
raw = raw.rename(columns={"observation_date": "date", "CPIAUCSL": "cpi"})
series = raw.set_index("date")["cpi"].astype("float64").sort_index()
series.name = "cpi"

missing_before = series[series.isna()]
print(f"Missing values before any fill: {len(missing_before)}")
print(missing_before.to_string() if len(missing_before) else "(none)")

# The October 2025 gap was checked separately: across 78 years (1947-2024)
# with complete Sept/Oct/Dec triples, October averaged 0.100 index points
# BELOW the simple midpoint of September and December. That bias-adjusted
# estimate is applied here explicitly, not silently.
OCT_2025_ESTIMATE = 325.038  # midpoint(324.245, 326.031) - 0.100 bias
ASSUMPTION_NOTE = (
    "October 2025 CPI is not published in this data pull. The value used "
    "below (325.038) is an ESTIMATE: the midpoint of September 2025 "
    "(324.245) and December 2025 (326.031), adjusted by -0.100, the "
    "average historical error of that midpoint method across 78 years "
    "(1947-2024) of complete Sept/Oct/Dec data. This is an assumption, "
    "not a reported figure, and should be labeled as such in any write-up."
)
series.loc["2025-10-01"] = OCT_2025_ESTIMATE
series = series.sort_index()

print("\nASSUMPTION APPLIED:")
print(ASSUMPTION_NOTE)

# ---------------------------------------------------------------------------
banner("1. What did we get?")

print(f"Observations       : {len(series):,}")
print(f"First date         : {series.index.min().date()}")
print(f"Last date          : {series.index.max().date()}")
print(f"Missing (after fill): {int(series.isna().sum())}")

# ---------------------------------------------------------------------------
banner("2. Are the data types right?")

print(f"Values are stored as : {series.dtype}")
print(f"Index is stored as   : {type(series.index).__name__}")

# ---------------------------------------------------------------------------
banner("3. Is the index itself sound?")

n_duplicates = int(series.index.duplicated().sum())
print(f"Dates are unique   : {series.index.is_unique}")
print(f"Duplicate dates    : {n_duplicates}")
print(f"Dates are in order : {series.index.is_monotonic_increasing}")

# ---------------------------------------------------------------------------
banner("4. What is the publication calendar?")

# CPI is monthly, always dated the 1st of the month, so check month-to-month
# spacing rather than calendar days (which is the right check for a daily
# series like DFF, not this one).
expected_months = pd.date_range(series.index.min(), series.index.max(), freq="MS")
missing_months = expected_months.difference(series.index)

print(f"Months expected (1st of month, {series.index.min().date()} to "
      f"{series.index.max().date()}): {len(expected_months):,}")
print(f"Months present                                        : {len(series):,}")
print(f"Months with no row at all                              : {len(missing_months)}")
if len(missing_months):
    print(f"  Missing: {[d.date() for d in missing_months]}")

# ---------------------------------------------------------------------------
banner("5. Descriptive statistics")

print(series.describe().round(3).to_string())

# ---------------------------------------------------------------------------
banner("6. The most recent observations")

tail = series.tail(14).to_frame("cpi")
tail["mom_change"] = series.diff().tail(14)
tail["mom_pct_change"] = (series.pct_change() * 100).tail(14)
print(tail.round(4).to_string())

print("\nRow for 2025-10-01 is the filled estimate (325.038), not a")
print("published figure -- everything above and below it is actual data.")

# ---------------------------------------------------------------------------
banner("7. Forecasting August 2026: building the method from history")

# August 2026 is NOT a gap between two known points -- it is one step past
# the end of the series (last actual observation: July 2026). There is no
# "September 2026" to average against, so the Sept/Oct/Dec midpoint method
# does not apply here. The analogous, history-based approach is:
#   - Look at every historical July -> August move.
#   - Take the average change (a "seasonal-naive plus drift" forecast).
#   - Apply it forward from the actual, known July 2026 value.
# This mirrors the earlier method in spirit (let history set the
# adjustment, do not guess it) but is a genuinely different mechanism,
# because interpolation and extrapolation are different problems.

july_2026 = series.loc["2026-07-01"]
print(f"Last actual observation (July 2026): {july_2026}")

years = range(1947, 2026)
rows = []
for y in years:
    try:
        jul = series.loc[f"{y}-07-01"]
        aug = series.loc[f"{y}-08-01"]
    except KeyError:
        continue
    if pd.isna(jul) or pd.isna(aug):
        continue
    rows.append({
        "year": y, "jul": jul, "aug": aug,
        "change": aug - jul,
        "pct_change": (aug - jul) / jul * 100,
    })

hist = pd.DataFrame(rows).set_index("year")
print(f"\nYears with complete July/August pairs: {len(hist)}")

mean_change_all = hist["change"].mean()
mean_pct_change_all = hist["pct_change"].mean()

recent10 = hist.loc[hist.index >= hist.index.max() - 9]
mean_change_10 = recent10["change"].mean()
mean_pct_change_10 = recent10["pct_change"].mean()

print(f"\nAll {len(hist)} years (1947-2025):")
print(f"  mean July->Aug change     : {mean_change_all:+.3f} index points")
print(f"  mean July->Aug pct change : {mean_pct_change_all:+.3f}%")

print(f"\nLast 10 years ({recent10.index.min()}-{recent10.index.max()}):")
print(recent10.round(3).to_string())
print(f"  mean July->Aug change     : {mean_change_10:+.3f} index points")
print(f"  mean July->Aug pct change : {mean_pct_change_10:+.3f}%")

forecast_level_all78 = july_2026 + mean_change_all
forecast_pct_all78 = july_2026 * (1 + mean_pct_change_all / 100)
forecast_level_10yr = july_2026 + mean_change_10
forecast_pct_10yr = july_2026 * (1 + mean_pct_change_10 / 100)




# 0. Load and document the known gap
# ----------------------------------
# Traceback (most recent call last):
#   File "d:\GitHub\kennethlarotyamat.github.io\mba775\lab-1-chapter-01\claudeprovinguseofactualcodeforcpiforecase.py", line 27, in <module>
#     path = find_data("CPIAUCSL.csv")
#            ^^^^^^^^^^^^^^^^^^^^^^^^^
#   File "d:\GitHub\kennethlarotyamat.github.io\mba775\lab-1-chapter-01\_course.py", line 69, in find_data
#     raise FileNotFoundError(
# FileNotFoundError: Could not find 'CPIAUCSL.csv'.
# Upload it alongside this script, or download it from the course repository at https://github.com/jcrooker/mba775 (data/ folder).
# Looked in:
#     D:\GitHub\data\CPIAUCSL.csv
#     D:\GitHub\kennethlarotyamat.github.io\mba775\lab-1-chapter-01\data\CPIAUCSL.csv
#     D:\GitHub\kennethlarotyamat.github.io\mba775\data\CPIAUCSL.csv
#     D:\GitHub\CPIAUCSL.csv
#     D:\GitHub\kennethlarotyamat.github.io\mba775\lab-1-chapter-01\CPIAUCSL.csv
#     \mnt\user-data\uploads\CPIAUCSL.csv
#     \mnt\data\CPIAUCSL.csv

# PS D:\GitHub> 

# # claude prompt : I tried running it on VS Code and this error came up:0. Load and document the known gap
# ----------------------------------
# Traceback (most recent call last):
#   File "d:\GitHub\kennethlarotyamat.github.io\mba775\lab-1-chapter-01\claudeprovinguseofactualcodeforcpiforecase.py", line 27, in <module>
#     path = find_data("CPIAUCSL.csv")
#            ^^^^^^^^^^^^^^^^^^^^^^^^^
#   File "d:\GitHub\kennethlarotyamat.github.io\mba775\lab-1-chapter-01\_course.py", line 69, in find_data
#     raise FileNotFoundError(
# FileNotFoundError: Could not find 'CPIAUCSL.csv'.
# Upload it alongside this script, or download it from the course repository at https://github.com/jcrooker/mba775 (data/ folder).
# Looked in:
#     D:\GitHub\data\CPIAUCSL.csv
#     D:\GitHub\kennethlarotyamat.github.io\mba775\lab-1-chapter-01\data\CPIAUCSL.csv
#     D:\GitHub\kennethlarotyamat.github.io\mba775\data\CPIAUCSL.csv
#     D:\GitHub\CPIAUCSL.csv
#     D:\GitHub\kennethlarotyamat.github.io\mba775\lab-1-chapter-01\CPIAUCSL.csv
#     \mnt\user-data\uploads\CPIAUCSL.csv
#     \mnt\data\CPIAUCSL.csv

# PS D:\GitHub> 

# notes: dropped CPI CSV filed into the correct folder, and renamed it.



# ---------------------------------------------------------------------------
banner("8. August 2026 forecast")

print(f"Starting point (actual July 2026 CPI): {july_2026}")
print()
print(f"{'Method':<45}{'Forecast':>12}")
print(f"{'-'*45}{'-'*12}")
print(f"{'Level-change, all 78 years avg':<45}{forecast_level_all78:>12.3f}")
print(f"{'Pct-change,   all 78 years avg':<45}{forecast_pct_all78:>12.3f}")
print(f"{'Level-change, last 10 years avg':<45}{forecast_level_10yr:>12.3f}")
print(f"{'Pct-change,   last 10 years avg':<45}{forecast_pct_10yr:>12.3f}")

print("\nThe question asked for the 78-year bias-adjusted figure specifically:")
print(f"  Forecast (level-change method, all 78 years): {forecast_level_all78:.3f}")
print(f"  Forecast (pct-change method,   all 78 years): {forecast_pct_all78:.3f}")

print("\nThese two 78-year numbers differ slightly because a fixed average")
print("POINT change and a fixed average PERCENT change do not agree once")
print("the index level has grown this much since 1947 -- the same average")
print("dollar move is a much smaller percent move today than it was at a")
print("base of ~22. Which one is more defensible for 2026 is a judgment")
print("call: percent change is usually the better assumption for a series")
print("that compounds over 78 years of very different price levels.")