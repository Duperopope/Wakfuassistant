/*
 * Decompiled with CFR 0.152.
 */
public final class eQs
extends eqc_0 {
    private static final aox_1 rfN = new enz_0(new eny_0("Calcul le niveau des effets du groupe en fonction du cout du sort d\u00e9clenchant", new enx_0("nb maximum d'effect \u00e0 executer", eNA.qYC), new enx_0("avec r\u00e9ussite (1 : oui, 0 : non = standard", eNA.qYD), new enx_0("0 = cellule, 1 = cibles (default)", eNA.qYD), new enx_0("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", eNA.qYD), new enx_0("Transmission de la cible originale aux effets du groupe : oui = 1 (d\u00e9faut), non = 0 ", eNA.qYD), new enx_0("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (d\u00e9faut)", eNA.qYD), new enx_0("Niveau par PA", eNA.qYD), new enx_0("Niveau par PM", eNA.qYD), new enx_0("Niveau par PW", eNA.qYD)));
    private float rfI = 0.0f;
    private float rfJ = 0.0f;
    private float rfK = 0.0f;

    @Override
    public aox_1 bEt() {
        return rfN;
    }

    public eQs() {
        this.bby();
    }

    @Override
    protected void c(QD qD, boolean bl) {
        super.c(qD, bl);
    }

    public eQs fFA() {
        return new eQs();
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
            bgA.error((Object)"Unable to execute a RunningEffectGroupLevelFunctionTriggeringSpell without triggering effect");
            enq_02.RT(0);
            return enq_02;
        }
        if (ero_02.oE(500)) {
            this.a(enq_02, (fqE)this.bgJ.bak().baS(), this.bgJ.bak().baR());
            return enq_02;
        }
        eNl eNl2 = (eNl)ero_02.bbf();
        if (eNl2 == null) {
            bgA.error((Object)("Unable to execute a RunningEffectGroupLevelFunctionTriggeringSpell when the triggering effect has no container. Effect id : " + ((enk_0)ero_02.bba()).aZH()));
            enq_02.RT(0);
            return enq_02;
        }
        if (eNl2.bab() != 11) {
            bgA.error((Object)("Unable to execute a RunningEffectGroupLevelFunctionTriggeringSpell when the triggering effect container is not a spell. Effect id : " + ((enk_0)ero_02.bba()).aZH() + " ContainerType : " + eNl2.bab() + " Container ID : " + eNl2.QF() + " Concerned effect group : " + this.aZH()));
            enq_02.RT(0);
            return enq_02;
        }
        short s = ero_02.fHf();
        this.a(enq_02, (fqE)eNl2, s);
        return enq_02;
    }

    private void a(enq_0 enq_02, fqE fqE2, short s) {
        Object Spell = fqE2.giP();
        int n = ((fqD)Spell).Zc(s);
        int n2 = ((fqD)Spell).Zf(s);
        int n3 = ((fqD)Spell).Zd(s);
        float f2 = (float)n * this.rfI + (float)n2 * this.rfJ + (float)n3 * this.rfK;
        enq_02.RT(Math.round(f2));
    }

    @Override
    public void aVH() {
        super.aVH();
    }

    @Override
    public /* synthetic */ eqc_0 fES() {
        return this.fFA();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fFA();
    }
}

