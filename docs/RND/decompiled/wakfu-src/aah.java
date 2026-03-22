/*
 * Decompiled with CFR 0.152.
 */
final class aah
extends Enum<aah> {
    public static final /* enum */ aah bXQ = new aah();
    public static final /* enum */ aah bXR = new aah();
    public static final /* enum */ aah bXS = new aah();
    private static final /* synthetic */ aah[] bXT;

    public static aah[] values() {
        return (aah[])bXT.clone();
    }

    public static aah valueOf(String string) {
        return Enum.valueOf(aah.class, string);
    }

    private static /* synthetic */ aah[] bqI() {
        return new aah[]{bXQ, bXR, bXS};
    }

    static {
        bXT = aah.bqI();
    }
}

