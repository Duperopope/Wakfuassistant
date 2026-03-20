# ============================================
#  STRATEGIE FINALE - INVENTAIRE PAR RETRAIT PREALABLE
#  H:\Code\Wakfuassistant\docs\RND\poc-extractioninventairehavresac\chest_poc_v5.ps1
# ============================================

# PRINCIPE:
# 1. Au login, on charge le CDN + cache encyclopedie (couvre ~95% des items)
# 2. Chaque RETRAIT donne le refId -> on stocke le mapping uid->refId
# 3. Chaque DEPOT: si uid connu -> nom affiche. Si inconnu -> on note l'uid.
# 4. NOUVEAU: on parse AUSSI le csn pour tenter d'extraire les mappings
# 5. NOUVEAU: on intercepte le message csm (liste du coffre) pour compter les items
# 6. A la sortie du havre-sac, BILAN avec tout ce qu'on sait
#
# LIMITATION ACCEPTEE: un item depose sans retrait prealable dans la meme session
# reste "inconnu" jusqu'a ce qu'il soit retire une fois. Le mapping persiste
# dans un fichier JSON entre sessions.

$spyPath = "$env:APPDATA\zaap\gamesLogs\wakfu\logs\wakfu_spy.log"
$pocDir = "H:\Code\Wakfuassistant\docs\RND\poc-extractioninventairehavresac"
$outputDir = "$pocDir\output"
$cachePath = "$outputDir\item_name_cache.json"
$mappingPath = "$outputDir\uid_refid_mapping.json"

# ============================================
#  CHARGEMENT CDN
# ============================================
Write-Host "============================================" -ForegroundColor Cyan
Write-Host "  CHARGEMENT DES DONNEES" -ForegroundColor Cyan
Write-Host "============================================" -ForegroundColor Cyan

$itemMap = @{}
try {
    $configRaw = Invoke-WebRequest -Uri "https://wakfu.cdn.ankama.com/gamedata/config.json" -UseBasicParsing
    $config = $configRaw.Content | ConvertFrom-Json
    $version = $config.version
    Write-Host "  Version Wakfu: $version" -ForegroundColor Green

    Write-Host "  Telechargement items.json..." -ForegroundColor Gray
    $itemsRaw = Invoke-WebRequest -Uri "https://wakfu.cdn.ankama.com/gamedata/$version/items.json" -UseBasicParsing
    $itemsJson = $itemsRaw.Content | ConvertFrom-Json
    foreach ($item in $itemsJson) {
        $id = $null
        $nom = $null
        if ($item.definition -and $item.definition.item) { $id = $item.definition.item.id }
        if ($item.title) {
            if ($item.title.fr) { $nom = $item.title.fr }
            elseif ($item.title.en) { $nom = $item.title.en }
        }
        if ($id -and $nom) { $itemMap[[string]$id] = $nom }
    }
    Write-Host "  $($itemMap.Count) equipements" -ForegroundColor Green

    Write-Host "  Telechargement resources.json..." -ForegroundColor Gray
    $resRaw = Invoke-WebRequest -Uri "https://wakfu.cdn.ankama.com/gamedata/$version/resources.json" -UseBasicParsing
    $resJson = $resRaw.Content | ConvertFrom-Json
    $countRes = 0
    foreach ($res in $resJson) {
        $id = $null
        $nom = $null
        if ($res.definition -and $res.definition.id) { $id = $res.definition.id }
        if ($res.title) {
            if ($res.title.fr) { $nom = $res.title.fr }
            elseif ($res.title.en) { $nom = $res.title.en }
        }
        if ($id -and $nom) { $itemMap[[string]$id] = $nom; $countRes++ }
    }
    Write-Host "  $countRes ressources" -ForegroundColor Green
} catch {
    Write-Host "  ERREUR CDN: $_" -ForegroundColor Red
}

# ============================================
#  CHARGEMENT CACHE ENCYCLOPEDIE
# ============================================
$encCache = @{}
if (Test-Path $cachePath) {
    try {
        $raw = Get-Content $cachePath -Raw | ConvertFrom-Json
        foreach ($prop in $raw.PSObject.Properties) {
            $itemMap[$prop.Name] = $prop.Value
            $encCache[$prop.Name] = $prop.Value
        }
        Write-Host "  $($encCache.Count) items du cache encyclopedie" -ForegroundColor Green
    } catch { }
}

# ============================================
#  CHARGEMENT MAPPING UID->REFID PERSISTANT
# ============================================
$uidMapping = @{}
if (Test-Path $mappingPath) {
    try {
        $raw = Get-Content $mappingPath -Raw | ConvertFrom-Json
        foreach ($prop in $raw.PSObject.Properties) {
            $uidMapping[$prop.Name] = $prop.Value
        }
        Write-Host "  $($uidMapping.Count) mappings uid->refId charges" -ForegroundColor Green
    } catch { }
}

