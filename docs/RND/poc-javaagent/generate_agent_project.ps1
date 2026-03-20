# =============================================================================
#  GENERATEUR DE PROJET JAVA AGENT POUR WAKFU
#  Cree un projet Maven complet avec Byte Buddy + Maven Wrapper
#  H:\Code\Wakfuassistant\docs\RND\poc-javaagent\generate_agent_project.ps1
# =============================================================================

$projectRoot = "H:\Code\Wakfuassistant\agent"
$groupId = "com.wakfuassistant"
$artifactId = "wakfu-spy-agent"
$version = "1.0.0"

Write-Host "============================================" -ForegroundColor Cyan
Write-Host "  GENERATION PROJET JAVA AGENT" -ForegroundColor Cyan
Write-Host "============================================" -ForegroundColor Cyan

# --- Nettoyage si existant ---
if (Test-Path $projectRoot) {
    Write-Host "  Suppression ancien projet..." -ForegroundColor Yellow
    Remove-Item -Path $projectRoot -Recurse -Force
}

# --- Structure des dossiers ---
$dirs = @(
    "$projectRoot\src\main\java\com\wakfuassistant\agent",
    "$projectRoot\src\main\resources",
    "$projectRoot\.mvn\wrapper"
)
foreach ($d in $dirs) {
    New-Item -ItemType Directory -Path $d -Force | Out-Null
}
Write-Host "  [OK] Structure des dossiers creee" -ForegroundColor Green

# =============================================================================
# POM.XML
# =============================================================================
$pomXml = @'
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
         http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.wakfuassistant</groupId>
    <artifactId>wakfu-spy-agent</artifactId>
    <version>1.0.0</version>
    <packaging>jar</packaging>

    <name>Wakfu Spy Agent</name>
    <description>Java Agent pour intercepter les messages Netty du client Wakfu</description>

    <properties>
        <maven.compiler.source>21</maven.compiler.source>
        <maven.compiler.target>21</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <byte-buddy.version>1.15.11</byte-buddy.version>
    </properties>

    <dependencies>
        <!-- Byte Buddy - Instrumentation bytecode -->
        <dependency>
            <groupId>net.bytebuddy</groupId>
            <artifactId>byte-buddy</artifactId>
            <version>${byte-buddy.version}</version>
        </dependency>
        <dependency>
            <groupId>net.bytebuddy</groupId>
            <artifactId>byte-buddy-agent</artifactId>
            <version>${byte-buddy.version}</version>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <!-- Compiler plugin -->
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.13.0</version>
                <configuration>
                    <source>21</source>
                    <target>21</target>
                </configuration>
            </plugin>

            <!-- JAR plugin avec manifest agent -->
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-jar-plugin</artifactId>
                <version>3.4.2</version>
                <configuration>
                    <archive>
                        <manifestEntries>
                            <Premain-Class>com.wakfuassistant.agent.WakfuSpyAgent</Premain-Class>
                            <Agent-Class>com.wakfuassistant.agent.WakfuSpyAgent</Agent-Class>
                            <Can-Redefine-Classes>true</Can-Redefine-Classes>
                            <Can-Retransform-Classes>true</Can-Retransform-Classes>
                            <Can-Set-Native-Method-Prefix>true</Can-Set-Native-Method-Prefix>
                        </manifestEntries>
                    </archive>
                </configuration>
            </plugin>

            <!-- Shade plugin pour creer un fat-jar avec Byte Buddy inclus -->
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-shade-plugin</artifactId>
                <version>3.6.0</version>
                <executions>
                    <execution>
                        <phase>package</phase>
                        <goals>
                            <goal>shade</goal>
                        </goals>
                        <configuration>
                            <createDependencyReducedPom>false</createDependencyReducedPom>
                            <transformers>
                                <transformer implementation="org.apache.maven.plugins.shade.resource.ManifestResourceTransformer">
                                    <manifestEntries>
                                        <Premain-Class>com.wakfuassistant.agent.WakfuSpyAgent</Premain-Class>
                                        <Agent-Class>com.wakfuassistant.agent.WakfuSpyAgent</Agent-Class>
                                        <Can-Redefine-Classes>true</Can-Redefine-Classes>
                                        <Can-Retransform-Classes>true</Can-Retransform-Classes>
                                        <Can-Set-Native-Method-Prefix>true</Can-Set-Native-Method-Prefix>
                                    </manifestEntries>
                                </transformer>
                            </transformers>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>
