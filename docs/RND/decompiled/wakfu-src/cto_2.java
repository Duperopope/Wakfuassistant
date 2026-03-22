/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cTO
 */
public class cto_2
implements adi_1 {
    private static final cto_2 nKu = new cto_2();
    private bno_2 nKv;
    private final alx_2 nKw = string -> {
        if (string.equals("dimensionalBagCraftFeeDialog")) {
            aue_0.cVJ().b(cto_2.eQY());
        }
    };
    private final alx_2 nKx = string -> {
        if (string.equals("recipeViewDialog")) {
            if (cte_2.eQE()) {
                fyw_0.gqw().tc("wakfu.crafts");
            }
            fse_1.gFu().vX("recipeView");
            fyw_0.gqw().b(this.nKw);
        }
    };

    public static cto_2 eQY() {
        return nKu;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 16103: {
                dae_0 dae_02 = (dae_0)aam_22;
                boolean bl = dae_02.bCu();
                this.nKv.gF(bl);
                return false;
            }
            case 17123: {
                dae_0 dae_03 = (dae_0)aam_22;
                boolean bl = dae_03.bCu();
                this.nKv.gE(bl);
                return false;
            }
            case 19536: {
                int n;
                eke_0 eke_02;
                dcx dcx2 = (dcx)aam_22;
                boolean bl = !dcx2.fbR();
                ekb_0 ekb_02 = dcx2.dyn();
                ekc_0<ekd_0> ekc_02 = this.nKv.a(ekb_02);
                ekd_0 ekd_02 = ekc_02.getValue();
                eke_0 eke_03 = eke_02 = ekd_02 != null ? ekd_02.fyD() : ekd_0.fyE();
                if (bl && (ekd_02 == null || ekc_02.fyB())) {
                    return false;
                }
                int n2 = n = bl ? 0 : dcx2.dzm();
                if (dcx2.fbT()) {
                    eke_02.QQ(n);
                } else {
                    eke_02.QR(n);
                }
                this.nKv.a(ekb_02, eke_02.fyH(), dcx2.fbS());
                return false;
            }
            case 19467: {
                dcy dcy2 = (dcy)aam_22;
                this.nKv.c(dcy2.dyn());
                return false;
            }
            case 16894: {
                dcw dcw2 = (dcw)aam_22;
                int n = dcw2.rX();
                if (!dcw2.fbR()) {
                    this.nKv.Ew(n);
                } else {
                    this.nKv.j(n, dcw2.dzm(), dcw2.fbS());
                }
                return false;
            }
            case 16168: {
                String string = "dimensionalBagOverriddenCraftFeeDialog";
                if (!fyw_0.gqw().to("dimensionalBagOverriddenCraftFeeDialog")) {
                    this.nKv.dyw();
                    ccj_2.g("dimensionalBagOverriddenCraftFeeDialog", 32768L);
                } else {
                    fyw_0.gqw().tl("dimensionalBagOverriddenCraftFeeDialog");
                }
                return false;
            }
            case 17765: {
                dae_0 dae_04 = (dae_0)aam_22;
                eKR eKR2 = (eKR)dae_04.bCv();
                bgt_0 bgt_02 = aue_0.cVJ().cVK();
                aUQ aUQ2 = aue_0.cVJ().cVO();
                bmf_2 bmf_22 = new bmf_2(eKR2.cms(), aUQ2.xl(), bgt_02.dpK());
                bmv_1 bmv_12 = new bmv_1(eKR2, bmf_22);
                fse_1.gFu().f("recipeView", bmv_12);
                String string = "recipeViewDialog";
                if (fyw_0.gqw().to("recipeViewDialog")) break;
                fyw_0.gqw().a(this.nKx);
                ccj_2.pd("recipeViewDialog");
                if (fyw_0.gqw().tb("wakfu.crafts")) break;
                fyw_0.gqw().d("wakfu.crafts", ceh_2.class);
            }
        }
        return true;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().a(this.nKw);
            eki_0 eki_02 = aue_0.cVJ().cVK().dpK();
            this.nKv = new bno_2(eki_02);
            fse_1.gFu().f("dimensionalBagCraftFeeView", this.nKv);
            ccj_2.g("dimensionalBagCraftFeeDialog", 32768L);
            fyw_0.gqw().d("wakfu.dimensionalBag.craftFee", cem_2.class);
            cAY.eHc().eHq();
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            bhJ bhJ2;
            bgt_0 bgt_02;
            bnv_2 bnv_22;
            fyw_0.gqw().tl("dimensionalBagCraftFeeDialog");
            if (fyw_0.gqw().to("dimensionalBagOverriddenCraftFeeDialog")) {
                fyw_0.gqw().tl("dimensionalBagOverriddenCraftFeeDialog");
            }
            if ((bnv_22 = (bgt_02 = aue_0.cVJ().cVK()).dnw()) != null && (bhJ2 = bnv_22.dyS()).Xi() == bgt_02.Xi()) {
                eki_0 eki_02 = bhJ2.dpK();
                eki_02.G(this.nKv.dyx());
                eki_02.lG(!this.nKv.dyz());
                eki_02.lH(this.nKv.dyA());
                eki_02.H(this.nKv.dyy());
                cnk cnk2 = new cnk();
                cnk2.h(eki_02.fyw());
                aie_0.cfo().etu().d(cnk2);
            }
            this.nKv = null;
            fyw_0.gqw().b(this.nKw);
            fse_1.gFu().vX("dimensionalBagCraftFeeView");
            fyw_0.gqw().tc("wakfu.dimensionalBag.craftFee");
            cAY.eHc().eHr();
        }
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

