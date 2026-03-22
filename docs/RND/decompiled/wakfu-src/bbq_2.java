/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.map.hash.TLongObjectHashMap;

/*
 * Renamed from bbQ
 */
public class bbq_2 {
    private static final bbq_2 hBE = new bbq_2();
    private final TLongObjectHashMap<bbp_2> hBF = new TLongObjectHashMap();

    public static bbq_2 dao() {
        return hBE;
    }

    private bbq_2() {
    }

    public void a(long l, bbp_2 bbp_22) {
        this.hBF.put(l, (Object)bbp_22);
    }

    public bbp_2 jb(long l) {
        return (bbp_2)this.hBF.get(l);
    }

    public void jc(long l) {
        this.hBF.remove(l);
    }

    public void removeAll() {
        this.hBF.clear();
    }
}

