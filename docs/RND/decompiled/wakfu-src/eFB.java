/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class eFB
extends eAH {
    private static final ArrayList<amz_1[]> pDm = new ArrayList();
    private boolean pDn;
    private int bap;
    private int baq;

    public eFB(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pDn = ((anh_2)arrayList.get(0)).getValue().equalsIgnoreCase("target");
        this.bap = (int)((amu_1)arrayList.get(1)).d(null, null, null, null);
        this.baq = (int)((amu_1)arrayList.get(2)).d(null, null, null, null);
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pDm;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        acd_1 acd_12 = eAs.d(this.pDn, object, object2, object4, object3);
        if (acd_12 == null) {
            return -1;
        }
        acd_1 acd_13 = eAs.d(!this.pDn, object, object2, object4, object3);
        if (acd_13 == null) {
            return -1;
        }
        etu_0 etu_02 = eAs.aO(object4);
        if (etu_02 == null) {
            return -1;
        }
        abi_1 abi_12 = acd_12.y(acd_13);
        if (abi_12 == null) {
            return -1;
        }
        int n = abi_12.dzz * this.bap - abi_12.dzA * this.baq;
        int n2 = abi_12.dzA * this.bap + abi_12.dzz * this.baq;
        acd_1 acd_14 = new acd_1(acd_12);
        acd_14.ap(n, n2);
        if (!etu_02.bag().T(acd_14.getX(), acd_14.getY())) {
            return -1;
        }
        Collection<QQ> collection = etu_02.bai().bdh();
        for (QQ qQ : collection) {
            if (!qQ.aZw().ac(acd_14) || !qQ.bcS()) continue;
            return -1;
        }
        rj_0 rj_02 = etu_02.bag().X(acd_14.getX(), acd_14.getY());
        if (rj_02 != null) {
            return -1;
        }
        return 0;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pLc;
    }

    static {
        pDm.add(new amz_1[]{amz_1.cJx, amz_1.cJy, amz_1.cJy});
    }
}

