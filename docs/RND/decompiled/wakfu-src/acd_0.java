/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from acD
 */
public final class acd_0
implements acc_0 {
    private static final int cgO = 7;
    public static final int cgP = 128;
    private static final int cgQ = 127;
    private static final int cgR = 16383;
    private final float[][] cgS;
    private final aci_1 cgT = new aci_1(0, 0, 0, 0);

    public acd_0() {
        this.cgS = new float[16384][];
        for (int i = 0; i < 16384; ++i) {
            this.cgS[i] = new float[]{0.0f, 0.0f, 0.0f};
        }
    }

    public final void b(float[] fArray, int n, int n2, int n3, int n4) {
        for (int i = 0; i < n2; ++i) {
            int n5 = i * n;
            int n6 = acd_0.bo(n3, i + n4);
            for (int j = 0; j < n; ++j) {
                float f2 = fArray[j + n5];
                float[] fArray2 = this.cgS[j + n6 & 0x3FFF];
                fArray2[0] = fArray2[0] * f2;
                fArray2[1] = fArray2[1] * f2;
                fArray2[2] = fArray2[2] * f2;
            }
        }
    }

    public final void a(float[] fArray, int n, int n2, int n3, int n4, float f2, float f3) {
        assert (this.cgS.length >= fArray.length);
        float f4 = (1.0f - f2) * (1.0f - f3);
        float f5 = (1.0f - f2) * f3;
        float f6 = f2 * (1.0f - f3);
        float f7 = f2 * f3;
        for (int i = 0; i < n2 - 1; ++i) {
            int n5 = i * n;
            int n6 = (i + 1) * n;
            int n7 = acd_0.bo(n3, i + n4);
            for (int j = 0; j < n - 1; ++j) {
                float f8 = fArray[j + n5];
                float f9 = fArray[j + n6];
                float f10 = fArray[j + 1 + n5];
                float f11 = fArray[j + 1 + n6];
                float f12 = f4 * f8 + f5 * f9 + f6 * f10 + f7 * f11;
                float[] fArray2 = this.cgS[j + n7 & 0x3FFF];
                fArray2[0] = f12;
                fArray2[1] = f12;
                fArray2[2] = f12;
            }
        }
    }

    @Override
    public final void a(int n, int n2, int n3, float f2, float f3, float f4, float f5, float f6, float f7) {
        int n4 = acd_0.bo(n, n2);
        float[] fArray = this.cgS[n4];
        fArray[0] = fArray[0] + f2;
        fArray[1] = fArray[1] + f3;
        fArray[2] = fArray[2] + f4;
    }

    public float[] s(int n, int n2, int n3) {
        int n4 = acd_0.bo(n, n2);
        return this.cgS[n4];
    }

    @Override
    public aci_1 bty() {
        return this.cgT;
    }

    @Override
    public void h(int n, int n2, int n3, int n4) {
        this.cgT.y(n, n + n3, n2, n2 + n4);
    }

    public String toString() {
        return "LightMap window={" + String.valueOf(this.cgT) + "}";
    }

    private static int bo(int n, int n2) {
        return (n & 0x7F) + ((n2 & 0x7F) << 7);
    }

    public void reset() {
        int n = this.cgT.bWF();
        int n2 = this.cgT.bWH();
        int n3 = this.cgT.bWJ() - 1;
        int n4 = this.cgT.bWK() - 1;
        for (int i = 0; i < n4; ++i) {
            int n5 = (i + n2 & 0x7F) << 7;
            for (int j = 0; j < n3; ++j) {
                float[] fArray = this.cgS[(j + n & 0x7F) + n5];
                fArray[0] = 1.0f;
                fArray[1] = 1.0f;
                fArray[2] = 1.0f;
            }
        }
    }
}

