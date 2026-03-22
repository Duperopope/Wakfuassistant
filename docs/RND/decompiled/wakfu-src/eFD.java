/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class eFD
extends eAH {
    private static final ArrayList<amz_1[]> pDp = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pDp;
    }

    public eFD(ArrayList<amx_1> arrayList) {
    }

    @Override
    public Enum bDq() {
        return ehq_0.pMx;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        exP exP2 = eAs.k(object, object2, object3, object4);
        return fcK.rUe.sq(exP2.Xi()) == exP2.Sn() ? -1 : 0;
    }

    static {
        pDp.add(eAC.pwq);
    }
}

