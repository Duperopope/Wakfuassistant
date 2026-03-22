/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.set.hash.TIntHashSet;

/*
 * Renamed from bnL
 */
public class bnl_2
implements bnh_0 {
    private final bnk_2 iJP;

    public bnl_2(bnk_2 bnk_22) {
        assert (bnk_22 != null) : "Motif can't be null for a MotifPattern";
        this.iJP = bnk_22;
    }

    @Override
    public int dw(int n, int n2) {
        return this.iJP.dw(n, n2);
    }

    @Override
    public void a(TIntHashSet tIntHashSet) {
        this.iJP.a(tIntHashSet);
    }
}

