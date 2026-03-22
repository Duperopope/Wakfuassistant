/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class eGA
extends eAH {
    private static final ArrayList<amz_1[]> pEA = new ArrayList();
    private boolean pvJ;

    @Override
    protected List<amz_1[]> bDC() {
        return pEA;
    }

    public eGA(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pvJ = ((anh_2)arrayList.get(0)).getValue().equalsIgnoreCase("target");
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.b(this.pvJ, object, object2, object4, object3);
        return eyo_02 != null && eyo_02.dOn() ? 0 : -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pLA;
    }

    static {
        pEA.add(new amz_1[]{amz_1.cJx});
    }
}

