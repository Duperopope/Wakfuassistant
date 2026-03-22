/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from agJ
 */
public final class agj_0
extends Enum<agj_0>
implements agi_0 {
    public static final /* enum */ agj_0 cuG = new agj_0(new agk_0());
    public static final /* enum */ agj_0 cuH = new agj_0(new agl_0());
    public static final /* enum */ agj_0 cuI = new agj_0(new agm_0());
    public static final /* enum */ agj_0 cuJ = new agj_0(new agn_0());
    private final agi_0 cuK;
    private static final /* synthetic */ agj_0[] cuL;

    public static agj_0[] values() {
        return (agj_0[])cuL.clone();
    }

    public static agj_0 valueOf(String string) {
        return Enum.valueOf(agj_0.class, string);
    }

    private agj_0(agi_0 agi_02) {
        this.cuK = agi_02;
    }

    @Override
    public float j(float f2, float f3, float f4, float f5) {
        return this.cuK.j(f2, f3, f4, f5);
    }

    private static /* synthetic */ agj_0[] bzl() {
        return new agj_0[]{cuG, cuH, cuI, cuJ};
    }

    static {
        cuL = agj_0.bzl();
    }
}

