# ============================================
#  SYNTHESE PROTOCOLE HDV COMPLET
#  H:\Code\Wakfuassistant\docs\RND\poc-hdv\hdv_synthese.ps1
# ============================================

$outputDir = "H:\Code\Wakfuassistant\docs\RND\poc-hdv\output"

Write-Host "============================================" -ForegroundColor Cyan
Write-Host "  SYNTHESE PROTOCOLE HDV WAKFU" -ForegroundColor Cyan
Write-Host "============================================" -ForegroundColor Cyan

Write-Host "`n=== MESSAGES CONFIRMES ===" -ForegroundColor Green
Write-Host "  cmq  = Stats mes offres" -ForegroundColor White
Write-Host "         jZU = nb objets vendus" -ForegroundColor Gray
Write-Host "         jZV = kamas a recuperer" -ForegroundColor Gray
Write-Host "         maE = nb objets en vente" -ForegroundColor Gray
Write-Host "         jZX = nb objets non vendus" -ForegroundColor Gray
Write-Host "  cmb  = Recuperation kamas (jZV=montant, maH=OK)" -ForegroundColor White
Write-Host "  cmk  = Compteurs ventes (jZr-jZv)" -ForegroundColor White
Write-Host "  cmm  = Liste mes offres (protobuf)" -ForegroundColor White
Write-Host "  cmG  = Ouverture historique" -ForegroundColor White
Write-Host "  ctu  = Solde kamas (meu=solde)" -ForegroundColor White
Write-Host "  coy  = Offre de vente (f10=refId, f9=qty)" -ForegroundColor White
Write-Host "  cwj  = Item marchand (mfZ=?)" -ForegroundColor White
Write-Host "  cmv  = Confirmation achat (maH=OK)" -ForegroundColor White
Write-Host "  csf  = Item recu (refId, qty, bagId)" -ForegroundColor White

Write-Host "`n=== VALIDATIONS NUMERIQUES ===" -ForegroundColor Yellow
Write-Host "  Solde avant achat:   724742" -ForegroundColor White
Write-Host "  Achat Main du Boo:   -1" -ForegroundColor White
Write-Host "  Solde apres achat:   724741 (ctu.meu)" -ForegroundColor Green
Write-Host "  Recuperation HDV:    +26991 (cmb.jZV)" -ForegroundColor White
Write-Host "  Solde apres recup:   751732 (ctu.meu)" -ForegroundColor Green
Write-Host "  Calcul: 724741+26991 = $((724741+26991))" -ForegroundColor Green

Write-Host "`n=== RECHERCHE DU CHAMP PRIX DANS COY ===" -ForegroundColor Yellow

# Analyser les coy de la premiere capture pour trouver le prix
$capture1 = "$outputDir\hdv_capture.txt"
if (Test-Path $capture1) {
    $lines = Get-Content $capture1
    
    # Extraire TOUT le contenu des coy
    $coyCount = 0
    foreach ($line in $lines) {
        if ($line -match "Discarded inbound message coy@\w+\{(.+)\}\s*that") {
            $coyCount++
            $contenu = $Matches[1]
            
            # Extraire le tableau mda complet
            if ($contenu -match "mda=\[([^\]]+)\]") {
                $mdaContent = $Matches[1]
                $signedBytes = $mdaContent -split ",\s*" | ForEach-Object { [int]$_.Trim() }
                $byteArr = [byte[]]::new($signedBytes.Count)
                for ($i = 0; $i -lt $signedBytes.Count; $i++) {
                    if ($signedBytes[$i] -lt 0) { $byteArr[$i] = [byte](256 + $signedBytes[$i]) }
                    else { $byteArr[$i] = [byte]$signedBytes[$i] }
                }
                
                Write-Host "`n  --- coy #$coyCount ($($byteArr.Count) bytes) ---" -ForegroundColor Cyan
                
                # Decoder protobuf et lister TOUS les champs
                function Full-Decode {
                    param([byte[]]$data, [int]$offset, [int]$length, [int]$d = 0, [string]$prefix = "")
                    if ($d -gt 6) { return }
                    $p = [ref]$offset
                    $e = $offset + $length
                    $indent = "    " + ("  " * $d)
                    while ($p.Value -lt $e) {
                        [long]$tag = 0; [int]$shift = 0
                        do {
                            if ($p.Value -ge $data.Length) { return }
                            [byte]$b = $data[$p.Value]; $p.Value++
                            $tag = $tag -bor (([long]($b -band 0x7F)) -shl $shift); $shift += 7
                        } while (($b -band 0x80) -ne 0)
                        $fn = [int]($tag -shr 3); $wt = [int]($tag -band 7)
                        if ($fn -gt 500 -or $fn -lt 0) { return }
                        $path = if ($prefix) { "$prefix.f$fn" } else { "f$fn" }
                        switch ($wt) {
                            0 {
                                [long]$val = 0; $shift = 0
                                do {
                                    if ($p.Value -ge $data.Length) { return }
                                    [byte]$b = $data[$p.Value]; $p.Value++
                                    $val = $val -bor (([long]($b -band 0x7F)) -shl $shift); $shift += 7
                                } while (($b -band 0x80) -ne 0)
                                # Decoder aussi en zigzag (sint)
                                $zigzag = ($val -shr 1) -bxor (-($val -band 1))
                                $color = "Gray"
                                if ([Math]::Abs($zigzag) -gt 1000 -or $val -gt 1000) { $color = "Yellow" }
                                Write-Host "${indent}$path = $val (zigzag=$zigzag)" -ForegroundColor $color
                            }
                            1 {
                                if ($p.Value + 8 -gt $e) { return }
                                $val = [BitConverter]::ToInt64($data, $p.Value); $p.Value += 8
                                Write-Host "${indent}$path = $val (f64)" -ForegroundColor Gray
                            }
                            2 {
                                [long]$len = 0; $shift = 0
                                do {
                                    if ($p.Value -ge $data.Length) { return }
                                    [byte]$b = $data[$p.Value]; $p.Value++
                                    $len = $len -bor (([long]($b -band 0x7F)) -shl $shift); $shift += 7
                                } while (($b -band 0x80) -ne 0)
                                if ($len -lt 0 -or $p.Value + $len -gt $e) { return }
                                Write-Host "${indent}$path {$len bytes}" -ForegroundColor White
                                Full-Decode $data $p.Value ([int]$len) ($d + 1) $path
                                $p.Value += $len
                            }
                            5 {
                                if ($p.Value + 4 -gt $e) { return }
                                $val = [BitConverter]::ToInt32($data, $p.Value); $p.Value += 4
                                Write-Host "${indent}$path = $val (f32)" -ForegroundColor Gray
                            }
                            default { return }
                        }
                    }
                }
                
                Full-Decode $byteArr 0 $byteArr.Count 0 ""
            }
            
            if ($coyCount -ge 3) { break }
        }
    }
}

Write-Host "`n============================================" -ForegroundColor Cyan
Write-Host "  Le zigzag decode les sint32/sint64 protobuf." -ForegroundColor White
Write-Host "  Les prix sont probablement en zigzag encoding." -ForegroundColor White
Write-Host "  Cherchez les valeurs zigzag > 1000 qui" -ForegroundColor White
Write-Host "  correspondent aux prix affiches (6500000, etc.)" -ForegroundColor White
Write-Host "============================================" -ForegroundColor Cyan
