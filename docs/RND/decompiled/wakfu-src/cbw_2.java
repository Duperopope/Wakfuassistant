/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cbW
 */
public final class cbw_2
extends Enum<cbw_2> {
    public static final /* enum */ cbw_2 lLS = new cbw_2(0);
    public static final /* enum */ cbw_2 lLT = new cbw_2(30);
    public static final /* enum */ cbw_2 lLU = new cbw_2(31);
    public static final /* enum */ cbw_2 lLV = new cbw_2(32);
    public static final /* enum */ cbw_2 lLW = new cbw_2(33);
    private final int lLX;
    private static final /* synthetic */ cbw_2[] lLY;

    public static cbw_2[] values() {
        return (cbw_2[])lLY.clone();
    }

    public static cbw_2 valueOf(String string) {
        return Enum.valueOf(cbw_2.class, string);
    }

    private cbw_2(int n2) {
        this.lLX = n2;
    }

    public int Xt() {
        return this.lLX;
    }

    public String elx() {
        return aum_0.cWf().a(39, (long)this.lLX, new Object[0]);
    }

    public static cbw_2 KL(int n) {
        for (cbw_2 cbw_22 : cbw_2.values()) {
            if (n != cbw_22.lLX) continue;
            return cbw_22;
        }
        return lLS;
    }

    public static cbw_2 nZ(String string) {
        for (cbw_2 cbw_22 : cbw_2.values()) {
            if (!string.equals(cbw_22.elx())) continue;
            return cbw_22;
        }
        return lLS;
    }

    private static /* synthetic */ cbw_2[] esK() {
        return new cbw_2[]{lLS, lLT, lLU, lLV, lLW};
    }

    static {
        lLY = cbw_2.esK();
    }
}

