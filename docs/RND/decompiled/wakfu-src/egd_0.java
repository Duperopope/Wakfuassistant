/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eGD
 */
public class egd_0
extends eAH {
    private static final ArrayList<amz_1[]> pEF = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pEF;
    }

    public boolean bDo() {
        return true;
    }

    public egd_0(ArrayList<amx_1> arrayList) {
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        exP exP2 = eAs.a(true, object, object2, object4, object3);
        exP exP3 = eAs.a(false, object, object2, object4, object3);
        if (exP3 == null || exP2 == null) {
            return -1;
        }
        if (exP3.bcP() == exP2.bcP()) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pKg;
    }

    static {
        pEF.add(amz_1.cJI);
    }
}

