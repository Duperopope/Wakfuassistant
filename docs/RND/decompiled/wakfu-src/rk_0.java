/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TByteIntHashMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.set.hash.TByteHashSet
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TByteIntHashMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.set.hash.TByteHashSet;

/*
 * Renamed from Rk
 */
public final class rk_0 {
    private final TIntObjectHashMap<TByteHashSet> bkD = new TIntObjectHashMap();
    private final TByteIntHashMap bkE = new TByteIntHashMap();

    void b(byte by, int n) {
        this.c(by, n);
        this.bkE.put(by, n);
    }

    void c(byte by, int n) {
        TByteHashSet tByteHashSet = (TByteHashSet)this.bkD.get(n);
        if (tByteHashSet == null) {
            tByteHashSet = new TByteHashSet();
            this.bkD.put(n, (Object)tByteHashSet);
        }
        tByteHashSet.add(by);
    }

    void W(byte by) {
        TByteHashSet tByteHashSet = (TByteHashSet)this.bkD.get(this.bkE.get(by));
        this.bkE.remove(by);
        if (tByteHashSet == null) {
            return;
        }
        tByteHashSet.remove(by);
    }

    void X(byte by) {
        this.bkE.remove(by);
        TIntObjectIterator tIntObjectIterator = this.bkD.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            TByteHashSet tByteHashSet = (TByteHashSet)tIntObjectIterator.value();
            tByteHashSet.remove(by);
        }
    }

    TByteHashSet oZ(int n) {
        return (TByteHashSet)this.bkD.get(n);
    }

    public int Y(byte by) {
        return this.bkE.get(by);
    }

    public boolean Z(byte by) {
        return this.bkE.contains(by);
    }

    public byte[] bdE() {
        return this.bkE.keys();
    }
}

