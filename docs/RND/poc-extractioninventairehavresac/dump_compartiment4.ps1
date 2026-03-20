# ============================================
#  DUMP BRUT COMPARTIMENT #4 (le plus gros)
#  H:\Code\Wakfuassistant\dump_compartiment4.ps1
# ============================================

$spyPath = "$env:APPDATA\zaap\gamesLogs\wakfu\logs\wakfu_spy.log"

# Extraire le contenu mhJ du csS
$csS_line = (Select-String -Path $spyPath -Pattern "Discarded inbound message csS@" | Select-Object -First 1).Line
$contenu = ""
if ($csS_line -match "mhJ=\[([^\]]+)\]") {
    $contenu = $Matches[1]
}

# Convertir bytes signes Java -> bytes non-signes
$signedBytes = $contenu -split ",\s*" | ForEach-Object { [int]$_.Trim() }
$bytes = [byte[]]::new($signedBytes.Count)
for ($i = 0; $i -lt $signedBytes.Count; $i++) {
    if ($signedBytes[$i] -lt 0) {
        $bytes[$i] = [byte](256 + $signedBytes[$i])
    } else {
        $bytes[$i] = [byte]$signedBytes[$i]
    }
}

Write-Host "  $($bytes.Count) octets total" -ForegroundColor Green

