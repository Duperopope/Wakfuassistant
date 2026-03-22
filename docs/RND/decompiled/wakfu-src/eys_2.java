/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from eYS
 */
public final class eys_2 {
    public static final eys_2 rLD = new eys_2();
    private static final int rLE = 1903;
    private final TIntObjectHashMap<enk_0> rLF = new TIntObjectHashMap();
    private boolean bXs;

    private eys_2() {
    }

    void aPg() {
        if (this.bXs) {
            return;
        }
        fqU fqU2 = fqX.gjM().Zr(1903);
        for (enk_0 enk_02 : fqU2) {
            this.rLF.put(enk_02.aZH(), (Object)enk_02);
        }
        this.bXs = true;
    }

    public enk_0 Pv(int n) {
        if (!this.bXs) {
            this.aPg();
        }
        return (enk_0)this.rLF.get(n);
    }
}

