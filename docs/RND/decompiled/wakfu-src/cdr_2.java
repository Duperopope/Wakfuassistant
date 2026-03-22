/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cDR
 */
@fyf_0
public class cdr_2 {
    public static final String PACKAGE = "wakfu.chooseItemElements";

    public static void toggleElement(fiq_1 fiq_12, bfb_2 bfb_22, fdd_2 fdd_22) {
        if (bfb_22.isEnabled()) {
            bfb_22.setSelected(!fdd_22.getSelected());
        }
    }

    public static void toggleOpenOnIdentification(flv_2 flv_22) {
        ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_1.lkA, flv_22.bqr());
    }

    public static void validateElements(fiq_1 fiq_12, bdk_0 bdk_02) {
        dae_0 dae_02 = new dae_0(18278);
        dae_02.D(bdk_02);
        aaw_1.bUq().h(dae_02);
    }
}

