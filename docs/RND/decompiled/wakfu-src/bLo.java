/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;

public class bLo {
    private final TLongObjectHashMap<bKV> ksq = new TLongObjectHashMap();
    private final long ksr;
    private final int kss;
    private final int kst;

    public bLo(int n, int n2) {
        this.kss = vz_0.qd(n);
        this.kst = vz_0.qe(n2);
        this.ksr = GC.s(this.kss, this.kst);
    }

    public void a(bKV bKV2) {
        this.ksq.put(bKV2.Sn(), (Object)bKV2);
    }

    public void b(bKV bKV2) {
        this.ksq.remove(GC.s(bKV2.bcC(), bKV2.bcD()));
    }

    public boolean dR(int n, int n2) {
        long l = GC.s(n, n2);
        return this.ksq.get(l) != null;
    }

    public void bXZ() {
        TLongObjectIterator tLongObjectIterator = this.ksq.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            bKV bKV2 = (bKV)tLongObjectIterator.value();
            bKV2.aZp();
        }
        this.ksq.clear();
    }

    public long Sn() {
        return this.ksr;
    }

    public bKV dQ(int n, int n2) {
        long l = GC.s(n, n2);
        return (bKV)this.ksq.get(l);
    }

    public TLongObjectHashMap<bKV> ecA() {
        return this.ksq;
    }

    public int getX() {
        return this.kss;
    }

    public int getY() {
        return this.kst;
    }
}

