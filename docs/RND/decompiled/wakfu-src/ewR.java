/*
 * Decompiled with CFR 0.152.
 */
import java.util.BitSet;

public final class ewR {
    private static final BitSet oRQ = new BitSet();

    private ewR() {
    }

    public static boolean b(BitSet bitSet) {
        return oRQ.intersects(bitSet);
    }

    static {
        oRQ.set(1028);
        oRQ.set(1003);
        oRQ.set(1001);
        oRQ.set(1005);
        oRQ.set(1002);
    }
}

