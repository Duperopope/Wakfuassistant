/*
 * Decompiled with CFR 0.152.
 */
public final class RJ
extends Enum<RJ> {
    public static final /* enum */ RJ bms = new RJ();
    public static final /* enum */ RJ bmt = new RJ();
    public static final /* enum */ RJ bmu = new RJ();
    private static final /* synthetic */ RJ[] bmv;

    public static RJ[] values() {
        return (RJ[])bmv.clone();
    }

    public static RJ valueOf(String string) {
        return Enum.valueOf(RJ.class, string);
    }

    private static /* synthetic */ RJ[] beH() {
        return new RJ[]{bms, bmt, bmu};
    }

    static {
        bmv = RJ.beH();
    }
}

