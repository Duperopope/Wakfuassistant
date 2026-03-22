/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public final class fgM
extends Enum<fgM>
implements aoq_1,
aoy_1 {
    public static final /* enum */ fgM skl = new fgM(2, fgN.slm, "Permet la plantation d'un item", false);
    public static final /* enum */ fgM skm = new fgM(3, fgN.sln, "Permet de jouer un Script", false);
    public static final /* enum */ fgM skn = new fgM(5, fgN.slp, "Permet de d\u00e9ployer un \u00e9l\u00e9ment interactif", false);
    public static final /* enum */ fgM sko = new fgM(6, fgN.slq, "Permet de spawn un monstre \u00e0 cot\u00e9 du joueur", false);
    public static final /* enum */ fgM skp = new fgM(7, fgN.slr, "Permet de lancer un sc\u00e9nario sur un joueur", false);
    public static final /* enum */ fgM skq = new fgM(8, fgN.sls, "Donne des kamas au joueur", false);
    public static final /* enum */ fgM skr = new fgM(9, fgN.slt, "T\u00e9l\u00e9porte un joueur", false);
    public static final /* enum */ fgM sks = new fgM(10, fgN.slu, "Donne un titre \u00e0 un joueur", false);
    public static final /* enum */ fgM skt = new fgM(11, fgN.slv, "Ouvre une interface background", false);
    public static final /* enum */ fgM sku = new fgM(12, fgN.slw, "Affiche le passeport", false);
    public static final /* enum */ fgM skv = new fgM(13, fgN.slx, "Apprend une Emote", false);
    public static final /* enum */ fgM skw = new fgM(15, fgN.sly, "Ajoute une boussole", false);
    public static final /* enum */ fgM skx = new fgM(16, fgN.sll, "r\u00e9duit de 1 les Malus de mort", false);
    public static final /* enum */ fgM sky = new fgM(17, fgN.slk, "Joue une emote", false);
    public static final /* enum */ fgM skz = new fgM(18, fgN.slj, "Active un exploit", false);
    public static final /* enum */ fgM skA = new fgM(19, fgN.sli, "Suit un exploit", false);
    public static final /* enum */ fgM skB = new fgM(20, fgN.slh, "Fusionne des items", false);
    public static final /* enum */ fgM skC = new fgM(21, fgN.slz, "Apprend une custom de Havre-Sac", false);
    public static final /* enum */ fgM skD = new fgM(23, fgN.slA, "Donne de l'xp au joueur", false);
    public static final /* enum */ fgM skE = new fgM(24, fgN.slB, "R\u00e9initialise un achievement", false);
    public static final /* enum */ fgM skF = new fgM(26, fgN.slC, "S\u00e9pare un objet \u00e9l\u00e9ments d'une panoplie", false);
    public static final /* enum */ fgM skG = new fgM(28, fgN.slD, "Donne un item dans la liste", false);
    public static final /* enum */ fgM skH = new fgM(31, fgN.slE, "Retour au point de respawn", false);
    public static final /* enum */ fgM skI = new fgM(33, fgN.slF, "Active un restat", false);
    public static final /* enum */ fgM skJ = new fgM(34, fgN.slH, "Active la recherche de tr\u00e9sor", false);
    public static final /* enum */ fgM skK = new fgM(36, fgN.slI, "Donne des items", false);
    public static final /* enum */ fgM skL = new fgM(37, fgN.slJ, "Change de nation", false);
    public static final /* enum */ fgM skM = new fgM(38, fgN.slK, "Tue les monstres dans un rayon", false);
    public static final /* enum */ fgM skN = new fgM(39, fgN.slL, "Active un compagnon", false);
    public static final /* enum */ fgM skO = new fgM(43, fgN.slN, "Lance la recustom d'un personnage", false);
    public static final /* enum */ fgM skP = new fgM(45, fgN.slP, "Diffuse un message aux joueurs pr\u00e9sents dans l'instance", false);
    public static final /* enum */ fgM skQ = new fgM(46, fgN.slS, "Rajoute des niveaux aux pets", false);
    public static final /* enum */ fgM skR = new fgM(47, fgN.slT, "Heal un pet", false);
    public static final /* enum */ fgM skS = new fgM(50, fgN.slU, "Roll de nouveaux \u00e9l\u00e9ments (effets \u00e0 \u00e9l\u00e9ts variables) pour cet item", false);
    public static final /* enum */ fgM skT = new fgM(52, fgN.slV, "Ouvre l'interface mimibiote", true);
    public static final /* enum */ fgM skU = new fgM(53, fgN.slW, "Apprend une recette au joueur", true);
    public static final /* enum */ fgM skV = new fgM(55, fgN.slX, "Apprend plusieurs recettes au joueur", true);
    public static final /* enum */ fgM skW = new fgM(56, fgN.slZ, "Applique le parchemin de sublimation", false);
    public static final /* enum */ fgM skX = new fgM(57, fgN.sma, "Converti un objet en un ensemble d'autres objets", false);
    public static final /* enum */ fgM skY = new fgM(59, fgN.slQ, "Apprend l'objet en tant qu'\u00e9l\u00e9ment cosm\u00e9tique", false);
    public static final /* enum */ fgM skZ = new fgM(60, fgN.smb, "Apprend l'apparence de l'objet cibl\u00e9 en tant qu'\u00e9l\u00e9ment cosm\u00e9tique", false);
    public static final /* enum */ fgM sla = new fgM(61, fgN.slR, "Apprend l'objet en tant que mobilier de compte", false);
    public static final List<fgM> slb;
    private final byte slc;
    private final String sld;
    private final aox_1 sle;
    private final boolean slf;
    private static final /* synthetic */ fgM[] slg;

    public static fgM[] values() {
        return (fgM[])slg.clone();
    }

    public static fgM valueOf(String string) {
        return Enum.valueOf(fgM.class, string);
    }

    private fgM(int n2, aox_1 aox_12, String string2, boolean bl) {
        this.slc = (byte)n2;
        this.sld = string2;
        this.sle = aox_12;
        this.slf = bl;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.slc);
    }

    @Override
    public String aXB() {
        return this.sld;
    }

    public boolean fXs() {
        return this.slf;
    }

    public static fgM Vg(int n) {
        for (fgM fgM2 : fgM.values()) {
            if (fgM2.slc != n) continue;
            return fgM2;
        }
        return null;
    }

    @Override
    public aox_1 bEt() {
        return this.sle;
    }

    @Override
    public String aXC() {
        return null;
    }

    public byte aJr() {
        return this.slc;
    }

    private static /* synthetic */ fgM[] fXt() {
        return new fgM[]{skl, skm, skn, sko, skp, skq, skr, sks, skt, sku, skv, skw, skx, sky, skz, skA, skB, skC, skD, skE, skF, skG, skH, skI, skJ, skK, skL, skM, skN, skO, skP, skQ, skR, skS, skT, skU, skV, skW, skX, skY, skZ, sla};
    }

    static {
        slg = fgM.fXt();
        slb = List.of(skZ);
    }
}

