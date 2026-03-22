/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from agR
 */
public class agr_0
implements agq_0 {
    public final int cuQ;
    public final int cuR;
    public final int cuS;
    public final int cuT;
    final acb_1 cuU = new acb_1();
    float azQ = 1.0f;

    public agr_0(int n, int n2) {
        this.cuQ = -n;
        this.cuR = n;
        this.cuS = -n2;
        this.cuT = n2;
    }

    @Override
    public void setScale(float f2) {
        this.azQ = f2;
    }

    @Override
    public acb_1 aV(float f2, float f3) {
        if (Math.abs(f2) / (float)this.cuR >= Math.abs(f3) / (float)this.cuT) {
            float f4 = (float)this.cuQ * this.azQ;
            if (f2 <= f4 - 0.01f) {
                float f5 = f4;
                float f6 = f3 * f5 / f2;
                this.cuU.bj(f5, f6);
                return this.cuU;
            }
            float f7 = (float)this.cuR * this.azQ;
            if (f2 >= f7 + 0.01f) {
                float f8 = f7;
                float f9 = f3 * f8 / f2;
                this.cuU.bj(f8, f9);
                return this.cuU;
            }
        } else {
            float f10 = (float)this.cuS * this.azQ;
            if (f3 <= f10 - 0.01f) {
                float f11 = f10;
                float f12 = f2 * f11 / f3;
                this.cuU.bj(f12, f11);
                return this.cuU;
            }
            float f13 = (float)this.cuT * this.azQ;
            if (f3 >= f13 + 0.01f) {
                float f14 = f13;
                float f15 = f2 * f14 / f3;
                this.cuU.bj(f15, f14);
                return this.cuU;
            }
        }
        return null;
    }
}

