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
#   [Aside] I'm going to run this in the terminal and see what happens. I'm so behind, I think that this is last weeks module.

#   [result] threw an error:

#   PS D:\GitHub> & C:\Python312\python.exe d:/GitHub/kennethlarotyamat.github.io/mba775/lab-1-chapter-01/thenumberthatdidnotfall.py
#   Traceback (most recent call last):
#   File "d:\GitHub\kennethlarotyamat.github.io\mba775\lab-1-chapter-01\thenumberthatdidnotfall.py", line 1, in <module>
#   peak = world.loc[world["n_poor"].idxmax()]
#   ^^^^^
#   NameError: name 'world' is not defined
#   PS D:\GitHub> 

#   [aside] I'll deal with that later.
#   [other thoughts] I think that I spend too much time clearning things. This is kind of a nightmare.
#   I think that I'll focus on completing laboratory 1 work, and then that's it.

#   [claude prompt] before we get started, i have a question about one of the files, it says mesquite nevada rather than las vegas nevada,



#   this is the URL, and i've also included a copy of the file that is downloaded. I'm wondering if this is the wronge file because i need one for las vegas, and I'm not really sure mesquite is the same thing, 



#   Here is the url: 



#   https://assets.simpleviewcms.com/simpleview/raw/upload/v1/clients/lasvegas/Year_to_Date_Summary_for_2025_revised_cd675d1a-2e15-4a20-aeeb-e6a6d871b10a.xlsx



#   here is the file:





#   is there anyway i would find the correct file, or anyway to extrapolate what the correct url is?

#   [claude response summary] the file is fine, it's just the mesquite tab, and there are several other tabs, including las vegas
#   [claude prompt] I'm going to upload the relevant files for this forecasting assignment: There may be duplicates as i had 
#   trouble with the tabs and all that. I think it's all years from 2019 . I'm going to upload the relevant files for this forecasting 
#   assignment: There may be duplicates as i had trouble with the tabs and all that. I think it's all years from 2019
#   [claude prompt] here is the one for 2024