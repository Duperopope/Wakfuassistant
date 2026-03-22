/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fEU
 */
public class feu_1 {
    public void f(int n, float[] fArray) {
        fArray[0] = feu_1.aaM(n >> 16);
        fArray[1] = feu_1.aaM(n >> 8);
        fArray[2] = feu_1.aaM(n);
        fArray[3] = feu_1.aaM(n >> 24);
        feu_1.d(fArray, fArray);
        fArray[3] = 1.0f - fArray[3];
    }

    public int ad(float[] fArray) {
        fArray[3] = 1.0f - fArray[3];
        feu_1.c(fArray, fArray);
        return feu_1.fD(fArray[2]) | feu_1.fD(fArray[1]) << 8 | feu_1.fD(fArray[0]) << 16 | feu_1.fD(fArray[3]) << 24;
    }

    float aaL(int n) {
        return n == 0 ? -1.0f : (n == 2 ? 0.5f : 1.0f);
    }

    private static float aaM(int n) {
        return (float)(n & 0xFF) / 255.0f;
    }

    private static int fD(float f2) {
        return (int)(255.0f * f2);
    }

    private static float[] c(float[] fArray, float[] fArray2) {
        if (fArray2 == null) {
            fArray2 = new float[3];
        }
        float f2 = fArray[0];
        float f3 = fArray[1];
        float f4 = fArray[2];
        if (f3 > 0.0f) {
            f2 = f2 < 1.0f ? f2 * 6.0f : 0.0f;
            float f5 = f4 + f3 * (f4 > 0.5f ? 1.0f - f4 : f4);
            float f6 = 2.0f * f4 - f5;
            fArray2[0] = feu_1.K(f5, f6, f2 < 4.0f ? f2 + 2.0f : f2 - 4.0f);
            fArray2[1] = feu_1.K(f5, f6, f2);
            fArray2[2] = feu_1.K(f5, f6, f2 < 2.0f ? f2 + 4.0f : f2 - 2.0f);
        } else {
            fArray2[0] = f4;
            fArray2[1] = f4;
            fArray2[2] = f4;
        }
        return fArray2;
    }

    private static float[] d(float[] fArray, float[] fArray2) {
        if (fArray2 == null) {
            fArray2 = new float[3];
        }
        float f2 = feu_1.J(fArray[0], fArray[1], fArray[2]);
        float f3 = feu_1.I(fArray[0], fArray[1], fArray[2]);
        float f4 = f2 + f3;
        float f5 = f2 - f3;
        if (f5 > 0.0f) {
            f5 /= f4 > 1.0f ? 2.0f - f4 : f4;
        }
        fArray2[0] = feu_1.d(fArray[0], fArray[1], fArray[2], f2, f3);
        fArray2[1] = f5;
        fArray2[2] = f4 / 2.0f;
        return fArray2;
    }

    static float I(float f2, float f3, float f4) {
        float f5 = f2 < f3 ? f2 : f3;
        return f5 < f4 ? f5 : f4;
    }

    static float J(float f2, float f3, float f4) {
        float f5 = Math.max(f2, f3);
        return Math.max(f5, f4);
    }

    static float d(float f2, float f3, float f4, float f5, float f6) {
        float f7 = f5 - f6;
        if (f7 > 0.0f) {
            if (f5 == f2) {
                if ((f7 = (f3 - f4) / f7) < 0.0f) {
                    f7 += 6.0f;
                }
            } else {
                f7 = f5 == f3 ? 2.0f + (f4 - f2) / f7 : 4.0f + (f2 - f3) / f7;
            }
            f7 /= 6.0f;
        }
        return f7;
    }

    private static float K(float f2, float f3, float f4) {
        if (f4 < 1.0f) {
            return f3 + (f2 - f3) * f4;
        }
        if (f4 < 3.0f) {
            return f2;
        }
        if (f4 < 4.0f) {
            return f3 + (f2 - f3) * (4.0f - f4);
        }
        return f3;
    }
}

