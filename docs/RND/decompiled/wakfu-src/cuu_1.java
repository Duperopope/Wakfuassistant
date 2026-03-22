/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cUu
 */
public final class cuu_1
implements adi_1 {
    private static final Logger nMi = Logger.getLogger(cuu_1.class);
    private static final boolean nMj = false;
    private static final cuu_1 nMk = new cuu_1();
    private cuw_2 nMl = cuw_2.nMt;
    private bgy nMm;
    private afW nMn;
    private final czn_2 nMo = czn_2.oaQ;

    public static cuu_1 eRU() {
        return nMk;
    }

    private cuu_1() {
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        this.reset();
        aag_0 aag_02 = aie_0.cfn().bmC().bqL();
        this.nMn = aag_02.byR();
        aag_02.bL(true);
        this.a(cuw_2.nMr);
        this.nMo.a(this.e(aag_02));
        this.nMo.a(new cuv_1(this));
    }

    private agk e(aag_0 aag_02) {
        bsj_0 bsj_02 = cub_1.eSi().cXk();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bsj_02 == null || bsj_02.bag() == null) {
            if (bgt_02 == null) {
                return null;
            }
            return new agm(bgt_02.ddI(), aag_02);
        }
        return new agl(bsj_02.bag(), aag_02);
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        this.reset();
        cuu_1.eRY();
        this.nMo.eZe();
    }

    private void reset() {
        this.nMm = null;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        if (!this.nMo.b(aam_22)) {
            return false;
        }
        cue_2.eSA().eSB();
        return true;
    }

    void a(cuw_2 cuw_22) {
        assert (cuw_22 != null);
        if (this.nMl != cuw_22) {
            this.nMl = cuw_22;
            this.eRX();
        }
    }

    void eRV() {
        this.a(cuw_2.nMs);
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    private agj eRW() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bsj_0 bsj_02 = bgt_02.dmV();
        agj agj2 = new agj(bgt_02.ddI(), bsj_02 == null ? null : bsj_02.bag());
        if (bsj_02 == null) {
            agj2.a(bgt_02.ddI(), 1);
            return agj2;
        }
        int n = bsj_02.dGs().size();
        for (bgy bgy2 : bgt_02.dmV().dGs()) {
            int n2;
            if (bgy2.dlw()) continue;
            int n3 = n2 = bgy2 instanceof bhx_0 ? 10 : 12;
            if (this.nMm != null && bgy2 == this.nMm) {
                agj2.a(bgy2.ddI(), Math.max(n2, n2 * n));
                continue;
            }
            agj2.a(bgy2.ddI(), n2);
        }
        if (agj2.byY() < 1) {
            nMi.error((Object)"Il devrait y avoir au moins 1 target (le localPlayer");
        }
        return agj2;
    }

    public void bZ(bgy bgy2) {
        if (this.nMl != cuw_2.nMu) {
            this.eRV();
        }
        this.nMm = bgy2;
        this.eRX();
    }

    public void ca(bgy bgy2) {
        if (this.nMl == cuw_2.nMs) {
            this.bZ(bgy2);
        }
    }

    public void bhR() {
        this.eRX();
    }

    void eRX() {
        aam_0 aam_02 = aie_0.cfn().bmC();
        switch (this.nMl.ordinal()) {
            case 1: {
                aam_02.b(this.eRW());
                break;
            }
            case 2: {
                if (this.nMm == null) break;
                aam_02.b(this.nMm.ddI());
            }
        }
    }

    public static void eRY() {
        bgt_0 bgt_02 = bvz_0.dLl();
        if (bgt_02 == null) {
            nMi.error((Object)"Impossible de recentrer la cam\u00e9ra sur le leader, celui-ci est inconnu");
            return;
        }
        aam_0 aam_02 = aie_0.cfn().bmC();
        aam_02.b(bgt_02.ddI());
        aam_02.cy(aJP.cig().cii());
    }
}

