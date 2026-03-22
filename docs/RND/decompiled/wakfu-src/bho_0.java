/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.set.hash.TIntHashSet;

/*
 * Renamed from bho
 */
final class bho_0
extends eyj_0 {
    private final ri_1 igi;
    final /* synthetic */ bgt_0 igj;

    bho_0(bgt_0 bgt_02, ri_1 ri_12) {
        this.igj = bgt_02;
        this.igi = ri_12;
        this.igi.DM().a(this);
    }

    @Override
    public void zl() {
        bgt_0.dos().error((Object)(this.getClass().getSimpleName() + " shouldn't be serialized client-side"));
    }

    @Override
    public void zm() {
        TIntHashSet tIntHashSet = this.igj.ifn;
        TIntHashSet tIntHashSet2 = this.igj.ifo;
        TIntHashSet tIntHashSet3 = this.igj.ifp;
        this.igj.ifn = this.igi.Wq != null ? new TIntHashSet(this.igi.Wq) : null;
        this.igj.ifo = this.igi.Wr != null ? new TIntHashSet(this.igi.Wr) : null;
        this.igj.ifp = this.igi.Ws != null ? new TIntHashSet(this.igi.Ws) : null;
        if (!this.igj.djT() && this.a(tIntHashSet3, this.igj.ifp)) {
            this.igj.dnr();
        }
        if (!this.igj.djT() && this.a(tIntHashSet, this.igj.ifn)) {
            this.igj.gb(true);
        }
        if (!this.igj.djT() && this.a(tIntHashSet2, this.igj.ifo)) {
            this.igj.ga(true);
        }
    }

    private boolean a(TIntHashSet tIntHashSet, TIntHashSet tIntHashSet2) {
        if (tIntHashSet == null) {
            return tIntHashSet2 != null;
        }
        return !tIntHashSet.equals((Object)tIntHashSet2);
    }
}

