/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.set.hash.TIntHashSet;

/*
 * Renamed from bnG
 */
public class bng_0
implements bnF {
    private final bnd_0 iJC;
    private final bnh_0 iJD;

    public bng_0(bnd_0 bnd_02, bnh_0 bnh_02) {
        this.iJC = bnd_02;
        this.iJD = bnh_02;
    }

    public int E(short s, short s2) {
        return this.iJD.dw(s, s2);
    }

    @Override
    public void a(TIntHashSet tIntHashSet) {
        this.iJC.a(tIntHashSet);
        this.iJD.a(tIntHashSet);
    }

    public int EB(int n) {
        return this.iJC.EA(n);
    }
}

