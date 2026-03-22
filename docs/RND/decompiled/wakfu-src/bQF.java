/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 */
import gnu.trove.map.hash.TIntIntHashMap;

public class bQF {
    public static final bQF kWe = new bQF();
    private final TIntIntHashMap kWf = new TIntIntHashMap();
    private final TIntIntHashMap kWg = new TIntIntHashMap();

    public void dT(int n, int n2) {
        this.kWf.put(n, n2);
    }

    public void dU(int n, int n2) {
        this.kWg.put(n, n2);
    }

    public int IY(int n) {
        return this.kWf.get(n);
    }

    public int IZ(int n) {
        return this.kWg.get(n);
    }
}

