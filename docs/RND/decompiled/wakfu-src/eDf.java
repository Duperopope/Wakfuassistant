/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class eDf
extends eak_0 {
    private static final ArrayList<amz_1[]> pzU = new ArrayList();
    private amu_1 pvE;

    public eDf(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pvE = (amu_1)arrayList.get(0);
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pzU;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        if (object2 == null || !(object2 instanceof acd_1)) {
            return 0L;
        }
        eSS eSS2 = this.p(object, object2, object3, object4);
        if (eSS2 == null) {
            return 0L;
        }
        acd_1 acd_12 = (acd_1)object2;
        azl_2 azl_22 = eSS2.bcx();
        Iterator iterator = azl_22.iterator();
        etu_0 etu_02 = eAs.aO(object4);
        ese_0 ese_02 = new ese_0();
        HashSet<qu_0> hashSet = new HashSet<qu_0>();
        while (iterator.hasNext()) {
            enk_0 enk_02 = (enk_0)iterator.next();
            List<qu_0> list = ese_02.a(enk_02, eSS2, etu_02.bbh(), acd_12.getX(), acd_12.getY(), acd_12.bdi());
            if (list.isEmpty()) continue;
            hashSet.addAll(list);
        }
        return hashSet.size();
    }

    private eSS p(Object object, Object object2, Object object3, Object object4) {
        long l = this.pvE.d(object, object2, object3, object4);
        return eTo.fIZ().iY(l);
    }

    @Override
    public Enum bDq() {
        return ehq_0.pJX;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJy};
        pzU.add(amz_1Array);
    }
}

