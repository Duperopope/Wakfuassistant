package com.wakfuassistant.agent;

import net.bytebuddy.asm.Advice;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * CharacterAdvice - Hook sur cph.dn(byte[]) = msgId 12675
 * Capture: characterId, level, breed, equipmentSheet, spellDeck, bonusLevels
 * 
 * Structure de cph:
 *   long aDh        = characterId
 *   int jzC         = niveau du personnage
 *   eIg mdM         = classe/breed (enum via eIg.eO(byte))
 *   boolean mdH     = flag "donnees completes"
 *   eIj jyX         = stats/caracteristiques
 *   fhk jzA         = EquipmentSheet {Map<ffS,Long> soh = slot->itemUID, short ejt = level}
 *   frd jzG         = SpellDeckModel {int eoY = level, List<Int> sXv = actifs, List<Int> sXw = passifs}
 *   ehy_0 hOz       = BonusLevelSheet {Map<Int,Short> qua = levelsByBonus, short quc = sheetLevel}
 */
public class CharacterAdvice {

    private static final String LOG_FILE = "H:\\Code\\Wakfuassistant\\logs\\market_v3.log";
    private static final String PROTO_LOG = "H:\\Code\\Wakfuassistant\\logs\\market_v3_proto.log";
    private static final String CHAR_LOG = "H:\\Code\\Wakfuassistant\\logs\\character_data.log";
    private static final SimpleDateFormat SDF = new SimpleDateFormat("HH:mm:ss.SSS");

