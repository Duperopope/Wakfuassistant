/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cGU
 */
@fyf_0
public class cgu_2 {
    public static final String PACKAGE = "wakfu.roomAdministration";

    public static void changeGuildPerms(fiq_1 fiq_12, bny_2 bny_22) {
        dau_0 dau_02 = new dau_0();
        dau_02.lK(16194);
        dau_02.sY(bny_22.aHp());
        dau_02.cC(!bny_22.a(fnG.sKm));
        dau_02.a(bny_22);
        aaw_1.bUq().h(dau_02);
    }

    public static void changeAnonymousPerms(fiq_1 fiq_12, bny_2 bny_22) {
        dau_0 dau_02 = new dau_0();
        dau_02.lK(19237);
        dau_02.sY(bny_22.aHp());
        dau_02.cC(!bny_22.a(fnG.sKl));
        dau_02.a(bny_22);
        aaw_1.bUq().h(dau_02);
    }

    public static void addPermission(fiq_1 fiq_12, fdu_1 fdu_12) {
        if (fiq_12.gBy() == fzq_0.tJU || fiq_12.gBy() == fzq_0.tJF && ((fli_2)fiq_12).bCC() == 10) {
            dae_0 dae_02 = new dae_0();
            dae_02.lK(18498);
            dae_02.fa(fdu_12.getText());
            aaw_1.bUq().h(dae_02);
            fdu_12.setText("");
        }
    }

    public static void removePermission(fiq_1 fiq_12, Long l) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(16876);
        dae_02.gj(l);
        aaw_1.bUq().h(dae_02);
    }

    public static void changeIndividualPerms(flv_2 flv_22, Long l, bny_2 bny_22) {
        dau_0 dau_02 = new dau_0();
        dau_02.lK(18666);
        dau_02.sY(bny_22.aHp());
        dau_02.gj(l);
        dau_02.cC(flv_22.bqr());
        dau_02.a(bny_22);
        aaw_1.bUq().h(dau_02);
    }
}

