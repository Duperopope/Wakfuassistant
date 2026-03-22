/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bmE
 */
public final class bme_2
extends Enum<bme_2> {
    public static final /* enum */ bme_2 iCo = new bme_2(0);
    public static final /* enum */ bme_2 iCp = new bme_2(1);
    public static final /* enum */ bme_2 iCq = new bme_2(2);
    private final byte iCr;
    private static final /* synthetic */ bme_2[] iCs;

    public static bme_2[] values() {
        return (bme_2[])iCs.clone();
    }

    public static bme_2 valueOf(String string) {
        return Enum.valueOf(bme_2.class, string);
    }

    private bme_2(byte by) {
        this.iCr = by;
    }

    public byte aJr() {
        return this.iCr;
    }

    public static bme_2 bt(byte by) {
        for (bme_2 bme_22 : bme_2.values()) {
            if (bme_22.iCr != by) continue;
            return bme_22;
        }
        return null;
    }

    private static /* synthetic */ bme_2[] dwD() {
        return new bme_2[]{iCo, iCp, iCq};
    }

    static {
        iCs = bme_2.dwD();
    }
}

