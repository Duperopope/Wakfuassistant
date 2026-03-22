/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.set.hash.TIntHashSet;

public class fny {
    public static final int sJt = 3700;
    public static final int sJu = 408;
    public static final int sJv = 467;
    private static final int[] sJw = new int[]{480, 479, 478, 467};
    private static final int[] sJx = new int[]{510, 509, 508, 507};
    private static final int[] sJy = new int[]{840, 839, 838, 837};
    private static final int[] sJz = new int[]{836, 835, 834, 833};
    private static final TIntHashSet sJA = new TIntHashSet();
    private static int epQ = Integer.MAX_VALUE;

    public static boolean gh(int n, int n2) {
        if (epQ != n) {
            epQ = n;
            sJA.clear();
            fny.gez();
        }
        return !sJA.contains(n2);
    }

    private static void gez() {
        if (epQ != 30) {
            sJA.addAll(sJw);
        }
        if (epQ != 31) {
            sJA.addAll(sJx);
        }
        if (epQ != 32) {
            sJA.addAll(sJy);
        }
        if (epQ != 33) {
            sJA.addAll(sJz);
        }
    }
}

