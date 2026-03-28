package com.wakfuassistant.agent;

import java.io.*;
import java.lang.reflect.*;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.*;

/**
 * InventoryPassiveReader V2.5 FINAL
 *
 * Structure confirmee par diagnostic V2.4 (2026-03-24 14:42) :
 *
 * ieV.sfu (TLongObjectHashMap) -> bDE[] (les sacs)
 *   Chaque bDE (sac) contient :
 *     brR (int)  = refId du sac (ex: 23135=Caissette, 17286=Saccawotte, 2175=Poches)
 *     bgK (long) = uniqueId du sac
 *     mby (int)  = numero/position du sac
 *     sfn (RL)   = conteneur de slots
 *       sfn.bmB (RT[]) = tableau de slots, chaque RT est un slot
 *         RT non-null = un item dans ce slot
 *       sfn.bmQ (int) = capacite max du sac (30 ou 50)
 *       sfn.bmC (TLongShortHashMap) = mapping uid->position
 *
 *   Chaque RT (slot/item) est un objet avec :
 *     brR (int)  = refId de l'item
 *     bgK (long) = uniqueId de l'item
 *     mby (int)  = quantite
 *     bfa()/fVd() = stackMax
 *
 * Resultats attendus : BAG#0(50/50) + BAG#4(17/30) + BAG#5(50/50) = 117+ items
 */
public class InventoryPassiveReader {

    private static final String LOG_DIR = "H:\\Code\\Wakfuassistant\\logs";
    private static final String JSON_FILE = LOG_DIR + "\\inventory_bags.json";
    private static final String LOG_FILE = LOG_DIR + "\\inventory_bags.log";
    private static final String DEBUG_LOG = LOG_DIR + "\\inventory_debug.log";
    private static final String ERROR_LOG = LOG_DIR + "\\inventory_errors.log";

    private static final int INITIAL_DELAY_SECONDS = 20;
    private static final int INTERVAL_SECONDS = 5;

    private static ScheduledExecutorService scheduler;
    private static volatile boolean firstCaptureDone = false;
    private static volatile int tickCount = 0;

    private static Map<Integer, String> i18nCache = null;

    public static void startPassiveCapture() {
        new File(LOG_DIR).mkdirs();
        scheduler = Executors.newSingleThreadScheduledExecutor(r -> {
            Thread t = new Thread(r, "InventoryPassiveReader-V2.6");
            t.setDaemon(true);
            return t;
        });
        debugLog("=== InventoryPassiveReader V2.5 FINAL (sfn.bmB slots) ===");
        scheduler.scheduleAtFixedRate(() -> {
            try { captureInventory(); }
            catch (Throwable t) { debugLog("ERROR: " + t.getMessage()); errorLog(t); }
        }, INITIAL_DELAY_SECONDS, INTERVAL_SECONDS, TimeUnit.SECONDS);
    }

