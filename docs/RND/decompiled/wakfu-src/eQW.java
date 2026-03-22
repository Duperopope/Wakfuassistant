/*
 * Decompiled with CFR 0.152.
 */
public class eQW
extends ero_0 {
    private static final aox_1 rgO = new enz_0(new eny_0("Attaque avec un sort sur cible", new enx_0("spellId", eNA.qYB)), new eny_0("Attaque avec un sort sur cellule", new enx_0("spellId", eNA.qYB), new enx_0("Sur cellule (1 : oui, 0 : sur cible (default))", eNA.qYD)), new eny_0("Consomme le co\u00fbt du sort", new enx_0("spellId", eNA.qYB), new enx_0("Sur cellule (1 : oui, 0 : sur cible (default))", eNA.qYD), new enx_0("Consomme le co\u00fbt (1 : oui (default), 0 : non)", eNA.qYD)));
    private boolean rgP = true;

    @Override
    public aox_1 bEt() {
        return rgO;
    }

    public eQW fFW() {
        eQW eQW2 = new eQW();
        return eQW2;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        int n = ((enk_0)this.bgC).a(0, (short)1, ene_0.qPu);
        if (!(this.bgE instanceof exP)) {
            this.mk(true);
            return;
        }
        if (this.bgF != null) {
            qu_0 qu_02 = this.bbd();
            ((exP)this.bgE).a(n, new acd_1(qu_02.bcC(), qu_02.bcD(), qu_02.bcE()), this.rgP);
        } else {
            ((exP)this.bgE).a(n, new acd_1(this.bbe()), this.rgP);
        }
    }

    @Override
    public void E(QD qD) {
        this.rgP = true;
        if (this.bgC != null && ((enk_0)this.bgC).fAn() >= 3) {
            this.rgP = ((enk_0)this.bgC).a(2, this.fHf(), ene_0.qPu) == 1;
        }
    }

    @Override
    public boolean bbA() {
        return true;
    }

    @Override
    public boolean bbB() {
        if (this.bgC != null && ((enk_0)this.bgC).fAn() >= 2) {
            return ((enk_0)this.bgC).Rz(1) != 1.0f;
        }
        return true;
    }

    @Override
    public boolean bbC() {
        if (this.bgC != null && ((enk_0)this.bgC).fAn() >= 2) {
            return ((enk_0)this.bgC).Rz(1) == 1.0f;
        }
        return false;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.rgP = true;
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fFW();
    }
}

