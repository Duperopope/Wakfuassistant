/*
 * Decompiled with CFR 0.152.
 */
public final class exk
extends Enum<exk> {
    public static final /* enum */ exk oWx = new exk();
    public static final /* enum */ exk oWy = new exk();
    public static final /* enum */ exk oWz = new exk();
    private static final /* synthetic */ exk[] oWA;

    public static exk[] values() {
        return (exk[])oWA.clone();
    }

    public static exk valueOf(String string) {
        return Enum.valueOf(exk.class, string);
    }

    private static /* synthetic */ exk[] ffq() {
        return new exk[]{oWx, oWy, oWz};
    }

    static {
        oWA = exk.ffq();
    }
}

