# ============================================
#  HDV DEEP ANALYSIS - MESSAGES DETAILLES
#  H:\Code\Wakfuassistant\docs\RND\poc-hdv\hdv_deep_analysis.ps1
# ============================================

$capturePath = "H:\Code\Wakfuassistant\docs\RND\poc-hdv\output\hdv_capture.txt"
$outputDir = "H:\Code\Wakfuassistant\docs\RND\poc-hdv\output"

Write-Host "============================================" -ForegroundColor Cyan
Write-Host "  HDV DEEP ANALYSIS" -ForegroundColor Cyan
Write-Host "============================================" -ForegroundColor Cyan

$lines = Get-Content $capturePath

# --- TYPES HDV A ANALYSER ---
$hdvTypes = @("cwj", "csa", "crW", "crX", "coy", "clX", "cud", "cvg", "clU", "ctu", "coM", "cmv")

foreach ($type in $hdvTypes) {
    $matches = $lines | Where-Object { $_ -match "Discarded inbound message $type@" }
    if ($matches.Count -eq 0) { continue }

    Write-Host "`n============================================" -ForegroundColor Yellow
    Write-Host "  MESSAGE TYPE: $type (x$($matches.Count))" -ForegroundColor Yellow
    Write-Host "============================================" -ForegroundColor Yellow

    $msgIndex = 0
    foreach ($line in $matches) {
        $msgIndex++
        $ts = ""
        if ($line -match "^.{5} ([\d:,]+)") { $ts = $Matches[1] }

        # Extraire le contenu complet
        $contenu = ""
        if ($line -match "$type@\w+\{(.+)\}\s*that\s+reached") {
            $contenu = $Matches[1]
        }

        Write-Host "`n  --- $type #$msgIndex [$ts] ($($contenu.Length) chars) ---" -ForegroundColor Cyan

        # Extraire tous les champs
        $fields = @{}
        $remaining = $contenu
        
        # Trouver les champs simples (nom=valeur)
        $simpleFields = [regex]::Matches($contenu, "(\w+)=([\w\.\-]+)(?=[,\s]|$)")
        foreach ($sf in $simpleFields) {
            $fname = $sf.Groups[1].Value
            $fval = $sf.Groups[2].Value
            if (-not $fields.ContainsKey($fname)) {
                $fields[$fname] = $fval
            }
        }

        # Trouver les champs tableau (nom=[...])
        $arrayFields = [regex]::Matches($contenu, "(\w+)=\[([^\]]*)\]")
        foreach ($af in $arrayFields) {
            $fname = $af.Groups[1].Value
            $fval = $af.Groups[2].Value
            $fields[$fname] = "[" + $fval.Length + " chars]"
            
            # Si c'est un tableau de bytes, compter les elements
            $elements = ($fval -split ",").Count
            Write-Host "    $fname = [$elements elements, $($fval.Length) chars]" -ForegroundColor White

            # Si petit tableau, afficher le contenu
            if ($fval.Length -lt 200) {
                Write-Host "      => [$fval]" -ForegroundColor Gray
            } else {
                # Afficher debut et fin
                $debut = $fval.Substring(0, [Math]::Min(100, $fval.Length))
                Write-Host "      debut: [$debut...]" -ForegroundColor Gray
            }

            # Tenter un decodage protobuf si c'est des bytes signes
            if ($fval -match "^[\d\s,\-]+$" -and $elements -gt 10) {
                try {
                    $signedBytes = $fval -split ",\s*" | ForEach-Object { [int]$_.Trim() }
                    $byteArr = [byte[]]::new($signedBytes.Count)
                    for ($i = 0; $i -lt $signedBytes.Count; $i++) {
                        if ($signedBytes[$i] -lt 0) { $byteArr[$i] = [byte](256 + $signedBytes[$i]) }
                        else { $byteArr[$i] = [byte]$signedBytes[$i] }
                    }

                    # Scan protobuf rapide
                    function Quick-Proto {
                        param([byte[]]$data, [int]$offset, [int]$length, [int]$d = 0)
                        if ($d -gt 6) { return }
                        $p = [ref]$offset
                        $e = $offset + $length
                        $indent = "        " + ("  " * $d)
                        while ($p.Value -lt $e) {
                            $tag = 0; [long]$result = 0; [int]$shift = 0
                            do {
                                if ($p.Value -ge $data.Length) { return }
                                [byte]$b = $data[$p.Value]; $p.Value++
                                $result = $result -bor (([long]($b -band 0x7F)) -shl $shift); $shift += 7
                            } while (($b -band 0x80) -ne 0)
                            $tag = $result
                            $fn = [int]($tag -shr 3); $wt = [int]($tag -band 7)
                            if ($fn -gt 500 -or $fn -lt 0) { return }
                            switch ($wt) {
                                0 {
                                    [long]$val = 0; $shift = 0
                                    do {
                                        if ($p.Value -ge $data.Length) { return }
                                        [byte]$b = $data[$p.Value]; $p.Value++
                                        $val = $val -bor (([long]($b -band 0x7F)) -shl $shift); $shift += 7
                                    } while (($b -band 0x80) -ne 0)
                                    $color = "Gray"
                                    if ($val -gt 1000000000000000) { $color = "Yellow" }
                                    elseif ($val -ge 1000 -and $val -le 99999) { $color = "Green" }
                                    Write-Host "${indent}f$fn = $val" -ForegroundColor $color
                                }
                                1 {
                                    if ($p.Value + 8 -gt $e) { return }
                                    $val = [BitConverter]::ToInt64($data, $p.Value); $p.Value += 8
                                    Write-Host "${indent}f$fn = $val (f64)" -ForegroundColor $(if([Math]::Abs($val) -gt 1000000000000000){"Yellow"}else{"Gray"})
                                }
                                2 {
                                    [long]$len = 0; $shift = 0
                                    do {
                                        if ($p.Value -ge $data.Length) { return }
                                        [byte]$b = $data[$p.Value]; $p.Value++
                                        $len = $len -bor (([long]($b -band 0x7F)) -shl $shift); $shift += 7
                                    } while (($b -band 0x80) -ne 0)
                                    if ($len -lt 0 -or $p.Value + $len -gt $e) { return }
                                    Write-Host "${indent}f$fn {$len bytes}" -ForegroundColor White
                                    Quick-Proto $data $p.Value ([int]$len) ($d + 1)
                                    $p.Value += $len
                                }
                                5 {
                                    if ($p.Value + 4 -gt $e) { return }
                                    $val = [BitConverter]::ToInt32($data, $p.Value); $p.Value += 4
                                    Write-Host "${indent}f$fn = $val (f32)" -ForegroundColor Gray
                                }
                                default { return }
                            }
                        }
                    }

                    Write-Host "      PROTOBUF DECODE:" -ForegroundColor Cyan
                    Quick-Proto $byteArr 0 $byteArr.Count 0
                } catch {
                    Write-Host "      (decodage protobuf echoue)" -ForegroundColor DarkGray
                }
            }
        }

        # Champs non-tableau
        $simpleOnly = [regex]::Matches($contenu, "(\w+)=([\w\.\-]+)(?=[,\s])")
        foreach ($sf in $simpleOnly) {
            $fname = $sf.Groups[1].Value
            $fval = $sf.Groups[2].Value
            if ($fval -notmatch "^\[") {
                $color = "White"
                if ($fval -match "^-?\d+$" -and [Math]::Abs([long]$fval) -gt 1000000000000) { $color = "Yellow" }
                if ($fval -match "^-?\d+$" -and [long]$fval -ge 1000 -and [long]$fval -le 99999) { $color = "Green" }
                Write-Host "    $fname = $fval" -ForegroundColor $color
            }
        }
    }
}

