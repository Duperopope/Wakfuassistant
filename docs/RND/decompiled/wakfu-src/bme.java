/*
 * Decompiled with CFR 0.152.
 */
public final class bme
extends Enum<bme> {
    public static final /* enum */ bme iyG = new bme();
    public static final /* enum */ bme iyH = new bme();
    public static final /* enum */ bme iyI = new bme();
    private static final /* synthetic */ bme[] iyJ;

    public static bme[] values() {
        return (bme[])iyJ.clone();
    }

    public static bme valueOf(String string) {
        return Enum.valueOf(bme.class, string);
    }

    private static /* synthetic */ bme[] dvn() {
        return new bme[]{iyG, iyH, iyI};
    }

    static {
        iyJ = bme.dvn();
    }
}

