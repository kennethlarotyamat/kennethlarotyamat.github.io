print(dff.dtypes)
print(f"\nIndex type: {type(dff.index).__name__}")
print(f"Any non-numeric values coerced to NaN: {missing_count}")