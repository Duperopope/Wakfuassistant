/*
 * Decompiled with CFR 0.152.
 */
public final class Ss
extends Enum<Ss> {
    public static final /* enum */ Ss boq = new Ss();
    public static final /* enum */ Ss bor = new Ss();
    public static final /* enum */ Ss bos = new Ss();
    public static final /* enum */ Ss bot = new Ss();
    public static final /* enum */ Ss bou = new Ss();
    public static final /* enum */ Ss bov = new Ss();
    public static final /* enum */ Ss bow = new Ss();
    public static final /* enum */ Ss box = new Ss();
    private static final /* synthetic */ Ss[] boy;

    public static Ss[] values() {
        return (Ss[])boy.clone();
    }

    public static Ss valueOf(String string) {
        return Enum.valueOf(Ss.class, string);
    }

    private static /* synthetic */ Ss[] bfH() {
        return new Ss[]{boq, bor, bos, bot, bou, bov, bow, box};
    }

    static {
        boy = Ss.bfH();
    }
}

