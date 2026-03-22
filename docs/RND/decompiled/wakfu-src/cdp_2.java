/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cDp
 */
@fyf_0
public class cdp_2 {
    public static final String PACKAGE = "wakfu.artisansBook";

    public static void findArtisan(flp_2 flp_22, bmv_1 bmv_12) {
        das_0 das_02 = new das_0(bmv_12);
        aaw_1.bUq().h(das_02);
    }

    public static void nextPageArtisans(flp_2 flp_22) {
        das_0 das_02 = new das_0(dat_0.ocZ);
        aaw_1.bUq().h(das_02);
    }

    public static void previousPageArtisans(flp_2 flp_22) {
        das_0 das_02 = new das_0(dat_0.oda);
        aaw_1.bUq().h(das_02);
    }

    public static void switchCraft(flk_2 flk_22) {
        if (!flk_22.bqr()) {
            return;
        }
        bms_1 bms_12 = (bms_1)flk_22.getValue();
        dae_0 dae_02 = new dae_0();
        dae_02.lK(17126);
        dae_02.sY(bms_12.dwk());
        aaw_1.bUq().h(dae_02);
    }

    public static void checkOkFilter(flp_2 flp_22) {
        daq_0 daq_02 = new daq_0(dar_0.ocT);
        aaw_1.bUq().h(daq_02);
    }

    public static void setMinLevelFilter(fli_2 fli_22, fdu_1 fdu_12) {
        daq_0 daq_02 = new daq_0(dar_0.ocU);
        daq_02.ke(fdu_12.getText());
        aaw_1.bUq().h(daq_02);
    }

    public static void setMaxLevelFilter(fli_2 fli_22, fdu_1 fdu_12) {
        daq_0 daq_02 = new daq_0(dar_0.ocV);
        daq_02.ke(fdu_12.getText());
        aaw_1.bUq().h(daq_02);
    }

    public static void validNameFilter(fli_2 fli_22, fdu_1 fdu_12) {
        daq_0 daq_02 = new daq_0(dar_0.ocS);
        daq_02.ke(fdu_12.getText());
        aaw_1.bUq().h(daq_02);
    }

    public static void contactArtisan(flp_2 flp_22, bna_2 bna_22) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(19776);
        dae_02.fa(String.valueOf(bna_22.dxO()));
        aaw_1.bUq().h(dae_02);
    }

    public static void nextPage(flp_2 flp_22) {
        dao_0 dao_02 = new dao_0(dap_0.ocM);
        aaw_1.bUq().h(dao_02);
    }

    public static void previousPage(flp_2 flp_22) {
        dao_0 dao_02 = new dao_0(dap_0.ocN);
        aaw_1.bUq().h(dao_02);
    }
}

