# Prompt
Import-Module posh-git
Import-Module -Name Terminal-Icons

# oh-my-posh init pwsh --config "C:\Users\ericp\Documents\WindowsPowerShell\themesatomic.omp.json" | Invoke-Expression

# Set Theme
$omp_config = Join-Path $PSScriptRoot ".\themesatomic.omp.json"
oh-my-posh --init --shell pwsh --config $omp_config | Invoke-Expression

# Alias
Set-Alias ll ls
Set-Alias g git
Set-Alias v nvim
Set-Alias .. 'cd..'
Set-Alias grep findstr

# Utilities
function which ($command) {
  Get-Command -Name $command -ErrorAction SilentlyContinue |
    Select-Object -ExpandProperty Path -ErrorAction SilentlyContinue
}