# --- FONCTIONS PROTOBUF ---
function Read-Varint {
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

function Dump-Protobuf {
    param([byte[]]$data, [int]$offset, [int]$length, [int]$depth = 0, [int]$maxDepth = 6)
    if ($depth -gt $maxDepth) { return }
    $pos = [ref]$offset
    $end = $offset + $length
    $indent = "  " * ($depth + 1)

    while ($pos.Value -lt $end) {
        $startPos = $pos.Value
        $tag = Read-Varint $data $pos
        if ($tag -lt 0) { break }

        $fieldNum = [int]($tag -shr 3)
        $wireType = [int]($tag -band 0x07)

        switch ($wireType) {
            0 { # Varint
                $val = Read-Varint $data $pos
                $color = "Gray"
                # Colorer les valeurs interessantes
                if ($val -gt 1000000000000000) { $color = "Yellow" }         # uniqueId potentiel
                elseif ($val -ge 1000 -and $val -le 99999) { $color = "Green" }  # refId potentiel
                elseif ($val -ge 1 -and $val -le 999) { $color = "Cyan" }     # qty potentielle
                Write-Host "${indent}[$startPos] f$fieldNum varint = $val" -ForegroundColor $color
            }
            1 { # Fixed64
                if ($pos.Value + 8 -gt $end) { $pos.Value = $end; break }
                $val = [BitConverter]::ToUInt64($data, $pos.Value)
                $pos.Value += 8
                $color = "Gray"
                if ($val -gt 1000000000000000) { $color = "Yellow" }
                Write-Host "${indent}[$startPos] f$fieldNum fixed64 = $val" -ForegroundColor $color
            }
            2 { # Length-delimited
                $len = Read-Varint $data $pos
                if ($len -lt 0 -or $pos.Value + $len -gt $end) { $pos.Value = $end; break }
                Write-Host "${indent}[$startPos] f$fieldNum bytes [$len bytes] {" -ForegroundColor White
                # Tenter de decoder comme sous-message protobuf
                $subStart = $pos.Value
                $subBytes = New-Object byte[] $len
                [Array]::Copy($data, $pos.Value, $subBytes, 0, $len)
                try {
                    Dump-Protobuf $data $subStart $len ($depth + 1) $maxDepth
                } catch {
                    # Si le decodage echoue, afficher les bytes bruts (max 50)
                    $preview = ($subBytes | Select-Object -First 50 | ForEach-Object { $_.ToString("X2") }) -join " "
                    Write-Host "${indent}  RAW: $preview..." -ForegroundColor DarkGray
                }
                Write-Host "${indent}}" -ForegroundColor White
                $pos.Value = $subStart + $len
            }
            5 { # Fixed32
                if ($pos.Value + 4 -gt $end) { $pos.Value = $end; break }
                $val = [BitConverter]::ToUInt32($data, $pos.Value)
                $pos.Value += 4
                Write-Host "${indent}[$startPos] f$fieldNum fixed32 = $val" -ForegroundColor Gray
            }
            default {
                Write-Host "${indent}[$startPos] f$fieldNum WIRE_TYPE_INCONNU=$wireType" -ForegroundColor Red
                $pos.Value = $end
            }
        }
    }
}

# --- DECODER LA RACINE POUR TROUVER LE COMPARTIMENT #4 ---
Write-Host "`n=== EXTRACTION COMPARTIMENT #4 (3863 bytes) ===" -ForegroundColor Cyan

$pos = [ref]0
$compCount = 0
while ($pos.Value -lt $bytes.Count) {
    $startPos = $pos.Value
    $tag = Read-Varint $bytes $pos
    if ($tag -lt 0) { break }
    $fieldNum = [int]($tag -shr 3)
    $wireType = [int]($tag -band 0x07)

    if ($wireType -eq 2) {
        $len = Read-Varint $bytes $pos
        if ($fieldNum -eq 1) {
            $compCount++
            if ($compCount -eq 4) {
                Write-Host "  Compartiment #4 trouve a offset $startPos, $len bytes" -ForegroundColor Green
                Write-Host ""
                Write-Host "=== DUMP COMPLET COMPARTIMENT #4 ===" -ForegroundColor Yellow
                Write-Host "(jaune=uniqueId potentiel, vert=refId potentiel, cyan=qty potentielle)" -ForegroundColor DarkGray
                Write-Host ""
                Dump-Protobuf $bytes $pos.Value $len 0 6
                Write-Host ""
                Write-Host "=== FIN DUMP ===" -ForegroundColor Yellow
                break
            }
        }
        $pos.Value += $len
    } elseif ($wireType -eq 0) {
        $val = Read-Varint $bytes $pos
    } elseif ($wireType -eq 1) {
        $pos.Value += 8
    } elseif ($wireType -eq 5) {
        $pos.Value += 4
    }
}

if ($compCount -lt 4) {
    Write-Host "  Seulement $compCount compartiments trouves" -ForegroundColor Red
}

# --- AUSSI DUMPER LE COMPARTIMENT #3 (1397 bytes) ---
Write-Host "`n=== DUMP COMPARTIMENT #3 (1397 bytes) - 50 premieres lignes ===" -ForegroundColor Cyan
$pos = [ref]0
$compCount = 0
$lineCount = 0
while ($pos.Value -lt $bytes.Count) {
    $startPos = $pos.Value
    $tag = Read-Varint $bytes $pos
    if ($tag -lt 0) { break }
    $fieldNum = [int]($tag -shr 3)
    $wireType = [int]($tag -band 0x07)

    if ($wireType -eq 2) {
        $len = Read-Varint $bytes $pos
        if ($fieldNum -eq 1) {
            $compCount++
            if ($compCount -eq 3) {
                Write-Host "  Compartiment #3 trouve, $len bytes" -ForegroundColor Green

                # Dump rapide (capturer dans une variable)
                $oldOut = [Console]::Out
                $sw = New-Object System.IO.StringWriter
                # On va juste decoder et afficher les 50 premieres lignes
                Dump-Protobuf $bytes $pos.Value ([Math]::Min($len, 500)) 0 4
                break
            }
        }
        $pos.Value += $len
    } elseif ($wireType -eq 0) {
        $val = Read-Varint $bytes $pos
    } elseif ($wireType -eq 1) {
        $pos.Value += 8
    } elseif ($wireType -eq 5) {
        $pos.Value += 4
    }
}

Write-Host "`n============================================" -ForegroundColor Cyan
Write-Host "  Copie TOUT le dump du compartiment #4" -ForegroundColor White
Write-Host "  C'est la qu'on va trouver les items" -ForegroundColor White
Write-Host "============================================" -ForegroundColor Cyan
