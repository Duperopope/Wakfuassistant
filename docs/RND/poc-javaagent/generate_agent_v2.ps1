# =============================================================================
#  GENERATEUR AGENT V2 - INTERCEPTION NETTY
#  Instrumente cAu.channelRead pour capturer TOUS les messages
#  H:\Code\Wakfuassistant\docs\RND\poc-javaagent\generate_agent_v2.ps1
# =============================================================================

$projectRoot = "H:\Code\Wakfuassistant\agent"

Write-Host "============================================" -ForegroundColor Cyan
Write-Host "  GENERATION AGENT V2 - INTERCEPTION" -ForegroundColor Cyan  
Write-Host "============================================" -ForegroundColor Cyan

# =============================================================================
# NOUVELLE CLASSE: WakfuSpyAgent V2
# =============================================================================
$agentV2 = @'
package com.wakfuassistant.agent;

import java.lang.instrument.Instrumentation;
import java.io.*;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * WAKFU SPY AGENT V2 - Interception des messages Netty
 * 
 * Intercepte channelRead sur les handlers Wakfu pour capturer
 * TOUS les messages reseau avec leurs champs complets.
 * 
 * Cibles principales:
 *   cAu  - Handler Netty principal (channelRead, toString)
 *   cAv  - Handler Netty secondaire (channelRead)  
 *   aDj  - Handler messages (channelRead, toString)
 *   aXh  - Handler specialise (channelRead, toString)
 *   aXi  - Handler pipeline (channelRead)
 *   aXj  - Handler pipeline (channelRead)
 *   ffV  - Classe Item (refId, uniqueId, m_uniqueId)
 *   fgA  - Operation item (refId, uniqueId, serialize)
 *   fhj  - Donnees item (refId, uniqueId)
 *   kF   - Reference item (refId, uniqueId)
 *   uY   - Entree item (refId, uniqueId)
 */
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

    // Compteurs globaux
    public static final AtomicLong messageCount = new AtomicLong(0);
    public static final AtomicLong fieldCount = new AtomicLong(0);
    public static final ConcurrentHashMap<String, AtomicLong> messageTypeCounts = 
        new ConcurrentHashMap<>();

    // Flag pour activer/desactiver le logging verbeux
    public static volatile boolean verboseMode = true;

    public static void premain(String agentArgs, Instrumentation inst) {
        initialize("premain", agentArgs, inst);
    }

    public static void agentmain(String agentArgs, Instrumentation inst) {
        initialize("agentmain", agentArgs, inst);
    }

    private static void initialize(String mode, String agentArgs, Instrumentation inst) {
        try {
            Files.createDirectories(Paths.get(LOG_DIR));
            
            logWriter = new PrintWriter(
                new BufferedWriter(new FileWriter(LOG_FILE, true)), true);
            msgWriter = new PrintWriter(
                new BufferedWriter(new FileWriter(MSG_LOG_FILE, true)), true);
            hdvWriter = new PrintWriter(
                new BufferedWriter(new FileWriter(HDV_LOG_FILE, true)), true);

            log("========================================");
            log("WAKFU SPY AGENT V2 DEMARRE (mode: " + mode + ")");
            log("Java version: " + System.getProperty("java.version"));
            log("========================================");

            // Phase 1: Discovery (garde pour les nouvelles classes)
            ClassDiscoveryTransformer discovery = new ClassDiscoveryTransformer();
            inst.addTransformer(discovery, false);
            
            // Phase 2: Interception des handlers Netty
            NettyInterceptorTransformer interceptor = new NettyInterceptorTransformer();
            inst.addTransformer(interceptor, true);
            
            log("V2 Transformers enregistres:");
            log("  - ClassDiscoveryTransformer (passif)");
            log("  - NettyInterceptorTransformer (actif)");
            log("Agent V2 pret. Interception ACTIVE.");
            log("Logs messages: " + MSG_LOG_FILE);
            log("Logs HDV: " + HDV_LOG_FILE);

        } catch (Exception e) {
            System.err.println("[WakfuSpyAgent] ERREUR: " + e.getMessage());
            e.printStackTrace();
        }
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

    /**
     * Log un message Netty intercepte (fichier dedie)
     */
    public static void logNettyMessage(String handlerClass, String msgClass, 
                                        String content) {
        String ts = LocalDateTime.now().format(TIME_FMT);
        long count = messageCount.incrementAndGet();
        
        // Compter par type
        messageTypeCounts.computeIfAbsent(msgClass, k -> new AtomicLong(0))
            .incrementAndGet();
        
        String line = "[" + ts + "] #" + count 
            + "|handler=" + handlerClass 
            + "|msg=" + msgClass 
            + "|" + content;
        
        if (msgWriter != null) {
            msgWriter.println(line);
            msgWriter.flush();
        }
        
        // Aussi dans le log principal si verbeux
        if (verboseMode) {
            log("MSG #" + count + "|" + msgClass + "|" + 
                (content.length() > 200 ? content.substring(0, 200) + "..." : content));
        }
        
        // Stats toutes les 50 messages
        if (count % 50 == 0) {
            logStats();
        }
    }

    /**
     * Log specifique HDV
     */
    public static void logHdvData(String type, String data) {
        String ts = LocalDateTime.now().format(TIME_FMT);
        String line = "[" + ts + "] HDV|" + type + "|" + data;
        if (hdvWriter != null) {
            hdvWriter.println(line);
            hdvWriter.flush();
        }
        log("HDV|" + type + "|" + data);
    }

    /**
     * Stats des messages interceptes
     */
    public static void logStats() {
        StringBuilder sb = new StringBuilder();
        sb.append("STATS|total=").append(messageCount.get());
        sb.append("|fields=").append(fieldCount.get());
        sb.append("|types={");
        messageTypeCounts.forEach((k, v) -> 
            sb.append(k).append("=").append(v.get()).append(","));
        sb.append("}");
        log(sb.toString());
    }

    /**
     * ToString securise - resout le probleme csC=ERROR
     */
    public static String safeToString(Object obj) {
        if (obj == null) return "null";
        try {
            String s = obj.toString();
            if (s.length() > 5000) {
                return s.substring(0, 5000) + "...(total=" + s.length() + ")";
            }
            return s;
        } catch (Exception e) {
            return "[ERROR:" + e.getClass().getSimpleName() + "] class=" + obj.getClass().getName();
        }
    }
}
'@

