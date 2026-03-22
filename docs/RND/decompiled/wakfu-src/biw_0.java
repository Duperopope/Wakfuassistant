/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.map.hash.TLongObjectHashMap;

/*
 * Renamed from biw
 */
public class biw_0 {
    public static final biw_0 ikN = new biw_0();
    private final TLongObjectHashMap<biv_0> ikO = new TLongObjectHashMap();

    private biw_0() {
    }

    public biv_0 jL(long l) {
        return (biv_0)this.ikO.get(l);
    }

    public void p(bhJ bhJ2) {
        if (this.ikO.contains(bhJ2.Sn())) {
            return;
        }
        biv_0 biv_02 = new biv_0(bhJ2);
        this.ikO.put(bhJ2.Sn(), (Object)biv_02);
        bhJ2.a(biv_02);
    }

    public void b(azd_2 azd_22) {
        this.ikO.remove(azd_22.Sn());
    }

    public void clear() {
        this.ikO.clear();
    }

    public String toString() {
        return "EcaflipFightListenerManager{}";
    }
}