    private static void captureInventory() {
        tickCount++;
        boolean verbose = (tickCount <= 2);

        Object localPlayer = CharacterExtractorAdvice.lastLocalPlayer;
        if (localPlayer == null) { if (verbose) debugLog("WAITING bgT..."); return; }

        if (i18nCache == null) loadI18n();

        List<Map<String, Object>> allBags = new ArrayList<>();
        int totalItems = 0;

        // === STEP 1 : Lire ieV.sfu (les sacs) ===
        Object ieV = getFieldValue(localPlayer, "ieV");
        if (ieV == null) { debugLog("ieV null"); return; }

        Object sfu = getFieldValue(ieV, "sfu");
        if (sfu == null) { debugLog("sfu null"); return; }

        Object[] bagObjects = null;
        try {
            Method valuesMethod = sfu.getClass().getMethod("values");
            bagObjects = (Object[]) valuesMethod.invoke(sfu);
        } catch (Exception e) {
            debugLog("sfu.values() failed: " + e.getMessage());
            return;
        }

        if (verbose) debugLog("Found " + bagObjects.length + " bags in sfu");

        for (int b = 0; b < bagObjects.length; b++) {
            Object bag = bagObjects[b];
            if (bag == null) continue;

            // Identifier le sac
            int bagRefId = getIntField(bag, "brR", -1);
            long bagUid = getLongField(bag, "bgK", -1);
            int bagNum = getIntField(bag, "mby", -1);
            String bagName = resolveItemName(bagRefId);

            // Lire sfn (RL = conteneur de slots)
            Object sfn = getFieldValue(bag, "sfn");
            if (sfn == null) {
                if (verbose) debugLog("  BAG#" + b + " " + bagName + ": sfn is null");
                continue;
            }

            int capacity = getIntField(sfn, "bmQ", -1);

            // Lire bmB (RT[] = tableau de slots)
            Object bmB = getFieldValue(sfn, "bmB");
            if (bmB == null || !bmB.getClass().isArray()) {
                if (verbose) debugLog("  BAG#" + b + " " + bagName + ": bmB is null or not array");
                continue;
            }

            int slotCount = Array.getLength(bmB);
            List<Map<String, Object>> bagItems = new ArrayList<>();

            for (int s = 0; s < slotCount; s++) {
                Object slot = Array.get(bmB, s);
                if (slot == null) continue;

                // Chaque slot RT contient un item avec brR, mby, bgK
                int itemRefId = getIntField(slot, "brR", -1);
                int itemQty = getIntField(slot, "mby", 1);
                long itemUid = getLongField(slot, "bgK", -1);

                // Si brR ne marche pas, essayer les methodes
                if (itemRefId <= 0) {
                    itemRefId = callIntMethod(slot, "avr", -1);
                }
                if (itemQty <= 0) {
                    itemQty = callIntMethod(slot, "eDo", 1);
                }
                if (itemUid <= 0) {
                    itemUid = callLongMethod(slot, "Lx", -1);
                }

                if (itemRefId <= 0) continue;

                String itemName = resolveItemName(itemRefId);

                Map<String, Object> item = new LinkedHashMap<>();
                item.put("refId", itemRefId);
                item.put("name", itemName);
                item.put("quantity", itemQty);
                item.put("uniqueId", itemUid);
                item.put("slot", s);
                bagItems.add(item);

                if (verbose && bagItems.size() <= 3) {
                    debugLog("  BAG#" + b + " slot[" + s + "]: " + itemName + " x" + itemQty + " (ref=" + itemRefId + ")");
                }
            }

            if (!bagItems.isEmpty() || verbose) {
                if (verbose) debugLog("  BAG#" + b + " " + bagName + " (" + bagRefId + "): " + bagItems.size() + "/" + slotCount + " slots used, capacity=" + capacity);
            }

            // Ajouter le bag meme s'il est vide (pour voir la structure)
            if (!bagItems.isEmpty()) {
                Map<String, Object> bagData = new LinkedHashMap<>();
                bagData.put("bagId", "bag_" + bagNum + "_" + bagRefId);
                bagData.put("bagName", bagName);
                bagData.put("bagRefId", bagRefId);
                bagData.put("bagUniqueId", bagUid);
                bagData.put("capacity", capacity);
                bagData.put("source", "ieV.sfu.sfn.bmB");
                bagData.put("itemCount", bagItems.size());
                bagData.put("items", bagItems);
                allBags.add(bagData);
                totalItems += bagItems.size();
            }
        }

        // === STEP 2 : Quest items (ieT.seo[QUEST]) ===
        Object ieT = getFieldValue(localPlayer, "ieT");
        if (ieT != null) {
            Object seo = getFieldValue(ieT, "seo");
            if (seo instanceof Map) {
                for (Map.Entry<?, ?> entry : ((Map<?, ?>) seo).entrySet()) {
                    String key = String.valueOf(entry.getKey());
                    Object value = entry.getValue();
                    if (value == null) continue;

                    // feC/feH contient sev (TIntObjectHashMap) avec feG items
                    Object sev = getFieldValue(value, "sev");
                    if (sev != null) {
                        List<Map<String, Object>> questItems = extractFromTrove(sev);
                        if (!questItems.isEmpty()) {
                            Map<String, Object> bag = new LinkedHashMap<>();
                            bag.put("bagId", "inventory_" + key.toLowerCase());
                            bag.put("bagName", key);
                            bag.put("source", "ieT.seo[" + key + "].sev");
                            bag.put("itemCount", questItems.size());
                            bag.put("items", questItems);
                            allBags.add(bag);
                            totalItems += questItems.size();
                        }
                    }
                }
            }
        }

        // === STEP 3 : Player info ===
        String playerName = callStringMethod(localPlayer, "getName", "unknown");
        long kamas = callLongMethod(localPlayer, "fyF", -1);
        int level = callIntMethod(localPlayer, "dnE", -1);

        if (verbose || tickCount % 12 == 0) {
            debugLog("RESULT: " + playerName + " Lv." + level + " kamas=" + kamas
                    + " items=" + totalItems + " bags=" + allBags.size());
        }

        // === STEP 4 : JSON ===
        writeJson(playerName, level, kamas, allBags, totalItems);
        writeLogSummary(playerName, level, kamas, allBags, totalItems);

        if (!firstCaptureDone && totalItems > 0) {
            firstCaptureDone = true;
            debugLog("=== FIRST CAPTURE: " + totalItems + " items in " + allBags.size() + " bags ===");
            System.out.println("[INVENTORY-V2.5] CAPTURE: " + totalItems + " items / " + allBags.size() + " bags");
        }
    }

