$spyPath = "$env:APPDATA\zaap\gamesLogs\wakfu\logs\wakfu_spy.log"
$mainLog = "$env:APPDATA\zaap\gamesLogs\wakfu\logs\wakfu.log"

Write-Host "=== CORRELATION SPY + LOG PRINCIPAL ===" -ForegroundColor Cyan

# Moments exacts des depots
$depotTimes = @("19:14:06", "19:14:08", "19:14:09")

foreach ($dt in $depotTimes) {
    Write-Host ""
    Write-Host "--- Autour de $dt (depot) ---" -ForegroundColor Yellow
    
    Write-Host "  wakfu.log :" -ForegroundColor Green
    Select-String -Path $mainLog -Pattern "^.{5} $dt" | ForEach-Object {
        Write-Host "    $($_.Line)" -ForegroundColor White
    }
    
    Write-Host "  wakfu_spy.log :" -ForegroundColor Green
    Select-String -Path $spyPath -Pattern "^.{5} $dt" | Where-Object {
        $_.Line -notmatch "voices in use" -and $_.Line -notmatch "\(fHq:" -and $_.Line -notmatch "\(aHu:" -and $_.Line -notmatch "DefaultChannelPipeline:1198"
    } | ForEach-Object {
        Write-Host "    $($_.Line.Substring(0, [Math]::Min(200, $_.Line.Length)))" -ForegroundColor Gray
    }
}

# Aussi chercher "onItemDoubleClick" qui donne le contexte UI
Write-Host ""
Write-Host "=== onItemDoubleClick (action utilisateur) ===" -ForegroundColor Cyan
Select-String -Path $spyPath -Pattern "onItemDoubleClick" | ForEach-Object {
    $ts = ""; if ($_.Line -match "^.{5} ([\d:,]+)") { $ts = $Matches[1] }
    Write-Host "  [$ts] double-click detecte" -ForegroundColor Yellow
}

# Chercher dans wakfu.log les lignes interessantes autour de 19:14
Write-Host ""
Write-Host "=== wakfu.log entre 19:13:50 et 19:14:15 ===" -ForegroundColor Cyan
Select-String -Path $mainLog -Pattern "^.{5} 19:1[34]:" | Where-Object {
    $_.Line -notmatch "voices in use" -and $_.Line -notmatch "\(fHq:" -and $_.Line -notmatch "\(aHu:"
} | ForEach-Object {
    Write-Host "  $($_.Line.Substring(0, [Math]::Min(250, $_.Line.Length)))" -ForegroundColor White
}

# Solution alternative : parser le csn binaire
Write-Host ""
Write-Host "=== TENTATIVE PARSE csn (inventaire binaire) ===" -ForegroundColor Cyan
$csnLine = (Select-String -Path $spyPath -Pattern "Discarded inbound message csn@" | Select-Object -First 1).Line
if ($csnLine -match "mhd=\[([^\]]+)\]") {
    $bytes = $Matches[1] -split ", " | ForEach-Object { [int]$_ }
    Write-Host "  $($bytes.Count) bytes dans csn" -ForegroundColor Yellow
    
    # Chercher des patterns de 8 bytes qui pourraient etre des uniqueId
    # Les uniqueId sont ~1470358... = 0x146... en hex
    Write-Host "  Recherche de refId connus dans les bytes..." -ForegroundColor Yellow
    
    # refId 2037 (Epee du Tofu) = 0x07F5 en big-endian
    $refIdBytes = @(7, 245)  # 2037
    for ($i = 0; $i -lt $bytes.Count - 1; $i++) {
        $b1 = $bytes[$i] -band 0xFF
        $b2 = $bytes[$i+1] -band 0xFF
        if ($b1 -eq 7 -and $b2 -eq 245) {
            Write-Host "    Possible refId=2037 a position $i" -ForegroundColor Red
        }
    }
}
