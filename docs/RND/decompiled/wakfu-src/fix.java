/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongIntHashMap
 */
import gnu.trove.map.hash.TLongIntHashMap;

public class fix {
    public static final fix sse = new fix();
    private final TLongIntHashMap ssf = new TLongIntHashMap();

    private fix() {
    }

    public void an(int n, int n2, int n3) {
        this.ssf.put(fix.fV(n2, n3), n);
    }

    public int fU(int n, int n2) {
        return this.ssf.get(fix.fV(n, n2));
    }

    private static long fV(int n, int n2) {
        return GC.s(n, n2);
    }
}

