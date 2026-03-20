# =============================================================================
#  GENERATEUR AGENT V3 - INTERCEPTION REELLE avec Byte Buddy
#  H:\Code\Wakfuassistant\docs\RND\poc-javaagent\generate_agent_v3.ps1
# =============================================================================

$projectRoot = "H:\Code\Wakfuassistant\agent"

Write-Host "============================================" -ForegroundColor Cyan
Write-Host "  GENERATION AGENT V3 - BYTE BUDDY" -ForegroundColor Cyan
Write-Host "============================================" -ForegroundColor Cyan

# =============================================================================
# WakfuSpyAgent V3 - avec Byte Buddy instrumentation
# =============================================================================
$agentV3 = @'
package com.wakfuassistant.agent;

import net.bytebuddy.agent.builder.AgentBuilder;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.matcher.ElementMatchers;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.DynamicType;
import net.bytebuddy.utility.JavaModule;

import java.lang.instrument.Instrumentation;
import java.io.*;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class WakfuSpyAgent {

    public static final String LOG_DIR = "H:\\Code\\Wakfuassistant\\agent\\logs";
    public static final String LOG_FILE = LOG_DIR + "\\wakfu_agent_spy.log";
    public static final String MSG_LOG_FILE = LOG_DIR + "\\wakfu_messages.log";
    public static final String HDV_LOG_FILE = LOG_DIR + "\\wakfu_hdv.log";
    
    private static PrintWriter logWriter;
    private static PrintWriter msgWriter;
    private static PrintWriter hdvWriter;
    
    private static final DateTimeFormatter TIME_FMT = 
        DateTimeFormatter.ofPattern("HH:mm:ss.SSS");

    public static final AtomicLong messageCount = new AtomicLong(0);
    public static final ConcurrentHashMap<String, AtomicLong> messageTypeCounts = 
        new ConcurrentHashMap<>();

    public static void premain(String agentArgs, Instrumentation inst) {
        initialize("premain", agentArgs, inst);
    }

    public static void agentmain(String agentArgs, Instrumentation inst) {
        initialize("agentmain", agentArgs, inst);
    }

    private static void initialize(String mode, String agentArgs, Instrumentation inst) {
        try {
            Files.createDirectories(Paths.get(LOG_DIR));
            
            logWriter = new PrintWriter(new BufferedWriter(new FileWriter(LOG_FILE, true)), true);
            msgWriter = new PrintWriter(new BufferedWriter(new FileWriter(MSG_LOG_FILE, true)), true);
            hdvWriter = new PrintWriter(new BufferedWriter(new FileWriter(HDV_LOG_FILE, true)), true);

            log("========================================");
            log("WAKFU SPY AGENT V3 DEMARRE (mode: " + mode + ")");
            log("Java version: " + System.getProperty("java.version"));
            log("========================================");

            // Phase 1: Discovery (passif)
            ClassDiscoveryTransformer discovery = new ClassDiscoveryTransformer();
            inst.addTransformer(discovery, false);
            log("Phase 1: Discovery transformer OK");

            // Phase 2: Byte Buddy - Instrumenter aDj.channelRead0
            installByteBuddyInterceptors(inst);
            log("Phase 2: Byte Buddy interceptors OK");

            // Phase 3: Runtime scanner elargi
            RuntimeInterceptorV3 runtime = new RuntimeInterceptorV3(inst);
            runtime.start();
            log("Phase 3: Runtime scanner V3 OK");

            log("Agent V3 pret. Interception ACTIVE.");
            log("Logs: " + MSG_LOG_FILE);

        } catch (Exception e) {
            System.err.println("[WakfuSpyAgent V3] ERREUR: " + e.getMessage());
            e.printStackTrace();
            if (logWriter != null) {
                logWriter.println("INIT ERROR: " + e.getMessage());
                e.printStackTrace(logWriter);
            }
        }
    }

    private static void installByteBuddyInterceptors(Instrumentation inst) {
        log("Installation Byte Buddy...");

        AgentBuilder.Listener listener = new AgentBuilder.Listener() {
            @Override
            public void onDiscovery(String typeName, ClassLoader classLoader, JavaModule module, boolean loaded) {}
            
            @Override
            public void onTransformation(TypeDescription typeDescription, ClassLoader classLoader, JavaModule module, boolean loaded, DynamicType dynamicType) {
                log("BYTE BUDDY TRANSFORMED: " + typeDescription.getName());
            }
            
            @Override
            public void onIgnored(TypeDescription typeDescription, ClassLoader classLoader, JavaModule module, boolean loaded) {}
            
            @Override
            public void onError(String typeName, ClassLoader classLoader, JavaModule module, boolean loaded, Throwable throwable) {
                log("BYTE BUDDY ERROR: " + typeName + " - " + throwable.getMessage());
            }
            
            @Override
            public void onComplete(String typeName, ClassLoader classLoader, JavaModule module, boolean loaded) {}
        };

        // Intercepter aDj.channelRead0 - le handler principal des messages
        new AgentBuilder.Default()
            .disableClassFormatChanges()
            .with(AgentBuilder.RedefinitionStrategy.RETRANSFORMATION)
            .with(listener)
            .type(ElementMatchers.named("aDj"))
            .transform((builder, typeDescription, classLoader, module, protectionDomain) ->
                builder.visit(Advice.to(ChannelReadAdvice.class)
                    .on(ElementMatchers.named("channelRead0")))
            )
            .installOn(inst);

        log("Byte Buddy: aDj.channelRead0 intercepte");

        // Intercepter aussi aXh, aXi, aXj (handlers pipeline specifiques)
        for (String handler : new String[]{"aXh", "aXi", "aXj", "aXl", "aXm", "aXn"}) {
            try {
                new AgentBuilder.Default()
                    .disableClassFormatChanges()
                    .with(AgentBuilder.RedefinitionStrategy.RETRANSFORMATION)
                    .with(listener)
                    .type(ElementMatchers.named(handler))
                    .transform((builder, typeDescription, classLoader, module, protectionDomain) ->
                        builder.visit(Advice.to(PipelineHandlerAdvice.class)
                            .on(ElementMatchers.named("channelRead0")
                                .or(ElementMatchers.named("channelRead"))))
                    )
                    .installOn(inst);
            } catch (Exception e) {
                log("Byte Buddy skip " + handler + ": " + e.getMessage());
            }
        }
        
        log("Byte Buddy: pipeline handlers interceptes");
    }

    public static void log(String message) {
        String ts = LocalDateTime.now().format(TIME_FMT);
        String line = "[" + ts + "] " + message;
        if (logWriter != null) {
            logWriter.println(line);
            logWriter.flush();
        }
        System.out.println("[WakfuSpy] " + line);
    }

    public static void logMessage(String handler, String msgClass, String content) {
        String ts = LocalDateTime.now().format(TIME_FMT);
        long count = messageCount.incrementAndGet();
        messageTypeCounts.computeIfAbsent(msgClass, k -> new AtomicLong(0)).incrementAndGet();
        
        String line = "[" + ts + "] #" + count + "|handler=" + handler + "|msg=" + msgClass + "|" + content;
        
        if (msgWriter != null) {
            msgWriter.println(line);
            msgWriter.flush();
        }
        
        // Aussi dans le log principal (tronque)
        String shortContent = content.length() > 300 ? content.substring(0, 300) + "..." : content;
        log("MSG #" + count + "|" + msgClass + "|" + shortContent);
        
        // Stats toutes les 100 messages
        if (count % 100 == 0) {
            logStats();
        }
    }

    public static void logHdv(String type, String data) {
        String ts = LocalDateTime.now().format(TIME_FMT);
        String line = "[" + ts + "] HDV|" + type + "|" + data;
        if (hdvWriter != null) {
            hdvWriter.println(line);
            hdvWriter.flush();
        }
        log("HDV|" + type + "|" + data);
    }

    public static void logStats() {
        StringBuilder sb = new StringBuilder();
        sb.append("STATS|total=").append(messageCount.get()).append("|types={");
        messageTypeCounts.forEach((k, v) -> sb.append(k).append("=").append(v.get()).append(","));
        sb.append("}");
        log(sb.toString());
    }
}
'@

