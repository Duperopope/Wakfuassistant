/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fUE
 */
class fue_1 {
    final ful_1 vlN = new ful_1();
    int vjH;
    int vjI;

    fue_1() {
    }

    static float a(float[] fArray, float[] fArray2, int n, int n2) {
        int n3;
        float f2;
        float[] fArray3 = new float[n2 + 1];
        int n4 = n2 + 1;
        while (n4-- != 0) {
            f2 = 0.0f;
            for (n3 = n4; n3 < n; ++n3) {
                f2 += fArray[n3] * fArray[n3 - n4];
            }
            fArray3[n4] = f2;
        }
        float f3 = fArray3[0];
        for (n3 = 0; n3 < n2; ++n3) {
            f2 = -fArray3[n3 + 1];
            if (f3 == 0.0f) {
                for (int i = 0; i < n2; ++i) {
                    fArray2[i] = 0.0f;
                }
                return 0.0f;
            }
            for (n4 = 0; n4 < n3; ++n4) {
                f2 -= fArray2[n4] * fArray3[n3 - n4];
            }
            fArray2[n3] = f2 /= f3;
            for (n4 = 0; n4 < n3 / 2; ++n4) {
                float f4 = fArray2[n4];
                int n5 = n4;
                fArray2[n5] = fArray2[n5] + f2 * fArray2[n3 - 1 - n4];
                int n6 = n3 - 1 - n4;
                fArray2[n6] = fArray2[n6] + f2 * f4;
            }
            if (n3 % 2 != 0) {
                int n7 = n4;
                fArray2[n7] = fArray2[n7] + fArray2[n4] * f2;
            }
            f3 = (float)((double)f3 * (1.0 - (double)(f2 * f2)));
        }
        return f3;
    }

    float e(float[] fArray, float[] fArray2) {
        int n;
        int n2 = this.vjH;
        float[] fArray3 = new float[n2 + n2];
        float f2 = (float)(0.5 / (double)n2);
        for (n = 0; n < n2; ++n) {
            fArray3[n * 2] = fArray[n] * f2;
            fArray3[n * 2 + 1] = 0.0f;
        }
        fArray3[n2 * 2 - 1] = fArray[n2 - 1] * f2;
        this.vlN.aj(fArray3);
        n = 0;
        int n3 = (n2 *= 2) / 2;
        while (n < n2 / 2) {
            float f3 = fArray3[n];
            fArray3[n++] = fArray3[n3];
            fArray3[n3++] = f3;
        }
        return fue_1.a(fArray3, fArray2, n2, this.vjI);
    }

    void cy(int n, int n2) {
        this.vjH = n;
        this.vjI = n2;
        this.vlN.tZ(n * 2);
    }

    void clear() {
        this.vlN.clear();
    }

    static float bR(float f2, float f3) {
        return (float)Math.sqrt(f2 * f2 + f3 * f3);
    }

    void a(float[] fArray, float[] fArray2, float f2) {
        int n;
        for (n = 0; n < this.vjH * 2; ++n) {
            fArray[n] = 0.0f;
        }
        if (f2 == 0.0f) {
            return;
        }
        for (n = 0; n < this.vjI; ++n) {
            fArray[n * 2 + 1] = fArray2[n] / (4.0f * f2);
            fArray[n * 2 + 2] = -fArray2[n] / (4.0f * f2);
        }
        this.vlN.aj(fArray);
        n = this.vjH * 2;
        float f3 = (float)(1.0 / (double)f2);
        fArray[0] = (float)(1.0 / (double)(fArray[0] * 2.0f + f3));
        for (int i = 1; i < this.vjH; ++i) {
            float f4 = fArray[i] + fArray[n - i];
            float f5 = fArray[i] - fArray[n - i];
            float f6 = f4 + f3;
            fArray[i] = (float)(1.0 / (double)fue_1.bR(f6, f5));
        }
    }
}

