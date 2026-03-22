/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import org.apache.log4j.Logger;

public class ftR {
    protected static final Logger tgO = Logger.getLogger(ftR.class);
    private static final ftR tgP = new ftR();
    private final TIntObjectHashMap<ftP> tgQ = new TIntObjectHashMap();

    public static ftR gmM() {
        return tgP;
    }

    private ftR() {
    }

    public ftP aao(int n) {
        ftP ftP2 = (ftP)this.tgQ.get(n);
        if (ftP2 != null) {
            return ftP2;
        }
        return null;
    }
}

