/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aFC
 */
public final class afc_1
extends Enum<afc_1> {
    public static final /* enum */ afc_1 dJm = new afc_1();
    public static final /* enum */ afc_1 dJn = new afc_1();
    public static final /* enum */ afc_1 dJo = new afc_1();
    private static final /* synthetic */ afc_1[] dJp;

    public static afc_1[] values() {
        return (afc_1[])dJp.clone();
    }

    public static afc_1 valueOf(String string) {
        return Enum.valueOf(afc_1.class, string);
    }

    private static /* synthetic */ afc_1[] caJ() {
        return new afc_1[]{dJm, dJn, dJo};
    }

    static {
        dJp = afc_1.caJ();
    }
}

