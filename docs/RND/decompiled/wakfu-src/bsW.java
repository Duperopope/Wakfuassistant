/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;

public final class bsW {
    public static final bsW jjJ = new bsW();
    private final TLongObjectHashMap<acd_1> jjK = new TLongObjectHashMap();
    private final TLongObjectHashMap<avz_0> jjL = new TLongObjectHashMap();

    private bsW() {
    }

    public void kA(long l) {
        this.jjK.remove(l);
        this.jjL.remove(l);
    }

    public void a(long l, avz_0 avz_02) {
        this.jjL.put(l, (Object)avz_02);
    }

    public boolean b(long l, avz_0 avz_02) {
        return this.jjL.get(l) == avz_02;
    }

    public void b(TLongObjectHashMap<acd_1> tLongObjectHashMap) {
        TLongObjectIterator tLongObjectIterator = tLongObjectHashMap.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            this.jjK.put(tLongObjectIterator.key(), (Object)((acd_1)tLongObjectIterator.value()));
        }
    }

    public acd_1 kB(long l) {
        return (acd_1)this.jjK.get(l);
    }
}

