$ErrorActionPreference = "Stop"
$timestamp = Get-Date -Format "yyyyMMdd_HHmmss"
$agentDir = "H:\Code\Wakfuassistant\agent"
$srcDir = "$agentDir\src\main\java\com\wakfuassistant\agent"
$logDir = "$agentDir\logs"
if (-not (Test-Path $logDir)) { New-Item -ItemType Directory -Path $logDir -Force | Out-Null }
$report = [System.Text.StringBuilder]::new()

function Log($level, $msg) {
    $line = "[$level] $msg"
    Write-Host $line -ForegroundColor $(switch($level){ "OK"{"Green"} "INFO"{"Cyan"} "WARN"{"Yellow"} "ERREUR"{"Red"} default{"White"} })
    [void]$report.AppendLine($line)
}

Log "INFO" "=== FIX V2 - RESTORE AND PATCH - $timestamp ==="

$spyFile = "$srcDir\WakfuSpyAgent.java"

$backups = Get-ChildItem "$srcDir\WakfuSpyAgent.java.bak_*" | Sort-Object LastWriteTime
if ($backups.Count -eq 0) {
    Log "ERREUR" "Aucun backup trouve dans $srcDir"
    $report.ToString() | Set-Clipboard
    return
}

$originalBackup = $backups[0].FullName
Log "INFO" "Backup le plus ancien : $($backups[0].Name) ($([math]::Round($backups[0].Length/1KB,1)) KB)"

Copy-Item $originalBackup $spyFile -Force
$content = Get-Content $spyFile -Raw -Encoding UTF8
$lineCount = ($content -split "`n").Count
Log "OK" "Restaure depuis $($backups[0].Name) : $lineCount lignes"

if ($content -notmatch 'package\s+com\.wakfuassistant\.agent') {
    Log "ERREUR" "Backup invalide - pas de package"
    $report.ToString() | Set-Clipboard
    return
}
if ($content -notmatch 'class\s+WakfuSpyAgent') {
    Log "ERREUR" "Backup invalide - pas de classe WakfuSpyAgent"
    $report.ToString() | Set-Clipboard
    return
}
Log "OK" "Fichier restaure valide"

$content = [regex]::Replace($content, '(?s)// === HOOK ITEM DECODER.*?// === FIN HOOK ITEM DECODER ===', '')
$content = [regex]::Replace($content, '(?s)// --- Hook item decoder.*?log\("Hook item decoder install[eE][^"]*"\);', '')
$content = [regex]::Replace($content, '// \[REMOVED\] ancien hook fga_0', '')
$content = [regex]::Replace($content, '(\r?\n){3,}', "`n`n")
Log "OK" "Nettoyage anciens hooks"

$importsNeeded = @()
if ($content -notmatch 'import\s+net\.bytebuddy\.asm\.Advice\s*;') { $importsNeeded += 'import net.bytebuddy.asm.Advice;' }
if ($content -notmatch 'import\s+net\.bytebuddy\.matcher\.ElementMatchers\s*;') { $importsNeeded += 'import net.bytebuddy.matcher.ElementMatchers;' }
if ($importsNeeded.Count -gt 0) {
    $lastImport = [regex]::Matches($content, '(?m)^import [^;]+;\s*$') | Select-Object -Last 1
    if ($lastImport) {
        $pos = $lastImport.Index + $lastImport.Length
        $content = $content.Insert($pos, "`n" + ($importsNeeded -join "`n"))
        Log "OK" "Imports ajoutes : $($importsNeeded.Count)"
    }
}

$builderMatch = [regex]::Match($content, 'builder\.installOn\(inst\);')
if (-not $builderMatch.Success) {
    Log "ERREUR" "Pattern builder.installOn(inst) non trouve"
    $report.ToString() | Set-Clipboard
    return
}
Log "OK" "Point d'insertion trouve a position $($builderMatch.Index)"

