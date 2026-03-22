/*
 * Decompiled with CFR 0.152.
 */
public final class eMR
extends Enum<eMR> {
    public static final /* enum */ eMR qNS = new eMR(2, hr_1.uy);
    public static final /* enum */ eMR qNT = new eMR(1, hr_1.ux);
    public static final /* enum */ eMR qNU = new eMR(0, hr_1.uw);
    private final byte qNV;
    private final hr_1 qNW;
    private static final /* synthetic */ eMR[] qNX;

    public static eMR[] values() {
        return (eMR[])qNX.clone();
    }

    public static eMR valueOf(String string) {
        return Enum.valueOf(eMR.class, string);
    }

    private eMR(byte by, hr_1 hr_12) {
        this.qNV = by;
        this.qNW = hr_12;
    }

    public static eMR fe(byte by) {
        for (eMR eMR2 : eMR.values()) {
            if (eMR2.qNV != by) continue;
            return eMR2;
        }
        throw new IllegalArgumentException("Invalid ladderType request from typeId");
    }

    public static eMR b(hr_1 hr_12) {
        for (eMR eMR2 : eMR.values()) {
            if (eMR2.qNW != hr_12) continue;
            return eMR2;
        }
        throw new IllegalArgumentException("Invalid ladderType request from protobuf ladderType");
    }

    public hr_1 fAK() {
        return this.qNW;
    }

    public byte aZv() {
        return this.qNV;
    }

    private static /* synthetic */ eMR[] fAL() {
        return new eMR[]{qNS, qNT, qNU};
    }

    static {
        qNX = eMR.fAL();
    }
}