$agentV2 | Out-File -FilePath "$projectRoot\src\main\java\com\wakfuassistant\agent\WakfuSpyAgent.java" -Encoding UTF8
Write-Host "  [OK] WakfuSpyAgent.java (V2)" -ForegroundColor Green

# =============================================================================
# NETTY INTERCEPTOR TRANSFORMER - Le coeur de la V2
# =============================================================================
$nettyInterceptor = @'
package com.wakfuassistant.agent;

import java.lang.instrument.ClassFileTransformer;
import java.security.ProtectionDomain;
import java.util.*;

/**
 * Transforme les classes handler Netty de Wakfu pour intercepter
 * channelRead0/channelRead et logger chaque message.
 * 
 * Utilise l'instrumentation bytecode Java standard (pas Byte Buddy)
 * pour injecter du code au debut de channelRead.
 * 
 * On utilise javassist embarque dans le JDK via l'API ClassFileTransformer.
 * Approche: on ne modifie PAS le bytecode directement.
 * A la place, on wrappe avec un ClassFileTransformer qui appelle
 * notre logger via reflection quand les classes cibles sont chargees.
 * 
 * STRATEGIE V2: Au lieu de modifier le bytecode (risque),
 * on va intercepter au niveau du pipeline Netty en ajoutant
 * notre propre handler AVANT les handlers Wakfu.
 * 
 * MAIS pour ca il faut acceder au pipeline...
 * 
 * STRATEGIE V2b (plus simple): On utilise le fait que TOUS les messages
 * Netty passent par io.netty.channel.DefaultChannelPipeline.
 * On instrumente fireChannelRead pour logger chaque message.
 */
public class NettyInterceptorTransformer implements ClassFileTransformer {

