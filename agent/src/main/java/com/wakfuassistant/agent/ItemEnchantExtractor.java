package com.wakfuassistant.agent;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.util.Map;

/**
 * ItemEnchantExtractor V1.0
 * Utilitaire partagé pour extraire les enchantements (gemmes, sublimations)
 * d'un item Wakfu par réflexion.
 *
 * Source: décompilation ffV.java, fhi_0.java, fhn_0.java, rd_0.java
 * Chaîne: item.jRV (fhi_0) -> dTS() -> Map<Byte, fhn_0> (slots)
 *         item.jRV.spS = sublimation_item_id (via ahy())
 *         item.jRV.spT = special_sublimation_item_id (via ahA())
 *         fhn_0: air() = slottedItemId, dBe().aJr() = color byte, dSU() = amount
 */
public class ItemEnchantExtractor {

    private static final String[] COLOR_NAMES = {"None", "Red", "Green", "Blue", "White"};

    /**
     * Echappe une string pour JSON.
     */
    public static String jsonEscape(String s) {
        if (s == null) return "";
        StringBuilder sb = new StringBuilder(s.length() + 16);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '"':  sb.append("\\\""); break;
                case '\\': sb.append("\\\\"); break;
                case '\n': sb.append("\\n");  break;
                case '\r': sb.append("\\r");  break;
                case '\t': sb.append("\\t");  break;
                case '\b': sb.append("\\b");  break;
                case '\f': sb.append("\\f");  break;
                default:
                    if (c < 0x20) {
                        sb.append(String.format("\\u%04x", (int) c));
                    } else {
                        sb.append(c);
                    }
                    break;
            }
        }
        return sb.toString();
    }

    /**
     * Extrait les données d'enchantement d'un item et retourne un fragment JSON.
     * Retourne "" si l'item n'a pas d'enchantement.
     *
     * Approche multi-stratégie:
     *  1. Méthode dXg() -> boolean (a des gemmes?)
     *  2. Méthode eAZ() -> fhi_0 (ShardData)
     *  3. Méthode fYS() -> String résumé rapide
     *  4. Méthode dTS() -> Map<Byte, fhn_0> (slots détaillés)
     *  5. Méthodes ahy()/ahA() -> sublimation IDs
     *  6. Fallback: champ jRV directement
     *
     * @param item L'objet item (ffV ou sous-classe)
     * @param i18nItems Map optionnelle refId -> nom pour résoudre les gemmes/sublimations
     * @return Fragment JSON: "enchant": {...} ou ""
     */
    public static String extractEnchantJson(Object item, java.util.HashMap<Integer, String> i18nItems) {
        if (item == null) return "";

        try {
            // Stratégie 1: vérifier si l'item a des enchantements via dXg()
            boolean hasShards = false;
            try {
                Method dXgM = findMethod(item.getClass(), "dXg");
                if (dXgM != null) {
                    dXgM.setAccessible(true);
                    hasShards = (Boolean) dXgM.invoke(item);
                }
            } catch (Exception ignored) {}

            // Stratégie 2: accéder au champ jRV directement si dXg() échoue
            Object shardData = null;
            if (hasShards) {
                try {
                    Method eAZM = findMethod(item.getClass(), "eAZ");
                    if (eAZM != null) {
                        eAZM.setAccessible(true);
                        shardData = eAZM.invoke(item);
                    }
                } catch (Exception ignored) {}
            }

            // Fallback: accès direct au champ jRV
            if (shardData == null) {
                try {
                    Field jRVField = findField(item.getClass(), "jRV");
                    if (jRVField != null) {
                        jRVField.setAccessible(true);
                        shardData = jRVField.get(item);
                    }
                } catch (Exception ignored) {}
            }

            if (shardData == null) return "";

            // Extraire les slots via dTS() -> Map<Byte, fhn_0>
            Map<?, ?> slotsMap = null;
            try {
                Method dTSM = findMethod(shardData.getClass(), "dTS");
                if (dTSM != null) {
                    dTSM.setAccessible(true);
                    slotsMap = (Map<?, ?>) dTSM.invoke(shardData);
                }
            } catch (Exception ignored) {}

            // Extraire sublimation_item_id via ahy()
            int sublimationId = 0;
            try {
                Method ahyM = findMethod(shardData.getClass(), "ahy");
                if (ahyM != null) {
                    ahyM.setAccessible(true);
                    sublimationId = ((Number) ahyM.invoke(shardData)).intValue();
                }
            } catch (Exception ignored) {}

            // Extraire special_sublimation_item_id via ahA()
            int specialSublimationId = 0;
            try {
                Method ahAM = findMethod(shardData.getClass(), "ahA");
                if (ahAM != null) {
                    ahAM.setAccessible(true);
                    specialSublimationId = ((Number) ahAM.invoke(shardData)).intValue();
                }
            } catch (Exception ignored) {}

            // Extraire charges via fYJ()
            int charges = 0;
            try {
                Method fYJM = findMethod(shardData.getClass(), "fYJ");
                if (fYJM != null) {
                    fYJM.setAccessible(true);
                    charges = ((Number) fYJM.invoke(shardData)).intValue();
                }
            } catch (Exception ignored) {}

            // Extraire gemmes additionnelles via fYP() -> Map<fgg_0, Integer>
            Map<?, ?> additionalGems = null;
            try {
                Method fYPM = findMethod(shardData.getClass(), "fYP");
                if (fYPM != null) {
                    fYPM.setAccessible(true);
                    additionalGems = (Map<?, ?>) fYPM.invoke(shardData);
                }
            } catch (Exception ignored) {}

            // Construire le JSON
            StringBuilder json = new StringBuilder();
            json.append("\"enchant\": {");

            // Slots
            json.append("\"slots\": [");
            if (slotsMap != null && !slotsMap.isEmpty()) {
                boolean first = true;
                for (Map.Entry<?, ?> entry : slotsMap.entrySet()) {
                    if (!first) json.append(", ");
                    first = false;

                    byte position = ((Number) entry.getKey()).byteValue();
                    Object slot = entry.getValue();

                    int slottedItemId = 0;
                    int colorByte = 0;
                    int amount = 0;

                    // air() -> slottedItemId
                    try {
                        Method airM = findMethod(slot.getClass(), "air");
                        if (airM != null) {
                            airM.setAccessible(true);
                            slottedItemId = ((Number) airM.invoke(slot)).intValue();
                        }
                    } catch (Exception ignored) {}

                    // dBe() -> rd_0 enum -> aJr() -> byte couleur
                    try {
                        Method dBeM = findMethod(slot.getClass(), "dBe");
                        if (dBeM != null) {
                            dBeM.setAccessible(true);
                            Object colorEnum = dBeM.invoke(slot);
                            if (colorEnum != null) {
                                Method aJrM = findMethod(colorEnum.getClass(), "aJr");
                                if (aJrM != null) {
                                    aJrM.setAccessible(true);
                                    colorByte = ((Number) aJrM.invoke(colorEnum)).intValue();
                                }
                            }
                        }
                    } catch (Exception ignored) {}

                    // dSU() -> shardsAmount
                    try {
                        Method dSUM = findMethod(slot.getClass(), "dSU");
                        if (dSUM != null) {
                            dSUM.setAccessible(true);
                            amount = ((Number) dSUM.invoke(slot)).intValue();
                        }
                    } catch (Exception ignored) {}

                    String colorName = (colorByte >= 0 && colorByte < COLOR_NAMES.length) ? COLOR_NAMES[colorByte] : "Unknown";
                    String gemName = "";
                    if (slottedItemId > 0 && i18nItems != null) {
                        gemName = i18nItems.getOrDefault(slottedItemId, "");
                    }

                    json.append("{\"pos\": ").append(position);
                    json.append(", \"color\": \"").append(colorName).append("\"");
                    json.append(", \"colorId\": ").append(colorByte);
                    json.append(", \"gemId\": ").append(slottedItemId);
                    if (!gemName.isEmpty()) {
                        json.append(", \"gemName\": \"").append(jsonEscape(gemName)).append("\"");
                    }
                    json.append(", \"amount\": ").append(amount);
                    json.append("}");
                }
            }
            json.append("]");

            // Sublimation
            json.append(", \"sublimationId\": ").append(sublimationId);
            if (sublimationId > 0 && i18nItems != null) {
                String subName = i18nItems.getOrDefault(sublimationId, "");
                if (!subName.isEmpty()) {
                    json.append(", \"sublimationName\": \"").append(jsonEscape(subName)).append("\"");
                }
            }

            // Special sublimation (épique/relique)
            json.append(", \"specialSublimationId\": ").append(specialSublimationId);
            if (specialSublimationId > 0 && i18nItems != null) {
                String specName = i18nItems.getOrDefault(specialSublimationId, "");
                if (!specName.isEmpty()) {
                    json.append(", \"specialSublimationName\": \"").append(jsonEscape(specName)).append("\"");
                }
            }

            // Charges
            json.append(", \"charges\": ").append(charges);

            // Gemmes additionnelles
            json.append(", \"additionalGems\": [");
            if (additionalGems != null && !additionalGems.isEmpty()) {
                boolean first = true;
                for (Map.Entry<?, ?> entry : additionalGems.entrySet()) {
                    if (!first) json.append(", ");
                    first = false;

                    Object propertyEnum = entry.getKey();
                    int gemRefId = ((Number) entry.getValue()).intValue();

                    // Extraire l'ID de la propriété via d()
                    int propertyId = 0;
                    try {
                        Method dM = findMethod(propertyEnum.getClass(), "d");
                        if (dM != null) {
                            dM.setAccessible(true);
                            propertyId = ((Number) dM.invoke(propertyEnum)).intValue();
                        }
                    } catch (Exception ignored) {}

                    String gemName = "";
                    if (gemRefId > 0 && i18nItems != null) {
                        gemName = i18nItems.getOrDefault(gemRefId, "");
                    }

                    json.append("{\"propertyId\": ").append(propertyId);
                    json.append(", \"gemRefId\": ").append(gemRefId);
                    if (!gemName.isEmpty()) {
                        json.append(", \"gemName\": \"").append(jsonEscape(gemName)).append("\"");
                    }
                    json.append("}");
                }
            }
            json.append("]");

            // Résumé string via fYS() (bonus debug)
            try {
                Method fYSM = findMethod(shardData.getClass(), "fYS");
                if (fYSM != null) {
                    fYSM.setAccessible(true);
                    String summary = (String) fYSM.invoke(shardData);
                    if (summary != null && !summary.isEmpty()) {
                        json.append(", \"summary\": \"").append(jsonEscape(summary)).append("\"");
                    }
                }
            } catch (Exception ignored) {}

            json.append("}");
            return json.toString();

        } catch (Exception e) {
            return "";
        }
    }

    /**
     * Cherche une méthode par nom dans la hiérarchie de classes.
     */
    private static Method findMethod(Class<?> cls, String name) {
        Class<?> current = cls;
        while (current != null) {
            for (Method m : current.getDeclaredMethods()) {
                if (m.getName().equals(name) && m.getParameterCount() == 0) {
                    return m;
                }
            }
            current = current.getSuperclass();
        }
        return null;
    }

    /**
     * Cherche un champ par nom dans la hiérarchie de classes.
     */
    private static Field findField(Class<?> cls, String name) {
        Class<?> current = cls;
        while (current != null) {
            for (Field f : current.getDeclaredFields()) {
                if (f.getName().equals(name)) {
                    return f;
                }
            }
            current = current.getSuperclass();
        }
        return null;
    }
}
