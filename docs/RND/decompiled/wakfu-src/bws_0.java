/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bwS
 */
public abstract class bws_0
implements bwl_0 {
    protected final bwo_0 jAk = new bwo_0();
    protected final st_0 jAl = new st_0();

    public bws_0() {
        this.jAl.bqN = 1000;
        this.jAl.bqP = false;
    }

    protected final anp_2 a(rh_0 rh_02, bgy bgy2, bdj_2 bdj_22, int n, float f2, float f3) {
        rh_02.b(bgy2);
        this.jAl.bqO = n;
        this.jAk.a(bgy2.dkZ(), bgy2.bcP());
        this.jAk.eA(f2);
        this.jAk.eB(f3);
        anp_2 anp_22 = aeO.a(bdj_22, cub_1.eSi().eSj(), this.jAl, rh_02, this.jAk);
        this.jAk.reset();
        rh_02.bdF();
        return anp_22;
    }
}

