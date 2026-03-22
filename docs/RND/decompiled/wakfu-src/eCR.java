/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import com.google.common.base.Function;
import gnu.trove.map.hash.TIntObjectHashMap;

class eCR
implements Function<TIntObjectHashMap<abm_1>, abm_1> {
    private final long pzz;

    eCR(long l) {
        this.pzz = l;
    }

    public abm_1 d(TIntObjectHashMap<abm_1> tIntObjectHashMap) {
        return (abm_1)tIntObjectHashMap.get((int)this.pzz);
    }

    public /* synthetic */ Object apply(Object object) {
        return this.d((TIntObjectHashMap<abm_1>)((TIntObjectHashMap)object));
    }
}

