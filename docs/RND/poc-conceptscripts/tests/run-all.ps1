# ============================================================
# WAKFU ASSISTANT — Run All Tests
# Lance tous les scripts de test et affiche un résumé global
# Usage : .\run-all.ps1
# ============================================================

$TestDir  = $PSScriptRoot
$Scripts  = Get-ChildItem $TestDir -Filter "test-*.ps1" | Sort-Object Name

$TotalPass = 0
$TotalFail = 0

Write-Host ""
Write-Host "════════════════════════════════════════════════════════════" -ForegroundColor Cyan
Write-Host "  WAKFU ASSISTANT — Suite de tests d'interprétation" -ForegroundColor White
Write-Host "════════════════════════════════════════════════════════════" -ForegroundColor Cyan
Write-Host ""

foreach ($script in $Scripts) {
    $result = pwsh -NoProfile -File $script.FullName
    $result | ForEach-Object { Write-Host "  $_" }

    # Extraire le bilan (dernières lignes) — "X/Y tests pass*"
    $bilan = $result | Where-Object { $_ -match "(\d+)/(\d+) tests pass" } | Select-Object -Last 1
    if ($bilan -match "(\d+)/(\d+) tests pass") {
        $TotalPass += [int]$Matches[1]
        $TotalFail += ([int]$Matches[2] - [int]$Matches[1])
    }
    Write-Host ""
}

$Total = $TotalPass + $TotalFail
$Color = if ($TotalFail -eq 0) { "Green" } else { "Red" }
Write-Host "════════════════════════════════════════════════════════════" -ForegroundColor Cyan
Write-Host ("  TOTAL : $TotalPass/$Total tests passés") -ForegroundColor $Color
if ($TotalFail -gt 0) {
    Write-Host "  $TotalFail test(s) en ÉCHEC — voir les ❌ ci-dessus" -ForegroundColor Red
}
Write-Host "════════════════════════════════════════════════════════════" -ForegroundColor Cyan
Write-Host ""
