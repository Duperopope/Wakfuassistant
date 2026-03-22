/*
 * Decompiled with CFR 0.152.
 */
public final class Bs
extends Enum<Bs> {
    public static final /* enum */ Bs aug = new Bs();
    public static final /* enum */ Bs auh = new Bs();
    public static final /* enum */ Bs aui = new Bs();
    private static final /* synthetic */ Bs[] auj;

    public static Bs[] values() {
        return (Bs[])auj.clone();
    }

    public static Bs valueOf(String string) {
        return Enum.valueOf(Bs.class, string);
    }

    private static /* synthetic */ Bs[] aHF() {
        return new Bs[]{aug, auh, aui};
    }

    static {
        auj = Bs.aHF();
    }
}

