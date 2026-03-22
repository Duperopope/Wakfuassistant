/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eQh
 */
public final class eqh_0
extends eqc_0 {
    private static final aox_1 rfl = new enz_0(new eny_0("Niveau des effets du groupe bas\u00e9 sur une caract\u00e9ristique : la carac sert de 'faux niveau'", new enx_0("nb maximum d'effect \u00e0 executer", eNA.qYC), new enx_0("avec r\u00e9ussite (1 : oui, 0 : non = standard", eNA.qYD), new enx_0("0 = cellule, 1 = cibles (default)", eNA.qYD), new enx_0("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", eNA.qYD), new enx_0("Transmission de la cible originale aux effets du groupe : oui = 1 (d\u00e9faut), non = 0 ", eNA.qYD), new enx_0("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (d\u00e9faut)", eNA.qYD), new enx_0("Charac prise sur Target = 0 (defaut), Caster = 1", eNA.qYD), new enx_0("Ratio en % (100 = 100% du niveau du personnage)", eNA.qYC)), new eny_0("Niveau des effets du groupe bas\u00e9 sur une caract\u00e9ristique : la carac sert de 'faux niveau'", new enx_0("nb maximum d'effect \u00e0 executer", eNA.qYC), new enx_0("avec r\u00e9ussite (1 : oui, 0 : non = standard", eNA.qYD), new enx_0("0 = cellule, 1 = cibles (default)", eNA.qYD), new enx_0("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", eNA.qYD), new enx_0("Transmission de la cible originale aux effets du groupe : oui = 1 (d\u00e9faut), non = 0 ", eNA.qYD), new enx_0("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (d\u00e9faut)", eNA.qYD), new enx_0("Charac prise sur Target = 0 (defaut), Caster = 1", eNA.qYD), new enx_0("Ratio en % appliqu\u00e9 \u00e0 l'incr\u00e9ment (100 = 100% du niveau du personnage)", eNA.qYC), new enx_0("Niveau : Base du niveau", eNA.qYC), new enx_0("Niveau : Incr\u00e9ment par niveau du personnage", eNA.qYC)));
    private boolean rfm = false;
    private float rfn;
    private float rfo = 1.0f;
    private int rfp;

    @Override
    public aox_1 bEt() {
        return rfl;
    }

    public eqh_0() {
        this.bby();
    }

    public eqh_0 fFr() {
        eqh_0 eqh_02 = new eqh_0();
        eqh_02.rfp = this.rfp;
        eqh_02.rfm = this.rfm;
        eqh_02.rfn = this.rfn;
        eqh_02.rfo = this.rfo;
        return eqh_02;
    }

    @Override
    public void E(QD qD) {
        if (this.bgC == null) {
            return;
        }
        super.E(qD);
        this.rfm = ((enk_0)this.bgC).a(6, this.fHf(), ene_0.qPu) == 1;
        this.rfp = ((enk_0)this.bgC).a(7, this.fHf(), ene_0.qPu);
        if (((enk_0)this.bgC).fAn() < 10) {
            this.rfn = 0.0f;
            this.rfo = 1.0f;
        } else {
            this.rfn = ((enk_0)this.bgC).x(8, this.fHf());
            this.rfo = ((enk_0)this.bgC).x(9, this.fHf());
        }
    }

    @Override
    public enq_0 d(ero_0 ero_02, boolean bl) {
        enq_0 enq_02 = super.d(ero_02, bl);
        qu_0 qu_02 = this.rfm ? this.bgE : this.bgF;
        if (!(qu_02 instanceof exP)) {
            return enq_02;
        }
        int n = ((exP)qu_02).cmL();
        n = n * this.rfp / 100;
        n = (int)Math.floor(this.rfn + this.rfo * (float)n);
        enq_02.RT(n);
        return enq_02;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.rfp = 0;
        this.rfn = 0.0f;
        this.rfo = 1.0f;
    }

    @Override
    public /* synthetic */ eqc_0 fES() {
        return this.fFr();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fFr();
    }
}

