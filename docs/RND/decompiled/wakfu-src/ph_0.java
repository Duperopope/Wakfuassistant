/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Ph
 */
public final class ph_0
extends Enum<ph_0>
implements aoq_1 {
    public static final /* enum */ ph_0 bcR = new ph_0(1, "Son", pe_0.class);
    public static final /* enum */ ph_0 bcS = new ph_0(2, "Particules", pb_0.class);
    public static final /* enum */ ph_0 bcT = new ph_0(3, "Lumiere", pz_0.class);
    public static final /* enum */ ph_0 bcU = new ph_0(4, "Changement d'Apparance", po_0.class);
    public static final /* enum */ ph_0 bcV = new ph_0(5, "Tremblement de la camera", pj_0.class);
    public static final /* enum */ ph_0 bcW = new ph_0(6, "Changement d'une(des) partie(s) venant d'un autre skin", Pu.class);
    public static final /* enum */ ph_0 bcX = new ph_0(8, "Changement de couleur de parties", Ps.class);
    public static final /* enum */ ph_0 bcY = new ph_0(9, "Changement du suffixe des anim", pn_0.class);
    public static final /* enum */ ph_0 bcZ = new ph_0(10, "Changement de l'anim statique", pm_0.class);
    public static final /* enum */ ph_0 bda = new ph_0(11, "Affihe/masque une(des) partie(s)", pf_0.class);
    public static final /* enum */ ph_0 bdb = new ph_0(12, "Passe des valeurs aux interfaces", pd_0.class);
    public static final /* enum */ ph_0 bdc = new ph_0(13, "Attache un mobile au point d'accroche LienClip", pa_0.class);
    public static final /* enum */ ph_0 bdd = new ph_0(14, "Applique une anim", pk_0.class);
    public static final /* enum */ ph_0 bde = new ph_0(15, "Incr\u00e9mente l'altitude", py_0.class);
    public static final /* enum */ ph_0 bdf = new ph_0(16, "Change le style de mouvement", pq_0.class);
    public static final /* enum */ ph_0 bdg = new ph_0(17, "Applique l'apparence d'un monstre", pc_0.class);
    public static final /* enum */ ph_0 bdh = new ph_0(18, "Masque tous les \u00e9quipements du joueur", Px.class);
    public static final /* enum */ ph_0 bdi = new ph_0(19, "Costumes - Insignes", Pv.class);
    public static final /* enum */ ph_0 bdj = new ph_0(20, "Change l'anim de course", pl_0.class);
    public static final /* enum */ ph_0 bdk = new ph_0(21, "Change la taille du mobile", Pr.class);
    public static final /* enum */ ph_0 bdl = new ph_0(22, "Ajoute un mobile qui va suivre le caster", pi_0.class);
    public static final /* enum */ ph_0 bdm = new ph_0(23, "Change la hauteur du mobile", pp_0.class);
    private final byte bdn;
    private final String bdo;
    private final Class<? extends Pf> bdp;
    private static final /* synthetic */ ph_0[] bdq;

    public static ph_0[] values() {
        return (ph_0[])bdq.clone();
    }

    public static ph_0 valueOf(String string) {
        return Enum.valueOf(ph_0.class, string);
    }

    public static ph_0 G(byte by) {
        for (ph_0 ph_02 : ph_0.values()) {
            if (by != ph_02.bdn) continue;
            return ph_02;
        }
        throw new IllegalArgumentException("HMIActionType inconnu : '" + by + "'");
    }

    private ph_0(byte by, String string2, Class<? extends Pf> clazz) {
        this.bdn = by;
        this.bdo = string2;
        this.bdp = clazz;
    }

    public short aIi() {
        return this.bdn;
    }

    public String getLabel() {
        return this.bdo;
    }

    public Class<? extends Pf> aXz() {
        return this.bdp;
    }

    @Override
    public String aXA() {
        return Short.toString(this.aIi());
    }

    @Override
    public String aXB() {
        return this.getLabel();
    }

    @Override
    public String aXC() {
        return this.getLabel();
    }

    private static /* synthetic */ ph_0[] aXD() {
        return new ph_0[]{bcR, bcS, bcT, bcU, bcV, bcW, bcX, bcY, bcZ, bda, bdb, bdc, bdd, bde, bdf, bdg, bdh, bdi, bdj, bdk, bdl, bdm};
    }

    static {
        bdq = ph_0.aXD();
    }
}

