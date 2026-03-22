/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from bjD
 */
public class bjd_2 {
    private static final bjd_2 ipb = new bjd_2();
    private final TIntObjectHashMap<bjc_2> ipc = new TIntObjectHashMap();

    private bjd_2() {
    }

    public static bjd_2 drM() {
        return ipb;
    }

    public bjc_2 Dv(int n) {
        return (bjc_2)this.ipc.get(n);
    }

    public void a(bjc_2 bjc_22) {
        this.ipc.put(bjc_22.d(), (Object)bjc_22);
    }
}

