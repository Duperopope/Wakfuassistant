/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bJp
 */
class bjp_0
implements fns_0 {
    final /* synthetic */ bjo_0 klv;

    bjp_0(bjo_0 bjo_02) {
        this.klv = bjo_02;
    }

    @Override
    public void mx(String string) {
    }

    @Override
    public void Hk(int n) {
        if (this.klv.kle == null) {
            return;
        }
        bjo_0 bjo_02 = this.klv.klr.dpe();
        if (this.klv.kls.geL().d() != bjo_02.ead().geL().d()) {
            return;
        }
        fnm_0 fnm_02 = new fnm_0(bjo_02);
        fnm_02.Xu(n);
        this.klv.kle.a(this.klv.kls.geM());
    }

    @Override
    public void Hl(int n) {
        bjo_0 bjo_02;
        bjn_0.a(this.klv.kls, this.klv.kle, n, null, this.klv.klr);
        bjo_0 bjo_03 = bjo_02 = this.klv.kls.geL().gfz() ? this.klv.klr.dpf() : this.klv.klr.dpe();
        if (bjo_02 == null) {
            return;
        }
        if (this.klv.kls.geL().d() != bjo_02.ead().geL().d()) {
            return;
        }
        fnm_0 fnm_02 = new fnm_0(bjo_02);
        try {
            fnm_02.Xs(n);
        }
        catch (foD foD2) {
            bjo_0.klq.error((Object)"Exception raised", (Throwable)foD2);
        }
        if (this.klv.klr.bwb() && this.klv.klr.dpf() != null) {
            this.klv.klr.dni();
        }
    }

    @Override
    public void Hm(int n) {
        this.klv.b(n > 0, WU.bQg);
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
        this.klv.b(ux_02.bjv(), WU.bQg);
    }

    @Override
    public void Ho(int n) {
        this.klv.b(n <= 0, WU.bQg);
    }
}

