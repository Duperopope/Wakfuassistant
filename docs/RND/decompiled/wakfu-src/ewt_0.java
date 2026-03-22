/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ewT
 */
public abstract class ewt_0 {
    public static final short oRX = 0;
    public static final int oRY = 3;
    private static final VK oRZ = new VK(18, 18, 0);
    private static final VK oSa = new VK(9, 9, 0);

    public static VK ffg() {
        return oRZ;
    }

    public static VK ffh() {
        return oSa;
    }

    public static int fe(int n, int n2) {
        return (n /= 3) + 6 * (n2 /= 3);
    }

    private ewt_0() {
    }
}