$agentV3 | Out-File -FilePath "$projectRoot\src\main\java\com\wakfuassistant\agent\WakfuSpyAgent.java" -Encoding UTF8
Write-Host "  [OK] WakfuSpyAgent.java (V3)" -ForegroundColor Green

# =============================================================================
# CHANNEL READ ADVICE - Intercepte aDj.channelRead0
# =============================================================================
$channelReadAdvice = @'
package com.wakfuassistant.agent;

import net.bytebuddy.asm.Advice;
import java.lang.reflect.*;
import java.util.*;

/**
 * Advice Byte Buddy pour aDj.channelRead0(ChannelHandlerContext, Object).
 * 
 * Ce code est injecte AU DEBUT de la methode channelRead0.
 * Il inspecte le message (2eme argument) par reflection
 * et logue tous ses champs avec leurs valeurs.
 * 
 * C'est ICI qu'on capture les prix HDV, les refId, uniqueId, etc.
 */
public class ChannelReadAdvice {

    @Advice.OnMethodEnter
    public static void onEnter(
            @Advice.This Object self,
            @Advice.AllArguments Object[] args) {
        try {
            if (args == null || args.length < 2 || args[1] == null) return;
            
            Object msg = args[1];
            String msgClass = msg.getClass().getName();
            
            // Extraire tous les champs par reflection
            StringBuilder content = new StringBuilder();
            
            Class<?> current = msg.getClass();
            int fieldCount = 0;
            
            while (current != null && current != Object.class) {
                for (Field field : current.getDeclaredFields()) {
                    if (Modifier.isStatic(field.getModifiers())) continue;
                    try {
                        field.setAccessible(true);
                        Object value = field.get(msg);
                        
                        if (fieldCount > 0) content.append("|");
                        content.append(field.getName()).append("=");
                        
                        if (value == null) {
                            content.append("null");
                        } else if (value instanceof Number || value instanceof Boolean 
                                   || value instanceof Character || value instanceof String) {
                            content.append(value);
                        } else if (value instanceof byte[]) {
                            byte[] bytes = (byte[]) value;
                            content.append("[bytes:").append(bytes.length).append("]");
                        } else if (value instanceof Collection) {
                            Collection<?> col = (Collection<?>) value;
                            content.append("[col:").append(col.size());
                            // Logger les premiers elements
                            if (!col.isEmpty()) {
                                content.append(",first=");
                                int i = 0;
                                for (Object item : col) {
                                    if (i >= 3) { content.append("..."); break; }
                                    if (i > 0) content.append(";");
                                    content.append(inspectShallow(item));
                                    i++;
                                }
                            }
                            content.append("]");
                        } else if (value instanceof Map) {
                            Map<?,?> map = (Map<?,?>) value;
                            content.append("[map:").append(map.size()).append("]");
                        } else if (value.getClass().isArray()) {
                            content.append("[arr:").append(Array.getLength(value)).append("]");
                        } else {
                            // Sous-objet: inspecter un niveau
                            content.append("{").append(inspectShallow(value)).append("}");
                        }
                        
                        fieldCount++;
                    } catch (Exception e) {
                        content.append(field.getName()).append("=[err]");
                    }
                }
                current = current.getSuperclass();
            }
            
            WakfuSpyAgent.logMessage("aDj", msgClass, content.toString());
            
        } catch (Throwable t) {
            // Ne jamais crasher le client
            try { WakfuSpyAgent.log("ADVICE ERROR: " + t.getMessage()); } catch (Exception e) {}
        }
    }

