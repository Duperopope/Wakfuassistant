/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TIntShortHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TIntShortHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from ffN
 */
public class ffn_0 {
    private static final Logger sgn = Logger.getLogger(ffn_0.class);
    public static final ffn_0 sgo = new ffn_0();
    private final TIntObjectHashMap<int[]> sgp = new TIntObjectHashMap();
    private final TIntShortHashMap sgq = new TIntShortHashMap();

    private ffn_0() {
    }

    public void b(int n, int[] nArray, short s) {
        int[] nArray2 = nArray == null || nArray.length == 0 ? null : nArray;
        this.sgp.put(n, (Object)nArray2);
        this.sgq.put(n, s);
    }

    public int[] UU(int n) {
        return (int[])this.sgp.get(n);
    }

    public boolean UV(int n) {
        return this.UU(n) != null;
    }

    public short UW(int n) {
        return this.sgq.get(n);
    }
}

