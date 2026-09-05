from fred_tools import fred_series

dff = fred_series("DFF", start="2020-01-01").to_frame("federal_funds_rate")

missing_count = int(dff["federal_funds_rate"].isna().sum())

print(f"Downloaded {len(dff):,} DFF observations.")
print(f"Date range: {dff.index.min().date()} to {dff.index.max().date()}")
print(f"Missing rate values: {missing_count:,}")

dff.to_csv("dff_downloaded.csv")
print("Saved data to dff_downloaded.csv")

# PS D:\GitHub> & C:\Python312\python.exe d:/GitHub/kennethlarotyamat.github.io/mba775/lab-1-chapter-01/wherethedatacamefrom.py
# Traceback (most recent call last):
#   File "d:\GitHub\kennethlarotyamat.github.io\mba775\lab-1-chapter-01\wherethedatacamefrom.py", line 1, in <module>
#     from fred_tools import fred_series
# ModuleNotFoundError: No module named 'fred_tools'
# PS D:\GitHub> 