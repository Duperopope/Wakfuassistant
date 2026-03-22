/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Zn
 */
class zn_0
extends za_0
implements acv_0 {
    zn_0(zm_0 zm_02) {
        super(zm_02);
    }

    @Override
    public final void qF(int n) {
    }

    @Override
    public final void boS() {
    }

    @Override
    public final void bhk() {
        acq_0.cge.b(this);
    }

    @Override
    public final void start() {
        acq_0.cge.a(this);
    }

    @Override
    public boolean bpa() {
        float f2 = this.bUt[0].floatValue();
        float f3 = this.bUt[1].floatValue();
        float f4 = this.bUt[2].floatValue();
        return arn_2.aY(f2, 1.0f) && arn_2.aY(f3, 1.0f) && arn_2.aY(f4, 1.0f);
    }

    @Override
    public int bpb() {
        return 0;
    }

    @Override
    public void a(int n, int n2, int n3, int n4, float[] fArray) {
        float f2 = this.bUt[0].floatValue();
        float f3 = this.bUt[1].floatValue();
        float f4 = this.bUt[2].floatValue();
        fArray[0] = fArray[0] * f2;
        fArray[1] = fArray[1] * f3;
        fArray[2] = fArray[2] * f4;
    }
}

