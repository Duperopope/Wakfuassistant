/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aBR
 */
public final class abr_1 {
    private static final Logger dAi = Logger.getLogger(abr_1.class);

    private static float cD(int n, int n2) {
        int n3 = n + n2 * 57;
        n3 = n3 << 13 ^ n3;
        return 1.0f - (float)(n3 * (n3 * n3 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE) / 1.0737418E9f;
    }

    private static float cE(int n, int n2) {
        float f2 = (abr_1.cD(n - 1, n2 - 1) + abr_1.cD(n + 1, n2 - 1) + abr_1.cD(n - 1, n2 + 1) + abr_1.cD(n + 1, n2 + 1)) / 16.0f;
        float f3 = (abr_1.cD(n - 1, n2) + abr_1.cD(n + 1, n2) + abr_1.cD(n, n2 + 1) + abr_1.cD(n, n2 - 1)) / 8.0f;
        float f4 = abr_1.cD(n, n2) / 4.0f + f2 + f3;
        return f4;
    }

    private static float a(float f2, float f3, aca_1 aca_12) {
        int n = f2 < 0.0f ? (int)(f2 - 1.0f) : (int)f2;
        int n2 = f3 < 0.0f ? (int)(f3 - 1.0f) : (int)f3;
        float f4 = f2 - (float)n;
        float f5 = f3 - (float)n2;
        float f6 = abr_1.cE(n, n2);
        float f7 = abr_1.cE(n + 1, n2);
        float f8 = abr_1.cE(n, n2 + 1);
        float f9 = abr_1.cE(n + 1, n2 + 1);
        float f10 = aca_12.h(f6, f7, f4);
        float f11 = aca_12.h(f8, f9, f4);
        return aca_12.h(f10, f11, f5);
    }

    public static float a(float f2, float f3, float f4, int n, aca_1 aca_12) {
        float f5 = 0.0f;
        float f6 = 1.0f;
        float f7 = 1.0f;
        for (int i = 0; i < n - 1; ++i) {
            f5 += abr_1.a(f2 * f6, f3 * f6, aca_12) * f7;
            f6 *= 2.0f;
            f7 *= f4;
        }
        return f5;
    }

    public static void a(float[] fArray, int n, int n2, float f2, float f3, int n3, int n4, float f4, int n5, abw_1 abw_12) {
        abw_1 abw_13 = abw_12 != null ? abw_12 : abs_1.dAj;
        for (int i = 0; i < n2; ++i) {
            float f5 = (float)(i + n4) * f3 / (float)n2;
            for (int j = 0; j < n; ++j) {
                float f6 = (float)(j + n3) * f2 / (float)n;
                float f7 = abr_1.a(f6, f5, f4, n5, abw_13.btn());
                fArray[j + i * n] = abw_13.h(f6, f5, f7);
            }
        }
    }
}

