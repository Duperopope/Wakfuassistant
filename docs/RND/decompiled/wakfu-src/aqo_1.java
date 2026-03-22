/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.impl.hash.TLongHash
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.impl.hash.TLongHash;
import gnu.trove.map.hash.TLongObjectHashMap;

/*
 * Renamed from aqO
 */
class aqo_1
extends aqm_1<TLongObjectHashMap<Integer>> {
    aqo_1(aqh_1 aqh_12) {
        super(aqh_12);
    }

    protected TLongObjectHashMap<Integer> tG(int n) {
        return new TLongObjectHashMap(n, 1.0f);
    }

    @Override
    protected void a(long l, aqh_1 aqh_12) {
        ((TLongObjectHashMap)this.cRi).put(l, (Object)aqh_12.bGI());
    }

    @Override
    public int gw(long l) {
        return ((TLongObjectHashMap)this.cRi).contains(l) ? 1 : 0;
    }

    @Override
    public int p(long l, int n) {
        return (Integer)((TLongObjectHashMap)this.cRi).get(l);
    }

    @Override
    protected /* synthetic */ TLongHash tF(int n) {
        return this.tG(n);
    }
}

