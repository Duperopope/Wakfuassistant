/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

public class bNG {
    private static final bNG kEc = new bNG();

    public static bNG egl() {
        return kEc;
    }

    public static void a(int n, Object ... objectArray) {
        if (n == -1) {
            return;
        }
        String string = bNG.b(n, objectArray);
        aPh.czg().iY(string);
    }

    public static void a(byh_1 byh_12, int n, Object ... objectArray) {
        if (n == -1) {
            return;
        }
        String string = bNG.b(n, objectArray);
        aPh.czg().iY(string);
        byj_1.epo().a(byc_1.c(byh_12, string));
    }

    @NotNull
    public static String b(int n, Object ... objectArray) {
        return aum_0.cWf().c(bNG.Io((int)n).kHC, objectArray);
    }

    @NotNull
    private static bNH Io(int n) {
        bNH bNH2 = bNH.Iq(n);
        return bNH2 != null ? bNH2 : bNH.kEe;
    }

    @NotNull
    public static String Ip(int n) {
        return bNG.Io((int)n).kHC;
    }
}

