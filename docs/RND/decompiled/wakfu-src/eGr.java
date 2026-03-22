/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class eGr
extends eAH {
    private static final List<amz_1[]> pEl = new ArrayList<amz_1[]>();

    public eGr(ArrayList<amx_1> arrayList) {
    }

    @Override
    protected List<amz_1[]> bDC() {
        return Collections.unmodifiableList(pEl);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        ety_0 ety_02 = eAs.m(object, object4);
        if (ety_02 == null && object3 != null && object3 instanceof ehe_0) {
            ety_02 = ((ehe_0)object3).fog().dlK();
        }
        if (ety_02 == null) {
            return -1;
        }
        if (ety_02.dGo().fLg().fLf()) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pMl;
    }

    static {
        pEl.add(amz_1.cJI);
    }
}

