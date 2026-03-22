/*
 * Decompiled with CFR 0.152.
 */
public final class fmU
extends Enum<fmU> {
    public static final /* enum */ fmU sHy = new fmU();
    public static final /* enum */ fmU sHz = new fmU();
    private static final /* synthetic */ fmU[] sHA;

    public static fmU[] values() {
        return (fmU[])sHA.clone();
    }

    public static fmU valueOf(String string) {
        return Enum.valueOf(fmU.class, string);
    }

    private static /* synthetic */ fmU[] gdK() {
        return new fmU[]{sHy, sHz};
    }

    static {
        sHA = fmU.gdK();
    }
}

