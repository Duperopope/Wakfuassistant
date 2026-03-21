@echo off
title Wakfu HDV Price Agent (Compat)
echo ==========================================
echo   WAKFU HDV PRICE AGENT (COMPAT)
echo   Interception cmy.dn + Protobuf (V3)
echo ==========================================
echo.

set AGENT_JAR=H:\Code\Wakfuassistant\docs\RND\poc-hdv\agent\build\libs\market-price-agent-v3.jar
if not exist "%AGENT_JAR%" (
    echo ERREUR: Agent JAR introuvable !
    echo Chemin: %AGENT_JAR%
    pause
    exit /b 1
)

echo Agent: %AGENT_JAR%
echo.
echo INSTRUCTIONS:
echo   1. Fermez Wakfu ET le launcher Ankama
echo   2. Appuyez sur une touche pour lancer
echo   3. Cliquez JOUER dans le launcher
echo   4. Allez en jeu, ouvrez le HDV, recherchez
echo   5. Les traces seront dans H:\Code\Wakfuassistant\logs\
echo.
pause

set JAVA_TOOL_OPTIONS=-javaagent:"%AGENT_JAR%" --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED

echo.
echo Lancement du launcher Ankama...
start "" "G:\ankama\Ankama Launcher.exe"

echo.
echo En attente... Lancez Wakfu, connectez-vous, ouvrez le HDV.
echo Quand vous avez fait des recherches, appuyez sur une touche.
echo.
pause

echo.
echo === RESULTATS ===
echo.
if exist "H:\Code\Wakfuassistant\logs\market_v3.log" (
    echo --- Dernieres lignes du log ---
    powershell -Command "Get-Content 'H:\Code\Wakfuassistant\logs\market_v3.log' -Tail 30"
) else (
    echo Pas de log trouve. L'agent ne s'est peut-etre pas charge.
)
echo.
if exist "H:\Code\Wakfuassistant\logs\market_v3_proto.log" (
    echo --- Nombre de trames proto HDV ---
    powershell -Command "(Get-Content 'H:\Code\Wakfuassistant\logs\market_v3_proto.log').Count"
    echo.
    echo --- Decodage des prix HDV ---
    powershell -NoProfile -ExecutionPolicy Bypass -File "H:\Code\Wakfuassistant\docs\RND\poc-hdv\decode_market_v3_prices.ps1" -Top 15
    echo.
    echo --- Sync base SQLite HDV ---
    powershell -NoProfile -ExecutionPolicy Bypass -File "H:\Code\Wakfuassistant\docs\RND\poc-hdv\sync_hdv_to_sqlite.ps1"
) else (
    echo Pas de proto log trouve.
)
echo.
pause
