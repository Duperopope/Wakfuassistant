/*
 * Decompiled with CFR 0.152.
 */
public final class TC
extends Enum<TC> {
    public static final /* enum */ TC bty = new TC();
    public static final /* enum */ TC btz = new TC();
    public static final /* enum */ TC btA = new TC();
    private static final /* synthetic */ TC[] btB;

    public static TC[] values() {
        return (TC[])btB.clone();
    }

    public static TC valueOf(String string) {
        return Enum.valueOf(TC.class, string);
    }

    private static /* synthetic */ TC[] bhY() {
        return new TC[]{bty, btz, btA};
    }

    static {
        btB = TC.bhY();
    }
}

