/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.set.hash.TLongHashSet
 */
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.set.hash.TLongHashSet;
import java.util.ArrayList;
import java.util.List;

public class eCp
extends eco_0 {
    private static final List<amz_1[]> pyS = new ArrayList<amz_1[]>();

    @Override
    protected List<amz_1[]> bDC() {
        return pyS;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    public eCp(List<amx_1> list) {
        super(list);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        exP exP2;
        if (object == null) {
            if (!(object3 instanceof ehe_0)) throw new amf_2("on cherche l'\u00e9quipement d'un user null");
            exP2 = ((ehe_0)object3).fog();
        } else {
            if (!(object instanceof exP)) {
                throw new amf_2("on cherche l'\u00e9quipement d'autre chose qu'un character");
            }
            exP2 = (exP)object;
        }
        if (exP2 == null) {
            return 0L;
        }
        long l = 0L;
        long l2 = exP2.Xi();
        TLongHashSet tLongHashSet = fcL.rUh.sx(l2);
        for (long l3 : tLongHashSet) {
            Object t = fcL.rUh.sw(l3);
            if (t == null) continue;
            TLongArrayList tLongArrayList = this.o(t, object3, object3, object4);
            l += (long)this.a((exP)t, tLongArrayList);
        }
        return l;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pGt;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJA};
        pyS.add(amz_1Array);
    }
}

