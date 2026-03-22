/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntLongHashMap
 *  gnu.trove.map.hash.TLongLongHashMap
 *  org.apache.commons.lang3.ArrayUtils
 */
import gnu.trove.map.hash.TIntLongHashMap;
import gnu.trove.map.hash.TLongLongHashMap;
import org.apache.commons.lang3.ArrayUtils;

/*
 * Renamed from alc
 */
public abstract class alc_1
extends age_1 {
    private final TIntLongHashMap cEF = new TIntLongHashMap();
    private final TLongLongHashMap cEG = new TLongLongHashMap();
    private static final int cEH = 700;
    private final long[] cEI = new long[]{400L, 410L, 420L};

    @Override
    public void a(int n, long l, long l2, long l3) {
        this.cEF.put(n, l);
        this.cEG.put(l3, l2);
    }

    private long sL(int n) {
        return this.cEF.remove(n);
    }

    @Override
    public boolean f(long l, long l2) {
        long l3 = ahk_2.hT(l2);
        if (!ArrayUtils.contains((long[])this.cEI, (long)l3)) {
            return true;
        }
        long l4 = this.cEG.get(l2);
        return 700L <= Math.abs(l - l4);
    }

    protected boolean bpD() {
        return aiv_2.bBr().bpD();
    }

    @Override
    public void h(int n, boolean bl) {
        long l = this.sL(n);
        if (bl) {
            ahk_1 ahk_12 = ahn_1.ccT().hL(l);
            aiv_2.bBr().a(l, ahk_12);
        }
    }
}

