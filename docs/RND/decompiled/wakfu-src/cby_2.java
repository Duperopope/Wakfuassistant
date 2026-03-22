/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cbY
 */
public final class cby_2
extends Enum<cby_2> {
    public static final /* enum */ cby_2 lMe = new cby_2(527L, 1, 32);
    public static final /* enum */ cby_2 lMf = new cby_2(1134L, -10, -8);
    public static final /* enum */ cby_2 lMg = new cby_2(1136L, 3, 26);
    public static final /* enum */ cby_2 lMh = new cby_2(1137L, 4, -89);
    public static final /* enum */ cby_2 lMi = new cby_2(1135L, -7, 16);
    public static final /* enum */ cby_2 lMj = new cby_2(967L, 0, -5);
    public static final /* enum */ cby_2 lMk = new cby_2(1089L, 0, 1);
    public static final /* enum */ cby_2 lMl = new cby_2(552L, 0, -12);
    public static final /* enum */ cby_2 lMm = new cby_2(1388L, 0, -9);
    private final long lMn;
    private final int lMo;
    private final int lMp;
    private static final /* synthetic */ cby_2[] lMq;

    public static cby_2[] values() {
        return (cby_2[])lMq.clone();
    }

    public static cby_2 valueOf(String string) {
        return Enum.valueOf(cby_2.class, string);
    }

    private cby_2(long l, int n2, int n3) {
        this.lMn = l;
        this.lMo = n2;
        this.lMp = n3;
    }

    public long aqZ() {
        return this.lMn;
    }

    public int getX() {
        return this.lMo;
    }

    public int getY() {
        return this.lMp;
    }

    public String esM() {
        return aum_0.cWf().a(77, this.lMn, new Object[0]);
    }

    public static cby_2 oa(String string) {
        for (cby_2 cby_22 : cby_2.values()) {
            if (!string.equals(cby_22.esM())) continue;
            return cby_22;
        }
        return lMe;
    }

    private static /* synthetic */ cby_2[] esN() {
        return new cby_2[]{lMe, lMf, lMg, lMh, lMi, lMj, lMk, lMl, lMm};
    }

    static {
        lMq = cby_2.esN();
    }
}

