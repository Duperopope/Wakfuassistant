/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ddw
 */
public final class ddw_0 {
    static String j(String string, Object ... objectArray) {
        String string2 = aum_0.cWf().c(string, objectArray);
        if (string2 == null) {
            return string;
        }
        return string2;
    }

    public static int NZ(int n) {
        return GC.A((float)n * ddw_0.fcF());
    }

    public static int eY(int n, int n2) {
        return GC.A(((float)n + (float)n2 * 10.0f) * ddw_0.fcF());
    }

    private static float fcF() {
        return 1.0f;
    }
}

