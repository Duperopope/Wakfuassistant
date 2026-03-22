/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cVz
 */
public class cvz_1
implements adi_1 {
    private static final cvz_1 nPV = new cvz_1();
    private static final String nPW = "plainBackground";
    private cre_2 nPX;
    private alx_2 ikv;

    private cvz_1() {
    }

    public static cvz_1 eUB() {
        return nPV;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 19343: {
                dae_0 dae_02 = (dae_0)aam_22;
                String string = dae_02.bCt();
                if (BH.aU(string)) {
                    return false;
                }
                this.nPX.qd(string);
                return false;
            }
            case 17273: {
                this.nPX.eMI();
                cvz_1.u(new fhl_2(ett_1.oqP));
                return false;
            }
            case 17266: {
                dae_0 dae_03 = (dae_0)aam_22;
                axb_2 axb_22 = (axb_2)dae_03.bCv();
                this.nPX.t(axb_22);
            }
        }
        return true;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        this.ikv = string -> {
            if (string.equals("illustrationDialog")) {
                aue_0.cVJ().b(nPV);
            }
        };
        int n = ((bsg_1)aie_0.cfn().bmH()).d(bsn_1.llc);
        crf_2 crf_22 = crf_2.Mk(n);
        String string2 = auc_0.cVq().l("defaultBackgroundIllustrationPath", null);
        this.nPX = new cre_2(string2, crf_22);
        fse_1.gFu().f("outGameIllustration", this.nPX);
        fyw_0.gqw().a(this.ikv);
        ccj_2.g("illustrationDialog", 270336L);
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        fyw_0.gqw().b(this.ikv);
        fyw_0.gqw().tl("illustrationDialog");
        fse_1.gFu().f("outGameIllustration", (Object)null);
        this.nPX = null;
    }

    public static void eUC() {
        if (!aue_0.cVJ().c(nPV)) {
            aue_0.cVJ().a(nPV);
        }
    }

    public static void u(axb_2 axb_22) {
        fhv_1 fhv_12 = fyw_0.gqw().th("illustrationDialog");
        if (fhv_12 == null) {
            return;
        }
        fkk_1 fkk_12 = (fkk_1)fhv_12.getChildWithId(nPW);
        if (fkk_12 == null) {
            return;
        }
        fkk_12.setColor(axb_22);
    }
}

