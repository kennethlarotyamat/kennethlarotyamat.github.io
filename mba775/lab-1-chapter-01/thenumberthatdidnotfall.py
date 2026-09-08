peak = world.loc[world["n_poor"].idxmax()]
print(f"Number of people in extreme poverty")
print(f"  1820   {first.n_poor/1e6:>7,.0f} million")
print(f"  {int(peak.year)}   {peak.n_poor/1e6:>7,.0f} million   <- the peak")
print(f"  2015   {last.n_poor/1e6:>7,.0f} million")
print()
print(f"The SHARE fell from {first.share_poor:.1f}% to {last.share_poor:.1f}%.")
print(f"The COUNT fell by only "
      f"{100*(1 - last.n_poor/first.n_poor):.0f}%.")
print(f"World population grew "
      f"{(last.n_poor+last.n_notpoor)/(first.n_poor+first.n_notpoor):.1f} times.")

    #   citations: John Crooker, PhD UNLV Course: Lecture notes Module 2 Sept 7th 2026
    #  [Aside] I'm going to run this in the terminal and see what happens. I'm so behind, I think that this is last weeks module.

    # [result] threw an error:

#     PS D:\GitHub> & C:\Python312\python.exe d:/GitHub/kennethlarotyamat.github.io/mba775/lab-1-chapter-01/thenumberthatdidnotfall.py
# Traceback (most recent call last):
#   File "d:\GitHub\kennethlarotyamat.github.io\mba775\lab-1-chapter-01\thenumberthatdidnotfall.py", line 1, in <module>
#     peak = world.loc[world["n_poor"].idxmax()]
#            ^^^^^
# NameError: name 'world' is not defined
# PS D:\GitHub> 