$hookCode = @"


        // === HOOK ITEM DECODER (fga_0.eM) - RETRANSFORM ===
        try {
            log("Installation hook item decoder RETRANSFORM (fga_0.eM)...");

            new AgentBuilder.Default()
                .disableClassFormatChanges()
                .with(AgentBuilder.RedefinitionStrategy.RETRANSFORMATION)
                .with(new AgentBuilder.Listener.Adapter() {
                    @Override
                    public void onTransformation(net.bytebuddy.description.type.TypeDescription typeDescription,
                                                  ClassLoader classLoader,
                                                  net.bytebuddy.utility.JavaModule module,
                                                  boolean loaded,
                                                  net.bytebuddy.dynamic.DynamicType dynamicType) {
                        log("RETRANSFORM SUCCESS: " + typeDescription.getName() + " (loaded=" + loaded + ")");
                    }
                    @Override
                    public void onError(String typeName,
                                        ClassLoader classLoader,
                                        net.bytebuddy.utility.JavaModule module,
                                        boolean loaded,
                                        Throwable throwable) {
                        log("RETRANSFORM ERROR on " + typeName + ": " + throwable.getMessage());
                        throwable.printStackTrace();
                    }
                })
                .type(ElementMatchers.named("fga_0"))
                .transform((builder2, typeDescription, classLoader, module, protectionDomain) -> {
                    log("RETRANSFORM TRIGGERED on: " + typeDescription.getName());
                    return builder2.visit(
                        Advice.to(ItemDecoderAdvice.class)
                            .on(ElementMatchers.named("eM")
                                .and(ElementMatchers.takesArguments(1))
                                .and(ElementMatchers.takesArgument(0, byte[].class)))
                    );
                })
                .installOn(inst);

            log("Hook item decoder RETRANSFORM installe.");

            int fgaCount = 0;
            boolean fga0Found = false;
            for (Class<?> c : inst.getAllLoadedClasses()) {
                String name = c.getName();
                if (name.startsWith("fga")) {
                    boolean modifiable = inst.isModifiableClass(c);
                    log("CLASSE fga* CHARGEE: " + name + " | modifiable=" + modifiable);
                    fgaCount++;
                    if (name.equals("fga_0")) { fga0Found = true; }
                }
            }
            log("Total classes fga* chargees: " + fgaCount);

            if (fga0Found) {
                log("fga_0 DEJA CHARGEE - retransformation explicite...");
                for (Class<?> c : inst.getAllLoadedClasses()) {
                    if (c.getName().equals("fga_0")) {
                        try {
                            inst.retransformClasses(c);
                            log("RETRANSFORMATION EXPLICITE fga_0 REUSSIE");
                        } catch (Exception e) {
                            log("ERREUR retransformation explicite fga_0: " + e.getClass().getName() + " - " + e.getMessage());
                            e.printStackTrace();
                        }
                        break;
                    }
                }
            } else {
                log("fga_0 PAS ENCORE CHARGEE - le hook la captera au chargement");
            }

        } catch (Exception hookEx) {
            log("ERREUR hook item decoder RETRANSFORM: " + hookEx.getClass().getName() + " - " + hookEx.getMessage());
            hookEx.printStackTrace();
        }
        // === FIN HOOK ITEM DECODER ===
"@

$insertPos = $builderMatch.Index + $builderMatch.Length
$content = $content.Insert($insertPos, $hookCode)
Log "OK" "Hook RETRANSFORM insere APRES builder.installOn(inst)"

$newBackup = "${spyFile}.bak_v2_$timestamp"
Copy-Item $spyFile $newBackup -Force
[System.IO.File]::WriteAllText($spyFile, $content, [System.Text.Encoding]::UTF8)
$finalLines = (Get-Content $spyFile).Count
Log "OK" "WakfuSpyAgent.java ecrit : $finalLines lignes"

$finalContent = Get-Content $spyFile -Raw
$ob = ([regex]::Matches($finalContent, '\{')).Count
$cb = ([regex]::Matches($finalContent, '\}')).Count
if ($ob -eq $cb) { Log "OK" "Accolades equilibrees : $ob" } else { Log "WARN" "Desequilibre : $ob ouvertes vs $cb fermees" }

$firstLine = ($finalContent -split "`n" | Where-Object { $_.Trim() -ne '' } | Select-Object -First 1).Trim()
if ($firstLine -match '^package\s+') { Log "OK" "Premiere ligne : $firstLine" } else { Log "ERREUR" "Premiere ligne invalide : $firstLine" }

