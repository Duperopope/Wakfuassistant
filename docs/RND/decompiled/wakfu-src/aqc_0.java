/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from aQc
 */
public abstract class aqc_0 {
    private final TIntObjectHashMap<aqb_0> eBv = new TIntObjectHashMap();

    protected aqc_0() {
    }

    public void a(int n, aqb_0 aqb_02) {
        this.eBv.put(n, (Object)aqb_02);
    }

    public void a(int n, apz_0 apz_02) {
        aqb_0 aqb_02 = (aqb_0)this.eBv.get(n);
        if (aqb_02 != null) {
            aqb_02.b(apz_02);
        }
    }

    public void a(int n, Iterable<apz_0> iterable) {
        aqb_0 aqb_02 = (aqb_0)this.eBv.get(n);
        if (aqb_02 != null) {
            aqb_02.aK(iterable);
        }
    }

    public boolean b(int n, apz_0 apz_02) {
        if (apz_02 != null) {
            return this.c(n, apz_02.getName());
        }
        return false;
    }

    public boolean c(int n, String string) {
        aqb_0 aqb_02 = (aqb_0)this.eBv.get(n);
        return aqb_02 != null && aqb_02.jw(string);
    }

    public aqb_0 zl(int n) {
        return (aqb_0)this.eBv.get(n);
    }
}

