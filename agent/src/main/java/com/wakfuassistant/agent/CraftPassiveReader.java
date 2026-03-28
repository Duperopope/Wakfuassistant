package com.wakfuassistant.agent;

import java.io.*;
import java.lang.reflect.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.*;

/**
 * CraftPassiveReader V4 — Lecture passive des metiers
 * 
 * Au lieu de hooker une methode (qui perturbe le flux),
 * on lance un timer qui lit periodiquement les donnees craft
 * via baj_2.hzf.cZr() une fois que le joueur est connecte.
 * 
 * Zero hook ByteBuddy = zero perturbation du client.
 */
public class CraftPassiveReader {

    private static final String LOG_DIR = "H:\\Code\\Wakfuassistant\\logs";
    private static volatile boolean captured = false;
    private static ScheduledExecutorService scheduler;

    private static final Map<Integer, String> CRAFT_NAMES = new LinkedHashMap<>();
    static {
        CRAFT_NAMES.put(40, "Boulanger");
        CRAFT_NAMES.put(64, "Paysan");
        CRAFT_NAMES.put(71, "Forestier");
        CRAFT_NAMES.put(72, "Herboriste");
        CRAFT_NAMES.put(73, "Mineur");
        CRAFT_NAMES.put(74, "Trappeur");
        CRAFT_NAMES.put(75, "Pecheur");
        CRAFT_NAMES.put(76, "Cuisinier");
        CRAFT_NAMES.put(77, "Armurier");
        CRAFT_NAMES.put(78, "Bijoutier");
        CRAFT_NAMES.put(79, "Tailleur");
        CRAFT_NAMES.put(80, "Maroquinier");
        CRAFT_NAMES.put(81, "Ebeniste");
        CRAFT_NAMES.put(82, "Costumage");
        CRAFT_NAMES.put(83, "Maitre d'Armes");
    }

    /**
     * Lance le timer passif. Appele depuis WakfuSpyAgent.premain().
     * Attend 30s puis tente de lire les crafts toutes les 15s.
     * S'arrete automatiquement apres la premiere capture reussie.
     */
    public static void startPassiveCapture() {
        scheduler = Executors.newSingleThreadScheduledExecutor(r -> {
            Thread t = new Thread(r, "CraftPassiveReader");
            t.setDaemon(true);
            return t;
        });

        System.out.println("[CRAFT-V4] Passive reader started — will attempt capture in 30s");

        scheduler.scheduleAtFixedRate(() -> {
            if (captured) return;
            try {
                attemptCapture();
            } catch (Exception e) {
                System.out.println("[CRAFT-V4] Not ready yet: " + e.getMessage());
            }
        }, 30, 15, TimeUnit.SECONDS);
    }

    private static void attemptCapture() throws Exception {
        // Etape 1 : Trouver la classe baj_2 (JVM: baJ) — singleton craft manager
        Class<?> bajClass = null;
        String[] possibleNames = {"baJ", "baj_2", "baj$2"};
        for (String name : possibleNames) {
            try {
                bajClass = Class.forName(name);
                break;
            } catch (ClassNotFoundException ignored) {}
        }
        if (bajClass == null) {
            // Chercher via le classloader du thread
            ClassLoader cl = Thread.currentThread().getContextClassLoader();
            if (cl == null) cl = ClassLoader.getSystemClassLoader();
            for (String name : possibleNames) {
                try {
                    bajClass = cl.loadClass(name);
                    break;
                } catch (ClassNotFoundException ignored) {}
            }
        }
        if (bajClass == null) {
            throw new RuntimeException("baJ class not found");
        }

        // Etape 2 : Acceder au singleton hzf
        Field hzfField = bajClass.getDeclaredField("hzf");
        hzfField.setAccessible(true);
        Object singleton = hzfField.get(null);
        if (singleton == null) {
            throw new RuntimeException("baJ.hzf singleton is null");
        }

        // Etape 3 : Appeler cZr() → retourne eki_0 (le handler craft du joueur local)
        Method cZrMethod = singleton.getClass().getMethod("cZr");
        Object ekiInstance = cZrMethod.invoke(singleton);
        if (ekiInstance == null) {
            throw new RuntimeException("cZr() returned null");
        }

        // Etape 4 : Appeler fyp() → Set<Integer> (IDs des metiers connus)
        Method fypMethod = ekiInstance.getClass().getMethod("fyp");
        Set<?> knownIds = (Set<?>) fypMethod.invoke(ekiInstance);

        if (knownIds == null || knownIds.isEmpty()) {
            throw new RuntimeException("No known professions yet (fyp empty)");
        }

        System.out.println("[CRAFT-V4] Found " + knownIds.size() + " professions! Capturing...");

        // Etape 5 : Appeler fyx() → Map<Integer, Short> (craftId → level)
        Method fyxMethod = ekiInstance.getClass().getMethod("fyx");
        Map<?, ?> levelMap = (Map<?, ?>) fyxMethod.invoke(ekiInstance);

        // Etape 6 : Appeler qL() → Map<Integer, eku_0> pour les details
        Map<?, ?> detailMap = null;
        try {
            Method qLMethod = ekiInstance.getClass().getMethod("qL");
            detailMap = (Map<?, ?>) qLMethod.invoke(ekiInstance);
        } catch (NoSuchMethodException e) {
            System.out.println("[CRAFT-V4] qL() not available, using level-only mode");
        }

        // Etape 7 : Construire les donnees
        new File(LOG_DIR).mkdirs();
        StringBuilder logSb = new StringBuilder();
        List<String> jsonEntries = new ArrayList<>();
        int knownCount = 0;

        logSb.append("=== CRAFT PROFESSIONS V4 (Passive Reader) ===\n");
        logSb.append("Timestamp: ").append(new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())).append("\n");
        logSb.append("Profession IDs found: ").append(knownIds).append("\n\n");

