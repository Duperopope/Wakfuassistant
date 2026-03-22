/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eFn
extends eAH {
    private static final ArrayList<amz_1[]> pCZ = new ArrayList();
    private boolean pvJ = false;

    @Override
    protected List<amz_1[]> bDC() {
        return pCZ;
    }

    public eFn(ArrayList<amx_1> arrayList) {
        byte by = this.r(arrayList);
        if (by == 1) {
            this.pvJ = ((anh_2)arrayList.get(0)).getValue().equalsIgnoreCase("target");
        }
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.b(this.pvJ, object, object2, object4, object3);
        if (eyo_02 == null) {
            return -1;
        }
        return eyo_02.a(eyp_0.pmN) ? 0 : -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pKk;
    }

    static {
        pCZ.add(eAC.pwq);
        pCZ.add(eAC.pwr);
    }
}

