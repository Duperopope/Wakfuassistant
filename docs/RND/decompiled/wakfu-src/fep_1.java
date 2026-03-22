/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fEp
 */
final class fep_1
extends Enum<fep_1> {
    public static final /* enum */ fep_1 ujT = new fep_1(0.25f);
    public static final /* enum */ fep_1 ujU = new fep_1(1.0f);
    private final float ujV;
    private static final /* synthetic */ fep_1[] ujW;

    public static fep_1[] values() {
        return (fep_1[])ujW.clone();
    }

    public static fep_1 valueOf(String string) {
        return Enum.valueOf(fep_1.class, string);
    }

    private fep_1(float f2) {
        this.ujV = f2;
    }

    public float getZoomScale() {
        return this.ujV;
    }

    private static /* synthetic */ fep_1[] gvn() {
        return new fep_1[]{ujT, ujU};
    }

    static {
        ujW = fep_1.gvn();
    }
}