    @Advice.OnMethodExit
    public static void onExit(@Advice.This Object self, @Advice.Return boolean result) {
        try {
            if (!result && !hasFullData(self)) {
                // dn() returned false mais on tente quand meme si mdH=false
                // cph.dn() retourne false meme en succes (voir code source)
            }

            String timestamp = SDF.format(new Date());
            StringBuilder sb = new StringBuilder();
            StringBuilder charSb = new StringBuilder();

            // === Extraire characterId (long aDh) ===
            long characterId = getLongField(self, "aDh");

            // === Extraire niveau (int jzC) ===
            int level = getIntField(self, "jzC");

            // === Extraire classe/breed (eIg mdM) ===
            String breed = "UNKNOWN";
            try {
                Object mdM = getField(self, "mdM");
                if (mdM != null) {
                    breed = mdM.toString();
                    // Essayer d'obtenir le nom via name() si c'est un enum
                    try {
                        Method nameMethod = mdM.getClass().getMethod("name");
                        breed = (String) nameMethod.invoke(mdM);
                    } catch (Exception ignored) {}
                }
            } catch (Exception ignored) {}

            // === Extraire flag mdH ===
            boolean hasData = getBooleanField(self, "mdH");

            // === Ligne principale ===
            sb.append(timestamp)
              .append("|cph|msgId=12675|type=CHARACTER_FULL")
              .append("|characterId=").append(characterId)
              .append("|level=").append(level)
              .append("|breed=").append(breed)
              .append("|hasFullData=").append(hasData);

            // === Extraire EquipmentSheet (fhk jzA) ===
            charSb.append("=== CHARACTER DATA ").append(timestamp).append(" ===\n");
            charSb.append("characterId=").append(characterId).append("\n");
            charSb.append("level=").append(level).append("\n");
            charSb.append("breed=").append(breed).append("\n");
            charSb.append("hasFullData=").append(hasData).append("\n");

            if (hasData) {
                // --- EquipmentSheet ---
                try {
                    Object equipSheet = getField(self, "jzA");
                    if (equipSheet != null) {
                        // fhk.soh = Map<ffS, Long> (slot -> itemUID)
                        Object itemsMap = getField(equipSheet, "soh");
                        // fhk.ejt = short (level)
                        short equipLevel = getShortField(equipSheet, "ejt");

                        sb.append("|equipLevel=").append(equipLevel);
                        charSb.append("\n--- EQUIPMENT (level=").append(equipLevel).append(") ---\n");

                        if (itemsMap instanceof Map) {
                            Map<?, ?> map = (Map<?, ?>) itemsMap;
                            sb.append("|equipSlots=").append(map.size());
                            int slotIdx = 0;
                            for (Map.Entry<?, ?> entry : map.entrySet()) {
                                Object slotEnum = entry.getKey();
                                Object itemUid = entry.getValue();

                                // Extraire le nom du slot depuis l'enum ffS
                                String slotName = "SLOT_" + slotIdx;
                                byte slotByte = -1;
                                String slotDesc = "";
                                try {
                                    // ffS.shb = byte (index)
                                    Field shbField = slotEnum.getClass().getDeclaredField("shb");
                                    shbField.setAccessible(true);
                                    slotByte = shbField.getByte(slotEnum);
                                    slotName = slotEnum.toString();

                                    // ffS.shc = String (description comme "desc.equipment.head")
                                    Field shcField = slotEnum.getClass().getDeclaredField("shc");
                                    shcField.setAccessible(true);
                                    slotDesc = (String) shcField.get(slotEnum);
                                } catch (Exception ignored) {}

                                charSb.append("  slot[").append(slotByte)
                                       .append("] ").append(slotName)
                                       .append(" (").append(slotDesc).append(")")
                                       .append(" = itemUID:").append(itemUid)
                                       .append("\n");
                                slotIdx++;
                            }
                        }

                        // toString() de EquipmentSheet pour verification
                        charSb.append("  raw=").append(equipSheet.toString()).append("\n");
                    }
                } catch (Exception e) {
                    charSb.append("  EQUIP_ERROR: ").append(e.getMessage()).append("\n");
                }

                // --- SpellDeckModel ---
                try {
                    Object spellDeck = getField(self, "jzG");
                    if (spellDeck != null) {
                        // frd.eoY = int (level)
                        int deckLevel = getIntField(spellDeck, "eoY");
                        // frd.sXv = List<Integer> (active spells)
                        Object activeSpells = getField(spellDeck, "sXv");
                        // frd.sXw = List<Integer> (passive spells)
                        Object passiveSpells = getField(spellDeck, "sXw");

                        sb.append("|deckLevel=").append(deckLevel);
                        charSb.append("\n--- SPELL DECK (level=").append(deckLevel).append(") ---\n");
                        charSb.append("  activeSpells=").append(activeSpells).append("\n");
                        charSb.append("  passiveSpells=").append(passiveSpells).append("\n");

                        // toString() pour verification
                        charSb.append("  raw=").append(spellDeck.toString()).append("\n");
                    }
                } catch (Exception e) {
                    charSb.append("  SPELL_ERROR: ").append(e.getMessage()).append("\n");
                }

                // --- BonusLevelSheet ---
                try {
                    Object bonusSheet = getField(self, "hOz");
                    if (bonusSheet != null) {
                        // ehy_0.quc = short (sheet level)
                        short bonusLevel = getShortField(bonusSheet, "quc");
                        // ehy_0.qua = Map<Integer, Short> (levels by bonus)
                        Object bonusMap = getField(bonusSheet, "qua");

                        sb.append("|bonusLevel=").append(bonusLevel);
                        charSb.append("\n--- BONUS LEVELS (sheetLevel=").append(bonusLevel).append(") ---\n");

                        if (bonusMap instanceof Map) {
                            Map<?, ?> bm = (Map<?, ?>) bonusMap;
                            sb.append("|bonusCount=").append(bm.size());
                            for (Map.Entry<?, ?> entry : bm.entrySet()) {
                                charSb.append("  bonus[").append(entry.getKey())
                                       .append("] = level ").append(entry.getValue()).append("\n");
                            }
                        }

                        charSb.append("  raw=").append(bonusSheet.toString()).append("\n");
                    }
                } catch (Exception e) {
                    charSb.append("  BONUS_ERROR: ").append(e.getMessage()).append("\n");
                }

                // --- Stats/Caracteristiques ---
                try {
                    Object stats = getField(self, "jyX");
                    if (stats != null) {
                        charSb.append("\n--- STATS ---\n");
                        charSb.append("  class=").append(stats.getClass().getName()).append("\n");
                        charSb.append("  raw=").append(stats.toString()).append("\n");
                    }
                } catch (Exception e) {
                    charSb.append("  STATS_ERROR: ").append(e.getMessage()).append("\n");
                }
            }

            String logLine = sb.toString();
            String charData = charSb.toString();

            // Ecrire dans les logs
            synchronized (CharacterAdvice.class) {
                // Log principal (une ligne)
                try (PrintWriter pw = new PrintWriter(new FileWriter(LOG_FILE, true))) {
                    pw.println(logLine);
                }
                // Proto log (une ligne)
                try (PrintWriter pw = new PrintWriter(new FileWriter(PROTO_LOG, true))) {
                    pw.println(logLine);
                }
                // Character log (detail complet)
                try (PrintWriter pw = new PrintWriter(new FileWriter(CHAR_LOG, true))) {
                    pw.println(charData);
                    pw.println();
                }
            }

        } catch (Exception e) {
            try (PrintWriter pw = new PrintWriter(new FileWriter(
                    "H:\\Code\\Wakfuassistant\\agent\\logs\\wakfu_agent_spy.log", true))) {
                pw.println(new SimpleDateFormat("HH:mm:ss.SSS").format(new Date())
                    + " CHARACTER_HOOK_ERROR: " + e.getMessage());
                e.printStackTrace(pw);
            } catch (Exception ignored) {}
        }
    }

    // === Helpers reflexion ===

    private static Object getField(Object obj, String fieldName) throws Exception {
        Class<?> cls = obj.getClass();
        while (cls != null) {
            try {
                Field f = cls.getDeclaredField(fieldName);
                f.setAccessible(true);
                return f.get(obj);
            } catch (NoSuchFieldException e) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    private static long getLongField(Object obj, String fieldName) {
        try {
            Object val = getField(obj, fieldName);
            return val != null ? (Long) val : 0L;
        } catch (Exception e) { return 0L; }
    }

    private static int getIntField(Object obj, String fieldName) {
        try {
            Object val = getField(obj, fieldName);
            return val != null ? (Integer) val : 0;
        } catch (Exception e) { return 0; }
    }

    private static short getShortField(Object obj, String fieldName) {
        try {
            Object val = getField(obj, fieldName);
            return val != null ? (Short) val : 0;
        } catch (Exception e) { return 0; }
    }

    private static boolean getBooleanField(Object obj, String fieldName) {
        try {
            Object val = getField(obj, fieldName);
            return val != null && (Boolean) val;
        } catch (Exception e) { return false; }
    }

    private static boolean hasFullData(Object self) {
        return getBooleanField(self, "mdH");
    }
}