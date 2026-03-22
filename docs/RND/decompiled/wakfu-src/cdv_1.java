/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cDv
 */
@fyf_0
public class cdv_1 {
    public static final String PACKAGE = "wakfu.bookcase";
    private static long mSK = -1L;

    public static void swapPosition(byte by, byte by2) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(18106);
        dae_02.ay(by);
        dae_02.az(by2);
        aaw_1.bUq().h(dae_02);
    }

    public static void displayBook(flg_2 flg_22) {
        ffV ffV2 = (ffV)flg_22.getItemValue();
        dbl_0 dbl_02 = new dbl_0();
        dbl_02.setItem(ffV2);
        dbl_02.lK(19777);
        aaw_1.bUq().h(dbl_02);
    }

    public static void addBook(ffV ffV2, short s) {
        dbl_0 dbl_02 = new dbl_0();
        dbl_02.setItem(ffV2);
        dbl_02.az(s);
        dbl_02.lK(18133);
        aaw_1.bUq().h(dbl_02);
    }

    public static void removeBook(short s) {
        dbl_0 dbl_02 = new dbl_0();
        dbl_02.az(s);
        dbl_02.lK(19462);
        aaw_1.bUq().h(dbl_02);
    }

    public static void removeBook(flg_2 flg_22) {
        fcv_1 fcv_12 = (fcv_1)flg_22.gBE();
        short s = (short)fcv_12.getCollection().getTableIndex(fcv_12);
        cdv_1.removeBook(s);
    }

    public static void dropItem(fla_2 fla_22, bfj_2 bfj_22) {
        if (!(fla_22.getValue() instanceof ffV)) {
            return;
        }
        ffV ffV2 = (ffV)fla_22.getValue();
        if (aue_0.cVJ().cVK().dno().x(ffV2) != null) {
            cfe_1.onDropItem();
            fcv_1 fcv_12 = fla_22.gDI().getRenderableParent();
            short s = (short)fcv_12.getCollection().getTableIndex(fcv_12);
            cdv_1.addBook(ffV2, s);
        } else if (bfj_22.dfO().dNO().bt(ffV2)) {
            fcv_1 fcv_13 = fla_22.gDI().getRenderableParent();
            byte by = (byte)fcv_13.getCollection().getTableIndex(fcv_13);
            fcv_1 fcv_14 = fla_22.gDH().getRenderableParent();
            byte by2 = (byte)fcv_14.getCollection().getTableIndex(fcv_14);
            cdv_1.swapPosition(by, by2);
        }
    }

    public static void dragItem(flu_1 flu_12, bfj_2 bfj_22) {
        ffV ffV2 = (ffV)flu_12.getValue();
        mSK = ffV2.LV();
    }

    public static long getDraggedItemId() {
        return mSK;
    }

    public static void setDraggedItemId(long l) {
        mSK = l;
    }
}