</project>
'@

$pomXml | Out-File -FilePath "$projectRoot\pom.xml" -Encoding UTF8
Write-Host "  [OK] pom.xml" -ForegroundColor Green

# =============================================================================
# CLASSE PRINCIPALE - WakfuSpyAgent.java
# =============================================================================
$agentJava = @'
package com.wakfuassistant.agent;

import java.lang.instrument.Instrumentation;
import java.io.*;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Point d'entree du Java Agent pour Wakfu.
 * 
 * Cet agent s'injecte dans la JVM du client Wakfu au demarrage
 * et intercepte les methodes de traitement des messages Netty
 * pour logger les donnees completes (prix HDV, inventaires, etc.)
 * 
 * Utilisation:
 *   java -javaagent:wakfu-spy-agent.jar [options client Wakfu]
 * 
 * Les logs sont ecrits dans:
 *   H:\Code\Wakfuassistant\agent\logs\wakfu_agent_spy.log
 */
public class WakfuSpyAgent {

    public static final String LOG_DIR = "H:\\Code\\Wakfuassistant\\agent\\logs";
    public static final String LOG_FILE = LOG_DIR + "\\wakfu_agent_spy.log";
    
    private static PrintWriter logWriter;
    private static final DateTimeFormatter TIME_FMT = 
        DateTimeFormatter.ofPattern("HH:mm:ss.SSS");

    /**
     * Premain: appele au demarrage de la JVM via -javaagent
     */
    public static void premain(String agentArgs, Instrumentation inst) {
        initialize("premain", agentArgs, inst);
    }

    /**
     * Agentmain: appele lors d'un attach dynamique
     */
    public static void agentmain(String agentArgs, Instrumentation inst) {
        initialize("agentmain", agentArgs, inst);
    }

    private static void initialize(String mode, String agentArgs, Instrumentation inst) {
        try {
            // Creer le dossier de logs
            Files.createDirectories(Paths.get(LOG_DIR));
            
            // Ouvrir le fichier de log (append)
            logWriter = new PrintWriter(
                new BufferedWriter(new FileWriter(LOG_FILE, true)), true);
            
            log("========================================");
            log("WAKFU SPY AGENT DEMARRE (mode: " + mode + ")");
            log("Agent args: " + agentArgs);
            log("Java version: " + System.getProperty("java.version"));
            log("========================================");

            // Lister les classes deja chargees pour reperer les patterns
            log("Classes deja chargees: " + inst.getAllLoadedClasses().length);
            
            // Enregistrer notre transformeur de classes
            MessageInterceptorTransformer transformer = new MessageInterceptorTransformer();
            inst.addTransformer(transformer, true);
            
            log("Transformer enregistre - en attente des classes Wakfu...");
            
            // Aussi logger les classes qui se chargent pour la phase de decouverte
            ClassDiscoveryTransformer discovery = new ClassDiscoveryTransformer();
            inst.addTransformer(discovery, false);
            
            log("Discovery transformer enregistre");
            log("Agent pret. Interception active.");

        } catch (Exception e) {
            System.err.println("[WakfuSpyAgent] ERREUR initialisation: " + e.getMessage());
            e.printStackTrace();
            if (logWriter != null) {
                logWriter.println("ERREUR: " + e.getMessage());
                e.printStackTrace(logWriter);
            }
        }
    }

