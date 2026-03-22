/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableTable
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableTable;

/*
 * Renamed from exw
 */
public class exw_0 {
    private static final short oZe = 1;
    private static final short oZf = 2;
    private static final short oZg = 4;
    private static final short oZh = 8;
    private static final short oZi = 16;
    private static final short oZj = 32;
    private static final short oZk = 64;
    private static final short oZl = 128;
    public static final short oZm = 0;
    public static final short oZn = 2;
    public static final short oZo = 4;
    public static final short oZp = 12;
    public static final short oZq = 13;
    public static final short oZr = 125;
    public static final short oZs = 127;
    public static final short oZt = 189;
    public static final short oZu = 32;
    public static final ImmutableMap<Short, Integer> oZv = ImmutableMap.of((Object)13, (Object)0x99F9F8);
    public static final ImmutableTable<Short, Short, Integer> oZw = ImmutableTable.builder().build();

    public static boolean df(short s) {
        return exw_0.T(s, (short)1);
    }

    public static boolean dg(short s) {
        return exw_0.T(s, (short)2);
    }

    public static boolean dh(short s) {
        return exw_0.T(s, (short)16);
    }

    public static boolean di(short s) {
        return exw_0.T(s, (short)4);
    }

    public static boolean dj(short s) {
        return exw_0.T(s, (short)8);
    }

    public static boolean dk(short s) {
        return exw_0.T(s, (short)32);
    }

    public static boolean dl(short s) {
        return exw_0.T(s, (short)128);
    }

    private static boolean T(short s, short s2) {
        return (s & s2) == s2;
    }
}

