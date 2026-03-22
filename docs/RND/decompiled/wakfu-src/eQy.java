/*
 * Decompiled with CFR 0.152.
 */
public final class eQy
extends eqc_0 {
    private static final aox_1 rgc = new enz_0(new eny_0("groupe d'effet standard", new enx_0("nb maximum d'effect \u00e0 executer", eNA.qYC)), new eny_0("groupe de r\u00e9ussite", new enx_0("nb maximum d'effect \u00e0 r\u00e9ussir", eNA.qYC), new enx_0("avec r\u00e9ussite (1 : oui, 0 : non = standard", eNA.qYD)), new eny_0("groupe d'effet cibl\u00e9", new enx_0("nb maximum d'effect \u00e0 executer", eNA.qYC), new enx_0("avec r\u00e9ussite (1 : oui, 0 : non = standard", eNA.qYD), new enx_0("0 = cellule, 1 = cibles (default)", eNA.qYD)), new eny_0("groupe d'effet cibl\u00e9, probabilit\u00e9 relative", new enx_0("nb maximum d'effect \u00e0 executer", eNA.qYC), new enx_0("avec r\u00e9ussite (1 : oui, 0 : non = standard", eNA.qYD), new enx_0("0 = cellule, 1 = cibles (default)", eNA.qYD), new enx_0("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", eNA.qYD)), new eny_0("Gestion de la tansmission de la cible originale", new enx_0("nb maximum d'effect \u00e0 executer", eNA.qYC), new enx_0("avec r\u00e9ussite (1 : oui, 0 : non = standard", eNA.qYD), new enx_0("0 = cellule, 1 = cibles  (default)", eNA.qYD), new enx_0("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", eNA.qYD), new enx_0("Transmission de la cible originale aux effets du groupe : oui = 1 (d\u00e9faut), non = 0 ", eNA.qYD)), new eny_0("Change le caster du groupe d'effet pas sa cible", new enx_0("nb maximum d'effect \u00e0 executer", eNA.qYC), new enx_0("avec r\u00e9ussite (1 : oui, 0 : non = standard", eNA.qYD), new enx_0("0 = cellule, 1 = cibles (default)", eNA.qYD), new enx_0("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", eNA.qYD), new enx_0("Transmission de la cible originale aux effets du groupe : oui = 1 (d\u00e9faut), non = 0 ", eNA.qYD), new enx_0("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (d\u00e9faut)", eNA.qYD)), new eny_0("avec un Ratio sur la valeur de l'effet d\u00e9clencheur", new enx_0("nb maximum d'effect \u00e0 executer", eNA.qYC), new enx_0("avec r\u00e9ussite (1 : oui, 0 : non = standard", eNA.qYD), new enx_0("0 = cellule, 1 = cibles (default)", eNA.qYD), new enx_0("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", eNA.qYD), new enx_0("Transmission de la cible originale aux effets du groupe : oui = 1 (d\u00e9faut), non = 0 ", eNA.qYD), new enx_0("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (d\u00e9faut)", eNA.qYD), new enx_0("Ratio de l'effet d\u00e9clencheur (default = 100)", eNA.qYD)), new eny_0("avec le niveau du container de cet effet ajout\u00e9 \u00e0 la valeur", new enx_0("nb maximum d'effect \u00e0 executer", eNA.qYC), new enx_0("avec r\u00e9ussite (1 : oui, 0 : non = standard", eNA.qYD), new enx_0("0 = cellule, 1 = cibles (default)", eNA.qYD), new enx_0("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", eNA.qYD), new enx_0("Transmission de la cible originale aux effets du groupe : oui = 1 (d\u00e9faut), non = 0 ", eNA.qYD), new enx_0("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (d\u00e9faut)", eNA.qYD), new enx_0("Ratio de l'effet d\u00e9clencheur (default = 100)", eNA.qYD), new enx_0("Valeur ajout\u00e9e \u00e0 celle de l'effet d\u00e9clencheur (default = 0)", eNA.qYD)));
    private float rfP;
    private float rgd;

    @Override
    public aox_1 bEt() {
        return rgc;
    }

    public eQy() {
        this.bby();
    }

    public eQy fFF() {
        eQy eQy2 = new eQy();
        eQy2.rfP = this.rfP;
        eQy2.rgd = this.rgd;
        return eQy2;
    }

    @Override
    public void E(QD qD) {
        if (this.bgC == null) {
            return;
        }
        super.E(qD);
        this.rfP = 100.0f;
        this.rgd = 0.0f;
        if (((enk_0)this.bgC).fAn() > 6) {
            this.rfP = ((enk_0)this.bgC).x(6, this.fHf());
        }
        if (((enk_0)this.bgC).fAn() > 7) {
            this.rgd = ((enk_0)this.bgC).x(7, this.fHf());
        }
    }

    @Override
    public enq_0 d(ero_0 ero_02, boolean bl) {
        enq_0 enq_02 = super.d(ero_02, bl);
        if (ero_02 == null) {
            bgA.error((Object)"Unable to execute a RunningEffectGroupValueFunctionTriggeringActionCost without triggering effect");
            return enq_02;
        }
        int n = (int)((float)ero_02.getValue() * this.rfP / 100.0f + this.rgd);
        enq_02.RU(n);
        return enq_02;
    }

    @Override
    public void aVH() {
        this.rfP = 100.0f;
        this.rgd = 0.0f;
        super.aVH();
    }

    @Override
    public /* synthetic */ eqc_0 fES() {
        return this.fFF();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fFF();
    }
}

