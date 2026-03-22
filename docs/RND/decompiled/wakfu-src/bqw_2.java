/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bQw
 */
public final class bqw_2
extends Enum<bqw_2> {
    public static final /* enum */ bqw_2 kVA = new bqw_2(0);
    public static final /* enum */ bqw_2 kVB = new bqw_2(1);
    public static final /* enum */ bqw_2 kVC = new bqw_2(2);
    public static final /* enum */ bqw_2 kVD = new bqw_2(3);
    public static final /* enum */ bqw_2 kVE = new bqw_2(4);
    private final byte kVF;
    private static final /* synthetic */ bqw_2[] kVG;

    public static bqw_2[] values() {
        return (bqw_2[])kVG.clone();
    }

    public static bqw_2 valueOf(String string) {
        return Enum.valueOf(bqw_2.class, string);
    }

    private bqw_2(byte by) {
        this.kVF = by;
    }

    public byte aJr() {
        return this.kVF;
    }

    public static bqw_2 cH(byte by) {
        for (bqw_2 bqw_22 : bqw_2.values()) {
            if (bqw_22.kVF != by) continue;
            return bqw_22;
        }
        return null;
    }

    private static /* synthetic */ bqw_2[] ejA() {
        return new bqw_2[]{kVA, kVB, kVC, kVD, kVE};
    }

    static {
        kVG = bqw_2.ejA();
    }
}

