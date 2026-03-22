/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aCg
 */
public final class acg_1 {
    public static float bk(float f2, float f3) {
        acg_1.b(f2, f3);
        return f2 * f3;
    }

    public static float bl(float f2, float f3) {
        acg_1.b(f2, f3);
        return f2 + f3 - acg_1.bk(f2, f3);
    }

    public static float F(float f2, float f3, float f4) {
        acg_1.b(f2, f3);
        return f2 + f3 + f4 - acg_1.bk(f2, f3) - acg_1.bk(f2, f4) - acg_1.bk(f3, f4) + acg_1.Z(f2, f3, f4);
    }

    public static float Z(float ... fArray) {
        if (fArray.length == 0) {
            return 0.0f;
        }
        double d2 = fArray[0];
        for (int i = 1; i < fArray.length; ++i) {
            double d3 = fArray[i];
            acg_1.b(d3);
            d2 *= d3;
        }
        return (float)d2;
    }

    private static void b(double ... dArray) {
        for (int i = 0; i < dArray.length; ++i) {
            if (dArray[i] < 0.0) {
                throw new IllegalArgumentException("a < 0.0f");
            }
            if (!(dArray[i] > 1.0)) continue;
            throw new IllegalArgumentException("a > 1,0f");
        }
    }
}

