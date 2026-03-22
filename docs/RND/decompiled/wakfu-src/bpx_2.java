/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bPx
 */
public final class bpx_2
extends Enum<bpx_2> {
    public static final /* enum */ bpx_2 kQQ = new bpx_2("OGRINETOKEN");
    public static final /* enum */ bpx_2 kQR = new bpx_2("");
    private final String kQS;
    private static final /* synthetic */ bpx_2[] kQT;

    public static bpx_2[] values() {
        return (bpx_2[])kQT.clone();
    }

    public static bpx_2 valueOf(String string) {
        return Enum.valueOf(bpx_2.class, string);
    }

    private bpx_2(String string2) {
        this.kQS = string2;
    }

    public String getName() {
        return this.kQS;
    }

    public static bpx_2 nl(String string) {
        for (bpx_2 bpx_22 : bpx_2.values()) {
            if (!bpx_22.kQS.equals(string)) continue;
            return bpx_22;
        }
        return kQR;
    }

    private static /* synthetic */ bpx_2[] eiC() {
        return new bpx_2[]{kQQ, kQR};
    }

    static {
        kQT = bpx_2.eiC();
    }
}

