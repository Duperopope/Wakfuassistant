/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

public final class eHA {
    public static final eHA qsk = new eHA();
    private static final int qsl = 2041;
    private final TIntObjectHashMap<enk_0> qsm = new TIntObjectHashMap();
    private boolean bXs;

    private eHA() {
    }

    void aPg() {
        if (this.bXs) {
            return;
        }
        fqU fqU2 = fqX.gjM().Zr(2041);
        for (enk_0 enk_02 : fqU2) {
            this.qsm.put(enk_02.aZH(), (Object)enk_02);
        }
        this.bXs = true;
    }

    public enk_0 Pv(int n) {
        if (!this.bXs) {
            this.aPg();
        }
        return (enk_0)this.qsm.get(n);
    }
}

