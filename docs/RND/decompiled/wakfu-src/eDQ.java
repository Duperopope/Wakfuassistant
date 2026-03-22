/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class eDQ
extends eAH {
    private static final List<amz_1[]> pAM = new ArrayList<amz_1[]>();
    private final amu_1 pAN;

    public eDQ(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pAN = (amu_1)arrayList.get(0);
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pAM;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pJc;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        int n;
        eki_0 eki_02 = eAs.n(object, object2, object3, object4);
        return eki_02.tX(n = (int)this.pAN.d(object, object2, object3, object4)) ? 0 : -1;
    }

    public int cms() {
        return this.pAN.bDo() ? (int)this.pAN.d(null, null, null, null) : -1;
    }

    public String toString() {
        return "HasCraft{m_craftId=" + String.valueOf(this.pAN) + "}";
    }

    static {
        pAM.add(eAC.pwt);
    }
}

