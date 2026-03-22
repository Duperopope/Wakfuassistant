/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class eAD
extends eAH {
    private static final ArrayList<amz_1[]> pwu = new ArrayList();

    public eAD(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pwu;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        throw new UnsupportedOperationException("DEPRECATED CRITERIA");
    }

    @Override
    public Enum bDq() {
        return ehq_0.pKm;
    }

    static {
        pwu.add(amz_1.cJI);
    }
}

