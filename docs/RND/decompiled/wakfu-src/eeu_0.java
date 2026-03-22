/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eEU
 */
public class eeu_0
extends eAH {
    private static final ArrayList<amz_1[]> pCB = new ArrayList();
    private final uw_0 pCC = new uw_0(0, 0, 0, 0, 0, 0);

    @Override
    protected List<amz_1[]> bDC() {
        return pCB;
    }

    public eeu_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        int n = (int)((amu_1)arrayList.get(0)).d(null, null, null, null);
        int n2 = (int)((amu_1)arrayList.get(1)).d(null, null, null, null);
        int n3 = (int)((amu_1)arrayList.get(2)).d(null, null, null, null);
        int n4 = (int)((amu_1)arrayList.get(3)).d(null, null, null, null);
        int n5 = (int)((amu_1)arrayList.get(4)).d(null, null, null, null);
        int n6 = (int)((amu_1)arrayList.get(5)).d(null, null, null, null);
        this.pCC.a(n6, n5, n4, n, n2, n3);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (ue_0.bjV().bjo() && ue_0.bjV().bjc().k(this.pCC) >= 0) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pHi;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJy, amz_1.cJy, amz_1.cJy, amz_1.cJy, amz_1.cJy, amz_1.cJy};
        pCB.add(amz_1Array);
    }
}