    /**
     * Log un message avec timestamp
     */
    public static void log(String message) {
        String ts = LocalDateTime.now().format(TIME_FMT);
        String line = "[" + ts + "] " + message;
        
        if (logWriter != null) {
            logWriter.println(line);
            logWriter.flush();
        }
        // Aussi dans la console pour debug
        System.out.println("[WakfuSpy] " + line);
    }

    /**
     * Log des donnees d'interception (messages Netty)
     */
    public static void logMessage(String msgType, String className, 
                                   String methodName, Object[] args, 
                                   Object result) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("MSG|").append(msgType);
            sb.append("|class=").append(className);
            sb.append("|method=").append(methodName);
            
            if (args != null) {
                sb.append("|args=[");
                for (int i = 0; i < args.length; i++) {
                    if (i > 0) sb.append(", ");
                    sb.append(safeToString(args[i]));
                }
                sb.append("]");
            }
            
            if (result != null) {
                sb.append("|result=").append(safeToString(result));
            }
            
            log(sb.toString());
        } catch (Exception e) {
            log("ERREUR logMessage: " + e.getMessage());
        }
    }

    /**
     * Log un champ specifique d'un message (refId, uniqueId, prix, etc.)
     */
    public static void logField(String context, String fieldName, Object value) {
        log("FIELD|" + context + "|" + fieldName + "=" + safeToString(value));
    }

    /**
     * ToString securise qui ne plante pas (contrairement au client Wakfu!)
     */
    private static String safeToString(Object obj) {
        if (obj == null) return "null";
        try {
            String s = obj.toString();
            // Tronquer si trop long
            if (s.length() > 2000) {
                return s.substring(0, 2000) + "...(tronque, total=" + s.length() + ")";
            }
            return s;
        } catch (Exception e) {
            // C'est exactement le probleme qu'on avait avec csC=ERROR!
            return "[toString ERREUR: " + e.getClass().getSimpleName() + ": " + e.getMessage() 
                   + "] class=" + obj.getClass().getName();
        }
    }
}
'@

$agentJava | Out-File -FilePath "$projectRoot\src\main\java\com\wakfuassistant\agent\WakfuSpyAgent.java" -Encoding UTF8
Write-Host "  [OK] WakfuSpyAgent.java" -ForegroundColor Green

# =============================================================================
# DISCOVERY TRANSFORMER - Phase 1: decouvrir les classes Wakfu
# =============================================================================
$discoveryJava = @'
package com.wakfuassistant.agent;

import java.lang.instrument.ClassFileTransformer;
import java.security.ProtectionDomain;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Phase 1: Decouverte des classes.
 * 
 * Ce transformer ne modifie RIEN. Il observe simplement quelles classes
 * sont chargees et logue celles qui sont liees au reseau Netty,
 * aux messages, a l'inventaire, au HDV, etc.
 * 
 * Ca nous permet de decouvrir les noms de classes obfusques du client Wakfu
 * sans risquer de casser quoi que ce soit.
 */
public class ClassDiscoveryTransformer implements ClassFileTransformer {

    // Patterns de classes interessantes
    private static final String[] INTERESTING_PATTERNS = {
        // Reseau et messages
        "netty", "message", "Message", "handler", "Handler",
        "channel", "Channel", "pipeline", "Pipeline",
        "packet", "Packet", "codec", "Codec",
        // Inventaire et items  
        "inventory", "Inventory", "storage", "Storage",
        "item", "Item", "bag", "Bag", "chest", "Chest",
        "equipment", "Equipment",
        // Commerce HDV
        "market", "Market", "auction", "Auction",
        "trade", "Trade", "commerce", "Commerce",
        "exchange", "Exchange", "offer", "Offer",
        // Wakfu specifique
        "ankamagames", "wakfu",
        // Operations
        "operation", "Operation", "transaction", "Transaction",
        // Protobuf
        "protobuf", "Protobuf", "proto", "Proto",
        "serialize", "Serialize", "deserialize", "Deserialize"
    };

