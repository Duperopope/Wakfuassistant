/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bwM
 */
public final class bwm_0
extends Enum<bwm_0> {
    public static final /* enum */ bwm_0 jzU = new bwm_0(bwx_0.jAw);
    public static final /* enum */ bwm_0 jzV = new bwm_0(bwv_0.jAq);
    public static final /* enum */ bwm_0 jzW = new bwm_0(bwy_0.jAz);
    public static final /* enum */ bwm_0 jzX = new bwm_0(bwu_0.jAp);
    private final bwl_0 jzY;
    private static final /* synthetic */ bwm_0[] jzZ;

    public static bwm_0[] values() {
        return (bwm_0[])jzZ.clone();
    }

    public static bwm_0 valueOf(String string) {
        return Enum.valueOf(bwm_0.class, string);
    }

    private bwm_0(bwl_0 bwl_02) {
        this.jzY = bwl_02;
    }

    public bwt_0 a(bgy bgy2, bdj_2 bdj_22, int n) {
        return this.jzY.a(bgy2, bdj_22, n);
    }

    private static /* synthetic */ bwm_0[] dMV() {
        return new bwm_0[]{jzU, jzV, jzW, jzX};
    }

    static {
        jzZ = bwm_0.dMV();
    }
}

