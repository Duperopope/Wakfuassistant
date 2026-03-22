/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from eUp
 */
public abstract class eup_0<F extends ety_0> {
    protected static final Logger ruu = Logger.getLogger(eup_0.class);
    protected final TIntObjectHashMap<F> ruv = new TIntObjectHashMap();

    public void b(F f2) {
        this.ruv.put(((ety_0)f2).d(), f2);
    }

    public void c(F f2) {
        this.ruv.remove(((ety_0)f2).d());
    }

    public F Sx(int n) {
        return (F)((ety_0)this.ruv.get(n));
    }
}

