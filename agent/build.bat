@echo off
echo ============================================
echo   BUILD WAKFU SPY AGENT
echo ============================================
echo.

cd /d "%~dp0"

echo [1/3] Compilation...
call mvnw.cmd clean package -q
if errorlevel 1 (
    echo.
    echo ERREUR de compilation! Verifiez les messages ci-dessus.
    pause
    exit /b 1
)

echo [2/3] Copie du JAR...
if exist "target\wakfu-spy-agent-1.0.0.jar" (
    copy /Y "target\wakfu-spy-agent-1.0.0.jar" "wakfu-spy-agent.jar" >nul
    echo   JAR: %~dp0wakfu-spy-agent.jar
) else (
    echo   ERREUR: JAR non trouve dans target\
    pause
    exit /b 1
)

echo [3/3] Verification...
"%JAVA_HOME%\bin\jar.exe" tf wakfu-spy-agent.jar | findstr "WakfuSpyAgent.class" >nul
if errorlevel 1 (
    echo   ERREUR: WakfuSpyAgent.class absent du JAR!
    pause
    exit /b 1
)

echo.
echo ============================================
echo   BUILD REUSSI!
echo   JAR: %~dp0wakfu-spy-agent.jar
echo ============================================
echo.
echo Pour lancer Wakfu avec l'agent:
echo   H:\Code\Wakfuassistant\agent\launch_wakfu_with_agent.bat
echo.
pause
