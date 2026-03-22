/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from SM
 */
public final class sm_0
extends Enum<sm_0>
implements aoq_1 {
    public static final /* enum */ sm_0 bps = new sm_0(1, 300, "vitesse de course normale", "300ms/cell, 7.5 frames \u00e0 25fps");
    public static final /* enum */ sm_0 bpt = new sm_0(2, 600, "vitesse de marche normale", "600ms/cell, 15 frames \u00e0 25fps");
    public static final /* enum */ sm_0 bpu = new sm_0(3, 1000, "vitesse de marche lente", "1000ms/cell, 25 frames \u00e0 25fps");
    public static final /* enum */ sm_0 bpv = new sm_0(4, 1200, "vitesse de marche tr\u00e8s lente", "1200ms/cell, 30 frames \u00e0 25fps");
    public static final /* enum */ sm_0 bpw = new sm_0(5, 240, "Monture +25%", "240ms/cell");
    public static final /* enum */ sm_0 bpx = new sm_0(6, 200, "Monture +50%", "200ms/cell");
    public static final /* enum */ sm_0 bpy = new sm_0(7, 172, "Monture +75%", "172ms/cell");
    private static final aah_1<sm_0> bpz;
    private final int bpA;
    private final String bpB;
    private final String bpC;
    private final int bpD;
    private static final /* synthetic */ sm_0[] bpE;

    public static sm_0[] values() {
        return (sm_0[])bpE.clone();
    }

    public static sm_0 valueOf(String string) {
        return Enum.valueOf(sm_0.class, string);
    }

    private sm_0(int n2, int n3, String string2, String string3) {
        this.bpA = n2;
        this.bpD = n3;
        this.bpB = string2;
        this.bpC = string3;
    }

    @Override
    public String aXA() {
        return Integer.toString(this.bpA);
    }

    @Override
    public String aXB() {
        return this.bpB;
    }

    @Override
    public String aXC() {
        return this.bpC;
    }

    public int d() {
        return this.bpA;
    }

    public int bfX() {
        return this.bpD;
    }

    public static sm_0 pf(int n) {
        return bpz.vK(n);
    }

    private static /* synthetic */ sm_0[] bfY() {
        return new sm_0[]{bps, bpt, bpu, bpv, bpw, bpx, bpy};
    }

    static {
        bpE = sm_0.bfY();
        bpz = new aah_1();
        for (sm_0 sm_02 : sm_0.values()) {
            bpz.b(sm_02.d(), sm_02);
        }
    }
}

