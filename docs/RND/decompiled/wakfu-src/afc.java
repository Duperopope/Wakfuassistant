/*
 * Decompiled with CFR 0.152.
 */
public final class afc
extends Enum<afc> {
    public static final /* enum */ afc cpv = new afc();
    public static final /* enum */ afc cpw = new afc();
    private static final /* synthetic */ afc[] cpx;

    public static afc[] values() {
        return (afc[])cpx.clone();
    }

    public static afc valueOf(String string) {
        return Enum.valueOf(afc.class, string);
    }

    private static /* synthetic */ afc[] bxr() {
        return new afc[]{cpv, cpw};
    }

    static {
        cpx = afc.bxr();
    }
}

