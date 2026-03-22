/*
 * Decompiled with CFR 0.152.
 */
public final class eRF
extends ero_0 {
    private static final aox_1 riq = new enz_0(new eny_0("Default", new enx_0("Valeur", eNA.qYC)), new eny_0("Modif valeur courante", new enx_0("Valeur en %", eNA.qYC), new enx_0("Modifie la valeur courante (0 non 1 oui (defaut))", eNA.qYD), new enx_0("Diminue \u00e0 la d\u00e9sapplication (0 g\u00e9n\u00e9ralement. Si vous h\u00e9sitez, demandez ! Bug \u00e0 l'horizon)", eNA.qYD)));
    private pt_0 rcf;
    private boolean rir = true;
    private boolean ris = false;

    @Override
    public aox_1 bEt() {
        return riq;
    }

    private eRF() {
        this.bby();
    }

    public eRF(pt_0 pt_02) {
        this.rcf = pt_02;
        this.bby();
    }

    public eRF fGV() {
        eRF eRF2 = new eRF();
        eRF2.rcf = this.rcf;
        return eRF2;
    }

    @Override
    public void E(QD qD) {
        this.aQL = 0;
        if (this.bgC == null) {
            return;
        }
        this.aQL = ((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu);
        if (((enk_0)this.bgC).fAn() >= 3) {
            this.rir = ((enk_0)this.bgC).a(1, this.fHf(), ene_0.qPu) == 1;
            this.ris = ((enk_0)this.bgC).a(2, this.fHf(), ene_0.qPu) == 1;
        }
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.bgF == null) {
            this.fHg();
            return;
        }
        pr_0 pr_02 = this.bgF.b(this.rcf);
        if (pr_02 == null) {
            this.fHg();
            return;
        }
        int n = pr_02.aYD();
        this.aQL = pr_02.oo(this.aQL);
        int n2 = pr_02.aYD() - n;
        if (this.rir) {
            int n3 = n2;
            if (pr_02.aYQ() == exx_2.rGi) {
                n3 = -n2 > pr_02.aYB() ? -(pr_02.aYB() - 1) : n2;
            }
            pr_02.nt(n3);
        }
    }

    @Override
    public void bbS() {
        super.bbS();
        if (this.bgF == null) {
            return;
        }
        pr_0 pr_02 = this.bgF.b(this.rcf);
        if (pr_02 == null) {
            return;
        }
        if (!this.rdU) {
            return;
        }
        int n = pr_02.aYD();
        pr_02.oo(-this.aQL);
        if (!this.ris) {
            return;
        }
        int n2 = pr_02.aYD() - n;
        if (pr_02.aYB() <= 0) {
            return;
        }
        int n3 = n2;
        if (pr_02.aYQ() == exx_2.rGi) {
            n3 = n2 > pr_02.aYB() ? pr_02.aYB() - 1 : n2;
        }
        pr_02.oq(n3);
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
        this.rir = true;
        this.ris = false;
        super.aVH();
    }

    @Override
    protected void b(io_1 io_12) {
        io_12.d(ii_1.MR().y(this.ris).y(this.rir).MX());
    }

    @Override
    protected void f(im_1 im_12) {
        if (im_12.Qz()) {
            ii_1 ii_12 = im_12.QA();
            this.ris = ii_12.MD();
            this.rir = ii_12.MF();
        }
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fGV();
    }
}