# --- ANALYSE DU CSF SPECIAL (bagId different) ---
Write-Host "`n============================================" -ForegroundColor Red
Write-Host "  CSF AVEC BAGID DIFFERENT (HDV?)" -ForegroundColor Red
Write-Host "============================================" -ForegroundColor Red

$csfLines = $lines | Where-Object { $_ -match "AddItemOperation" }
foreach ($line in $csfLines) {
    if ($line -match "m_refId=(\d+).*m_qty=(\d+).*m_bagId=(\d+).*m_posInBag=(\d+)") {
        $refId = $Matches[1]
        $qty = $Matches[2]
        $bagId = $Matches[3]
        $pos = $Matches[4]
        
        $isPersonal = ($bagId -eq "27497136409018909")
        $label = if ($isPersonal) { "INVENTAIRE PERSO" } else { "NOUVEAU BAGID (HDV?)" }
        $color = if ($isPersonal) { "Gray" } else { "Red" }
        
        Write-Host "  refId=$refId qty=$qty bagId=$bagId pos=$pos => $label" -ForegroundColor $color
    }
}

Write-Host "`n============================================" -ForegroundColor Cyan
Write-Host "  FIN ANALYSE" -ForegroundColor Cyan
Write-Host "============================================" -ForegroundColor Cyan