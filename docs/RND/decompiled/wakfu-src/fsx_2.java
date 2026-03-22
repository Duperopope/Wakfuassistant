/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fSx
 */
public class fsx_2
extends fss_2<Float> {
    private final ffq_1 ven;

    public fsx_2(Float f2, Float f3, fes_2 fes_22, int n, int n2, abn abn2, ffq_1 ffq_12, int n3) {
        super(f2, f3, fes_22, n, n2, abn2);
        this.ven = ffq_12;
        this.acd(n3);
    }

    @Override
    public boolean Ma(int n) {
        if (!super.Ma(n)) {
            return false;
        }
        if (this.tXJ == null) {
            return true;
        }
        float f2 = this.tXJ.h(((Float)this.veb).floatValue(), ((Float)this.vec).floatValue(), this.bUi, this.bMn);
        this.ven.B(f2, f2, 1.0f);
        return true;
    }

    @Override
    public void cbz() {
        super.cbz();
        this.ven.B(((Float)this.vec).floatValue(), 1.0f, 1.0f);
    }
}

