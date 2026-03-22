/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Comparator;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from chd
 */
public class chd_0
implements aaq_2<clR> {
    @Override
    public boolean a(clR clR2) {
        fiu_1.uCW.N("marketSellViewLock", true);
        if (clR2.evK().aHz()) {
            bNG.a(byh_1.lAz, clR2.evL(), new Object[0]);
            return false;
        }
        bhz_2.dWn().dWt();
        if (cwl_1.eVz()) {
            ffV ffV2 = chd_0.evb();
            bhz_2.dWn().bh(ffV2);
        } else {
            bhz_2.dWn().bh(null);
        }
        return false;
    }

    @Nullable
    private static ffV evb() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return null;
        }
        bhs_1 bhs_12 = bhz_2.dWn().dWI();
        if (bhs_12.getItem() == null) {
            return null;
        }
        ArrayList<ffV> arrayList = bgt_02.dno().UM(bhs_12.getItem().avr());
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        arrayList.sort(Comparator.comparingInt(ffV::bfd).reversed());
        return arrayList.get(0);
    }

    @Override
    public int bkq() {
        return 12371;
    }
}

