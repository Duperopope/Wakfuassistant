/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.set.hash.TIntHashSet;

/*
 * Renamed from bjy
 */
public class bjy_1 {
    private static final bjy_1 ioy = new bjy_1();
    private final TIntObjectHashMap<bjx_1> ioz = new TIntObjectHashMap();
    private final TIntObjectHashMap<TIntHashSet> ioA = new TIntObjectHashMap();

    private bjy_1() {
        this.ioz.put(111111, (Object)new bjx_1(111111, -1, 111111, false));
        this.ioz.put(111112, (Object)new bjx_1(111112, -1, 111112, false));
    }

    public static bjy_1 drw() {
        return ioy;
    }

    public bjx_1 Dl(int n) {
        return (bjx_1)this.ioz.get(n);
    }

    public void a(int n, bjx_1 bjx_12) {
        if (!this.ioA.contains(n)) {
            this.ioA.put(n, (Object)new TIntHashSet());
        }
        this.ioz.put(bjx_12.d(), (Object)bjx_12);
        ((TIntHashSet)this.ioA.get(n)).add(bjx_12.aeV());
    }

    public boolean dr(int n, int n2) {
        if (!this.ioA.contains(n)) {
            return false;
        }
        return ((TIntHashSet)this.ioA.get(n)).contains(n2);
    }
}

