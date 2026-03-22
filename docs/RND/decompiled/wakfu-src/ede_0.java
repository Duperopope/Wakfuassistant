/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from eDe
 */
public final class ede_0
extends eak_0 {
    private static final ArrayList<amz_1[]> pzT = new ArrayList();

    public ede_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pzT;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        if (object2 == null) {
            return 0L;
        }
        eSS eSS2 = this.o(object2, object4);
        if (eSS2 == null) {
            return 0L;
        }
        azl_2 azl_22 = eSS2.bcx();
        Iterator iterator = azl_22.iterator();
        etu_0 etu_02 = eAs.aO(object4);
        ese_0 ese_02 = new ese_0();
        HashSet<qu_0> hashSet = new HashSet<qu_0>();
        while (iterator.hasNext()) {
            enk_0 enk_02 = (enk_0)iterator.next();
            List<qu_0> list = ese_02.a(enk_02, eSS2, etu_02.bbh(), eSS2.bcC(), eSS2.bcD(), eSS2.bcE());
            if (list.isEmpty()) continue;
            hashSet.addAll(list);
        }
        return hashSet.size();
    }

    private eSS o(Object object, Object object2) {
        Object object3 = object;
        if (object instanceof QY) {
            object3 = ((QY)object).bdd();
        }
        eSN eSN2 = null;
        if (object3 instanceof eSN) {
            eSN2 = (eSN)object;
        } else if (object instanceof acd_1) {
            etu_0 etu_02 = eAs.aO(object2);
            acd_1 acd_12 = (acd_1)object;
            rj_0 rj_02 = etu_02.bag().X(acd_12.getX(), acd_12.getY());
            if (rj_02 instanceof eSN) {
                eSN2 = (eSN)rj_02;
            }
        }
        return eSN2;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pJS;
    }

    static {
        pzT.add(eAC.pwq);
    }
}

