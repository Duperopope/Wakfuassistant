/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bDM
 */
class bdm_0
implements ffl {
    final /* synthetic */ bdl_0 jLB;

    bdm_0(bdl_0 bdl_02) {
        this.jLB = bdl_02;
    }

    @Override
    public void a(ffm ffm2) {
        ffV ffV2 = fgD.fXh().Ve(ffm2.acs());
        bgz_2.a(ffV2, ffm2.bfd(), null);
        if (this.jLB.jLA == null) {
            return;
        }
        this.jLB.hz(false);
        this.jLB.jLA.X(this.jLB.dRu());
    }

    @Override
    public void b(ffm ffm2) {
        ffV ffV2 = fgD.fXh().Ve(ffm2.acs());
        bgz_2.e(ffV2, ffm2.bfd());
        if (this.jLB.jLA == null) {
            return;
        }
        this.jLB.hz(false);
        this.jLB.jLA.X(this.jLB.dRu());
    }

    @Override
    public void a(ffm ffm2, int n) {
        ffV ffV2 = fgD.fXh().Ve(ffm2.acs());
        if (n > 0) {
            bgz_2.a(ffV2, n, null);
        } else {
            bgz_2.e(ffV2, Math.abs(n));
        }
        if (this.jLB.jLA == null) {
            return;
        }
        this.jLB.hz(false);
        this.jLB.jLA.X(this.jLB.dRu());
    }
}