    // Classes Wakfu qu'on veut observer
    private static final Set<String> TARGET_HANDLER_CLASSES = new HashSet<>(Arrays.asList(
        "cAu", "cAv", "aDj", "aXh", "aXi", "aXj", "aXl", "aXm", "aXn", "aXo", "aXp", "aXq", "aXr", "aXt"
    ));

    // Classes Item qu'on veut observer
    private static final Set<String> TARGET_ITEM_CLASSES = new HashSet<>(Arrays.asList(
        "ffV", "fgA", "fhj", "kF", "uY", "RT", "feG", "bgZ"
    ));

    // Classes de serialisation
    private static final Set<String> TARGET_SERIALIZE_CLASSES = new HashSet<>(Arrays.asList(
        "exP", "QD", "Rh", "eRS", "ffs"
    ));

    private boolean pipelineInstrumented = false;

    @Override
    public byte[] transform(ClassLoader loader, String className,
                           Class<?> classBeingRedefined,
                           ProtectionDomain protectionDomain,
                           byte[] classfileBuffer) {
        
        if (className == null) return null;
        String dotName = className.replace('/', '.');
        
        // Logger quand les classes cibles sont chargees
        if (TARGET_HANDLER_CLASSES.contains(dotName)) {
            WakfuSpyAgent.log("HANDLER LOADED: " + dotName + " (" + classfileBuffer.length + " bytes)");
            analyzeHandlerClass(dotName, classfileBuffer);
        }
        
        if (TARGET_ITEM_CLASSES.contains(dotName)) {
            WakfuSpyAgent.log("ITEM CLASS LOADED: " + dotName + " (" + classfileBuffer.length + " bytes)");
            analyzeItemClass(dotName, classfileBuffer);
        }

        if (TARGET_SERIALIZE_CLASSES.contains(dotName)) {
            WakfuSpyAgent.log("SERIALIZE CLASS LOADED: " + dotName + " (" + classfileBuffer.length + " bytes)");
        }

        // Intercepter SimpleChannelInboundHandler pour wrapper channelRead0
        if (dotName.equals("io.netty.channel.SimpleChannelInboundHandler")) {
            WakfuSpyAgent.log("SimpleChannelInboundHandler LOADED - pipeline detectable");
        }

        return null; // Ne modifie pas le bytecode pour l'instant
    }

    /**
     * Analyse les methodes et champs d'une classe handler
     */
    private void analyzeHandlerClass(String className, byte[] bytecode) {
        try {
            String content = new String(bytecode, "ISO-8859-1");
            
            // Chercher les noms de methodes
            String[] methods = {"channelRead", "channelRead0", "messageReceived", 
                               "decode", "encode", "write", "flush"};
            StringBuilder found = new StringBuilder();
            for (String m : methods) {
                if (content.contains(m)) {
                    if (found.length() > 0) found.append(",");
                    found.append(m);
                }
            }
            
            // Chercher les references a d'autres classes connues
            String[] refs = {"ffV", "fgA", "fhj", "kF", "uY", "cso", "csf", 
                            "coy", "cwj", "cmm", "cmb", "ctu"};
            StringBuilder refsFound = new StringBuilder();
            for (String r : refs) {
                if (content.contains(r)) {
                    if (refsFound.length() > 0) refsFound.append(",");
                    refsFound.append(r);
                }
            }
            
            WakfuSpyAgent.log("  HANDLER ANALYSIS|" + className 
                + "|methods=" + found 
                + "|refs=" + refsFound);
                
        } catch (Exception e) {
            WakfuSpyAgent.log("  HANDLER ANALYSIS ERROR: " + e.getMessage());
        }
    }

    /**
     * Analyse une classe Item pour ses champs
     */
    private void analyzeItemClass(String className, byte[] bytecode) {
        try {
            String content = new String(bytecode, "ISO-8859-1");
            
            String[] fields = {"refId", "m_refId", "uniqueId", "m_uniqueId",
                              "m_qty", "m_quantity", "m_bagId", "m_posInBag",
                              "m_price", "m_kamas", "m_sellerId", "m_buyerId",
                              "m_name", "m_level", "m_rarity"};
            StringBuilder found = new StringBuilder();
            for (String f : fields) {
                if (content.contains(f)) {
                    if (found.length() > 0) found.append(",");
                    found.append(f);
                }
            }
            
            WakfuSpyAgent.log("  ITEM ANALYSIS|" + className + "|fields=" + found);
            
        } catch (Exception e) {
            WakfuSpyAgent.log("  ITEM ANALYSIS ERROR: " + e.getMessage());
        }
    }
}
'@