$hookCount = ([regex]::Matches($finalContent, 'HOOK ITEM DECODER')).Count
Log "INFO" "Blocs hook detectes : $([math]::Floor($hookCount/2))"

$env:JAVA_TOOL_OPTIONS_BAK = $env:JAVA_TOOL_OPTIONS
$env:JAVA_TOOL_OPTIONS = ""
Log "INFO" "JAVA_TOOL_OPTIONS desactive pour Maven"

$mvnCmd = "$agentDir\tools\apache-maven-3.9.14\bin\mvn.cmd"
if (-not (Test-Path $mvnCmd)) { $mvnCmd = "mvn" }
Log "INFO" "Maven : $mvnCmd"

$buildLog = "$logDir\build_v2_$timestamp.log"
$buildErr = "$logDir\build_v2_${timestamp}_err.log"

$proc = Start-Process -FilePath $mvnCmd -ArgumentList "clean","package","-f","$agentDir\pom.xml","-DskipTests" -NoNewWindow -PassThru -Wait -RedirectStandardOutput $buildLog -RedirectStandardError $buildErr

$env:JAVA_TOOL_OPTIONS = $env:JAVA_TOOL_OPTIONS_BAK
Log "INFO" "JAVA_TOOL_OPTIONS restaure"

if ($proc.ExitCode -eq 0) {
    Log "OK" "Build Maven reussi"
    $targetJar = "$agentDir\target\wakfu-spy-agent-1.0.0.jar"
    $deployJar = "$agentDir\wakfu-spy-agent.jar"
    if (Test-Path $targetJar) {
        Copy-Item $targetJar $deployJar -Force
        $sz = [math]::Round((Get-Item $deployJar).Length / 1KB, 1)
        Log "OK" "JAR deploye : $deployJar ($sz KB)"
    }
} else {
    Log "ERREUR" "Build echoue (exit $($proc.ExitCode))"
    if (Test-Path $buildErr) { Get-Content $buildErr -Tail 10 | ForEach-Object { Log "ERREUR" $_ } }
    if (Test-Path $buildLog) { Get-Content $buildLog | Select-String "\[ERROR\]" | Select-Object -Last 10 | ForEach-Object { Log "ERREUR" $_.Line } }
}

Log "INFO" "=== VERIFICATION ==="
@("ItemLogWriter.java","ItemDecoderAdvice.java","WakfuSpyAgent.java") | ForEach-Object {
    $p = "$srcDir\$_"
    if (Test-Path $p) { Log "OK" "$_ ($([math]::Round((Get-Item $p).Length/1KB,1)) KB)" } else { Log "ERREUR" "$_ MANQUANT" }
}
@("wakfu-spy-agent.jar","target\wakfu-spy-agent-1.0.0.jar") | ForEach-Object {
    $p = "$agentDir\$_"
    if (Test-Path $p) { Log "OK" "$_ ($([math]::Round((Get-Item $p).Length/1KB,1)) KB)" } else { Log "ERREUR" "$_ MANQUANT" }
}

if ($finalContent -match 'RETRANSFORM TRIGGERED') { Log "OK" "Code RETRANSFORM present" } else { Log "ERREUR" "Code RETRANSFORM absent" }

Log "INFO" ""
Log "INFO" "=== PROCHAINE ETAPE ==="
Log "INFO" "1. FERME Wakfu (Alt+F4)"
Log "INFO" "2. Lance : $agentDir\launch_wakfu_with_agent.bat"
Log "INFO" "3. Connecte-toi, ouvre inventaire, attends 15s"
Log "INFO" "4. Colle diagnostic :"
Log "INFO" '   Get-Content "H:\Code\Wakfuassistant\agent\logs\wakfu_agent_spy.log" | Select-String "fga|RETRANSFORM|ITEM|DECODED|ERREUR" | Select-Object -Last 50 | Set-Clipboard'

$report.ToString() | Set-Clipboard
Write-Host "`n[CLIPBOARD] Rapport copie - Ctrl+V ici" -ForegroundColor Magenta
