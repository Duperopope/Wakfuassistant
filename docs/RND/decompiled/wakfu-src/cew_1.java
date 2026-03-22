/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cEw
 */
@fyf_0
public class cew_1 {
    public static final String PACKAGE = "wakfu.emotesInventory";

    public static void onClick(flg_2 flg_22) {
        if (flg_22.gBy() != fzq_0.tJB || !flg_22.gEk()) {
            return;
        }
        bbi_0 bbi_02 = (bbi_0)flg_22.getItemValue();
        if (!bbi_02.dal()) {
            return;
        }
        if (flg_22.gDR()) {
            dcz dcz2 = new dcz();
            dcz2.aL(flg_22.getItemValue());
            dcz2.NO(-1);
            dcz2.pz(-1);
            dcz2.cC(true);
            dcz2.lK(19934);
            aaw_1.bUq().h(dcz2);
        } else {
            day_0 day_02 = new day_0();
            day_02.a(bbi_02);
            aaw_1.bUq().h(day_02);
        }
    }

    public static void overSmiley(flg_2 flg_22) {
        fse_1.gFu().f("overSmiley", flg_22.getItemValue());
    }
}

