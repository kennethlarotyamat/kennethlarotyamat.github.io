"""MBA 775 - Chapter 1, Script A
Inspecting a downloaded data set before you analyze it.

The Federal Funds Effective Rate (FRED series DFF) is the interest rate at
which depository institutions lend reserve balances to each other overnight.

Data file needed: dff.csv
Source:           https://github.com/jcrooker/mba775  (data/ folder)

A program that runs without an error has not verified anything. This script
performs the checks that should precede any analysis: what did we actually
get, what type is it, what is missing, and does the coverage match what we
believe we asked for.
"""
# when i try to run this program, I get this: 
# PS D:\GitHub> & C:\Python312\python.exe d:/GitHub/kennethlarotyamat.github.io/mba775/lab-1-chapter-01/01a_inspect_dff.py
# Traceback (most recent call last):
#   File "d:\GitHub\kennethlarotyamat.github.io\mba775\lab-1-chapter-01\01a_inspect_dff.py", line 16, in <module>
# import pandas as pd
# ModuleNotFoundError: No module named 'pandas'
# PS D:\GitHub> 
# i basically had to install pandas
# now i'm going to try running this again. 


import pandas as pd

from _course import banner, load_dff, month_coverage

full = load_dff("dff.csv")

# The lecture note requests this series starting in January 2020. The data file
# carries the whole published history, so we can look at both and see how much
# the answer depends on the window we chose.
LECTURE_START = "2020-01-01"
recent = full.loc[LECTURE_START:]

rate = full  # the checks below run on the full history

# ---------------------------------------------------------------------------
banner("1. What did we get?")

print(f"{'':<14}{'full history':>16}{'since ' + LECTURE_START:>18}")
print(f"{'Observations':<14}{len(full):>16,}{len(recent):>18,}")
print(f"{'First date':<14}{str(full.index.min().date()):>16}"
      f"{str(recent.index.min().date()):>18}")
print(f"{'Last date':<14}{str(full.index.max().date()):>16}"
      f"{str(recent.index.max().date()):>18}")
print(f"{'Missing':<14}{int(full.isna().sum()):>16,}{int(recent.isna().sum()):>18,}")

print("\nThe lecture note works with the shorter window. Note how different")
print("the two columns are -- every summary statistic you report depends on")
print("a choice of window that is easy to make without noticing.")

# ---------------------------------------------------------------------------
banner("2. Are the data types right?")

print(f"Values are stored as : {rate.dtype}")
print(f"Index is stored as   : {type(rate.index).__name__}")

if rate.dtype != "float64":
    print("\nWARNING: the rate column is not numeric. Any average you compute")
    print("from it would be meaningless or would fail outright.")

# ---------------------------------------------------------------------------
banner("3. Is the index itself sound?")

# Check this BEFORE computing any coverage ratio. A duplicated date inflates
# the observation count, which can offset a real gap and produce a reassuring
# percentage for a series that is broken in two places at once. Verifying the
# denominator of your own check is not paranoia; it is the job.
n_duplicates = int(rate.index.duplicated().sum())

print(f"Dates are unique   : {rate.index.is_unique}")
print(f"Duplicate dates    : {n_duplicates}")
print(f"Dates are in order : {rate.index.is_monotonic_increasing}")

if n_duplicates:
    print("\nWARNING: some dates appear more than once. Every count, mean, and")
    print("coverage figure below is affected. Resolve this before continuing.")
    print(rate.index[rate.index.duplicated(keep=False)].unique()[:10])




    # what is the keyboard shortcut for block comments in a .py file?
    # so I ran the program after installing pandas, and this is what was produced:  

    # 
#     PS D:\GitHub> & C:\Python312\python.exe d:/GitHub/kennethlarotyamat.github.io/mba775/lab-1-chapter-01/01a_inspect_dff.py
# coming back around to this. this shouldn't really take too long, but for some reason I'm having trouble getting around to it. 9.5.2026 1.56 PM
# distractions, over and over and over. It's kind of the way it goes. I'm figuring out
# which version of "In a Sentimental Mood to download." I still buy digital music. Sorry.
# 1. What did we get?
# -------------------
#                   full history  since 2020-01-01
# Observations            26,342             2,417
# First date          1954-07-01        2020-01-01
# Last date           2026-08-13        2026-08-13
# Missing                      0                 0

# The lecture note works with the shorter window. Note how different
# the two columns are -- every summary statistic you report depends on
# a choice of window that is easy to make without noticing.

# 2. Are the data types right?
# ----------------------------
# Values are stored as : float64
# Index is stored as   : DatetimeIndex

# 3. Is the index itself sound?
# -----------------------------
# Dates are unique   : True
# Duplicate dates    : 0
# Dates are in order : True

# 4. What is the publication calendar?
# ------------------------------------
# Calendar days spanned : 26,342
# Distinct dates present: 26,342
# Rows in the file      : 26,342
# Coverage              : 100.0%

# Essentially every calendar day has a value, so this is a 7-day
# daily series. Weekend and holiday dates will return data.

