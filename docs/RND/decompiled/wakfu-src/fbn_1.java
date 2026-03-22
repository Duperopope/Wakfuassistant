/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fBn
 */
class fbn_1
extends fss_2<Float> {
    private int tSk;
    final /* synthetic */ fbm_1 tSl;

    public fbn_1(fbm_1 fbm_12, Float f2, Float f3, int n, int n2, abn abn2, int n3) {
        this.tSl = fbm_12;
        super(f2, f3, fbm_12, n, n2, abn2);
        this.acd(n3);
        this.pp(false);
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
        double d2 = 4.71238898038469;
        double d3 = 1.5707963267948966;
        if (this.tSk == 0 && (double)f2 >= 1.5707963267948966) {
            ++this.tSk;
            this.tSl.gsS();
        } else if (this.tSk == 1 && (double)f2 < 1.5707963267948966) {
            this.tSk = 0;
        }
        this.tSl.tSa.b(this.tSl.kuf ? acp_1.dAU : acp_1.dAV, f2);
        return true;
    }

    @Override
    public void cbz() {
        super.cbz();
        this.tSl.tSa.b(this.tSl.kuf ? acp_1.dAU : acp_1.dAV, ((Float)this.vec).floatValue());
    }
}

