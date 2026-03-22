/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eGx
 */
public final class egx_0
extends eAH {
    private static final ArrayList<amz_1[]> pEs = new ArrayList();
    private final boolean pEt;
    private final amu_1 pEu;
    private final amu_1 pEv;
    private final amz_2 pEw;

    @Override
    protected List<amz_1[]> bDC() {
        return pEs;
    }

    public egx_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.r(arrayList);
        this.pEt = ((anh_2)arrayList.get(0)).getValue().equalsIgnoreCase("target");
        this.pEu = (amu_1)arrayList.get(1);
        this.pEw = (amz_2)arrayList.get(2);
        this.pEv = (amu_1)arrayList.get(3);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        qu_0 qu_02 = eAs.aP(object);
        qu_0 qu_03 = eAs.aP(object2);
        if (object == null) {
            return -1;
        }
        Object object5 = this.pEt ? object2 : object;
        boolean bl = this.pEw.b(object, object2, object3, object4);
        long l = this.pEu.d(object, object2, object3, object4);
        long l2 = this.pEv.d(object, object2, object3, object4);
        if (object5 instanceof QY) {
            QQ qQ = ((QY)object5).bdd();
            if (qQ == null) {
                return -1;
            }
            if (qQ.bcw() != l) {
                return -1;
            }
            if (bl && qu_03 != qu_02) {
                return -1;
            }
            if (!(qQ instanceof eyo_0)) {
                return -1;
            }
            if (!((eyo_0)((Object)qQ)).kW(l2)) {
                return -1;
            }
            return 0;
        }
        if (object5 == null) {
            for (QQ qQ : ((etu_0)object4).bai().bdh()) {
                if (qQ.bcw() != l || bl && eAs.aP(qQ) != qu_02 || !(qQ instanceof eyo_0) || !((eyo_0)((Object)qQ)).kW(l2)) continue;
                return 0;
            }
            return -1;
        }
        etu_0 etu_02 = eAs.aO(object4);
        if (object2 instanceof acd_1 && etu_02 != null) {
            for (QQ qQ : etu_02.bai().bdh()) {
                acd_1 acd_12 = (acd_1)object2;
                if (qQ.bcw() != l || bl && eAs.aP(qQ) != qu_02 || !qQ.d(acd_12) || !(qQ instanceof eyo_0) || !((eyo_0)((Object)qQ)).kW(l2)) continue;
                return 0;
            }
            return -1;
        }
        return -2;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pGw;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJx, amz_1.cJy, amz_1.cJz, amz_1.cJy};
        pEs.add(amz_1Array);
    }
}