# 5. Descriptive statistics
# -------------------------
#        full history  since 2020-01-01
# count     26342.000          2417.000
# mean          4.596             2.836
# std           3.545             2.129
# min           0.040             0.040
# 25%           1.920             0.090
# 50%           4.280             3.640
# 75%           6.130             4.580
# max          22.360             5.330

# Same series, same units, two defensible samples, and almost nothing
# in common. A summary statistic is only as meaningful as the sample
# behind it -- so the sample belongs in the write-up, every time.

# 6. The most recent observations
# -------------------------------
#             rate  change
# date                    
# 2026-08-04  3.63     0.0
# 2026-08-05  3.63     0.0
# 2026-08-06  3.63     0.0
# 2026-08-07  3.63     0.0
# 2026-08-08  3.63     0.0
# 2026-08-09  3.63     0.0
# 2026-08-10  3.63     0.0
# 2026-08-11  3.63     0.0
# 2026-08-12  3.63     0.0
# 2026-08-13  3.63     0.0

#             monthly mean  days  change  complete
# date                                            
# 2025-09-01         4.225    30  -0.105      True
# 2025-10-01         4.088    31  -0.137      True
# 2025-11-01         3.876    30  -0.212      True
# 2025-12-01         3.721    31  -0.156      True
# 2026-01-01         3.640    31  -0.081      True
# 2026-02-01         3.640    28   0.000      True
# 2026-03-01         3.640    31   0.000      True
# 2026-04-01         3.640    30   0.000      True
# 2026-05-01         3.628    31  -0.012      True
# 2026-06-01         3.625    30  -0.002      True
# 2026-07-01         3.628    31   0.003      True
# 2026-08-01         3.630    13   0.002     False

# CAUTION: August 2026 is incomplete -- 13 days of 31. Its average covers a different span than the
# months beside it, so the change into it is not comparable. Drop it,
# or label it, but do not quietly plot it as though it were finished.

# A policy rate holds flat for long stretches, so the daily tail is
# mostly zeros in the change column. That is information: it tells you
# the series is not moving, which a column of identical levels does not.

# Provenance -- record this with your submission
# ----------------------------------------------
# Series      : DFF - Federal Funds Effective Rate
# Source      : Federal Reserve Economic Data (FRED),
#               Federal Reserve Bank of St. Louis
# URL         : https://fred.stlouisfed.org/series/DFF
# Units       : Percent, not seasonally adjusted
# Date range  : 1954-07-01 to 2026-08-13
# Rows        : 26,342
# Retrieved   : see data/README.md in the course repository
# PS D:\GitHub> & C:\Python312\python.exe d:/GitHub/kennethlarotyamat.github.io/mba775/lab-1-chapter-01/01a_inspect_dff.py

# 1. What did we get?
# -------------------
#                   full history  since 2020-01-01
# Observations            26,342             2,417
# First date          1954-07-01        2020-01-01
# Last date           2026-08-13        2026-08-13
# Missing                      0                 0

# The lecture note works with the shorter window. Note how different
# the two columns are -- every summary statistic you report depends on
# a choice of window that is easy to make without noticing.

# 2. Are the data types right?
# ----------------------------
# Values are stored as : float64
# Index is stored as   : DatetimeIndex

# 3. Is the index itself sound?
# -----------------------------
# Dates are unique   : True
# Duplicate dates    : 0
# Dates are in order : True

# 4. What is the publication calendar?
# ------------------------------------
# Calendar days spanned : 26,342
# Distinct dates present: 26,342
# Rows in the file      : 26,342
# Coverage              : 100.0%

# Essentially every calendar day has a value, so this is a 7-day
# daily series. Weekend and holiday dates will return data.

# 5. Descriptive statistics
# -------------------------
#        full history  since 2020-01-01
# count     26342.000          2417.000
# mean          4.596             2.836
# std           3.545             2.129
# min           0.040             0.040
# 25%           1.920             0.090
# 50%           4.280             3.640
# 75%           6.130             4.580
# max          22.360             5.330

# Same series, same units, two defensible samples, and almost nothing
# in common. A summary statistic is only as meaningful as the sample
# behind it -- so the sample belongs in the write-up, every time.

# 6. The most recent observations
# -------------------------------
#             rate  change
# date                    
# 2026-08-04  3.63     0.0
# 2026-08-05  3.63     0.0
# 2026-08-06  3.63     0.0
# 2026-08-07  3.63     0.0
# 2026-08-08  3.63     0.0
# 2026-08-09  3.63     0.0
# 2026-08-10  3.63     0.0
# 2026-08-11  3.63     0.0
# 2026-08-12  3.63     0.0
# 2026-08-13  3.63     0.0

