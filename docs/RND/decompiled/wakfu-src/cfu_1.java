/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cFu
 */
@fyf_0
public class cfu_1 {
    protected static final Logger mWb = Logger.getLogger(cfu_1.class);
    public static final String PACKAGE = "wakfu.mixDebugger";

    public static void pause(flv_2 flv_22) {
        if (flv_22.bqr()) {
            cwz_2.eVW().bVm();
        } else {
            cwz_2.eVW().ccE();
        }
    }

    public static void chooseSaveDirectory(fiq_1 fiq_12) {
        cwz_2.eVW().eVX();
    }

    public static void save(fiq_1 fiq_12) {
        cwz_2.eVW().eVY();
    }

    public static void setRefreshOn(fiq_1 fiq_12) {
        cwz_2.eVW().eVZ().kG(true);
    }

    public static void setRefreshOff(fiq_1 fiq_12) {
        cwz_2.eVW().eVZ().kG(false);
    }

    public static void forceRefresh(fiq_1 fiq_12) {
        cwz_2.eVW().kC(true);
    }

    public static void selectSoundGroup(fiq_1 fiq_12, cwi_2 cwi_22) {
        fdd_2 fdd_22 = (fdd_2)fiq_12.gBD();
        cwi_22.setVisible(fdd_22.getSelected());
    }

    public static void selectLogSoundGroup(fiq_1 fiq_12, cwi_2 cwi_22) {
        fdd_2 fdd_22 = (fdd_2)fiq_12.gBD();
        cwi_22.kH(fdd_22.getSelected());
    }
}

