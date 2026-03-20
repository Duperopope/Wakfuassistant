# ============================================
#  WAKFU CHEST POC v4 - METHODE DIFF INVENTAIRE
#  Fichier : H:\Code\Wakfuassistant\chest_poc_v4.ps1
# ============================================

$spyPath = "$env:APPDATA\zaap\gamesLogs\wakfu\logs\wakfu_spy.log"
$cachePath = "H:\Code\Wakfuassistant\item_name_cache.json"

# --- CHARGEMENT CDN ---
Write-Host "============================================" -ForegroundColor Cyan
Write-Host "  CHARGEMENT DES DONNEES CDN" -ForegroundColor Cyan
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
    $countItems = 0
    foreach ($item in $itemsJson) {
        $id = $null
        $nom = $null
        if ($item.definition -and $item.definition.item) {
            $id = $item.definition.item.id
        }
        if ($item.title) {
            if ($item.title.fr) { $nom = $item.title.fr }
            elseif ($item.title.en) { $nom = $item.title.en }
        }
        if ($id -and $nom) {
            $itemMap[[string]$id] = $nom
            $countItems++
        }
    }
    Write-Host "  $countItems equipements charges" -ForegroundColor Green

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
        if ($id -and $nom) {
            $itemMap[[string]$id] = $nom
            $countRes++
        }
    }
    Write-Host "  $countRes ressources chargees" -ForegroundColor Green
} catch {
    Write-Host "  ERREUR CDN: $_" -ForegroundColor Red
}

# --- CHARGEMENT CACHE LOCAL ---
$encCache = @{}
if (Test-Path $cachePath) {
    try {
        $encCache = Get-Content $cachePath -Raw | ConvertFrom-Json
        $cacheCount = ($encCache.PSObject.Properties | Measure-Object).Count
        Write-Host "  $cacheCount items en cache local" -ForegroundColor Green
    } catch {
        Write-Host "  Cache corrompu, ignore" -ForegroundColor Yellow
    }
}

Write-Host "  TOTAL: $($itemMap.Count) items connus" -ForegroundColor Cyan

# --- FONCTION RESOLUTION NOM ---
function Get-ItemName {
    param([string]$refId)
    if ($itemMap.ContainsKey($refId)) { return $itemMap[$refId] }
    if ($encCache.PSObject.Properties[$refId]) { return $encCache.$refId }

    # Scrape encyclopedie
    $categories = @("ressources", "armures", "armes", "accessoires", "consommables")
    foreach ($cat in $categories) {
        try {
            $url = "https://www.wakfu.com/fr/mmorpg/encyclopedie/$cat/$refId"
            $page = Invoke-WebRequest -Uri $url -UseBasicParsing -TimeoutSec 5
            if ($page.Content -match '<h1[^>]*class="ak-return-link"[^>]*>\s*(.+?)\s*</h1>') {
                $nom = $Matches[1].Trim()
                $itemMap[$refId] = $nom
                $encCache | Add-Member -NotePropertyName $refId -NotePropertyValue $nom -Force
                $encCache | ConvertTo-Json | Out-File $cachePath -Encoding UTF8
                Write-Host "    [ENCYCLOPEDIE] $refId = $nom ($cat)" -ForegroundColor DarkYellow
                return $nom
            }
            if ($page.Content -match '<title>\s*(.+?)\s*[-|]') {
                $nom = $Matches[1].Trim()
                $itemMap[$refId] = $nom
                $encCache | Add-Member -NotePropertyName $refId -NotePropertyValue $nom -Force
                $encCache | ConvertTo-Json | Out-File $cachePath -Encoding UTF8
                Write-Host "    [ENCYCLOPEDIE] $refId = $nom ($cat)" -ForegroundColor DarkYellow
                return $nom
            }
        } catch { }
    }
    return $null
}

# --- VARIABLES D'ETAT ---
$inHavreSac = $false
$lastSize = (Get-Item $spyPath).Length
$uniqueIdToRefId = @{}
$inventaireAvant = @{}   # refId -> qty (snapshot avant action)
$inventaireApres = @{}   # refId -> qty (snapshot apres action)
$depots = @()
$retraits = @()
$pendingRetrait = $null  # stocke le dernier AddItemOperation pour correlation
$lastAddTime = [datetime]::MinValue

Write-Host ""
Write-Host "============================================" -ForegroundColor Cyan
Write-Host "  WAKFU CHEST POC v4 - DIFF INVENTAIRE" -ForegroundColor Cyan
Write-Host "============================================" -ForegroundColor Cyan
Write-Host ""
Write-Host "  METHODE: On capture les AddItemOperation (retraits)" -ForegroundColor White
Write-Host "  et on correle les cso (depots) avec le contexte." -ForegroundColor White
Write-Host ""
Write-Host "  Pour les DEPOTS, on utilise une approche hybride:" -ForegroundColor Yellow
Write-Host "  1. Si l'uid a ete vu dans un retrait precedent -> nom connu" -ForegroundColor Yellow
Write-Host "  2. Sinon on capture le message 'Vous avez ramasse' juste avant" -ForegroundColor Yellow
Write-Host "     (l'item retire juste avant le depot est souvent le meme)" -ForegroundColor Yellow
Write-Host "  3. On log le message INFO du chat pour contexte" -ForegroundColor Yellow
Write-Host ""
Write-Host "  Lancez Wakfu, entrez dans le havre-sac, utilisez le coffre." -ForegroundColor White
Write-Host "  Ctrl+C pour arreter." -ForegroundColor White
Write-Host "--------------------------------------------" -ForegroundColor Gray

