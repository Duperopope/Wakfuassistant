@echo off
echo ============================================
echo   WAKFU + HDV MARKET PRICE AGENT
echo ============================================
echo.

set AGENT_JAR=H:\Code\Wakfuassistant\docs\RND\poc-hdv\agent\build\libs\market-price-agent-v3.jar

if not exist "%AGENT_JAR%" (
    echo ERREUR: Agent JAR non trouve: %AGENT_JAR%
    pause
    exit /b 1
)

echo Agent: %AGENT_JAR%
echo.

echo [1] Definition de JAVA_TOOL_OPTIONS...
set JAVA_TOOL_OPTIONS=-javaagent:%AGENT_JAR% --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED

echo   JAVA_TOOL_OPTIONS=%JAVA_TOOL_OPTIONS%
echo.
echo [2] Lancement du launcher Ankama...

start "" "G:\ankama\Ankama Launcher.exe"

echo.
echo [3] Clique JOUER dans le launcher.
echo   Va en jeu, ouvre le HDV, fais une recherche.
echo   Appuie sur une touche quand c'est fait.
echo.
pause

echo.
echo [4] Verification des logs...
echo.

if exist "H:\Code\Wakfuassistant\logs\market_v3.log" (
    echo === LOGS MARKET V3 ===
    powershell -Command "Get-Content 'H:\Code\Wakfuassistant\logs\market_v3.log' -Tail 30"
    echo.
    echo === PROTO ===
    powershell -Command "Get-Content 'H:\Code\Wakfuassistant\logs\market_v3_proto.log' -Tail 20"
    echo.
    echo === DECODE PRIX ===
    powershell -NoProfile -ExecutionPolicy Bypass -File "H:\Code\Wakfuassistant\docs\RND\poc-hdv\decode_market_v3_prices.ps1" -Top 15
) else (
    echo   Pas encore de logs... L'agent ne s'est peut-etre pas charge.
    echo   Verifie dans le launcher Ankama si Wakfu a demarre.
)

echo.
echo Appuie sur une touche pour fermer.
pause
