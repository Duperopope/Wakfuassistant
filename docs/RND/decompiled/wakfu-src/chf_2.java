/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cHf
 */
@fyf_0
public class chf_2 {
    public static final String PACKAGE = "wakfu.stasisDungeon";

    public static void enterDungeon(flp_2 flp_22) {
        dae_0 dae_02 = new dae_0(19008);
        aaw_1.bUq().h(dae_02);
    }

    public static void validateDifficulty(flp_2 flp_22) {
        dae_0 dae_02 = new dae_0(17962);
        aaw_1.bUq().h(dae_02);
    }

    public static void teleportGroup(flp_2 flp_22) {
        dae_0 dae_02 = new dae_0(16257);
        aaw_1.bUq().h(dae_02);
    }

    public static void changeDifficultyLevel(flk_2 flk_22) {
        if (flk_22.bqr()) {
            dae_0 dae_02 = new dae_0(18721);
            dae_02.D(flk_22.getValue());
            aaw_1.bUq().h(dae_02);
        }
    }

    public static void toggleAutoDownscale(flv_2 flv_22) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(16115);
        dae_02.cC(flv_22.bqr());
        aaw_1.bUq().h(dae_02);
    }

    public static void changeStasis(flw_2 flw_22) {
        int n = Math.round(flw_22.getValue());
        dae_0 dae_02 = new dae_0(18721);
        dae_02.sY(n);
        aaw_1.bUq().h(dae_02);
    }
}

