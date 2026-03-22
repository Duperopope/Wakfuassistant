/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bZZ
 */
public abstract sealed class bzz_2
extends Enum<bzz_2>
implements afc_0
permits caa_2, cab_2, cac_2 {
    public static final /* enum */ bzz_2 lFa = new caa_2(1, "Animation simple");
    public static final /* enum */ bzz_2 lFb = new cab_2(2, "Animation en fonction de la nation");
    public static final /* enum */ bzz_2 lFc = new cac_2(4, "Prend les couleurs de la guilde du HM");
    private final int lFd;
    private final String lFe;
    private static final /* synthetic */ bzz_2[] lFf;

    public static bzz_2[] values() {
        return (bzz_2[])lFf.clone();
    }

    public static bzz_2 valueOf(String string) {
        return Enum.valueOf(bzz_2.class, string);
    }

    bzz_2(int n2, String string2) {
        this.lFd = n2;
        this.lFe = string2;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.lFd);
    }

    @Override
    public String aXB() {
        return this.lFe;
    }

    @Override
    public String aXC() {
        return this.lFe;
    }

    public int d() {
        return this.lFd;
    }

    public static bzz_2 JS(int n) {
        for (int i = 0; i < bzz_2.values().length; ++i) {
            bzz_2 bzz_22 = bzz_2.values()[i];
            if (bzz_22.lFd != n) continue;
            return bzz_22;
        }
        throw new UnsupportedOperationException("Impossible de trouver le type d'\u00e9l\u00e9ment Dynamique " + n);
    }

    private static /* synthetic */ bzz_2[] eqK() {
        return new bzz_2[]{lFa, lFb, lFc};
    }

    static {
        lFf = bzz_2.eqK();
    }
}

