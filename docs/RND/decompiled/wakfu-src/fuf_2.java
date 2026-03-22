/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fUF
 */
class fuf_2 {
    static final float vlO = (float)Math.PI;

    fuf_2() {
    }

    static void a(float[] fArray, int[] nArray, int n, int n2, float[] fArray2, int n3, float f2, float f3) {
        int n4;
        float f4 = (float)Math.PI / (float)n2;
        for (n4 = 0; n4 < n3; ++n4) {
            fArray2[n4] = fud_1.gj(fArray2[n4]);
        }
        int n5 = n3 / 2 * 2;
        n4 = 0;
        while (n4 < n) {
            int n6;
            int n7 = nArray[n4];
            float f5 = 0.70710677f;
            float f6 = 0.70710677f;
            float f7 = fud_1.gj(f4 * (float)n7);
            for (n6 = 0; n6 < n5; n6 += 2) {
                f6 *= fArray2[n6] - f7;
                f5 *= fArray2[n6 + 1] - f7;
            }
            if ((n3 & 1) != 0) {
                f6 *= fArray2[n3 - 1] - f7;
                f6 *= f6;
                f5 *= f5 * (1.0f - f7 * f7);
            } else {
                f6 *= f6 * (1.0f + f7);
                f5 *= f5 * (1.0f - f7);
            }
            f6 = f5 + f6;
            n6 = Float.floatToIntBits(f6);
            int n8 = Integer.MAX_VALUE & n6;
            int n9 = 0;
            if (n8 < 2139095040 && n8 != 0) {
                if (n8 < 0x800000) {
                    f6 = (float)((double)f6 * 3.3554432E7);
                    n6 = Float.floatToIntBits(f6);
                    n8 = Integer.MAX_VALUE & n6;
                    n9 = -25;
                }
                n9 += (n8 >>> 23) - 126;
                n6 = n6 & 0x807FFFFF | 0x3F000000;
                f6 = Float.intBitsToFloat(n6);
            }
            f6 = fud_1.gl(f2 * fud_1.gk(f6) * fud_1.acx(n9 + n3) - f3);
            do {
                int n10 = n4++;
                fArray[n10] = fArray[n10] * f6;
            } while (n4 < n && nArray[n4] == n7);
        }
    }
}

