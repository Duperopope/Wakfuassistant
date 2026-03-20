$spyPath = "$env:APPDATA\zaap\gamesLogs\wakfu\logs\wakfu_spy.log"

Write-Host "============================================" -ForegroundColor Cyan
Write-Host "  DUMP BRUT - TOUS LES MESSAGES NETTY" -ForegroundColor Cyan
Write-Host "============================================" -ForegroundColor Cyan
Write-Host "  Entre dans le Havre-sac, depose 1 objet." -ForegroundColor White
Write-Host "  Ctrl+C pour arreter." -ForegroundColor White
Write-Host ""

$lastSize = (Get-Item $spyPath).Length
$inHavreSac = $false

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
    foreach ($ligne in ($newContent -split "`n")) {
        if ($ligne -match "DimensionalBag\.initializeToEnter") {
            $inHavreSac = $true
            Write-Host "`n=== HAVRE-SAC ===" -ForegroundColor Cyan
        }
        if ($ligne -match "PERSONAL_SPACE_LEAVE") {
            $inHavreSac = $false
            Write-Host "=== SORTIE ===" -ForegroundColor Cyan
        }
        if ($inHavreSac -and $ligne -match "Discarded inbound message (\w+)@\w+\{(.+?)\}\s*that") {
            $type = $Matches[1]
            $contenu = $Matches[2]
            $ts = ""; if ($ligne -match "^.{5} ([\d:,]+)") { $ts = $Matches[1] }
            
            # Ignorer le bruit (chat, guild, pipeline repeat)
            if ($type -match "^(NM|NS|GuildChangeMessage)$") { continue }
            if ($contenu -match "DefaultChannelPipeline:1198") { continue }
            
            # Colorier selon le type
            $color = "Gray"
            if ($contenu -match "AddItemOperation") { $color = "Green" }
            if ($type -eq "cso") { $color = "Red" }
            if ($type -eq "csf") { $color = "Yellow" }
            if ($type -eq "csE" -or $type -eq "csC") { $color = "DarkCyan" }
            
            Write-Host "[$ts] $type => $contenu" -ForegroundColor $color
        }
    }
}
