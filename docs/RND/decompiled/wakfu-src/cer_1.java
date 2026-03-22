/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cER
 */
@fyf_0
public class cer_1 {
    private static final Logger mVl = Logger.getLogger(cer_1.class);
    public static final String PACKAGE = "wakfu.guidePopup";

    public static void nextPage(flp_2 flp_22, bor_2 bor_22) {
        dae_0 dae_02 = new dae_0(16919);
        dae_02.D(bor_22);
        aaw_1.bUq().h(dae_02);
    }

    public static void previousPage(flp_2 flp_22, bor_2 bor_22) {
        dae_0 dae_02 = new dae_0(16508);
        dae_02.D(bor_22);
        aaw_1.bUq().h(dae_02);
    }

    public static void setLeftArrowVisible(flp_2 flp_22, bor_2 bor_22, faw_2 faw_22) {
        if (bor_22 == null || !bor_22.ecL()) {
            return;
        }
        faw_22.setVisible(true);
    }

    public static void setLeftArrowInvisible(flp_2 flp_22, bor_2 bor_22, faw_2 faw_22) {
        faw_22.setVisible(false);
    }

    public static void setRightArrowVisible(flp_2 flp_22, bor_2 bor_22, faw_2 faw_22) {
        if (bor_22 == null || !bor_22.ecM()) {
            return;
        }
        faw_22.setVisible(true);
    }

    public static void setRightArrowInvisible(flp_2 flp_22, bor_2 bor_22, faw_2 faw_22) {
        faw_22.setVisible(false);
    }

    public static void close(flp_2 flp_22) {
        aaw_1.bUq().h(new dae_0(17027));
    }
}

