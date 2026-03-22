/*
 * Decompiled with CFR 0.152.
 */
public final class fqS
extends Enum<fqS>
implements aoq_1 {
    public static final /* enum */ fqS sWb = new fqS(1, "Sort feu");
    public static final /* enum */ fqS sWc = new fqS(2, "Sort eau");
    public static final /* enum */ fqS sWd = new fqS(3, "Sort terre");
    public static final /* enum */ fqS sWe = new fqS(4, "Sort air");
    public static final /* enum */ fqS sWf = new fqS(5, "Sort de d\u00e9placement");
    public static final /* enum */ fqS sWg = new fqS(6, "Sort de t\u00e9l\u00e9portation");
    public static final /* enum */ fqS sWh = new fqS(7, "Sort de d\u00e9gagement");
    public static final /* enum */ fqS sWi = new fqS(8, "Sort monocible");
    public static final /* enum */ fqS sWj = new fqS(9, "Sort de zone");
    public static final /* enum */ fqS sWk = new fqS(10, "Sort de mel\u00e9e");
    public static final /* enum */ fqS sWl = new fqS(11, "Sort \u00e0 distance");
    public static final /* enum */ fqS sWm = new fqS(12, "Sort utilisable avec les portails");
    public static final /* enum */ fqS sWn = new fqS(13, "On n'affiche rien pour les cellules invalides dans l'aper\u00e7u de la zone de lancement du sort");
    public static final /* enum */ fqS sWo = new fqS(14, "Les portails de la team sont ciblables, quels que soient la port\u00e9e et la ligne de vue");
    public static final /* enum */ fqS sWp = new fqS(15, "Sort valide uniquement sur le portail de sortie si il utilise un portail d'entr\u00e9e");
    public static final /* enum */ fqS sWq = new fqS(16, "Sort valide sur les heures du Xelor quelque soit la PO et le Rang");
    public static final /* enum */ fqS sWr = new fqS(17, "Sort de lumi\u00e8re : Utilise le symbole de l'\u00e9l\u00e9ment lumi\u00e8re dans la description/Est consid\u00e9r\u00e9 comme sort de lumi\u00e8re par IsActivatedByElement");
    public static final /* enum */ fqS sWs = new fqS(18, "Sort ne pouvant faire d'\u00e9chec critique");
    private final int sWt;
    private final String sWu;
    private static final /* synthetic */ fqS[] sWv;

    public static fqS[] values() {
        return (fqS[])sWv.clone();
    }

    public static fqS valueOf(String string) {
        return Enum.valueOf(fqS.class, string);
    }

    private fqS(int n2, String string2) {
        this.sWt = n2;
        this.sWu = string2;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.sWt);
    }

    @Override
    public String aXB() {
        return this.sWu;
    }

    @Override
    public String aXC() {
        return null;
    }

    public static fqS Zk(int n) {
        for (fqS fqS2 : fqS.values()) {
            if (fqS2.sWt != n) continue;
            return fqS2;
        }
        return null;
    }

    private static /* synthetic */ fqS[] gjt() {
        return new fqS[]{sWb, sWc, sWd, sWe, sWf, sWg, sWh, sWi, sWj, sWk, sWl, sWm, sWn, sWo, sWp, sWq, sWr, sWs};
    }

    static {
        sWv = fqS.gjt();
    }
}

