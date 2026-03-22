/*
 * Decompiled with CFR 0.152.
 */
class aci
extends ack_0 {
    private int cfT;
    private float cfS;
    private float cfR;

    aci() {
    }

    @Override
    void d(float f2, float f3, int n, int n2) {
        this.cfT = n2;
        this.cfS = f3 * f3 / (float)(n2 * n2);
        this.cfR = 1.0f - this.cfS;
    }

    @Override
    float a(int n, int n2, float f2, float[] fArray, int n3) {
        int n4 = n2 + this.cfT;
        float f3 = 0.0f;
        if (n4 >= 0 && n4 < n3) {
            f3 = fArray[n + n4 * n3];
        }
        return f2 * this.cfR + f3 * this.cfS;
    }
}

