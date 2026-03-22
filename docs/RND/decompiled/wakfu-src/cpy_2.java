/*
 * Decompiled with CFR 0.152.
 */
import java.util.regex.Pattern;

/*
 * Renamed from cPy
 */
public final class cpy_2 {
    private static final Pattern nhM = Pattern.compile("^1[0-9]{3}0[1-3]$");

    private cpy_2() {
    }

    public static boolean pX(String string) {
        return nhM.matcher(string).matches();
    }
}