    // ================================================================
    //  TROVE EXTRACTOR (pour quest items feG via sev)
    // ================================================================

    private static List<Map<String, Object>> extractFromTrove(Object trove) {
        List<Map<String, Object>> items = new ArrayList<>();
        try {
            Method valuesMethod = trove.getClass().getMethod("values");
            Object result = valuesMethod.invoke(trove);
            Object[] values;
            if (result instanceof Object[]) {
                values = (Object[]) result;
            } else {
                return items;
            }

            for (Object val : values) {
                if (val == null) continue;
                Map<String, Object> item = extractQuestItem(val);
                if (item != null) items.add(item);
            }
        } catch (Exception e) {
            // Fallback: essayer comme Collection
            if (trove instanceof Collection) {
                for (Object val : (Collection<?>) trove) {
                    Map<String, Object> item = extractQuestItem(val);
                    if (item != null) items.add(item);
                }
            }
        }
        return items;
    }

    private static Map<String, Object> extractQuestItem(Object obj) {
        if (obj == null) return null;
        String cn = obj.getClass().getName();
        if (cn.startsWith("java.") || cn.startsWith("gnu.")) return null;

        int refId = -1;
        int quantity = -1;

        // feG : acs()=refId, bfd()=qty
        refId = callIntMethod(obj, "acs", -1);
        if (refId <= 0) refId = callIntMethod(obj, "avr", -1);
        if (refId <= 0) refId = getIntField(obj, "brR", -1);
        if (refId <= 0) {
            // seD.m_id pour feG
            Object seD = getFieldValue(obj, "seD");
            if (seD != null) {
                refId = getIntField(seD, "m_id", -1);
                if (refId <= 0) {
                    // Chercher tout champ int > 0 dans seD
                    Class<?> c = seD.getClass();
                    while (c != null && !c.equals(Object.class)) {
                        for (Field f : c.getDeclaredFields()) {
                            if (Modifier.isStatic(f.getModifiers())) continue;
                            if (f.getType() == int.class || f.getType() == Integer.class) {
                                try {
                                    f.setAccessible(true);
                                    int v = ((Number) f.get(seD)).intValue();
                                    if (v > 100 && v < 200000) { refId = v; break; }
                                } catch (Exception ignored) {}
                            }
                        }
                        if (refId > 0) break;
                        c = c.getSuperclass();
                    }
                }
            }
        }

        if (refId <= 0) return null;

        quantity = callIntMethod(obj, "bfd", -1);
        if (quantity <= 0) quantity = callIntMethod(obj, "eDo", -1);
        if (quantity <= 0) quantity = getIntField(obj, "bol", -1);
        if (quantity <= 0) quantity = getIntField(obj, "mby", 1);
        if (quantity <= 0) quantity = 1;

        long uid = callLongMethod(obj, "Lx", -1);
        if (uid <= 0) uid = getLongField(obj, "bgK", -1);

        Map<String, Object> item = new LinkedHashMap<>();
        item.put("refId", refId);
        item.put("name", resolveItemName(refId));
        item.put("quantity", quantity);
        item.put("uniqueId", uid);
        return item;
    }

    // ================================================================
    //  I18N
    // ================================================================

    private static String resolveItemName(int refId) {
        if (i18nCache != null && i18nCache.containsKey(refId)) return i18nCache.get(refId);
        return "item_" + refId;
    }