    // Eviter de logger la meme classe 100 fois
    private final ConcurrentHashMap<String, Boolean> seen = new ConcurrentHashMap<>();
    
    // Compteur pour limiter le spam
    private int totalLogged = 0;
    private int totalSkipped = 0;

    @Override
    public byte[] transform(ClassLoader loader, String className,
                           Class<?> classBeingRedefined,
                           ProtectionDomain protectionDomain,
                           byte[] classfileBuffer) {
        
        if (className == null) return null;
        
        // Convertir le format interne (com/foo/Bar) en format normal (com.foo.Bar)
        String dotName = className.replace('/', '.');
        
        // Verifier si c'est une classe interessante
        boolean interesting = false;
        String matchedPattern = null;
        
        for (String pattern : INTERESTING_PATTERNS) {
            if (dotName.toLowerCase().contains(pattern.toLowerCase())) {
                interesting = true;
                matchedPattern = pattern;
                break;
            }
        }
        
        // Les classes Ankama sont toujours interessantes
        if (dotName.startsWith("com.ankamagames")) {
            interesting = true;
            matchedPattern = "ankamagames";
        }
        
        // Les classes a 2-3 lettres (obfusquees) avec certains patterns dans le bytecode
        if (!interesting && dotName.length() <= 4 && !dotName.contains(".")) {
            // Classe obfusquee de premier niveau - potentiellement un message Netty
            interesting = true;
            matchedPattern = "obfuscated-short";
        }
        
        if (interesting && !seen.containsKey(dotName)) {
            seen.put(dotName, true);
            totalLogged++;
            
            // Analyser le bytecode pour des indices supplementaires
            String hints = analyzeClassBytes(classfileBuffer, dotName);
            
            WakfuSpyAgent.log("DISCOVERY|" + dotName 
                + "|pattern=" + matchedPattern 
                + "|size=" + (classfileBuffer != null ? classfileBuffer.length : 0)
                + (hints.isEmpty() ? "" : "|hints=" + hints));
            
            // Toutes les 100 classes, un recap
            if (totalLogged % 100 == 0) {
                WakfuSpyAgent.log("DISCOVERY STATS|logged=" + totalLogged 
                    + "|unique=" + seen.size() 
                    + "|skipped=" + totalSkipped);
            }
        } else if (!interesting) {
            totalSkipped++;
        }
        
        // IMPORTANT: retourner null = ne pas modifier la classe
        return null;
    }

    /**
     * Analyse superficielle du bytecode pour trouver des indices.
     * On cherche des strings connues dans le constant pool.
     */
    private String analyzeClassBytes(byte[] bytes, String className) {
        if (bytes == null || bytes.length < 100) return "";
        
        // Convertir en string pour chercher des patterns
        // (les strings Java sont dans le constant pool en UTF8)
        StringBuilder hints = new StringBuilder();
        
        try {
            String asText = new String(bytes, "ISO-8859-1");
            
            // Chercher des noms de champs/methodes connus
            String[] knownFields = {
                "refId", "uniqueId", "m_refId", "m_uniqueId",
                "m_qty", "m_bagId", "m_posInBag",
                "AddItemOperation", "RemoveItemOperation",
                "StorageContent", "InventoryContent",
                "MarketEntry", "AuctionBid",
                "toString", "serialize", "deserialize",
                "channelRead", "messageReceived",
                "m_price", "m_kamas", "m_sellerId"
            };
            
            for (String field : knownFields) {
                if (asText.contains(field)) {
                    if (hints.length() > 0) hints.append(",");
                    hints.append(field);
                }
            }
        } catch (Exception e) {
            // Silencieux
        }
        
        return hints.toString();
    }
}
'@

$discoveryJava | Out-File -FilePath "$projectRoot\src\main\java\com\wakfuassistant\agent\ClassDiscoveryTransformer.java" -Encoding UTF8
Write-Host "  [OK] ClassDiscoveryTransformer.java" -ForegroundColor Green

