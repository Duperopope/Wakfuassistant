/*
 * Decompiled with CFR 0.152.
 */
public final class eMN
extends Enum<eMN> {
    public static final /* enum */ eMN qNx = new eMN(0);
    public static final /* enum */ eMN qNy = new eMN(1);
    private final int qNz;
    private static final /* synthetic */ eMN[] qNA;

    public static eMN[] values() {
        return (eMN[])qNA.clone();
    }

    public static eMN valueOf(String string) {
        return Enum.valueOf(eMN.class, string);
    }

    private eMN(int n2) {
        this.qNz = n2;
    }

    public int d() {
        return this.qNz;
    }

    public static eMN RB(int n) {
        for (eMN eMN2 : eMN.values()) {
            if (eMN2.qNz != n) continue;
            return eMN2;
        }
        return null;
    }

    private static /* synthetic */ eMN[] fAH() {
        return new eMN[]{qNx, qNy};
    }

    static {
        qNA = eMN.fAH();
    }
}

