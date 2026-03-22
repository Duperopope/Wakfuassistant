/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eEi
 */
public final class eei_0
extends eAH {
    private static final ArrayList<amz_1[]> pBv = new ArrayList();
    private amu_1 pBw;

    @Deprecated
    public eei_0() {
    }

    public eei_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pBw = (amu_1)arrayList.get(0);
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pBv;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pJg;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        exP exP2 = eAs.k(object, object2, object3, object4);
        if (exP2 == null || !(exP2 instanceof fjm)) {
            throw new amf_2("Impossible de r\u00e9cup\u00e9rer la cible du crit\u00e8re");
        }
        byte by = (byte)this.pBw.d(object, object2, object3, object4);
        fkK fkK2 = fkK.gU(by);
        return exP2.ffF().a(fkK2) ? 0 : -1;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJy};
        pBv.add(amz_1Array);
    }
}

