# ============================================
#  DECODEUR ctE (Item Definitions)
#  H:\Code\Wakfuassistant\docs\RND\poc-extractioninventairehavresac\decode_ctE.ps1
# ============================================

$spyPath = "$env:APPDATA\zaap\gamesLogs\wakfu\logs\wakfu_spy.log"
$outputDir = "H:\Code\Wakfuassistant\docs\RND\poc-extractioninventairehavresac\output"
$dumpPath = "$outputDir\dump_ctE.txt"
$cachePath = "$outputDir\item_name_cache.json"

Write-Host "============================================" -ForegroundColor Cyan
Write-Host "  DECODEUR ctE - DEFINITIONS DES ITEMS" -ForegroundColor Cyan
Write-Host "============================================" -ForegroundColor Cyan

# Trouver le premier ctE (le plus gros)
$ctE_lines = Select-String -Path $spyPath -Pattern "Discarded inbound message ctE@"
Write-Host "  $($ctE_lines.Count) messages ctE trouves" -ForegroundColor White

# Prendre le plus gros
$biggest = $null
$biggestLen = 0
foreach ($match in $ctE_lines) {
    if ($match.Line.Length -gt $biggestLen) {
        $biggestLen = $match.Line.Length
        $biggest = $match.Line
    }
}

Write-Host "  Plus gros ctE: $biggestLen chars" -ForegroundColor Green

# Extraire le contenu entre { }
$payload = ""
if ($biggest -match "ctE@\w+\{(.+)\}\s*that\s+reached") {
    $payload = $Matches[1]
} elseif ($biggest -match "ctE@\w+\{(.+)\}") {
    $payload = $Matches[1]
}

Write-Host "  Payload: $($payload.Length) chars" -ForegroundColor White

# Chercher les champs
$fieldNames = [regex]::Matches($payload, "([a-zA-Z_]\w+)=") | ForEach-Object { $_.Groups[1].Value } | Sort-Object -Unique
Write-Host "  Champs detectes: $($fieldNames -join ', ')" -ForegroundColor Yellow

# Chercher si c'est aussi du protobuf brut ou du texte structure
$isProto = $payload -match "^\s*\w+=\["
Write-Host "  Format: $(if($isProto){'Protobuf bytes array'}else{'Structure texte'})" -ForegroundColor White

# Chercher les refId connus EN TEXTE dans le payload
Write-Host "`n=== RECHERCHE REFID CONNUS DANS ctE ===" -ForegroundColor Yellow
$knownRefs = @{
    "2037"="Epee du Tofu"; "9430"="Dague de Boisaille"; "26396"="Cape de Sakuya"
    "26835"="Bague Hou"; "12438"="Anneau Craquele"; "12284"="Poudre Osamodas"
    "13638"="Croutons"; "2340"="Seau d eau"; "29718"="Incantation Feca"
    "25832"="Epee Poutreuse"; "25012"="Sifli a Iop"
    "11441"="Chataigne"; "27050"="Poils Pandissidan"; "21122"="Sioupere-Glou"
}

foreach ($ref in $knownRefs.Keys) {
    if ($payload.Contains($ref)) {
        $idx = $payload.IndexOf($ref)
        $start = [Math]::Max(0, $idx - 30)
        $end = [Math]::Min($payload.Length, $idx + $ref.Length + 30)
        $ctx = $payload.Substring($start, $end - $start)
        Write-Host "  $ref ($($knownRefs[$ref])) PRESENT => ...$ctx..." -ForegroundColor Green
    }
}