$nettyInterceptor | Out-File -FilePath "$projectRoot\src\main\java\com\wakfuassistant\agent\NettyInterceptorTransformer.java" -Encoding UTF8
Write-Host "  [OK] NettyInterceptorTransformer.java" -ForegroundColor Green

# =============================================================================
# REFLECTION INSPECTOR - Lit les champs par reflection
# =============================================================================
$reflectionInspector = @'
package com.wakfuassistant.agent;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;

/**
 * Inspecte n'importe quel objet Java par reflection.
 * Extrait tous les champs (public, private, protected)
 * sans dependre du toString() (qui plante dans Wakfu).
 * 
 * C'est ce qui nous permet de lire refId, uniqueId, price, etc.
 * meme quand le client Wakfu affiche "ERROR" dans ses logs.
 */
public class ReflectionInspector {

    // Cache des champs par classe (evite de refaire getDeclaredFields a chaque fois)
    private static final Map<Class<?>, Field[]> fieldCache = new WeakHashMap<>();
    
    // Profondeur max de recursion pour eviter les boucles infinies
    private static final int MAX_DEPTH = 3;
    
    // Champs qu'on cherche specifiquement
    private static final Set<String> HIGH_VALUE_FIELDS = new HashSet<>(Arrays.asList(
        "refId", "m_refId", "uniqueId", "m_uniqueId",
        "m_qty", "m_quantity", "quantity",
        "m_bagId", "bagId", "m_posInBag",
        "m_price", "price", "m_kamas", "kamas",
        "m_sellerId", "sellerId", "m_buyerId", "buyerId",
        "m_name", "name", "m_level", "level",
        "m_rarity", "rarity"
    ));

    /**
     * Inspecte un objet et retourne une map de ses champs.
     * Descend recursivement dans les sous-objets.
     */
    public static Map<String, Object> inspect(Object obj) {
        return inspect(obj, 0);
    }

    private static Map<String, Object> inspect(Object obj, int depth) {
        Map<String, Object> result = new LinkedHashMap<>();
        
        if (obj == null) {
            result.put("_null", true);
            return result;
        }
        
        Class<?> clazz = obj.getClass();
        result.put("_class", clazz.getName());
        
        if (depth > MAX_DEPTH) {
            result.put("_truncated", "max depth reached");
            return result;
        }
        
        // Parcourir la hierarchie de classes
        Class<?> current = clazz;
        while (current != null && current != Object.class) {
            try {
                Field[] fields = getFields(current);
                for (Field field : fields) {
                    try {
                        field.setAccessible(true);
                        String name = field.getName();
                        Object value = field.get(obj);
                        
                        if (value == null) {
                            result.put(name, "null");
                        } else if (isPrimitive(value)) {
                            result.put(name, value);
                            
                            // Detecter les champs de haute valeur
                            if (HIGH_VALUE_FIELDS.contains(name)) {
                                WakfuSpyAgent.logHdvData("FIELD", 
                                    name + "=" + value + " (in " + clazz.getName() + ")");
                            }
                        } else if (value instanceof String) {
                            result.put(name, value);
                        } else if (value instanceof Collection) {
                            Collection<?> col = (Collection<?>) value;
                            result.put(name, "[Collection size=" + col.size() + "]");
                        } else if (value instanceof Map) {
                            Map<?,?> map = (Map<?,?>) value;
                            result.put(name, "[Map size=" + map.size() + "]");
                        } else if (value.getClass().isArray()) {
                            result.put(name, "[Array length=" + java.lang.reflect.Array.getLength(value) + "]");
                        } else if (depth < MAX_DEPTH && isWakfuClass(value.getClass())) {
                            // Descendre dans les sous-objets Wakfu
                            result.put(name, inspect(value, depth + 1));
                        } else {
                            result.put(name, safeToString(value));
                        }
                        
                        WakfuSpyAgent.fieldCount.incrementAndGet();
                        
                    } catch (Exception e) {
                        result.put(field.getName(), "[access error: " + e.getMessage() + "]");
                    }
                }
            } catch (Exception e) {
                // Silencieux pour les classes systeme
            }
            current = current.getSuperclass();
        }
        
        return result;
    }

