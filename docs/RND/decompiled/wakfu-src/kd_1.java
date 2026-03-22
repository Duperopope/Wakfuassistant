/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from KD
 */
public final class kd_1
extends Enum<kd_1> {
    public static final /* enum */ kd_1 aOh = new kd_1();
    public static final /* enum */ kd_1 aOi = new kd_1();
    public static final /* enum */ kd_1 aOj = new kd_1();
    public static final /* enum */ kd_1 aOk = new kd_1();
    public static final /* enum */ kd_1 aOl = new kd_1();
    public static final /* enum */ kd_1 aOm = new kd_1();
    private static final /* synthetic */ kd_1[] aOn;

    public static kd_1[] values() {
        return (kd_1[])aOn.clone();
    }

    public static kd_1 valueOf(String string) {
        return Enum.valueOf(kd_1.class, string);
    }

    public int aRg() {
        return this.ordinal();
    }

    public static kd_1 nm(int n) {
        return kd_1.values()[n];
    }

    private static /* synthetic */ kd_1[] aRh() {
        return new kd_1[]{aOh, aOi, aOj, aOk, aOl, aOm};
    }

    static {
        aOn = kd_1.aRh();
    }
}

