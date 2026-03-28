package com.wakfuassistant.agent;

import net.bytebuddy.asm.Advice;

public class CharacterLevelAdvice {

    @Advice.OnMethodEnter
    public static void onEnter(
            @Advice.This Object self,
            @Advice.Argument(0) int levelValue) {
        try {
            String className = self.getClass().getName();
            String timestamp = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS")
                    .format(new java.util.Date());

            // Recuperer characterId (aDh) par remontee dans la hierarchie
            long characterId = 0;
            try {
                Class<?> clazz = self.getClass();
                while (clazz != null) {
                    try {
                        java.lang.reflect.Field f = clazz.getDeclaredField("aDh");
                        f.setAccessible(true);
                        characterId = f.getLong(self);
                        break;
                    } catch (NoSuchFieldException e) {
                        clazz = clazz.getSuperclass();
                    }
                }
            } catch (Exception ex) {
                characterId = -1;
            }

            // Recuperer le nom via getName()
            String charName = "unknown";
            try {
                Class<?> clazz = self.getClass();
                while (clazz != null) {
                    try {
                        java.lang.reflect.Method m = clazz.getDeclaredMethod("getName");
                        m.setAccessible(true);
                        Object result = m.invoke(self);
                        if (result != null) {
                            charName = result.toString();
                        }
                        break;
                    } catch (NoSuchMethodException e) {
                        clazz = clazz.getSuperclass();
                    }
                }
            } catch (Exception ex) {
                charName = "error:" + ex.getClass().getSimpleName();
            }

            // Recuperer dnE() = level actuel stocke (pour comparaison)
            short storedLevel = -1;
            try {
                Class<?> clazz = self.getClass();
                while (clazz != null) {
                    try {
                        java.lang.reflect.Method m = clazz.getDeclaredMethod("dnE");
                        m.setAccessible(true);
                        storedLevel = ((Number) m.invoke(self)).shortValue();
                        break;
                    } catch (NoSuchMethodException e) {
                        clazz = clazz.getSuperclass();
                    }
                }
            } catch (Exception ex) {
                storedLevel = -2;
            }

            // Recuperer Sn() = identifiant unique de l'entite
            long entityId = 0;
            try {
                Class<?> clazz = self.getClass();
                while (clazz != null) {
                    try {
                        java.lang.reflect.Method m = clazz.getDeclaredMethod("Sn");
                        m.setAccessible(true);
                        entityId = ((Number) m.invoke(self)).longValue();
                        break;
                    } catch (NoSuchMethodException e) {
                        clazz = clazz.getSuperclass();
                    }
                }
            } catch (Exception ex) {
                entityId = -1;
            }

            // Lister tous les champs de la classe pour enrichir le dump
            StringBuilder fieldsInfo = new StringBuilder();
            try {
                Class<?> clazz = self.getClass();
                int fieldCount = 0;
                while (clazz != null && fieldCount < 50) {
                    for (java.lang.reflect.Field f : clazz.getDeclaredFields()) {
                        if (java.lang.reflect.Modifier.isStatic(f.getModifiers())) continue;
                        f.setAccessible(true);
                        try {
                            Object val = f.get(self);
                            String valStr;
                            if (val == null) {
                                valStr = "null";
                            } else if (val instanceof byte[]) {
                                valStr = "byte[" + ((byte[]) val).length + "]";
                            } else if (val instanceof int[]) {
                                valStr = "int[" + ((int[]) val).length + "]";
                            } else if (val instanceof long[]) {
                                valStr = "long[" + ((long[]) val).length + "]";
                            } else {
                                valStr = val.toString();
                                if (valStr.length() > 80) {
                                    valStr = valStr.substring(0, 80) + "...";
                                }
                            }
                            fieldsInfo.append(f.getName()).append("=").append(valStr).append(" | ");
                            fieldCount++;
                        } catch (Exception ignored) {}
                    }
                    clazz = clazz.getSuperclass();
                }
            } catch (Exception ignored) {}

            // Construire le log principal
            String mainLine = "[" + timestamp + "] CHARACTER_LEVEL"
                    + " | characterId=" + characterId
                    + " | entityId=" + entityId
                    + " | name=" + charName
                    + " | levelParam=" + levelValue
                    + " | storedLevel=" + storedLevel
                    + " | class=" + className;

            // Ecrire dans character_data.log
            String logDir = "H:\\Code\\Wakfuassistant\\logs";
            java.io.File dir = new java.io.File(logDir);
            if (!dir.exists()) { dir.mkdirs(); }

            java.io.FileWriter fw = new java.io.FileWriter(logDir + "\\character_data.log", true);
            fw.write(mainLine + "\n");
            if (fieldsInfo.length() > 0) {
                fw.write("[" + timestamp + "] FIELDS | " + fieldsInfo.toString() + "\n");
            }
            fw.flush();
            fw.close();

            // Ecrire aussi dans le log agent
            String agentLogDir = "H:\\Code\\Wakfuassistant\\agent\\logs";
            java.io.File agentDir = new java.io.File(agentLogDir);
            if (!agentDir.exists()) { agentDir.mkdirs(); }

            java.io.FileWriter fw2 = new java.io.FileWriter(agentLogDir + "\\wakfu_agent_spy.log", true);
            fw2.write("[" + timestamp + "] LEVEL_CAPTURED: id=" + characterId
                    + " name=" + charName + " level=" + levelValue + "\n");
            fw2.flush();
            fw2.close();

        } catch (Throwable t) {
            try {
                java.io.FileWriter fw = new java.io.FileWriter(
                        "H:\\Code\\Wakfuassistant\\logs\\level_hook_errors.log", true);
                fw.write("[" + new java.util.Date() + "] " + t.getClass().getName()
                        + ": " + t.getMessage() + "\n");
                java.io.StringWriter sw = new java.io.StringWriter();
                t.printStackTrace(new java.io.PrintWriter(sw));
                fw.write(sw.toString() + "\n");
                fw.flush();
                fw.close();
            } catch (Exception ignored) {}
        }
    }
}
