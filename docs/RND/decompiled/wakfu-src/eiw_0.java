/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eIW
 */
public class eiw_0
implements eit_0 {
    private static boolean m(char c2) {
        return c2 >= '\u0e00' && c2 <= '\u0e7f';
    }

    @Override
    public eik_0 sf(@NotNull String string) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            if (eiw_0.m(cArray[i])) continue;
            return eii_0.a(eij_0.qxi, cArray[i]);
        }
        if (string.length() < 3) {
            return eii_0.b(eij_0.qxg);
        }
        if (string.length() > 25) {
            return eii_0.b(eij_0.qxh);
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