# =============================================================================
# MESSAGE INTERCEPTOR - Phase 2: intercepter les messages Netty
# =============================================================================
$interceptorJava = @'
package com.wakfuassistant.agent;

import java.lang.instrument.ClassFileTransformer;
import java.security.ProtectionDomain;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Phase 2: Interception des messages.
 * 
 * Ce transformer cible les classes de messages Netty du client Wakfu.
 * Pour la V1, on fait de la decouverte passive (on ne modifie pas encore
 * le bytecode). La modification viendra dans la V2 une fois qu'on aura
 * identifie les bonnes classes grace au ClassDiscoveryTransformer.
 * 
 * Classes cibles potentielles (basees sur nos logs):
 * - csf = AddItemOperation (retrait coffre)
 * - cso = item move (depot coffre)
 * - coy = offre HDV
 * - cwj = detail merchant HDV
 * - cmm = mes offres HDV
 * - cmb = recuperation kamas
 * - ctu = solde kamas
 * - csS = sync stockage login
 * - ctE = donnees personnage
 */
public class MessageInterceptorTransformer implements ClassFileTransformer {

    // Classes qu'on veut surveiller (sera peuple par la phase de decouverte)
    private final ConcurrentHashMap<String, String> targetClasses = new ConcurrentHashMap<>();

    public MessageInterceptorTransformer() {
        // Pour la V1, on ne cible rien encore.
        // La phase de decouverte va nous dire quelles classes cibler.
        // Ensuite on remplira cette map.
        WakfuSpyAgent.log("MessageInterceptorTransformer initialise (mode decouverte V1)");
    }

    @Override
    public byte[] transform(ClassLoader loader, String className,
                           Class<?> classBeingRedefined,
                           ProtectionDomain protectionDomain,
                           byte[] classfileBuffer) {
        
        if (className == null) return null;
        
        String dotName = className.replace('/', '.');
        
        // V1: On ne modifie rien, on fait juste de la decouverte
        // V2: On utilisera Byte Buddy pour instrumenter les classes cibles
        
        if (targetClasses.containsKey(dotName)) {
            WakfuSpyAgent.log("TARGET CLASS LOADED: " + dotName 
                + " (" + targetClasses.get(dotName) + ")");
        }
        
        return null;
    }
}
'@

$interceptorJava | Out-File -FilePath "$projectRoot\src\main\java\com\wakfuassistant\agent\MessageInterceptorTransformer.java" -Encoding UTF8
Write-Host "  [OK] MessageInterceptorTransformer.java" -ForegroundColor Green

# =============================================================================
# MAVEN WRAPPER
# =============================================================================

# maven-wrapper.properties
$wrapperProps = @'
distributionUrl=https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/3.9.9/apache-maven-3.9.9-bin.zip
wrapperUrl=https://repo.maven.apache.org/maven2/org/apache/maven/wrapper/maven-wrapper/3.3.2/maven-wrapper-3.3.2.jar
'@
$wrapperProps | Out-File -FilePath "$projectRoot\.mvn\wrapper\maven-wrapper.properties" -Encoding UTF8

# mvnw.cmd (Maven Wrapper pour Windows)
$mvnwCmd = @'
@REM Maven Wrapper pour Windows
@REM Telecharge Maven automatiquement si necessaire
@echo off
setlocal

set MAVEN_PROJECTBASEDIR=%~dp0
set WRAPPER_JAR="%MAVEN_PROJECTBASEDIR%.mvn\wrapper\maven-wrapper.jar"
set WRAPPER_URL="https://repo.maven.apache.org/maven2/org/apache/maven/wrapper/maven-wrapper/3.3.2/maven-wrapper-3.3.2.jar"

if not exist %WRAPPER_JAR% (
    echo Telechargement du Maven Wrapper...
    powershell -Command "Invoke-WebRequest -Uri %WRAPPER_URL% -OutFile %WRAPPER_JAR%"
)

