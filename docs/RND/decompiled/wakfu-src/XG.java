/*
 * Decompiled with CFR 0.152.
 */
public final class XG {
    private static final int bSD = 50000;
    private static final int bSE = 10;
    private static final float bSF = 0.7f;
    private static final float bSG = 0.9f;

    private XG() {
    }

    public static float qE(int n) {
        int n2 = GC.a(n, 0, 50000);
        int n3 = n2 * 10 / 50000;
        float f2 = (float)n3 / 10.0f;
        return GC.a(0.7f, 0.9f, f2);
    }

    public static float a(float f2, float f3, int n, int n2) {
        return abn.cdr.h(f2, f3, n, n2);
    }

    public static float d(float f2, float f3, float f4, float f5) {
        return abn.cds.h(f3, f3 + f4, f2, f5);
    }

    public static float e(float f2, float f3, float f4, float f5) {
        return abn.cdp.h(f3, f4, f2, f5);
    }

    public static float b(float f2, float f3, int n, int n2) {
        return abn.cdq.h(f2, f3, n, n2);
    }

    public static float c(float f2, float f3, int n, int n2) {
        return abn.cdt.h(f2, f3, n, n2);
    }
}

