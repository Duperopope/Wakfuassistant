@echo off
title Wakfu Assistant
set AGENT_JAR=H:\Code\Wakfuassistant\agent\wakfu-spy-agent.jar

if not exist "%AGENT_JAR%" (
    echo ERREUR: Agent JAR non trouve: %AGENT_JAR%
    pause
    exit /b 1
)

set JAVA_TOOL_OPTIONS=-javaagent:%AGENT_JAR% --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED

echo [OK] Agent configure
echo [..] Lancement du launcher Ankama...
start "" "G:\ankama\Ankama Launcher.exe"
echo [OK] Launcher lance - clique JOUER
echo [..] Attente de Wakfu...

:wait_wakfu
timeout /t 3 >nul
tasklist /fi "imagename eq java.exe" 2>nul | findstr /i "java.exe" >nul
if errorlevel 1 goto wait_wakfu

echo [OK] Wakfu detecte - attente agent (10s)...
timeout /t 10 >nul
echo [OK] Lancement du dashboard...

python "H:\Code\Wakfuassistant\agent\dashboard.py"
pause