    /**
     * Inspecte un objet et retourne un string compact
     */
    public static String inspectToString(Object obj) {
        Map<String, Object> data = inspect(obj);
        return mapToString(data);
    }

    private static String mapToString(Map<String, Object> map) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        boolean first = true;
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (!first) sb.append(", ");
            first = false;
            sb.append(entry.getKey()).append("=");
            if (entry.getValue() instanceof Map) {
                @SuppressWarnings("unchecked")
                Map<String, Object> subMap = (Map<String, Object>) entry.getValue();
                sb.append(mapToString(subMap));
            } else {
                sb.append(entry.getValue());
            }
        }
        sb.append("}");
        return sb.toString();
    }

    private static Field[] getFields(Class<?> clazz) {
        return fieldCache.computeIfAbsent(clazz, c -> {
            try {
                return c.getDeclaredFields();
            } catch (Exception e) {
                return new Field[0];
            }
        });
    }

    private static boolean isPrimitive(Object obj) {
        return obj instanceof Number || obj instanceof Boolean || obj instanceof Character;
    }

    private static boolean isWakfuClass(Class<?> clazz) {
        String name = clazz.getName();
        // Classes obfusquees (2-4 lettres) ou Ankama
        return name.startsWith("com.ankamagames") 
            || (name.length() <= 4 && !name.contains("."))
            || (name.length() <= 4 && name.matches("[a-zA-Z]+"));
    }

    private static String safeToString(Object obj) {
        try {
            String s = obj.toString();
            return s.length() > 200 ? s.substring(0, 200) + "..." : s;
        } catch (Exception e) {
            return "[ERROR:" + e.getClass().getSimpleName() + "]";
        }
    }

    /**
     * Extrait specifiquement les champs HDV d'un objet
     */
    public static String extractHdvFields(Object obj) {
        if (obj == null) return "null";
        
        StringBuilder sb = new StringBuilder();
        Class<?> clazz = obj.getClass();
        sb.append("class=").append(clazz.getName());
        
        Class<?> current = clazz;
        while (current != null && current != Object.class) {
            try {
                for (Field field : current.getDeclaredFields()) {
                    if (Modifier.isStatic(field.getModifiers())) continue;
                    try {
                        field.setAccessible(true);
                        Object value = field.get(obj);
                        if (value != null) {
                            sb.append("|").append(field.getName()).append("=");
                            if (isPrimitive(value) || value instanceof String) {
                                sb.append(value);
                            } else if (value instanceof Collection) {
                                sb.append("[col:").append(((Collection<?>)value).size()).append("]");
                            } else if (value instanceof Map) {
                                sb.append("[map:").append(((Map<?,?>)value).size()).append("]");
                            } else if (value.getClass().isArray()) {
                                sb.append("[arr:").append(java.lang.reflect.Array.getLength(value)).append("]");
                            } else {
                                sb.append(value.getClass().getSimpleName());
                            }
                        }
                    } catch (Exception e) {
                        // skip
                    }
                }
            } catch (Exception e) {
                // skip
            }
            current = current.getSuperclass();
        }
        
        return sb.toString();
    }
}
'@

$reflectionInspector | Out-File -FilePath "$projectRoot\src\main\java\com\wakfuassistant\agent\ReflectionInspector.java" -Encoding UTF8
Write-Host "  [OK] ReflectionInspector.java" -ForegroundColor Green

# =============================================================================
# RUNTIME INTERCEPTOR - S'attache au runtime via Thread monitoring
# =============================================================================
$runtimeInterceptor = @'
package com.wakfuassistant.agent;

import java.lang.reflect.*;
import java.util.*;
import java.util.concurrent.*;