# Chercher les uniqueId connus
Write-Host "`n=== RECHERCHE UNIQUEID CONNUS DANS ctE ===" -ForegroundColor Yellow
$knownUids = @(
    "1468669294429602781", "1470076891930034303", "1470076891477049445",
    "1470358329912983798", "1470358066242257617", "1470358188564939153"
)
foreach ($uid in $knownUids) {
    if ($payload.Contains($uid)) {
        $idx = $payload.IndexOf($uid)
        $start = [Math]::Max(0, $idx - 30)
        $end = [Math]::Min($payload.Length, $idx + $uid.Length + 30)
        $ctx = $payload.Substring($start, $end - $start)
        Write-Host "  $uid PRESENT => ...$ctx..." -ForegroundColor Green
    } else {
        Write-Host "  $uid absent" -ForegroundColor DarkGray
    }
}

# Si c'est du protobuf, decoder
if ($payload -match "(\w+)=\[([^\]]+)\]") {
    $arrayField = $Matches[1]
    $arrayContent = $Matches[2]
    Write-Host "`n=== DECODAGE PROTOBUF ctE (champ $arrayField) ===" -ForegroundColor Yellow

    $signedBytes = $arrayContent -split ",\s*" | ForEach-Object { [int]$_.Trim() }
    $bytes = [byte[]]::new($signedBytes.Count)
    for ($i = 0; $i -lt $signedBytes.Count; $i++) {
        if ($signedBytes[$i] -lt 0) {
            $bytes[$i] = [byte](256 + $signedBytes[$i])
        } else {
            $bytes[$i] = [byte]$signedBytes[$i]
        }
    }

    Write-Host "  $($bytes.Count) octets a decoder" -ForegroundColor Green

    # Fonctions protobuf
    function Read-Varint2 {
        param([byte[]]$data, [ref]$pos)
        [long]$result = 0
        [int]$shift = 0
        do {
            if ($pos.Value -ge $data.Length) { return -1 }
            [byte]$b = $data[$pos.Value]
            $pos.Value++
            $result = $result -bor (([long]($b -band 0x7F)) -shl $shift)
            $shift += 7
        } while (($b -band 0x80) -ne 0)
        return $result
    }

    # Collecter tous les varints
    $script:allVarints = @()
    $script:fileLines = @()

    function Collect-Varints {
        param([byte[]]$data, [int]$offset, [int]$length, [int]$depth = 0)
        if ($depth -gt 10) { return }
        $pos = [ref]$offset
        $end = $offset + $length
        $indent = "  " * $depth

        while ($pos.Value -lt $end) {
            $tag = Read-Varint2 $data $pos
            if ($tag -lt 0) { break }
            $fieldNum = [int]($tag -shr 3)
            $wireType = [int]($tag -band 0x07)

            switch ($wireType) {
                0 {
                    $val = Read-Varint2 $data $pos
                    $script:allVarints += @{ Depth=$depth; Field=$fieldNum; Value=$val }
                    $script:fileLines += "${indent}f${fieldNum}=$val"
                }
                1 {
                    if ($pos.Value + 8 -gt $end) { $pos.Value = $end; break }
                    $val = [BitConverter]::ToUInt64($data, $pos.Value)
                    $pos.Value += 8
                    $script:allVarints += @{ Depth=$depth; Field=$fieldNum; Value=$val }
                    $script:fileLines += "${indent}f${fieldNum}=$val (f64)"
                }
                2 {
                    $len = Read-Varint2 $data $pos
                    if ($len -lt 0 -or $pos.Value + $len -gt $end) { $pos.Value = $end; break }
                    $script:fileLines += "${indent}f${fieldNum} {$len}"
                    Collect-Varints $data $pos.Value $len ($depth + 1)
                    $script:fileLines += "${indent}}"
                    $pos.Value += $len
                }
                5 {
                    if ($pos.Value + 4 -gt $end) { $pos.Value = $end; break }
                    $val = [BitConverter]::ToUInt32($data, $pos.Value)
                    $pos.Value += 4
                    $script:allVarints += @{ Depth=$depth; Field=$fieldNum; Value=$val }
                    $script:fileLines += "${indent}f${fieldNum}=$val (f32)"
                }
                default { $pos.Value = $end }
            }
        }
    }

    Collect-Varints $bytes 0 $bytes.Count 0

    # Sauvegarder le dump
    $script:fileLines | Out-File $dumpPath -Encoding UTF8
    Write-Host "  Dump sauvegarde: $dumpPath ($($script:fileLines.Count) lignes)" -ForegroundColor Green

    # Analyse
    $bigNums = $script:allVarints | Where-Object { $_.Value -gt 1000000000000000 }
    $medNums = $script:allVarints | Where-Object { $_.Value -ge 1000 -and $_.Value -le 99999 }
    Write-Host "`n  Grands nombres (uniqueId?): $($bigNums.Count)" -ForegroundColor Yellow
    Write-Host "  Nombres moyens (refId?): $($medNums.Count)" -ForegroundColor Yellow

    # Montrer les 10 premiers grands nombres
    Write-Host "`n  PREMIERS UNIQUEID:" -ForegroundColor White
    $bigNums | Select-Object -First 10 | ForEach-Object {
        Write-Host "    depth=$($_.Depth) f$($_.Field) = $($_.Value)" -ForegroundColor Yellow
    }

    # Montrer les 20 premiers refId potentiels
    Write-Host "`n  PREMIERS REFID POTENTIELS:" -ForegroundColor White
    $medNums | Select-Object -First 20 | ForEach-Object {
        $refStr = [string]$_.Value
        $nomConnu = if ($knownRefs.ContainsKey($refStr)) { " ($($knownRefs[$refStr]))" } else { "" }
        Write-Host "    depth=$($_.Depth) f$($_.Field) = $($_.Value)$nomConnu" -ForegroundColor $(if($nomConnu){"Green"}else{"White"})
    }

    # Compter les refId connus
    Write-Host "`n  REFID CONNUS DANS LE PROTOBUF:" -ForegroundColor Cyan
    foreach ($ref in $knownRefs.Keys) {
        $count = ($medNums | Where-Object { $_.Value -eq [long]$ref }).Count
        if ($count -gt 0) {
            Write-Host "    refId=$ref ($($knownRefs[$ref])): $count occurrence(s)" -ForegroundColor Green
        }
    }

    # Chercher les paires uid+refId au meme depth
    Write-Host "`n  PAIRES UID+REFID (meme profondeur):" -ForegroundColor Cyan
    $pairesCount = 0
    $prevBig = $null
    foreach ($v in $script:allVarints) {
        if ($v.Value -gt 1000000000000000) {
            $prevBig = $v
        }
        if ($prevBig -and $v.Value -ge 1000 -and $v.Value -le 99999 -and $v.Depth -eq $prevBig.Depth) {
            $refStr = [string]$v.Value
            $nomConnu = if ($knownRefs.ContainsKey($refStr)) { " = $($knownRefs[$refStr])" } else { "" }
            Write-Host "    uid=$($prevBig.Value) -> refId=$($v.Value)$nomConnu" -ForegroundColor Green
            $pairesCount++
            $prevBig = $null
            if ($pairesCount -ge 30) {
                Write-Host "    ... (limite affichage 30 paires)" -ForegroundColor DarkGray
                break
            }
        }
    }
    Write-Host "  Total paires: $pairesCount+" -ForegroundColor White

} else {
    # Pas du protobuf, sauvegarder le payload brut
    Write-Host "`n  Format non-protobuf, sauvegarde brute..." -ForegroundColor Yellow
    $payload | Out-File $dumpPath -Encoding UTF8
    Write-Host "  Sauvegarde: $dumpPath" -ForegroundColor Green
    Write-Host "`n  PREMIERS 500 CHARS:" -ForegroundColor White
    Write-Host "  $($payload.Substring(0, [Math]::Min(500, $payload.Length)))" -ForegroundColor Gray
}

Write-Host "`n============================================" -ForegroundColor Cyan
Write-Host "  FIN ANALYSE ctE" -ForegroundColor Cyan
Write-Host "============================================" -ForegroundColor Cyan
