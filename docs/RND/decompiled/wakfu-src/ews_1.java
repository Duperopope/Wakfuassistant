/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.set.hash.TIntHashSet;
import java.util.ArrayList;

/*
 * Renamed from eWS
 */
public class ews_1
implements ewp_1 {
    private final int rCs;
    private final short rCt;
    private final ang_2 rCu;
    private final int rCv;
    private final int rCw;
    private final int rCx;
    private final int rCy;
    private final boolean rCz;
    private final TIntHashSet rCA = new TIntHashSet();
    private final TIntHashSet rCB = new TIntHashSet();
    private final ArrayList<eww_1> rCC = new ArrayList();

    public ews_1(int n, short s, ang_2 ang_22, int n2, int n3, int n4, int n5, boolean bl) {
        this.rCs = n;
        this.rCt = s;
        this.rCu = ang_22;
        this.rCv = n2;
        this.rCw = n3;
        this.rCx = n4;
        this.rCy = n5;
        this.rCz = bl;
    }

    @Override
    public int d() {
        return this.rCs;
    }

    @Override
    public int aVt() {
        return this.rCy;
    }

    @Override
    public short bdn() {
        return this.rCt;
    }

    @Override
    public ang_2 bdo() {
        return this.rCu;
    }

    @Override
    public int LR() {
        return this.rCv;
    }

    @Override
    public int fOo() {
        return this.rCw;
    }

    @Override
    public int fOp() {
        return this.rCx;
    }

    public void O(int ... nArray) {
        this.rCA.addAll(nArray);
    }

    public void P(int ... nArray) {
        this.rCB.addAll(nArray);
    }

    public void a(int n, ang_2 ang_22, short s, short s2) {
        eww_1 eww_12 = new eww_1(n, ang_22, s, s2);
        this.rCC.add(eww_12);
    }

    @Override
    public ArrayList<eww_1> aFV() {
        return this.rCC;
    }

    @Override
    public boolean SS(int n) {
        return this.rCA.contains(n);
    }

    @Override
    public boolean ST(int n) {
        return this.rCB.contains(n);
    }

    @Override
    public boolean fOq() {
        return this.rCz;
    }
}

