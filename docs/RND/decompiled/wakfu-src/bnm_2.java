/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.set.hash.TIntHashSet;

/*
 * Renamed from bnM
 */
public class bnm_2
implements bnh_0 {
    private static final int iJR = 256;
    private static final byte[] iJS = new byte[256];
    private final int[] iJT;

    public bnm_2(int ... nArray) {
        assert (nArray != null && nArray.length >= 1) : "Random patterns must contain at least 1 gfx (2 would be even better)";
        this.iJT = nArray;
    }

    @Override
    public int dw(int n, int n2) {
        int n3 = n * 7 + n2 * 39;
        byte by = iJS[Math.abs(n3) % 256];
        return this.iJT[Math.abs(by) % this.iJT.length];
    }

    @Override
    public void a(TIntHashSet tIntHashSet) {
        tIntHashSet.addAll(this.iJT);
    }

    static {
        GC.dj(iJS);
    }
}

