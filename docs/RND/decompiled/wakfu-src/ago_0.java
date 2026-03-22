/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from agO
 */
public class ago_0
implements agq_0 {
    final acb_1 cuM = new acb_1();
    final float cuN;
    float azQ = 1.0f;

    public ago_0(float f2) {
        this.cuN = f2;
    }

    @Override
    public void setScale(float f2) {
        this.azQ = f2;
    }

    @Override
    public acb_1 aV(float f2, float f3) {
        float f4 = this.cuN * this.azQ;
        float f5 = f4 * f4;
        float f6 = aco_1.bn(f2, f3);
        if (f6 <= f5 + 0.01f) {
            return null;
        }
        float f7 = f4 / GC.J(f6);
        this.cuM.bj(f7 * f2, f7 * f3);
        return this.cuM;
    }
}

