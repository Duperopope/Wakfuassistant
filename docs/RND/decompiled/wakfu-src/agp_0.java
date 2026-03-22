/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from agP
 */
public class agp_0
implements agq_0 {
    final acb_1 cuO = new acb_1(0.0f, 0.0f);

    @Override
    public void setScale(float f2) {
    }

    @Override
    public acb_1 aV(float f2, float f3) {
        if (Math.abs(f2) + Math.abs(f3) < 0.01f) {
            return null;
        }
        return this.cuO;
    }
}

