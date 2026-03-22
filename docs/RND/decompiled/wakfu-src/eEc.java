/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class eEc
extends eAH {
    private static final ArrayList<amz_1[]> pBo = new ArrayList();
    private boolean pvJ = false;

    public eEc(ArrayList<amx_1> arrayList) {
        this.pvJ = ((anh_2)arrayList.get(0)).getValue().equalsIgnoreCase("target");
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pBo;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.b(this.pvJ, object, object2, object4, object3);
        if (eyo_02 == null) {
            return -1;
        }
        etu_0 etu_02 = eAs.aO(object4);
        if (etu_02 == null) {
            return -1;
        }
        Collection collection = etu_02.fn(eyo_02.bcP());
        acd_1 acd_12 = eAs.d(true, object, object2, object4, object3);
        if (acd_12 == null) {
            return -1;
        }
        for (Object f2 : collection) {
            exP exP2 = (exP)f2;
            if (!eUo.a(exP2, etu_02.bag(), acd_12.getX(), acd_12.getY(), acd_12.bdi(), eyo_02)) continue;
            return 0;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pKe;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJx};
        pBo.add(amz_1Array);
    }
}

