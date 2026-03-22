/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eYB
 */
public final class eyb_2
extends Enum<eyb_2> {
    public static final /* enum */ eyb_2 rJW = new eyb_2(0, true);
    public static final /* enum */ eyb_2 rJX = new eyb_2(1, false);
    public static final /* enum */ eyb_2 rJY = new eyb_2(2, true);
    public static final /* enum */ eyb_2 rJZ = new eyb_2(3, false);
    public static final /* enum */ eyb_2 rKa = new eyb_2(4, true);
    public static final /* enum */ eyb_2 rKb = new eyb_2(5, false);
    private final byte rKc;
    private final boolean rKd;
    private static final /* synthetic */ eyb_2[] rKe;

    public static eyb_2[] values() {
        return (eyb_2[])rKe.clone();
    }

    public static eyb_2 valueOf(String string) {
        return Enum.valueOf(eyb_2.class, string);
    }

    private eyb_2(byte by, boolean bl) {
        this.rKc = by;
        this.rKd = bl;
    }

    public boolean fPO() {
        return this.rKd;
    }

    public byte aJr() {
        return this.rKc;
    }

    public static eyb_2 fR(byte by) {
        for (eyb_2 eyb_22 : eyb_2.values()) {
            if (eyb_22.rKc != by) continue;
            return eyb_22;
        }
        return rJZ;
    }

    private static /* synthetic */ eyb_2[] fPP() {
        return new eyb_2[]{rJW, rJX, rJY, rJZ, rKa, rKb};
    }

    static {
        rKe = eyb_2.fPP();
    }
}

