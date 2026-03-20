# ============================================
#  WAKFU HDV EXPLORER - CAPTURE DES MESSAGES
#  H:\Code\Wakfuassistant\docs\RND\poc-hdv\hdv_explorer.ps1
# ============================================

$spyPath = "$env:APPDATA\zaap\gamesLogs\wakfu\logs\wakfu_spy.log"
$outputDir = "H:\Code\Wakfuassistant\docs\RND\poc-hdv\output"

if (-not (Test-Path $outputDir)) {
    New-Item -ItemType Directory -Path $outputDir -Force | Out-Null
}

$dumpPath = "$outputDir\hdv_capture.txt"

Write-Host "============================================" -ForegroundColor Cyan
Write-Host "  WAKFU HDV EXPLORER" -ForegroundColor Cyan
Write-Host "============================================" -ForegroundColor Cyan
Write-Host ""
Write-Host "  INSTRUCTIONS:" -ForegroundColor Yellow
Write-Host "  1. Lancez Wakfu avec le spy Log4j actif" -ForegroundColor White
Write-Host "  2. Allez a cote d'un Hotel des Ventes en jeu" -ForegroundColor White
Write-Host "  3. Appuyez ENTREE ici quand vous etes pret" -ForegroundColor White
Write-Host "  4. Ouvrez le HDV en jeu" -ForegroundColor White
Write-Host "  5. Cherchez un item (ex: Epee du Tofu)" -ForegroundColor White
Write-Host "  6. Naviguez dans 2-3 categories" -ForegroundColor White
Write-Host "  7. Si possible, mettez un item en vente (petit prix)" -ForegroundColor White
Write-Host "  8. Appuyez ENTREE ici quand vous avez termine" -ForegroundColor White
Write-Host ""

Read-Host "  Appuyez ENTREE quand vous etes devant le HDV"

$sizeBefore = (Get-Item $spyPath).Length
$tsStart = Get-Date -Format "HH:mm:ss"
Write-Host ""
Write-Host "  SNAPSHOT AVANT: $sizeBefore octets [$tsStart]" -ForegroundColor Green
Write-Host ""
Write-Host "  >>> Ouvrez le HDV, cherchez des items, naviguez <<<" -ForegroundColor Yellow
Write-Host ""

Read-Host "  Appuyez ENTREE quand vous avez termine vos actions au HDV"

$sizeAfter = (Get-Item $spyPath).Length
$tsEnd = Get-Date -Format "HH:mm:ss"
$delta = $sizeAfter - $sizeBefore
Write-Host ""
Write-Host "  SNAPSHOT APRES: $sizeAfter octets (+$delta octets) [$tsEnd]" -ForegroundColor Green

Write-Host ""
Write-Host "============================================" -ForegroundColor Cyan
Write-Host "  ANALYSE DES MESSAGES HDV" -ForegroundColor Cyan
Write-Host "============================================" -ForegroundColor Cyan

$stream = [System.IO.FileStream]::new($spyPath, [System.IO.FileMode]::Open, [System.IO.FileAccess]::Read, [System.IO.FileShare]::ReadWrite)
$stream.Seek($sizeBefore, [System.IO.SeekOrigin]::Begin) | Out-Null
$reader = [System.IO.StreamReader]::new($stream, [System.Text.Encoding]::UTF8)
$newContent = $reader.ReadToEnd()
$reader.Close()
$stream.Close()

$newLines = $newContent -split "`n" | Where-Object { $_.Trim() -ne "" }
Write-Host "  $($newLines.Count) nouvelles lignes capturees" -ForegroundColor Green

$noisePatterns = @("\(fHq:", "\(aHu:", "voices in use", "GuildChangeMessage", "^\s*$")

$usefulLines = $newLines | Where-Object {
    $line = $_
    $isNoise = $false
    foreach ($pattern in $noisePatterns) {
        if ($line -match $pattern) { $isNoise = $true; break }
    }
    -not $isNoise
}

Write-Host "  $($usefulLines.Count) lignes utiles (apres filtrage bruit)" -ForegroundColor Green

Write-Host ""
Write-Host "=== TYPES DE MESSAGES NETTY ===" -ForegroundColor Yellow

$nettyMessages = @{}
$nettyExamples = @{}

