# ============================================
#  VERIFICATION MAPPING + STATS
#  H:\Code\Wakfuassistant\docs\RND\poc-extractioninventairehavresac\check_mapping.ps1
# ============================================

$outputDir = "H:\Code\Wakfuassistant\docs\RND\poc-extractioninventairehavresac\output"
$mappingPath = "$outputDir\uid_refid_mapping.json"
$cachePath = "$outputDir\item_name_cache.json"

Write-Host "============================================" -ForegroundColor Cyan
Write-Host "  VERIFICATION DU MAPPING PERSISTANT" -ForegroundColor Cyan
Write-Host "============================================" -ForegroundColor Cyan

# --- MAPPING UID -> REFID ---
if (Test-Path $mappingPath) {
    $raw = Get-Content $mappingPath -Raw
    Write-Host "`n  Fichier: $mappingPath" -ForegroundColor Gray
    Write-Host "  Taille: $($raw.Length) chars" -ForegroundColor Gray
    
    $mapping = $raw | ConvertFrom-Json
    $props = $mapping.PSObject.Properties
    Write-Host "  $($props.Count) mappings uid->refId" -ForegroundColor Green
    
    Write-Host "`n  CONTENU:" -ForegroundColor Yellow
    foreach ($p in $props) {
        $uid = $p.Name
        $refId = $p.Value
        Write-Host "    uid=$uid -> refId=$refId" -ForegroundColor White
    }
} else {
    Write-Host "  FICHIER MAPPING INTROUVABLE" -ForegroundColor Red
}

# --- CACHE ENCYCLOPEDIE ---
Write-Host "`n============================================" -ForegroundColor Cyan
Write-Host "  CACHE ENCYCLOPEDIE" -ForegroundColor Cyan
Write-Host "============================================" -ForegroundColor Cyan

if (Test-Path $cachePath) {
    $cache = Get-Content $cachePath -Raw | ConvertFrom-Json
    $cacheProps = $cache.PSObject.Properties
    Write-Host "  $($cacheProps.Count) items caches" -ForegroundColor Green
    
    Write-Host "`n  CONTENU:" -ForegroundColor Yellow
    foreach ($p in $cacheProps) {
        Write-Host "    refId=$($p.Name) = $($p.Value)" -ForegroundColor White
    }
} else {
    Write-Host "  PAS DE CACHE" -ForegroundColor Yellow
}

# --- ITEMS INCONNUS DES SESSIONS ---
Write-Host "`n============================================" -ForegroundColor Cyan
Write-Host "  ITEMS ENCORE INCONNUS" -ForegroundColor Cyan
Write-Host "============================================" -ForegroundColor Cyan

$unknownUids = @(
    "1470358383885288081",
    "1470358383885288116",
    "1468951002055966876"
)

Write-Host "  3 uid de depots non resolus:" -ForegroundColor Yellow
foreach ($uid in $unknownUids) {
    $found = $false
    if (Test-Path $mappingPath) {
        $mapping = Get-Content $mappingPath -Raw | ConvertFrom-Json
        if ($mapping.PSObject.Properties[$uid]) {
            $refId = $mapping.$uid
            Write-Host "    $uid -> refId=$refId (RESOLU!)" -ForegroundColor Green
            $found = $true
        }
    }
    if (-not $found) {
        Write-Host "    $uid -> encore inconnu" -ForegroundColor Red
        Write-Host "      => Retirez cet item du coffre dans la prochaine session" -ForegroundColor DarkGray
    }
}

# --- STATISTIQUES GLOBALES ---
Write-Host "`n============================================" -ForegroundColor Cyan
Write-Host "  BILAN GLOBAL POC" -ForegroundColor Cyan
Write-Host "============================================" -ForegroundColor Cyan

$mappingCount = if (Test-Path $mappingPath) { 
    ((Get-Content $mappingPath -Raw | ConvertFrom-Json).PSObject.Properties).Count 
} else { 0 }

$cacheCount = if (Test-Path $cachePath) { 
    ((Get-Content $cachePath -Raw | ConvertFrom-Json).PSObject.Properties).Count 
} else { 0 }

Write-Host "  Mappings uid->refId: $mappingCount" -ForegroundColor White
Write-Host "  Cache encyclopedie:  $cacheCount noms" -ForegroundColor White
Write-Host "  CDN Ankama:          ~8500 noms" -ForegroundColor White
Write-Host "  Taux identification: depots avec retrait prealable = 100%" -ForegroundColor Green
Write-Host "  Limitation:          depots sans retrait = uid seulement" -ForegroundColor Yellow
Write-Host ""
Write-Host "  Le mapping grossit a chaque session." -ForegroundColor Cyan
Write-Host "  En communautaire, les mappings de tous les joueurs" -ForegroundColor Cyan
Write-Host "  seront fusionnes => resolution quasi-totale." -ForegroundColor Cyan

Write-Host "`n============================================" -ForegroundColor Cyan
Write-Host "  FIN VERIFICATION" -ForegroundColor Cyan
Write-Host "============================================" -ForegroundColor Cyan
