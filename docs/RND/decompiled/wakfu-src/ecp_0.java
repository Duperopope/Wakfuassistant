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
 * Renamed from eCP
 */
class ecp_0
implements Function<TIntObjectHashMap<abm_1>, abm_1> {
    private final long pzx;

    ecp_0(long l) {
        this.pzx = l;
    }

    public abm_1 d(TIntObjectHashMap<abm_1> tIntObjectHashMap) {
        return (abm_1)tIntObjectHashMap.get((int)this.pzx);
    }

    public /* synthetic */ Object apply(Object object) {
        return this.d((TIntObjectHashMap<abm_1>)((TIntObjectHashMap)object));
    }
}

