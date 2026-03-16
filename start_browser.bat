@echo off
title Wakfu Companion v4.0 — Navigateur
cd /d "H:\Code\Wakfuassistant"
set WAKFU_OVERLAY_MODE=0
python -c "import main; main.OVERLAY_MODE = False; main.main()"
pause