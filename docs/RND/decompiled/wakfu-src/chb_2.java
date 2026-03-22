/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.awt.Point;
import org.apache.log4j.Logger;

/*
 * Renamed from cHB
 */
@fyf_0
public class chb_2
extends cex_2 {
    private static final Logger mZN = Logger.getLogger(chb_2.class);
    public static final String PACKAGE = "wakfu.worldEditor";
    private static final int mZO = 30;
    private static final int mZP = 30;
    private static final int mZQ = 5;
    private static acc_1 mZR;
    private static int mZS;
    static boolean mZT;
    private static boolean mZU;
    private static chg_2 mZV;
    static int mZW;
    static int mZX;
    static fsb_0 mZY;

    public static void close(flp_2 flp_22) {
        if (czc_2.eYH().eYQ().isDirty()) {
            fiq_2.gCw().d(fik_2.a((String string) -> chb_2.eKo()).l("question.havenWorldEditorClose", new Object[0]).vG(ccp_2.mRM.byf()));
        } else {
            chb_2.eKo();
        }
    }

    private static void eKo() {
        fyw_0.gqw().tl("worldEditorDialog");
    }

    public static void keyPressed(fli_2 fli_22, cie_1 cie_12) {
        switch (fli_22.bCC()) {
            case 39: {
                cie_12.bB(30.0f, 0.0f);
                break;
            }
            case 37: {
                cie_12.bB(-30.0f, 0.0f);
                break;
            }
            case 38: {
                cie_12.bB(0.0f, 30.0f);
                break;
            }
            case 40: {
                cie_12.bB(0.0f, -30.0f);
                break;
            }
        }
    }

    public static void onMouseOut(flp_2 flp_22, cie_1 cie_12) {
        fhn_1.gzT().bYz();
        fib_2.gBU().eKH();
        fse_1.gFu().f("havenWorldOverCatalogEntry", (Object)null);
        chb_2.resetDrag(flp_22, cie_12);
    }

    public static void onMapDrag(flp_2 flp_22, cie_1 cie_12) {
        if (mZR == null || mZY != null) {
            return;
        }
        mZT = true;
        int n = flp_22.x(cie_12);
        int n2 = flp_22.y(cie_12);
        int n3 = n - mZR.bWx();
        int n4 = n2 - mZR.bWy();
        if (Math.abs(n3) > mZS || Math.abs(n4) > mZS) {
            mZS = 0;
            cie_12.bB((float)n3 / cie_12.getZoomFactor(), (float)n4 / cie_12.getZoomFactor());
            mZR.cG(n, n2);
        }
    }

    public static void onMouseWheel(flp_2 flp_22, cie_1 cie_12) {
        if (flp_22.gEo() < 0) {
            cie_12.dXW();
        } else {
            cie_12.dXX();
        }
    }

    public static void onClick(flp_2 flp_22, cie_1 cie_12, faw_2 faw_22) {
        if (mZT) {
            mZT = false;
            return;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bjn_1 bjn_12 = bgt_02.dpI();
        ezz_1 ezz_12 = bjn_12.jP(bgt_02.Sn());
        if (ezz_12 == null) {
            return;
        }
        fab fab2 = bjn_12.jR(ezz_12.Xm());
        if (fab2 == null) {
            return;
        }
        if (!fab2.b(eyh_2.rKM)) {
            return;
        }
        mZW = flp_22.x(cie_12);
        mZX = flp_22.y(cie_12);
        faw_22.setVisible(false);
        mZY = null;
        if (flp_22.gEm()) {
            Object object;
            cie_12.setCurrentLayer(czc_2.eYH().eYQ().eke());
            cie_12.setSelectTool();
            if (cie_12.getCurrentLayer() != fsc_0.tdW) {
                return;
            }
            fsb_0 fsb_02 = cie_12.getBuildingUnderMouse(mZW, mZX);
            if (fsb_02 == null) {
                mZU = false;
                fhn_1.gzT().bYz();
                fib_2.gBU().eKH();
                return;
            }
            fsb_0 fsb_03 = fsb_02;
            bQE bQE2 = czc_2.eYH().a(fsb_03);
            if (bQE2 != null && bQE2.ejH().eLe() == ciz_1.ndX) {
                return;
            }
            mZY = fsb_03;
            if (bQE2 != null) {
                String string = bQE2.getName();
                bRf bRf2 = bQE2.ejG();
                fse_1.gFu().f("selectedBuilding", bRf2);
            } else {
                object = bRb.kYS.mc(mZY.Lx());
                if (object != null) {
                    String string = ((bQW)object).getName();
                    bRf bRf3 = ((bQW)object).ejG();
                    fse_1.gFu().f("selectedBuilding", object);
                } else {
                    mZY = null;
                }
            }
            object = (fey_2)faw_22.getElementMap().uH("worldEditorDialog");
            ((fey_2)object).a(new chc_1(faw_22, cie_12, (fey_2)object));
            ((fhi_2)object).setNeedsToPostProcess();
            fbj_1.getInstance().a(fzq_0.tJU, new chd_2(faw_22), true);
        }
        if (flp_22.gEk()) {
            cie_12.ex(mZW, mZX);
            byte by = czc_2.eYH().eYQ().ekf();
            if (by != bQV.kXN.d() && by != bQV.kXL.d()) {
                cie_12.setSelectTool();
                mZU = false;
            }
        }
    }

    public static void evolveBuilding(fiq_1 fiq_12, cie_1 cie_12, faw_2 faw_22) {
        faw_22.setVisible(false);
        chb_2.evolveBuilding(fiq_12, bRb.kYS.mc(mZY.Lx()));
    }

    public static void removeBuilding(flp_2 flp_22, cie_1 cie_12, faw_2 faw_22) {
        faw_22.setVisible(false);
        if (mZY == null) {
            return;
        }
        if (mZY.Lx() < 0L) {
            bQE bQE2 = czc_2.eYH().a(mZY);
            dbc_0 dbc_02 = new dbc_0(bQE2);
            dbc_02.lK(17941);
            aaw_1.bUq().h(dbc_02);
        } else {
            cie_12.setTool(new cij_1());
            cie_12.ex(mZW, mZX);
            cie_12.setSelectTool();
        }
    }

    public static void moveBuilding(flp_2 flp_22, cie_1 cie_12, faw_2 faw_22) {
        faw_22.setVisible(false);
        if (mZY == null) {
            return;
        }
        fhn_1.gzT().a(fzo_0.tHw, true);
        mZU = true;
        fse_1.gFu().f("havenWorldCatalogPlacingMode", mZU);
        cie_12.setTool(new cio_1(mZY));
        cie_12.getTool().eB(flp_22.x(cie_12), flp_22.y(cie_12));
    }

    public static void resetDrag(flp_2 flp_22, cie_1 cie_12) {
        mZR = null;
        mZS = 5;
        cie_12.eLa();
        cie_12.c((fsd_0)null);
    }

    public static void onMousePress(flp_2 flp_22, cie_1 cie_12) {
        if (mZR == null && flp_22.gEm()) {
            mZR = new acc_1(flp_22.x(cie_12), flp_22.y(cie_12));
            mZS = 5;
        }
    }

    public static void onMouseMove(flp_2 flp_22, cie_1 cie_12, faw_2 faw_22) {
        int n;
        int n2 = flp_22.x(cie_12);
        boolean bl = chb_2.a(cie_12, n2, n = flp_22.y(cie_12));
        if (bl && chb_2.a(cie_12)) {
            return;
        }
        if (!mZU) {
            if (bl || cie_12.getTool() instanceof cim_1) {
                fhn_1.gzT().a(fzo_0.tHw, true);
                fib_2.gBU().a(null, cie_12.getWorkingHavenWorld().fRp() + " \u00a7", 30, 0, faa_2.tLN);
            } else {
                fhn_1.gzT().bYz();
                fib_2.gBU().eKH();
            }
        } else {
            fhn_1.gzT().a(fzo_0.tHw, true);
        }
        cie_12.ew(n2, n);
        faw_22.setVisible(false);
        fsb_0 fsb_02 = cie_12.getBuildingUnderMouse(n2, n);
        if (mZU || mZT || cie_12.getCurrentLayer() != fsc_0.tdW || fsb_02 == mZY) {
            return;
        }
        if (fsb_02 == null) {
            fse_1.gFu().f("havenWorldOverCatalogEntry", (Object)null);
            return;
        }
        long l = fsb_02.Lx();
        bQW bQW2 = bRb.kYS.mc(l);
        if (bQW2 == null) {
            bQE bQE2 = czc_2.eYH().a(fsb_02);
            fse_1.gFu().f("havenWorldOverCatalogEntry", bQE2);
        } else {
            fse_1.gFu().f("havenWorldOverCatalogEntry", bQW2);
        }
        faw_22.setPosition(new Point(n2, n + 15));
        faw_22.setVisible(true);
    }

    private static boolean a(cie_1 cie_12) {
        cpg_1 cpg_12 = cie_12.getTool();
        if (!(cpg_12 instanceof cim_1)) {
            try {
                cie_12.setTool(new cim_1(cpg_12, cie_12.getWorkingHavenWorld().fRp()));
            }
            catch (Exception exception) {
                mZN.error((Object)"", (Throwable)exception);
                return true;
            }
        }
        return false;
    }

    private static boolean a(cie_1 cie_12, int n, int n2) {
        acc_1 acc_12 = cie_12.getPatchCoordFromMouse(n, n2);
        short s = fsq_0.ZR(acc_12.bWx());
        short s2 = fsq_0.ZS(acc_12.bWy());
        return cim_1.b(cie_12, s, s2);
    }

    public static void zoomIn(flp_2 flp_22, cie_1 cie_12) {
        cie_12.dXW();
    }

    public static void zoomOut(flp_2 flp_22, cie_1 cie_12) {
        cie_12.dXX();
    }

    public static void validate(flp_2 flp_22, cie_1 cie_12) {
        dae_0.cV((short)16635);
    }

    public static void onMouseOverElement(fiq_1 fiq_12, bRf bRf2, frx_1 frx_12) {
        fyd_0.popup(fiq_12, frx_12);
        fes_2 fes_22 = (fes_2)fiq_12.gBE();
        fes_22.getAppearance().setModulationColor(aid_0.dUD);
        fse_1.gFu().f("havenWorldOverCatalogEntry", bRf2);
        if (bRf2.ein()) {
            cAY.eHc().nP(600193L);
        } else {
            cAY.eHc().nP(600010L);
        }
    }

    public static void onMouseOutElement(fiq_1 fiq_12, bRf bRf2, frx_1 frx_12) {
        fyd_0.closePopup(fiq_12, frx_12);
        fes_2 fes_22 = (fes_2)fiq_12.gBE();
        if (bRf2.equals(fse_1.gFu().vY("havenWorldSelectedCatalogEntry"))) {
            fes_22.getAppearance().setModulationColor(aid_0.dUD);
        } else {
            fes_22.getAppearance().setModulationColor(awx_2.dnF);
        }
        fse_1.gFu().f("havenWorldOverCatalogEntry", (Object)null);
    }

    public static void toggleQuotationsMode(fiq_1 fiq_12) {
        boolean bl = fse_1.gFu().dp("havenWorldCatalogQuotationMode");
        fse_1.gFu().f("havenWorldCatalogQuotationMode", !bl);
        chb_2.unloadConflictContainer(fiq_12);
    }

    public static void removeEntryFromQuotation(fiq_1 fiq_12, bQE bQE2) {
        dbc_0 dbc_02 = new dbc_0(bQE2);
        dbc_02.lK(17941);
        aaw_1.bUq().h(dbc_02);
    }

    public static void onMouseOverQuotationElement(flg_2 flg_22, cie_1 cie_12) {
        bQE bQE2 = (bQE)flg_22.getItemValue();
        ciy_1 ciy_12 = bQE2.ejH();
        if (ciy_12 != null) {
            cie_12.c((fsd_0)ciy_12.eLi());
        }
    }

    public static void onMouseOutQuotationElement(flg_2 flg_22, cie_1 cie_12) {
        cie_12.c((fsd_0)null);
    }

    public static void selectElementFromCatalog(flg_2 flg_22) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bjn_1 bjn_12 = bgt_02.dpI();
        ezz_1 ezz_12 = bjn_12.jP(bgt_02.Sn());
        if (ezz_12 == null) {
            return;
        }
        fab fab2 = bjn_12.jR(ezz_12.Xm());
        if (fab2 == null) {
            return;
        }
        if (!fab2.b(eyh_2.rKM)) {
            fiq_2.gCw().d(fik_2.gBZ().a(fin_2.uCx).l("error.noRightToManageHavenWorld", new Object[0]).vG(ccp_2.mRM.byf()).abQ(1));
            return;
        }
        bRf bRf2 = (bRf)flg_22.getItemValue();
        if (!bRf2.ein()) {
            return;
        }
        dby dby2 = new dby(bRf2);
        dby2.lK(18156);
        aaw_1.bUq().h(dby2);
        fhn_1.gzT().a(fzo_0.tHw, true);
        mZU = true;
        fse_1.gFu().f("havenWorldCatalogPlacingMode", mZU);
        fbj_1.getInstance().a(fzq_0.tJU, new che_2(), true);
    }

    public static void cancelAction() {
        mZU = false;
        fse_1.gFu().f("havenWorldCatalogPlacingMode", mZU);
        fhn_1.gzT().bYz();
        fse_1.gFu().f("havenWorldSelectedCatalogEntry", (Object)null);
    }

    public static void selectCategory(flg_2 flg_22) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(17806);
        dae_02.ay(((bQK)flg_22.getItemValue()).aJr());
        aaw_1.bUq().h(dae_02);
    }

    public static void selectSubCategoryFromCatalog(fiq_1 fiq_12, bQN bQN2) {
        bQN2.dJz();
    }

    public static void unloadConflictContainer(fiq_1 fiq_12) {
        czc_2.eYH().eYR();
    }

    public static void onConflictTextClick(fiq_1 fiq_12, cie_1 cie_12) {
        fdy_1 fdy_12 = (fdy_1)fiq_12.gBE();
        fgb_2 fgb_22 = fdy_12.getBlockUnderMouse();
        if (fgb_22 == null || fgb_22.gyV() != fgc_2.uuh) {
            return;
        }
        fgk_2 fgk_22 = fgb_22.gyW();
        if (fgk_22.gzE() != ahr_2.dSC) {
            return;
        }
        String string = ((fgm_1)fgk_22).getId();
        if (string != null && string.length() > 0) {
            try {
                String[] stringArray = string.split(";");
                int n = Bw.m(stringArray[0]);
                int n2 = Bw.m(stringArray[1]);
                cie_12.ev(n, n2);
            }
            catch (Exception exception) {
                mZN.error((Object)"", (Throwable)exception);
            }
        }
    }

    public static void stopScroll(fiq_1 fiq_12) {
        if (mZV != null) {
            if (fiq_12 != null && fiq_12.gBy() == fzq_0.tJR && mZV.b((flp_2)fiq_12)) {
                return;
            }
            abg_2.bUP().h(mZV);
            mZV = null;
        }
    }
}

