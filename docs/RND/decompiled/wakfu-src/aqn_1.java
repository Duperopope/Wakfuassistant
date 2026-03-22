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
 * Renamed from aqN
 */
class aqn_1
extends aqm_1<TLongObjectHashMap<int[]>> {
    aqn_1(aqh_1 aqh_12) {
        super(aqh_12);
    }

    protected TLongObjectHashMap<int[]> tG(int n) {
        return new TLongObjectHashMap(n, 1.0f);
    }

    @Override
    protected void a(long l, aqh_1 aqh_12) {
        ((TLongObjectHashMap)this.cRi).put(l, (Object)aqh_12.bGM());
    }

    @Override
    public int gw(long l) {
        int[] nArray = (int[])((TLongObjectHashMap)this.cRi).get(l);
        return nArray == null ? 0 : nArray.length;
    }

    @Override
    public int p(long l, int n) {
        return ((int[])((TLongObjectHashMap)this.cRi).get(l))[n];
    }

    @Override
    protected /* synthetic */ TLongHash tF(int n) {
        return this.tG(n);
    }
}

