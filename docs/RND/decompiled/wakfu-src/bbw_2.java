/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.map.hash.TLongObjectHashMap;

/*
 * Renamed from bbW
 */
public class bbw_2 {
    public static final bbw_2 hCq = new bbw_2();
    private final TLongObjectHashMap<bcd_2> hCr = new TLongObjectHashMap();

    private bbw_2() {
    }

    public void a(long l, bcd_2 bcd_22) {
        this.hCr.put(l, (Object)bcd_22);
    }

    public void jd(long l) {
        this.hCr.remove(l);
    }

    public bcd_2 je(long l) {
        return (bcd_2)this.hCr.get(l);
    }
}