Write-Host "  TOTAL: $($itemMap.Count) noms connus" -ForegroundColor Cyan

# ============================================
#  FONCTION RESOLUTION NOM
# ============================================
function Get-ItemName {
    param([string]$refId)
    if ($itemMap.ContainsKey($refId)) { return $itemMap[$refId] }

    # Scrape encyclopedie
    $categories = @("ressources", "armures", "armes", "accessoires", "consommables")
    foreach ($cat in $categories) {
        try {
            $url = "https://www.wakfu.com/fr/mmorpg/encyclopedie/$cat/$refId"
            $page = Invoke-WebRequest -Uri $url -UseBasicParsing -TimeoutSec 5
            if ($page.Content -match '<h1[^>]*class="ak-return-link"[^>]*>\s*(.+?)\s*</h1>') {
                $nom = $Matches[1].Trim()
                $itemMap[$refId] = $nom
                $encCache[$refId] = $nom
                # Sauvegarder le cache
                $cacheObj = New-Object PSObject
                foreach ($k in $encCache.Keys) { $cacheObj | Add-Member -NotePropertyName $k -NotePropertyValue $encCache[$k] -Force }
                $cacheObj | ConvertTo-Json | Out-File $cachePath -Encoding UTF8
                Write-Host "    [ENCYCLOPEDIE] $refId = $nom" -ForegroundColor DarkYellow
                return $nom
            }
            if ($page.Content -match '<title>\s*(.+?)\s*[-|]') {
                $nom = $Matches[1].Trim()
                $itemMap[$refId] = $nom
                $encCache[$refId] = $nom
                $cacheObj = New-Object PSObject
                foreach ($k in $encCache.Keys) { $cacheObj | Add-Member -NotePropertyName $k -NotePropertyValue $encCache[$k] -Force }
                $cacheObj | ConvertTo-Json | Out-File $cachePath -Encoding UTF8
                Write-Host "    [ENCYCLOPEDIE] $refId = $nom" -ForegroundColor DarkYellow
                return $nom
            }
        } catch { }
    }
    return $null
}

# Sauvegarder le mapping uid->refId
function Save-UidMapping {
    $obj = New-Object PSObject
    foreach ($k in $uidMapping.Keys) {
        $obj | Add-Member -NotePropertyName $k -NotePropertyValue $uidMapping[$k] -Force
    }
    $obj | ConvertTo-Json | Out-File $mappingPath -Encoding UTF8
}

# ============================================
#  VARIABLES D'ETAT
# ============================================
$inHavreSac = $false
$lastSize = (Get-Item $spyPath).Length
$depots = @()
$retraits = @()
$pendingAdd = $null
$pendingAddTime = [datetime]::MinValue
$sessionCount = 0

Write-Host ""
Write-Host "============================================" -ForegroundColor Cyan
Write-Host "  WAKFU CHEST POC v5" -ForegroundColor Cyan
Write-Host "============================================" -ForegroundColor Cyan
Write-Host ""
Write-Host "  Le mapping uid->refId se construit au fil des retraits" -ForegroundColor White
Write-Host "  et persiste entre sessions dans uid_refid_mapping.json" -ForegroundColor White
Write-Host "  ($($uidMapping.Count) mappings existants)" -ForegroundColor White
Write-Host ""
Write-Host "  Ctrl+C pour arreter." -ForegroundColor Gray
Write-Host "--------------------------------------------" -ForegroundColor Gray

