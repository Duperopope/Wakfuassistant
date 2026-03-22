/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 */
import gnu.trove.map.hash.TIntIntHashMap;

public class exd {
    private static final TIntIntHashMap oTV = new TIntIntHashMap();

    public static int fg(int n, int n2) {
        int n3 = oTV.get(n);
        return n3 == 0 ? n2 : n3;
    }

    static {
        oTV.put(-11, 67);
    }
}

