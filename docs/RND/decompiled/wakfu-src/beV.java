/*
 * Decompiled with CFR 0.152.
 */
public final class beV
extends Enum<beV>
implements aoq_1 {
    public static final /* enum */ beV hOT = new beV(1, "St\u00e8le");
    public static final /* enum */ beV hOU = new beV(2, "Parchemin");
    public static final /* enum */ beV hOV = new beV(3, "Livre", true, 20, 55);
    public static final /* enum */ beV hOW = new beV(4, "Panneau");
    public static final /* enum */ beV hOX = new beV(5, "Affiche");
    public static final /* enum */ beV hOY = new beV(6, "Vide");
    public static final /* enum */ beV hOZ = new beV(7, "Gazette", true, 35, 45, 600148, 600149);
    public static final /* enum */ beV hPa = new beV(8, "Parchemin", true, 35, 45);
    public static final /* enum */ beV hPb = new beV(9, "St\u00e8le frigost");
    public static final /* enum */ beV hPc = new beV(10, "St\u00e8le Blanche");
    public static final /* enum */ beV hPd = new beV(11, "Eliatrope (simple)");
    public static final /* enum */ beV hPe = new beV(12, "Eliatrope - Livre", true, 20, 55);
    private final short hPf;
    private final String hPg;
    private final boolean hPh;
    private final int hPi;
    private final int hPj;
    private final int hPk;
    private final int hPl;
    private static final /* synthetic */ beV[] hPm;

    public static beV[] values() {
        return (beV[])hPm.clone();
    }

    public static beV valueOf(String string) {
        return Enum.valueOf(beV.class, string);
    }

    private beV(short s, String string2, boolean bl, int n2, int n3, int n4, int n5) {
        this.hPf = s;
        this.hPh = bl;
        this.hPg = string2 + (this.hPh ? " (double)" : "");
        this.hPi = n3;
        this.hPj = n2;
        this.hPk = n4;
        this.hPl = n5;
    }

    private beV(short s, String string2, boolean bl, int n2, int n3) {
        this(s, string2, bl, n2, n3, 600120, 600121);
    }

    private beV(short s, String string2) {
        this(s, string2, false, 25, 25);
    }

    public int d() {
        return this.hPf;
    }

    public boolean dfh() {
        return this.hPh;
    }

    public int dfi() {
        return this.hPi;
    }

    public int dfj() {
        return this.hPj;
    }

    public int dfk() {
        return this.hPk;
    }

    public int dfl() {
        return this.hPl;
    }

    @Override
    public String aXA() {
        return Integer.toString(this.hPf);
    }

    @Override
    public String aXB() {
        return this.hPg;
    }

    @Override
    public String aXC() {
        return null;
    }

    public static beV bm(short s) {
        for (beV beV2 : beV.values()) {
            if (beV2.d() != s) continue;
            return beV2;
        }
        return null;
    }

    private static /* synthetic */ beV[] dfm() {
        return new beV[]{hOT, hOU, hOV, hOW, hOX, hOY, hOZ, hPa, hPb, hPc, hPd, hPe};
    }

    static {
        hPm = beV.dfm();
    }
}