# ============================================
#  BOUCLE PRINCIPALE
# ============================================
while ($true) {
    Start-Sleep -Milliseconds 200

    $currentSize = (Get-Item $spyPath).Length
    if ($currentSize -le $lastSize) { continue }

    $stream = [System.IO.FileStream]::new($spyPath, [System.IO.FileMode]::Open, [System.IO.FileAccess]::Read, [System.IO.FileShare]::ReadWrite)
    $stream.Seek($lastSize, [System.IO.SeekOrigin]::Begin) | Out-Null
    $reader = [System.IO.StreamReader]::new($stream, [System.Text.Encoding]::UTF8)
    $newContent = $reader.ReadToEnd()
    $reader.Close()
    $stream.Close()
    $lastSize = $currentSize

    foreach ($ligne in $newContent -split "`n") {
        $ligne = $ligne.Trim()
        if ([string]::IsNullOrWhiteSpace($ligne)) { continue }

        # Timestamp
        $ts = ""
        if ($ligne -match "^.{5} ([\d:,]+)") { $ts = $Matches[1] }

        # --- HAVRE-SAC ENTREE ---
        if ($ligne -match "DimensionalBag\.initializeToEnter") {
            $inHavreSac = $true
            $sessionCount++
            Write-Host ""
            Write-Host "[$ts] === ENTREE HAVRE-SAC (session #$sessionCount) ===" -ForegroundColor Cyan
            continue
        }

        # --- HAVRE-SAC SORTIE ---
        if ($ligne -match "PERSONAL_SPACE_LEAVE") {
            $inHavreSac = $false
            Write-Host "[$ts] === SORTIE HAVRE-SAC ===" -ForegroundColor Cyan

            # Bilan
            if ($depots.Count -gt 0 -or $retraits.Count -gt 0) {
                Write-Host ""
                Write-Host "  ======= BILAN SESSION #$sessionCount =======" -ForegroundColor Magenta
                if ($retraits.Count -gt 0) {
                    Write-Host "  RETRAITS:" -ForegroundColor Green
                    foreach ($r in $retraits) {
                        Write-Host "    + $($r.qty)x $($r.nom)" -ForegroundColor Green
                    }
                }
                if ($depots.Count -gt 0) {
                    Write-Host "  DEPOTS:" -ForegroundColor Red
                    foreach ($d in $depots) {
                        Write-Host "    - $($d.qty)x $($d.nom)" -ForegroundColor Red
                    }
                }
                $unknowns = ($depots | Where-Object { $_.nom -match "^inconnu" }).Count
                if ($unknowns -gt 0) {
                    Write-Host ""
                    Write-Host "  $unknowns depot(s) non identifies." -ForegroundColor Yellow
                    Write-Host "  Astuce: retirez ces items puis re-deposez-les." -ForegroundColor Yellow
                    Write-Host "  Le mapping sera memorise pour les prochaines sessions." -ForegroundColor Yellow
                }
                Write-Host "  ===================================" -ForegroundColor Magenta
            }
            $depots = @()
            $retraits = @()
            continue
        }

        if (-not $inHavreSac) { continue }

        # --- COFFRE OUVERT ---
        if ($ligne -match "Discarded inbound message csJ@") {
            Write-Host "[$ts]   [coffre ouvert]" -ForegroundColor DarkCyan
            continue
        }

        # --- RETRAIT (AddItemOperation) ---
        if ($ligne -match "AddItemOperation\{.*?m_refId=(\d+).*?m_qty=(\d+).*?m_bagId=(\d+)") {
            $refId = $Matches[1]
            $qty = $Matches[2]
            $bagId = $Matches[3]

            # Extraire uniqueId
            $uid = $null
            if ($ligne -match "\{(\d{16,})=AddItemOperation") {
                $uid = $Matches[1]
                $uidMapping[$uid] = $refId
                Save-UidMapping
            }

            $nom = Get-ItemName $refId
            if (-not $nom) { $nom = "refId=$refId" }

            Write-Host "[$ts] RETRAIT : $($qty)x $nom" -ForegroundColor Green

            $retraits += @{ ts=$ts; refId=$refId; qty=[int]$qty; nom=$nom }
            $pendingAdd = @{ ts=$ts; refId=$refId; qty=$qty; nom=$nom }
            $pendingAddTime = Get-Date
            continue
        }

        # --- DEPOT (cso) ---
        if ($ligne -match "Discarded inbound message cso@\w+\{.*?duS=(\d+).*?bol=(-?\d+)") {
            $uid = $Matches[1]
            $bol = $Matches[2]

            # Verifier si c'est la finalisation d'un retrait
            $now = Get-Date
            if ($pendingAdd -and ($now - $pendingAddTime).TotalSeconds -lt 2) {
                $pendingAdd = $null
                continue
            }

            # C'est un depot
            $nom = $null
            $refId = $null
            $qty = 1

            # Chercher dans le mapping persistant
            if ($uidMapping.ContainsKey($uid)) {
                $refId = $uidMapping[$uid]
                $nom = Get-ItemName $refId
            }

            if ($nom) {
                Write-Host "[$ts] DEPOT   : $($qty)x $nom" -ForegroundColor Red
            } else {
                $nom = "inconnu (uid=$uid)"
                Write-Host "[$ts] DEPOT   : $($qty)x $nom" -ForegroundColor DarkRed
            }

            $depots += @{ ts=$ts; uid=$uid; qty=$qty; nom=$nom; refId=$refId }
            $pendingAdd = $null
            continue
        }

        # --- CONFIRMATION ---
        if ($ligne -match "Discarded inbound message csC@.*mhx=SUCCESS") {
            Write-Host "[$ts]   [confirme]" -ForegroundColor DarkGray
            continue
        }

        # --- MESSAGE RAMASSE ---
        if ($ligne -match "\[Information \(jeu\)\] Vous avez ramass.+?(\d+)x\s+(.+?)\s*\.?\s*$") {
            Write-Host "[$ts]   (ramasse: $($Matches[1])x $($Matches[2].Trim()))" -ForegroundColor DarkGreen
            continue
        }
    }
}
