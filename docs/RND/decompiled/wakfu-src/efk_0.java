/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from eFK
 */
public class efk_0
extends eAH {
    private static final List<amz_1[]> pDu = Collections.singletonList(amz_1.cJI);

    @Override
    protected List<amz_1[]> bDC() {
        return pDu;
    }

    @Deprecated
    public efk_0() {
    }

    public efk_0(ArrayList<amx_1> arrayList) {
        short s = this.r(arrayList);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        exP exP2 = eAs.k(object, object2, object3, object4);
        return exP2.a(Vf.bxK) ? 0 : -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pIL;
    }
}

