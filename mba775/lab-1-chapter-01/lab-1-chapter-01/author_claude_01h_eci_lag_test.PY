"""MBA 775 - Student-written script (not part of the original course pack)
Checking for a LAGGED relationship between the Employment Cost Index (ECI)
and Initial Unemployment Claims (ICSA), rather than assuming any
relationship has to show up in the same quarter.

Concept: a cross-correlation function. For each lag k (in quarters), this
shifts the ECI series backward or forward relative to ICSA and recomputes
the correlation. This answers "does a change in ECI show up in ICSA k
quarters later (or earlier)?" rather than only checking whether they move
together at the same moment.

Sign convention used below:
  lag = +k  ->  ECI is shifted k quarters INTO THE PAST relative to ICSA.
                A high correlation here means "ECI from k quarters ago
                predicts today's ICSA" -- i.e. ECI LEADS, ICSA follows.
  lag = -k  ->  the reverse: ICSA from k quarters ago lines up with
                today's ECI -- i.e. ICSA LEADS, ECI follows.
  lag = 0   ->  the same-quarter relationship already checked before.
"""

import pandas as pd
import numpy as np

icsa = pd.read_csv("ICSA.csv", parse_dates=["observation_date"]).set_index("observation_date")["ICSA"]
icsa_q = icsa.resample("QS").mean()
# Drop the 2020 COVID spike quarter (Q2 2020) for the same reason as before:
# a single extreme quarter can dominate any correlation, lagged or not.
icsa_q_clean = icsa_q.drop(icsa_q.loc["2020-04-01":"2020-04-01"].index, errors="ignore")

eci_files = {"ECIWAG": "ECIWAG.csv", "ECIALLCIV": "ECIALLCIV.csv"}

max_lag = 8  # quarters, i.e. up to 2 years in either direction

for code, path in eci_files.items():
    eci = pd.read_csv(path, parse_dates=["observation_date"]).set_index("observation_date")[code]
    eci = eci.resample("QS").mean()

    print(f"\n=== {code}: cross-correlation with ICSA, by lag (quarters) ===")
    print(f"{'Lag':>5}{'Meaning':<28}{'r (levels)':>12}{'r (Q/Q change)':>16}{'n':>6}")

    df = pd.DataFrame({"ICSA": icsa_q_clean, code: eci})

    results = []
    for lag in range(-max_lag, max_lag + 1):
        shifted = df.copy()
        shifted[code] = shifted[code].shift(lag)
        pair = shifted.dropna()
        if len(pair) < 5:
            continue
        r_level = pair["ICSA"].corr(pair[code])

        diffs = pair.diff().dropna()
        r_change = diffs["ICSA"].corr(diffs[code]) if len(diffs) > 4 else np.nan

        if lag > 0:
            meaning = f"{code} leads by {lag}q"
        elif lag < 0:
            meaning = f"ICSA leads by {-lag}q"
        else:
            meaning = "same quarter"

        results.append((lag, meaning, r_level, r_change, len(pair)))
        print(f"{lag:>5}{meaning:<28}{r_level:>12.3f}{r_change:>16.3f}{len(pair):>6}")

    best_level = max(results, key=lambda x: abs(x[2]))
    best_change = max([r for r in results if not np.isnan(r[3])], key=lambda x: abs(x[3]))
    print(f"\nStrongest LEVEL correlation: lag={best_level[0]} ({best_level[1]}), r={best_level[2]:+.3f}")
    print(f"Strongest CHANGE correlation: lag={best_change[0]} ({best_change[1]}), r={best_change[3]:+.3f}")