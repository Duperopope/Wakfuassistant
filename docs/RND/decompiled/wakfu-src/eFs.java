/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eFs
extends eAH {
    private static final ArrayList<amz_1[]> pDe = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pDe;
    }

    public eFs(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        return ue_0.bjV().bjr() ? 0 : -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pFO;
    }

    static {
        pDe.add(amz_1.cJI);
    }
}

