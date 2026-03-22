/*
 * Decompiled with CFR 0.152.
 */
public final class afX
extends Enum<afX> {
    public static final /* enum */ afX csh = new afX();
    public static final /* enum */ afX csi = new afX();
    public static final /* enum */ afX csj = new afX();
    public static final /* enum */ afX csk = new afX();
    public static final /* enum */ afX csl = new afX();
    public static final /* enum */ afX csm = new afX();
    public static final /* enum */ afX csn = new afX();
    public static final /* enum */ afX cso = new afX();
    public static final /* enum */ afX csp = new afX();
    public static final /* enum */ afX csq = new afX();
    public static final /* enum */ afX csr = new afX();
    public static final /* enum */ afX css = new afX();
    public static final /* enum */ afX cst = new afX();
    private final byte csu = (byte)this.ordinal();
    public static final int csv;
    public static final int csw = 15;
    public static final int csx = Short.MAX_VALUE;
    public static final int csy = 32766;
    private static final int csz = 5;
    private static final int csA = 13;
    private static final long csB = 8191L;
    private static final int csC = 6;
    private static final int csD = 14;
    private static final long csE = 16383L;
    private static final long csF = 8192L;
    private static final int csG = 19;
    private static final int csH = 34;
    private static final /* synthetic */ afX[] csI;

    public static afX[] values() {
        return (afX[])csI.clone();
    }

    public static afX valueOf(String string) {
        return Enum.valueOf(afX.class, string);
    }

    public final byte byy() {
        return this.csu;
    }

    public static int sh(int n) {
        return n;
    }

    public static boolean fU(long l) {
        long l2 = 0x1000000000000L;
        return l >= 0L && l < 0x1000000000000L;
    }

    public static long a(long l, long l2, int n, int n2) {
        assert (Math.abs(l) < 16383L);
        assert (Math.abs(l2) < 16383L);
        assert (n >= 0 && (long)n < 8191L);
        assert (n2 >= 0 && n2 < 31);
        return (l2 + 8192L & 0x3FFFL) << 34 | (l + 8192L & 0x3FFFL) << 19 | ((long)n & 0x1FFFL) << 6 | (long)n2;
    }

    private static /* synthetic */ afX[] byz() {
        return new afX[]{csh, csi, csj, csk, csl, csm, csn, cso, csp, csq, csr, css, cst};
    }

    static {
        csI = afX.byz();
        csv = afX.values().length;
        assert (csv < 8191);
    }
}