# --- BOUCLE PRINCIPALE ---
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

        # --- HAVRE-SAC ENTREE/SORTIE ---
        if ($ligne -match "DimensionalBag\.initializeToEnter") {
            $inHavreSac = $true
            Write-Host ""
            Write-Host "[$ts] === ENTREE HAVRE-SAC ===" -ForegroundColor Cyan
            continue
        }
        if ($ligne -match "PERSONAL_SPACE_LEAVE") {
            $inHavreSac = $false
            Write-Host "[$ts] === SORTIE HAVRE-SAC ===" -ForegroundColor Cyan

            # Bilan de session
            if ($depots.Count -gt 0 -or $retraits.Count -gt 0) {
                Write-Host ""
                Write-Host "  --- BILAN SESSION ---" -ForegroundColor Magenta
                if ($retraits.Count -gt 0) {
                    Write-Host "  RETRAITS:" -ForegroundColor Green
                    foreach ($r in $retraits) {
                        Write-Host "    $($r.qty)x $($r.nom) (refId=$($r.refId))" -ForegroundColor Green
                    }
                }
                if ($depots.Count -gt 0) {
                    Write-Host "  DEPOTS:" -ForegroundColor Red
                    foreach ($d in $depots) {
                        Write-Host "    $($d.qty)x $($d.nom) (uid=$($d.uid))" -ForegroundColor Red
                    }
                }
                Write-Host "  -----------------------" -ForegroundColor Magenta
            }
            $depots = @()
            $retraits = @()
            continue
        }

        if (-not $inHavreSac) { continue }

        # --- RETRAIT (AddItemOperation dans csf) ---
        if ($ligne -match "AddItemOperation\{.*?m_refId=(\d+).*?m_qty=(\d+).*?m_bagId=(\d+)") {
            $refId = $Matches[1]
            $qty = $Matches[2]
            $bagId = $Matches[3]

            # Extraire uniqueId si present
            if ($ligne -match "\{(\d{16,})=AddItemOperation") {
                $uid = $Matches[1]
                $uniqueIdToRefId[$uid] = $refId
            }

            $nom = Get-ItemName $refId
            if (-not $nom) { $nom = "refId=$refId" }

            Write-Host "[$ts] RETRAIT : $($qty)x $nom" -ForegroundColor Green

            $retraits += @{ ts=$ts; refId=$refId; qty=$qty; nom=$nom; bagId=$bagId }
            $pendingRetrait = @{ ts=$ts; refId=$refId; qty=$qty; nom=$nom }
            $lastAddTime = Get-Date
            continue
        }

        # --- DEPOT (cso sans AddItemOperation precedent) ---
        if ($ligne -match "Discarded inbound message cso@\w+\{.*?duS=(\d+).*?bol=(-?\d+)") {
            $uid = $Matches[1]
            $bol = $Matches[2]

            # Verifier si c'est un retrait (AddItemOperation juste avant, <2s)
            $now = Get-Date
            if ($pendingRetrait -and ($now - $lastAddTime).TotalSeconds -lt 2) {
                # C'est la finalisation du retrait, on ignore
                $pendingRetrait = $null
                continue
            }

            # C'est un depot
            $nom = $null
            $refId = $null

            # 1. Chercher dans le mapping connu
            if ($uniqueIdToRefId.ContainsKey($uid)) {
                $refId = $uniqueIdToRefId[$uid]
                $nom = Get-ItemName $refId
            }

            if ($nom) {
                Write-Host "[$ts] DEPOT   : 1x $nom (connu via retrait precedent)" -ForegroundColor Red
            } else {
                Write-Host "[$ts] DEPOT   : 1x item (uid=$uid, bol=$bol)" -ForegroundColor DarkRed
                Write-Host "         Pour identifier: retirez cet item puis re-deposez-le" -ForegroundColor DarkGray
            }

            $depots += @{ ts=$ts; uid=$uid; bol=$bol; nom=if($nom){$nom}else{"inconnu uid=$uid"}; qty=1; refId=$refId }
            $pendingRetrait = $null
            continue
        }

        # --- MESSAGE TEXTE (ramasse) ---
        if ($ligne -match "\[Information \(jeu\)\] Vous avez ramass.+?(\d+)x\s+(.+?)\s*\.?\s*$") {
            $qty = $Matches[1]
            $nomItem = $Matches[2].Trim()
            Write-Host "[$ts]   (ramasse: $($qty)x $nomItem)" -ForegroundColor DarkGreen
            continue
        }

        # --- OUVERTURE COFFRE ---
        if ($ligne -match "Discarded inbound message csJ@") {
            Write-Host "[$ts]   [coffre ouvert]" -ForegroundColor DarkCyan
            continue
        }

        # --- CONFIRMATION ---
        if ($ligne -match "Discarded inbound message csC@.*mhx=SUCCESS") {
            Write-Host "[$ts]   [confirme]" -ForegroundColor DarkGray
            continue
        }
    }
}
