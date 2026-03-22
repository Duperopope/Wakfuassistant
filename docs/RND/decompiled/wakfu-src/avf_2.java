/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from avf
 */
public final class avf_2
extends Enum<avf_2> {
    public static final /* enum */ avf_2 dgZ = new avf_2(260);
    public static final /* enum */ avf_2 dha = new avf_2(3042);
    public static final /* enum */ avf_2 dhb = new avf_2(34160);
    public static final /* enum */ avf_2 dhc = new avf_2(8449);
    public static final /* enum */ avf_2 dhd = new avf_2(8448);
    public final int dhe;
    private static final /* synthetic */ avf_2[] dhf;

    public static avf_2[] values() {
        return (avf_2[])dhf.clone();
    }

    public static avf_2 valueOf(String string) {
        return Enum.valueOf(avf_2.class, string);
    }

    private avf_2(int n2) {
        this.dhe = n2;
    }

    private static /* synthetic */ avf_2[] bMP() {
        return new avf_2[]{dgZ, dha, dhb, dhc, dhd};
    }

    static {
        dhf = avf_2.bMP();
    }
}

