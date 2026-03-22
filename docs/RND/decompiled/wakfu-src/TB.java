/*
 * Decompiled with CFR 0.152.
 */
public final class TB
extends Enum<TB> {
    public static final /* enum */ TB btu = new TB();
    public static final /* enum */ TB btv = new TB();
    public static final /* enum */ TB btw = new TB();
    private static final /* synthetic */ TB[] btx;

    public static TB[] values() {
        return (TB[])btx.clone();
    }

    public static TB valueOf(String string) {
        return Enum.valueOf(TB.class, string);
    }

    private static /* synthetic */ TB[] bhX() {
        return new TB[]{btu, btv, btw};
    }

    static {
        btx = TB.bhX();
    }
}

