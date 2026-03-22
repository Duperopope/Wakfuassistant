/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class eGK
extends eAH {
    private static final List<amz_1[]> pEM = Collections.singletonList(amz_1.cJI);

    @Override
    protected List<amz_1[]> bDC() {
        return pEM;
    }

    public eGK(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (object2 instanceof qu_0 && ((qu_0)object2).a(exe_1.rDu)) {
            return 0;
        }
        return 1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pGK;
    }
}

