/*
 * Decompiled with CFR 0.152.
 */
public final class aOZ
extends Enum<aOZ> {
    public static final /* enum */ aOZ evn = new aOZ();
    public static final /* enum */ aOZ evo = new aOZ();
    private static final /* synthetic */ aOZ[] evp;

    public static aOZ[] values() {
        return (aOZ[])evp.clone();
    }

    public static aOZ valueOf(String string) {
        return Enum.valueOf(aOZ.class, string);
    }

    private static /* synthetic */ aOZ[] cyP() {
        return new aOZ[]{evn, evo};
    }

    static {
        evp = aOZ.cyP();
    }
}

