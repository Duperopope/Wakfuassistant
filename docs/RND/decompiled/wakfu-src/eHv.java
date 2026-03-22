/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TLongHashSet
 */
import gnu.trove.set.hash.TLongHashSet;

public class eHv {
    public static final int qrX = 53;
    private static final TLongHashSet qrY = new TLongHashSet();

    private eHv() {
    }

    public static boolean pz(long l) {
        return !qrY.contains(l);
    }

    static {
        qrY.add(450L);
    }
}

