/*
 * Decompiled with CFR 0.152.
 */
public final class Yc
extends Enum<Yc> {
    public static final /* enum */ Yc bTF = new Yc();
    public static final /* enum */ Yc bTG = new Yc();
    public static final /* enum */ Yc bTH = new Yc();
    public static final /* enum */ Yc bTI = new Yc();
    private static final /* synthetic */ Yc[] bTJ;

    public static Yc[] values() {
        return (Yc[])bTJ.clone();
    }

    public static Yc valueOf(String string) {
        return Enum.valueOf(Yc.class, string);
    }

    private static /* synthetic */ Yc[] bon() {
        return new Yc[]{bTF, bTG, bTH, bTI};
    }

    static {
        bTJ = Yc.bon();
    }
}

