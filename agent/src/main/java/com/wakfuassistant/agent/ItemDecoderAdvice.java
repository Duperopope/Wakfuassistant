package com.wakfuassistant.agent;

import net.bytebuddy.asm.Advice;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class ItemDecoderAdvice {

    @Advice.OnMethodExit(suppress = Throwable.class)
    public static void onExit(
            @Advice.Argument(0) byte[] rawBytes,
            @Advice.Return Object itemObj) {

        try {
            if (itemObj == null) return;

            String ts = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS")
                .format(new java.util.Date());

            Class<?> itemClass = itemObj.getClass();

            // ffV.getName() existe directement — recuperation du nom de l'item
            String itemName = "";
            try {
                java.lang.reflect.Method getNameMethod = itemClass.getDeclaredMethod("getName");
                getNameMethod.setAccessible(true);
                Object nameResult = getNameMethod.invoke(itemObj);
                if (nameResult != null) itemName = nameResult.toString();
            } catch (Exception ignored) {}

            java.lang.reflect.Field[] allFields = itemClass.getDeclaredFields();

            java.util.ArrayList<java.lang.reflect.Field> longFields = new java.util.ArrayList<>();
            java.util.ArrayList<java.lang.reflect.Field> intFields = new java.util.ArrayList<>();
            java.util.ArrayList<java.lang.reflect.Field> shortFields = new java.util.ArrayList<>();
            java.util.ArrayList<java.lang.reflect.Field> objectFields = new java.util.ArrayList<>();

            for (java.lang.reflect.Field f : allFields) {
                if (java.lang.reflect.Modifier.isStatic(f.getModifiers())) continue;
                f.setAccessible(true);
                Class<?> ft = f.getType();
                if (ft == long.class) longFields.add(f);
                else if (ft == int.class) intFields.add(f);
                else if (ft == short.class) shortFields.add(f);
                else if (!ft.isPrimitive()) objectFields.add(f);
            }

            long uniqueId = 0;
            short quantity = 0;
            int refId = 0;

            if (longFields.size() > 0) {
                uniqueId = longFields.get(0).getLong(itemObj);
            }
            if (shortFields.size() > 0) {
                quantity = shortFields.get(0).getShort(itemObj);
            }

            // Chercher refId via methode avr()
            try {
                java.lang.reflect.Method avrMethod = null;
                for (java.lang.reflect.Method m : itemClass.getDeclaredMethods()) {
                    if (m.getParameterCount() == 0 && m.getReturnType() == int.class) {
                        String mname = m.getName();
                        if (mname.equals("avr") || mname.equals("aVr")) {
                            avrMethod = m;
                            break;
                        }
                    }
                }
                if (avrMethod != null) {
                    avrMethod.setAccessible(true);
                    refId = (int) avrMethod.invoke(itemObj);
                }
            } catch (Exception e) {
                // fallback
            }

            if (refId == 0) {
                for (java.lang.reflect.Field of : objectFields) {
                    try {
                        Object sub = of.get(itemObj);
                        if (sub == null) continue;
                        for (java.lang.reflect.Method m : sub.getClass().getDeclaredMethods()) {
                            if (m.getParameterCount() == 0 && m.getReturnType() == int.class) {
                                String mn = m.getName();
                                if (mn.equals("avr") || mn.equals("aVr")) {
                                    m.setAccessible(true);
                                    refId = (int) m.invoke(sub);
                                    break;
                                }
                            }
                        }
                        if (refId != 0) break;
                    } catch (Exception e) {
                        // continue
                    }
                }
            }

            // === SHARDS ===
            StringBuilder shardsJson = new StringBuilder();
            shardsJson.append("[");
            int shardCount = 0;
            int sublimationId = 0;
            int specialSublimId = 0;
            StringBuilder gemsJson = new StringBuilder();
            gemsJson.append("[");
            int gemCount = 0;

            for (java.lang.reflect.Field of : objectFields) {
                try {
                    Object sub = of.get(itemObj);
                    if (sub == null) continue;

                    Class<?> subClass = sub.getClass();
                    java.lang.reflect.Field[] subFields = subClass.getDeclaredFields();

                    boolean hasMap = false;
                    java.lang.reflect.Field mapField = null;
                    java.util.ArrayList<java.lang.reflect.Field> subIntFields = new java.util.ArrayList<>();

                    for (java.lang.reflect.Field sf : subFields) {
                        if (java.lang.reflect.Modifier.isStatic(sf.getModifiers())) continue;
                        sf.setAccessible(true);
                        if (java.util.Map.class.isAssignableFrom(sf.getType())) {
                            hasMap = true;
                            mapField = sf;
                        }
                        if (sf.getType() == int.class) {
                            subIntFields.add(sf);
                        }
                    }

                    if (hasMap && mapField != null) {
                        if (subIntFields.size() >= 2) {
                            sublimationId = subIntFields.get(0).getInt(sub);
                            specialSublimId = subIntFields.get(1).getInt(sub);
                        } else if (subIntFields.size() == 1) {
                            sublimationId = subIntFields.get(0).getInt(sub);
                        }

                        java.util.Map<?, ?> shardMap = (java.util.Map<?, ?>) mapField.get(sub);
                        if (shardMap != null) {
                            for (java.util.Map.Entry<?, ?> entry : shardMap.entrySet()) {
                                Object slotKey = entry.getKey();
                                Object shard = entry.getValue();
                                if (shard == null) continue;

                                Class<?> shardClass = shard.getClass();
                                java.lang.reflect.Field[] shardFields = shardClass.getDeclaredFields();

                                int effectId = 0;
                                int stateId = 0;
                                String colorName = "UNKNOWN";
                                int shardIntIndex = 0;

                                for (java.lang.reflect.Field shf : shardFields) {
                                    if (java.lang.reflect.Modifier.isStatic(shf.getModifiers())) continue;
                                    shf.setAccessible(true);

                                    if (shf.getType() == int.class) {
                                        int val = shf.getInt(shard);
                                        if (shardIntIndex == 0) effectId = val;
                                        else if (shardIntIndex == 1) stateId = val;
                                        shardIntIndex++;
                                    } else if (shf.getType().isEnum()) {
                                        Object enumVal = shf.get(shard);
                                        if (enumVal != null) {
                                            colorName = enumVal.toString();
                                            try {
                                                java.lang.reflect.Method ordMethod = enumVal.getClass().getMethod("ordinal");
                                                int ord = (int) ordMethod.invoke(enumVal);
                                                String[] colorNames = {"NONE", "RED", "BLUE", "GREEN", "WHITE"};
                                                if (ord >= 0 && ord < colorNames.length) {
                                                    colorName = colorNames[ord];
                                                } else {
                                                    colorName = "ORD_" + ord;
                                                }
                                            } catch (Exception e) {
                                                // keep toString
                                            }
                                        }
                                    }
                                }

                                if (shardCount > 0) shardsJson.append(",");
                                shardsJson.append("{\"slot\":").append(slotKey);
                                shardsJson.append(",\"effectId\":").append(effectId);
                                shardsJson.append(",\"stateId\":").append(stateId);
                                shardsJson.append(",\"color\":\"").append(colorName).append("\"");
                                shardsJson.append("}");
                                shardCount++;
                            }
                        }

                        for (java.lang.reflect.Field sf : subFields) {
                            if (java.lang.reflect.Modifier.isStatic(sf.getModifiers())) continue;
                            sf.setAccessible(true);
                            if (java.util.List.class.isAssignableFrom(sf.getType())) {
                                java.util.List<?> gemList = (java.util.List<?>) sf.get(sub);
                                if (gemList != null) {
                                    for (Object gem : gemList) {
                                        if (gem == null) continue;
                                        Class<?> gemClass = gem.getClass();
                                        java.lang.reflect.Field[] gemFields = gemClass.getDeclaredFields();
                                        int gemEffectId = 0;
                                        int gemStateId = 0;
                                        int gemIntIdx = 0;
                                        for (java.lang.reflect.Field gf : gemFields) {
                                            if (java.lang.reflect.Modifier.isStatic(gf.getModifiers())) continue;
                                            gf.setAccessible(true);
                                            if (gf.getType() == int.class) {
                                                int v = gf.getInt(gem);
                                                if (gemIntIdx == 0) gemEffectId = v;
                                                else if (gemIntIdx == 1) gemStateId = v;
                                                gemIntIdx++;
                                            }
                                        }
                                        if (gemCount > 0) gemsJson.append(",");
                                        gemsJson.append("{\"effectId\":").append(gemEffectId);
                                        gemsJson.append(",\"stateId\":").append(gemStateId);
                                        gemsJson.append("}");
                                        gemCount++;
                                    }
                                }
                            }
                        }
                        break;
                    }
                } catch (Exception e) {
                    // continue
                }
            }
            shardsJson.append("]");
            gemsJson.append("]");

            // === OPTIONAL BLOCKS ===
            StringBuilder optionalBlocks = new StringBuilder();
            int blockIndex = 0;
            for (java.lang.reflect.Field of : objectFields) {
                try {
                    Object sub = of.get(itemObj);
                    if (sub == null) continue;
                    String subClassName = sub.getClass().getSimpleName();
                    if (blockIndex > 0 && !subClassName.isEmpty()) {
                        if (optionalBlocks.length() > 0) optionalBlocks.append(",");
                        optionalBlocks.append("\"").append(of.getName()).append("\":\"").append(subClassName).append("\"");
                    }
                    blockIndex++;
                } catch (Exception e) {
                    // skip
                }
            }

            // === BUILD JSON ===
            StringBuilder json = new StringBuilder(2048);
            json.append("{");
            json.append("\"ts\":\"").append(ts).append("\"");
            json.append(",\"uniqueId\":").append(uniqueId);
            json.append(",\"refId\":").append(refId);
            json.append(",\"quantity\":").append(quantity);
            json.append(",\"rawSize\":").append(rawBytes != null ? rawBytes.length : 0);
            json.append(",\"shardCount\":").append(shardCount);
            json.append(",\"shards\":").append(shardsJson.toString());
            json.append(",\"gemCount\":").append(gemCount);
            json.append(",\"gems\":").append(gemsJson.toString());
            json.append(",\"sublimationId\":").append(sublimationId);
            json.append(",\"specialSublimId\":").append(specialSublimId);
            if (optionalBlocks.length() > 0) {
                json.append(",\"optionalBlocks\":{").append(optionalBlocks.toString()).append("}");
            }
            json.append(",\"itemClass\":\"").append(itemClass.getSimpleName()).append("\"");
            json.append(",\"name\":\"").append(itemName.replace("\"", "'")).append("\"");
            json.append("}");

            com.wakfuassistant.agent.ItemLogWriter.writeItem(json.toString());

            String summary = ts + "|ITEM_DECODED|uid=" + uniqueId + "|ref=" + refId
                + "|name=" + itemName
                + "|qty=" + quantity + "|shards=" + shardCount + "|gems=" + gemCount
                + "|sublim=" + sublimationId + "|rawSize=" + (rawBytes != null ? rawBytes.length : 0);
            com.wakfuassistant.agent.WakfuSpyAgent.log(summary);
            com.wakfuassistant.agent.ItemLogWriter.writeSummary(summary);

        } catch (Exception e) {
            try {
                com.wakfuassistant.agent.WakfuSpyAgent.log(
                    "ITEM_DECODE_ERROR|" + e.getClass().getSimpleName() + "|" + e.getMessage());
            } catch (Exception ignore) {}
        }
    }
}
