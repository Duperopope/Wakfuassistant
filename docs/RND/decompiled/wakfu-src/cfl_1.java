/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cFl
 */
@fyf_0
public class cfl_1 {
    public static final String PACKAGE = "wakfu.map";
    private static final Logger mVF = Logger.getLogger(cfl_1.class);
    private static bRp mUB = null;
    private static cfn_2 mVG = null;
    private static ffl_2 mUD;
    private static fsn_1 mUE;
    private static boolean mUF;
    private static boolean mUG;
    private static boolean mUH;
    private static faa_2 mUI;
    public static final int mVH = 0;
    public static final int mVI = 1;
    public static final int mVJ = 2;
    public static final int mVK = 3;
    public static final int mVL = 4;
    public static int gxk;
    private static String mUN;
    private static fsn_1 mUO;
    static long bgK;
    private static bRk mUP;

    public static void click(flp_2 flp_22) {
        Object t = flp_22.gBE();
        if (!"mapWindow".equals(((fhv_1)t).getId())) {
            return;
        }
        fbh_2 fbh_22 = (fbh_2)((fhv_1)t).getChildWithId("map");
        if (fbh_22 == null) {
            return;
        }
        if (!fgj_1.a(flp_22.getScreenX(), flp_22.getScreenY(), fbh_22.getSize(), ((fes_2)t).getSize())) {
            fyd_0.unloadDialog(flp_22);
        }
    }

    public static void mapZoom(fiq_1 fiq_12) {
        if (fiq_12.gBy() == fzq_0.tJW) {
            if (((flp_2)fiq_12).gEo() > 0) {
                cfl_1.mapZoomOut(fiq_12);
            } else {
                cfl_1.eKq();
            }
            cfl_1.cancelNoteModification(fiq_12);
        }
    }

    public static void mapZoomIn(fiq_1 fiq_12) {
        bif_2.dYO().dXW();
    }

    private static void eKq() {
        bif_2.dYO().dYZ();
        bif_2.dYO().dYV();
    }

    public static void mapZoomOut(fiq_1 fiq_12) {
        bif_2.dYO().dXX();
        bif_2.dYO().dYV();
    }

    private static void cK(short s) {
        biq_1 biq_12 = big_2.l(s, true);
        if (biq_12 == null) {
            return;
        }
        bif_2.dYO().a(biq_12);
        bif_2.dYO().dYV();
    }

    public static void onMapClick(fll_2 fll_22, fbh_2 fbh_22) {
        if (!(fll_22.gDR() || fll_22.gDQ() || fll_22.gDU() || fll_22.gDT())) {
            switch (gxk) {
                case 1: {
                    if (fll_22.gEk() && mUP != null) {
                        bRp bRp2 = bif_2.dYO().dYi().aa((int)fll_22.gEb(), (int)fll_22.gEc(), mUP.aVt());
                        cfl_1.setCurrentNote(bRp2);
                        cAY.eHc().nP(600119L);
                    }
                    mUP = null;
                    gxk = 0;
                    fib_2.gBU().eKH();
                    fhn_1.gzT().bYz();
                    break;
                }
                case 2: {
                    if (mUP != null) {
                        cfn_2 cfn_22 = new cfn_2();
                        String string = aum_0.cWf().c("map.worldPositionMarker.destination", (int)fll_22.gEb(), (int)fll_22.gEc());
                        bif_2.dYO().a(cfn_22.mVN, 2, fll_22.gEb(), fll_22.gEc(), 0.0f, bif_2.dYO().dYd(), string, (Object)cfn_22, bit_2.kgo, aid_0.dUO, false);
                        cAY.eHc().nP(600119L);
                        fib_2.gBU().eKH();
                        fhn_1.gzT().bYz();
                    }
                    gxk = 0;
                    break;
                }
                case 3: {
                    if (fll_22.gEk()) {
                        cfl_1.a((int)fll_22.gEb(), (int)fll_22.gEc(), mUB);
                    } else {
                        cfl_1.deleteNote(mUB);
                    }
                    fib_2.gBU().eKH();
                    fhn_1.gzT().bYz();
                    break;
                }
                case 0: {
                    if (fll_22.getValue() instanceof bRp && fll_22.gEm()) {
                        return;
                    }
                    if (fll_22.getValue() instanceof adr && fll_22.gEk()) {
                        adr adr2 = (adr)fll_22.getValue();
                        if (!adr2.buA()) {
                            return;
                        }
                        cfl_1.cK(adr2.cjA);
                        mUE = null;
                        cfl_1.eKf();
                        return;
                    }
                    if (fll_22.gEm()) {
                        cfl_1.mapZoomOut(fll_22);
                    } else if (fll_22.gEk()) {
                        cfl_1.eKq();
                    }
                    cfl_1.cancelNoteModification(fll_22);
                }
            }
        }
    }

