/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from blC
 */
class blc_1
implements eyu_1 {
    final /* synthetic */ bly_0 ivo;

    blc_1(bly_0 bly_02) {
        this.ivo = bly_02;
    }

    @Override
    public void a(eyt_1 eyt_12, exz_1 exz_12) {
        boolean bl;
        long l = aue_0.cVJ().cVK().Xi();
        boolean bl2 = exz_12.aZj() != l || exz_12.KU() == this.ivo.ivf.dtO().dcP().Sn();
        boolean bl3 = bl = exz_12.dmc() || exz_12.aXd();
        if (bl && !bl2) {
            bgl_0 bgl_02 = this.ivo.a(exz_12);
            this.ivo.e(bgl_02);
            this.ivo.g(this.ivo.a(exz_12));
            cxs_1.eXb().dRJ();
            this.ivo.setNetEnabled(true);
        }
    }

    @Override
    public void a(eyt_1 eyt_12, exz_1 exz_12, boolean bl) {
        long l = aue_0.cVJ().cVK().Xi();
        if ((exz_12.dmc() || exz_12.aXd()) && exz_12.aZj() == l) {
            bgl_0 bgl_02 = this.ivo.a(exz_12);
            this.ivo.j(bgl_02);
            this.ivo.g(this.ivo.a(exz_12));
            cxs_1.eXb().dRJ();
        }
    }

    @Override
    public void a(eyt_1 eyt_12, long l, long l2) {
    }
}

