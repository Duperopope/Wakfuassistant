/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongLongHashMap
 */
import gnu.trove.map.hash.TLongLongHashMap;

public class fcK {
    public static final fcK rUe = new fcK();
    private final TLongLongHashMap rUf = new TLongLongHashMap();

    public void ar(long l, long l2) {
        this.rUf.put(l, l2);
    }

    public boolean sp(long l) {
        return this.rUf.containsKey(l);
    }

    public long sq(long l) {
        return this.rUf.get(l);
    }

    public boolean aU(exP exP2) {
        return !this.bM(exP2);
    }

    private boolean bM(exP exP2) {
        return this.as(exP2.Xi(), exP2.Sn());
    }

    public boolean as(long l, long l2) {
        if (!fcI.fSM()) {
            return false;
        }
        return this.rUf.containsKey(l) && this.sq(l) != l2;
    }

    public boolean c(long l, exP exP2) {
        if (!fcI.fSM()) {
            return false;
        }
        return this.rUf.containsKey(l) && this.sq(l) != exP2.Sn() && exP2.Xi() == l;
    }

    public void sr(long l) {
        this.rUf.remove(l);
    }

    public void at(long l, long l2) {
        if (this.rUf.containsKey(l) && this.rUf.get(l) == l2) {
            this.rUf.remove(l);
        }
    }

    public void clear() {
        this.rUf.clear();
    }
}