    public static void setTypeFilter(flv_2 flv_22, Byte by) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(17491);
        dae_02.cC(flv_22.bqr());
        dae_02.ay(by);
        aaw_1.bUq().h(dae_02);
    }

    public static void toggleAllFilters(fiq_1 fiq_12, fdd_2 fdd_22) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(17115);
        dae_02.cC(fdd_22.getSelected());
        aaw_1.bUq().h(dae_02);
    }

    public static void setCurrentNote(bRp bRp2) {
        mUB = bRp2;
    }

    public static void setCurrentWorldPositionMarker(cfn_2 cfn_22) {
        mVG = cfn_22;
        fse_1.gFu().f("landMark.currentWorldPositionMarker", cfn_22);
    }

    public static void onMapMove(fll_2 fll_22) {
        bif_2.dYO().dL((int)(fll_22.gEb() / 18.0f), (int)(fll_22.gEc() / 18.0f));
        fbb_2 fbb_22 = (fbb_2)fll_22.gBE();
        int n = fbb_22.getWidth();
        int n2 = fbb_22.getHeight();
        int n3 = fll_22.x(fbb_22);
        int n4 = fll_22.y(fbb_22);
        mUI = n3 < n / 2 ? (n4 < n2 / 2 ? faa_2.tLQ : faa_2.tLK) : (n4 < n2 / 2 ? faa_2.tLS : faa_2.tLM);
        fbh_2 fbh_22 = (fbh_2)fll_22.gBE();
        mUD = fbh_22.getSelectedMapZone();
        cwh_1.eVi().a(fll_22);
        cfl_1.eKf();
    }

    public static void onMousePress(fiq_1 fiq_12) {
        if (mUE != null && mUE.gGo()) {
            mUF = true;
            cfl_1.eKf();
        }
    }

    public static void onMouseRelease(fiq_1 fiq_12) {
        mUF = false;
        cfl_1.eKf();
    }

    public static void onMouseExit(fiq_1 fiq_12) {
        mUD = null;
        mUE = null;
        mUG = false;
        cfl_1.eKf();
    }

    public static void onMouseEnter(fiq_1 fiq_12) {
        mUG = true;
        cfl_1.eKf();
    }

    private static boolean eKr() {
        return !cfl_1.dXU() && bif_2.dYO().dYe();
    }

    private static boolean dXU() {
        return bif_2.dYO().dXU();
    }

    private static void eKf() {
        boolean bl = cfl_1.dXU();
        boolean bl2 = cfl_1.eKr();
        fzo_0 fzo_02 = null;
        if (mUF || gxk == 1 || gxk == 3 || gxk == 4) {
            fzo_02 = !bl2 || !mUG ? fzo_0.tHN : fzo_0.tHM;
        } else if (mUH || mUE != null && bl2 && mUE.gGo()) {
            fzo_02 = fzo_0.tHL;
        } else if (cfl_1.g(mUE)) {
            fzo_02 = fzo_0.tHz;
        } else if (mUD != null) {
            ffh_2 ffh_22 = (ffh_2)mUD.gvT();
            if (bif_2.dYO().dXN() instanceof bio_2 && ffh_22 instanceof bJL) {
                bJL bJL2 = (bJL)ffh_22;
                long l = bJL2.eaX().d();
                if (l != (long)bif_2.dYO().dYW()) {
                    switch (mUI) {
                        case tLK: {
                            fzo_02 = fzo_0.tHZ;
                            break;
                        }
                        case tLM: {
                            fzo_02 = fzo_0.tIa;
                            break;
                        }
                        case tLQ: {
                            fzo_02 = fzo_0.tIb;
                            break;
                        }
                        case tLS: {
                            fzo_02 = fzo_0.tIc;
                        }
                    }
                }
            } else if (ffh_22.dXU()) {
                fzo_02 = fzo_0.tHS;
            } else if (mUD.gvT() instanceof bim_2) {
                bim_2 bim_22 = (bim_2)mUD.gvT();
            }
        }
        if (fzo_02 != null) {
            fhn_1.gzT().a(fzo_02, true);
        } else {
            fhn_1.gzT().bYz();
        }
    }

    private static boolean g(fsn_1 fsn_12) {
        if (fsn_12 == null) {
            return false;
        }
        if (!(fsn_12.getValue() instanceof adr)) {
            return false;
        }
        return ((adr)fsn_12.getValue()).buA();
    }

    public static void onMapItemClick(fln_2 fln_22) {
        if (cfl_1.dXU() || !fln_22.gEm()) {
            cwh_1.eVi().eVk();
            return;
        }
        fsn_1 fsn_12 = fln_22.gEi();
        if (fsn_12.getValue() instanceof ffV) {
            ffV ffV2 = (ffV)fsn_12.getValue();
            bif_2.dYO().x(4, ffV2.avr());
            return;
        }
        if (!fsn_12.isEditable()) {
            return;
        }
        cwh_1.eVi().c(fln_22);
        mUO = fsn_12;
        mUO.pr(true);
        mUB = (bRp)fsn_12.getValue();
        mUN = fse_1.gFu().du("mapPopupDescription");
        cwh_1.eVi().kA(true);
    }

    public static void onMapItemOver(fln_2 fln_22) {
        if (!cwh_1.eVi().eVj()) {
            cwh_1.eVi().c(fln_22);
        }
        if (cfl_1.dXU() && !cfl_1.g(fln_22.gEi())) {
            return;
        }
        mUE = fln_22.gEi();
        cfl_1.eKf();
    }

    public static void onMapItemOut(fln_2 fln_22) {
        if (!cwh_1.eVi().eVj()) {
            cwh_1.eVi().eVk();
        }
        mUE = null;
        cfl_1.eKf();
    }

    public static void onKeyPress(fli_2 fli_22) {
        if (fli_22.bCC() == 127) {
            cfl_1.deleteNote(fli_22);
            cfl_1.deleteWorldPositionMarker(fli_22);
        }
    }

    public static void onTextEditorChange(fli_2 fli_22) {
        fdu_1 fdu_12 = (fdu_1)fli_22.gBE();
        mUN = fdu_12.getText();
    }

    public static void onTextEditorKeyPress(fli_2 fli_22) {
        if (fli_22.bCC() == 10) {
            cfl_1.applyNote(fli_22);
        }
    }

    public static void applyNote(fiq_1 fiq_12) {
        if (mUB == null) {
            return;
        }
        String string = bYV.nU(mUN);
        if (string.isEmpty() && !mUN.isEmpty()) {
            fiq_2.gCw().d(fik_2.gBZ().l("error.censoredSentence", new Object[0]).abQ(1).vG(ccp_2.mRF.byf()));
            cfl_1.setCurrentNote(null);
            cfl_1.eKs();
            return;
        }
        mUB.jr(string);
        bRq.ekK().ekM();
        bif_2.dYO().dYi().c(mUB);
        cfl_1.setCurrentNote(null);
        cfl_1.eKs();
    }

    public static boolean deleteNote(fiq_1 fiq_12) {
        if (mUB == null) {
            return true;
        }
        cfl_1.deleteNote(mUB);
        cfl_1.eKs();
        return true;
    }

    private static void eKs() {
        if (mUO != null) {
            mUO.pr(false);
            mUO = null;
        }
        cwh_1.eVi().kA(false);
        cwh_1.eVi().eVk();
    }

    public static boolean cancelNoteModification(fiq_1 fiq_12) {
        cfl_1.eKs();
        return true;
    }

    public static void deleteNote(bRp bRp2) {
        bif_2.dYO().dYi().b(bRp2);
        cfl_1.setCurrentNote(null);
        gxk = 0;
    }

    public static void deleteWorldPositionMarker(fiq_1 fiq_12) {
        if (mVG != null) {
            bif_2.dYO().x(2, cfl_1.mVG.mVN);
            cfl_1.setCurrentWorldPositionMarker(null);
        }
    }

    public static void setDisplayTerritories(flv_2 flv_22) {
        cfl_1.setDisplayTerritories(flv_22.bqr());
    }

    public static void setDisplayTerritories(boolean bl) {
        ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_1.ljx, bl);
        bif_2.dYO().setDisplayTerritories(bl);
    }

    public static void openNoteContainer(fiq_1 fiq_12, faw_2 faw_22) {
        faw_22.setVisible(true);
        cfl_1.reset();
    }

    private static void a(int n, int n2, bRp bRp2) {
        bRp2.setX(n);
        bRp2.setY(n2);
        bif_2.dYO().dYi().a(bRp2);
        mUB = null;
        gxk = 0;
    }

    public static void onMapDrag(flu_1 flu_12) {
        fsn_1 fsn_12 = (fsn_1)flu_12.getValue();
        if (fsn_12.getValue() instanceof bRp) {
            mUB = (bRp)fsn_12.getValue();
            bif_2.dYO().dYi().a(mUB, true);
            gxk = 3;
        } else {
            gxk = 4;
            bif_2.dYO().dYQ();
        }
    }

    public static void onLandMarkMousePress(fiq_1 fiq_12) {
        if (mUH) {
            mUF = true;
            cfl_1.eKf();
        }
    }

    public static void onLandMarkMouseRelease(fiq_1 fiq_12) {
        mUF = false;
        cfl_1.eKf();
    }

    public static void onLandMarkDrag(flu_1 flu_12) {
        mUP = (bRk)flu_12.getValue();
        gxk = 1;
        cfl_1.eKf();
    }

    public static void onLandMarkDropOut(fiq_1 fiq_12) {
        gxk = 0;
        mUF = false;
        cfl_1.eKf();
    }

    public static void onLandMarkItemOver(flg_2 flg_22) {
        Object object = flg_22.getItemValue();
        if (object != null) {
            mUH = true;
            cfl_1.eKf();
        }
    }

    public static void onLandMarkItemOut(flg_2 flg_22) {
        mUH = false;
        cfl_1.eKf();
    }

    public static void onDropOut(flc_2 flc_22) {
        fsn_1 fsn_12 = (fsn_1)flc_22.getValue();
        if (fsn_12.getValue() instanceof bRp) {
            cfl_1.deleteNote((bRp)fsn_12.getValue());
        }
        gxk = 0;
        mUF = false;
        cfl_1.eKf();
    }

    public static void onDrop(fla_2 fla_22) {
        fbb_2 fbb_22 = (fbb_2)fla_22.gDI();
        acc_1 acc_12 = fbb_22.getIsoMousePosition();
        switch (gxk) {
            case 1: {
                bRp bRp2 = bif_2.dYO().dYi().aa(acc_12.bWx(), acc_12.bWy(), mUP.aVt());
                cfl_1.setCurrentNote(bRp2);
                cfl_1.eKq();
                break;
            }
            case 3: {
                cfl_1.a(acc_12.bWx(), acc_12.bWy(), mUB);
                break;
            }
            case 2: {
                bif_2.dYO().a(acc_12.bWx(), acc_12.bWy(), 0.0f, bif_2.dYO().dYd(), null, false);
                break;
            }
            case 4: {
                bif_2.dYO().a(acc_12.bWx(), acc_12.bWy(), 0.0f, bif_2.dYO().dYd(), null, false);
            }
        }
        cAY.eHc().nP(600119L);
        gxk = 0;
    }

    public static boolean mapDropValidate(fbd_1 fbd_12, Object object, fbd_1 fbd_13, Object object2, Object object3) {
        return cfl_1.eKr();
    }

    public static void reset() {
        gxk = 0;
        fib_2.gBU().eKH();
        if (mUO != null) {
            mUO.pr(false);
        }
        mUE = null;
        mUD = null;
        mUG = false;
        mUF = false;
        mUH = false;
        fhn_1.gzT().bYz();
    }

    static {
        gxk = 0;
        bgK = 0L;
        mUP = null;
    }
}