    /**
     * Inspection superficielle d'un sous-objet (1 niveau)
     */
    private static String inspectShallow(Object obj) {
        if (obj == null) return "null";
        if (obj instanceof Number || obj instanceof Boolean || obj instanceof String) {
            return obj.toString();
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(obj.getClass().getSimpleName()).append("{");
        
        try {
            int count = 0;
            for (Field f : obj.getClass().getDeclaredFields()) {
                if (Modifier.isStatic(f.getModifiers())) continue;
                try {
                    f.setAccessible(true);
                    Object v = f.get(obj);
                    if (count > 0) sb.append(",");
                    sb.append(f.getName()).append("=");
                    if (v == null) sb.append("null");
                    else if (v instanceof Number || v instanceof Boolean || v instanceof String) sb.append(v);
                    else sb.append(v.getClass().getSimpleName());
                    count++;
                    if (count >= 10) { sb.append(",..."); break; }
                } catch (Exception e) {
                    // skip
                }
            }
        } catch (Exception e) {
            sb.append("?");
        }
        
        sb.append("}");
        return sb.toString();
    }
}
'@

$channelReadAdvice | Out-File -FilePath "$projectRoot\src\main\java\com\wakfuassistant\agent\ChannelReadAdvice.java" -Encoding UTF8
Write-Host "  [OK] ChannelReadAdvice.java" -ForegroundColor Green

# =============================================================================
# PIPELINE HANDLER ADVICE - Pour les handlers secondaires
# =============================================================================
$pipelineAdvice = @'
package com.wakfuassistant.agent;

import net.bytebuddy.asm.Advice;
import java.lang.reflect.*;

/**
 * Advice pour les handlers secondaires du pipeline (aXh, aXi, etc.)
 * Plus leger que ChannelReadAdvice - logue juste le type et la taille.
 */
public class PipelineHandlerAdvice {

