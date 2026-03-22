/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fDB
 */
public class fdb_1
extends fss_2<Float> {
    public fdb_1(Float f2, Float f3, fdz_1 fdz_12, int n, int n2, abn abn2) {
        super(f2, f3, fdz_12, n, n2, abn2);
    }

    public fdz_1 guX() {
        return (fdz_1)super.getWidget();
    }

    @Override
    public boolean Ma(int n) {
        if (!super.Ma(n)) {
            return false;
        }
        if (this.tXJ != null) {
            float f2 = this.tXJ.h(((Float)this.veb).floatValue(), ((Float)this.vec).floatValue(), this.bUi, this.bMn);
            this.guX().setZoom(f2);
        }
        return true;
    }

    @Override
    public void cbz() {
        this.guX().setZoom(((Float)this.vec).floatValue());
    }

    @Override
    public /* synthetic */ fes_2 getWidget() {
        return this.guX();
    }
}

