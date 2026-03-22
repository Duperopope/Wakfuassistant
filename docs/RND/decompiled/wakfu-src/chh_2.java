/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cHh
 */
@fyf_0
public class chh_2 {
    public static final String PACKAGE = "wakfu.stele";

    public static void changeDifficulty(flk_2 flk_22) {
        Object object = flk_22.getValue();
        if (!(object instanceof bnf_2)) {
            return;
        }
        dce_0 dce_02 = new dce_0((bnf_2)object, flk_22.bqr());
        aaw_1.bUq().h(dce_02);
    }

    public static void displayDifficultyState(flp_2 flp_22, bnf_2 bnf_22, fes_2 fes_22) {
        if (!flp_22.gEm()) {
            return;
        }
        dbo dbo2 = new dbo();
        dbo2.b(bnf_22.eft());
        dbo2.fa(fes_22.getElementMap().getId());
        aaw_1.bUq().h(dbo2);
    }

    public static void toggleReward(flp_2 flp_22, bnh_2 bnh_22) {
        if (!bnh_22.efx()) {
            return;
        }
        if (!flp_22.gEk()) {
            return;
        }
        dcf_0 dcf_02 = new dcf_0(bnh_22);
        aaw_1.bUq().h(dcf_02);
    }

    public static void activate(fiq_1 fiq_12) {
        dae_0 dae_02 = new dae_0(18626);
        aaw_1.bUq().h(dae_02);
    }

    public static void openItemDetailWindow(flg_2 flg_22, fey_2 fey_22) {
        Object object = flg_22.getItemValue();
        if (!(object instanceof bnh_2)) {
            return;
        }
        bnh_2 bnh_22 = (bnh_2)object;
        ffV ffV2 = bnh_22.getItem();
        cfe_1.openItemDetailWindow((flp_2)flg_22, fey_22, ffV2);
    }
}

