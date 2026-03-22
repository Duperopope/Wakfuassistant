/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fng
 */
public final class fng_0
extends Enum<fng_0> {
    public static final /* enum */ fng_0 sHW = new fng_0(-1);
    public static final /* enum */ fng_0 sHX = new fng_0(0);
    public static final /* enum */ fng_0 sHY = new fng_0(1);
    public final byte sHZ;
    private static final /* synthetic */ fng_0[] sIa;

    public static fng_0[] values() {
        return (fng_0[])sIa.clone();
    }

    public static fng_0 valueOf(String string) {
        return Enum.valueOf(fng_0.class, string);
    }

    private fng_0(int n2) {
        this.sHZ = (byte)n2;
    }

    public static fng_0 gW(byte by) {
        fng_0[] fng_0Array = fng_0.values();
        for (int i = 0; i < fng_0Array.length; ++i) {
            fng_0 fng_02 = fng_0Array[i];
            if (fng_02.sHZ != by) continue;
            return fng_02;
        }
        return null;
    }

    private static /* synthetic */ fng_0[] gdU() {
        return new fng_0[]{sHW, sHX, sHY};
    }

    static {
        sIa = fng_0.gdU();
    }
}

