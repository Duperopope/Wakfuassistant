/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntIntHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from blr
 */
public class blr_0 {
    private static final Logger iuv = Logger.getLogger(blr_0.class);
    public static final blr_0 iuw = new blr_0();
    private final TIntIntHashMap iux = new TIntIntHashMap();

    public void DE(int n) {
        Object r = fgD.fXh().Vd(n);
        if (!(((fhc_0)r).fUZ() instanceof bfl_1)) {
            iuv.warn((Object)("Trying to had an items with the bad ItemAction " + n));
            return;
        }
        bfl_1 bfl_12 = (bfl_1)((fhc_0)r).fUZ();
        if (this.iux.contains(bfl_12.dTm())) {
            throw new IllegalArgumentException("We have two items who give the same companion : " + n);
        }
        this.iux.put(n, bfl_12.dTm());
    }

    public int DF(int n) {
        return this.iux.get(n);
    }
}