#             monthly mean  days  change  complete
# date                                            
# 2025-09-01         4.225    30  -0.105      True
# 2025-10-01         4.088    31  -0.137      True
# 2025-11-01         3.876    30  -0.212      True
# 2025-12-01         3.721    31  -0.156      True
# 2026-01-01         3.640    31  -0.081      True
# 2026-02-01         3.640    28   0.000      True
# 2026-03-01         3.640    31   0.000      True
# 2026-04-01         3.640    30   0.000      True
# 2026-05-01         3.628    31  -0.012      True
# 2026-06-01         3.625    30  -0.002      True
# 2026-07-01         3.628    31   0.003      True
# 2026-08-01         3.630    13   0.002     False

# CAUTION: August 2026 is incomplete -- 13 days of 31. Its average covers a different span than the
# months beside it, so the change into it is not comparable. Drop it,
# or label it, but do not quietly plot it as though it were finished.

# A policy rate holds flat for long stretches, so the daily tail is
# mostly zeros in the change column. That is information: it tells you
# the series is not moving, which a column of identical levels does not.

# Provenance -- record this with your submission
# ----------------------------------------------
# Series      : DFF - Federal Funds Effective Rate
# Source      : Federal Reserve Economic Data (FRED),
#               Federal Reserve Bank of St. Louis
# URL         : https://fred.stlouisfed.org/series/DFF
# Units       : Percent, not seasonally adjusted
# Date range  : 1954-07-01 to 2026-08-13
# Rows        : 26,342
# Retrieved   : see data/README.md in the course repository
# PS D:\GitHub> 

# ---------------------------------------------------------------------------
banner("4. What is the publication calendar?")

# DFF is published on a 7-day daily calendar, so there should be a value on
# every single calendar day -- weekends and holidays included. Many other
# daily series (DGS10, SP500) are business-day only. Do not assume: check.
#
# Count DISTINCT dates, not rows, so a duplicate cannot disguise a gap.
expected_days = (rate.index.max() - rate.index.min()).days + 1
distinct_days = rate.index.nunique()
coverage = distinct_days / expected_days

print(f"Calendar days spanned : {expected_days:,}")
print(f"Distinct dates present: {distinct_days:,}")
print(f"Rows in the file      : {len(rate):,}")
print(f"Coverage              : {coverage:.1%}")

if coverage > 0.99:
    print("\nEssentially every calendar day has a value, so this is a 7-day")
    print("daily series. Weekend and holiday dates will return data.")
else:
    print("\nA meaningful share of calendar days have no observation, so this")
    print("is probably a business-day series. Selecting by an arbitrary date")
    print("will sometimes come back empty.")

# ---------------------------------------------------------------------------
banner("5. Descriptive statistics")

comparison = pd.DataFrame({
    "full history": full.describe(),
    f"since {LECTURE_START}": recent.describe(),
})
print(comparison.round(3).to_string())

print("\nSame series, same units, two defensible samples, and almost nothing")
print("in common. A summary statistic is only as meaningful as the sample")
print("behind it -- so the sample belongs in the write-up, every time.")

# ---------------------------------------------------------------------------
banner("6. The most recent observations")

# Printing the last ten daily values of a policy rate usually shows ten
# identical numbers -- true, and useless as a check. Show the change alongside
# the level, and step back to monthly, so there is actually something to see.
daily_tail = rate.tail(10).to_frame("rate")
daily_tail["change"] = rate.diff().tail(10)
print(daily_tail.to_string())

print()

# Resampling always produces a bucket for the current month, however few days
# have elapsed. Report how many days went into each average so a short month
# cannot masquerade as a full one.
coverage = month_coverage(rate)
monthly_mean = rate.resample("MS").mean()
monthly_tail = monthly_mean.round(3).to_frame("monthly mean")
monthly_tail["days"] = coverage["observed"]
# Difference the UNROUNDED means, then round for display. Differencing rounded
# values compounds rounding error into the quantity you are reporting.
monthly_tail["change"] = monthly_mean.diff().round(3)
monthly_tail["complete"] = coverage["complete"]
print(monthly_tail.tail(12).to_string())

partial = monthly_tail.loc[~monthly_tail["complete"]]
if len(partial):
    last = partial.index[-1]
    print(f"\nCAUTION: {last.strftime('%B %Y')} is incomplete -- "
          f"{int(monthly_tail.loc[last, 'days'])} days of "
          f"{last.days_in_month}. Its average covers a different span than the")
    print("months beside it, so the change into it is not comparable. Drop it,")
    print("or label it, but do not quietly plot it as though it were finished.")

print("\nA policy rate holds flat for long stretches, so the daily tail is")
print("mostly zeros in the change column. That is information: it tells you")
print("the series is not moving, which a column of identical levels does not.")

# ---------------------------------------------------------------------------
banner("Provenance -- record this with your submission")

print("Series      : DFF - Federal Funds Effective Rate")
print("Source      : Federal Reserve Economic Data (FRED),")
print("              Federal Reserve Bank of St. Louis")
print("URL         : https://fred.stlouisfed.org/series/DFF")
print("Units       : Percent, not seasonally adjusted")
print(f"Date range  : {full.index.min().date()} to {full.index.max().date()}")
print(f"Rows        : {len(full):,}")
print(f"Retrieved   : see data/README.md in the course repository")
