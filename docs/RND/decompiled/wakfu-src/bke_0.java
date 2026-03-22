/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bKE
 */
public final class bke_0
extends Enum<bke_0> {
    public static final /* enum */ bke_0 kps = new bke_0();
    public static final /* enum */ bke_0 kpt = new bke_0();
    public static final /* enum */ bke_0 kpu = new bke_0();
    public static final /* enum */ bke_0 kpv = new bke_0();
    private static final /* synthetic */ bke_0[] kpw;

    public static bke_0[] values() {
        return (bke_0[])kpw.clone();
    }

    public static bke_0 valueOf(String string) {
        return Enum.valueOf(bke_0.class, string);
    }

    private static /* synthetic */ bke_0[] ebI() {
        return new bke_0[]{kps, kpt, kpu, kpv};
    }

    static {
        kpw = bke_0.ebI();
    }
}

