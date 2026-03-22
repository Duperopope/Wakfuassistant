/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eQL
 */
public class eql_0
extends ero_0 {
    private static final aox_1 rgx = new enz_0(new eny_0("Set de Charac = valeur du caster", new enx_0[0]), new eny_0("Set de Charac = valeur. Max non sett\u00e9", new enx_0("valeur", eNA.qYC)), new eny_0("Set de Charac = valeur. Max settable", new enx_0("valeur", eNA.qYC), new enx_0("set max (0 = non, 1 = oui)", eNA.qYD)), new eny_0("Set de Charac = valeur. Max settable + valeur en % du max", new enx_0("valeur", eNA.qYC), new enx_0("set max (0 = non, 1 = oui)", eNA.qYD), new enx_0("valeur en % du max de la charac de la cible (0 = non, 1 = oui)", eNA.qYD)));
    private boolean rgy;
    private boolean pCf;
    private boolean rgz;
    private pt_0 rcf;

    @Override
    protected void b(io_1 io_12) {
        io_12.a(ii_1.MR().r(this.rgy).s(this.pCf));
    }

    @Override
    protected void f(im_1 im_12) {
        if (im_12.Qz()) {
            ii_1 ii_12 = im_12.QA();
            this.rgy = ii_12.Mc();
            this.pCf = ii_12.Me();
        }
    }

    @Override
    public aox_1 bEt() {
        return rgx;
    }

    private eql_0() {
    }

    public eql_0(pt_0 pt_02) {
        this.rcf = pt_02;
        this.bby();
    }

    public eql_0 fFO() {
        eql_0 eql_02 = new eql_0();
        eql_02.rcf = this.rcf;
        return eql_02;
    }

    public pt_0 fCY() {
        return this.rcf;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.bbt() && this.rgz && this.bgE != null && this.bgE.a(this.rcf)) {
            this.aQL = this.bgE.c(this.rcf);
        }
        switch (this.rcf.aYW()) {
            case 0: {
                if (this.bgF == null || !this.bgF.a(this.rcf)) break;
                pr_0 pr_02 = this.bgF.b(this.rcf);
                if (this.rgy) {
                    pr_02.ot(this.aQL);
                }
                pr_02.op(this.aQL);
                break;
            }
        }
    }

    @Override
    public void E(QD qD) {
        short s = this.fHf();
        this.rgz = true;
        this.rgy = false;
        this.pCf = false;
        if (this.bgC == null || ((enk_0)this.bgC).fAn() == 0) {
            return;
        }
        this.rgz = false;
        if (((enk_0)this.bgC).fAn() >= 1) {
            this.aQL = ((enk_0)this.bgC).a(0, s, ene_0.qPu);
        }
        if (((enk_0)this.bgC).fAn() >= 2) {
            boolean bl = this.rgy = ((enk_0)this.bgC).a(1, s, ene_0.qPu) == 1;
        }
        if (((enk_0)this.bgC).fAn() >= 3) {
            boolean bl = this.pCf = ((enk_0)this.bgC).a(2, s, ene_0.qPu) == 1;
        }
        if (this.pCf) {
            pr_0 pr_02 = this.bgF.b(this.rcf);
            this.aQL = VJ.bt((float)(pr_02.aYD() * this.aQL) / 100.0f);
        }
    }

    @Override
    public void bby() {
        super.bby();
        if (this.rcf.aYW() == 0 && this.rcf == exx_2.rGQ) {
            this.oC(2140);
        }
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
    public void bbS() {
        super.bbS();
    }

    @Override
    public void aVH() {
        this.rgy = false;
        this.pCf = false;
        super.aVH();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fFO();
    }
}

