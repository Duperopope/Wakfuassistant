/*
 * Decompiled with CFR 0.152.
 */
public class eQi
extends eqc_0 {
    public static final int rfq = 0;
    public static final int rfr = 1;
    public static final int rfs = 2;
    public static final int rft = 3;
    public static final int rfu = 4;
    private static final aox_1 rfv = new enz_0(new eny_0("Niveau des effets du groupe bas\u00e9 sur une caract\u00e9ristique : la carac sert de 'faux niveau'", new enx_0("nb maximum d'effect \u00e0 executer", eNA.qYC), new enx_0("avec r\u00e9ussite (1 : oui, 0 : non = standard", eNA.qYD), new enx_0("0 = cellule, 1 = cibles (default)", eNA.qYD), new enx_0("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", eNA.qYD), new enx_0("Transmission de la cible originale aux effets du groupe : oui = 1 (d\u00e9faut), non = 0 ", eNA.qYD), new enx_0("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (d\u00e9faut)", eNA.qYD), new enx_0("Id de a Charact\u00e9ristique \u00e0 regarder", eNA.qYD), new enx_0("Charac prise sur Target = 0 (defaut), Caster = 1", eNA.qYD), new enx_0("Niveau : Base", eNA.qYC), new enx_0("Niveau : Incr\u00e9ment par point de charac", eNA.qYC)), new eny_0("Niveau des effets du groupe bas\u00e9 sur une caract\u00e9ristique : niveau par paliers de la carac (+1 tous les x carac)", new enx_0("nb maximum d'effect \u00e0 executer", eNA.qYC), new enx_0("avec r\u00e9ussite (1 : oui, 0 : non = standard", eNA.qYD), new enx_0("0 = cellule, 1 = cibles (default)", eNA.qYD), new enx_0("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", eNA.qYD), new enx_0("Transmission de la cible originale aux effets du groupe : oui = 1 (d\u00e9faut), non = 0 ", eNA.qYD), new enx_0("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (d\u00e9faut)", eNA.qYD), new enx_0("Id de a Charact\u00e9ristique \u00e0 regarder", eNA.qYD), new enx_0("Charac prise sur Target = 0 (defaut), Caster = 1", eNA.qYD), new enx_0("Palier de Charac pour avoir +1 niveau", eNA.qYC)), new eny_0("Niveau des effets du groupe bas\u00e9 sur une caract\u00e9ristique (ou son max) : la carac sert de 'faux niveau'", new enx_0("nb maximum d'effect \u00e0 executer", eNA.qYC), new enx_0("avec r\u00e9ussite (1 : oui, 0 : non = standard", eNA.qYD), new enx_0("0 = cellule, 1 = cibles (default)", eNA.qYD), new enx_0("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", eNA.qYD), new enx_0("Transmission de la cible originale aux effets du groupe : oui = 1 (d\u00e9faut), non = 0 ", eNA.qYD), new enx_0("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (d\u00e9faut)", eNA.qYD), new enx_0("Id de a Charact\u00e9ristique \u00e0 regarder", eNA.qYD), new enx_0("Charac prise sur Target = 0 (defaut), Caster = 1", eNA.qYD), new enx_0("Niveau : Base", eNA.qYC), new enx_0("Niveau : Incr\u00e9ment par point de charac", eNA.qYC), new enx_0("Valeur \u00e0 utiliser (default: 0=valeur courante, 1=maximum, 2=valeur courante en %, 3=valeur manquante en %), 4=valeur manquante )", eNA.qYD)), new eny_0("Niveau des effets du groupe bas\u00e9 sur une caract\u00e9ristique (ou son max) : Modifier le type d'arrondi pour le calcul de la valeur finale", new enx_0("nb maximum d'effect \u00e0 executer", eNA.qYC), new enx_0("avec r\u00e9ussite (1 : oui, 0 : non = standard", eNA.qYD), new enx_0("0 = cellule, 1 = cibles (default)", eNA.qYD), new enx_0("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", eNA.qYD), new enx_0("Transmission de la cible originale aux effets du groupe : oui = 1 (d\u00e9faut), non = 0 ", eNA.qYD), new enx_0("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (d\u00e9faut)", eNA.qYD), new enx_0("Id de a Charact\u00e9ristique \u00e0 regarder", eNA.qYD), new enx_0("Charac prise sur Target = 0 (defaut), Caster = 1", eNA.qYD), new enx_0("Niveau : Base", eNA.qYC), new enx_0("Niveau : Incr\u00e9ment par point de charac", eNA.qYC), new enx_0("Valeur \u00e0 utiliser (default: 0=valeur courante, 1=maximum, 2=valeur courante en %, 3=valeur manquante en %), 4=valeur manquante )", eNA.qYD), new enx_0("Mode d'arrondi du niveau : 1=round (d\u00e9faut), 2=floor, 3=ceil", eNA.qYD)));
    private exx_2 rfw;
    protected boolean rfm = false;
    protected boolean rfx = false;
    protected int rfy;
    protected float rfn;
    protected float rfo;
    protected int rfz = 0;
    protected ene_0 rfA = ene_0.qPv;

    @Override
    public aox_1 bEt() {
        return rfv;
    }

    public eQi() {
        this.bby();
    }

    public eQi fFs() {
        return new eQi();
    }

    @Override
    public void E(QD qD) {
        if (this.bgC == null) {
            return;
        }
        super.E(qD);
        int n = ((enk_0)this.bgC).a(6, this.fHf(), ene_0.qPu);
        this.rfw = exx_2.c((byte)n);
        this.rfz = 0;
        if (this.rfw == null) {
            bgA.error((Object)("Unable to get characteristic with id " + n));
        }
        boolean bl = this.rfm = ((enk_0)this.bgC).a(7, this.fHf(), ene_0.qPu) == 1;
        if (((enk_0)this.bgC).fAn() == 9) {
            this.rfx = true;
            this.rfy = ((enk_0)this.bgC).a(8, this.fHf(), ene_0.qPu);
        } else {
            this.rfx = false;
            this.rfn = ((enk_0)this.bgC).x(8, this.fHf());
            this.rfo = ((enk_0)this.bgC).x(9, this.fHf());
            if (((enk_0)this.bgC).fAn() >= 11) {
                this.rfz = ((enk_0)this.bgC).a(10, this.fHf(), ene_0.qPu);
            }
            if (((enk_0)this.bgC).fAn() >= 12) {
                this.rfA = ene_0.RO(((enk_0)this.bgC).a(11, this.fHf(), ene_0.qPu));
            }
        }
    }

    @Override
    public enq_0 d(ero_0 ero_02, boolean bl) {
        int n;
        enq_0 enq_02 = super.d(ero_02, bl);
        if (this.rfw == null) {
            return enq_02;
        }
        qu_0 qu_02 = this.rfm ? this.bgE : this.bgF;
        if (qu_02 == null) {
            return enq_02;
        }
        pr_0 pr_02 = qu_02.b(this.rfw);
        int n2 = pr_02 != null ? (this.rfz == 1 ? pr_02.aYD() : (this.rfz == 2 ? pr_02.aYB() * 100 / pr_02.aYD() : (this.rfz == 3 ? (pr_02.aYD() - pr_02.aYB()) * 100 / pr_02.aYD() : (this.rfz == 4 ? pr_02.aYD() - pr_02.aYB() : pr_02.aYB())))) : 0;
        if (this.rfx) {
            n = this.rfy == 0 ? n2 : (int)Math.floor((float)n2 / (float)this.rfy);
        } else {
            switch (this.rfA) {
                case qPx: {
                    n = (int)Math.ceil(this.rfn + this.rfo * (float)n2);
                    break;
                }
                case qPw: {
                    n = (int)Math.floor(this.rfn + this.rfo * (float)n2);
                    break;
                }
                default: {
                    n = Math.round(this.rfn + this.rfo * (float)n2);
                }
            }
        }
        enq_02.RT(n);
        return enq_02;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.rfw = null;
        this.rfz = 0;
    }

    @Override
    public /* synthetic */ eqc_0 fES() {
        return this.fFs();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fFs();
    }
}

