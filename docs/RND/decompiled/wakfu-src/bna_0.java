/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bNA
 */
public final class bna_0
extends Enum<bna_0>
implements abn_2 {
    public static final /* enum */ bna_0 kDM = new bna_0(1);
    public static final /* enum */ bna_0 kDN = new bna_0(2);
    public static final /* enum */ bna_0 kDO = new bna_0(3);
    private final int kDP;
    private static final /* synthetic */ bna_0[] kDQ;

    public static bna_0[] values() {
        return (bna_0[])kDQ.clone();
    }

    public static bna_0 valueOf(String string) {
        return Enum.valueOf(bna_0.class, string);
    }

    private bna_0(int n2) {
        this.kDP = n2;
    }

    @Override
    public int d() {
        return this.kDP;
    }

    private static /* synthetic */ bna_0[] ege() {
        return new bna_0[]{kDM, kDN, kDO};
    }

    static {
        kDQ = bna_0.ege();
    }
}

