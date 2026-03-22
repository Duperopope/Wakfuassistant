/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from eAn
 */
public final class ean_0
extends eAH {
    private static final ArrayList<amz_1[]> pvP = new ArrayList();
    private final amu_1 pvQ;
    private final amz_2 pvR;

    @Override
    protected List<amz_1[]> bDC() {
        return pvP;
    }

    public ean_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pvQ = (amu_1)arrayList.get(0);
        this.pvR = arrayList.size() >= 2 ? (amz_2)arrayList.get(1) : null;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        qu_0 qu_02;
        Object object5;
        boolean bl;
        acd_1 acd_12 = eAs.d(true, object, object2, object4, object3);
        if (acd_12 == null) {
            return -1;
        }
        long l = this.pvQ.d(object, object2, object3, object4);
        etu_0 etu_02 = null;
        if (object4 instanceof etu_0) {
            etu_02 = (etu_0)object4;
        } else if (object4 instanceof ent_0) {
            etu_02 = ((ent_0)object4).fBq();
        }
        if (etu_02 == null) {
            return -1;
        }
        boolean bl2 = bl = this.pvR != null && this.pvR.b(object, object3, object3, object4) && this.pvR.a(object, object3, object3, object4) == 0;
        if (bl) {
            object5 = eAs.b(false, object, object2, object4, object3);
            if (object5 == null) {
                return -1;
            }
            qu_02 = eAs.aP(object5);
        } else {
            qu_02 = null;
        }
        object5 = etu_02.bai().bdh();
        Iterator iterator = object5.iterator();
        while (iterator.hasNext()) {
            QQ qQ = (QQ)iterator.next();
            if ((long)qQ.aeV() != l || qu_02 != null && eAs.aP(qQ) != qu_02 || !qQ.d(acd_12)) continue;
            return 0;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pNh;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJy};
        pvP.add(amz_1Array);
        amz_1Array = new amz_1[]{amz_1.cJy, amz_1.cJz};
        pvP.add(amz_1Array);
    }
}

