/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fTy
 */
public class fty_2 {
    public static String wp(String string) {
        return "id=\"" + string + "\"";
    }

    public static String wq(String string) {
        return "color=\"" + string + "\"";
    }

    public static String ack(int n) {
        return "size=\"" + n + "\"";
    }

    public static String wr(String string) {
        return "align=\"" + string + "\"";
    }

    public static String c(String string, String ... stringArray) {
        return fty_2.b(string, "b", stringArray);
    }

    public static String d(String string, String ... stringArray) {
        return fty_2.b(string, "i", stringArray);
    }

    public static String e(String string, String ... stringArray) {
        return fty_2.b(string, "u", stringArray);
    }

    public static String b(String string, int n, int n2, String string2) {
        return fty_2.b(string, n, n2, string2, null);
    }

    public static String b(String string, int n, int n2, String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder("<image pixmap=\"");
        stringBuilder.append(string).append("\"");
        if (n > 0) {
            stringBuilder.append(" width=\"").append(n).append("\"");
        }
        if (n2 > 0) {
            stringBuilder.append(" height=\"").append(n2).append("\"");
        }
        if (string2 != null) {
            stringBuilder.append(" align=\"").append(string2).append("\"");
        }
        if (string3 != null) {
            stringBuilder.append(" popupTranslatorKey=\"").append(string3).append("\"");
        }
        stringBuilder.append("></image>");
        return stringBuilder.toString();
    }

    public static String f(String string, String ... stringArray) {
        return fty_2.b(string, "text", stringArray);
    }

    private static String b(String string, String string2, String ... stringArray) {
        StringBuilder stringBuilder = new StringBuilder("<").append(string2);
        if (stringArray != null) {
            for (String string3 : stringArray) {
                stringBuilder.append(" ").append(string3);
            }
        }
        return stringBuilder.append(">").append(string).append("</").append(string2).append(">").toString();
    }
}

