@echo off
echo ========================================
echo   WAKFU MARKET AGENT V3
echo   Hook: cmy.dn(byte[]) - Protobuf direct
echo ========================================
echo.

set WAKFU_DIR=C:\Program Files (x86)\Ankama\Wakfu
set AGENT_JAR=H:\Code\Wakfuassistant\docs\RND\poc-hdv\agent\build\libs\market-price-agent-v3.jar
set LOG_DIR=H:\Code\Wakfuassistant\logs

:: Creer le dossier logs si necessaire
if not exist "%LOG_DIR%" mkdir "%LOG_DIR%"

:: Verifier que le JAR existe
if not exist "%AGENT_JAR%" (
    echo ERREUR: JAR introuvable: %AGENT_JAR%
    echo Lance d'abord: .\gradlew.bat jar
    pause
    exit /b 1
)

echo Agent JAR: %AGENT_JAR%
echo Logs:      %LOG_DIR%\market_v3.log
echo Proto:     %LOG_DIR%\market_v3_proto.log
echo.

:: Trouver le java.exe de Wakfu
set WAKFU_JAVA=%WAKFU_DIR%\jre\bin\java.exe
if not exist "%WAKFU_JAVA%" (
    echo Java Wakfu introuvable, utilise le java systeme
    set WAKFU_JAVA=java
)

echo Java: %WAKFU_JAVA%
echo.
echo === INSTRUCTIONS ===
echo 1. Lance Wakfu normalement via Ankama Launcher
echo 2. Ce script va attacher l'agent au process Wakfu
echo.
echo Appuie sur une touche quand Wakfu est lance...
pause > nul

:: Chercher le PID Wakfu
echo Recherche du process Wakfu...
for /f "tokens=2" %%i in ('tasklist /fi "imagename eq java.exe" /fo list ^| findstr "PID"') do (
    echo Process Java trouve: PID=%%i
    set WAKFU_PID=%%i
)

if not defined WAKFU_PID (
    echo Aucun process Java/Wakfu trouve.
    echo Essai en mode -javaagent direct...
    echo.
    echo Ajoute cette ligne dans les options JVM de Wakfu:
    echo   -javaagent:%AGENT_JAR%
    echo.
    echo Ou lance Wakfu manuellement avec:
    echo   "%WAKFU_JAVA%" -javaagent:"%AGENT_JAR%" -jar "%WAKFU_DIR%\wakfu.jar"
    pause
    exit /b 1
)

echo.
echo Pour utiliser l'agent, relance Wakfu avec:
echo   -javaagent:"%AGENT_JAR%"
echo.
echo Ou modifie le fichier de lancement Wakfu.
echo.
pause
