/*
 * Decompiled with CFR 0.152.
 */
final class aha
extends Enum<aha> {
    public static final /* enum */ aha cvw = new aha();
    public static final /* enum */ aha cvx = new aha();
    public static final /* enum */ aha cvy = new aha();
    private static final /* synthetic */ aha[] cvz;

    public static aha[] values() {
        return (aha[])cvz.clone();
    }

    public static aha valueOf(String string) {
        return Enum.valueOf(aha.class, string);
    }

    private static /* synthetic */ aha[] bzD() {
        return new aha[]{cvw, cvx, cvy};
    }

    static {
        cvz = aha.bzD();
    }
}

