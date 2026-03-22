/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.set.hash.TIntHashSet;

public class eHw {
    public static final eHw qrZ = new eHw(-1, -1, -1, new int[0]);
    private final int qsa;
    private final int qsb;
    private final int qsc;
    private final TIntHashSet qsd = new TIntHashSet();

    public eHw(int n, int n2, int n3, int ... nArray) {
        this.qsa = n;
        this.qsb = n2;
        this.qsc = n3;
        this.qsd.addAll(nArray);
        this.qsd.removeAll(ewy.oHB);
    }

    public int apw() {
        return this.qsc;
    }

    public TIntHashSet fvK() {
        return this.qsd;
    }

    public int d() {
        return this.qsa;
    }

    public boolean Pt(int n) {
        return this.qsd.contains(n);
    }

    public int clS() {
        return this.qsb;
    }

    public boolean bjv() {
        return this.qsa == eHw.qrZ.qsa;
    }
}

