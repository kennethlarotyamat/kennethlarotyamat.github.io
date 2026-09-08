"""MBA 775 - Student-written script (not part of the original course pack)
Building the monthly Las Vegas Visitor Volume series, aligning it against
six FRED series, and checking which correlations survive dropping the
shared 2020 COVID shock.

Requires, in the same folder:
  - The eight LVCVA "Year to Date / Year End Summary" .xlsx files
    (2019.xlsx through 2026.xlsx, renamed from their original download names)
  - NVUR.csv, WJFUELUSGULF.csv, TSITTL.csv, JHGDPBRINDX.csv,
    IHLIDXUS.csv, KCROROE.csv (raw FRED downloads)
"""

import openpyxl
from datetime import datetime
import pandas as pd

# ---------------------------------------------------------------------------
# STEP 1: Build the monthly Las Vegas Visitor Volume series from the LVCVA
# workbooks. Row 7 is always the month-header row, row 8 is always
# "Visitor Volume", confirmed by inspecting each file's first several rows
# before assuming this layout held across all eight years.
# ---------------------------------------------------------------------------

years = [2019, 2020, 2021, 2022, 2023, 2024, 2025, 2026]
records = []
for yr in years:
    wb = openpyxl.load_workbook(f"{yr}.xlsx", data_only=True)
    ws = wb[f"Las Vegas {yr}"]
    header_row = list(ws.iter_rows(min_row=7, max_row=7, values_only=True))[0]
    vv_row = list(ws.iter_rows(min_row=8, max_row=8, values_only=True))[0]
    for i, val in enumerate(header_row):
        if isinstance(val, datetime):
            v = vv_row[i]
            if v != "" and v is not None:
                records.append({"date": val, "visitor_volume": v})

lvv = pd.DataFrame(records).sort_values("date").reset_index(drop=True)
lvv = lvv.set_index("date")["visitor_volume"]
print(f"Las Vegas Visitor Volume: {len(lvv)} months, "
      f"{lvv.index.min().date()} to {lvv.index.max().date()}")

# ---------------------------------------------------------------------------
# STEP 2: Load each FRED series and resample to monthly. Series arrive at
# different native frequencies (daily, weekly, monthly, quarterly) --
# resample("MS").mean() collapses each to a monthly average so all six can
# be compared against the monthly visitor series on the same calendar grid.
# ---------------------------------------------------------------------------

fred_files = {
    "NVUR": "NVUR.csv",                     # Nevada unemployment rate, monthly
    "WJFUELUSGULF": "WJFUELUSGULF.csv",      # Jet fuel price, US Gulf Coast, weekly
    "TSITTL": "TSITTL.csv",                  # Combined Transportation Services Index, monthly
    "JHGDPBRINDX": "JHGDPBRINDX.csv",        # GDP-based recession indicator, quarterly
    "IHLIDXUS": "IHLIDXUS.csv",              # Indeed job postings index, daily
    "KCROROE": "KCROROE.csv",                # Risk-On/Risk-Off equities index, daily
}

monthly_series = {"visitor_volume": lvv}
for code, path in fred_files.items():
    df = pd.read_csv(path, parse_dates=["observation_date"])
    df = df.set_index("observation_date")[code]
    monthly_series[code] = df.resample("MS").mean()

combined = pd.DataFrame(monthly_series)
combined = combined.loc["2019-01-01":"2026-07-01"]

print("\nNon-null monthly observations per series (overlap with visitor volume):")
print(combined.notna().sum().to_string())

# ---------------------------------------------------------------------------
# STEP 3: Correlate each series against visitor volume, in LEVELS. This is
# the naive version -- it is checked for spuriousness in Step 4.
# ---------------------------------------------------------------------------

print("\n=== LEVEL correlations vs Las Vegas Visitor Volume, full sample ===")
for col in combined.columns:
    if col == "visitor_volume":
        continue
    pair = combined[["visitor_volume", col]].dropna()
    r = pair["visitor_volume"].corr(pair[col])
    print(f"{col:<14} n={len(pair):<4} r={r:+.3f}")

# ---------------------------------------------------------------------------
# STEP 4: The critical check. 2019-2020 contains a shared macro shock
# (COVID-19): visitor volume, unemployment, transportation activity, job
# postings, and the recession indicator ALL moved together during that
# period, for the same external reason. A correlation computed across that
# period can look strong even when the two series have no real ongoing
# relationship -- they just both happened to crash and recover at the same
# calendar time. Excluding 2020 and recomputing tells you whether the
# relationship is real or an artifact of one shared event.
# ---------------------------------------------------------------------------

post2020 = combined.loc[combined.index.year != 2020]

print("\n=== LEVEL correlations, EXCLUDING 2020 ===")
for col in combined.columns:
    if col == "visitor_volume":
        continue
    pair = post2020[["visitor_volume", col]].dropna()
    r = pair["visitor_volume"].corr(pair[col])
    print(f"{col:<14} n={len(pair):<4} r={r:+.3f}")

# ---------------------------------------------------------------------------
# STEP 5: Also check MONTH-OVER-MONTH CHANGE correlations (first differences
# of both series). This strips out any shared slow-moving trend and tests
# whether the two series move together month to month, which is a further
# check against spurious level correlation (two series can both trend
# upward for unrelated reasons and show high level correlation with no
# real short-run relationship).
# ---------------------------------------------------------------------------

print("\n=== MONTH-OVER-MONTH CHANGE correlations, EXCLUDING 2020 ===")
diffs = post2020.diff()
for col in combined.columns:
    if col == "visitor_volume":
        continue
    pair = diffs[["visitor_volume", col]].dropna()
    if len(pair) > 1:
        r = pair["visitor_volume"].corr(pair[col])
        print(f"{col:<14} n={len(pair):<4} r={r:+.3f}")
    else:
        print(f"{col:<14} n={len(pair):<4} (insufficient overlapping data)")

print("\nInterpretation: a correlation that survives BOTH the 2020-exclusion")
print("test and holds up in first differences is much more likely to reflect")
print("a real relationship than one that only appears in full-sample levels.")