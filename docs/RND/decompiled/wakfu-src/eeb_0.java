/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 */
import gnu.trove.iterator.TLongObjectIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from eEB
 */
public class eeb_0
extends eAH {
    private static final List<amz_1[]> pBT = Collections.singletonList(amz_1.cJI);

    @Override
    protected List<amz_1[]> bDC() {
        return pBT;
    }

    public eeb_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (object == null) {
            return -1;
        }
        if (object instanceof exP) {
            return 0;
        }
        if (object instanceof TLongObjectIterator && ((TLongObjectIterator)object).hasNext()) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pHb;
    }
}

