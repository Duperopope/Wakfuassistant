/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.set.hash.TIntHashSet;

/*
 * Renamed from fdm
 */
public class fdm_0
extends fdz_0 {
    private final int rVF;
    private final TIntHashSet rVG;

    public fdm_0(int n, int n2, int n3, int[] nArray, eIx eIx2, int n4) {
        super(n, n2, eIx2, n4);
        this.rVF = n3;
        this.rVG = new TIntHashSet(nArray);
    }

    public int cms() {
        return this.rVF;
    }

    public TIntHashSet fTq() {
        return this.rVG;
    }
}

