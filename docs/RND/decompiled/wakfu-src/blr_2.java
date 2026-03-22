/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bLr
 */
public final class blr_2
extends Enum<blr_2> {
    public static final /* enum */ blr_2 ksB = new blr_2(ax_0.arQ, -1, true);
    public static final /* enum */ blr_2 ksC = new blr_2(ax_0.arR, 24267, true);
    public static final /* enum */ blr_2 ksD = new blr_2(ax_0.arS, 24844, false);
    public static final /* enum */ blr_2 ksE = new blr_2(ax_0.arT, 24268, true);
    public static final /* enum */ blr_2 ksF = new blr_2(ax_0.arU, 24266, true);
    private final int ksG;
    private final int ksH;
    private final boolean ksI;
    private static final /* synthetic */ blr_2[] ksJ;

    public static blr_2[] values() {
        return (blr_2[])ksJ.clone();
    }

    public static blr_2 valueOf(String string) {
        return Enum.valueOf(blr_2.class, string);
    }

    private blr_2(ax_0 ax_02, int n2, boolean bl) {
        this.ksG = ax_02.getNumber();
        this.ksH = n2;
        this.ksI = bl;
    }

    public int d() {
        return this.ksG;
    }

    public int AK() {
        return this.ksH;
    }

    public boolean isVisible() {
        return this.ksI;
    }

    public static blr_2 HU(int n) {
        for (blr_2 blr_22 : blr_2.values()) {
            if (blr_22.ksG != n) continue;
            return blr_22;
        }
        return null;
    }

    private static /* synthetic */ blr_2[] ecC() {
        return new blr_2[]{ksB, ksC, ksD, ksE, ksF};
    }

    static {
        ksJ = blr_2.ecC();
    }
}

