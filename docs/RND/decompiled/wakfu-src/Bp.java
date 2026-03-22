/*
 * Decompiled with CFR 0.152.
 */
import java.util.regex.Pattern;

public final class Bp {
    private static final Pattern atu = Pattern.compile("[\n\r]+");

    public static String a(String string, boolean bl) {
        if (string == null) {
            return null;
        }
        String string2 = string;
        for (Bq bq : bl ? Bq.atG : Bq.atF) {
            string2 = bq.atH.matcher(string2).replaceAll(bq.atI);
        }
        return string2;
    }

    private Bp() {
    }

    public static String aJ(String string) {
        if (string == null) {
            return null;
        }
        return atu.matcher(string).replaceAll("");
    }
}

