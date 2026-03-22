/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bKr
 */
public final class bkr_0
extends Enum<bkr_0> {
    public static final /* enum */ bkr_0 kny = new bkr_0(0, "AnimStatique");
    public static final /* enum */ bkr_0 knz = new bkr_0(1, "AnimStatique-Content");
    public static final /* enum */ bkr_0 knA = new bkr_0(2, "AnimStatique-Colere");
    public static final /* enum */ bkr_0 knB = new bkr_0(3, "AnimStatique-Surpris");
    private final byte knC;
    private final String knD;
    private static final /* synthetic */ bkr_0[] knE;

    public static bkr_0[] values() {
        return (bkr_0[])knE.clone();
    }

    public static bkr_0 valueOf(String string) {
        return Enum.valueOf(bkr_0.class, string);
    }

    private bkr_0(byte by, String string2) {
        this.knC = by;
        this.knD = string2;
    }

    public static bkr_0 bY(byte by) {
        for (bkr_0 bkr_02 : bkr_0.values()) {
            if (bkr_02.knC != by) continue;
            return bkr_02;
        }
        return null;
    }

    public byte aJr() {
        return this.knC;
    }

    public String bkI() {
        return this.knD;
    }

    public static bkr_0 c(fpb fpb2) {
        switch (fpb2) {
            case sNo: {
                return knA;
            }
            case sNq: {
                return knz;
            }
        }
        return kny;
    }

    private static /* synthetic */ bkr_0[] ebo() {
        return new bkr_0[]{kny, knz, knA, knB};
    }

    static {
        knE = bkr_0.ebo();
    }
}

