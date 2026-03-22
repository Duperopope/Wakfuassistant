/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bnu
 */
public class bnu_2
extends fnw {
    public static boolean a(acd_1 acd_12, bzq_2 bzq_22) {
        if (!bzq_22.lEC) {
            return false;
        }
        ajo_0 ajo_02 = (ajo_0)adk.buy().bv(acd_12.getX(), acd_12.getY());
        if (ajo_02 == null) {
            return false;
        }
        if (ajo_02.R(acd_12.getX(), acd_12.getY(), acd_12.bdi())) {
            return false;
        }
        bKV bKV2 = bLe.ecw().dQ(acd_12.getX(), acd_12.getY());
        if (bKV2 != null && bKV2.eco().bcS()) {
            return false;
        }
        boolean bl = ajo_02.chv();
        ArrayList<ni_1> arrayList = bzj_2.eqi().eqk();
        for (int i = arrayList.size() - 1; i >= 0; --i) {
            if (bnu_2.a(acd_12, arrayList.get(i), bl)) continue;
            return false;
        }
        return true;
    }
}