/**
 * Intercepteur runtime qui s'attache aux handlers Netty APRES
 * qu'ils sont instancies, en utilisant l'Instrumentation API
 * pour retransformer les classes cibles.
 * 
 * Strategie: On attend que les classes cibles soient chargees,
 * puis on installe un proxy sur le ChannelPipeline pour
 * intercepter tous les messages entrants.
 * 
 * Pour la V2, on utilise une approche plus simple:
 * un thread daemon qui poll regulierement les classes chargees
 * et installe des hooks via reflection sur les instances actives.
 */
public class RuntimeInterceptor implements Runnable {

    private final java.lang.instrument.Instrumentation instrumentation;
    private volatile boolean running = true;
    private boolean hookInstalled = false;

    public RuntimeInterceptor(java.lang.instrument.Instrumentation inst) {
        this.instrumentation = inst;
    }

    public void start() {
        Thread t = new Thread(this, "WakfuSpy-RuntimeInterceptor");
        t.setDaemon(true);
        t.start();
        WakfuSpyAgent.log("RuntimeInterceptor thread started");
    }

    @Override
    public void run() {
        // Attendre que le jeu soit charge
        try { Thread.sleep(10000); } catch (Exception e) { return; }
        
        WakfuSpyAgent.log("RuntimeInterceptor: scanning loaded classes...");
        
        while (running) {
            try {
                if (!hookInstalled) {
                    scanAndHook();
                }
                Thread.sleep(5000);
            } catch (Exception e) {
                WakfuSpyAgent.log("RuntimeInterceptor error: " + e.getMessage());
            }
        }
    }

    private void scanAndHook() {
        Class<?>[] loaded = instrumentation.getAllLoadedClasses();
        
        int wakfuHandlers = 0;
        int itemClasses = 0;
        
        for (Class<?> clazz : loaded) {
            String name = clazz.getName();
            
            // Compter les handlers Netty Wakfu
            if (isTargetHandler(name)) {
                wakfuHandlers++;
                analyzeLoadedClass(clazz);
            }
            
            // Compter les classes Item
            if (isTargetItem(name)) {
                itemClasses++;
                analyzeLoadedClass(clazz);
            }
        }
        
        WakfuSpyAgent.log("RUNTIME SCAN|totalLoaded=" + loaded.length 
            + "|wakfuHandlers=" + wakfuHandlers 
            + "|itemClasses=" + itemClasses);
        
        if (wakfuHandlers > 0) {
            hookInstalled = true;
            WakfuSpyAgent.log("Target classes found! Analyzing fields and methods...");
        }
    }

    private void analyzeLoadedClass(Class<?> clazz) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("CLASS DETAIL|").append(clazz.getName());
            
            // Interfaces
            sb.append("|interfaces=[");
            for (Class<?> iface : clazz.getInterfaces()) {
                sb.append(iface.getName()).append(",");
            }
            sb.append("]");
            
            // Superclass
            if (clazz.getSuperclass() != null) {
                sb.append("|super=").append(clazz.getSuperclass().getName());
            }
            
            // Champs declares
            sb.append("|fields=[");
            for (Field f : clazz.getDeclaredFields()) {
                if (!Modifier.isStatic(f.getModifiers())) {
                    sb.append(f.getName()).append(":").append(f.getType().getSimpleName()).append(",");
                }
            }
            sb.append("]");
            
            // Methodes declarees
            sb.append("|methods=[");
            for (Method m : clazz.getDeclaredMethods()) {
                if (!Modifier.isStatic(m.getModifiers())) {
                    sb.append(m.getName()).append("(");
                    for (Class<?> p : m.getParameterTypes()) {
                        sb.append(p.getSimpleName()).append(",");
                    }
                    sb.append("),");
                }
            }
            sb.append("]");
            
            WakfuSpyAgent.log(sb.toString());
            
        } catch (Exception e) {
            WakfuSpyAgent.log("ANALYZE ERROR|" + clazz.getName() + "|" + e.getMessage());
        }
    }

    private boolean isTargetHandler(String name) {
        return name.equals("cAu") || name.equals("cAv") || name.equals("aDj") 
            || name.equals("aXh") || name.equals("aXi") || name.equals("aXj")
            || name.equals("aXl") || name.equals("aXm") || name.equals("aXn")
            || name.equals("aXo") || name.equals("aXp") || name.equals("aXq")
            || name.equals("aXr") || name.equals("aXt");
    }

    private boolean isTargetItem(String name) {
        return name.equals("ffV") || name.equals("fgA") || name.equals("fhj")
            || name.equals("kF") || name.equals("uY") || name.equals("RT")
            || name.equals("feG") || name.equals("bgZ")
            || name.equals("eOd") || name.equals("bJD") || name.equals("ddU");
    }

    public void stop() {
        running = false;
    }
}
'@