set MAVEN_OPTS=-Xmx512m

"%JAVA_HOME%\bin\java.exe" %MAVEN_OPTS% ^
  -classpath %WRAPPER_JAR% ^
  org.apache.maven.wrapper.MavenWrapperMain %*
'@
$mvnwCmd | Out-File -FilePath "$projectRoot\mvnw.cmd" -Encoding ASCII
Write-Host "  [OK] mvnw.cmd (Maven Wrapper)" -ForegroundColor Green

# =============================================================================
# SCRIPT DE BUILD
# =============================================================================
$buildScript = @'
@echo off
echo ============================================
echo   BUILD WAKFU SPY AGENT
echo ============================================
echo.

cd /d "%~dp0"

echo [1/3] Compilation...
call mvnw.cmd clean package -q
if errorlevel 1 (
    echo.
    echo ERREUR de compilation! Verifiez les messages ci-dessus.
    pause
    exit /b 1
)

echo [2/3] Copie du JAR...
if exist "target\wakfu-spy-agent-1.0.0.jar" (
    copy /Y "target\wakfu-spy-agent-1.0.0.jar" "wakfu-spy-agent.jar" >nul
    echo   JAR: %~dp0wakfu-spy-agent.jar
) else (
    echo   ERREUR: JAR non trouve dans target\
    pause
    exit /b 1
)

echo [3/3] Verification...
"%JAVA_HOME%\bin\jar.exe" tf wakfu-spy-agent.jar | findstr "WakfuSpyAgent.class" >nul
if errorlevel 1 (
    echo   ERREUR: WakfuSpyAgent.class absent du JAR!
    pause
    exit /b 1
)

echo.
echo ============================================
echo   BUILD REUSSI!
echo   JAR: %~dp0wakfu-spy-agent.jar
echo ============================================
echo.
echo Pour lancer Wakfu avec l'agent:
echo   H:\Code\Wakfuassistant\agent\launch_wakfu_with_agent.bat
echo.
pause
'@
$buildScript | Out-File -FilePath "$projectRoot\build.bat" -Encoding ASCII
Write-Host "  [OK] build.bat" -ForegroundColor Green

# =============================================================================
# SCRIPT DE LANCEMENT WAKFU + AGENT
# =============================================================================
$launchScript = @'
@echo off
echo ============================================
echo   LANCEMENT WAKFU AVEC SPY AGENT
echo ============================================
echo.

set AGENT_JAR=H:\Code\Wakfuassistant\agent\wakfu-spy-agent.jar

if not exist "%AGENT_JAR%" (
    echo ERREUR: Agent JAR non trouve!
    echo Lancez d'abord: H:\Code\Wakfuassistant\agent\build.bat
    pause
    exit /b 1
)

echo [1] Definition de JAVA_TOOL_OPTIONS...
set JAVA_TOOL_OPTIONS=-javaagent:%AGENT_JAR%

echo   JAVA_TOOL_OPTIONS=%JAVA_TOOL_OPTIONS%
echo.
echo [2] Lancement du launcher Ankama...
echo   Le launcher va demarrer Wakfu avec notre agent injecte.
echo   Les logs de l'agent seront dans:
echo     H:\Code\Wakfuassistant\agent\logs\wakfu_agent_spy.log
echo.
echo   IMPORTANT: Fermez cette fenetre APRES avoir lance Wakfu
echo   (elle maintient la variable JAVA_TOOL_OPTIONS active)
echo.

start "" "G:\ankama\Ankama Launcher.exe"

echo.
echo [3] En attente... Lancez Wakfu depuis le launcher Ankama.
echo   Appuyez sur une touche APRES avoir lance le jeu pour
echo   surveiller les logs en temps reel.
echo.
pause

echo.
echo [4] Surveillance des logs (Ctrl+C pour arreter)...
echo.

