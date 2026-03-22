/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class eGz
extends eAH {
    private static final ArrayList<amz_1[]> pEy = new ArrayList();
    private final String pEz;

    @Override
    protected List<amz_1[]> bDC() {
        return pEy;
    }

    public eGz(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pEz = ((anh_2)arrayList.get(0)).getValue();
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.a(this.pEz, object, object2, object4, object3);
        return eyo_02 != null && eyo_02.dOp() ? 0 : -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pJZ;
    }

    static {
        pEy.add(new amz_1[]{amz_1.cJx});
    }
}

