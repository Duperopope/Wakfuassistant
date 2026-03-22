/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cXB
 */
class cxb_1
implements fns_0 {
    final ffV nWx;
    final /* synthetic */ cxx_1 nWy;

    cxb_1(cxx_1 cxx_12, ffV ffV2) {
        this.nWy = cxx_12;
        this.nWx = ffV2;
        fnl_0 fnl_02 = this.nWx.ead();
        fnl_02.a(this);
        uw_0 uw_02 = new uw_0(fnl_02.geO());
        ux_0 ux_02 = ue_0.bjV().bjc();
        uz_0 uz_02 = uw_02.l(ux_02);
        uz_0 uz_03 = new uz_0(fnl_02.geL().gfv());
        int n = uz_02.f(uz_03);
        uz_03.pQ(n + 1);
        uw_02.a(uz_03);
    }

    @Override
    public void mx(String string) {
    }

    @Override
    public void Hk(int n) {
        this.nWy.eXe();
        fse_1.gFu().a((aef_2)this.nWx, this.nWx.bxk());
    }

    @Override
    public void Hl(int n) {
        this.nWy.eXe();
        fse_1.gFu().a((aef_2)this.nWx, this.nWx.bxk());
    }

    @Override
    public void Hm(int n) {
        if (n == 0) {
            this.nWy.bT(this.nWx);
        }
        fse_1.gFu().a((aef_2)this.nWx, this.nWx.bxk());
        this.eXn();
    }

    @Override
    public void Hn(int n) {
    }

    @Override
    public void I(ux_0 ux_02) {
    }

    @Override
    public void J(ux_0 ux_02) {
    }

    @Override
    public void K(ux_0 ux_02) {
    }

    @Override
    public void Ho(int n) {
        this.eXn();
    }

    public void eXn() {
        ffV ffV2;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return;
        }
        ffV ffV3 = bgt_02.dmL().a(bgt_02.dnP(), ffS.sgX);
        if (ffV3 != null && ffV3 == this.nWx) {
            bgt_02.dlk();
        }
        if ((ffV2 = bgt_02.dmL().a(bgt_02.dnP(), ffS.sgZ)) != null && ffV2 == this.nWx) {
            bgt_02.dlk();
        }
    }
}