if exist "H:\Code\Wakfuassistant\agent\logs\wakfu_agent_spy.log" (
    powershell -Command "Get-Content 'H:\Code\Wakfuassistant\agent\logs\wakfu_agent_spy.log' -Wait -Tail 50"
) else (
    echo   Log pas encore cree - le jeu n'est peut-etre pas encore lance.
    echo   Verifiez dans quelques instants:
    echo     H:\Code\Wakfuassistant\agent\logs\wakfu_agent_spy.log
    pause
)
'@
$launchScript | Out-File -FilePath "$projectRoot\launch_wakfu_with_agent.bat" -Encoding ASCII
Write-Host "  [OK] launch_wakfu_with_agent.bat" -ForegroundColor Green

# =============================================================================
# README
# =============================================================================
$readme = @'
# Wakfu Spy Agent

## Qu'est-ce que c'est ?
Un Java Agent qui s'injecte dans le client Wakfu pour intercepter
les messages reseau Netty AVANT qu'ils ne soient consommes par le client.

## Pourquoi ?
Le client Wakfu logue les messages Netty dans wakfu_spy.log mais:
- Le toString() plante sur certains messages (csC=ERROR, cvn=ERROR)
- Les prix HDV ne sont pas logues (consommes par le handler avant le log)
- Les depots au coffre n'ont que le uniqueId (pas le refId)

Notre agent intercepte les donnees COMPLETES.

## Comment compiler ?
Copy
H:\Code\Wakfuassistant\agent\build.bat


## Comment lancer ?
H:\Code\Wakfuassistant\agent\launch_wakfu_with_agent.bat


## Architecture
- WakfuSpyAgent.java      : Point d'entree (premain/agentmain)
- ClassDiscoveryTransformer: Phase 1 - decouvre les classes Wakfu
- MessageInterceptorTransformer: Phase 2 - intercepte les messages (V2)

## Logs
Les logs sont dans: H:\Code\Wakfuassistant\agent\logs\wakfu_agent_spy.log

## Phase 1 (actuelle): Decouverte
L'agent observe quelles classes sont chargees et identifie celles
liees aux messages, inventaires, HDV, etc. sans rien modifier.

## Phase 2 (a venir): Interception
Une fois les bonnes classes identifiees, on utilisera Byte Buddy
pour instrumenter les methodes de decodage des messages.
'@
$readme | Out-File -FilePath "$projectRoot\README.md" -Encoding UTF8
Write-Host "  [OK] README.md" -ForegroundColor Green

# =============================================================================
# STRUCTURE FINALE
# =============================================================================
Write-Host "`n============================================" -ForegroundColor Cyan
Write-Host "  PROJET GENERE AVEC SUCCES" -ForegroundColor Cyan
Write-Host "============================================" -ForegroundColor Cyan
Write-Host "  Chemin: $projectRoot" -ForegroundColor White

Write-Host "`n  Structure:" -ForegroundColor Yellow
Get-ChildItem -Path $projectRoot -Recurse -File | ForEach-Object {
    $rel = $_.FullName.Replace("$projectRoot\", "")
    $size = if ($_.Length -gt 1024) { "$([Math]::Round($_.Length/1024, 1))KB" } else { "$($_.Length)B" }
    Write-Host "    $rel ($size)" -ForegroundColor DarkCyan
}

Write-Host "`n  PROCHAINES ETAPES:" -ForegroundColor Yellow
Write-Host "  1. Compiler:  cd H:\Code\Wakfuassistant\agent && .\build.bat" -ForegroundColor White
Write-Host "  2. Lancer:    H:\Code\Wakfuassistant\agent\launch_wakfu_with_agent.bat" -ForegroundColor White
Write-Host "  3. Logs:      H:\Code\Wakfuassistant\agent\logs\wakfu_agent_spy.log" -ForegroundColor White
Write-Host "============================================" -ForegroundColor Cyan