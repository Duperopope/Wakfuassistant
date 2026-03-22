/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class eFE
extends eAH {
    private static final ArrayList<amz_1[]> pDq = new ArrayList();
    private amu_1 pxw;

    @Deprecated
    public eFE() {
    }

    public eFE(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pxw = (amu_1)arrayList.get(0);
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pDq;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pMp;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        exP exP2 = eAs.k(object, object2, object3, object4);
        if (exP2 == null || !(exP2 instanceof fjm)) {
            throw new amf_2("Impossible de r\u00e9cup\u00e9rer la cible du crit\u00e8re");
        }
        return exP2.ffF().WB((int)this.pxw.d(object, object2, object3, object4)) ? 0 : -1;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJy};
        pDq.add(amz_1Array);
    }
}

