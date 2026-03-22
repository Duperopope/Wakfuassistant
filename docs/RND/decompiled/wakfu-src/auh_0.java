/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aUH
 */
abstract sealed class auh_0
extends Enum<auh_0>
permits aui_0, auj_0 {
    public static final /* enum */ auh_0 hrh = new aui_0();
    public static final /* enum */ auh_0 hri = new auj_0();
    private static final /* synthetic */ auh_0[] hrj;

    public static auh_0[] values() {
        return (auh_0[])hrj.clone();
    }

    public static auh_0 valueOf(String string) {
        return Enum.valueOf(auh_0.class, string);
    }

    abstract String getValue();

    private static /* synthetic */ auh_0[] cWe() {
        return new auh_0[]{hrh, hri};
    }

    static {
        hrj = auh_0.cWe();
    }
}

