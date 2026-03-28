package com.wakfuassistant.agent;

import net.bytebuddy.asm.Advice;

/**
 * Hook sur crq.dn(byte[]) — packet 12096 "sort lancé en combat".
 * Champs utiles après décodage :
 *   bhQ (long)  = casterId (entityId du lanceur)
 *   huR (int)   = spellId
 *   mfA (int)   = fightId
 */
public class CrqAdvice {

    @Advice.OnMethodExit(onThrowable = Throwable.class, suppress = Throwable.class)
    public static void onExit(@Advice.This Object self) {
        try {
            Class<?> clazz = self.getClass();

            // bhQ = casterId (long)
            long casterId = 0;
            try {
                java.lang.reflect.Field f = null;
                Class<?> c = clazz;
                while (c != null && f == null) {
                    try { f = c.getDeclaredField("bhQ"); } catch (NoSuchFieldException e) { c = c.getSuperclass(); }
                }
                if (f != null) { f.setAccessible(true); casterId = f.getLong(self); }
            } catch (Exception ignored) {}

            // huR = spellId (int)
            int spellId = 0;
            try {
                java.lang.reflect.Field f = null;
                Class<?> c = clazz;
                while (c != null && f == null) {
                    try { f = c.getDeclaredField("huR"); } catch (NoSuchFieldException e) { c = c.getSuperclass(); }
                }
                if (f != null) { f.setAccessible(true); spellId = f.getInt(self); }
            } catch (Exception ignored) {}

            // mfA = fightId (int)
            int fightId = 0;
            try {
                java.lang.reflect.Field f = null;
                Class<?> c = clazz;
                while (c != null && f == null) {
                    try { f = c.getDeclaredField("mfA"); } catch (NoSuchFieldException e) { c = c.getSuperclass(); }
                }
                if (f != null) { f.setAccessible(true); fightId = f.getInt(self); }
            } catch (Exception ignored) {}

            if (casterId == 0 || spellId == 0) return;

            String timestamp = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS")
                    .format(new java.util.Date());

            String line = "{\"timestamp\":\"" + timestamp
                    + "\",\"casterId\":" + casterId
                    + ",\"spellId\":" + spellId
                    + ",\"fightId\":" + fightId
                    + "}\n";

            java.io.File logFile = new java.io.File("H:\\Code\\Wakfuassistant\\agent\\logs\\combat_spells.jsonl");
            logFile.getParentFile().mkdirs();
            java.io.FileWriter fw = new java.io.FileWriter(logFile, true);
            fw.write(line);
            fw.flush();
            fw.close();

        } catch (Throwable ignored) {}
    }
}
