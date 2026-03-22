/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import com.google.common.base.Function;
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from eEn
 */
class een_0
implements Function<TIntObjectHashMap<abm_1>, Boolean> {
    private final long pBB;

    een_0(long l) {
        this.pBB = l;
    }

    public Boolean e(TIntObjectHashMap<abm_1> tIntObjectHashMap) {
        return tIntObjectHashMap.containsKey(GC.cw(this.pBB));
    }

    public /* synthetic */ Object apply(Object object) {
        return this.e((TIntObjectHashMap<abm_1>)((TIntObjectHashMap)object));
    }
}

