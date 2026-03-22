/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fgg
 */
public final class fgg_0
extends Enum<fgg_0>
implements aoq_1 {
    public static final /* enum */ fgg_0 shZ = new fgg_0(1, "Objet tr\u00e9sor (interface sp\u00e9ciale)");
    public static final /* enum */ fgg_0 sia = new fgg_0(2, "Objet de qu\u00eate");
    public static final /* enum */ fgg_0 sib = new fgg_0(3, "Prend la couleur de la guilde");
    public static final /* enum */ fgg_0 sic = new fgg_0(4, "Ne peut pas \u00eatre drop\u00e9 par la bourse enutrof");
    public static final /* enum */ fgg_0 sid = new fgg_0(5, "Livre qui peut \u00eatre plac\u00e9 dans une biblioth\u00e8que");
    public static final /* enum */ fgg_0 sie = new fgg_0(6, "Cet item ne demande pas les feedbacks sur les actions qu'il d\u00e9clenche (plantation)");
    public static final /* enum */ fgg_0 sif = new fgg_0(7, "Item propos\u00e9 uniquement au shop");
    public static final /* enum */ fgg_0 sig = new fgg_0(8, "[Relique] Il ne peut y avoir qu'un seul Item ayant cette propri\u00e9t\u00e9 \u00e9quip\u00e9 \u00e0 la fois");
    public static final /* enum */ fgg_0 sih = new fgg_0(9, "Au drop de l'item, un \u00e9v\u00e8nement de jeu est cr\u00e9\u00e9 (pour les qu\u00eates et les scenarios)");
    public static final /* enum */ fgg_0 sii = new fgg_0(10, "Pas de jet bonus de loot pour cet item");
    public static final /* enum */ fgg_0 sij = new fgg_0(11, "1 xp = 1 level, level max = 32000 et ne gagne de l'xp uniquement via la commande admin");
    public static final /* enum */ fgg_0 sik = new fgg_0(12, "[Relique2] Il ne peut y avoir qu'un seul Item ayant cette propri\u00e9t\u00e9 \u00e9quip\u00e9 \u00e0 la fois");
    public static final /* enum */ fgg_0 sil = new fgg_0(13, "L'objet ne peut pas \u00eatre recycl\u00e9");
    public static final /* enum */ fgg_0 sim = new fgg_0(14, "L'objet n'est pas consomm\u00e9 \u00e0 l'utilisation (avec effets uniquement)");
    public static final /* enum */ fgg_0 sin = new fgg_0(15, "N'est pas soumis \u00e0 la condition de niveau pour pouvoir runer des gemmes");
    public static final /* enum */ fgg_0 sio = new fgg_0(16, "La difficult\u00e9 Stasis augmente le nombre de tentatives de loot sur les Transmutations");
    public static final /* enum */ fgg_0 sip = new fgg_0(17, "La difficult\u00e9 Stasis augmente le nombre de tentatives de loot sur les Ressources de Boss");
    public static final /* enum */ fgg_0 siq = new fgg_0(18, "Cache l'objet dans la liste de ressources r\u00e9coltables ou craftables d'un m\u00e9tier");
    public static final /* enum */ fgg_0 sir = new fgg_0(19, "Ajoute un slot de gemme \u00e9pique \u00e0 un objet");
    public static final /* enum */ fgg_0 sis = new fgg_0(20, "Ajoute un slot de gemme relique \u00e0 un objet ");
    public static final /* enum */ fgg_0 sit = new fgg_0(21, "Objet de qu\u00eate li\u00e9 au compte");
    public static final /* enum */ fgg_0 siu = new fgg_0(22, "Objet cach\u00e9 (Applicable qu'aux objets de qu\u00eates)");
    public static final /* enum */ fgg_0 siv = new fgg_0(23, "Objet exclus des listes d'objets comme l'auto compl\u00e9tion ou les offres d'achat");
    public static final /* enum */ fgg_0 siw = new fgg_0(24, "Objet exclus de l'encyclop\u00e9die in-game");
    private final int six;
    private final String siy;
    private static final /* synthetic */ fgg_0[] siz;

    public static fgg_0[] values() {
        return (fgg_0[])siz.clone();
    }

    public static fgg_0 valueOf(String string) {
        return Enum.valueOf(fgg_0.class, string);
    }

    private fgg_0(int n2, String string2) {
        this.six = n2;
        this.siy = string2;
    }

    @Nullable
    public static fgg_0 UZ(int n) {
        for (fgg_0 fgg_02 : fgg_0.values()) {
            if (fgg_02.six != n) continue;
            return fgg_02;
        }
        return null;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.six);
    }

    public int d() {
        return this.six;
    }

    @Override
    public String aXB() {
        return this.siy;
    }

    @Override
    public String aXC() {
        return this.siy;
    }

    private static /* synthetic */ fgg_0[] fWJ() {
        return new fgg_0[]{shZ, sia, sib, sic, sid, sie, sif, sig, sih, sii, sij, sik, sil, sim, sin, sio, sip, siq, sir, sis, sit, siu, siv, siw};
    }

    static {
        siz = fgg_0.fWJ();
    }
}

