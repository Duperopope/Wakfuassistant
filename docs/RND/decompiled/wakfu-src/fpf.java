/*
 * Decompiled with CFR 0.152.
 */
public final class fpf
extends Enum<fpf> {
    public static final /* enum */ fpf sNy = new fpf(0);
    public static final /* enum */ fpf sNz = new fpf(1);
    public static final /* enum */ fpf sNA = new fpf(2);
    public final byte sNB;
    private static final /* synthetic */ fpf[] sNC;

    public static fpf[] values() {
        return (fpf[])sNC.clone();
    }

    public static fpf valueOf(String string) {
        return Enum.valueOf(fpf.class, string);
    }

    private fpf(int n2) {
        this.sNB = (byte)n2;
    }

    public static fpf hj(byte by) {
        fpf[] fpfArray = fpf.values();
        for (int i = 0; i < fpfArray.length; ++i) {
            fpf fpf2 = fpfArray[i];
            if (fpf2.sNB != by) continue;
            return fpf2;
        }
        return null;
    }

    private static /* synthetic */ fpf[] ggh() {
        return new fpf[]{sNy, sNz, sNA};
    }

    static {
        sNC = fpf.ggh();
    }
}

