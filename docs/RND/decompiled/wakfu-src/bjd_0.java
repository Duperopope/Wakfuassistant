/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bJd
 */
class bjd_0
implements fns_0 {
    private final bgt_0 kkk;
    private final ffS kkl;
    private int eoY = -1;

    bjd_0(bgt_0 bgt_02, ffS ffS2) {
        this.kkk = bgt_02;
        this.kkl = ffS2;
    }

    @Override
    public void mx(String string) {
    }

    @Override
    public void Hk(int n) {
    }

    @Override
    public void Hl(int n) {
    }

    @Override
    public void Hm(int n) {
    }

    @Override
    public void Hn(int n) {
        ffV ffV2 = this.kkk.dmL().a(this.kkk.dnP(), this.kkl);
        if (ffV2 == null || !ffV2.adO()) {
            return;
        }
        fnl_0 fnl_02 = ffV2.ead();
        short s = fnl_02.cmL();
        if (this.eoY == s) {
            return;
        }
        this.kkk.dlk();
        this.eoY = s;
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
    }
}

