/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eXQ
 */
public final class exq_1
extends Enum<exq_1> {
    public static final /* enum */ exq_1 rIP = new exq_1();
    public static final /* enum */ exq_1 rIQ = new exq_1();
    private static final /* synthetic */ exq_1[] rIR;

    public static exq_1[] values() {
        return (exq_1[])rIR.clone();
    }

    public static exq_1 valueOf(String string) {
        return Enum.valueOf(exq_1.class, string);
    }

    private static /* synthetic */ exq_1[] fPb() {
        return new exq_1[]{rIP, rIQ};
    }

    static {
        rIR = exq_1.fPb();
    }
}

