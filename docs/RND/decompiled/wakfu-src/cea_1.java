/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cEA
 */
@fyf_0
public class cea_1 {
    public static final String PACKAGE = "wakfu.equipableDummy";
    private static long mSK = -1L;

    public static void equipItem(ffV ffV2) {
        dbl_0 dbl_02 = new dbl_0();
        dbl_02.setItem(ffV2);
        dbl_02.lK(18135);
        aaw_1.bUq().h(dbl_02);
    }

    public static void unequipItem(int n) {
        dbl_0 dbl_02 = new dbl_0();
        dbl_02.sY(n);
        dbl_02.lK(19025);
        aaw_1.bUq().h(dbl_02);
    }

    public static void unequip(flg_2 flg_22) {
        ffV ffV2 = (ffV)flg_22.getItemValue();
        cea_1.unequipItem(ffV2.avr());
    }

    public static void dropItem(fla_2 fla_22) {
        if (!(fla_22.getValue() instanceof ffV)) {
            return;
        }
        ffV ffV2 = (ffV)fla_22.getValue();
        if (aue_0.cVJ().cVK().dno().x(ffV2) == null) {
            return;
        }
        cfe_1.onDropItem();
        cea_1.equipItem(ffV2);
    }

    public static void dragItem(flu_1 flu_12) {
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

