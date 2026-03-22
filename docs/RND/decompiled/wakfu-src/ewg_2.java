/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from eWg
 */
public final class ewg_2 {
    public static List<ewh_2> a(anp_2 anp_22, exP exP2) {
        if (anp_22 == null) {
            return Collections.emptyList();
        }
        ewi_2 ewi_22 = new ewi_2();
        Collection collection = exP2.dlK().aJ(exP2);
        ewh_2 ewh_22 = ewi_22.a(exP2, collection, exP2.aZw());
        ArrayList<ewh_2> arrayList = new ArrayList<ewh_2>();
        arrayList.add(ewh_22);
        ewg_2.a(collection, ewh_22);
        int n = anp_22.bDU();
        acd_1 acd_12 = new acd_1();
        for (int i = 0; i < n - 1; ++i) {
            acd_12.u(anp_22.tj(i));
            ewh_2 ewh_23 = ewi_22.a(exP2, collection, acd_12);
            arrayList.add(ewh_23);
            ewg_2.a(collection, ewh_23);
        }
        return arrayList;
    }

    private static void a(Collection<? extends exP> collection, ewh_2 ewh_22) {
        for (exP exP2 : ewh_22.fNM()) {
            if (exP2.bcO() <= 0) continue;
            collection.remove(exP2);
        }
    }
}

