/*
 * Decompiled with CFR 0.152.
 */
public final class Sv
extends Enum<Sv> {
    public static final /* enum */ Sv boD = new Sv();
    public static final /* enum */ Sv boE = new Sv();
    public static final /* enum */ Sv boF = new Sv();
    public static final /* enum */ Sv boG = new Sv();
    public static final /* enum */ Sv boH = new Sv();
    private static final /* synthetic */ Sv[] boI;

    public static Sv[] values() {
        return (Sv[])boI.clone();
    }

    public static Sv valueOf(String string) {
        return Enum.valueOf(Sv.class, string);
    }

    private static /* synthetic */ Sv[] bfL() {
        return new Sv[]{boD, boE, boF, boG, boH};
    }

    static {
        boI = Sv.bfL();
    }
}

