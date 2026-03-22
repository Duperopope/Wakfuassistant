/*
 * Decompiled with CFR 0.152.
 */
public class eRe
extends ero_0 {
    private static final aox_1 rgY = new enz_0(new eny_0("modifie la cible de l'effet d\u00e9clencheur par la cible de cet effet", new enx_0[0]), new eny_0("partage la valeur de l'effet declencheur entre caster et target", new enx_0("% de la valeur de l'effet declencheur redirig\u00e9 vers la cible de cet effet (inf ou egal a 100)", eNA.qYC)), new eny_0("Ne d\u00e9passe pas une valeur max de la nouvelle cible", new enx_0("% de la valeur de l'effet declencheur redirig\u00e9 vers la cible de cet effet (inf ou egal a 100)", eNA.qYC), new enx_0("Cap de la valeur redirig\u00e9e (-1=valeur des hp de la cible)", eNA.qYC)));
    private int rgZ;

    @Override
    public aox_1 bEt() {
        return rgY;
    }

    public eRe fGd() {
        eRe eRe2 = new eRe();
        eRe2.rgZ = this.rgZ;
        return eRe2;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (!this.bbt()) {
            return;
        }
        QD qD2 = this.L(qD);
        if (qD2 == null || this.bgE == null) {
            this.fHg();
            return;
        }
        if (qD2.d() == enf_0.qVg.d()) {
            this.fHg();
            return;
        }
        int n = qD2.getValue();
        int n2 = n * this.aQL / 100;
        int n3 = this.fGe();
        if (n3 > 0) {
            n2 = Math.min(n2, n3);
        }
        if (n2 == 0) {
            this.fHg();
            return;
        }
        if (n2 >= n) {
            qD2.f(this.bgF);
            return;
        }
        QD qD3 = qD2.bbn();
        qD2.oB(n - n2);
        qD3.e(this.m(qD2));
        qD3.f(this.bgF);
        qD3.a(enq_0.a(true, true, null));
        qD3.oB(n2);
        qD3.bbr();
        qD3.bbK();
    }

    private int fGe() {
        int n = this.rgZ;
        if (this.fGf() && this.bgF.a(exx_2.rGi)) {
            n = this.bgF.c(exx_2.rGi);
        }
        return n;
    }

    public boolean fGf() {
        return this.rgZ == -1;
    }

    @Override
    public void E(QD qD) {
        if (this.bgC == null) {
            return;
        }
        this.aQL = ((enk_0)this.bgC).fAn() == 0 ? 100 : Math.min(((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu), 100);
        if (((enk_0)this.bgC).fAn() >= 2) {
            this.rgZ = ((enk_0)this.bgC).a(1, this.fHf(), ene_0.qPu);
        }
    }

    @Override
    public void aVH() {
        this.rgZ = 0;
        super.aVH();
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
    public /* synthetic */ QD bbo() {
        return this.fGd();
    }
}

