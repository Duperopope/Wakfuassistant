package com.wakfuassistant.agent;

import net.bytebuddy.asm.Advice;

public class CharacterDeserializeAdvice {

    @Advice.OnMethodExit(onThrowable = Throwable.class, suppress = Throwable.class)
    public static void onExit(
            @Advice.This Object self,
            @Advice.Argument(0) byte[] data) {
        try {
            String className = self.getClass().getName();
            String timestamp = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS")
                    .format(new java.util.Date());
            int dataSize = (data != null) ? data.length : 0;

            // On ne s'interesse qu'aux gros payloads (> 1000 bytes = donnees de personnage)
            if (dataSize < 1000) return;

            // Recuperer le level via dnE()
            short level = -1;
            try {
                Class<?> clazz = self.getClass();
                while (clazz != null) {
                    try {
                        java.lang.reflect.Method m = clazz.getDeclaredMethod("dnE");
                        m.setAccessible(true);
                        level = ((Number) m.invoke(self)).shortValue();
                        break;
                    } catch (NoSuchMethodException e) {
                        clazz = clazz.getSuperclass();
                    }
                }
            } catch (Exception ex) {
                level = -2;
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
                        if (result != null) charName = result.toString();
                        break;
                    } catch (NoSuchMethodException e) {
                        clazz = clazz.getSuperclass();
                    }
                }
            } catch (Exception ex) {
                charName = "err:" + ex.getClass().getSimpleName();
            }

            // Recuperer Sn() = entityId
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

            // Recuperer aDh = characterId
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

            // Lister les champs non-statiques importants (les 30 premiers)
            StringBuilder fieldsInfo = new StringBuilder();
            try {
                Class<?> clazz = self.getClass();
                int count = 0;
                while (clazz != null && count < 30) {
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
                            } else if (val instanceof java.util.Collection) {
                                valStr = "Collection[" + ((java.util.Collection<?>) val).size() + "]";
                            } else if (val instanceof java.util.Map) {
                                valStr = "Map[" + ((java.util.Map<?, ?>) val).size() + "]";
                            } else {
                                valStr = val.toString();
                                if (valStr.length() > 60) valStr = valStr.substring(0, 60) + "...";
                            }
                            fieldsInfo.append(f.getName()).append("=").append(valStr).append(" | ");
                            count++;
                        } catch (Exception ignored) {}
                    }
                    clazz = clazz.getSuperclass();
                }
            } catch (Exception ignored) {}

            // Ecrire dans character_data.log
            String logDir = "H:\\Code\\Wakfuassistant\\logs";
            java.io.File dir = new java.io.File(logDir);
            if (!dir.exists()) { dir.mkdirs(); }

            StringBuilder sb = new StringBuilder();
            sb.append("[").append(timestamp).append("] DESERIALIZED");
            sb.append(" | class=").append(className);
            sb.append(" | dataSize=").append(dataSize);
            sb.append(" | characterId=").append(characterId);
            sb.append(" | entityId=").append(entityId);
            sb.append(" | name=").append(charName);
            sb.append(" | level=").append(level);

            java.io.FileWriter fw = new java.io.FileWriter(logDir + "\\character_data.log", true);
            fw.write(sb.toString() + "\n");
            if (fieldsInfo.length() > 0) {
                fw.write("[" + timestamp + "] FIELDS | " + fieldsInfo.toString() + "\n");
            }
            fw.flush();
            fw.close();

            // Log agent aussi
            java.io.FileWriter fw2 = new java.io.FileWriter(
                    "H:\\Code\\Wakfuassistant\\agent\\logs\\wakfu_agent_spy.log", true);
            fw2.write("[" + timestamp + "] DESER_CAPTURED: class=" + className
                    + " size=" + dataSize + " name=" + charName + " level=" + level + "\n");
            fw2.flush();
            fw2.close();

        } catch (Throwable t) {
            try {
                java.io.FileWriter fw = new java.io.FileWriter(
                        "H:\\Code\\Wakfuassistant\\logs\\deser_hook_errors.log", true);
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
