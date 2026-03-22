/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bnZ
 */
final class bnz_0
extends Enum<bnz_0> {
    public static final /* enum */ bnz_0 iMm = new bnz_0(1);
    public static final /* enum */ bnz_0 iMn = new bnz_0(2);
    public static final /* enum */ bnz_0 iMo = new bnz_0(3);
    private final int iMp;
    private static final /* synthetic */ bnz_0[] iMq;

    public static bnz_0[] values() {
        return (bnz_0[])iMq.clone();
    }

    public static bnz_0 valueOf(String string) {
        return Enum.valueOf(bnz_0.class, string);
    }

    private bnz_0(int n2) {
        this.iMp = n2;
    }

    String getStyle() {
        return auc_0.kA(String.valueOf(this.iMp));
    }

    private static /* synthetic */ bnz_0[] dAr() {
        return new bnz_0[]{iMm, iMn, iMo};
    }

    static {
        iMq = bnz_0.dAr();
    }
}

