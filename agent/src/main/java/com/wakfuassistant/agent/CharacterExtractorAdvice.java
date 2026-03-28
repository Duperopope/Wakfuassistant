package com.wakfuassistant.agent;

import net.bytebuddy.asm.Advice;

public class CharacterExtractorAdvice {

    // === BRIDGE : reference vers le dernier joueur local detecte ===
    // InventoryPassiveReader V2 lira ce champ pour acceder a ieV/ieT
    public static volatile Object lastLocalPlayer = null;
    public static volatile long lastLocalPlayerTimestamp = 0;

    @Advice.OnMethodExit(onThrowable = Throwable.class, suppress = Throwable.class)
    public static void onExit(
            @Advice.This Object self,
            @Advice.Argument(0) byte[] data) {
        try {
            int dataSize = (data != null) ? data.length : 0;
            if (dataSize < 100) return;

            String className = self.getClass().getName();
            String timestamp = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS")
                    .format(new java.util.Date());

            // === STOCKER LA REFERENCE bgT (joueur local) ===
            if ("bgT".equals(className)) {
                lastLocalPlayer = self;
                lastLocalPlayerTimestamp = System.currentTimeMillis();
                // Log pour confirmer la capture
                try {
                    java.io.FileWriter bridgeLog = new java.io.FileWriter(
                        "H:\\Code\\Wakfuassistant\\logs\\inventory_debug.log", true);
                    bridgeLog.write("[" + timestamp + "] BRIDGE: bgT reference captured! dataSize=" + dataSize + "\n");
                    bridgeLog.flush();
                    bridgeLog.close();
                } catch (Exception ignored) {}
            }

            // === LEVEL via dnE() ===
            int level = -1;
            try {
                Class<?> c = self.getClass();
                java.lang.reflect.Method m = null;
                while (c != null && m == null) {
                    try { m = c.getDeclaredMethod("dnE"); } catch (NoSuchMethodException e) { c = c.getSuperclass(); }
                }
                if (m != null) { m.setAccessible(true); level = ((Number) m.invoke(self)).intValue(); }
            } catch (Exception ignored) {}

            // === NAME via getName() ===
            String name = "unknown";
            try {
                Class<?> c = self.getClass();
                java.lang.reflect.Method m = null;
                while (c != null && m == null) {
                    try { m = c.getDeclaredMethod("getName"); } catch (NoSuchMethodException e) { c = c.getSuperclass(); }
                }
                if (m != null) { m.setAccessible(true); Object r = m.invoke(self); if (r != null) name = r.toString(); }
            } catch (Exception ignored) {}

            // === ENTITY ID via Sn() ===
            long entityId = 0;
            try {
                Class<?> c = self.getClass();
                java.lang.reflect.Method m = null;
                while (c != null && m == null) {
                    try { m = c.getDeclaredMethod("Sn"); } catch (NoSuchMethodException e) { c = c.getSuperclass(); }
                }
                if (m != null) { m.setAccessible(true); entityId = ((Number) m.invoke(self)).longValue(); }
            } catch (Exception ignored) {}

            // === BREED ID via doV().aWP() ===
            int breedId = -1;
            try {
                Class<?> c = self.getClass();
                java.lang.reflect.Method doV = null;
                while (c != null && doV == null) {
                    try { doV = c.getDeclaredMethod("doV"); } catch (NoSuchMethodException e) { c = c.getSuperclass(); }
                }
                if (doV != null) {
                    doV.setAccessible(true);
                    Object breedObj = doV.invoke(self);
                    if (breedObj != null) {
                        java.lang.reflect.Method aWP = breedObj.getClass().getMethod("aWP");
                        aWP.setAccessible(true);
                        breedId = ((Number) aWP.invoke(breedObj)).intValue();
                    }
                }
            } catch (Exception ignored) {}
            if (breedId <= 0) {
                try {
                    Class<?> c = self.getClass();
                    java.lang.reflect.Field f = null;
                    while (c != null && f == null) {
                        try { f = c.getDeclaredField("ciZ"); } catch (NoSuchFieldException e) { c = c.getSuperclass(); }
                    }
                    if (f != null) { f.setAccessible(true); breedId = f.getInt(self); }
                } catch (Exception ignored) {}
            }

            // === SEX via aWO() ===
            int sex = -1;
            try {
                Class<?> c = self.getClass();
                java.lang.reflect.Method m = null;
                while (c != null && m == null) {
                    try { m = c.getDeclaredMethod("aWO"); } catch (NoSuchMethodException e) { c = c.getSuperclass(); }
                }
                if (m != null) { m.setAccessible(true); sex = ((Number) m.invoke(self)).intValue(); }
            } catch (Exception ignored) {}

            // === KAMAS via fyF() ===
            long kamas = -1;
            try {
                Class<?> c = self.getClass();
                java.lang.reflect.Method m = null;
                while (c != null && m == null) {
                    try { m = c.getDeclaredMethod("fyF"); } catch (NoSuchMethodException e) { c = c.getSuperclass(); }
                }
                if (m != null) { m.setAccessible(true); kamas = ((Number) m.invoke(self)).longValue(); }
            } catch (Exception ignored) {}

            // === EQUIPMENT via iiN (local) ou icA (remote) ===
            String equipment = "{}";
            try {
                Class<?> c = self.getClass();
                java.lang.reflect.Field f = null;
                while (c != null && f == null) {
                    try { f = c.getDeclaredField("iiN"); } catch (NoSuchFieldException e) { c = c.getSuperclass(); }
                }
                if (f != null) { f.setAccessible(true); Object val = f.get(self); if (val != null) equipment = val.toString(); }
            } catch (Exception ignored) {}
            // icA = TByteIntHashMap (remote players: slot→itemId)
            if ("{}".equals(equipment) || equipment.isEmpty()) {
                try {
                    Class<?> c = self.getClass();
                    java.lang.reflect.Field f = null;
                    while (c != null && f == null) {
                        try { f = c.getDeclaredField("icA"); } catch (NoSuchFieldException e) { c = c.getSuperclass(); }
                    }
                    if (f != null) {
                        f.setAccessible(true);
                        Object icA = f.get(self);
                        if (icA != null) {
                            // TByteIntHashMap: keys()=byte[], values()=int[]
                            java.lang.reflect.Method keysM = icA.getClass().getMethod("keys");
                            java.lang.reflect.Method valuesM = icA.getClass().getMethod("values");
                            byte[] keys = (byte[]) keysM.invoke(icA);
                            int[] values = (int[]) valuesM.invoke(icA);
                            StringBuilder sb = new StringBuilder("{");
                            for (int ki = 0; ki < keys.length; ki++) {
                                if (ki > 0) sb.append(", ");
                                sb.append(keys[ki]).append("=").append(values[ki]);
                            }
                            sb.append("}");
                            equipment = sb.toString();
                        }
                    }
                } catch (Exception ignored) {}
            }

            // === GUILD via ija ===
            String guild = "";
            try {
                Class<?> c = self.getClass();
                java.lang.reflect.Field f = null;
                while (c != null && f == null) {
                    try { f = c.getDeclaredField("ija"); } catch (NoSuchFieldException e) { c = c.getSuperclass(); }
                }
                if (f != null) { f.setAccessible(true); Object val = f.get(self); if (val != null) guild = val.toString(); }
            } catch (Exception ignored) {}

            // === INVENTORY HANDLER via ieT ===
            String inventory = "";
            try {
                Class<?> c = self.getClass();
                java.lang.reflect.Field f = null;
                while (c != null && f == null) {
                    try { f = c.getDeclaredField("ieT"); } catch (NoSuchFieldException e) { c = c.getSuperclass(); }
                }
                if (f != null) {
                    f.setAccessible(true);
                    Object invHandler = f.get(self);
                    if (invHandler != null) {
                        inventory = invHandler.toString();
                        if (inventory.length() > 800) inventory = inventory.substring(0, 800) + "...";
                    }
                }
            } catch (Exception ignored) {}

            // === BAG CONTAINER via ieV ===
            String bags = "";
            try {
                Class<?> c = self.getClass();
                java.lang.reflect.Field f = null;
                while (c != null && f == null) {
                    try { f = c.getDeclaredField("ieV"); } catch (NoSuchFieldException e) { c = c.getSuperclass(); }
                }
                if (f != null) {
                    f.setAccessible(true);
                    Object bagContainer = f.get(self);
                    if (bagContainer != null) {
                        bags = bagContainer.toString();
                        if (bags.length() > 800) bags = bags.substring(0, 800) + "...";
                    }
                }
            } catch (Exception ignored) {}

            // === SPELLS via ift ===
            String spells = "";
            try {
                Class<?> c = self.getClass();
                java.lang.reflect.Field f = null;
                while (c != null && f == null) {
                    try { f = c.getDeclaredField("ift"); } catch (NoSuchFieldException e) { c = c.getSuperclass(); }
                }
                if (f != null) {
                    f.setAccessible(true);
                    Object val = f.get(self);
                    if (val != null) {
                        spells = val.toString();
                        if (spells.length() > 500) spells = spells.substring(0, 500) + "...";
                    }
                }
            } catch (Exception ignored) {}

            // === BUILDS via hUL ===
            String builds = "";
            try {
                Class<?> c = self.getClass();
                java.lang.reflect.Field f = null;
                while (c != null && f == null) {
                    try { f = c.getDeclaredField("hUL"); } catch (NoSuchFieldException e) { c = c.getSuperclass(); }
                }
                if (f != null) {
                    f.setAccessible(true);
                    Object val = f.get(self);
                    if (val != null) {
                        builds = val.toString();
                        if (builds.length() > 500) builds = builds.substring(0, 500) + "...";
                    }
                }
            } catch (Exception ignored) {}

            // === EFFECTS COUNT via ifg ===
            int effectsCount = 0;
            try {
                Class<?> c = self.getClass();
                java.lang.reflect.Field f = null;
                while (c != null && f == null) {
                    try { f = c.getDeclaredField("ifg"); } catch (NoSuchFieldException e) { c = c.getSuperclass(); }
                }
                if (f != null) {
                    f.setAccessible(true);
                    Object val = f.get(self);
                    if (val instanceof java.util.Map<?, ?>) effectsCount = ((java.util.Map<?, ?>) val).size();
                }
            } catch (Exception ignored) {}

            // === ACTIVE TITLE via dpA() ===
            short activeTitleId = 0;
            try {
                Class<?> c = self.getClass();
                java.lang.reflect.Method m = null;
                while (c != null && m == null) {
                    try { m = c.getDeclaredMethod("dpA"); } catch (NoSuchMethodException e) { c = c.getSuperclass(); }
                }
                if (m != null) { m.setAccessible(true); activeTitleId = ((Number) m.invoke(self)).shortValue(); }
            } catch (Exception ignored) {}

            // === APPEARANCE COLORS via iiI (eIF) ===
            String characteristics = "";
            try {
                Class<?> c = self.getClass();
                java.lang.reflect.Field f = null;
                while (c != null && f == null) {
                    try { f = c.getDeclaredField("iiI"); } catch (NoSuchFieldException e) { c = c.getSuperclass(); }
                }
                if (f != null) {
                    f.setAccessible(true);
                    Object eif = f.get(self);
                    if (eif != null) {
                        StringBuilder colorSb = new StringBuilder();
                        String[] colorMethods = {"sC", "sE", "sG", "sI", "sK", "sM", "sO", "sQ", "sS"};
                        String[] colorNames = {"skin", "hair", "pupil", "costume1", "costume2", "costume3", "costume4", "costume5", "costume6"};
                        for (int ci = 0; ci < colorMethods.length; ci++) {
                            try {
                                java.lang.reflect.Method cm = null;
                                Class<?> ec = eif.getClass();
                                while (ec != null && cm == null) {
                                    try { cm = ec.getDeclaredMethod(colorMethods[ci]); } catch (NoSuchMethodException e) { ec = ec.getSuperclass(); }
                                }
                                if (cm != null) {
                                    cm.setAccessible(true);
                                    int colorVal = ((Number) cm.invoke(eif)).intValue();
                                    if (colorSb.length() > 0) colorSb.append(", ");
                                    colorSb.append(colorNames[ci]).append("=").append(Integer.toHexString(colorVal));
                                }
                            } catch (Exception ignored2) {}
                        }
                        // Appearance bytes via dlz() and dlA()
                        try {
                            java.lang.reflect.Method dlzM = null;
                            Class<?> ec = eif.getClass();
                            while (ec != null && dlzM == null) {
                                try { dlzM = ec.getDeclaredMethod("dlz"); } catch (NoSuchMethodException e) { ec = ec.getSuperclass(); }
                            }
                            if (dlzM != null) {
                                dlzM.setAccessible(true);
                                byte b1 = ((Number) dlzM.invoke(eif)).byteValue();
                                colorSb.append(", clothIndex=").append(b1);
                            }
                        } catch (Exception ignored2) {}
                        try {
                            java.lang.reflect.Method dlAM = null;
                            Class<?> ec = eif.getClass();
                            while (ec != null && dlAM == null) {
                                try { dlAM = ec.getDeclaredMethod("dlA"); } catch (NoSuchMethodException e) { ec = ec.getSuperclass(); }
                            }
                            if (dlAM != null) {
                                dlAM.setAccessible(true);
                                byte b2 = ((Number) dlAM.invoke(eif)).byteValue();
                                colorSb.append(", faceIndex=").append(b2);
                            }
                        } catch (Exception ignored2) {}
                        characteristics = colorSb.toString();
                    }
                }
            } catch (Exception ignored) {}

            // === DOWNSCALE LEVEL via iiM ===
            short downscaleLevel = -1;
            try {
                Class<?> c = self.getClass();
                java.lang.reflect.Field f = null;
                while (c != null && f == null) {
                    try { f = c.getDeclaredField("iiM"); } catch (NoSuchFieldException e) { c = c.getSuperclass(); }
                }
                if (f != null) { f.setAccessible(true); downscaleLevel = f.getShort(self); }
            } catch (Exception ignored) {}

            // === APPEARANCE INDEX via iiO ===
            byte appearanceIndex = -1;
            try {
                Class<?> c = self.getClass();
                java.lang.reflect.Field f = null;
                while (c != null && f == null) {
                    try { f = c.getDeclaredField("iiO"); } catch (NoSuchFieldException e) { c = c.getSuperclass(); }
                }
                if (f != null) { f.setAccessible(true); appearanceIndex = f.getByte(self); }
            } catch (Exception ignored) {}

            // === VISUAL DATA via iiP ===
            String visualData = "";
            try {
                Class<?> c = self.getClass();
                java.lang.reflect.Field f = null;
                while (c != null && f == null) {
                    try { f = c.getDeclaredField("iiP"); } catch (NoSuchFieldException e) { c = c.getSuperclass(); }
                }
                if (f != null) {
                    f.setAccessible(true);
                    Object val = f.get(self);
                    if (val != null) {
                        visualData = val.toString();
                        if (visualData.length() > 500) visualData = visualData.substring(0, 500) + "...";
                    }
                }
            } catch (Exception ignored) {}

            // === NATION via Xt() ===
            int nationId = 0;
            try {
                Class<?> c = self.getClass();
                java.lang.reflect.Method m = null;
                while (c != null && m == null) {
                    try { m = c.getDeclaredMethod("Xt"); } catch (NoSuchMethodException e) { c = c.getSuperclass(); }
                }
                if (m != null) { m.setAccessible(true); nationId = ((Number) m.invoke(self)).intValue(); }
            } catch (Exception ignored) {}

            // === EQUIPMENT LEVEL via ejt ===
            short equipmentLevel = -1;
            try {
                Class<?> c = self.getClass();
                java.lang.reflect.Field f = null;
                while (c != null && f == null) {
                    try { f = c.getDeclaredField("ejt"); } catch (NoSuchFieldException e) { c = c.getSuperclass(); }
                }
                if (f != null) { f.setAccessible(true); equipmentLevel = f.getShort(self); }
            } catch (Exception ignored) {}

            // === POSITION via eap() -> getX(), getY(), bdi() ===
            int posX = 0;
            int posY = 0;
            int posZ = 0;
            try {
                java.lang.reflect.Method eapM = null;
                Class<?> c = self.getClass();
                while (c != null && eapM == null) {
                    try { eapM = c.getDeclaredMethod("eap"); } catch (NoSuchMethodException e) { c = c.getSuperclass(); }
                }
                if (eapM != null) {
                    eapM.setAccessible(true);
                    Object pos = eapM.invoke(self);
                    if (pos != null) {
                        java.lang.reflect.Method gx = pos.getClass().getMethod("getX");
                        java.lang.reflect.Method gy = pos.getClass().getMethod("getY");
                        gx.setAccessible(true); gy.setAccessible(true);
                        posX = ((Number) gx.invoke(pos)).intValue();
                        posY = ((Number) gy.invoke(pos)).intValue();
                        // Z/altitude via bdi()
                        try {
                            java.lang.reflect.Method gz = null;
                            Class<?> pc = pos.getClass();
                            while (pc != null && gz == null) {
                                try { gz = pc.getDeclaredMethod("bdi"); } catch (NoSuchMethodException e) { pc = pc.getSuperclass(); }
                            }
                            if (gz != null) { gz.setAccessible(true); posZ = ((Number) gz.invoke(pos)).intValue(); }
                        } catch (Exception ignored2) {}
                    }
                }
            } catch (Exception ignored) {}

            // === INSTANCE/WORLD via aqZ() ===
            String instanceName = "";
            try {
                java.lang.reflect.Method aqZM = null;
                Class<?> c = self.getClass();
                while (c != null && aqZM == null) {
                    try { aqZM = c.getDeclaredMethod("aqZ"); } catch (NoSuchMethodException e) { c = c.getSuperclass(); }
                }
                if (aqZM != null) { aqZM.setAccessible(true); Object val = aqZM.invoke(self); if (val != null) instanceName = val.toString(); }
            } catch (Exception ignored) {}

            // === TITLE NAME via dpB() ===
            String titleName = "";
            try {
                java.lang.reflect.Method dpBM = null;
                Class<?> c = self.getClass();
                while (c != null && dpBM == null) {
                    try { dpBM = c.getDeclaredMethod("dpB"); } catch (NoSuchMethodException e) { c = c.getSuperclass(); }
                }
                if (dpBM != null) { dpBM.setAccessible(true); Object val = dpBM.invoke(self); if (val != null) titleName = val.toString(); }
            } catch (Exception ignored) {}

            // === ACTIVE STATES/BUFFS via iiT ===
            String activeStates = "";
            try {
                Class<?> c = self.getClass();
                java.lang.reflect.Field f = null;
                while (c != null && f == null) {
                    try { f = c.getDeclaredField("iiT"); } catch (NoSuchFieldException e) { c = c.getSuperclass(); }
                }
                if (f != null) {
                    f.setAccessible(true);
                    Object val = f.get(self);
                    if (val != null) {
                        activeStates = val.toString();
                        if (activeStates.length() > 500) activeStates = activeStates.substring(0, 500) + "...";
                    }
                }
            } catch (Exception ignored) {}

            // === BREED NAME MAPPING ===
            String breedName;
            switch (breedId) {
                case 1: breedName = "Feca"; break;
                case 2: breedName = "Osamodas"; break;
                case 3: breedName = "Enutrof"; break;
                case 4: breedName = "Sram"; break;
                case 5: breedName = "Xelor"; break;
                case 6: breedName = "Ecaflip"; break;
                case 7: breedName = "Eniripsa"; break;
                case 8: breedName = "Iop"; break;
                case 9: breedName = "Cra"; break;
                case 10: breedName = "Sadida"; break;
                case 11: breedName = "Sacrieur"; break;
                case 12: breedName = "Pandawa"; break;
                case 13: breedName = "Roublard"; break;
                case 14: breedName = "Zobal"; break;
                case 15: breedName = "Steamer"; break;
                case 16: breedName = "Eliotrope"; break;
                case 18: breedName = "Ouginak"; break;
                case 19: breedName = "Huppermage"; break;
                default: breedName = "BreedId_" + breedId; break;
            }

            // === ENCHANTEMENTS (LOCAL_PLAYER uniquement) ===
            String enchantmentsJson = "";
            String type = className.equals("bgT") ? "LOCAL_PLAYER" : "REMOTE_PLAYER";
            if ("LOCAL_PLAYER".equals(type)) {
                try {
                    // 1. Recuperer EquipmentSheet (iiN) -> fUd() -> Map<ffS, Long>
                    Object equipSheet = null;
                    Class<?> c = self.getClass();
                    java.lang.reflect.Field f = null;
                    while (c != null && f == null) {
                        try { f = c.getDeclaredField("iiN"); } catch (NoSuchFieldException e) { c = c.getSuperclass(); }
                    }
                    if (f != null) { f.setAccessible(true); equipSheet = f.get(self); }

                    // 2. Recuperer le conteneur d'items via dod()
                    Object itemContainer = null;
                    java.lang.reflect.Method dodM = null;
                    c = self.getClass();
                    while (c != null && dodM == null) {
                        try { dodM = c.getDeclaredMethod("dod"); } catch (NoSuchMethodException e) { c = c.getSuperclass(); }
                    }
                    if (dodM != null) { dodM.setAccessible(true); itemContainer = dodM.invoke(self); }

                    if (equipSheet != null && itemContainer != null) {
                        // 3. fUd() -> Map<ffS, Long> (slot -> itemUID)
                        java.lang.reflect.Method fUdM = null;
                        c = equipSheet.getClass();
                        while (c != null && fUdM == null) {
                            try { fUdM = c.getDeclaredMethod("fUd"); } catch (NoSuchMethodException e) { c = c.getSuperclass(); }
                        }
                        java.util.Map<?, ?> slotsMap = null;
                        if (fUdM != null) { fUdM.setAccessible(true); slotsMap = (java.util.Map<?, ?>) fUdM.invoke(equipSheet); }

                        // 4. ld(long uid) -> ffV item
                        java.lang.reflect.Method ldM = null;
                        c = itemContainer.getClass();
                        while (c != null && ldM == null) {
                            try { ldM = c.getDeclaredMethod("ld", long.class); } catch (NoSuchMethodException e) { c = c.getSuperclass(); }
                        }

                        if (slotsMap != null && ldM != null) {
                            ldM.setAccessible(true);
                            StringBuilder enchSb = new StringBuilder();
                            enchSb.append("\"equipmentDetails\": {");
                            boolean first = true;
                            for (java.util.Map.Entry<?, ?> entry : slotsMap.entrySet()) {
                                Object slotEnum = entry.getKey();
                                long itemUid = ((Number) entry.getValue()).longValue();

                                // Slot byte index
                                byte slotByte = -1;
                                try {
                                    java.lang.reflect.Field shbF = slotEnum.getClass().getDeclaredField("shb");
                                    shbF.setAccessible(true);
                                    slotByte = shbF.getByte(slotEnum);
                                } catch (Exception ignored) {}

                                // Recuperer l'objet item
                                Object item = ldM.invoke(itemContainer, itemUid);
                                if (item == null) continue;

                                // RefId via avr()
                                int refId = 0;
                                try {
                                    java.lang.reflect.Method avrM = null;
                                    Class<?> ic = item.getClass();
                                    while (ic != null && avrM == null) {
                                        try { avrM = ic.getDeclaredMethod("avr"); } catch (NoSuchMethodException e) { ic = ic.getSuperclass(); }
                                    }
                                    if (avrM != null) { avrM.setAccessible(true); refId = ((Number) avrM.invoke(item)).intValue(); }
                                } catch (Exception ignored) {}

                                // Enchantements via ItemEnchantExtractor
                                String enchant = ItemEnchantExtractor.extractEnchantJson(item, null);

                                if (!first) enchSb.append(",");
                                first = false;
                                enchSb.append("\n    \"").append(slotByte).append("\": {");
                                enchSb.append("\"itemRefId\": ").append(refId);
                                enchSb.append(", \"itemUid\": ").append(itemUid);
                                if (!enchant.isEmpty()) {
                                    enchSb.append(", ").append(enchant);
                                }
                                enchSb.append("}");
                            }
                            enchSb.append("\n  }");
                            enchantmentsJson = enchSb.toString();
                        }
                    }
                } catch (Exception e) {
                    // Log error but don't fail
                    try {
                        java.io.FileWriter errLog = new java.io.FileWriter(
                            "H:\\Code\\Wakfuassistant\\logs\\enchant_extract_errors.log", true);
                        errLog.write("[" + timestamp + "] " + e.getClass().getName() + ": " + e.getMessage() + "\n");
                        errLog.flush();
                        errLog.close();
                    } catch (Exception ignored) {}
                }
            }

            // === ESCAPE INLINE ===
            String eName = esc(name);
            String eEquip = esc(equipment);
            String eGuild = esc(guild);
            String eInv = esc(inventory);
            String eBags = esc(bags);
            String eSpells = esc(spells);
            String eBuilds = esc(builds);
            String eAppearance = esc(characteristics);
            String eVisualData = esc(visualData);
            String eActiveStates = esc(activeStates);
            String eInstanceName = esc(instanceName);
            String eTitleName = esc(titleName);

            // === BUILD JSON ===
            String json = "{\n"
                    + "  \"timestamp\": \"" + timestamp + "\",\n"
                    + "  \"type\": \"" + type + "\",\n"
                    + "  \"entityId\": " + entityId + ",\n"
                    + "  \"name\": \"" + eName + "\",\n"
                    + "  \"level\": " + level + ",\n"
                    + "  \"downscaleLevel\": " + downscaleLevel + ",\n"
                    + "  \"breedId\": " + breedId + ",\n"
                    + "  \"breedName\": \"" + breedName + "\",\n"
                    + "  \"sex\": " + sex + ",\n"
                    + "  \"kamas\": " + kamas + ",\n"
                    + "  \"dataSize\": " + dataSize + ",\n"
                    + "  \"position\": {\"x\": " + posX + ", \"y\": " + posY + ", \"z\": " + posZ + "},\n"
                    + "  \"instanceName\": \"" + eInstanceName + "\",\n"
                    + "  \"equipmentLevel\": " + equipmentLevel + ",\n"
                    + "  \"equipment\": \"" + eEquip + "\",\n"
                    + (enchantmentsJson.isEmpty() ? "" : "  " + enchantmentsJson + ",\n")
                    + "  \"activeTitleId\": " + activeTitleId + ",\n"
                    + "  \"activeTitleName\": \"" + eTitleName + "\",\n"
                    + "  \"appearanceIndex\": " + appearanceIndex + ",\n"
                    + "  \"appearance\": \"" + eAppearance + "\",\n"
                    + "  \"visualData\": \"" + eVisualData + "\",\n"
                    + "  \"guild\": \"" + eGuild + "\",\n"
                    + "  \"nationId\": " + nationId + ",\n"
                    + "  \"inventory\": \"" + eInv + "\",\n"
                    + "  \"bags\": \"" + eBags + "\",\n"
                    + "  \"activeEffects\": " + effectsCount + ",\n"
                    + "  \"activeStates\": \"" + eActiveStates + "\",\n"
                    + "  \"spells\": \"" + eSpells + "\",\n"
                    + "  \"builds\": \"" + eBuilds + "\"\n"
                    + "}";

            // === WRITE FILES ===
            String logDir = "H:\\Code\\Wakfuassistant\\logs";
            String playersDir = logDir + "\\players";
            java.io.File dir = new java.io.File(playersDir);
            if (!dir.exists()) { dir.mkdirs(); }

            // Sanitize name for filename (remove invalid chars)
            String safeName = name.replaceAll("[^a-zA-Z0-9_-]", "_");
            if (safeName.isEmpty() || "unknown".equals(safeName)) safeName = "entity_" + entityId;

            // Niveau effectif pour déterminer la tranche d'équipement
            // On utilise equipmentLevel (niveau réel du stuff) si disponible,
            // sinon level du joueur (éventuellement downscalé)
            int levelForTranche;
            if (equipmentLevel > 0) {
                levelForTranche = equipmentLevel;
            } else if (downscaleLevel > 0) {
                levelForTranche = downscaleLevel;
            } else {
                levelForTranche = level;
            }

            // Tranche Wakfu : 0-20, puis par paliers de 15 (20-35, 35-50, ..., 230-245)
            // La borne basse de la tranche sert d'identifiant
            int tranche;
            if (levelForTranche <= 20) {
                tranche = 0;
            } else {
                tranche = ((levelForTranche - 21) / 15) * 15 + 20;
            }

            // Écrire le fichier "latest" (toujours écrasé, = dernière capture)
            java.io.FileWriter fw = new java.io.FileWriter(playersDir + "\\" + safeName + ".json", false);
            fw.write(json);
            fw.flush();
            fw.close();

            // Écrire le snapshot de cette tranche (écrase le précédent pour cette tranche)
            java.io.FileWriter fwTranche = new java.io.FileWriter(
                    playersDir + "\\" + safeName + "_t" + tranche + ".json", false);
            fwTranche.write(json);
            fwTranche.flush();
            fwTranche.close();

            java.io.FileWriter fw2 = new java.io.FileWriter(logDir + "\\character_data.log", true);
            fw2.write("[" + timestamp + "] " + type + " | " + name + " | " + breedName + " Lv." + level
                    + " | kamas=" + kamas + " | entityId=" + entityId + "\n");
            fw2.flush();
            fw2.close();

            java.io.FileWriter fw3 = new java.io.FileWriter(
                    "H:\\Code\\Wakfuassistant\\agent\\logs\\wakfu_agent_spy.log", true);
            fw3.write("[" + timestamp + "] CHARACTER_EXTRACTED: " + name
                    + " " + breedName + " Lv." + level + " kamas=" + kamas + " (" + entityId + ")\n");
            fw3.flush();
            fw3.close();

        } catch (Throwable t) {
            try {
                java.io.FileWriter fw = new java.io.FileWriter(
                        "H:\\Code\\Wakfuassistant\\logs\\extractor_errors.log", true);
                fw.write("[" + new java.util.Date() + "] " + t.getClass().getName() + ": " + t.getMessage() + "\n");
                java.io.StringWriter sw = new java.io.StringWriter();
                t.printStackTrace(new java.io.PrintWriter(sw));
                fw.write(sw.toString() + "\n");
                fw.flush();
                fw.close();
            } catch (Exception ignored) {}
        }
    }

    /** Escape a string for safe JSON embedding. */
    public static String esc(String s) {
        if (s == null) return "";
        return s.replace("\\", "\\\\")
                .replace("\"", "\\\"")
                .replace("\n", "\\n")
                .replace("\r", "\\r")
                .replace("\t", "\\t")
                .replace("\b", "\\b")
                .replace("\f", "\\f");
    }
}
