@echo off
echo ============================================
echo   LANCEMENT WAKFU AVEC SPY AGENT V3
echo ============================================
echo.

set AGENT_JAR=H:\Code\Wakfuassistant\agent\wakfu-spy-agent.jar

if not exist "%AGENT_JAR%" (
    echo ERREUR: Agent JAR non trouve!
    pause
    exit /b 1
)

echo [1] Definition de JAVA_TOOL_OPTIONS...
set JAVA_TOOL_OPTIONS=-javaagent:%AGENT_JAR% --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED

echo   JAVA_TOOL_OPTIONS=%JAVA_TOOL_OPTIONS%
echo.
echo [2] Lancement du launcher Ankama...

start "" "G:\ankama\Ankama Launcher.exe"

echo.
echo [3] Clique JOUER dans le launcher.
echo   Appuyez sur une touche apres que le jeu demarre.
echo.
pause

echo.
echo [4] Surveillance des logs (Ctrl+C pour arreter)...
echo.

if exist "H:\Code\Wakfuassistant\agent\logs\wakfu_messages.log" (
    powershell -Command "Get-Content 'H:\Code\Wakfuassistant\agent\logs\wakfu_messages.log' -Wait -Tail 50"
) else (
    echo   En attente de wakfu_messages.log...
    :wait_loop
    timeout /t 2 >nul
    if exist "H:\Code\Wakfuassistant\agent\logs\wakfu_messages.log" (
        powershell -Command "Get-Content 'H:\Code\Wakfuassistant\agent\logs\wakfu_messages.log' -Wait -Tail 50"
    ) else (
        goto wait_loop
    )
)
