/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bPv
 */
public final class bpv_2
extends Enum<bpv_2> {
    public static final /* enum */ bpv_2 kQw = new bpv_2(0, "default");
    public static final /* enum */ bpv_2 kQx = new bpv_2(1, "BANNER");
    private final byte kQy;
    private final String kQz;
    private static final /* synthetic */ bpv_2[] kQA;

    public static bpv_2[] values() {
        return (bpv_2[])kQA.clone();
    }

    public static bpv_2 valueOf(String string) {
        return Enum.valueOf(bpv_2.class, string);
    }

    private bpv_2(int n2, String string2) {
        this.kQy = GC.ct(n2);
        this.kQz = string2;
    }

    public byte aFW() {
        return this.kQy;
    }

    public String getName() {
        return this.kQz;
    }

    public static bpv_2 nk(String string) {
        if (string == null) {
            return kQw;
        }
        for (bpv_2 bpv_22 : bpv_2.values()) {
            if (!string.equals(bpv_22.kQz)) continue;
            return bpv_22;
        }
        return kQw;
    }

    private static /* synthetic */ bpv_2[] eix() {
        return new bpv_2[]{kQw, kQx};
    }

    static {
        kQA = bpv_2.eix();
    }
}