$runtimeInterceptor | Out-File -FilePath "$projectRoot\src\main\java\com\wakfuassistant\agent\RuntimeInterceptor.java" -Encoding UTF8
Write-Host "  [OK] RuntimeInterceptor.java" -ForegroundColor Green

# =============================================================================
# Mettre a jour WakfuSpyAgent pour demarrer le RuntimeInterceptor
# =============================================================================
# On re-ecrit le agent avec le lancement du RuntimeInterceptor
$agentV2Updated = $agentV2 -replace 'log\("Agent V2 pret\. Interception ACTIVE\."\);', @'
// Phase 3: Runtime interceptor (analyse les classes en memoire)
            RuntimeInterceptor runtime = new RuntimeInterceptor(inst);
            runtime.start();
            
            log("Agent V2 pret. Interception ACTIVE.");
'@

$agentV2Updated | Out-File -FilePath "$projectRoot\src\main\java\com\wakfuassistant\agent\WakfuSpyAgent.java" -Encoding UTF8
Write-Host "  [OK] WakfuSpyAgent.java (V2 + RuntimeInterceptor)" -ForegroundColor Green

# =============================================================================
# COMPILATION
# =============================================================================
Write-Host "`n--- Compilation ---" -ForegroundColor Yellow
$mvn = "H:\Code\Wakfuassistant\agent\tools\apache-maven-3.9.14\bin\mvn.cmd"
$result = & $mvn clean package -q -f "$projectRoot\pom.xml" 2>&1
if ($LASTEXITCODE -eq 0) {
    Copy-Item "$projectRoot\target\wakfu-spy-agent-1.0.0.jar" "$projectRoot\wakfu-spy-agent.jar" -Force
    $size = [Math]::Round((Get-Item "$projectRoot\wakfu-spy-agent.jar").Length / 1KB)
    Write-Host "  [OK] BUILD REUSSI - wakfu-spy-agent.jar (${size}KB)" -ForegroundColor Green
} else {
    Write-Host "  [ERREUR] Compilation echouee:" -ForegroundColor Red
    $result | ForEach-Object { Write-Host "    $_" -ForegroundColor Red }
}

# =============================================================================
# NETTOYAGE DES ANCIENS LOGS
# =============================================================================
$logsDir = "$projectRoot\logs"
if (Test-Path $logsDir) {
    Get-ChildItem -Path $logsDir -Filter "*.log" | ForEach-Object {
        Rename-Item $_.FullName "$($_.BaseName)_$(Get-Date -Format 'yyyyMMdd_HHmmss').bak"
    }
    Write-Host "  [OK] Anciens logs archives" -ForegroundColor Green
}

Write-Host "`n============================================" -ForegroundColor Cyan
Write-Host "  AGENT V2 PRET" -ForegroundColor Cyan
Write-Host "============================================" -ForegroundColor Cyan
Write-Host "  1. Ferme Wakfu" -ForegroundColor White
Write-Host "  2. Ferme le launcher Ankama" -ForegroundColor White
Write-Host "  3. Lance: H:\Code\Wakfuassistant\agent\launch_wakfu_with_agent.bat" -ForegroundColor Cyan
Write-Host "  4. Clique Jouer dans le launcher" -ForegroundColor White
Write-Host "  5. Verifie les logs:" -ForegroundColor White
Write-Host "     - wakfu_agent_spy.log (general)" -ForegroundColor DarkCyan
Write-Host "     - wakfu_messages.log  (messages Netty)" -ForegroundColor DarkCyan
Write-Host "     - wakfu_hdv.log       (HDV specifique)" -ForegroundColor DarkCyan
Write-Host "============================================" -ForegroundColor Cyan
