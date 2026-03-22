/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aCx
 */
public class acx_1 {
    private static final String dBu = ";";
    private static final String dBv = ":";

    public static String d(acv_1 acv_12) {
        StringBuilder stringBuilder = new StringBuilder();
        acx_1.a(stringBuilder, acv_12);
        acx_1.b(stringBuilder, acv_12);
        for (int i = 0; i < acv_12.aVo(); ++i) {
            acx_1.a(stringBuilder, acv_12.wX(i));
        }
        return stringBuilder.toString();
    }

    public static acv_1 gY(String string) {
        acv_1 acv_12 = new acv_1("");
        return acx_1.a(acv_12, string) ? acv_12 : null;
    }

    public static boolean a(acv_1 acv_12, String string) {
        if (string == null) {
            acv_12.reset();
            return false;
        }
        acv_12.clear();
        try {
            String[] stringArray;
            for (String string2 : stringArray = string.split(dBu)) {
                String[] stringArray2 = string2.split(dBv);
                acx_1.a(acv_12, stringArray2[0], stringArray2[1]);
            }
            acv_12.bXC();
        }
        catch (Exception exception) {
            acv_12.reset();
        }
        return true;
    }

    private static void a(acv_1 acv_12, String string, String string2) {
        if (string.equals("bounds")) {
            acx_1.b(acv_12, string2);
        } else if (string.equals("point")) {
            acx_1.c(acv_12, string2);
        } else if (string.equals("name")) {
            acv_12.setName(string2);
        }
    }

    private static void a(StringBuilder stringBuilder, acv_1 acv_12) {
        stringBuilder.append("name").append(dBv);
        stringBuilder.append(acv_12.getName());
        stringBuilder.append(dBu);
    }

    private static void b(StringBuilder stringBuilder, acv_1 acv_12) {
        stringBuilder.append("bounds").append(dBv);
        stringBuilder.append(acv_12.bXy()).append(",");
        stringBuilder.append(acv_12.bXA()).append(",");
        stringBuilder.append(acv_12.bXz()).append(",");
        stringBuilder.append(acv_12.bXB());
        stringBuilder.append(dBu);
    }

    private static void b(acv_1 acv_12, String string) {
        String[] stringArray = string.split(",");
        double d2 = Double.parseDouble(stringArray[0]);
        double d3 = Double.parseDouble(stringArray[1]);
        double d4 = Double.parseDouble(stringArray[2]);
        double d5 = Double.parseDouble(stringArray[3]);
        acv_12.b(d2, d3, d4, d5);
    }

    private static void a(StringBuilder stringBuilder, acs_1 acs_12) {
        stringBuilder.append("point").append(dBv);
        stringBuilder.append(acs_12.bXl()).append(",").append(acs_12.bXm());
        if (acs_12.bXs()) {
            stringBuilder.append(",").append("i").append(",").append(acs_12.bXn()).append(",").append(acs_12.bXo());
        }
        if (acs_12.bXt()) {
            stringBuilder.append(",").append("o").append(",").append(acs_12.bXp()).append(",").append(acs_12.bXq());
        }
        stringBuilder.append(dBu);
    }

    private static void c(acv_1 acv_12, String string) {
        String[] stringArray = string.split(",");
        double d2 = Double.parseDouble(stringArray[0]);
        double d3 = Double.parseDouble(stringArray[1]);
        acs_1 acs_12 = new acs_1(d2, d3);
        if (stringArray.length > 2) {
            acx_1.a(acs_12, stringArray, 2);
        }
        if (stringArray.length > 5) {
            acx_1.a(acs_12, stringArray, 5);
        }
        acv_12.b(acs_12);
    }

    private static void a(acs_1 acs_12, String[] stringArray, int n) {
        double d2 = Double.parseDouble(stringArray[n + 1]);
        double d3 = Double.parseDouble(stringArray[n + 2]);
        if (stringArray[n].equals("i")) {
            acs_12.b(d2, d3);
            return;
        }
        if (stringArray[n].equals("o")) {
            acs_12.c(d2, d3);
            return;
        }
    }
}

