/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eIR
 */
public class eir_0
implements eit_0 {
    private static final char qxV = '\u00b7';

    private static boolean m(char c2) {
        boolean bl = c2 >= '\u4e00' && c2 <= '\u9fa5';
        boolean bl2 = c2 >= '\u3041' && c2 <= '\u3096';
        return bl || bl2 || c2 == '\u00b7';
    }

    @Override
    public eik_0 sf(@NotNull String string) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            if (eir_0.m(cArray[i])) continue;
            return eii_0.a(eij_0.qxi, cArray[i]);
        }
        if (string.length() < 2) {
            return eii_0.b(eij_0.qxg);
        }
        if (string.length() > 10) {
            return eii_0.b(eij_0.qxh);
        }
        if (eir_0.b(string, '\u00b7') > 1) {
            return eii_0.a(eij_0.qxq, '\u00b7');
        }
        if (string.length() > 1 && (string.charAt(0) == '\u00b7' || string.charAt(string.length() - 1) == '\u00b7')) {
            return eii_0.a(eij_0.qxs, '\u00b7');
        }
        return eii_0.b(eij_0.qxf);
    }

    private static int b(String string, char c2) {
        int n = 0;
        int n2 = string.length();
        for (int i = 0; i < n2; ++i) {
            if (string.charAt(i) != c2) continue;
            ++n;
        }
        return n;
    }
}

