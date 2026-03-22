/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from euT
 */
public class eut_1 {
    public static final eut_1 osb = new eut_1();
    private final TLongObjectHashMap<evd_2> osc = new TLongObjectHashMap();

    public evd_2 oV(long l) {
        return (evd_2)this.osc.putIfAbsent(l, (Object)new evd_2());
    }

    public evd_2 a(long l, evd_2 evd_22) {
        return (evd_2)this.osc.putIfAbsent(l, (Object)evd_22);
    }

    public evd_2 oW(long l) {
        evd_2 evd_22 = (evd_2)this.osc.remove(l);
        if (evd_22 == null) {
            return null;
        }
        evd_22.clear();
        return evd_22;
    }

    public boolean oX(long l) {
        return this.osc.containsKey(l);
    }

    @NotNull
    public evd_2 oY(long l) {
        evd_2 evd_22 = (evd_2)this.osc.get(l);
        if (evd_22 == null) {
            throw new IllegalStateException("Les informations d'account doivent \u00eatre cr\u00e9\u00e9es avant d'en demander l'acc\u00e8s");
        }
        return evd_22;
    }
}

