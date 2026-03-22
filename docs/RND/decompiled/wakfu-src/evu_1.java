/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from evU
 */
public final class evu_1
extends Enum<evu_1> {
    public static final /* enum */ evu_1 owU = new evu_1(0);
    public static final /* enum */ evu_1 owV = new evu_1(1);
    private final byte owW;
    private static final /* synthetic */ evu_1[] owX;

    public static evu_1[] values() {
        return (evu_1[])owX.clone();
    }

    public static evu_1 valueOf(String string) {
        return Enum.valueOf(evu_1.class, string);
    }

    private evu_1(byte by) {
        this.owW = by;
    }

    public byte aJr() {
        return this.owW;
    }

    public static evu_1 eu(byte by) {
        for (evu_1 evu_12 : evu_1.values()) {
            if (evu_12.aJr() != by) continue;
            return evu_12;
        }
        return null;
    }

    private static /* synthetic */ evu_1[] feE() {
        return new evu_1[]{owU, owV};
    }

    static {
        owX = evu_1.feE();
    }
}