    @Advice.OnMethodEnter
    public static void onEnter(
            @Advice.This Object self,
            @Advice.AllArguments Object[] args) {
        try {
            String handlerName = self.getClass().getName();
            
            if (args != null && args.length >= 2 && args[1] != null) {
                Object msg = args[1];
                String msgClass = msg.getClass().getName();
                
                // Juste compter et logger le type
                WakfuSpyAgent.logMessage(handlerName, msgClass, "pipeline-pass");
            }
        } catch (Throwable t) {
            // Silencieux
        }
    }
}
'@

$pipelineAdvice | Out-File -FilePath "$projectRoot\src\main\java\com\wakfuassistant\agent\PipelineHandlerAdvice.java" -Encoding UTF8
Write-Host "  [OK] PipelineHandlerAdvice.java" -ForegroundColor Green

# =============================================================================
# RUNTIME INTERCEPTOR V3 - Scan elargi avec analyse des messages
# =============================================================================
$runtimeV3 = @'
package com.wakfuassistant.agent;

import java.lang.reflect.*;
import java.util.*;

public class RuntimeInterceptorV3 implements Runnable {

    private final java.lang.instrument.Instrumentation instrumentation;
    private volatile boolean running = true;
    private boolean detailDone = false;

    // TOUTES les classes qu'on veut detailler
    private static final Set<String> DETAIL_TARGETS = new HashSet<>(Arrays.asList(
        // Handlers Netty
        "cAu", "cAv", "aDj", "aXh", "aXi", "aXj", "aXl", "aXm", "aXn", "aXo", "aXp", "aXq", "aXr", "aXt",
        // Classe message de base
        "aAM",
        // Classes Item
        "ffV", "fgA", "fhj", "kF", "uY", "RT", "feG", "bgZ", "eOd", "bJD", "ddU",
        // Classes serialisation/protobuf
        "exP", "QD", "Rh", "eRS",
        // Dispatchers/registries
        "aDK", "aza", "ayF",
        // Classes du handler aDj
        "aAM", "euA", "cAD", "cAH",
        // Protobuf
        "com.google.protobuf.GeneratedMessageV3"
    ));

    public RuntimeInterceptorV3(java.lang.instrument.Instrumentation inst) {
        this.instrumentation = inst;
    }

    public void start() {
        Thread t = new Thread(this, "WakfuSpy-RuntimeV3");
        t.setDaemon(true);
        t.start();
    }

    @Override
    public void run() {
        try { Thread.sleep(15000); } catch (Exception e) { return; }
        
        WakfuSpyAgent.log("RuntimeV3: scanning all target classes...");
        
        while (running) {
            try {
                if (!detailDone) {
                    fullScan();
                }
                Thread.sleep(30000);
                
                // Log stats periodiques
                WakfuSpyAgent.logStats();
                
            } catch (Exception e) {
                WakfuSpyAgent.log("RuntimeV3 error: " + e.getMessage());
            }
        }
    }

    private void fullScan() {
        Class<?>[] loaded = instrumentation.getAllLoadedClasses();
        int found = 0;
        
        for (Class<?> clazz : loaded) {
            String name = clazz.getName();
            if (DETAIL_TARGETS.contains(name)) {
                found++;
                detailClass(clazz);
            }
        }
        
        WakfuSpyAgent.log("RuntimeV3 SCAN|totalLoaded=" + loaded.length + "|targetsFound=" + found);
        
        if (found >= 10) {
            detailDone = true;
            WakfuSpyAgent.log("RuntimeV3: scan complet, passage en mode stats");
        }
    }

