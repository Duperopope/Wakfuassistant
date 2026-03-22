/*
 * Decompiled with CFR 0.152.
 */
public final class Sy
extends Enum<Sy> {
    public static final /* enum */ Sy boO = new Sy();
    public static final /* enum */ Sy boP = new Sy();
    public static final /* enum */ Sy boQ = new Sy();
    public static final /* enum */ Sy boR = new Sy();
    public static final /* enum */ Sy boS = new Sy();
    private static final /* synthetic */ Sy[] boT;

    public static Sy[] values() {
        return (Sy[])boT.clone();
    }

    public static Sy valueOf(String string) {
        return Enum.valueOf(Sy.class, string);
    }

    private static /* synthetic */ Sy[] bfR() {
        return new Sy[]{boO, boP, boQ, boR, boS};
    }

    static {
        boT = Sy.bfR();
    }
}

