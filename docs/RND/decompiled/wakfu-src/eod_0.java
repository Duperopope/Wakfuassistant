/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eOd
 */
public final class eod_0
extends ero_0 {
    private static final aox_1 rat = new enz_0(new eny_0("Params", new enx_0("Loot refId", eNA.qYC), new enx_0("Quantit\u00e9", eNA.qYC)), new eny_0("Params", new enx_0("Loot refId", eNA.qYC), new enx_0("Constante A (float) pour Quantit\u00e9 A^(lvl/B) ", eNA.qYC), new enx_0("Constante B (int) pour Quantit\u00e9 A^(lvl/B) ", eNA.qYC)));
    private short bol;

    @Override
    public aox_1 bEt() {
        return rat;
    }

    public eod_0() {
        this.bby();
    }

    public eod_0 fCb() {
        eod_0 eod_02 = new eod_0();
        return eod_02;
    }

    @Override
    public void E(QD qD) {
        if (this.bgC == null) {
            return;
        }
        short s = this.fHf();
        this.aQL = ((enk_0)this.bgC).a(0, s, ene_0.qPu);
        if (((enk_0)this.bgC).fAn() == 2) {
            this.bol = (short)((enk_0)this.bgC).a(1, s, ene_0.qPu);
        } else if (((enk_0)this.bgC).fAn() == 3) {
            float f2 = ((enk_0)this.bgC).x(1, s);
            int n = ((enk_0)this.bgC).a(2, s, ene_0.qPu);
            this.bol = (short)StrictMath.pow(f2, (float)s / (float)n);
        }
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.bgF == null || this.bgC == null) {
            this.fHg();
            return;
        }
        if (!this.bbt()) {
            return;
        }
        Object r = fgD.fXh().Vd(this.aQL);
        if (r == null) {
            bgA.error((Object)("L'item a ajouter au loot n'existe pas " + this.aQL));
            this.fHg();
            return;
        }
        if (!(this.bgF instanceof fhx) || !(this.bgF instanceof euc_1)) {
            this.fHg();
            return;
        }
        etu_0 etu_02 = (etu_0)((euc_1)this.bgF).dlK();
        etu_02.a((fhx)((Object)this.bgF), this.aQL, this.bol);
    }

    @Override
    public boolean bbA() {
        return false;
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
        return this.fCb();
    }
}

