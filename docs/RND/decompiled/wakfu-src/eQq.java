/*
 * Decompiled with CFR 0.152.
 */
public final class eQq
extends eqc_0 {
    private static final aox_1 rfH = new enz_0(new eny_0("Calcul le niveau des effets du groupe en fonction du cout du sort d\u00e9clenchant", new enx_0("nb maximum d'effect \u00e0 executer", eNA.qYC), new enx_0("avec r\u00e9ussite (1 : oui, 0 : non = standard", eNA.qYD), new enx_0("0 = cellule, 1 = cibles (default)", eNA.qYD), new enx_0("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", eNA.qYD), new enx_0("Transmission de la cible originale aux effets du groupe : oui = 1 (d\u00e9faut), non = 0 ", eNA.qYD), new enx_0("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (d\u00e9faut)", eNA.qYD), new enx_0("Niveau par PA", eNA.qYD), new enx_0("Niveau par PM", eNA.qYD), new enx_0("Niveau par PW", eNA.qYD)));
    private float rfI = 0.0f;
    private float rfJ = 0.0f;
    private float rfK = 0.0f;

    @Override
    public aox_1 bEt() {
        return rfH;
    }

    public eQq() {
        this.bby();
    }

    public eQq fFy() {
        return new eQq();
    }

    @Override
    public void E(QD qD) {
        if (this.bgC == null) {
            return;
        }
        super.E(qD);
        this.rfI = ((enk_0)this.bgC).x(6, this.fHf());
        this.rfJ = ((enk_0)this.bgC).x(7, this.fHf());
        this.rfK = ((enk_0)this.bgC).x(8, this.fHf());
    }

    @Override
    public enq_0 d(ero_0 ero_02, boolean bl) {
        enq_0 enq_02 = super.d(ero_02, bl);
        if (ero_02 == null) {
            bgA.error((Object)"Unable to execute a RunningEffectGroupLevelFunctionTriggeringActionCost without triggering effect");
            return enq_02;
        }
        if (!(ero_02 instanceof eoc_0)) {
            bgA.error((Object)("Unable to execute a RunningEffectGroupLevelFunctionTriggeringActionCost without actionCost triggering effect (linkedRE=" + String.valueOf(ero_02) + ")"));
            return enq_02;
        }
        eoc_0 eoc_02 = (eoc_0)ero_02;
        byte by = eoc_02.fBZ();
        byte by2 = eoc_02.fBY();
        byte by3 = eoc_02.fBX();
        float f2 = (float)by * this.rfI + (float)by2 * this.rfJ + (float)by3 * this.rfK;
        enq_02.RT(Math.round(f2));
        return enq_02;
    }

    @Override
    public void aVH() {
        super.aVH();
    }

    @Override
    public /* synthetic */ eqc_0 fES() {
        return this.fFy();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fFy();
    }
}