        for (Object idObj : knownIds) {
            int craftId = ((Number) idObj).intValue();
            String name = CRAFT_NAMES.getOrDefault(craftId, "Metier_" + craftId);
            short level = 0;
            long xp = 0;
            int successes = 0;
            long products = 0;
            double progressPercent = 0.0;

            if (levelMap.containsKey(craftId)) {
                level = ((Number) levelMap.get(craftId)).shortValue();
            }

            if (detailMap != null) {
                Object eku = detailMap.get(craftId);
                if (eku != null) {
                    try { xp = ((Number) eku.getClass().getMethod("pf").invoke(eku)).longValue(); } catch (Exception ignored) {}
                    try { successes = ((Number) eku.getClass().getMethod("pH").invoke(eku)).intValue(); } catch (Exception ignored) {}
                    try { products = ((Number) eku.getClass().getMethod("pN").invoke(eku)).longValue(); } catch (Exception ignored) {}
                }
            }

            long xpForCurrentLevel = 75L * level * level;
            long xpForNextLevel = 75L * (level + 1) * (level + 1);
            long xpInLevel = xp - xpForCurrentLevel;
            long xpNeeded = xpForNextLevel - xpForCurrentLevel;
            if (xpNeeded > 0) {
                progressPercent = (xpInLevel * 100.0) / xpNeeded;
            }

            knownCount++;
            logSb.append(String.format("  %-20s Lv.%3d | XP: %d/%d (%.1f%%) | Succes: %d | Produits: %d%n",
                    name, level, xpInLevel, xpNeeded, progressPercent, successes, products));

            jsonEntries.add(String.format(
                "    {\"id\":%d,\"name\":\"%s\",\"level\":%d,\"totalXp\":%d,\"xpInLevel\":%d,\"xpNeeded\":%d,\"progressPercent\":%.1f,\"successes\":%d,\"products\":%d,\"isKnown\":true}",
                craftId, name, level, xp, xpInLevel, xpNeeded, progressPercent, successes, products));

            System.out.println("[CRAFT-V4] " + name + " Lv." + level + " (" + String.format("%.1f", progressPercent) + "%)");
        }

        logSb.append("\nTotal known: ").append(knownCount).append("/").append(CRAFT_NAMES.size()).append("\n");

        // Ecrire log
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(LOG_DIR + "\\craft_professions.log"), StandardCharsets.UTF_8))) {
            bw.write(logSb.toString());
            bw.flush();
        }

        // Ecrire JSON
        StringBuilder jsonSb = new StringBuilder();
        jsonSb.append("{\n");
        jsonSb.append("  \"timestamp\": \"").append(new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(new Date())).append("\",\n");
        jsonSb.append("  \"source\": \"passive_reader_v4\",\n");
        jsonSb.append("  \"totalProfessions\": ").append(CRAFT_NAMES.size()).append(",\n");
        jsonSb.append("  \"knownProfessions\": ").append(knownCount).append(",\n");
        jsonSb.append("  \"professions\": [\n");
        jsonSb.append(String.join(",\n", jsonEntries));
        jsonSb.append("\n  ]\n}");

        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(LOG_DIR + "\\craft_professions.json"), StandardCharsets.UTF_8))) {
            bw.write(jsonSb.toString());
            bw.flush();
        }

        System.out.println("[CRAFT-V4] === CAPTURE COMPLETE: " + knownCount + " professions saved ===");
        captured = true;

        // Arreter le timer
        if (scheduler != null) {
// V4.1: continuous capture (no shutdown)
        }
    }
}


