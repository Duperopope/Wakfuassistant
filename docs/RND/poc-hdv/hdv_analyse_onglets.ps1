# ============================================
#  HDV ANALYSE MULTI-ONGLETS
#  H:\Code\Wakfuassistant\docs\RND\poc-hdv\hdv_analyse_onglets.ps1
# ============================================

$outputDir = "H:\Code\Wakfuassistant\docs\RND\poc-hdv\output"

Write-Host "============================================" -ForegroundColor Cyan
Write-Host "  ANALYSE MULTI-ONGLETS HDV" -ForegroundColor Cyan
Write-Host "============================================" -ForegroundColor Cyan

# Fonction pour analyser un fichier de capture
function Analyse-Capture {
    param([string]$fileName, [string]$label)
    
    $path = "$outputDir\$fileName"
    if (-not (Test-Path $path)) {
        Write-Host "`n  $label : FICHIER MANQUANT" -ForegroundColor Red
        return
    }
    
    $lines = Get-Content $path
    Write-Host "`n============================================" -ForegroundColor Yellow
    Write-Host "  $label ($($lines.Count) lignes)" -ForegroundColor Yellow
    Write-Host "============================================" -ForegroundColor Yellow
    
    # Extraire les messages Netty
    foreach ($line in $lines) {
        if ($line -match "Discarded inbound message (\w+)@\w+\{(.+)\}\s*that") {
            $type = $Matches[1]
            $contenu = $Matches[2]
            $ts = ""
            if ($line -match "^.{5} ([\d:,]+)") { $ts = $Matches[1] }
            
            # Ignorer les types non-HDV
            if ($type -in @("coe","coNN","conn","coR","NM","NS","cvn","crV")) { continue }
            
            Write-Host "`n  [$ts] $type ($($contenu.Length) chars)" -ForegroundColor Cyan
            
            # Afficher les champs simples
            $simples = [regex]::Matches($contenu, "(\w+)=([\w\.\-]+)(?=[,\s}]|$)")
            foreach ($s in $simples) {
                $fname = $s.Groups[1].Value
                $fval = $s.Groups[2].Value
                if ($fname -eq "handler") { continue }
                $color = "White"
                if ($fval -match "^-?\d+$") {
                    $numVal = [long]$fval
                    if ([Math]::Abs($numVal) -gt 100000) { $color = "Yellow" }
                    if ($fname -eq "meu") { $color = "Green" }
                    if ($fname -match "maH") { $color = "Green" }
                }
                Write-Host "    $fname = $fval" -ForegroundColor $color
            }
            
            # Tableaux de bytes - decoder protobuf
            $arrays = [regex]::Matches($contenu, "(\w+)=\[([^\]]*)\]")
            foreach ($a in $arrays) {
                $fname = $a.Groups[1].Value
                $fval = $a.Groups[2].Value
                $elements = ($fval -split ",").Count
                
                Write-Host "    $fname = [$elements elements]" -ForegroundColor White
                
                if ($fval -match "^[\d\s,\-]+$" -and $elements -gt 5) {
                    try {
                        $signedBytes = $fval -split ",\s*" | ForEach-Object { [int]$_.Trim() }
                        $byteArr = [byte[]]::new($signedBytes.Count)
                        for ($i = 0; $i -lt $signedBytes.Count; $i++) {
                            if ($signedBytes[$i] -lt 0) { $byteArr[$i] = [byte](256 + $signedBytes[$i]) }
                            else { $byteArr[$i] = [byte]$signedBytes[$i] }
                        }
                        
                        # Decodeur protobuf inline
                        $script:protoLines = @()
                        function Decode-PB {
                            param([byte[]]$data, [int]$offset, [int]$length, [int]$d = 0)
                            if ($d -gt 5) { return }
                            $p = [ref]$offset
                            $e = $offset + $length
                            $indent = "      " + ("  " * $d)
                            while ($p.Value -lt $e) {
                                [long]$tag = 0; [int]$shift = 0
                                do {
                                    if ($p.Value -ge $data.Length) { return }
                                    [byte]$b = $data[$p.Value]; $p.Value++
                                    $tag = $tag -bor (([long]($b -band 0x7F)) -shl $shift); $shift += 7
                                } while (($b -band 0x80) -ne 0)
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
                                        if ($val -gt 100000) { $color = "Yellow" }
                                        if ($val -ge 1000 -and $val -le 99999) { $color = "Green" }
                                        Write-Host "${indent}f$fn = $val" -ForegroundColor $color
                                    }
                                    1 {
                                        if ($p.Value + 8 -gt $e) { return }
                                        $val = [BitConverter]::ToInt64($data, $p.Value); $p.Value += 8
                                        Write-Host "${indent}f$fn = $val (f64)" -ForegroundColor $(if([Math]::Abs($val) -gt 100000){"Yellow"}else{"Gray"})
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
                                        Decode-PB $data $p.Value ([int]$len) ($d + 1)
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
                        
                        Decode-PB $byteArr 0 $byteArr.Count 0
                    } catch { }
                }
            }
            
            # Chercher des champs sets/maps {key=value}
            $maps = [regex]::Matches($contenu, "(\w+)=\{([^}]*)\}")
            foreach ($m in $maps) {
                $fname = $m.Groups[1].Value
                $fval = $m.Groups[2].Value
                if ($fname -eq "handler") { continue }
                Write-Host "    $fname = {$fval}" -ForegroundColor White
            }
        }
    }
}

# --- ANALYSER CHAQUE CAPTURE ---
Analyse-Capture "hdv_01_ouvrir_hdv.txt" "ETAPE 1: OUVRIR HDV"
Analyse-Capture "hdv_02_rechercher_page1.txt" "ETAPE 2: RECHERCHER PAGE 1"
Analyse-Capture "hdv_03_page2.txt" "ETAPE 3: PAGE 2"
Analyse-Capture "hdv_04_page3.txt" "ETAPE 4: PAGE 3"
Analyse-Capture "hdv_05_offres_achat.txt" "ETAPE 5: OFFRES D'ACHAT"
Analyse-Capture "hdv_06_mes_offres.txt" "ETAPE 6: MES OFFRES"
Analyse-Capture "hdv_07_recuperer_kamas.txt" "ETAPE 7: RECUPERER KAMAS"
Analyse-Capture "hdv_08_historique.txt" "ETAPE 8: HISTORIQUE"

Write-Host "`n============================================" -ForegroundColor Cyan
Write-Host "  FIN ANALYSE" -ForegroundColor Cyan
Write-Host "============================================" -ForegroundColor Cyan
