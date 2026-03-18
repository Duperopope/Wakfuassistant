param(
    [string]$GeminiCredsPath = "C:\Users\Smedj\.gemini\oauth_creds.json",
    [string]$AuthProfilesPath = "C:\Users\Smedj\.openclaw\agents\main\agent\auth-profiles.json",
    [string]$ChangelogPath = "H:\Code\Wakfuassistant\CHANGELOG.md"
)

$ErrorActionPreference = "Stop"

function Write-ChangeLog {
    param(
        [string]$Message,
        [string]$Level = "INFO"
    )

    $timestamp = (Get-Date).ToString("yyyy-MM-dd HH:mm:ss")
    $line = "- [$timestamp] [$Level] $Message"

    if (Test-Path $ChangelogPath) {
        $backup = "$ChangelogPath.$((Get-Date).ToString('yyyyMMdd-HHmmss')).bak"
        Copy-Item $ChangelogPath $backup -Force
    }

    Add-Content -Path $ChangelogPath -Value $line -Encoding UTF8
}

function Get-GeminiClientConfig {
    $clientId = $env:OPENCLAW_GEMINI_OAUTH_CLIENT_ID
    if (-not $clientId) { $clientId = $env:GEMINI_CLI_OAUTH_CLIENT_ID }

    $clientSecret = $env:OPENCLAW_GEMINI_OAUTH_CLIENT_SECRET
    if (-not $clientSecret) { $clientSecret = $env:GEMINI_CLI_OAUTH_CLIENT_SECRET }

    if ($clientId) {
        return @{
            client_id = $clientId
            client_secret = $clientSecret
        }
    }

    $geminiCmd = (Get-Command gemini -ErrorAction SilentlyContinue).Source
    if (-not $geminiCmd) {
        throw "Gemini CLI introuvable dans PATH (commande gemini)."
    }

    $resolved = (Resolve-Path $geminiCmd).Path
        $geminiBinDir = Split-Path $resolved -Parent
        $globalNpmRoot = Join-Path $geminiBinDir "node_modules"
        $geminiCliDirs = @(
            (Join-Path $globalNpmRoot "@google\gemini-cli"),
            (Join-Path (Split-Path $globalNpmRoot -Parent) "node_modules\@google\gemini-cli"),
            (Join-Path (Split-Path $globalNpmRoot -Parent) "lib\node_modules\@google\gemini-cli")
        ) | Select-Object -Unique

        $candidates = @()
        foreach ($dir in $geminiCliDirs) {
            $candidates += @(
                (Join-Path $dir "node_modules\@google\gemini-cli-core\dist\src\code_assist\oauth2.js"),
                (Join-Path $dir "node_modules\@google\gemini-cli-core\dist\code_assist\oauth2.js"),
                (Join-Path $dir "dist\src\code_assist\oauth2.js"),
                (Join-Path $dir "dist\code_assist\oauth2.js")
            )
        }

    $oauthFile = $candidates | Where-Object { Test-Path $_ } | Select-Object -First 1
    if (-not $oauthFile) {
        throw "Impossible de trouver oauth2.js pour extraire client_id/client_secret Gemini CLI."
    }

    $content = Get-Content $oauthFile -Raw
    $idMatch = [regex]::Match($content, "(\d+-[a-z0-9]+\.apps\.googleusercontent\.com)")
    $secretMatch = [regex]::Match($content, "(GOCSPX-[A-Za-z0-9_-]+)")

    if (-not $idMatch.Success) {
        throw "client_id Gemini introuvable dans oauth2.js"
    }

    $config = @{ client_id = $idMatch.Groups[1].Value }
    if ($secretMatch.Success) {
        $config.client_secret = $secretMatch.Groups[1].Value
    }

    return $config
}

try {
    if (-not (Test-Path $GeminiCredsPath)) {
        throw "Fichier credentials Gemini introuvable: $GeminiCredsPath"
    }
    if (-not (Test-Path $AuthProfilesPath)) {
        throw "Fichier auth profiles introuvable: $AuthProfilesPath"
    }

    $creds = Get-Content $GeminiCredsPath -Raw | ConvertFrom-Json
    if (-not $creds.refresh_token) {
        throw "refresh_token absent dans $GeminiCredsPath"
    }

    $clientConfig = Get-GeminiClientConfig

    $body = @{
        grant_type = "refresh_token"
        refresh_token = [string]$creds.refresh_token
        client_id = [string]$clientConfig.client_id
    }
    if ($clientConfig.client_secret) {
        $body.client_secret = [string]$clientConfig.client_secret
    }

    $response = Invoke-RestMethod -Method Post -Uri "https://oauth2.googleapis.com/token" -ContentType "application/x-www-form-urlencoded" -Body $body
    if (-not $response.access_token) {
        throw "Aucun access_token recu depuis oauth2.googleapis.com/token"
    }

    $authBackup = "$AuthProfilesPath.$((Get-Date).ToString('yyyyMMdd-HHmmss')).bak"
    Copy-Item $AuthProfilesPath $authBackup -Force

    $auth = Get-Content $AuthProfilesPath -Raw | ConvertFrom-Json
    $profileId = "google-gemini-cli:gemini-cli"

    if (-not $auth.profiles) {
        $auth | Add-Member -NotePropertyName profiles -NotePropertyValue ([pscustomobject]@{})
    }

    if (-not ($auth.profiles.PSObject.Properties.Name -contains $profileId)) {
        $auth.profiles | Add-Member -NotePropertyName $profileId -NotePropertyValue ([pscustomobject]@{
            type = "token"
            provider = "google-gemini-cli"
            token = [string]$response.access_token
        })
    } else {
        $auth.profiles.$profileId.token = [string]$response.access_token
    }

    $authJson = $auth | ConvertTo-Json -Depth 30
    [System.IO.File]::WriteAllText($AuthProfilesPath, $authJson, (New-Object System.Text.UTF8Encoding($false)))

    $tokenPreview = ([string]$response.access_token)
    if ($tokenPreview.Length -gt 14) {
        $tokenPreview = $tokenPreview.Substring(0, 7) + "..." + $tokenPreview.Substring($tokenPreview.Length - 7)
    }

    Write-ChangeLog -Message "Gemini token refresh reussi. Profil mis a jour: $profileId (token=$tokenPreview). Backup auth: $authBackup" -Level "INFO"
    Write-Output "OK: token Gemini rafraichi et auth-profiles mis a jour."
}
catch {
    Write-ChangeLog -Message "Gemini token refresh echoue: $($_.Exception.Message)" -Level "ERROR"
    Write-Error $_.Exception.Message
    exit 1
}
