/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bOs
 */
public final class bos_2
extends Enum<bos_2> {
    public static final /* enum */ bos_2 kKZ = new bos_2(800192, new bot_2());
    public static final /* enum */ bos_2 kLa = new bos_2(800191, new bou_2());
    private final bov_2 kLb;
    private final int kLc;
    private static final /* synthetic */ bos_2[] kLd;

    public static bos_2[] values() {
        return (bos_2[])kLd.clone();
    }

    public static bos_2 valueOf(String string) {
        return Enum.valueOf(bos_2.class, string);
    }

    private bos_2(int n2, bov_2 bov_22) {
        this.kLb = bov_22;
        this.kLc = n2;
    }

    public int egT() {
        return this.kLc;
    }

    public bov_2 egU() {
        return this.kLb;
    }

    private static /* synthetic */ bos_2[] egV() {
        return new bos_2[]{kKZ, kLa};
    }

    static {
        kLd = bos_2.egV();
    }
}

