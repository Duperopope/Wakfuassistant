/*
 * Decompiled with CFR 0.152.
 */
class acj
extends ack_0 {
    private int cfQ;
    private int cfT;
    private float ceE;
    private float ceF;
    private float ceG;
    private float ceH;

    acj() {
    }

    @Override
    void d(float f2, float f3, int n, int n2) {
        this.cfQ = n;
        this.cfT = n2;
        float f4 = f2 * f2 / (float)(n * n);
        float f5 = f3 * f3 / (float)(n2 * n2);
        this.ceE = (1.0f - f4) * (1.0f - f5);
        this.ceF = (1.0f - f4) * f5;
        this.ceG = f4 * (1.0f - f5);
        this.ceH = f4 * f5;
    }

    @Override
    float a(int n, int n2, float f2, float[] fArray, int n3) {
        int n4 = n + this.cfQ;
        int n5 = n2 + this.cfT;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        if (n5 >= 0 && n5 < n3) {
            f3 = fArray[n + n5 * n3];
            if (n4 >= 0 && n4 < n3) {
                f5 = fArray[n4 + n5 * n3];
            }
        }
        if (n4 >= 0 && n4 < n3) {
            f4 = fArray[n4 + n2 * n3];
        }
        return f2 * this.ceE + f3 * this.ceF + f4 * this.ceG + f5 * this.ceH;
    }
}

