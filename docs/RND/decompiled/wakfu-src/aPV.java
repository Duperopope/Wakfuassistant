/*
 * Decompiled with CFR 0.152.
 */
public final class aPV {
    private aPV() {
    }

    public static String in(long l) {
        long l2 = aue_0.cVJ().cVO().xl();
        if (l < l2) {
            return String.format("DM_%d_%d", l, l2);
        }
        return String.format("DM_%d_%d", l2, l);
    }
}

