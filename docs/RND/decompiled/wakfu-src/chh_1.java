/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cHH
 */
@fyf_0
public class chh_1 {
    public static final String PACKAGE = "wakfu.zaap";

    public static void onKeyType(fli_2 fli_22) {
        if (fli_22.gBy() == fzq_0.tJH) {
            fdu_1 fdu_12 = (fdu_1)fli_22.gBE();
            String string = fdu_12.getText();
            if (fli_22.gDW() == '\n') {
                dae_0 dae_02 = new dae_0();
                dae_02.lK(17094);
                dae_02.fa(string);
                aaw_1.bUq().h(dae_02);
                return;
            }
            chh_1.pT(string);
        }
    }

    public static void onClear(fiq_1 fiq_12) {
        chh_1.pT("");
    }

    public static void selectZaap(fiq_1 fiq_12, bNO bNO2) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(18468);
        dae_02.gj(bNO2.Sn());
        aaw_1.bUq().h(dae_02);
    }

    public static void toggleFavourite(flp_2 flp_22, bNO bNO2) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(19141);
        dae_02.gj(bNO2.Sn());
        aaw_1.bUq().h(dae_02);
    }

    private static void pT(String string) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(18667);
        dae_02.fa(string);
        aaw_1.bUq().h(dae_02);
    }
}