    private static void loadI18n() {
        debugLog("Loading i18n...");
        i18nCache = new HashMap<>();
        String i18nPath = "H:\\Code\\Wakfuassistant\\docs\\RND\\data\\i18n_items_fr.json";
        if (new File(i18nPath).exists()) {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(
                    new FileInputStream(i18nPath), StandardCharsets.UTF_8))) {
                StringBuilder sb = new StringBuilder(); String line;
                while ((line = br.readLine()) != null) sb.append(line);
                String json = sb.toString().trim();
                if (json.startsWith("{")) json = json.substring(1);
                if (json.endsWith("}")) json = json.substring(0, json.length() - 1);
                int pos = 0;
                while (pos < json.length()) {
                    int q1 = json.indexOf('"', pos); if (q1 < 0) break;
                    int q2 = json.indexOf('"', q1 + 1); if (q2 < 0) break;
                    String key = json.substring(q1 + 1, q2);
                    int colon = json.indexOf(':', q2 + 1); if (colon < 0) break;
                    int q3 = json.indexOf('"', colon + 1); if (q3 < 0) break;
                    int q4 = q3 + 1;
                    while (q4 < json.length()) { if (json.charAt(q4) == '"' && json.charAt(q4 - 1) != '\\') break; q4++; }
                    if (q4 >= json.length()) break;
                    try { i18nCache.put(Integer.parseInt(key), json.substring(q3 + 1, q4)); } catch (NumberFormatException ignored) {}
                    pos = q4 + 1;
                }
                debugLog("i18n: " + i18nCache.size() + " names");
            } catch (Exception e) { debugLog("i18n error: " + e.getMessage()); }
        } else {
            debugLog("i18n not found, CDN fallback...");
            String cdnPath = "H:\\Code\\Wakfuassistant\\docs\\RND\\data\\cdn_items.json";
            if (new File(cdnPath).exists()) {
                try (BufferedReader br = new BufferedReader(new InputStreamReader(
                        new FileInputStream(cdnPath), StandardCharsets.UTF_8))) {
                    StringBuilder sb = new StringBuilder(); String line;
                    while ((line = br.readLine()) != null) sb.append(line);
                    String json = sb.toString(); int idx = 0;
                    while ((idx = json.indexOf("\"id\":", idx)) >= 0) {
                        int ns = idx + 5, ne = ns;
                        while (ne < json.length() && (Character.isDigit(json.charAt(ne)) || json.charAt(ne) == '-')) ne++;
                        try {
                            int id = Integer.parseInt(json.substring(ns, ne));
                            String zone = json.substring(ne, Math.min(ne + 500, json.length()));
                            int fi = zone.indexOf("\"fr\":\"");
                            if (fi >= 0) {
                                int nms = fi + 6, nme = nms;
                                while (nme < zone.length()) { if (zone.charAt(nme) == '"' && zone.charAt(nme - 1) != '\\') break; nme++; }
                                if (nme < zone.length()) i18nCache.put(id, zone.substring(nms, nme));
                            }
                        } catch (NumberFormatException ignored) {}
                        idx = ne;
                    }
                    debugLog("CDN: " + i18nCache.size() + " names");
                } catch (Exception e) { debugLog("CDN error: " + e.getMessage()); }
            }
        }
    }

    // ================================================================
    //  REFLECTION
    // ================================================================

    private static Field findField(Class<?> cls, String name) {
        Class<?> c = cls;
        while (c != null) {
            try { Field f = c.getDeclaredField(name); f.setAccessible(true); return f; }
            catch (NoSuchFieldException e) { c = c.getSuperclass(); }
        }
        return null;
    }

    private static Object getFieldValue(Object obj, String name) {
        if (obj == null) return null;
        try { Field f = findField(obj.getClass(), name); if (f != null) return f.get(obj); }
        catch (Exception ignored) {}
        return null;
    }

    private static int getIntField(Object obj, String name, int def) {
        try { Field f = findField(obj.getClass(), name); if (f != null) { f.setAccessible(true); return ((Number) f.get(obj)).intValue(); } }
        catch (Exception ignored) {}
        return def;
    }

    private static long getLongField(Object obj, String name, long def) {
        try { Field f = findField(obj.getClass(), name); if (f != null) { f.setAccessible(true); return ((Number) f.get(obj)).longValue(); } }
        catch (Exception ignored) {}
        return def;
    }

    private static Method findMethodAnywhere(Object obj, String name) {
        try { Method m = obj.getClass().getMethod(name); m.setAccessible(true); return m; } catch (NoSuchMethodException ignored) {}
        Class<?> c = obj.getClass();
        while (c != null) {
            try { Method m = c.getDeclaredMethod(name); m.setAccessible(true); return m; }
            catch (NoSuchMethodException e) { c = c.getSuperclass(); }
        }
        return null;
    }

    private static int callIntMethod(Object obj, String name, int def) {
        try { Method m = findMethodAnywhere(obj, name); if (m != null && m.getParameterCount() == 0) return ((Number) m.invoke(obj)).intValue(); }
        catch (Exception ignored) {}
        return def;
    }

    private static long callLongMethod(Object obj, String name, long def) {
        try { Method m = findMethodAnywhere(obj, name); if (m != null && m.getParameterCount() == 0) return ((Number) m.invoke(obj)).longValue(); }
        catch (Exception ignored) {}
        return def;
    }

    private static String callStringMethod(Object obj, String name, String def) {
        try { Method m = findMethodAnywhere(obj, name); if (m != null && m.getParameterCount() == 0) { Object r = m.invoke(obj); return r != null ? r.toString() : def; } }
        catch (Exception ignored) {}
        return def;
    }

    // ================================================================
    //  OUTPUT
    // ================================================================

    private static void writeJson(String player, int level, long kamas,
                                   List<Map<String, Object>> bags, int totalItems) {
        try {
            String ts = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(new Date());
            StringBuilder json = new StringBuilder(16384);
            json.append("{\n  \"timestamp\": \"").append(ts).append("\",\n");
            json.append("  \"source\": \"inventory_passive_reader_v2.6\",\n");
            json.append("  \"player\": \"").append(esc(player)).append("\",\n");
            json.append("  \"level\": ").append(level).append(",\n");
            json.append("  \"kamas\": ").append(kamas).append(",\n");
            json.append("  \"totalBags\": ").append(bags.size()).append(",\n");
            json.append("  \"totalItems\": ").append(totalItems).append(",\n");
            json.append("  \"i18nLoaded\": ").append(i18nCache != null ? i18nCache.size() : 0).append(",\n");
            json.append("  \"bags\": [\n");
            for (int b = 0; b < bags.size(); b++) {
                Map<String, Object> bag = bags.get(b);
                if (b > 0) json.append(",\n");
                json.append("    {\"bagId\": \"").append(esc(str(bag.get("bagId")))).append("\",\n");
                if (bag.containsKey("bagName")) json.append("      \"bagName\": \"").append(esc(str(bag.get("bagName")))).append("\",\n");
                if (bag.containsKey("bagRefId")) json.append("      \"bagRefId\": ").append(bag.get("bagRefId")).append(",\n");
                if (bag.containsKey("capacity")) json.append("      \"capacity\": ").append(bag.get("capacity")).append(",\n");
                json.append("      \"source\": \"").append(esc(str(bag.get("source")))).append("\",\n");
                json.append("      \"itemCount\": ").append(bag.get("itemCount")).append(",\n");
                json.append("      \"items\": [\n");
                @SuppressWarnings("unchecked")
                List<Map<String, Object>> items = (List<Map<String, Object>>) bag.get("items");
                for (int i = 0; i < items.size(); i++) {
                    Map<String, Object> item = items.get(i);
                    if (i > 0) json.append(",\n");
                    json.append("        {\"refId\":").append(item.get("refId"));
                    json.append(",\"name\":\"").append(esc(str(item.get("name")))).append("\"");
                    json.append(",\"quantity\":").append(item.get("quantity"));
                    json.append(",\"uniqueId\":").append(item.get("uniqueId"));
                    if (item.containsKey("slot")) json.append(",\"slot\":").append(item.get("slot"));
                    json.append("}");
                }
                json.append("\n      ]}");
            }
            json.append("\n  ]\n}");
            try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(JSON_FILE), StandardCharsets.UTF_8))) { bw.write(json.toString()); bw.flush(); }
        } catch (Exception e) { debugLog("JSON error: " + e.getMessage()); errorLog(e); }
    }

    private static void writeLogSummary(String player, int level, long kamas,
                                         List<Map<String, Object>> bags, int totalItems) {
        try {
            String ts = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(LOG_FILE, true), StandardCharsets.UTF_8))) {
                bw.write("[" + ts + "] " + player + " Lv." + level + " | kamas=" + kamas + " | bags=" + bags.size() + " | items=" + totalItems + "\n");
                bw.flush();
            }
        } catch (Exception ignored) {}
    }

    private static String esc(String s) { return s == null ? "" : s.replace("\\","\\\\").replace("\"","\\\"").replace("\n","\\n").replace("\r","\\r"); }
    private static String str(Object o) { return o == null ? "" : o.toString(); }

    private static void debugLog(String msg) {
        try {
            String ts = new SimpleDateFormat("HH:mm:ss.SSS").format(new Date());
            synchronized (InventoryPassiveReader.class) {
                try (FileWriter fw = new FileWriter(DEBUG_LOG, true)) { fw.write("[" + ts + "] " + msg + "\n"); fw.flush(); }
            }
        } catch (Exception ignored) {}
    }

    private static void errorLog(Throwable t) {
        try {
            try (FileWriter fw = new FileWriter(ERROR_LOG, true)) {
                fw.write("[" + new Date() + "] " + t.getClass().getName() + ": " + t.getMessage() + "\n");
                StringWriter sw = new StringWriter(); t.printStackTrace(new PrintWriter(sw));
                fw.write(sw.toString() + "\n"); fw.flush();
            }
        } catch (Exception ignored) {}
    }
}

