/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.commons.lang3.ArrayUtils
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.set.hash.TIntHashSet;
import org.apache.commons.lang3.ArrayUtils;

/*
 * Renamed from exb
 */
public class exb_0 {
    public static final int oST = -4;
    public static final int oSU = -10;
    public static final int oSV = 8;
    public static final int oSW = 11;
    public static final acd_1 oSX = new acd_1(93, -41, 8);
    public static final short oSY = 527;
    public static final byte oSZ = 3;
    public static final int oTa = 56401;
    public static final acd_1 oTb = new acd_1(0, -52, 0);
    public static final short oTc = 159;
    public static final acd_1 oTd = new acd_1(-1, -52, 0);
    public static final int oTe = 19119;
    public static final short oTf = 161;
    public static final int[] oTg = new int[]{0, -33, 0};
    public static final int[] oTh = new int[]{0, -50, 0};
    public static final int oTi = 16530;
    public static final acd_1 oTj = new acd_1(0, -32, 0);
    public static final short[] oTk = new short[]{100, 118, 226, 757, 758, 761};
    public static final int oTl = 50000000;
    private static final int oTm = 12;
    private static final int oTn = 13;
    private static final int oTo = 14;
    private static final int oTp = 15;
    public static final int oTq = 20;
    public static final TIntHashSet oTr = new TIntHashSet(new int[]{11, 21, 14, 28});
    private static final TIntObjectHashMap<int[]> oTs = new TIntObjectHashMap();
    public static final short oTt = 9;
    public static final int oTu = 62601;
    public static final int oTv = -8799;
    public static final long oTw = 375L;
    public static final int oTx = Integer.MAX_VALUE;
    public static final int oTy = -1;
    public static final byte oTz = 0;
    public static final byte oTA = 1;
    public static final byte oTB = 2;
    public static final byte oTC = 3;
    private static final int oTD = 7;
    private static final int oTE = 18;

    public static boolean Ox(int n) {
        return n == 311;
    }

    public static boolean de(short s) {
        return s == 7 || s == 23 || s == 22 || s == 20;
    }

    public static boolean ff(int n, int n2) {
        int[] nArray = (int[])oTs.get(n);
        return ArrayUtils.contains((int[])nArray, (int)n2);
    }

    public static byte b(fby_0 fby_02) {
        if (fby_02.coy()) {
            return 2;
        }
        if (fby_02.fSs() == 7) {
            return 0;
        }
        if (fby_02.fSs() == 18) {
            return 3;
        }
        return 1;
    }

    static {
        oTs.put(12, (Object)new int[]{12});
        oTs.put(13, (Object)new int[]{12, 13});
        oTs.put(14, (Object)new int[]{12, 13, 14});
        oTs.put(15, (Object)new int[]{12, 13, 14, 15});
    }
}

