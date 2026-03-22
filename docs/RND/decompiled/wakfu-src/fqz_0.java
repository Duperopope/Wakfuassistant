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
 * Renamed from fqz
 */
public class fqz_0 {
    protected static final Logger sTL = Logger.getLogger(fqz_0.class);
    private static final fqz_0 sTM = new fqz_0();
    private final TIntObjectHashMap<fqy_0> sTN = new TIntObjectHashMap();

    public static fqz_0 giz() {
        return sTM;
    }

    public void e(fqy_0 fqy_02) {
        this.sTN.put(fqy_02.clf(), (Object)fqy_02);
    }

    public fqy_0 YY(int n) {
        return (fqy_0)this.sTN.get(n);
    }

    public boolean aJG() {
        return this.sTN.isEmpty();
    }
}

