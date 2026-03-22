/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteLongHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TByteLongHashMap;
import org.apache.log4j.Logger;

public class Ve {
    protected static final Logger bxG = Logger.getLogger(Ve.class);
    private static final long bxH = 0xFFFFFFFFFFFFFFL;
    private static final TByteLongHashMap bxI = new TByteLongHashMap();

    public static long ag(byte by) {
        long l = bxI.adjustOrPutValue(by, 1L, 1L);
        return Ve.d(by, l);
    }

    public void b(byte by, long l) {
        bxI.put(by, l);
    }

    public static byte fs(long l) {
        return (byte)(l >> 56);
    }

    public static long ft(long l) {
        return l & 0xFFFFFFFFFFFFFFL;
    }

    public static void c(byte by, long l) {
        bxI.put(by, l);
    }

    public static long d(byte by, long l) {
        if (l > 0xFFFFFFFFFFFFFFL) {
            bxG.fatal((Object)"[GROUP ID] D\u00e9passement de capacit\u00e9 pour les ID de groupe");
            return 0L;
        }
        long l2 = l & 0xFFFFFFFFFFFFFFL;
        long l3 = (long)by & 0xFFL;
        return l3 << 56 | l2;
    }
}

