/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Wg
 */
public final class wg_0
extends Enum<wg_0> {
    public static final /* enum */ wg_0 bMG = new wg_0(0);
    public static final /* enum */ wg_0 bMH = new wg_0(1);
    public static final /* enum */ wg_0 bMI = new wg_0(2);
    public static final /* enum */ wg_0 bMJ = new wg_0(3);
    private final int bMK;
    private static final /* synthetic */ wg_0[] bML;

    public static wg_0[] values() {
        return (wg_0[])bML.clone();
    }

    public static wg_0 valueOf(String string) {
        return Enum.valueOf(wg_0.class, string);
    }

    private wg_0(int n2) {
        this.bMK = n2;
    }

    public static wg_0 qk(int n) {
        wg_0[] wg_0Array;
        for (wg_0 wg_02 : wg_0Array = wg_0.values()) {
            if (wg_02.bMK != n) continue;
            return wg_02;
        }
        throw new IllegalArgumentException("Not found " + n);
    }

    public int d() {
        return this.bMK;
    }

    private static /* synthetic */ wg_0[] blJ() {
        return new wg_0[]{bMG, bMH, bMI, bMJ};
    }

    static {
        bML = wg_0.blJ();
    }
}

