/*
 * Decompiled with CFR 0.152.
 */
public class eQr
extends eqc_0 {
    private static final aox_1 rfL = new enz_0(new eny_0("Niveau des effets du groupe bas\u00e9 sur une application d'\u00e9tat : le niveau de l'\u00e9tat sert de 'faux niveau'", new enx_0("nb maximum d'effect \u00e0 executer", eNA.qYC), new enx_0("avec r\u00e9ussite (1 : oui, 0 : non = standard", eNA.qYD), new enx_0("0 = cellule, 1 = cibles (default)", eNA.qYD), new enx_0("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", eNA.qYD), new enx_0("Transmission de la cible originale aux effets du groupe : oui = 1 (d\u00e9faut), non = 0 ", eNA.qYD), new enx_0("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (d\u00e9faut)", eNA.qYD), new enx_0("Niveau : Base", eNA.qYC), new enx_0("Niveau : Incr\u00e9ment par niveau de l'\u00e9tat", eNA.qYC)), new eny_0("Niveau des effets du groupe bas\u00e9 sur une application d'\u00e9tat : niveau par paliers de la carac (+1 tous les x niveaux de l'\u00e9tat)", new enx_0("nb maximum d'effect \u00e0 executer", eNA.qYC), new enx_0("avec r\u00e9ussite (1 : oui, 0 : non = standard", eNA.qYD), new enx_0("0 = cellule, 1 = cibles (default)", eNA.qYD), new enx_0("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", eNA.qYD), new enx_0("Transmission de la cible originale aux effets du groupe : oui = 1 (d\u00e9faut), non = 0 ", eNA.qYD), new enx_0("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (d\u00e9faut)", eNA.qYD), new enx_0("Palier de Charac pour avoir +1 niveau", eNA.qYC)));
    protected boolean rfx;
    protected int rfM;
    protected float rfn;
    protected float rfo;

    @Override
    public aox_1 bEt() {
        return rfL;
    }

    public eQr() {
        this.bby();
    }

    public eQr fFz() {
        return new eQr();
    }

    @Override
    public void E(QD qD) {
        if (this.bgC == null) {
            return;
        }
        super.E(qD);
        if (((enk_0)this.bgC).fAn() == 7) {
            this.rfx = true;
            this.rfM = ((enk_0)this.bgC).a(6, this.fHf(), ene_0.qPu);
        } else {
            this.rfx = false;
            this.rfn = ((enk_0)this.bgC).x(6, this.fHf());
            this.rfo = ((enk_0)this.bgC).x(7, this.fHf());
        }
    }

    @Override
    public enq_0 d(ero_0 ero_02, boolean bl) {
        enq_0 enq_02 = super.d(ero_02, bl);
        QD qD = this.L(ero_02);
        if (!(qD instanceof eor_0)) {
            throw new IllegalStateException("Cet effet doit \u00eatre d\u00e9clench\u00e9 par une application d'\u00e9tat");
        }
        int n = ((eor_0)qD).fCx();
        int n2 = this.rfx ? (this.rfM == 0 ? n : (int)Math.floor((float)n / (float)this.rfM)) : Math.round(this.rfn + this.rfo * (float)n);
        enq_02.RT(n2);
        return enq_02;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.rfx = false;
        this.rfM = 0;
        this.rfn = 0.0f;
        this.rfo = 0.0f;
    }

    @Override
    public /* synthetic */ eqc_0 fES() {
        return this.fFz();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fFz();
    }
}

