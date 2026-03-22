/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class eAF
extends eAH {
    private static final List<amz_1[]> pwv = Collections.singletonList(amz_1.cJI);

    @Override
    protected List<amz_1[]> bDC() {
        return pwv;
    }

    public eAF(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        QD qD;
        if (object3 instanceof ero_0 && (qD = ((ero_0)object3).bbm()) != null && qD.d() == enf_0.qSU.d()) {
            return 0;
        }
        return 1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pGJ;
    }
}

