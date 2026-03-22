/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cHq
 */
@fyf_0
public class chq_1 {
    public static final String PACKAGE = "wakfu.video";

    public static void play(fiq_1 fiq_12, fed_1 fed_12, fad_1 fad_12) {
        if (!fed_12.isInitialized() || fed_12.isPaused()) {
            fad_12.setText(aum_0.cWf().c("dialog.video.pause", new Object[0]));
            fed_12.ccA();
            fed_12.setPaused(false);
        } else {
            fad_12.setText(aum_0.cWf().c("dialog.video.play", new Object[0]));
            fed_12.setPaused(true);
        }
    }

    public static void updateSlider(flz_2 flz_22, fed_1 fed_12, fcz_2 fcz_22) {
        float f2 = fed_12.getVideoDuration();
        float f3 = ((Long)flz_22.getValue()).longValue();
        fcz_22.setValue(f3 / f2);
    }

    public static void seek(flp_2 flp_22, fed_1 fed_12, fcz_2 fcz_22) {
        fed_12.setPaused(true);
        if (flp_22.fca() != 0) {
            float f2 = fcz_22.getValue();
            fed_12.fB(f2);
            flz_2 flz_22 = new flz_2(fcz_22);
            flz_22.setValue((long)(f2 * (float)fed_12.getVideoDuration()));
            chq_1.updateSlider(flz_22, fed_12, fcz_22);
            fed_12.ccA();
            fed_12.setPaused(false);
        }
    }
}

