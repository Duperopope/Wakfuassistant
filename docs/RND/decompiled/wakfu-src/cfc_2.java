/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cFC
 */
@fyf_0
public class cfc_2 {
    public static final String PACKAGE = "wakfu.nationPvpLadder";

    public static void first(fiq_1 fiq_12) {
        dae_0.cV((short)19858);
    }

    public static void previous(fiq_1 fiq_12) {
        dae_0.cV((short)19655);
    }

    public static void next(fiq_1 fiq_12) {
        dae_0.cV((short)18612);
    }

    public static void last(fiq_1 fiq_12) {
        dae_0.cV((short)16953);
    }

    public static void selectFilter(flv_2 flv_22, bkw_2 bkw_22) {
        if (flv_22.bqr()) {
            dae_0 dae_02 = new dae_0(16824);
            dae_02.D(bkw_22);
            aaw_1.bUq().h(dae_02);
        }
    }

    public static void selectBreed(flk_2 flk_22) {
        if (flk_22.bqr()) {
            dae_0 dae_02 = new dae_0(17416);
            dae_02.D(flk_22.getValue());
            aaw_1.bUq().h(dae_02);
        }
    }

    public static void selectNation(flk_2 flk_22) {
        if (flk_22.bqr()) {
            dae_0 dae_02 = new dae_0(16104);
            dae_02.D(flk_22.getValue());
            aaw_1.bUq().h(dae_02);
        }
    }

    public static void openPvpLadderEntry(fiq_1 fiq_12, bkt_2 bkt_22) {
        dae_0 dae_02 = new dae_0(16959);
        dae_02.D(bkt_22);
        aaw_1.bUq().h(dae_02);
    }

    public static void search(fli_2 fli_22) {
        if (fli_22.gBy() == fzq_0.tJF && fli_22.bCC() == 10) {
            fdz_1 fdz_12 = (fdz_1)fli_22.gBE();
            cfc_2.a(fdz_12);
        }
    }

    public static void search(fiq_1 fiq_12, fdu_1 fdu_12) {
        cfc_2.a(fdu_12);
    }

    private static void a(fdz_1 fdz_12) {
        String string = fdz_12.getText();
        if (string.isEmpty()) {
            bku_2.koj.ebs();
            return;
        }
        dae_0 dae_02 = new dae_0(19726);
        dae_02.fa(string);
        aaw_1.bUq().h(dae_02);
    }

    public static void resetSearch(fiq_1 fiq_12, fdu_1 fdu_12) {
        dae_0.cV((short)18157);
        fdu_12.guD();
    }
}

