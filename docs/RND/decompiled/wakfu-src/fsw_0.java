/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from fsw
 */
public abstract class fsw_0<P extends fsu> {
    private static final Logger tdD = Logger.getLogger(fsw_0.class);
    private final TIntObjectHashMap<P> tdE = new TIntObjectHashMap();

    public void dJ(String string) {
        apl_1 apl_12 = apl_1.dw(fo_0.by(string));
        int n = apl_12.aIA();
        for (int i = 0; i < n; ++i) {
            int n2 = apl_12.aIA();
            P p2 = this.JV(n2);
            ((fsu)p2).r(apl_12);
            this.tdE.put(n2, p2);
        }
    }

    protected abstract P JV(int var1);

    public P Kh(int n) {
        return (P)((fsu)this.tdE.get(n));
    }
}

