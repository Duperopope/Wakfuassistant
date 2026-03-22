/*
 * Decompiled with CFR 0.152.
 */
public final class fjb
extends Enum<fjb> {
    public static final /* enum */ fjb swm = new fjb(0);
    public static final /* enum */ fjb swn = new fjb(1);
    public static final /* enum */ fjb swo = new fjb(2);
    public static final /* enum */ fjb swp = new fjb(3);
    private static final fjb[] swq;
    private final byte swr;
    private static final /* synthetic */ fjb[] sws;

    public static fjb[] values() {
        return (fjb[])sws.clone();
    }

    public static fjb valueOf(String string) {
        return Enum.valueOf(fjb.class, string);
    }

    private fjb(byte by) {
        this.swr = by;
    }

    public byte aJr() {
        return this.swr;
    }

    public static fjb Ws(int n) {
        return swq[n];
    }

    private static /* synthetic */ fjb[] gaF() {
        return new fjb[]{swm, swn, swo, swp};
    }

    static {
        sws = fjb.gaF();
        swq = fjb.values();
    }
}

