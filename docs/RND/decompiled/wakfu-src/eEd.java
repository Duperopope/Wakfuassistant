/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class eEd
extends eAH {
    private static final ArrayList<amz_1[]> pBp = new ArrayList();
    private boolean pBq;

    public eEd(ArrayList<amx_1> arrayList) {
        if (arrayList.size() >= 1) {
            this.pBq = ((amz_2)arrayList.get(0)).b(null, null, null, null);
        }
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pBp;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.b(false, object, object2, object4, object3);
        if (eyo_02 == null) {
            return -1;
        }
        etu_0 etu_02 = eAs.aO(object4);
        if (etu_02 == null) {
            return -1;
        }
        acd_1 acd_12 = eAs.d(true, object, object2, object4, object3);
        acd_1 acd_13 = eAs.d(false, object, object2, object4, object3);
        if (acd_12 == null || acd_13 == null) {
            return -1;
        }
        abi_1 abi_12 = acd_13.y(acd_12);
        Collection collection = etu_02.fn(eyo_02.bcP());
        for (Object f2 : collection) {
            acd_1[] acd_1Array;
            exP exP2 = (exP)f2;
            for (acd_1 acd_14 : acd_1Array = eAs.aN(exP2)) {
                if (this.pBq && abi_12 != null && abi_12 != acd_13.y(acd_14) || !eUo.a(eyo_02, etu_02.bag(), acd_14.getX(), acd_14.getY(), acd_14.bdi(), exP2)) continue;
                return 0;
            }
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pKU;
    }

    static {
        pBp.add(amz_1.cJI);
        pBp.add(new amz_1[]{amz_1.cJz});
    }
}

