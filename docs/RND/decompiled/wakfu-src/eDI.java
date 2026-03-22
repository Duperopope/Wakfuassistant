/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eDI
extends eAH {
    private static final ArrayList<amz_1[]> pAD = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pAD;
    }

    public eDI(ArrayList<amx_1> arrayList) {
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (!(object instanceof eve_2)) {
            return -1;
        }
        boolean bl = ((eve_2)object).dpL().a(evn_2.ovl);
        return bl ? 0 : -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pMA;
    }

    static {
        pAD.add(eAC.pwq);
    }
}

