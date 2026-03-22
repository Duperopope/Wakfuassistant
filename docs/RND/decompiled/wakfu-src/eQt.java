/*
 * Decompiled with CFR 0.152.
 */
public final class eQt
extends eqc_0 {
    private static final aox_1 rfO = new enz_0(new eny_0("groupe d'effet standard", new enx_0("nb maximum d'effect \u00e0 executer", eNA.qYC)), new eny_0("groupe de r\u00e9ussite", new enx_0("nb maximum d'effect \u00e0 r\u00e9ussir", eNA.qYC), new enx_0("avec r\u00e9ussite (1 : oui, 0 : non = standard", eNA.qYD)), new eny_0("groupe d'effet cibl\u00e9", new enx_0("nb maximum d'effect \u00e0 executer", eNA.qYC), new enx_0("avec r\u00e9ussite (1 : oui, 0 : non = standard", eNA.qYD), new enx_0("0 = cellule, 1 = cibles (default)", eNA.qYD)), new eny_0("groupe d'effet cibl\u00e9, probabilit\u00e9 relative", new enx_0("nb maximum d'effect \u00e0 executer", eNA.qYC), new enx_0("avec r\u00e9ussite (1 : oui, 0 : non = standard", eNA.qYD), new enx_0("0 = cellule, 1 = cibles (default)", eNA.qYD), new enx_0("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", eNA.qYD)), new eny_0("Gestion de la tansmission de la cible originale", new enx_0("nb maximum d'effect \u00e0 executer", eNA.qYC), new enx_0("avec r\u00e9ussite (1 : oui, 0 : non = standard", eNA.qYD), new enx_0("0 = cellule, 1 = cibles  (default)", eNA.qYD), new enx_0("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", eNA.qYD), new enx_0("Transmission de la cible originale aux effets du groupe : oui = 1 (d\u00e9faut), non = 0 ", eNA.qYD)), new eny_0("Change le caster du groupe d'effet pas sa cible", new enx_0("nb maximum d'effect \u00e0 executer", eNA.qYC), new enx_0("avec r\u00e9ussite (1 : oui, 0 : non = standard", eNA.qYD), new enx_0("0 = cellule, 1 = cibles (default)", eNA.qYD), new enx_0("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", eNA.qYD), new enx_0("Transmission de la cible originale aux effets du groupe : oui = 1 (d\u00e9faut), non = 0 ", eNA.qYD), new enx_0("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (d\u00e9faut)", eNA.qYD)), new eny_0("avec un Ratio sur la valeur de l'effet d\u00e9clencheur", new enx_0("nb maximum d'effect \u00e0 executer", eNA.qYC), new enx_0("avec r\u00e9ussite (1 : oui, 0 : non = standard", eNA.qYD), new enx_0("0 = cellule, 1 = cibles (default)", eNA.qYD), new enx_0("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", eNA.qYD), new enx_0("Transmission de la cible originale aux effets du groupe : oui = 1 (d\u00e9faut), non = 0 ", eNA.qYD), new enx_0("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (d\u00e9faut)", eNA.qYD), new enx_0("Ratio (default = 1)", eNA.qYD)));
    private float rfP;

    @Override
    public aox_1 bEt() {
        return rfO;
    }

    public eQt() {
        this.bby();
    }

    public eQt fFB() {
        eQt eQt2 = new eQt();
        eQt2.rfP = this.rfP;
        return eQt2;
    }

    @Override
    public void E(QD qD) {
        if (this.bgC == null) {
            return;
        }
        super.E(qD);
        this.rfP = 1.0f;
        if (((enk_0)this.bgC).fAn() > 6) {
            this.rfP = ((enk_0)this.bgC).x(6, this.fHf());
        }
    }

    @Override
    public enq_0 d(ero_0 ero_02, boolean bl) {
        enq_0 enq_02 = super.d(ero_02, bl);
        if (ero_02 == null) {
            bgA.error((Object)"Unable to execute a RunningEffectGroupLevelFunctionTriggeringActionCost without triggering effect");
            return enq_02;
        }
        enq_02.RT((int)((float)ero_02.getValue() * this.rfP));
        return enq_02;
    }

    @Override
    public void aVH() {
        this.rfP = 1.0f;
        super.aVH();
    }

    @Override
    public /* synthetic */ eqc_0 fES() {
        return this.fFB();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fFB();
    }
}

