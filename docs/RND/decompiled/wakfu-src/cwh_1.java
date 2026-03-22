/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cWh
 */
public class cwh_1
implements adi_1 {
    private static final Logger nRK = Logger.getLogger(cwh_1.class);
    private static final cwh_1 nRL = new cwh_1();
    public static final String nRM = "map";
    public static final String nRN = "mapWindow";
    private alx_2 ikv;
    private long nLd;
    private Runnable nLe;
    private frx_1 nJs;
    private frx_1 nRO;
    private frx_1 nRP;
    private final fte_1 nRQ = new fte_1();
    private ffl_2 nRR;

    public static cwh_1 eVi() {
        return nRL;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 17491: {
                dae_0 dae_02 = (dae_0)aam_22;
                bif_2.dYO().dYi().k(dae_02.bCn(), dae_02.bCu());
                return false;
            }
            case 17115: {
                boolean bl = ((dae_0)aam_22).bCu();
                bif_2.dYO().dYi().hP(bl);
                cfl_1.setDisplayTerritories(bl);
                return false;
            }
            case 19803: {
                float f2 = bif_2.dYO().getZoomScale() + 0.1f;
                bif_2.dYO().setZoomScale(Math.max(f2, 1.0f));
                return false;
            }
            case 16502: {
                float f3 = bif_2.dYO().getZoomScale() - 0.1f;
                bif_2.dYO().setZoomScale(Math.min(0.0f, f3));
                return false;
            }
            case 16821: {
                dae_0 dae_03 = (dae_0)aam_22;
                bif_2.dYO().setZoomScale((float)dae_03.bCr());
                return false;
            }
        }
        return true;
    }

    public final void a(fll_2 fll_22) {
        fbh_2 fbh_22 = (fbh_2)fll_22.gBE();
        ffl_2 ffl_22 = fbh_22.getSelectedMapZone();
        if (this.nRR == ffl_22) {
            return;
        }
        this.nRR = ffl_22;
        bif_2.dYO().dYV();
        if (this.nRR == null) {
            fbj_1.getInstance().getPopupContainer().eKH();
            return;
        }
        ffh_2 ffh_22 = (ffh_2)ffl_22.gvT();
        if (!ffh_22.dYo()) {
            return;
        }
        String string = ffh_22.dZs();
        if (string == null || string.isEmpty()) {
            return;
        }
        fse_1.gFu().f("mapPopupDescription", string);
        try {
            fse_1.gFu().f("currentMapScrollDecoratorPath", String.format(auc_0.cVq().bS("mapScrollDecoratorPath"), ffh_22.dYm()));
        }
        catch (fu_0 fu_02) {
            nRK.warn((Object)fu_02.getMessage());
        }
        int n = ffl_22.gvP();
        int n2 = ffl_22.gvR();
        int n3 = ffl_22.gvQ();
        int n4 = ffl_22.gvS();
        int n5 = (int)((float)n / 86.0f - (float)n2 / 43.0f);
        int n6 = (int)(-((float)n / 86.0f + (float)n2 / 43.0f));
        int n7 = (int)((float)n3 / 86.0f - (float)n4 / 43.0f);
        int n8 = (int)(-((float)n3 / 86.0f + (float)n4 / 43.0f));
        acc_1 acc_12 = fbh_22.isoToScreen(n5, n6, true);
        acc_1 acc_13 = fbh_22.isoToScreen(n7, n8, true);
        int n9 = acc_13.bWx() - acc_12.bWx();
        int n10 = acc_13.bWy() - acc_12.bWy();
        this.nRQ.ace(acc_12.bWx() + fbh_22.getScreenX() + fbh_22.getAppearance().getContentWidth() / 2 - n9 / 2);
        this.nRQ.acf(acc_12.bWy() + fbh_22.getScreenY());
        this.nRQ.setWidth(n9);
        this.nRQ.setHeight(n10);
        this.nRP.b(this.nRQ);
    }

    public final void c(fln_2 fln_22) {
        String string = fln_22.gEi().getName();
        if (!fln_22.gEi().isEditable() && (string == null || string.isEmpty())) {
            return;
        }
        fse_1.gFu().f("mapPopupDescription", string);
        fbb_2 fbb_22 = (fbb_2)fln_22.gBE();
        this.nRQ.ace(fln_22.gEe() + fbb_22.getScreenX() - fln_22.gEg() / 2);
        this.nRQ.acf(fln_22.gEf() + fbb_22.getScreenY() - fln_22.gEh() / 2);
        this.nRQ.setWidth(fln_22.gEg());
        this.nRQ.setHeight(fln_22.gEh());
        if (this.nRQ.getDisplayX() < fbj_1.getInstance().getWidth() / 2) {
            this.nJs.b(this.nRQ);
        } else {
            this.nRO.b(this.nRQ);
        }
    }

    public final boolean eVj() {
        return fse_1.gFu().dp("mapPopupIsEditing");
    }

    public final void kA(boolean bl) {
        fhs_2 fhs_22;
        fse_1.gFu().f("mapPopupIsEditing", bl);
        if (bl && (fhs_22 = fbj_1.getInstance().getPopupContainer().getElementMap()) != null) {
            fdu_1 fdu_12 = (fdu_1)fhs_22.uH("textEditor");
        }
    }

    public final void eVk() {
        fbj_1.getInstance().getPopupContainer().eKH();
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    void eRn() {
        long l = System.currentTimeMillis();
        if (l - this.nLd > 30000L) {
            this.nLd = l;
            cnz cnz2 = new cnz();
            aue_0.cVJ().etu().d(cnz2);
        }
    }

    public static void a(fad_1 fad_12, float f2) {
        fsm_1 fsm_12 = fad_12.getPrefSize();
        if (fsm_12 == null) {
            return;
        }
        fad_12.setSize((int)((float)fsm_12.width * f2), (int)((float)fsm_12.height * f2));
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.ikv = new cwi_1(this);
            fyw_0.gqw().a(this.ikv);
            fse_1.gFu().f("landMarkGfxs", aue_0.cVJ().cVK().dnX().ekE());
            bid_2 bid_22 = bif_2.dYO().dYi();
            bid_22.a(new bRn());
            bid_22.a(biu_2.kgA);
            bid_22.dYI();
            bif_2.dYO().dXL();
            bif_2.dYO().setDisplayTerritories(((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljx));
            this.nJs = this.qP("mapEditablePopup");
            this.nRO = this.qP("mapEditablePopup2");
            this.nRP = this.qP("completeMapPopup");
            fes_2 fes_22 = (fes_2)ccj_2.g("mapDialog", 131072L);
            if (fes_22 == null) {
                return;
            }
            fes_22.setVisible(false);
            fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("mapDialog");
            if (fhs_22 != null) {
                fbh_2 fbh_22 = (fbh_2)fhs_22.uH(nRM);
                fbh_22.a(new cwj_2(this, fes_22));
                bif_2.dYO().a(fbh_22);
            }
            this.nRQ.l(fhs_22);
            cfl_1.reset();
            fyw_0.gqw().d("wakfu.map", cfl_1.class);
            cAY.eHc().nP(600021L);
            this.eRn();
            this.kA(false);
            this.nLe = new cwk_2(this);
            abg_2.bUP().a(this.nLe, 30000L, -1);
            cAY.eHc().e(0.1f, 1000);
            cAY.eHc().f(0.1f, 1000);
        }
    }

    private frx_1 qP(String string) {
        ccj_2.g(string, 8200L);
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(string);
        if (fhs_22 != null) {
            return (frx_1)fhs_22.uH("popup");
        }
        return null;
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tl("mapDialog");
            fyw_0.gqw().tl("mapEditablePopup");
            fyw_0.gqw().tl("mapEditablePopup2");
            fyw_0.gqw().tl("completeMapPopup");
            this.nJs = null;
            this.nRO = null;
            this.nRP = null;
            this.nRQ.l(null);
            fse_1.gFu().f("landMarkGfxs", (Object)null);
            bif_2.dYO().a((fbh_2)null);
            bRq.ekK().ekM();
            cfl_1.setCurrentWorldPositionMarker(null);
            cfl_1.setCurrentNote(null);
            fyw_0.gqw().tc("wakfu.map");
            cAY.eHc().nP(600022L);
            fhn_1.gzT().bYz();
            abg_2.bUP().h(this.nLe);
            this.nLe = null;
            cfl_1.reset();
            cAY.eHc().e(1.0f, 1000);
            cAY.eHc().f(1.0f, 1000);
        }
    }
}

