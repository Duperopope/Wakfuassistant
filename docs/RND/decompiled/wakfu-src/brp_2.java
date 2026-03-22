/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bRP
 */
public final class brp_2
extends Enum<brp_2> {
    public static final /* enum */ brp_2 lcv = new brp_2(0, "governorTitle.wise");
    public static final /* enum */ brp_2 lcw = new brp_2(1, "governorTitle.despot");
    public static final /* enum */ brp_2 lcx = new brp_2(2, "governorTitle.negociator");
    public static final /* enum */ brp_2 lcy = new brp_2(3, "governorTitle.oppressor");
    public static final /* enum */ brp_2 lcz = new brp_2(4, "governorTitle.strategist");
    public static final /* enum */ brp_2 lcA = new brp_2(5, "governorTitle.machiavellian");
    public static final /* enum */ brp_2 lcB = new brp_2(6, "governorTitle.diplomat");
    public static final /* enum */ brp_2 lcC = new brp_2(7, "governorTitle.bully");
    public static final /* enum */ brp_2 lcD = new brp_2(8, "governorTitle.protector");
    public static final /* enum */ brp_2 lcE = new brp_2(9, "governorTitle.warlike");
    public static final /* enum */ brp_2 lcF = new brp_2(10, "governorTitle.careful");
    public static final /* enum */ brp_2 lcG = new brp_2(11, "governorTitle.reckless");
    public static final /* enum */ brp_2 lcH = new brp_2(12, "governorTitle.benefactor");
    public static final /* enum */ brp_2 lcI = new brp_2(13, "governorTitle.criminal");
    public static final /* enum */ brp_2 lcJ = new brp_2(14, "governorTitle.reformer");
    public static final /* enum */ brp_2 lcK = new brp_2(15, "governorTitle.conservative");
    private final short lcL;
    private final String lcM;
    private static final /* synthetic */ brp_2[] lcN;

    public static brp_2[] values() {
        return (brp_2[])lcN.clone();
    }

    public static brp_2 valueOf(String string) {
        return Enum.valueOf(brp_2.class, string);
    }

    private brp_2(short s, String string2) {
        this.lcL = s;
        this.lcM = string2;
    }

    public short aIi() {
        return this.lcL;
    }

    public String ely() {
        return this.lcM;
    }

    public static brp_2 cu(short s) {
        for (brp_2 brp_22 : brp_2.values()) {
            if (brp_22.aIi() != s) continue;
            return brp_22;
        }
        return null;
    }

    private static /* synthetic */ brp_2[] elz() {
        return new brp_2[]{lcv, lcw, lcx, lcy, lcz, lcA, lcB, lcC, lcD, lcE, lcF, lcG, lcH, lcI, lcJ, lcK};
    }

    static {
        lcN = brp_2.elz();
    }
}

