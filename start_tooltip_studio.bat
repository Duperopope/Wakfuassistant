@echo off
setlocal
cd /d "H:\Code\Wakfuassistant"

if exist ".venv\Scripts\python.exe" (
  set PY=.venv\Scripts\python.exe
) else (
  set PY=python
)

%PY% tools\wakfu_tooltip_studio.py --wakfu-root "H:/Games/Wakfu" --port 8765
