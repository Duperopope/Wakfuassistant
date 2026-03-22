/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eFd
 */
public class efd_0
extends eAH {
    private final TIntArrayList pCL = new TIntArrayList();
    private ehl_0 pCM = ehl_0.pFq;
    private static final ArrayList<amz_1[]> pCN = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pCN;
    }

    public TIntArrayList foa() {
        return this.pCL;
    }

    public boolean fnF() {
        return this.pCM == ehl_0.pFr;
    }

    public efd_0(ArrayList<amx_1> arrayList) {
        int n;
        String string;
        ehl_0 ehl_02;
        byte by = this.r(arrayList);
        if (by == 0 && (ehl_02 = ehl_0.rV(string = ((anh_2)arrayList.get(0)).getValue())) != ehl_0.pFp) {
            this.pCM = ehl_02;
        }
        int n2 = n = by == 0 ? 1 : 0;
        while (n < arrayList.size()) {
            int n3 = (int)((amu_1)arrayList.get(n)).d(null, null, null, null);
            this.pCL.add(n3);
            ++n;
        }
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        exP exP2 = eAs.a(this.pCM, object, object2, object4, object3);
        if (exP2 == null) {
            return -1;
        }
        eyp eyp2 = exP2.doV();
        if (eyp2 instanceof eyi && this.pCL.contains(eyp2.cqy())) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pGP;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJx, amz_1.cJA};
        pCN.add(amz_1Array);
        amz_1Array = new amz_1[]{amz_1.cJA};
        pCN.add(amz_1Array);
    }
}

