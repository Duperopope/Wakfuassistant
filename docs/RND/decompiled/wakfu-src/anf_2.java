/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from anf
 */
public abstract class anf_2
extends amu_1 {
    public static final int cJS = 18;
    public static final int cJT = 10;
    private static final long cJU = 262143L;
    private static final long cJV = 1023L;
    private static final long cJW = 131071L;
    private static final long cJX = 511L;

    public static long L(int n, int n2, short s) {
        long l = (long)n + 131071L & 0x3FFFFL;
        long l2 = (long)n2 + 131071L & 0x3FFFFL;
        long l3 = (long)s + 511L & 0x3FFL;
        if (Math.abs(n) <= 131072 - (n < 0 ? 1 : 0) && Math.abs(n2) <= 131072 - (n2 < 0 ? 1 : 0) && Math.abs(s) <= 512 - (s < 0 ? 1 : 0)) {
            return l << 28 | l2 << 10 | l3;
        }
        throw new amf_2("Param\u00e8tres d'une position en dehors de la map - position : " + n + ", " + n2 + ", " + s);
    }

    public static long s(acd_1 acd_12) {
        return anf_2.L(acd_12.getX(), acd_12.getY(), acd_12.bdi());
    }

    public static acd_1 gn(long l) {
        short s = (short)((l & 0x3FFL) - 511L);
        int n = (int)((l >> 10 & 0x3FFFFL) - 131071L);
        int n2 = (int)((l >> 28 & 0x3FFFFL) - 131071L);
        return new acd_1(n2, n, s);
    }

    public static int go(long l) {
        return (int)((l >> 28 & 0x3FFFFL) - 131071L);
    }

    public static int gp(long l) {
        return (int)((l >> 10 & 0x3FFFFL) - 131071L);
    }

    public static short gq(long l) {
        return (short)((l & 0x3FFL) - 511L);
    }

    @Override
    public amz_1 bDv() {
        return amz_1.cJC;
    }

    @Override
    public abstract boolean bDp();

    @Override
    public void bDx() {
    }

    @Override
    public boolean bDo() {
        return false;
    }
}

