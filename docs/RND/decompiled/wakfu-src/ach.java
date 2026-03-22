/*
 * Decompiled with CFR 0.152.
 */
class ach
extends ack_0 {
    private int cfQ;
    private float cfR;
    private float cfS;

    ach() {
    }

    @Override
    void d(float f2, float f3, int n, int n2) {
        this.cfQ = n;
        this.cfS = f2 * f2 / (float)(n * n);
        this.cfR = 1.0f - this.cfS;
    }

    @Override
    float a(int n, int n2, float f2, float[] fArray, int n3) {
        int n4 = n + this.cfQ;
        float f3 = 0.0f;
        if (n4 >= 0 && n4 < n3) {
            f3 = fArray[n4 + n2 * n3];
        }
        return f2 * this.cfR + f3 * this.cfS;
    }
}

