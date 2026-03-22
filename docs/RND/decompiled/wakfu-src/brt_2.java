/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bRT
 */
final class brt_2
extends Enum<brt_2> {
    public static final /* enum */ brt_2 ldk = new brt_2();
    public static final /* enum */ brt_2 ldl = new brt_2();
    public static final /* enum */ brt_2 ldm = new brt_2();
    private static final /* synthetic */ brt_2[] ldn;

    public static brt_2[] values() {
        return (brt_2[])ldn.clone();
    }

    public static brt_2 valueOf(String string) {
        return Enum.valueOf(brt_2.class, string);
    }

    private static /* synthetic */ brt_2[] elF() {
        return new brt_2[]{ldk, ldl, ldm};
    }

    static {
        ldn = brt_2.elF();
    }
}