foreach ($line in $usefulLines) {
    if ($line -match "Discarded inbound message (\w+)@\w+\{(.+?)\}\s*that") {
        $type = $Matches[1]
        $contenu = $Matches[2]
        if (-not $nettyMessages.ContainsKey($type)) {
            $nettyMessages[$type] = 0
            $nettyExamples[$type] = $contenu
        }
        $nettyMessages[$type]++
    }
}

$sorted = $nettyMessages.GetEnumerator() | Sort-Object Value -Descending

$knownNonHDV = @("csJ","csF","csf","cso","csC","csE","csm","NM","NS","cvn","GuildChangeMessage","crV","coR","coe","coNN","col","coj","cvJ")

foreach ($entry in $sorted) {
    $type = $entry.Key
    $count = $entry.Value
    $example = $nettyExamples[$type]
    if ($example.Length -gt 120) { $example = $example.Substring(0, 120) + "..." }

    if ($type -in $knownNonHDV) {
        $label = " (connu)"
        $color = "DarkGray"
    } else {
        $label = " <<< NOUVEAU - POTENTIEL HDV"
        $color = "Green"
    }

    Write-Host "  $type x$count$label" -ForegroundColor $color
    Write-Host "    exemple: $example" -ForegroundColor DarkGray
}

Write-Host ""
Write-Host "=== RECHERCHE DE REFID/PRIX DANS LES MESSAGES ===" -ForegroundColor Yellow

$foundRefIds = @()
$foundPrices = @()

foreach ($line in $usefulLines) {
    if ($line -match "(?:refId|itemId|ref_id|item_id|m_refId)[\s=:]+(\d+)") {
        $foundRefIds += $Matches[1]
    }
    if ($line -match "(?:price|prix|kama|cost|amount)[\s=:]+(\d+)") {
        $foundPrices += $Matches[1]
    }
}

Write-Host "  $($foundRefIds.Count) refId trouves" -ForegroundColor $(if($foundRefIds.Count -gt 0){"Green"}else{"Yellow"})
$foundRefIds | Select-Object -First 10 | ForEach-Object { Write-Host "    refId=$_" -ForegroundColor Green }

Write-Host "  $($foundPrices.Count) prix trouves" -ForegroundColor $(if($foundPrices.Count -gt 0){"Green"}else{"Yellow"})
$foundPrices | Select-Object -First 10 | ForEach-Object { Write-Host "    prix=$_" -ForegroundColor Green }

Write-Host ""
Write-Host "=== MESSAGES AVEC GRANDS NOMBRES (prix?) ===" -ForegroundColor Yellow

foreach ($line in $usefulLines) {
    if ($line -match "Discarded inbound message (\w+)@") {
        $type = $Matches[1]
        if ($type -in @("NM","NS","cvn","GuildChangeMessage")) { continue }
        if ($type -in $knownNonHDV) { continue }

        $nums = [regex]::Matches($line, "=(\d{2,7})[,\s\}]")
        if ($nums.Count -gt 2) {
            $ts = ""
            if ($line -match "^.{5} ([\d:,]+)") { $ts = $Matches[1] }
            $numList = ($nums | ForEach-Object { $_.Groups[1].Value }) -join ", "
            Write-Host "  [$ts] $type : nombres=$numList" -ForegroundColor White
        }
    }
}

$usefulLines | Out-File $dumpPath -Encoding UTF8
Write-Host ""
Write-Host "  Capture sauvegardee: $dumpPath" -ForegroundColor Green

Write-Host ""
Write-Host "============================================" -ForegroundColor Cyan
Write-Host "  RESUME EXPLORATION HDV" -ForegroundColor Cyan
Write-Host "============================================" -ForegroundColor Cyan

$newTypes = @($sorted | Where-Object { $_.Key -notin $knownNonHDV })
Write-Host "  $($newTypes.Count) NOUVEAUX types de messages detectes" -ForegroundColor $(if($newTypes.Count -gt 0){"Green"}else{"Yellow"})

if ($newTypes.Count -gt 0) {
    Write-Host "  Probablement lies au HDV:" -ForegroundColor White
    foreach ($nt in $newTypes) {
        Write-Host "    $($nt.Key) (x$($nt.Value))" -ForegroundColor Green
    }
}

Write-Host ""
Write-Host "============================================" -ForegroundColor Cyan
