/*
 * Decompiled with CFR 0.152.
 */
import java.util.regex.Pattern;

/*
 * Renamed from eJu
 */
public final class eju_0 {
    private static final Pattern qzJ = Pattern.compile("[0-9a-fA-F]+");
    public static final int qzK = 16;

    private eju_0() {
    }

    public static boolean sk(String string) {
        return string != null && !string.isEmpty() && string.length() <= 16;
    }

    public static boolean sl(String string) {
        if (string == null || string.isEmpty()) {
            return true;
        }
        if (string.length() != 6) {
            return false;
        }
        return qzJ.matcher(string).matches();
    }
}

