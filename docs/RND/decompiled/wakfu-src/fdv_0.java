/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fdV
 */
public final class fdv_0
extends Enum<fdv_0> {
    public static final /* enum */ fdv_0 rYT = new fdv_0(0);
    public static final /* enum */ fdv_0 rYU = new fdv_0(1);
    public static final /* enum */ fdv_0 rYV = new fdv_0(2);
    public static final /* enum */ fdv_0 rYW = new fdv_0(3);
    public static final /* enum */ fdv_0 rYX = new fdv_0(4);
    public static final /* enum */ fdv_0 rYY = new fdv_0(5);
    public static final /* enum */ fdv_0 rYZ = new fdv_0(6);
    public static final /* enum */ fdv_0 rZa = new fdv_0(7);
    public static final /* enum */ fdv_0 rZb = new fdv_0(8);
    public static final /* enum */ fdv_0 rZc = new fdv_0(9);
    public static final /* enum */ fdv_0 rZd = new fdv_0(10);
    public static final /* enum */ fdv_0 rZe = new fdv_0(11);
    public static final /* enum */ fdv_0 rZf = new fdv_0(12);
    public static final /* enum */ fdv_0 rZg = new fdv_0(14);
    public static final /* enum */ fdv_0 rZh = new fdv_0(15);
    public static final /* enum */ fdv_0 rZi = new fdv_0(16);
    public static final /* enum */ fdv_0 rZj = new fdv_0(17);
    public static final /* enum */ fdv_0 rZk = new fdv_0(18);
    public static final /* enum */ fdv_0 rZl = new fdv_0(19);
    public static final /* enum */ fdv_0 rZm = new fdv_0(20);
    public static final /* enum */ fdv_0 rZn = new fdv_0(21);
    public static final /* enum */ fdv_0 rZo = new fdv_0(22);
    public static final /* enum */ fdv_0 rZp = new fdv_0(23);
    public static final /* enum */ fdv_0 rZq = new fdv_0(24);
    public static final /* enum */ fdv_0 rZr = new fdv_0(26);
    public static final /* enum */ fdv_0 rZs = new fdv_0(27);
    public static final /* enum */ fdv_0 rZt = new fdv_0(28);
    public static final /* enum */ fdv_0 rZu = new fdv_0(29);
    public static final /* enum */ fdv_0 rZv = new fdv_0(30);
    public static final /* enum */ fdv_0 rZw = new fdv_0(31);
    private final byte rZx;
    private static final /* synthetic */ fdv_0[] rZy;

    public static fdv_0[] values() {
        return (fdv_0[])rZy.clone();
    }

    public static fdv_0 valueOf(String string) {
        return Enum.valueOf(fdv_0.class, string);
    }

    private fdv_0(byte by) {
        this.rZx = by;
    }

    public byte aJr() {
        return this.rZx;
    }

    public static fdv_0 gc(byte by) {
        for (fdv_0 fdv_02 : fdv_0.values()) {
            if (fdv_02.rZx != by) continue;
            return fdv_02;
        }
        return null;
    }

    private static /* synthetic */ fdv_0[] fUl() {
        return new fdv_0[]{rYT, rYU, rYV, rYW, rYX, rYY, rYZ, rZa, rZb, rZc, rZd, rZe, rZf, rZg, rZh, rZi, rZj, rZk, rZl, rZm, rZn, rZo, rZp, rZq, rZr, rZs, rZt, rZu, rZv, rZw};
    }

    static {
        rZy = fdv_0.fUl();
    }
}

