/*
 * Decompiled with CFR 0.152.
 */
public final class flw
extends Enum<flw> {
    public static final /* enum */ flw sEB = new flw();
    public static final /* enum */ flw sEC = new flw();
    public static final /* enum */ flw sED = new flw();
    public final int sEE = 1 << this.ordinal();
    private static final /* synthetic */ flw[] sEF;

    public static flw[] values() {
        return (flw[])sEF.clone();
    }

    public static flw valueOf(String string) {
        return Enum.valueOf(flw.class, string);
    }

    public static int aO(Iterable<flw> iterable) {
        int n = 0;
        for (flw flw2 : iterable) {
            n |= flw2.sEE;
        }
        return n;
    }

    private static /* synthetic */ flw[] gdi() {
        return new flw[]{sEB, sEC, sED};
    }

    static {
        sEF = flw.gdi();
    }
}

