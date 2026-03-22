/*
 * Decompiled with CFR 0.152.
 */
class aZr
implements aqg_1<amr_0> {
    final /* synthetic */ azq_0 hyi;

    aZr(azq_0 azq_02) {
        this.hyi = azq_02;
    }

    public void a(amr_0 amr_02) {
        int n = amr_02.d();
        short s = amr_02.clb();
        int n2 = amr_02.aGs();
        int n3 = amr_02.AM();
        byte by = amr_02.bcN();
        int n4 = amr_02.aJe();
        int n5 = amr_02.coU();
        this.hyi.hyg.a(n, s, n2, by, n3, n4, n5);
        if (azq_0.hyh.isTraceEnabled()) {
            azq_0.hyh.trace((Object)("Loaded view id=" + n + " type=" + s + " gfx=" + n2 + " color=" + n3 + " height=" + by));
        }
    }

    @Override
    public /* synthetic */ void load(aqz_2 aqz_22) {
        this.a((amr_0)aqz_22);
    }
}

