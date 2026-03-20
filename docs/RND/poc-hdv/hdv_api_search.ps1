# ============================================
#  RECHERCHE API PRIX HDV EXISTANTES
#  H:\Code\Wakfuassistant\docs\RND\poc-hdv\hdv_api_search.ps1
# ============================================

$outputDir = "H:\Code\Wakfuassistant\docs\RND\poc-hdv\output"

Write-Host "============================================" -ForegroundColor Cyan
Write-Host "  RECHERCHE API PRIX HDV WAKFU" -ForegroundColor Cyan
Write-Host "============================================" -ForegroundColor Cyan

# Test 1: API officielle Wakfu
Write-Host "`n=== API OFFICIELLE ANKAMA ===" -ForegroundColor Yellow
$apis = @(
    @{ Name="Wakfu CDN items"; Url="https://wakfu.cdn.ankama.com/gamedata/config.json" },
    @{ Name="Zenith Wakfu"; Url="https://api.zenithwakfu.com/search/items?name=Main+du+Boo" },
    @{ Name="Zenith market"; Url="https://api.zenithwakfu.com/market/items" },
    @{ Name="Wakfu Builder API"; Url="https://builder.methodwakfu.com/api/items" },
    @{ Name="Wakfu Market (unofficial)"; Url="https://www.wakfu-market.com/api" }
)

foreach ($api in $apis) {
    Write-Host "`n  Test: $($api.Name)" -ForegroundColor White
    Write-Host "  URL: $($api.Url)" -ForegroundColor Gray
    try {
        $response = Invoke-WebRequest -Uri $api.Url -UseBasicParsing -TimeoutSec 10 -ErrorAction Stop
        $status = $response.StatusCode
        $size = $response.Content.Length
        Write-Host "  Status: $status, Taille: $size chars" -ForegroundColor Green
        
        # Montrer un apercu
        $preview = $response.Content.Substring(0, [Math]::Min(300, $response.Content.Length))
        Write-Host "  Apercu: $preview" -ForegroundColor Gray
    } catch {
        $err = $_.Exception.Message
        if ($err.Length -gt 100) { $err = $err.Substring(0, 100) + "..." }
        Write-Host "  Erreur: $err" -ForegroundColor Red
    }
}

# Test 2: Methodes connues de la communaute
Write-Host "`n=== OUTILS COMMUNAUTAIRES ===" -ForegroundColor Yellow

$tools = @(
    @{ Name="Zenith Wakfu (site)"; Url="https://zenithwakfu.com" },
    @{ Name="Wakfu Builder"; Url="https://builder.methodwakfu.com" },
    @{ Name="WakfuBuddy"; Url="https://wakfubuddy.com" }
)

foreach ($tool in $tools) {
    Write-Host "`n  Test: $($tool.Name)" -ForegroundColor White
    try {
        $response = Invoke-WebRequest -Uri $tool.Url -UseBasicParsing -TimeoutSec 10 -ErrorAction Stop
        Write-Host "  Status: $($response.StatusCode) - ACCESSIBLE" -ForegroundColor Green
        
        # Chercher des references API dans le HTML
        if ($response.Content -match "api[/\.]") {
            Write-Host "  Contient des references API!" -ForegroundColor Yellow
        }
    } catch {
        Write-Host "  Non accessible" -ForegroundColor Red
    }
}

# Test 3: Verifier si Zenith a une API de prix
Write-Host "`n=== TEST API ZENITH (PRIX) ===" -ForegroundColor Yellow
$zenithTests = @(
    "https://api.zenithwakfu.com/prices",
    "https://api.zenithwakfu.com/v1/prices",
    "https://api.zenithwakfu.com/market",
    "https://api.zenithwakfu.com/hdv",
    "https://api.zenithwakfu.com/items/26426",
    "https://api.zenithwakfu.com/api/items",
    "https://zenithwakfu.com/api/prices",
    "https://zenithwakfu.com/api/market"
)

foreach ($url in $zenithTests) {
    try {
        $response = Invoke-WebRequest -Uri $url -UseBasicParsing -TimeoutSec 5 -ErrorAction Stop
        Write-Host "  $url => $($response.StatusCode) ($($response.Content.Length) chars)" -ForegroundColor Green
        $preview = $response.Content.Substring(0, [Math]::Min(200, $response.Content.Length))
        Write-Host "    $preview" -ForegroundColor Gray
    } catch {
        $status = ""
        if ($_.Exception.Response) { $status = [int]$_.Exception.Response.StatusCode }
        Write-Host "  $url => $status" -ForegroundColor DarkGray
    }
}

Write-Host "`n============================================" -ForegroundColor Cyan
Write-Host "  BILAN" -ForegroundColor Cyan
Write-Host "============================================" -ForegroundColor Cyan
Write-Host ""
Write-Host "  CE QU'ON CAPTE VIA LOGS (CONFIRME):" -ForegroundColor Green
Write-Host "    - refId des items en vente (coy.f10)" -ForegroundColor White
Write-Host "    - Quantite (coy.f9)" -ForegroundColor White
Write-Host "    - ID vendeur (coy.f4)" -ForegroundColor White
Write-Host "    - Zone HDV (coy.f6)" -ForegroundColor White
Write-Host "    - Solde kamas (ctu.meu)" -ForegroundColor White
Write-Host "    - Stats offres (cmq: nb vendus, kamas, nb en vente)" -ForegroundColor White
Write-Host "    - Confirmation achat (cmv, csf)" -ForegroundColor White
Write-Host ""
Write-Host "  CE QU'ON NE CAPTE PAS:" -ForegroundColor Red
Write-Host "    - Prix unitaire (pas dans les Discarded messages)" -ForegroundColor White
Write-Host "    - Liste Mes offres (cmm toString casse)" -ForegroundColor White
Write-Host ""
Write-Host "  OPTIONS POUR LES PRIX:" -ForegroundColor Yellow
Write-Host "    1. API communautaire (Zenith, etc.)" -ForegroundColor White
Write-Host "    2. Proxy reseau (mitmproxy)" -ForegroundColor White
Write-Host "    3. Agent Java (-javaagent) pour intercepter le decodage" -ForegroundColor White
Write-Host "============================================" -ForegroundColor Cyan
