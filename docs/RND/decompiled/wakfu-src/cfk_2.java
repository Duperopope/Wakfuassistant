/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cFk
 */
@fyf_0
public class cfk_2 {
    public static final String PACKAGE = "wakfu.jukebox";

    public static void pickInstance(flg_2 flg_22) {
        if (!(flg_22.getItemValue() instanceof bhe_2)) {
            return;
        }
        bhe_2 bhe_22 = (bhe_2)flg_22.getItemValue();
        dae_0.b((short)18744, bhe_22);
    }

    public static void pickAmbienceZone(flg_2 flg_22) {
        if (!(flg_22.getItemValue() instanceof bhf_2)) {
            return;
        }
        bhf_2 bhf_22 = (bhf_2)flg_22.getItemValue();
        dae_0.b((short)17693, bhf_22);
    }

    public static void pickMusic(flg_2 flg_22) {
        dae_0.b((short)18473, flg_22.getItemValue());
    }

    public static void dropMusic(fiq_1 fiq_12) {
        dae_0.b((short)18473, -1L);
    }

    public static void randomMusic(fiq_1 fiq_12) {
        dae_0.cV((short)17050);
    }

    public static void onInstanceSearch(fli_2 fli_22) {
        dae_0.b((short)18025, ((fdz_1)fli_22.gBE()).getText());
    }

    public static void overList(fiq_1 fiq_12, fes_2 fes_22) {
        if (fes_22 != null) {
            fes_22.setVisible(true);
        }
    }

    public static void outList(fiq_1 fiq_12, fes_2 fes_22) {
        if (fes_22 != null) {
            fes_22.setVisible(false);
        }
    }
}

