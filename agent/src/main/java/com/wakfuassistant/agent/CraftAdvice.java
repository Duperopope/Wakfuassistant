package com.wakfuassistant.agent;

import net.bytebuddy.asm.Advice;
import java.io.*;
import java.lang.reflect.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class CraftAdvice {

    private static final String LOG_DIR = "H:\\Code\\Wakfuassistant\\logs";

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

    @Advice.OnMethodExit
    public static void afterDeserialize(@Advice.This Object self) {
        try {
            System.out.println("[CRAFT-V3] === ekv_0.a() called — deserializing craft data ===");

            // self = ekv_0 instance
            // Acceder au champ qCo (eki_0 / eky_0)
            Field qCoField = self.getClass().getDeclaredField("qCo");
            qCoField.setAccessible(true);
            Object ekiInstance = qCoField.get(self);

            if (ekiInstance == null) {
                System.out.println("[CRAFT-V3] qCo is null, skipping");
                return;
            }

            // Appeler fyp() → Set<Integer> (IDs des metiers connus)
            Method fypMethod = ekiInstance.getClass().getMethod("fyp");
            Set<?> knownIds = (Set<?>) fypMethod.invoke(ekiInstance);
            System.out.println("[CRAFT-V3] Known profession IDs: " + knownIds);

            if (knownIds == null || knownIds.isEmpty()) {
                System.out.println("[CRAFT-V3] No known professions yet, skipping");
                return;
            }

            // Appeler fyx() → Map<Integer, Short> (craftId → level)
            Method fyxMethod = ekiInstance.getClass().getMethod("fyx");
            Map<?, ?> levelMap = (Map<?, ?>) fyxMethod.invoke(ekiInstance);

            // Appeler qL() → Map<Integer, eku_0> pour les details
            Method qLMethod = ekiInstance.getClass().getMethod("qL");
            Map<?, ?> detailMap = (Map<?, ?>) qLMethod.invoke(ekiInstance);

            // Preparer le log et le JSON
            new File(LOG_DIR).mkdirs();
            StringBuilder logSb = new StringBuilder();
            StringBuilder jsonSb = new StringBuilder();

            int knownCount = 0;
            List<String> jsonEntries = new ArrayList<>();

            logSb.append("=== CRAFT PROFESSIONS V3 (Network Hook) ===\n");
            logSb.append("Timestamp: ").append(new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())).append("\n");
            logSb.append("Total profession IDs: ").append(knownIds.size()).append("\n\n");

            for (Object idObj : knownIds) {
                int craftId = ((Number) idObj).intValue();
                String name = CRAFT_NAMES.getOrDefault(craftId, "Metier_" + craftId);
                short level = 0;
                long xp = 0;
                int successes = 0;
                long products = 0;
                double progressPercent = 0.0;

                // Niveau depuis fyx()
                if (levelMap.containsKey(craftId)) {
                    level = ((Number) levelMap.get(craftId)).shortValue();
                }

                // Details depuis qL() → eku_0
                Object eku = detailMap.get(craftId);
                if (eku != null) {
                    try {
                        // pf() → total XP (long)
                        Method pfMethod = eku.getClass().getMethod("pf");
                        xp = ((Number) pfMethod.invoke(eku)).longValue();
                    } catch (Exception ignored) {}
                    try {
                        // pH() → successes (int)
                        Method pHMethod = eku.getClass().getMethod("pH");
                        successes = ((Number) pHMethod.invoke(eku)).intValue();
                    } catch (Exception ignored) {}
                    try {
                        // pN() → products (long)
                        Method pNMethod = eku.getClass().getMethod("pN");
                        products = ((Number) pNMethod.invoke(eku)).longValue();
                    } catch (Exception ignored) {}
                }

                // Calculer progression XP dans le niveau actuel
                // Formule: dV(level) = 75 * level * level
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

                System.out.println("[CRAFT-V3] " + name + " Lv." + level + " XP:" + xp + " (" + String.format("%.1f", progressPercent) + "%)");
            }

            logSb.append("\nTotal known: ").append(knownCount).append("/").append(CRAFT_NAMES.size()).append("\n");

            // Ecrire le log
            try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(LOG_DIR + "\\craft_professions.log"), StandardCharsets.UTF_8))) {
                bw.write(logSb.toString());
                bw.flush();
            }

            // Ecrire le JSON
            jsonSb.append("{\n");
            jsonSb.append("  \"timestamp\": \"").append(new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(new Date())).append("\",\n");
            jsonSb.append("  \"source\": \"network_hook_v3\",\n");
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

            System.out.println("[CRAFT-V3] === Done: " + knownCount + " professions saved ===");

        } catch (Exception e) {
            System.out.println("[CRAFT-V3] ERROR: " + e.getMessage());
            e.printStackTrace();
            try {
                new File(LOG_DIR).mkdirs();
                try (PrintWriter pw = new PrintWriter(new FileWriter(LOG_DIR + "\\craft_hook_errors.log", true))) {
                    pw.println(new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + " - " + e.getMessage());
                    e.printStackTrace(pw);
                }
            } catch (Exception ignored) {}
        }
    }
}
