/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bLq
 */
public final class blq_2
extends Enum<blq_2> {
    public static final /* enum */ blq_2 ksu = new blq_2(aq_0.arp, awx_2.dnL);
    public static final /* enum */ blq_2 ksv = new blq_2(aq_0.arq, awx_2.dnZ);
    public static final /* enum */ blq_2 ksw = new blq_2(aq_0.ars, awx_2.doa);
    public static final /* enum */ blq_2 ksx = new blq_2(aq_0.arr, awx_2.dnI);
    private final int ksy;
    private final axb_2 ksz;
    private static final /* synthetic */ blq_2[] ksA;

    public static blq_2[] values() {
        return (blq_2[])ksA.clone();
    }

    public static blq_2 valueOf(String string) {
        return Enum.valueOf(blq_2.class, string);
    }

    private blq_2(aq_0 aq_02, axb_2 axb_22) {
        this.ksy = aq_02.getNumber();
        this.ksz = axb_22;
    }

    public int d() {
        return this.ksy;
    }

    public axb_2 getColor() {
        return this.ksz;
    }

    public static blq_2 HT(int n) {
        for (blq_2 blq_22 : blq_2.values()) {
            if (blq_22.ksy != n) continue;
            return blq_22;
        }
        return null;
    }

    private static /* synthetic */ blq_2[] ecB() {
        return new blq_2[]{ksu, ksv, ksw, ksx};
    }

    static {
        ksA = blq_2.ecB();
    }
}

