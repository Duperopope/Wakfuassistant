/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class eFL
extends eAH {
    private static final List<amz_1[]> pDv = Collections.singletonList(amz_1.cJI);

    @Override
    protected List<amz_1[]> bDC() {
        return pDv;
    }

    public eFL(ArrayList<amx_1> arrayList) {
        short s = this.r(arrayList);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        exP exP2 = eAs.k(object, object2, object3, object4);
        if (!(exP2 instanceof fad)) {
            return -1;
        }
        fad fad2 = (fad)((Object)exP2);
        return fad2.dpZ().Ya() == 0L ? -1 : 0;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pLF;
    }
}

