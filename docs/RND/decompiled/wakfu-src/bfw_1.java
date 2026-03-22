/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bFw
 */
public final class bfw_1
extends Enum<bfw_1>
implements aoq_1 {
    public static final /* enum */ bfw_1 jTw = new bfw_1(0, "useTertiarySmall", "desc.mru.use");
    public static final /* enum */ bfw_1 jTx = new bfw_1(1, "moveTertiarySmall", "desc.splitItem");
    public static final /* enum */ bfw_1 jTy = new bfw_1(2, "useTertiarySmall", "desc.addCompass");
    private final byte jTz;
    private final String jTA;
    private final String jTB;
    private static final /* synthetic */ bfw_1[] jTC;

    public static bfw_1[] values() {
        return (bfw_1[])jTC.clone();
    }

    public static bfw_1 valueOf(String string) {
        return Enum.valueOf(bfw_1.class, string);
    }

    private bfw_1(byte by, String string2, String string3) {
        this.jTz = by;
        this.jTA = string2;
        this.jTB = string3;
    }

    public static bfw_1 bW(byte by) {
        for (bfw_1 bfw_12 : bfw_1.values()) {
            if (bfw_12.jTz != by) continue;
            return bfw_12;
        }
        return null;
    }

    public byte aJr() {
        return this.jTz;
    }

    public String getStyle() {
        return this.jTA;
    }

    public String clY() {
        return this.jTB;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.jTz);
    }

    @Override
    public String aXB() {
        return this.name();
    }

    @Override
    public String aXC() {
        return null;
    }

    private static /* synthetic */ bfw_1[] dTr() {
        return new bfw_1[]{jTw, jTx, jTy};
    }

    static {
        jTC = bfw_1.dTr();
    }
}

