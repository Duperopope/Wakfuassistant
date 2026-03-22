/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fBE
 */
class fbe_2
extends afV {
    final /* synthetic */ fbb_2 tUS;

    fbe_2(fbb_2 fbb_22) {
        this.tUS = fbb_22;
    }

    @Override
    public void qy(int n) {
        boolean bl = this.tUS.tUa;
        if (!this.tUS.tTQ.isInitialized()) {
            super.qy(n);
            return;
        }
        this.tUS.tTM.bJk();
        acb_1 acb_12 = this.tUS.tTQ.a(this, bl);
        float f2 = this.drD / 2.0f + (float)this.tUS.uki.getLeftInset();
        float f3 = this.drE / 2.0f + (float)this.tUS.uki.getBottomInset();
        this.a(this.tUS.tTX, f2, f3, acb_12, false, bl);
        if (this.tUS.tUb) {
            this.a(this.tUS.tTV, f2, f3, acb_12, false, bl);
        }
        if (bl) {
            this.tUS.tUa = false;
        }
        this.tUS.tTM.bJd().sort(ffr_2.upF);
        if (this.tUS.tUc) {
            this.a(this.tUS.tTW, f2, f3, acb_12, true, bl);
        }
        super.qy(n);
    }

    private void a(ffw_2 ffw_22, float f2, float f3, acb_1 acb_12, boolean bl, boolean bl2) {
        int n = ffw_22.aVo();
        for (int i = 0; i < n; ++i) {
            fsn_1 fsn_12 = ffw_22.aaT(i);
            if (fsn_12 == null) continue;
            this.tUS.a(this, fsn_12, ffw_22.aaU(i), ffw_22.aaV(i), f2, f3, acb_12, bl, bl2);
        }
    }
}

