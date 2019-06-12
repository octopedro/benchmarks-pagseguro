@echo off
set "$New_line=Your text"

for %%a in (*.) do (
   echo %$New_line% > "New_%%a"
   type "%%a" >> "New_%%a"
   del "%%a" 2>nul
   ren "New_%%a" "%%a"
)
