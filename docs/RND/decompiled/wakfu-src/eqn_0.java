/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eQn
 */
public final class eqn_0
extends eqc_0 {
    private static final aox_1 rfF = new enz_0(new eny_0("Transmet le niveau de l'etat de la cible aux effets enfants du groupe", new enx_0("nb maximum d'effect \u00e0 executer", eNA.qYC), new enx_0("avec r\u00e9ussite (1 : oui, 0 : non = standard", eNA.qYD), new enx_0("0 = cellule, 1 = cibles (default)", eNA.qYD), new enx_0("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", eNA.qYD), new enx_0("Transmission de la cible originale aux effets du groupe : oui = 1 (d\u00e9faut), non = 0 ", eNA.qYD), new enx_0("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (d\u00e9faut)", eNA.qYD), new enx_0("Id de l'\u00e9tat \u00e0 consulter", eNA.qYD)), new eny_0("Transmet le niveau de l'etat aux effets enfants du groupe - Etat sur Target ou Caster", new enx_0("nb maximum d'effect \u00e0 executer", eNA.qYC), new enx_0("avec r\u00e9ussite (1 : oui, 0 : non = standard", eNA.qYD), new enx_0("0 = cellule, 1 = cibles (default)", eNA.qYD), new enx_0("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", eNA.qYD), new enx_0("Transmission de la cible originale aux effets du groupe : oui = 1 (d\u00e9faut), non = 0 ", eNA.qYD), new enx_0("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (d\u00e9faut)", eNA.qYD), new enx_0("Id de l'\u00e9tat \u00e0 consulter", eNA.qYD), new enx_0("Check on Target = 0 (defaut), Caster = 1", eNA.qYD)), new eny_0("Transmet le niveau de l'etat aux effets enfants du groupe - Choix de l'incr\u00e9ment par niveau de l'\u00e9tat", new enx_0("nb maximum d'effect \u00e0 executer", eNA.qYC), new enx_0("avec r\u00e9ussite (1 : oui, 0 : non = standard", eNA.qYD), new enx_0("0 = cellule, 1 = cibles (default)", eNA.qYD), new enx_0("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", eNA.qYD), new enx_0("Transmission de la cible originale aux effets du groupe : oui = 1 (d\u00e9faut), non = 0 ", eNA.qYD), new enx_0("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (d\u00e9faut)", eNA.qYD), new enx_0("Id de l'\u00e9tat \u00e0 consulter", eNA.qYD), new enx_0("Check on Target = 0 (defaut), Caster = 1", eNA.qYD), new enx_0("Niveau : Incr\u00e9ment pour 1 niveau de l'\u00e9tat", eNA.qYD)), new eny_0("Transmet le niveau de l'etat aux effets enfants du groupe - Niveau de base", new enx_0("nb maximum d'effect \u00e0 executer", eNA.qYC), new enx_0("avec r\u00e9ussite (1 : oui, 0 : non = standard", eNA.qYD), new enx_0("0 = cellule, 1 = cibles (default)", eNA.qYD), new enx_0("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", eNA.qYD), new enx_0("Transmission de la cible originale aux effets du groupe : oui = 1 (d\u00e9faut), non = 0 ", eNA.qYD), new enx_0("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (d\u00e9faut)", eNA.qYD), new enx_0("Id de l'\u00e9tat \u00e0 consulter", eNA.qYD), new enx_0("Check on Target = 0 (defaut), Caster = 1", eNA.qYD), new enx_0("Niveau : Incr\u00e9ment pour 1 niveau de l'\u00e9tat", eNA.qYD), new enx_0("Niveau : Niveau de base", eNA.qYD)));
    private int ekg;
    private float rfn;
    private float rfo = 1.0f;
    private boolean rfm;

    @Override
    public aox_1 bEt() {
        return rfF;
    }

    public eqn_0() {
        this.bby();
    }

    public eqn_0 fFw() {
        return new eqn_0();
    }

    @Override
    public void E(QD qD) {
        if (this.bgC == null) {
            return;
        }
        super.E(qD);
        this.ekg = ((enk_0)this.bgC).a(6, this.fHf(), ene_0.qPu);
        if (((enk_0)this.bgC).fAn() >= 8) {
            this.rfm = ((enk_0)this.bgC).a(7, this.fHf(), ene_0.qPu) == 1;
        }
        this.rfo = ((enk_0)this.bgC).fAn() >= 9 ? ((enk_0)this.bgC).x(8, this.fHf()) : 1.0f;
        if (((enk_0)this.bgC).fAn() >= 10) {
            this.rfn = ((enk_0)this.bgC).a(9, this.fHf(), ene_0.qPu);
        }
    }

    @Override
    public enq_0 d(ero_0 ero_02, boolean bl) {
        qu_0 qu_02;
        enq_0 enq_02 = super.d(ero_02, bl);
        qu_0 qu_03 = qu_02 = this.rfm ? this.bgE : this.bgF;
        if (qu_02 == null) {
            return enq_02;
        }
        QE qE = qu_02.baz();
        if (qE != null) {
            for (QD qD : qE) {
                fqU fqU2;
                if (!(qD instanceof erh_0) || (fqU2 = ((erh_0)qD).fGk()).gjy() != this.ekg) continue;
                int n = (int)Math.floor(this.rfn + this.rfo * (float)fqU2.cmL());
                enq_02.RT(n);
                return enq_02;
            }
        }
        if (((enk_0)this.bgC).fAn() >= 10) {
            enq_02.RT((int)Math.floor(this.rfn));
        }
        return enq_02;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.ekg = -1;
        this.rfm = false;
        this.rfn = 0.0f;
        this.rfo = 1.0f;
    }

    @Override
    public /* synthetic */ eqc_0 fES() {
        return this.fFw();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fFw();
    }
}

