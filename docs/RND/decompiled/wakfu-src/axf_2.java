/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from axf
 */
public abstract sealed class axf_2
extends Enum<axf_2>
permits axg_2, axh_2 {
    public static final /* enum */ axf_2 doP = new axg_2();
    public static final /* enum */ axf_2 doQ = new axh_2();
    private static final /* synthetic */ axf_2[] doR;

    public static axf_2[] values() {
        return (axf_2[])doR.clone();
    }

    public static axf_2 valueOf(String string) {
        return Enum.valueOf(axf_2.class, string);
    }

    abstract int[] bQC();

    private static /* synthetic */ axf_2[] bQD() {
        return new axf_2[]{doP, doQ};
    }

    static {
        doR = axf_2.bQD();
    }
}

