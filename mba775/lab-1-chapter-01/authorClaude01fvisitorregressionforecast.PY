"""MBA 775 - Student-written script (not part of the original course pack)
Forecasting August 2026 Las Vegas Visitor Volume using a multiple linear
regression on NVUR (Nevada unemployment rate) and TSITTL (Combined
Transportation Services Index).

Note on tooling: statsmodels is not available in this sandbox (no network
access to install it). This script implements Ordinary Least Squares (OLS)
manually via the normal equations (numpy) and computes standard errors,
t-statistics, and p-values from scratch (scipy.stats), rather than silently
switching to a different, undisclosed method. The math is identical to what
statsmodels would produce; only the library is different.

Requires, in the same folder:
  - lvv_monthly.csv (Las Vegas Visitor Volume, built in an earlier script)
  - NVUR.csv, TSITTL.csv (raw FRED downloads)
"""

import numpy as np
import pandas as pd
from scipy import stats

# ---------------------------------------------------------------------------
# STEP 1: Assemble the same monthly panel used for the correlation analysis.
# ---------------------------------------------------------------------------

lvv = pd.read_csv("lvv_monthly.csv", parse_dates=["date"]).set_index("date")["visitor_volume"]

nvur = pd.read_csv("NVUR.csv", parse_dates=["observation_date"])
nvur = nvur.set_index("observation_date")["NVUR"].resample("MS").mean()

tsittl = pd.read_csv("TSITTL.csv", parse_dates=["observation_date"])
tsittl = tsittl.set_index("observation_date")["TSITTL"].resample("MS").mean()

panel = pd.DataFrame({"visitor_volume": lvv, "NVUR": nvur, "TSITTL": tsittl})
panel = panel.loc["2019-01-01":"2026-07-01"]

print(f"Full panel: {len(panel)} months, {panel.index.min().date()} to {panel.index.max().date()}")
print(f"Missing values per column:\n{panel.isna().sum().to_string()}")

# ---------------------------------------------------------------------------
# STEP 2: Fit OLS manually. Model: visitor_volume = b0 + b1*NVUR + b2*TSITTL
# Drop any month missing either predictor or the target -- OLS needs a
# complete row to use it.
# ---------------------------------------------------------------------------

def fit_ols(df, y_col, x_cols):
    data = df[[y_col] + x_cols].dropna()
    n = len(data)
    k = len(x_cols) + 1  # +1 for intercept
    X = np.column_stack([np.ones(n)] + [data[c].values for c in x_cols])
    y = data[y_col].values

    # Normal equations: beta = (X'X)^-1 X'y
    XtX_inv = np.linalg.inv(X.T @ X)
    beta = XtX_inv @ X.T @ y

    y_hat = X @ beta
    resid = y - y_hat
    ss_res = np.sum(resid ** 2)
    ss_tot = np.sum((y - y.mean()) ** 2)
    r_squared = 1 - ss_res / ss_tot
    adj_r_squared = 1 - (1 - r_squared) * (n - 1) / (n - k)

    dof = n - k
    sigma_sq = ss_res / dof
    se_beta = np.sqrt(np.diag(sigma_sq * XtX_inv))
    t_stats = beta / se_beta
    p_values = [2 * (1 - stats.t.cdf(abs(t), dof)) for t in t_stats]

    return {
        "n": n, "k": k, "beta": beta, "se": se_beta, "t": t_stats,
        "p": p_values, "r_squared": r_squared, "adj_r_squared": adj_r_squared,
        "resid": resid, "dates": data.index, "y": y, "y_hat": y_hat,
    }

# ---------------------------------------------------------------------------
# STEP 3: Fit two versions -- full sample, and excluding 2020 -- the same
# sensitivity check used for the correlation analysis, since 2020 is a
# shared shock that could distort the estimated coefficients.
# ---------------------------------------------------------------------------

def print_results(label, res, x_names):
    print(f"\n=== {label} ===")
    print(f"n = {res['n']}, R-squared = {res['r_squared']:.4f}, "
          f"Adjusted R-squared = {res['adj_r_squared']:.4f}")
    names = ["Intercept"] + x_names
    print(f"{'Variable':<12}{'Coef':>14}{'Std Err':>12}{'t-stat':>10}{'p-value':>10}")
    for name, b, se, t, p in zip(names, res["beta"], res["se"], res["t"], res["p"]):
        print(f"{name:<12}{b:>14,.2f}{se:>12,.2f}{t:>10.2f}{p:>10.4f}")

