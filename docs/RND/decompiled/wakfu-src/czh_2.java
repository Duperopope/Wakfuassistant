/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TShortObjectHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from cZh
 */
public class czh_2
implements adi_1 {
    private static final boolean oan = false;
    private static final Logger oao = Logger.getLogger(czh_2.class);
    private static final czh_2 oap = new czh_2();
    private final TShortObjectHashMap<czz_2> oaq = new TShortObjectHashMap();

    public czh_2() {
        this.oaq.put((short)19437, (Object)new czx_2());
        this.oaq.put((short)17589, (Object)new czy_2());
    }

    public static czh_2 eYT() {
        return oap;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        czz_2 czz_22 = (czz_2)this.oaq.get((short)aam_22.d());
        return czz_22 == null || czz_22.b(aam_22);
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

