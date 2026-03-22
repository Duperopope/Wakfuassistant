/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 */
import gnu.trove.list.array.TLongArrayList;
import java.util.ArrayList;

/*
 * Renamed from amy
 */
public class amy_2
extends amq_2 {
    private amq_2 cIu;
    private amq_2 cIv;

    @Override
    public amz_1 bDv() {
        return amz_1.cJA;
    }

    @Override
    public Enum bDq() {
        return amg_2.cIS;
    }

    @Override
    public TLongArrayList f(Object object, Object object2, Object object3, Object object4) {
        TLongArrayList tLongArrayList = this.cIu.f(object, object2, object3, object4);
        tLongArrayList.add(this.cIv.f(object, object2, object3, object4).toArray());
        return tLongArrayList;
    }

    public amy_2(amx_1 amx_12, amx_1 amx_13) {
        ArrayList<amu_1> arrayList;
        if (amx_12.bDv() == amz_1.cJA) {
            this.cIu = (amq_2)amx_12;
        } else if (amx_12.bDv() == amz_1.cJy) {
            arrayList = new ArrayList<amu_1>();
            arrayList.add((amu_1)amx_12);
            this.cIu = new amc_2(arrayList);
        } else {
            throw new amw_2("On essaie de concatener deux objets qui ne sont pas des listes");
        }
        if (amx_13.bDv() == amz_1.cJA) {
            this.cIv = (amq_2)amx_13;
        } else if (amx_13.bDv() == amz_1.cJy) {
            arrayList = new ArrayList();
            arrayList.add((amu_1)amx_13);
            this.cIv = new amc_2(arrayList);
        } else {
            throw new amw_2("On essaie de concatener deux objets qui ne sont pas des listes");
        }
    }

    @Override
    public int bDw() {
        int n = this.cIu.bDw();
        if (n == Integer.MIN_VALUE) {
            return n;
        }
        int n2 = this.cIv.bDw();
        if (n2 == Integer.MIN_VALUE) {
            return n2;
        }
        return n + n2;
    }
}

