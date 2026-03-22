/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class eIq {
    private static final String qwe = "~";
    private static final String qwf = "|";
    private static final String qwg = "name";
    private static final String qwh = "value";

    public static Object a(String string, eIr eIr2, ArrayList<azx_1<String, String>> arrayList) {
        if (string == null) {
            return null;
        }
        String string2 = string;
        if (arrayList != null) {
            for (azx_1<String, String> azx_12 : arrayList) {
                string2 = string2.replaceAll("(?i)(\\$\\$" + azx_12.getFirst() + ")", azx_12.aHI());
            }
        }
        switch (eIr2.ordinal()) {
            case 2: {
                return Short.parseShort(string2);
            }
            case 0: {
                return Integer.parseInt(string2);
            }
            case 1: {
                return Long.parseLong(string2);
            }
            case 3: {
                return string2;
            }
        }
        throw new IllegalArgumentException("Pas de type connu ? WTF ?");
    }

    public static Object[] a(String[] stringArray, eIr eIr2, ArrayList<azx_1<String, String>> arrayList) {
        if (stringArray == null) {
            return null;
        }
        Object[] objectArray = switch (eIr2.ordinal()) {
            case 2 -> new Short[stringArray.length];
            case 0 -> new Integer[stringArray.length];
            case 1 -> new Long[stringArray.length];
            case 3 -> new String[stringArray.length];
            default -> throw new IllegalArgumentException("Pas de type connu ? WTF ?");
        };
        for (int i = 0; i < stringArray.length; ++i) {
            objectArray[i] = eIq.a(stringArray[i], eIr2, arrayList);
        }
        return objectArray;
    }

    /*
     * WARNING - void declaration
     */
    public static ArrayList<azx_1<String, String>> sa(String string) {
        String[] stringArray;
        ArrayList<azx_1<String, String>> arrayList = new ArrayList<azx_1<String, String>>();
        for (String string2 : stringArray = BH.j(string, qwe)) {
            void object;
            if (string2.length() == 0) continue;
            if (string2.endsWith(qwf)) {
                String string3 = string2 + " ";
            }
            String[] stringArray2 = BH.j((String)object, qwf);
            azx_1<String, String> azx_12 = new azx_1<String, String>();
            for (int i = 0; i < stringArray2.length; i += 2) {
                if (stringArray2[i].equalsIgnoreCase(qwg)) {
                    azx_12.Q(stringArray2[i + 1] == null ? "" : stringArray2[i + 1]);
                    continue;
                }
                if (!stringArray2[i].equalsIgnoreCase(qwh)) continue;
                azx_12.N(stringArray2[i + 1] == null ? "" : stringArray2[i + 1]);
            }
            arrayList.add(azx_12);
        }
        return arrayList;
    }
}

