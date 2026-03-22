/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.map.hash.TLongObjectHashMap;

/*
 * Renamed from bwa
 */
public class bwa_0 {
    private final TLongObjectHashMap<bgl_0> jwh = new TLongObjectHashMap();
    public static final bwa_0 jwi = new bwa_0();

    public bgl_0 a(blh_1 blh_12) {
        if (blh_12 == null) {
            return null;
        }
        long l = blh_12.Sn();
        bgl_0 bgl_02 = (bgl_0)this.jwh.get(l);
        if (bgl_02 == null) {
            bgl_02 = new bgl_0((bgy)fcL.rUh.sw(l), blh_12);
        }
        return bgl_02;
    }

    public bgl_0 aj(bhJ bhJ2) {
        if (bhJ2 == null) {
            return null;
        }
        long l = bhJ2.Sn();
        bgl_0 bgl_02 = (bgl_0)this.jwh.get(l);
        if (bgl_02 == null) {
            bgl_02 = new bgl_0((bgy)fcL.rUh.sw(l), new blh_1(bhJ2));
        }
        return bgl_02;
    }

    public TLongObjectHashMap<bgl_0> dLn() {
        return this.jwh;
    }
}