    private void detailClass(Class<?> clazz) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("CLASS DETAIL|").append(clazz.getName());
            
            // Superclass
            if (clazz.getSuperclass() != null) {
                sb.append("|super=").append(clazz.getSuperclass().getName());
            }
            
            // Interfaces
            sb.append("|interfaces=[");
            for (Class<?> iface : clazz.getInterfaces()) {
                sb.append(iface.getName()).append(",");
            }
            sb.append("]");
            
            // Champs (instance)
            sb.append("|fields=[");
            try {
                for (Field f : clazz.getDeclaredFields()) {
                    if (!Modifier.isStatic(f.getModifiers())) {
                        sb.append(f.getName()).append(":").append(f.getType().getSimpleName()).append(",");
                    }
                }
            } catch (Exception e) { sb.append("err"); }
            sb.append("]");
            
            // Champs statiques (souvent contiennent des constantes utiles)
            sb.append("|statics=[");
            try {
                for (Field f : clazz.getDeclaredFields()) {
                    if (Modifier.isStatic(f.getModifiers()) && Modifier.isFinal(f.getModifiers())) {
                        try {
                            f.setAccessible(true);
                            Object val = f.get(null);
                            if (val instanceof String || val instanceof Number) {
                                sb.append(f.getName()).append("=").append(val).append(",");
                            }
                        } catch (Exception e) {}
                    }
                }
            } catch (Exception e) { sb.append("err"); }
            sb.append("]");
            
            // Methodes
            sb.append("|methods=[");
            try {
                for (Method m : clazz.getDeclaredMethods()) {
                    sb.append(m.getName()).append("(");
                    for (Class<?> p : m.getParameterTypes()) {
                        sb.append(p.getSimpleName()).append(",");
                    }
                    sb.append("):");
                    sb.append(m.getReturnType().getSimpleName());
                    sb.append(",");
                }
            } catch (Exception e) { sb.append("err"); }
            sb.append("]");
            
            WakfuSpyAgent.log(sb.toString());
            
        } catch (Exception e) {
            WakfuSpyAgent.log("DETAIL ERROR|" + clazz.getName() + "|" + e.getMessage());
        }
    }
}
'@

$runtimeV3 | Out-File -FilePath "$projectRoot\src\main\java\com\wakfuassistant\agent\RuntimeInterceptorV3.java" -Encoding UTF8
Write-Host "  [OK] RuntimeInterceptorV3.java" -ForegroundColor Green

# =============================================================================
# Mettre a jour launch_wakfu_with_agent.bat avec --add-opens pour Java 21
# =============================================================================
$launchScript = @'
@echo off
echo ============================================
echo   LANCEMENT WAKFU AVEC SPY AGENT V3
echo ============================================
echo.

set AGENT_JAR=H:\Code\Wakfuassistant\agent\wakfu-spy-agent.jar

if not exist "%AGENT_JAR%" (
    echo ERREUR: Agent JAR non trouve!
    pause
    exit /b 1
)

echo [1] Definition de JAVA_TOOL_OPTIONS...
set JAVA_TOOL_OPTIONS=-javaagent:%AGENT_JAR% --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED

echo   JAVA_TOOL_OPTIONS=%JAVA_TOOL_OPTIONS%
echo.
echo [2] Lancement du launcher Ankama...

start "" "G:\ankama\Ankama Launcher.exe"

echo.
echo [3] Clique JOUER dans le launcher.
echo   Appuyez sur une touche apres que le jeu demarre.
echo.
pause

echo.
echo [4] Surveillance des logs (Ctrl+C pour arreter)...
echo.

if exist "H:\Code\Wakfuassistant\agent\logs\wakfu_messages.log" (
    powershell -Command "Get-Content 'H:\Code\Wakfuassistant\agent\logs\wakfu_messages.log' -Wait -Tail 50"
) else (
    echo   En attente de wakfu_messages.log...
    :wait_loop
    timeout /t 2 >nul
    if exist "H:\Code\Wakfuassistant\agent\logs\wakfu_messages.log" (
        powershell -Command "Get-Content 'H:\Code\Wakfuassistant\agent\logs\wakfu_messages.log' -Wait -Tail 50"
    ) else (
        goto wait_loop
    )
)
'@

