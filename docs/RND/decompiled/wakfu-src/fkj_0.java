/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fkj
 */
public final class fkj_0
extends Enum<fkj_0>
implements aoq_1 {
    public static final /* enum */ fkj_0 sAG = new fkj_0(1, "Acc\u00e8de aux Infrastructures sp\u00e9ciales de sa nation");
    public static final /* enum */ fkj_0 sAH = new fkj_0(2, "Peut parrainer un joueur d'une autre nation (Neutre)");
    public static final /* enum */ fkj_0 sAI = new fkj_0(3, "Peut se pr\u00e9senter aux \u00e9lections");
    public static final /* enum */ fkj_0 sAJ = new fkj_0(4, "Peut devenir Milicien ou Soldat");
    public static final /* enum */ fkj_0 sAK = new fkj_0(5, "Peut Voter lors des \u00e9lections");
    public static final /* enum */ fkj_0 sAL = new fkj_0(6, "Profite des Bonus de MdC");
    public static final /* enum */ fkj_0 sAM = new fkj_0(7, "Est consid\u00e9r\u00e9 enemi de la nation (flag + aggro)");
    public static final /* enum */ fkj_0 sAN = new fkj_0(8, "Les Miliciens gagnent des bonus contre ce joueur");
    public static final /* enum */ fkj_0 sAO = new fkj_0(9, "Ne peut plus utiliser les zaaps de la nation");
    public static final /* enum */ fkj_0 sAP = new fkj_0(10, "DEPRECATED : Ne peut plus louer de points de vente de la nation");
    public static final /* enum */ fkj_0 sAQ = new fkj_0(11, "Ne peut plus acc\u00e9der \u00e0 son Havre-Sac");
    public static final /* enum */ fkj_0 sAR = new fkj_0(12, "Peut participer aux challenges");
    public static final /* enum */ fkj_0 sAS = new fkj_0(13, "Peut gagner des points de pvp");
    private final int sAT;
    private final String sAU;
    private static final /* synthetic */ fkj_0[] sAV;

    public static fkj_0[] values() {
        return (fkj_0[])sAV.clone();
    }

    public static fkj_0 valueOf(String string) {
        return Enum.valueOf(fkj_0.class, string);
    }

    private fkj_0(int n2, String string2) {
        this.sAT = n2;
        this.sAU = string2;
    }

    public int d() {
        return this.sAT;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.sAT);
    }

    @Override
    public String aXB() {
        return this.sAU;
    }

    @Override
    public String aXC() {
        return null;
    }

    public static fkj_0 WL(int n) {
        fkj_0[] fkj_0Array = fkj_0.values();
        for (int i = 0; i < fkj_0Array.length; ++i) {
            fkj_0 fkj_02 = fkj_0Array[i];
            if (fkj_02.sAT != n) continue;
            return fkj_02;
        }
        return null;
    }

    private static /* synthetic */ fkj_0[] gcf() {
        return new fkj_0[]{sAG, sAH, sAI, sAJ, sAK, sAL, sAM, sAN, sAO, sAP, sAQ, sAR, sAS};
    }

    static {
        sAV = fkj_0.gcf();
    }
}

