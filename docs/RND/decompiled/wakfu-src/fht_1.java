/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fHt
 */
public final class fht_1
extends Enum<fht_1> {
    public static final /* enum */ fht_1 uxB = new fht_1(fhv_1.class);
    public static final /* enum */ fht_1 uxC = new fht_1(fhp_1.class);
    private final Class<? extends fhi_2> uxD;
    private static final /* synthetic */ fht_1[] uxE;

    public static fht_1[] values() {
        return (fht_1[])uxE.clone();
    }

    public static fht_1 valueOf(String string) {
        return Enum.valueOf(fht_1.class, string);
    }

    private fht_1(Class<? extends fhi_2> clazz) {
        this.uxD = clazz;
    }

    public Class<? extends fhi_2> bSL() {
        return this.uxD;
    }

    private static /* synthetic */ fht_1[] gAw() {
        return new fht_1[]{uxB, uxC};
    }

    static {
        uxE = fht_1.gAw();
    }
}

