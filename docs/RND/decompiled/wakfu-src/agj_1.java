/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aGJ
 */
public final class agj_1
extends Enum<agj_1> {
    public static final /* enum */ agj_1 dLQ = new agj_1(0);
    public static final /* enum */ agj_1 dLR = new agj_1(1);
    public static final /* enum */ agj_1 dLS = new agj_1(2);
    public static final /* enum */ agj_1 dLT = new agj_1(3);
    public static final /* enum */ agj_1 dLU = new agj_1(4);
    public static final /* enum */ agj_1 dLV = new agj_1(5);
    public static final /* enum */ agj_1 dLW = new agj_1(6);
    public static final /* enum */ agj_1 dLX = new agj_1(7);
    public static final /* enum */ agj_1 dLY = new agj_1(8);
    public static final /* enum */ agj_1 dLZ = new agj_1(9);
    public static final /* enum */ agj_1 dMa = new agj_1(10);
    public static final /* enum */ agj_1 dMb = new agj_1(11);
    public static final /* enum */ agj_1 dMc = new agj_1(12);
    public static final /* enum */ agj_1 dMd = new agj_1(13);
    public static final /* enum */ agj_1 dMe = new agj_1(14);
    public static final /* enum */ agj_1 dMf = new agj_1(15);
    public static final /* enum */ agj_1 dMg = new agj_1(16);
    public static final /* enum */ agj_1 dMh = new agj_1(17);
    private final byte dMi;
    private static final /* synthetic */ agj_1[] dMj;

    public static agj_1[] values() {
        return (agj_1[])dMj.clone();
    }

    public static agj_1 valueOf(String string) {
        return Enum.valueOf(agj_1.class, string);
    }

    private agj_1(byte by) {
        this.dMi = by;
    }

    public byte aFW() {
        return this.dMi;
    }

    private static /* synthetic */ agj_1[] cbC() {
        return new agj_1[]{dLQ, dLR, dLS, dLT, dLU, dLV, dLW, dLX, dLY, dLZ, dMa, dMb, dMc, dMd, dMe, dMf, dMg, dMh};
    }

    static {
        dMj = agj_1.cbC();
    }
}

