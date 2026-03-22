/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.set.hash.TIntHashSet;

/*
 * Renamed from bnJ
 */
public class bnj_2
implements bnh_0 {
    private final int iJJ;
    private final int iJK;

    public bnj_2(int n, int n2) {
        this.iJJ = n;
        this.iJK = n2;
    }

    @Override
    public int dw(int n, int n2) {
        if (n == 1 && n2 == 0) {
            return this.iJJ;
        }
        if (n == 0 && n2 == 1) {
            return this.iJK;
        }
        return 0;
    }

    @Override
    public void a(TIntHashSet tIntHashSet) {
        tIntHashSet.add(this.iJJ);
        tIntHashSet.add(this.iJK);
    }
}

