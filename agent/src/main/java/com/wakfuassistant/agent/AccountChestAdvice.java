package com.wakfuassistant.agent;

import net.bytebuddy.asm.Advice;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.File;
import java.util.List;
import java.util.HashMap;

/**
 * AccountChestAdvice V1.2
 * - JSON encoding robuste via ItemEnchantExtractor.jsonEscape()
 * - Extraction des enchantements (gemmes, sublimations) par item
 * Hook: cSb.f() - triggered when chest UI opens/updates
 */
public class AccountChestAdvice {

    @Advice.OnMethodExit(suppress = Throwable.class)
    public static void onExit(@Advice.This Object self) {
        try {
            String logDir = "H:\\Code\\Wakfuassistant\\logs";
            String agentLog = "H:\\Code\\Wakfuassistant\\agent\\logs\\wakfu_agent_spy.log";
            String chestLog = logDir + "\\account_chest.log";
            String fullJson = logDir + "\\account_chest_full.json";
            String errorLog = logDir + "\\chest_hook_errors.log";
            String i18nPath = "H:\\Code\\Wakfuassistant\\docs\\RND\\data\\i18n_items_fr.json";

            String timestamp = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS").format(new java.util.Date());

            // === LOAD i18n ITEM NAMES ===
            HashMap<Integer, String> itemNames = new HashMap<Integer, String>();
            File i18nFile = new File(i18nPath);
            if (i18nFile.exists()) {
                try (BufferedReader br = new BufferedReader(new FileReader(i18nFile))) {
                    StringBuilder sb = new StringBuilder();
                    String line;
                    while ((line = br.readLine()) != null) {
                        sb.append(line);
                    }
                    String raw = sb.toString().trim();
                    if (raw.startsWith("{")) raw = raw.substring(1);
                    if (raw.endsWith("}")) raw = raw.substring(0, raw.length() - 1);

                    int pos = 0;
                    while (pos < raw.length()) {
                        int keyStart = raw.indexOf('"', pos);
                        if (keyStart == -1) break;
                        int keyEnd = raw.indexOf('"', keyStart + 1);
                        if (keyEnd == -1) break;
                        String key = raw.substring(keyStart + 1, keyEnd);

                        int colonPos = raw.indexOf(':', keyEnd);
                        if (colonPos == -1) break;
                        int valStart = raw.indexOf('"', colonPos);
                        if (valStart == -1) break;

                        int valEnd = valStart + 1;
                        while (valEnd < raw.length()) {
                            if (raw.charAt(valEnd) == '"' && raw.charAt(valEnd - 1) != '\\') {
                                break;
                            }
                            valEnd++;
                        }
                        if (valEnd >= raw.length()) break;
                        String value = raw.substring(valStart + 1, valEnd);
                        value = value.replace("\\\"", "\"").replace("\\\\", "\\");

                        try {
                            int itemId = Integer.parseInt(key);
                            itemNames.put(itemId, value);
                        } catch (NumberFormatException ignored) {}

                        pos = valEnd + 1;
                    }
                } catch (Exception e) {
                    try (PrintWriter pw = new PrintWriter(new FileWriter(errorLog, true))) {
                        pw.println("[" + timestamp + "] i18n load error: " + e.getMessage());
                    } catch (Exception ignored) {}
                }
            }

            // === READ CHEST DATA ===
            Field neeField = null;
            for (Field f : self.getClass().getDeclaredFields()) {
                if (f.getName().equals("nEE")) { neeField = f; break; }
            }
            if (neeField == null) return;
            neeField.setAccessible(true);
            Object contentView = neeField.get(self);
            if (contentView == null) return;

            String compartmentName = "unknown";
            String compartmentId = "unknown";
            boolean isReadOnly = false;
            int capacity = 0;

            try {
                Method m = contentView.getClass().getMethod("getName");
                Object v = m.invoke(contentView);
                if (v != null) compartmentName = v.toString();
            } catch (Exception ignored) {}

            try {
                Method m = contentView.getClass().getMethod("getId");
                Object v = m.invoke(contentView);
                if (v != null) compartmentId = v.toString();
            } catch (Exception ignored) {}

            try {
                Method m = contentView.getClass().getMethod("dtg");
                isReadOnly = (Boolean) m.invoke(contentView);
            } catch (Exception ignored) {}

            try {
                Method m = contentView.getClass().getMethod("ajt");
                capacity = (Integer) m.invoke(contentView);
            } catch (Exception ignored) {}

            // Get items
            Field iseField = null;
            for (Field f : contentView.getClass().getDeclaredFields()) {
                if (f.getName().equals("isE")) { iseField = f; break; }
            }
            if (iseField == null) return;
            iseField.setAccessible(true);
            Object itemContainer = iseField.get(contentView);
            if (itemContainer == null) return;

            Method fbaM = null;
            for (Method m : itemContainer.getClass().getDeclaredMethods()) {
                if (m.getName().equals("fba") && m.getParameterCount() == 0) { fbaM = m; break; }
            }
            if (fbaM == null) return;
            fbaM.setAccessible(true);
            List<?> items = (List<?>) fbaM.invoke(itemContainer);

            // === BUILD COMPARTMENT JSON ===
            StringBuilder cJson = new StringBuilder();
            cJson.append("    {\n");
            cJson.append("      \"id\": \"").append(ItemEnchantExtractor.jsonEscape(compartmentId)).append("\",\n");
            cJson.append("      \"name\": \"").append(ItemEnchantExtractor.jsonEscape(compartmentName)).append("\",\n");
            cJson.append("      \"isReadOnly\": ").append(isReadOnly).append(",\n");
            cJson.append("      \"capacity\": ").append(capacity).append(",\n");

            int itemCount = 0;
            int emptySlots = 0;
            int enchantedCount = 0;
            StringBuilder itemsJson = new StringBuilder();
            itemsJson.append("      \"items\": [\n");
            boolean first = true;

            for (int i = 0; i < items.size(); i++) {
                Object item = items.get(i);
                if (item == null) { emptySlots++; continue; }
                itemCount++;

                int refItemId = 0;
                short quantity = 0;
                long uniqueId = 0;
                short maxStack = 0;

                try { refItemId = (Integer) item.getClass().getMethod("avr").invoke(item); } catch (Exception ignored) {}
                try { quantity = (Short) item.getClass().getMethod("bfd").invoke(item); } catch (Exception ignored) {}
                try { uniqueId = (Long) item.getClass().getMethod("LV").invoke(item); } catch (Exception ignored) {}
                try { maxStack = (Short) item.getClass().getMethod("bfe").invoke(item); } catch (Exception ignored) {}

                // Resolve name
                String itemName = itemNames.getOrDefault(refItemId, "");
                if (itemName.isEmpty()) {
                    try {
                        Method dahM = item.getClass().getMethod("dah");
                        Object nameObj = dahM.invoke(item);
                        if (nameObj != null) itemName = nameObj.toString();
                    } catch (Exception ignored) {}
                }

                // Extraire enchantements
                String enchantJson = ItemEnchantExtractor.extractEnchantJson(item, itemNames);

                if (!first) itemsJson.append(",\n");
                first = false;
                itemsJson.append("        {\"slot\": ").append(i);
                itemsJson.append(", \"itemId\": ").append(refItemId);
                itemsJson.append(", \"name\": \"").append(ItemEnchantExtractor.jsonEscape(itemName)).append("\"");
                itemsJson.append(", \"quantity\": ").append(quantity);
                itemsJson.append(", \"maxStack\": ").append(maxStack);
                itemsJson.append(", \"uniqueId\": ").append(uniqueId);
                if (!enchantJson.isEmpty()) {
                    itemsJson.append(", ").append(enchantJson);
                    enchantedCount++;
                }
                itemsJson.append("}");
            }
            itemsJson.append("\n      ]");

            cJson.append("      \"itemCount\": ").append(itemCount).append(",\n");
            cJson.append("      \"enchantedCount\": ").append(enchantedCount).append(",\n");
            cJson.append("      \"emptySlots\": ").append(emptySlots).append(",\n");
            cJson.append(itemsJson).append("\n");
            cJson.append("    }");

            // === ACCUMULATE INTO FULL JSON ===
            File fullFile = new File(fullJson);
            HashMap<String, String> compartments = new HashMap<String, String>();

            if (fullFile.exists()) {
                try (BufferedReader br = new BufferedReader(new FileReader(fullFile))) {
                    StringBuilder sb = new StringBuilder();
                    String fileLine;
                    while ((fileLine = br.readLine()) != null) sb.append(fileLine).append("\n");
                    String existing = sb.toString().trim();

                    int searchPos = 0;
                    while (true) {
                        int idIdx = existing.indexOf("\"id\": \"", searchPos);
                        if (idIdx == -1) break;
                        int idStart = idIdx + 7;
                        int idEnd = existing.indexOf("\"", idStart);
                        if (idEnd == -1) break;
                        String existId = existing.substring(idStart, idEnd);

                        int blockStart = existing.lastIndexOf("{", idIdx);
                        int braceCount = 0;
                        int blockEnd = blockStart;
                        for (int k = blockStart; k < existing.length(); k++) {
                            if (existing.charAt(k) == '{') braceCount++;
                            if (existing.charAt(k) == '}') braceCount--;
                            if (braceCount == 0) { blockEnd = k + 1; break; }
                        }
                        String block = existing.substring(blockStart, blockEnd);
                        compartments.put(existId, block);
                        searchPos = blockEnd;
                    }
                } catch (Exception ignored) {}
            }

            compartments.put(compartmentId, cJson.toString());

            // Write full JSON
            StringBuilder fullOutput = new StringBuilder();
            fullOutput.append("{\n");
            fullOutput.append("  \"lastUpdate\": \"").append(timestamp).append("\",\n");
            fullOutput.append("  \"totalCompartments\": ").append(compartments.size()).append(",\n");

            int totalItems = 0;
            int totalCapacity = 0;
            int totalEnchanted = 0;

            fullOutput.append("  \"compartments\": [\n");
            boolean firstComp = true;
            for (String block : compartments.values()) {
                if (!firstComp) fullOutput.append(",\n");
                firstComp = false;
                fullOutput.append(block);

                try {
                    int icIdx = block.indexOf("\"itemCount\": ");
                    if (icIdx != -1) {
                        int numStart = icIdx + 13;
                        int numEnd = block.indexOf(",", numStart);
                        totalItems += Integer.parseInt(block.substring(numStart, numEnd).trim());
                    }
                    int capIdx = block.indexOf("\"capacity\": ");
                    if (capIdx != -1) {
                        int numStart = capIdx + 12;
                        int numEnd = block.indexOf(",", numStart);
                        totalCapacity += Integer.parseInt(block.substring(numStart, numEnd).trim());
                    }
                    int ecIdx = block.indexOf("\"enchantedCount\": ");
                    if (ecIdx != -1) {
                        int numStart = ecIdx + 18;
                        int numEnd = block.indexOf(",", numStart);
                        totalEnchanted += Integer.parseInt(block.substring(numStart, numEnd).trim());
                    }
                } catch (Exception ignored) {}
            }
            fullOutput.append("\n  ],\n");
            fullOutput.append("  \"totalItems\": ").append(totalItems).append(",\n");
            fullOutput.append("  \"totalEnchanted\": ").append(totalEnchanted).append(",\n");
            fullOutput.append("  \"totalCapacity\": ").append(totalCapacity).append("\n");
            fullOutput.append("}\n");

            try (PrintWriter pw = new PrintWriter(new FileWriter(fullJson, false))) {
                pw.print(fullOutput.toString());
            }

            // Summary log
            String summary = "[" + timestamp + "] CHEST V1.2 | " + compartmentName
                + " | items=" + itemCount + "/" + capacity
                + " | enchanted=" + enchantedCount
                + " | i18n=" + itemNames.size()
                + " | total=" + compartments.size() + " compartments";
            try (PrintWriter pw = new PrintWriter(new FileWriter(chestLog, true))) {
                pw.println(summary);
            }
            try (PrintWriter pw = new PrintWriter(new FileWriter(agentLog, true))) {
                pw.println("[" + timestamp.substring(11) + "] [CHEST V1.2] " + summary);
            }

        } catch (Throwable t) {
            try {
                String errorLog = "H:\\Code\\Wakfuassistant\\logs\\chest_hook_errors.log";
                try (java.io.PrintWriter pw = new java.io.PrintWriter(new java.io.FileWriter(errorLog, true))) {
                    pw.println("[" + new java.util.Date() + "] " + t.getClass().getName() + ": " + t.getMessage());
                    t.printStackTrace(pw);
                }
            } catch (Throwable ignored) {}
        }
    }
}
