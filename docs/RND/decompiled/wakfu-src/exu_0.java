/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from exu
 */
public final class exu_0
extends Enum<exu_0> {
    public static final /* enum */ exu_0 oYs = new exu_0("default", null, false);
    public static final /* enum */ exu_0 oYt = new exu_0("steam", "STEAM", true);
    public static final /* enum */ exu_0 oYu = new exu_0("speedybird", "SPEEDYBIRD", false);
    private final String oYv;
    private final String oYw;
    private final boolean oYx;
    private static exu_0 oYy;
    private static final /* synthetic */ exu_0[] oYz;

    public static exu_0[] values() {
        return (exu_0[])oYz.clone();
    }

    public static exu_0 valueOf(String string) {
        return Enum.valueOf(exu_0.class, string);
    }

    public static exu_0 fft() {
        return oYy;
    }

    private exu_0(String string2, String string3, boolean bl) {
        this.oYv = string2;
        this.oYw = string3;
        this.oYx = bl;
    }

    public static void rM(String string) {
        for (exu_0 exu_02 : exu_0.values()) {
            if (!exu_02.oYv.equals(string)) continue;
            oYy = exu_02;
            return;
        }
        oYy = oYs;
    }

    public String getName() {
        return this.oYv;
    }

    public String bZc() {
        return this.oYw;
    }

    public boolean ffu() {
        return this.oYx;
    }

    private static /* synthetic */ exu_0[] ffv() {
        return new exu_0[]{oYs, oYt, oYu};
    }

    static {
        oYz = exu_0.ffv();
        oYy = oYs;
    }
}

