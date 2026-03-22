/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cEq
 */
@fyf_0
public class ceq_1 {
    public static final String PACKAGE = "wakfu.dragoMap";
    private static final Logger mUA = Logger.getLogger(ceq_1.class);
    private static bRp mUB = null;
    private static cer_2 mUC = null;
    private static ffl_2 mUD;
    private static fsn_1 mUE;
    private static boolean mUF;
    private static boolean mUG;
    private static boolean mUH;
    private static faa_2 mUI;
    public static final int mUJ = 0;
    public static final int mUK = 1;
    public static final int mUL = 2;
    public static final int mUM = 3;
    public static int gxk;
    private static String mUN;
    private static fsn_1 mUO;
    static long bgK;
    private static bRk mUP;

    public static void click(flp_2 flp_22) {
        cfl_1.click(flp_22);
    }

    public static void mapZoomIn(fiq_1 fiq_12) {
        bif_2.dYO().dXW();
    }

    public static void mapZoomOut(fiq_1 fiq_12) {
        if (bif_2.dYO().dXN() instanceof bic_2) {
            return;
        }
        bif_2.dYO().dXX();
    }

    public static void onMapClick(fll_2 fll_22, fbh_2 fbh_22) {
        if (!(fll_22.gDR() || fll_22.gDQ() || fll_22.gDT() || fll_22.gDU())) {
            switch (gxk) {
                case 1: {
                    if (fll_22.gEk() && mUP != null) {
                        bRp bRp2 = bif_2.dYO().dYi().aa((int)fll_22.gEb(), (int)fll_22.gEc(), mUP.aVt());
                        ceq_1.setCurrentNote(bRp2);
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
                        cer_2 cer_22 = new cer_2();
                        String string = aum_0.cWf().c("map.worldPositionMarker.destination", (int)fll_22.gEb(), (int)fll_22.gEc());
                        bif_2.dYO().a(cer_22.mUQ, 2, fll_22.gEb(), fll_22.gEc(), 0.0f, bif_2.dYO().dYd(), string, (Object)cer_22, bit_2.kgo, aid_0.dUO, false);
                        cAY.eHc().nP(600119L);
                        fib_2.gBU().eKH();
                        fhn_1.gzT().bYz();
                    }
                    gxk = 0;
                    break;
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
        fse_1.gFu().f("landMark.currentNote", bRp2);
        fse_1.gFu().f("landMark.currentNote.text", bRp2 != null ? bRp2.hF() : null);
    }

    public static void setCurrentWorldPositionMarker(cer_2 cer_22) {
        mUC = cer_22;
        fse_1.gFu().f("landMark.currentWorldPositionMarker", cer_22);
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
        ceq_1.eKf();
    }

    public static void onMousePress(fiq_1 fiq_12) {
        if (mUE != null && mUE.gGo()) {
            mUF = true;
            ceq_1.eKf();
        }
    }

    public static void onMouseRelease(fiq_1 fiq_12) {
        mUF = false;
        ceq_1.eKf();
    }

    public static void onMouseExit(fiq_1 fiq_12) {
        mUD = null;
        mUE = null;
        mUG = false;
        ceq_1.eKf();
    }

    public static void onMouseEnter(fiq_1 fiq_12) {
        mUG = true;
        ceq_1.eKf();
    }

    private static void eKf() {
        fhn_1.gzT().bYz();
    }

    public static void onMapItemClick(fln_2 fln_22) {
        ctw_1.eRl().eRm();
        fsn_1 fsn_12 = fln_22.gEi();
        if (!(fsn_12.getValue() instanceof adq)) {
            return;
        }
        adq adq2 = (adq)fsn_12.getValue();
        if (adq2.aXy == 47) {
            dae_0 dae_02 = new dae_0();
            dae_02.lK(18468);
            dae_02.gj(adq2.aXv);
            aaw_1.bUq().h(dae_02);
        }
    }

    public static void onMapItemOver(fln_2 fln_22) {
        ctw_1.eRl().b(fln_22);
        if (bif_2.dYO().dXN() instanceof bic_2) {
            return;
        }
        mUE = fln_22.gEi();
        ceq_1.eKf();
    }

    public static void onMapItemOut(fln_2 fln_22) {
        ctw_1.eRl().eRm();
        mUE = null;
        ceq_1.eKf();
    }

    public static void setDisplayTerritories(flv_2 flv_22) {
        ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_1.ljx, flv_22.bqr());
        bif_2.dYO().setDisplayTerritories(flv_22.bqr());
    }

    public static void openNoteContainer(fiq_1 fiq_12, faw_2 faw_22) {
        faw_22.setVisible(true);
        ceq_1.reset();
    }

    private static void a(int n, int n2, bRp bRp2) {
        bRp2.setX(n);
        bRp2.setY(n2);
        bif_2.dYO().dYi().a(bRp2);
        mUB = null;
        gxk = 0;
    }

    public static void onLandMarkItemOver(flg_2 flg_22) {
        Object object = flg_22.getItemValue();
        if (object != null) {
            mUH = true;
            ceq_1.eKf();
        }
    }

    public static void onLandMarkItemOut(flg_2 flg_22) {
        mUH = false;
        ceq_1.eKf();
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