$launchScript | Out-File -FilePath "$projectRoot\launch_wakfu_with_agent.bat" -Encoding ASCII
Write-Host "  [OK] launch_wakfu_with_agent.bat (V3 + add-opens)" -ForegroundColor Green

# =============================================================================
# Nettoyer les anciens logs
# =============================================================================
$logsDir = "$projectRoot\logs"
if (Test-Path $logsDir) {
    Get-ChildItem -Path $logsDir -Filter "*.log" -ErrorAction SilentlyContinue | Remove-Item -Force -ErrorAction SilentlyContinue
    Get-ChildItem -Path $logsDir -Filter "*.bak" -ErrorAction SilentlyContinue | Remove-Item -Force -ErrorAction SilentlyContinue
    Write-Host "  [OK] Anciens logs supprimes" -ForegroundColor Green
}

# =============================================================================
# Supprimer les anciennes classes Java qui ne sont plus utilisees
# =============================================================================
$javaDir = "$projectRoot\src\main\java\com\wakfuassistant\agent"
# MessageInterceptorTransformer -> remplace par NettyInterceptorTransformer
if (Test-Path "$javaDir\MessageInterceptorTransformer.java") {
    Remove-Item "$javaDir\MessageInterceptorTransformer.java" -Force
    Write-Host "  [OK] Ancien MessageInterceptorTransformer supprime" -ForegroundColor Green
}
# RuntimeInterceptor V2 -> remplace par RuntimeInterceptorV3
if (Test-Path "$javaDir\RuntimeInterceptor.java") {
    Remove-Item "$javaDir\RuntimeInterceptor.java" -Force
    Write-Host "  [OK] Ancien RuntimeInterceptor supprime" -ForegroundColor Green
}
# ReflectionInspector -> integre dans ChannelReadAdvice
if (Test-Path "$javaDir\ReflectionInspector.java") {
    Remove-Item "$javaDir\ReflectionInspector.java" -Force
    Write-Host "  [OK] Ancien ReflectionInspector supprime" -ForegroundColor Green
}

# =============================================================================
# COMPILATION
# =============================================================================
Write-Host "`n--- Compilation V3 ---" -ForegroundColor Yellow
$mvn = "H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\bin\mvn.cmd"
& $mvn clean package -q -f "$projectRoot\pom.xml" 2>&1 | ForEach-Object {
    if ($_ -match "ERROR") { Write-Host "  $_" -ForegroundColor Red }
}

if (Test-Path "$projectRoot\target\wakfu-spy-agent-1.0.0.jar") {
    Copy-Item "$projectRoot\target\wakfu-spy-agent-1.0.0.jar" "$projectRoot\wakfu-spy-agent.jar" -Force
    $size = [Math]::Round((Get-Item "$projectRoot\wakfu-spy-agent.jar").Length / 1KB)
    Write-Host "  [OK] BUILD V3 REUSSI - wakfu-spy-agent.jar (${size}KB)" -ForegroundColor Green
} else {
    Write-Host "  [ERREUR] JAR non genere. Verifiez les erreurs ci-dessus." -ForegroundColor Red
    Write-Host "  Relancez avec:" -ForegroundColor Yellow
    Write-Host "  & `"$mvn`" clean package -f `"$projectRoot\pom.xml`"" -ForegroundColor Yellow
}

Write-Host "`n============================================" -ForegroundColor Cyan
Write-Host "  AGENT V3 PRET" -ForegroundColor Cyan
Write-Host "============================================" -ForegroundColor Cyan
Write-Host "  1. Ferme Wakfu + launcher Ankama" -ForegroundColor White
Write-Host "  2. Lance: H:\Code\Wakfuassistant\agent\launch_wakfu_with_agent.bat" -ForegroundColor Cyan
Write-Host "  3. Clique Jouer" -ForegroundColor White
Write-Host "  4. Va au HDV en jeu" -ForegroundColor White
Write-Host "  5. Verifie: H:\Code\Wakfuassistant\agent\logs\wakfu_messages.log" -ForegroundColor DarkCyan
Write-Host "============================================" -ForegroundColor Cyan
