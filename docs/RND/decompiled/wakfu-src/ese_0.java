/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from eSE
 */
public final class ese_0 {
    private static final Logger rkY = Logger.getLogger(ese_0.class);

    public List<qu_0> a(enk_0 enk_02, anu_1 anu_12, qm_0<enk_0> qm_02, int n, int n2, short s) {
        if (qm_02 == null) {
            rkY.error((Object)"On ne peut pas determiner les cibles sans contexte");
            return Collections.emptyList();
        }
        HashMap<Long, qu_0> hashMap = new HashMap<Long, qu_0>();
        ArrayList<qu_0> arrayList = new ArrayList<qu_0>();
        for (aoh_1 aoh_12 : enk_02.aZS().bEp()) {
            Iterable<qu_0> iterable = anv_1.bEg().a(anu_12, qm_02.bae(), aoh_12, n, n2, s, enk_02.aZI());
            for (qu_0 qu_02 : iterable) {
                if (!this.a(enk_02, qu_02, anu_12) || this.a(hashMap, qu_02)) continue;
                hashMap.put(qu_02.Sn(), qu_02);
                arrayList.add(qu_02);
            }
        }
        this.a(arrayList, enk_02, n, n2);
        byte by = enk_02.fAl();
        return this.a(arrayList, by);
    }

    private void a(List<qu_0> list, enk_0 enk_02, int n, int n2) {
        Comparator<qu_0> comparator = esh_0.a(enk_02, n, n2);
        if (comparator == null) {
            return;
        }
        list.sort(comparator);
    }

    private boolean a(HashMap<Long, qu_0> hashMap, qu_0 qu_02) {
        return hashMap.containsKey(qu_02.Sn());
    }

    private boolean a(enk_0 enk_02, qu_0 qu_02, anu_1 anu_12) {
        boolean bl;
        if (!(qu_02 instanceof eza_0)) {
            return true;
        }
        eza_0 eza_02 = (eza_0)((Object)qu_02);
        if (anu_12 == qu_02) {
            return true;
        }
        anx_1<qu_0> anx_12 = enk_02.aZI();
        boolean bl2 = bl = anx_12 != null && anx_12.gs(8192L);
        if (bl) {
            return true;
        }
        return !eza_02.buW();
    }

    private List<qu_0> a(List<qu_0> list, byte by) {
        if (by <= 0) {
            return list;
        }
        if (list.size() > by) {
            return list.subList(0, by);
        }
        return list;
    }
}

