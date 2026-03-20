# ============================================
#  HDV ITEM IDENTIFICATION
#  H:\Code\Wakfuassistant\docs\RND\poc-hdv\hdv_identify_items.ps1
# ============================================

$outputDir = "H:\Code\Wakfuassistant\docs\RND\poc-hdv\output"
$cachePath = "H:\Code\Wakfuassistant\docs\RND\poc-extractioninventairehavresac\output\item_name_cache.json"

Write-Host "============================================" -ForegroundColor Cyan
Write-Host "  IDENTIFICATION DES ITEMS HDV" -ForegroundColor Cyan
Write-Host "============================================" -ForegroundColor Cyan

# Charger CDN
$itemMap = @{}
try {
    $configRaw = Invoke-WebRequest -Uri "https://wakfu.cdn.ankama.com/gamedata/config.json" -UseBasicParsing
    $config = $configRaw.Content | ConvertFrom-Json
    $version = $config.version
    
    $itemsRaw = Invoke-WebRequest -Uri "https://wakfu.cdn.ankama.com/gamedata/$version/items.json" -UseBasicParsing
    $itemsJson = $itemsRaw.Content | ConvertFrom-Json
    foreach ($item in $itemsJson) {
        $id = $null; $nom = $null
        if ($item.definition -and $item.definition.item) { $id = $item.definition.item.id }
        if ($item.title) {
            if ($item.title.fr) { $nom = $item.title.fr }
            elseif ($item.title.en) { $nom = $item.title.en }
        }
        if ($id -and $nom) { $itemMap[[string]$id] = $nom }
    }
    Write-Host "  CDN: $($itemMap.Count) items" -ForegroundColor Green
} catch {
    Write-Host "  ERREUR CDN: $_" -ForegroundColor Red
}

# Charger cache
if (Test-Path $cachePath) {
    try {
        $cache = Get-Content $cachePath -Raw | ConvertFrom-Json
        foreach ($p in $cache.PSObject.Properties) { $itemMap[$p.Name] = $p.Value }
    } catch { }
}

# Fonction scrape encyclopedie
function Get-ItemName {
    param([string]$refId)
    if ($itemMap.ContainsKey($refId)) { return $itemMap[$refId] }
    $categories = @("ressources", "armures", "armes", "accessoires", "consommables")
    foreach ($cat in $categories) {
        try {
            $url = "https://www.wakfu.com/fr/mmorpg/encyclopedie/$cat/$refId"
            $page = Invoke-WebRequest -Uri $url -UseBasicParsing -TimeoutSec 5
            if ($page.Content -match '<h1[^>]*class="ak-return-link"[^>]*>\s*(.+?)\s*</h1>') {
                $nom = $Matches[1].Trim()
                $itemMap[$refId] = $nom
                Write-Host "    [ENCYCLOPEDIE] $refId = $nom" -ForegroundColor DarkYellow
                return $nom
            }
        } catch { }
    }
    return $null
}

# --- ITEMS TROUVES DANS LES COY (offres de vente) ---
Write-Host "`n=== OFFRES DE VENTE (coy) - f10 = refId? ===" -ForegroundColor Yellow

$coyRefIds = @(26599, 26858, 27486, 25851, 19886)
foreach ($ref in $coyRefIds) {
    $nom = Get-ItemName ([string]$ref)
    if ($nom) {
        Write-Host "  f10=$ref => $nom" -ForegroundColor Green
    } else {
        Write-Host "  f10=$ref => NON TROUVE" -ForegroundColor Red
    }
}

# --- ITEMS TROUVES DANS LES CWJ (marchand) ---
Write-Host "`n=== MARCHAND (cwj) - f10 = refId? ===" -ForegroundColor Yellow

$cwjRefIds = @(92536832, 92471297, 1411)
$cwjF3 = @(97794, 69820, 316027)

Write-Host "  Champ f10:" -ForegroundColor White
foreach ($ref in $cwjRefIds) {
    $nom = Get-ItemName ([string]$ref)
    if ($nom) {
        Write-Host "    f10=$ref => $nom" -ForegroundColor Green
    } else {
        Write-Host "    f10=$ref => NON TROUVE (trop grand pour un refId)" -ForegroundColor DarkGray
    }
}

Write-Host "`n  Champ f3 (alternative):" -ForegroundColor White
foreach ($ref in $cwjF3) {
    $nom = Get-ItemName ([string]$ref)
    if ($nom) {
        Write-Host "    f3=$ref => $nom" -ForegroundColor Green
    } else {
        Write-Host "    f3=$ref => NON TROUVE" -ForegroundColor Red
    }
}

# --- ITEM ACHETE (csf) ---
Write-Host "`n=== ITEM ACHETE (csf) ===" -ForegroundColor Yellow
$nom26426 = Get-ItemName "26426"
Write-Host "  refId=26426 => $nom26426" -ForegroundColor Green
Write-Host "  bagId=29186495290016880 (HDV bag)" -ForegroundColor White

# --- CHAMP mfZ dans cwj ---
Write-Host "`n=== CHAMP mfZ (cwj) = prix? ===" -ForegroundColor Yellow
Write-Host "  cwj#1: mfZ=304" -ForegroundColor White
Write-Host "  cwj#2: mfZ=310" -ForegroundColor White
Write-Host "  cwj#3: mfZ=449" -ForegroundColor White
Write-Host "  cwj#4: mfZ=449" -ForegroundColor White
Write-Host "  (ce sont peut-etre des prix en kamas)" -ForegroundColor Gray

# --- CHAMP ctu ---
Write-Host "`n=== SOLDE KAMAS? (ctu) ===" -ForegroundColor Yellow
Write-Host "  meu=724741" -ForegroundColor White
Write-Host "  (ton solde de kamas apres l'achat?)" -ForegroundColor Gray

# --- RESUME ---
Write-Host "`n============================================" -ForegroundColor Cyan
Write-Host "  RESUME HDV" -ForegroundColor Cyan
Write-Host "============================================" -ForegroundColor Cyan
Write-Host ""
Write-Host "  MESSAGES IDENTIFIES:" -ForegroundColor White
Write-Host "    coy  = Offres de vente (listings)" -ForegroundColor Green
Write-Host "    cwj  = Items dans le marchand consulte" -ForegroundColor Green
Write-Host "    csa  = Chargement categorie HDV" -ForegroundColor Green
Write-Host "    crW  = Ouverture session HDV" -ForegroundColor Green
Write-Host "    crX  = Fermeture session HDV" -ForegroundColor Green
Write-Host "    cmv  = Confirmation achat (maH=OK)" -ForegroundColor Green
Write-Host "    csf  = Item recu (AddItemOperation)" -ForegroundColor Green
Write-Host "    ctu  = Solde kamas (meu=724741)" -ForegroundColor Green
Write-Host "    clX  = Navigation menu" -ForegroundColor Gray
Write-Host "    clU  = Ouverture menu" -ForegroundColor Gray
Write-Host "    cud  = Interaction PNJ" -ForegroundColor Gray
Write-Host "    cvg  = Config zone" -ForegroundColor Gray
Write-Host ""
Write-Host "  QUESTION CLE: Combien as-tu paye la Main du Boo?" -ForegroundColor Red
Write-Host "  Et combien de kamas avais-tu AVANT l'achat?" -ForegroundColor Red
Write-Host "  (pour valider meu=724741 comme solde post-achat" -ForegroundColor Red
Write-Host "   et mfZ comme prix)" -ForegroundColor Red
Write-Host "============================================" -ForegroundColor Cyan
