/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bGF
 */
public final class bgf_2
extends Enum<bgf_2> {
    public static final /* enum */ bgf_2 jWf = new bgf_2(0);
    public static final /* enum */ bgf_2 jWg = new bgf_2(1);
    public static final /* enum */ bgf_2 jWh = new bgf_2(2);
    public static final /* enum */ bgf_2 jWi = new bgf_2(3);
    public static final /* enum */ bgf_2 jWj = new bgf_2(4);
    private final int jWk;
    private static final /* synthetic */ bgf_2[] jWl;

    public static bgf_2[] values() {
        return (bgf_2[])jWl.clone();
    }

    public static bgf_2 valueOf(String string) {
        return Enum.valueOf(bgf_2.class, string);
    }

    private bgf_2(int n2) {
        this.jWk = n2;
    }

    public int d() {
        return this.jWk;
    }

    private static /* synthetic */ bgf_2[] dUi() {
        return new bgf_2[]{jWf, jWg, jWh, jWi, jWj};
    }

    static {
        jWl = bgf_2.dUi();
    }
}

