/*
 * Decompiled with CFR 0.152.
 */
public class ePs
extends epp_0 {
    private static final aox_1 rds = new enz_0(new eny_0("Gain de PV (Valeur * (1 + (LIFE_STOLEN_BONUS / 100))", new enx_0("Valeur", eNA.qYC)), new eny_0("Gain de PV, avec LIFE_STOLEN_BONUS ou non", new enx_0("Valeur", eNA.qYC), new enx_0("La valeur est modifi\u00e9e par le LIFE_STOLEN_BONUS (0=non, 1=oui (default))", eNA.qYD)));
    private boolean rdt = true;

    public ePs() {
        this.bby();
        this.oC(20);
    }

    @Override
    public aox_1 bEt() {
        return rds;
    }

    public ePs fDY() {
        return new ePs();
    }

    @Override
    public void E(QD qD) {
        this.fDQ();
        this.fDS();
    }

    @Override
    public void fDQ() {
        this.fDR();
        if (this.bgC != null) {
            short s = this.fHf();
            switch (((enk_0)this.bgC).fAn()) {
                case 1: {
                    this.aQL = ((enk_0)this.bgC).a(0, s, ene_0.qPu);
                    break;
                }
                case 2: {
                    this.aQL = ((enk_0)this.bgC).a(0, s, ene_0.qPu);
                    this.rdt = ((enk_0)this.bgC).a(1, s, ene_0.qPu) != 0;
                }
            }
        }
    }

    @Override
    protected void fDS() {
        int n;
        float f2;
        enq_0 enq_02 = (enq_0)this.bbg();
        float f3 = f2 = enq_02 != null && enq_02.Ol() != 0 ? (float)enq_02.Ol() : (float)this.aQL;
        if (this.rdt && this.bgE.a(exx_2.rGS)) {
            n = this.bgE.c(exx_2.rGS);
            f2 = f2 * (100.0f + (float)n) / 100.0f;
        }
        if (this.bgF.a(exx_2.rGG)) {
            n = this.bgF.c(exx_2.rGG);
            f2 -= f2 * (float)n / 1000.0f;
        }
        this.aQL = n = Math.max(0, GC.B(f2));
        if (enq_02 != null) {
            enq_02.RU(n);
        }
    }

    @Override
    protected void fDR() {
        this.rdt = true;
    }

    @Override
    public /* synthetic */ epp_0 fDO() {
        return this.fDY();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fDY();
    }
}