full_res = fit_ols(panel, "visitor_volume", ["NVUR", "TSITTL"])
print_results("Full sample (2019-01 to 2026-07, includes 2020)", full_res, ["NVUR", "TSITTL"])

no2020 = panel.loc[panel.index.year != 2020]
ex2020_res = fit_ols(no2020, "visitor_volume", ["NVUR", "TSITTL"])
print_results("Excluding 2020", ex2020_res, ["NVUR", "TSITTL"])

# ---------------------------------------------------------------------------
# STEP 4: Forecast August 2026. NVUR and TSITTL for August 2026 do not exist
# yet either (last actuals: NVUR = Jul 2026, TSITTL = Jun 2026), so this
# script builds the predictor inputs two ways rather than picking one
# silently.
# ---------------------------------------------------------------------------

nvur_jul2026 = panel.loc["2026-07-01", "NVUR"]
tsittl_jun2026 = panel.loc["2026-06-01", "TSITTL"]

print(f"\nMost recent actual NVUR   (Jul 2026): {nvur_jul2026}")
print(f"Most recent actual TSITTL (Jun 2026): {tsittl_jun2026}")

# Method A: naive carry-forward -- assume August looks like the most
# recent actual reading of each predictor. Reasonable here because both
# series move slowly month to month (unemployment rates and transportation
# indices don't swing sharply in a single month under normal conditions).
nvur_carryforward = nvur_jul2026
tsittl_carryforward = tsittl_jun2026

# Method B: seasonal-naive -- apply each predictor's own historical
# July->August (NVUR) or June->August (TSITTL, since July is missing)
# average change, the same method used for the CPI and visitor-volume
# forecasts earlier.
def hist_month_change(series, from_month, to_month, exclude_years=(2020,)):
    diffs = []
    years = range(series.index.year.min(), series.index.year.max() + 1)
    for y in years:
        if y in exclude_years:
            continue
        try:
            a = series.loc[f"{y}-{from_month:02d}-01"]
            b = series.loc[f"{y}-{to_month:02d}-01"]
        except KeyError:
            continue
        if pd.isna(a) or pd.isna(b):
            continue
        diffs.append(b - a)
    return np.mean(diffs) if diffs else np.nan

nvur_change = hist_month_change(nvur, 7, 8)
tsittl_change = hist_month_change(tsittl, 6, 8)  # June->August, 2 months

nvur_seasonal = nvur_jul2026 + nvur_change
tsittl_seasonal = tsittl_jun2026 + tsittl_change

print(f"\nMethod A (carry-forward): NVUR={nvur_carryforward:.2f}, TSITTL={tsittl_carryforward:.2f}")
print(f"Method B (seasonal-adjusted): NVUR={nvur_seasonal:.2f} "
      f"(avg Jul->Aug change: {nvur_change:+.3f}), "
      f"TSITTL={tsittl_seasonal:.2f} (avg Jun->Aug change: {tsittl_change:+.3f})")

# ---------------------------------------------------------------------------
# STEP 5: Plug both predictor scenarios into both regression models
# (full-sample and excluding-2020) -- four forecasts total, shown side by
# side rather than collapsed into one number.
# ---------------------------------------------------------------------------

def predict(res, nvur_val, tsittl_val):
    b0, b1, b2 = res["beta"]
    return b0 + b1 * nvur_val + b2 * tsittl_val

print("\n=== August 2026 Visitor Volume forecasts ===")
print(f"{'Regression':<28}{'Predictor scenario':<24}{'Forecast':>12}")
for label, res in [("Full sample", full_res), ("Excluding 2020", ex2020_res)]:
    for scen_label, nv, ts in [
        ("Carry-forward", nvur_carryforward, tsittl_carryforward),
        ("Seasonal-adjusted", nvur_seasonal, tsittl_seasonal),
    ]:
        forecast = predict(res, nv, ts)
        print(f"{label:<28}{scen_label:<24}{forecast:>12,.0f}")

print("\nFor comparison, the pure historical-extrapolation forecasts from")
print("visitor volume alone (no regressors), computed earlier:")
print("  All 7 years, level-change     : 3,050,029")
print("  Excluding 2020, level-change  : 3,013,200")
print("  Last 3 years only, level-change: 3,092,100")