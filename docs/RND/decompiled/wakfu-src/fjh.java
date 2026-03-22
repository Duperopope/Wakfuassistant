/*
 * Decompiled with CFR 0.152.
 */
public final class fjh
extends Enum<fjh> {
    public static final /* enum */ fjh sxt = new fjh(0, 86400000L);
    public static final /* enum */ fjh sxu = new fjh(1, 604800000L);
    public static final /* enum */ fjh sxv = new fjh(2, 2592000000L);
    public static final /* enum */ fjh sxw = new fjh(3, 15552000000L);
    public static final /* enum */ fjh sxx = new fjh(4, 31104000000L);
    private static final fjh[] sxy;
    public static final byte sxz = -1;
    private final byte sxA;
    private final long sxB;
    private static final /* synthetic */ fjh[] sxC;

    public static fjh[] values() {
        return (fjh[])sxC.clone();
    }

    public static fjh valueOf(String string) {
        return Enum.valueOf(fjh.class, string);
    }

    private fjh(byte by, long l) {
        this.sxA = by;
        this.sxB = l;
    }

    public byte aJr() {
        return this.sxA;
    }

    public long gaO() {
        return this.sxB;
    }

    public static fjh gO(byte by) {
        return sxy[by];
    }

    private static /* synthetic */ fjh[] gaP() {
        return new fjh[]{sxt, sxu, sxv, sxw, sxx};
    }

    static {
        sxC = fjh.gaP();
        sxy = fjh.values();
    }
}

