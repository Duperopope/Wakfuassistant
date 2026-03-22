/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eES
 */
public final class ees_0
extends eAH {
    private static final int pCy = -1;
    private static final List<amz_1[]> pCz = new ArrayList<amz_1[]>();
    private int eGx;

    @Override
    protected List<amz_1[]> bDC() {
        return pCz;
    }

    @Deprecated
    public ees_0() {
    }

    public ees_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.eGx = arrayList.size() < 1 ? -1 : (int)((amu_1)arrayList.get(0)).d(null, null, null, null);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        etu_0 etu_02 = eAs.aO(object4);
        if (etu_02 == null) {
            return -1;
        }
        if (etu_02.bak() == null) {
            return -1;
        }
        qy_0 qy_02 = etu_02.bak();
        if (this.eGx == -1) {
            return qy_02.baS() != null ? 0 : -1;
        }
        return qy_02.axA() == this.eGx ? 0 : -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pJG;
    }

    static {
        pCz.add(eAC.pwq);
        pCz.add(eAC.pwt);
    }
}

