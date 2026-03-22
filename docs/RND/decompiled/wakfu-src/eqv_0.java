/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eQv
 */
public final class eqv_0
extends ero_0 {
    private static final aox_1 rfR = new enz_0(new eny_0("Transmet 100% de la valeur", new enx_0[0]), new eny_0("% Param\u00e9tr\u00e9", new enx_0("% transmis (defaut = 100)", eNA.qYD)), new eny_0("Valeur min pour le second effet", new enx_0("% transmis (defaut = 100)", eNA.qYD), new enx_0("valeur min du second effet (defaut = 0)", eNA.qYD)), new eny_0("Caster ou target pour le second effet", new enx_0("% transmis (defaut = 100)", eNA.qYD), new enx_0("valeur min du second effet (defaut = 0)", eNA.qYD), new enx_0("Cible du second effet, 0=caster (defaut) 1=target", eNA.qYD)), new eny_0("Type d'arrondi", new enx_0("% transmis (defaut = 100)", eNA.qYD), new enx_0("valeur min du second effet (defaut = 0)", eNA.qYD), new enx_0("Cible du second effet, 0=caster (defaut) 1=target", eNA.qYD), new enx_0("Arrondi du second effet (-1=inferieur, 0=random (default), 1=(sup\u00e9rieur)", eNA.qYD)));
    private int rfS;
    private int rfT;
    final int[] rfU = new int[1];
    private int rfV;
    private boolean rfW;

    @Override
    public aox_1 bEt() {
        return rfR;
    }

    public eqv_0() {
        this.bby();
    }

    public eqv_0 fFC() {
        return new eqv_0();
    }

    @Override
    public void E(QD qD) {
        this.rfS = 100;
        this.rfT = 0;
        this.rfV = 0;
        this.rfW = true;
        if (this.bgC == null) {
            return;
        }
        if (((enk_0)this.bgC).fAn() >= 1) {
            this.rfS = ((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu);
        }
        if (((enk_0)this.bgC).fAn() >= 2) {
            this.rfV = ((enk_0)this.bgC).a(1, this.fHf(), ene_0.qPu);
        }
        if (((enk_0)this.bgC).fAn() >= 3) {
            boolean bl = this.rfW = ((enk_0)this.bgC).a(2, this.fHf(), ene_0.qPu) == 0;
        }
        if (((enk_0)this.bgC).fAn() >= 4) {
            this.rfT = ((enk_0)this.bgC).a(3, this.fHf(), ene_0.qPu);
        }
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (!this.bbt()) {
            return;
        }
        if (this.bgC == null) {
            this.fHg();
            return;
        }
        fqB fqB2 = fqC.giD().Za(((enk_0)this.bgC).aZH());
        if (fqB2 == null) {
            bgA.error((Object)("Groupe d'effet inconnu" + ((enk_0)this.bgC).aZH()));
            this.fHg();
            return;
        }
        if (fqB2.eey() != 2) {
            bgA.error((Object)("On ne peut pas avoir plus ou moins de deux effets dans un groupe d'effet de ce type " + ((enk_0)this.bgC).aZH()));
            this.fHg();
            return;
        }
        this.rfU[0] = 0;
        enq_0 enq_02 = this.d((ero_0)qD, true);
        if (this.a(eNi.qWD) && enq_02.Oh() == -1) {
            enq_02.RT(this.fHf());
        }
        enk_0 enk_02 = fqB2.Pv(0);
        enk_02.a((Qk)this.bbf(), this.bbc(), this.bbh(), enf_0.fBb(), this.bgF.bcC(), this.bgF.bcD(), this.bgF.bcE(), this.bgF, enq_02, false);
        int n = this.rfU[0];
        if (n == 0) {
            return;
        }
        enk_0 enk_03 = fqB2.Pv(1);
        if (this.bgF instanceof eSL && enk_03.aZH() == 101395) {
            return;
        }
        int n2 = Math.max(switch (this.rfT) {
            case -1 -> GC.B((float)(n * this.rfS) / 100.0f);
            case 0 -> VJ.bt((float)(n * this.rfS) / 100.0f);
            case 1 -> GC.C((float)(n * this.rfS) / 100.0f);
            default -> VJ.bt((float)(n * this.rfS) / 100.0f);
        }, this.rfV);
        enq_02.RU(n2);
        qu_0 qu_02 = this.rfW ? this.bbc() : this.bbd();
        enk_03.a((Qk)this.bbf(), this.bbc(), this.bbh(), enf_0.fBb(), this.bgF.bcC(), this.bgF.bcD(), this.bgF.bcE(), qu_02, enq_02, false);
        enq_02.aZp();
    }

    private enq_0 d(ero_0 ero_02, boolean bl) {
        enq_0 enq_02 = enq_0.a(bl, false, ero_02);
        enq_02.lR(false);
        enq_02.a(new eqw_0(this, enq_02));
        return enq_02;
    }

    @Override
    public boolean bbA() {
        return true;
    }

    @Override
    public boolean bbB() {
        return true;
    }

    @Override
    public boolean bbC() {
        return false;
    }

    @Override
    public void aVH() {
        super.aVH();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fFC();
    }
}

