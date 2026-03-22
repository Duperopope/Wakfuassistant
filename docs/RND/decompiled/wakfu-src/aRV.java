/*
 * Decompiled with CFR 0.152.
 */
public final class aRV
extends Enum<aRV> {
    public static final /* enum */ aRV eMs = new aRV();
    public static final /* enum */ aRV eMt = new aRV();
    public static final /* enum */ aRV eMu = new aRV();
    public static final /* enum */ aRV eMv = new aRV();
    public static final /* enum */ aRV eMw = new aRV();
    private static final /* synthetic */ aRV[] eMx;

    public static aRV[] values() {
        return (aRV[])eMx.clone();
    }

    public static aRV valueOf(String string) {
        return Enum.valueOf(aRV.class, string);
    }

    private static /* synthetic */ aRV[] cDm() {
        return new aRV[]{eMs, eMt, eMu, eMv, eMw};
    }

    static {
        eMx = aRV.cDm();
    }
}

