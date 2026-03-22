/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from Qg
 */
public abstract class qg_0<FX extends Qj> {
    private final TIntObjectHashMap<FX> bfj = new TIntObjectHashMap();

    protected qg_0() {
    }

    public void a(FX FX) {
        this.bfj.put(FX.aZH(), FX);
    }

    public FX oy(int n) {
        return (FX)((Qj)this.bfj.get(n));
    }
}

