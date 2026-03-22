/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fCo
 */
class fco_1
extends fss_2<Float> {
    private boolean btq;
    final /* synthetic */ fce_2 tYk;

    private fco_1(fce_2 fce_22) {
        this.tYk = fce_22;
        this.btq = false;
    }

    fco_1(fce_2 fce_22, float f2, float f3, fce_2 fce_23, int n, int n2, abn abn2) {
        this.tYk = fce_22;
        super(Float.valueOf(f2), Float.valueOf(f3), fce_23, n, n2, abn2);
        this.btq = false;
    }

    public void bG(float f2, float f3) {
        if (this.btq) {
            this.bMn += 500;
            this.vec = Float.valueOf(f3);
        }
        this.btq = true;
    }

    @Override
    public boolean Ma(int n) {
        if (!super.Ma(n)) {
            return false;
        }
        if (this.tXJ != null && this.veb instanceof Float && this.vec instanceof Float) {
            this.tYk.tXz = this.tXJ.h(((Float)this.veb).floatValue(), ((Float)this.vec).floatValue(), this.bUi, this.bMn);
            this.tYk.gtF();
        }
        return true;
    }

    @Override
    public void cbz() {
        this.tYk.tXz = ((Float)this.vec).floatValue();
        this.tYk.gtF();
        super.cbz();
    }

    public String toString() {
        return "[ProgressBarTween] " + String.valueOf(this.veb) + " -> " + String.valueOf(this.vec);
    }
}

