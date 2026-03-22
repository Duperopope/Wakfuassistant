/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eTl
 */
public final class etl_0
extends Enum<etl_0>
implements pv_0,
aoq_1 {
    public static final /* enum */ etl_0 rmY = new etl_0(0, "Stoppe le mouvement");
    public static final /* enum */ etl_0 rmZ = new etl_0(1, "Ne peut pas \u00eatre activ\u00e9e par les alli\u00e9s");
    public static final /* enum */ etl_0 rna = new etl_0(2, "L'IA \u00e9vite d'aller sur la zone");
    public static final /* enum */ etl_0 rnb = new etl_0(3, "Zone non n\u00e9gative pour l'\u00e9quipe rouge");
    public static final /* enum */ etl_0 rnc = new etl_0(4, "Invisible pour les ennemis");
    public static final /* enum */ etl_0 rnd = new etl_0(5, "Le propri\u00e9taire de la zone est le caster des effets (pas fonctionnel sur toutes les zones, cf getLauncher()).");
    public static final /* enum */ etl_0 rne = new etl_0(6, "L'ia essaie de terminer son tour sur cette zone");
    public static final /* enum */ etl_0 rnf = new etl_0(7, "Ne r\u00e9duit pas les HPLoss \u00e0 0");
    public static final /* enum */ etl_0 rng = new etl_0(8, "N'affiche pas l'overhead de la zone");
    public static final /* enum */ etl_0 rnh = new etl_0(9, "Prend en compte les d\u00e9g\u00e2ts \u00e9l\u00e9mentaires et secondaires  du caster (pi\u00e8ges uniquement)");
    public static final /* enum */ etl_0 rni = new etl_0(10, "Ne bloque plus les lignes de vue");
    public static final /* enum */ etl_0 rnj = new etl_0(11, "Balise Cra");
    public static final /* enum */ etl_0 rnk = new etl_0(12, "Force un RunningEffectManager");
    public static final /* enum */ etl_0 rnl = new etl_0(13, "Rend l'alpha des cellules de la zone d'effet transparent");
    public static final /* enum */ etl_0 rnm = new etl_0(14, "N'attend pas la dur\u00e9e de l'animation lors de la destruction de la zone");
    private final byte rnn;
    private final String rno;
    private static final /* synthetic */ etl_0[] rnp;

    public static etl_0[] values() {
        return (etl_0[])rnp.clone();
    }

    public static etl_0 valueOf(String string) {
        return Enum.valueOf(etl_0.class, string);
    }

    private etl_0(byte by, String string2) {
        this.rnn = by;
        this.rno = string2;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.rnn);
    }

    @Override
    public String aXB() {
        return this.rno;
    }

    @Override
    public String aXC() {
        return null;
    }

    @Override
    public byte aJr() {
        return this.rnn;
    }

    @Override
    public byte aZd() {
        return 4;
    }

    public static etl_0 Sq(int n) {
        for (etl_0 etl_02 : etl_0.values()) {
            if (etl_02.rnn != n) continue;
            return etl_02;
        }
        return null;
    }

    private static /* synthetic */ etl_0[] fIX() {
        return new etl_0[]{rmY, rmZ, rna, rnb, rnc, rnd, rne, rnf, rng, rnh, rni, rnj, rnk, rnl, rnm};
    }

    static {
        rnp = etl_0.fIX();
    }
}

