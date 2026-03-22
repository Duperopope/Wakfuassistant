/*
 * Decompiled with CFR 0.152.
 */
public final class euB
extends Enum<euB> {
    public static final /* enum */ euB orc = new euB();
    public static final /* enum */ euB ord = new euB();
    public static final /* enum */ euB ore = new euB();
    public static final /* enum */ euB orf = new euB();
    private static final /* synthetic */ euB[] org;

    public static euB[] values() {
        return (euB[])org.clone();
    }

    public static euB valueOf(String string) {
        return Enum.valueOf(euB.class, string);
    }

    private static /* synthetic */ euB[] fdf() {
        return new euB[]{orc, ord, ore, orf};
    }

    static {
        org = euB.fdf();
    }
}

