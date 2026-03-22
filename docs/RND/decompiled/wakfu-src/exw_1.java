/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from eXW
 */
public class exw_1 {
    private static final exw_1 rJh = new exw_1();
    private final TIntObjectHashMap<exx_1> rJi = new TIntObjectHashMap();

    public static exw_1 fPh() {
        return rJh;
    }

    private exw_1() {
    }

    public void a(exx_1 exx_12) {
        this.rJi.put(exx_12.d(), (Object)exx_12);
    }

    public exx_1 Ti(int n) {
        return (exx_1)this.rJi.get(n);
    }
}

