/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.impl.hash.TLongHash
 */
import gnu.trove.impl.hash.TLongHash;

/*
 * Renamed from aqM
 */
public abstract class aqm_1<Hash extends TLongHash> {
    public final String cRh;
    protected final Hash cRi;

    protected aqm_1(aqh_1 aqh_12) {
        this.cRh = aqh_12.bGL().intern();
        int n = aqh_12.bGI();
        this.cRi = this.tF(n);
        for (int i = 0; i < n; ++i) {
            long l = aqh_12.bGK();
            this.a(l, aqh_12);
        }
    }

    public static aqm_1 b(aqh_1 aqh_12) {
        boolean bl;
        boolean bl2 = bl = aqh_12.aTf() != 0;
        if (bl) {
            return new aqo_1(aqh_12);
        }
        return new aqn_1(aqh_12);
    }

    protected abstract Hash tF(int var1);

    protected abstract void a(long var1, aqh_1 var3);

    public abstract int gw(long var1);

    public abstract int p(long var1, int var3);
}

