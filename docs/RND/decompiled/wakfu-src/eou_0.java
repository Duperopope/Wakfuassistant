/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eOU
 */
public class eou_0
extends ero_0 {
    private static final aox_1 rct = new enz_0(new eny_0("Set de Charac, valeur = charac du caster (tention !)", new enx_0[0]), new eny_0("Set de Charac (tention !)", new enx_0("valeur (eventuellement en %)", eNA.qYC)));
    private pt_0 rcf;
    private int rcu = 0;

    @Override
    public aox_1 bEt() {
        return rct;
    }

    private eou_0() {
    }

    public eou_0(pt_0 pt_02) {
        this.rcf = pt_02;
        this.bby();
    }

    public eou_0 fDi() {
        eou_0 eou_02 = new eou_0();
        eou_02.rcf = this.rcf;
        return eou_02;
    }

    public pt_0 fCY() {
        return this.rcf;
    }

    @Override
    public void bby() {
        super.bby();
    }

    @Override
    protected void c(QD qD, boolean bl) {
        switch (this.rcf.aYW()) {
            case 0: {
                this.fDj();
            }
        }
    }

    @Override
    public void E(QD qD) {
        short s = this.fHf();
        this.aQL = this.bgC != null && ((enk_0)this.bgC).fAn() > 0 ? ((enk_0)this.bgC).a(0, s, ene_0.qPu) : this.bbc().c(this.rcf);
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
    public void bbS() {
        if (this.rdU && this.Ty()) {
            switch (this.rcf.aYW()) {
                case 0: {
                    this.fDk();
                }
            }
        }
        super.bbS();
    }

    private void fDj() {
        if (this.bgF != null && this.bgF.a(this.rcf)) {
            int n = this.bbc().c(this.rcf);
            pr_0 pr_02 = this.bgF.b(this.rcf);
            this.g(pr_02);
            if (this.rcf == exx_2.rGI && this.bgJ.baf() != null) {
                this.bgJ.baf().bhI();
            }
            int n2 = this.bbc().c(this.rcf) - n;
            if (this.rcf instanceof exx_2) {
                exx_2 exx_22 = (exx_2)this.rcf;
                if (exx_22.fOJ() && n2 > 0) {
                    this.oC(exx_22.fOF());
                }
                if (exx_22.fOK() && n2 < 0) {
                    this.oC(exx_22.fOG());
                }
            }
        } else {
            this.mk(true);
        }
    }

    private void fDk() {
        if (this.bgF != null && this.bgF.a(this.rcf)) {
            this.h(this.bgF.b(this.rcf));
            if (this.rcf == exx_2.rGI && this.bgJ != null && this.bgJ.baf() != null) {
                this.bgJ.baf().bhI();
            }
        }
    }

    private void g(pr_0 pr_02) {
        int n = pr_02.aYB();
        pr_02.op(this.aQL);
        this.aQL = pr_02.aYB();
        this.rcu = this.aQL - n;
    }

    private void h(pr_0 pr_02) {
        int n = pr_02.aYB() - this.rcu;
        pr_02.op(n);
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fDi();
    }
}

