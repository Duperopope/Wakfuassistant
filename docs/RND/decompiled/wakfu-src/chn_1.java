/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cHn
 */
@fyf_0
public class chn_1 {
    protected static final Logger mZE = Logger.getLogger(chn_1.class);
    public static final String PACKAGE = "wakfu.timeline";

    public static void displayNextFighterInTimeline(fiq_1 fiq_12, fbz_2 fbz_22) {
        fbz_22.setOffset(fbz_22.getOffset() + 1.0f);
    }

    public static void displayPreviousFighterInTimeline(fiq_1 fiq_12, fbz_2 fbz_22) {
        fbz_22.setOffset(fbz_22.getOffset() - 1.0f);
    }

    public static void openCloseSecondTimeline(fiq_1 fiq_12) {
        dae_0.cV((short)16526);
    }

    public static void openCloseStateBar(fiq_1 fiq_12) {
        dae_0.cV((short)19374);
    }

    public static void selectFighterInTimeline(flp_2 flp_22, bgy bgy2) {
        if (flp_22.gBy() == fzq_0.tJS) {
            if (flp_22.gEk()) {
                if (bsd_1.emW() == bsd_1.lhD) {
                    akj_0.ciY().ig(bgy2.Sn());
                }
                if (aue_0.cVJ().c(cuh_2.eSM())) {
                    bgt_0 bgt_02 = aue_0.cVJ().cVK();
                    if (bgy2.dkQ()) {
                        cuh_2.eSM().cd(bgy2);
                        cuh_2.eSM().eSO();
                    }
                    return;
                }
                if (!aue_0.cVJ().c(cul_2.eST())) {
                    return;
                }
                crs_2 crs_22 = cul_2.eST().eSV();
                if (!aue_0.cVJ().c(crs_22)) {
                    return;
                }
                if (bgy2.dlB()) {
                    acd_1 acd_12 = chn_1.bT(bgy2);
                    cub_1.eSi().an(acd_12 != null ? acd_12 : bgy2.aZw());
                    crs_22.eNi();
                }
            } else if (flp_22.gEm()) {
                cya_1.eYj().cn(bgy2);
            }
        }
    }

    private static acd_1 bT(bgy bgy2) {
        bgy bgy3;
        int n = bgy2.bcO();
        acd_1 acd_12 = null;
        if (n > 0 && (bgy3 = cul_2.eST().eSH()) != null && bgy3.dkQ()) {
            acd_1 acd_13 = bgy3.aZw();
            for (int i = -n; i < n + 1; ++i) {
                for (int j = -n; j < n + 1; ++j) {
                    acd_1 acd_14 = new acd_1(bgy2.bcC() + i, bgy2.bcD() + j);
                    if (acd_12 != null && acd_12.A(acd_13) < acd_14.A(acd_13)) continue;
                    acd_12 = acd_14;
                }
            }
        }
        return acd_12;
    }

    public static void highlightFighterInTimeline(fiq_1 fiq_12, bgy bgy2) {
        if (bgy2 != null && bgy2.djV() != null) {
            cya_1.eYj().dGQ().bA(bgy2);
            if (bsd_1.emW() == bsd_1.lhC) {
                akj_0.ciY().ig(bgy2.Sn());
            }
            fse_1.gFu().f("fight.describedFighter", bgy2);
            if (aue_0.cVJ().c(cub_1.eSi())) {
                acd_1 acd_12 = chn_1.bT(bgy2);
                cub_1.eSi().kn(true);
                bgy2.dkZ().dGQ().i(bgy2, true);
                if (bgy2.dlB()) {
                    cub_1.eSi().an(acd_12 != null ? acd_12 : bgy2.aZw());
                }
            } else if (aue_0.cVJ().c(cui_2.nNq)) {
                bgy2.dkZ().dGQ().i(bgy2, true);
            }
        }
    }

    public static void unhighlightFighterInTimeline(fiq_1 fiq_12, bgy bgy2) {
        if (bgy2 != null && bgy2.djV() != null) {
            cya_1.eYj().dGQ().dIF();
            fse_1.gFu().f("fight.describedFighter", (Object)null);
            bgy2.dkZ().dGQ().i(bgy2, false);
            cub_1.eSi().kn(false);
        }
    }

    public static void unhighlightTimeline(fiq_1 fiq_12) {
        if (!cub_1.eSi().eSt()) {
            return;
        }
        cya_1.eYj().dGQ().dIF();
        fse_1.gFu().f("fight.describedFighter", (Object)null);
        cya_1.eYj().dGQ().dIH();
        cub_1.eSi().kn(false);
    }

    public static void onFighterClick(flg_2 flg_22) {
        cya_1.eYj().cn((bgy)flg_22.getItemValue());
    }
}

