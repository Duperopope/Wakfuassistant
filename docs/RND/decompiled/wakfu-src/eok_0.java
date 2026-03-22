/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eOK
 */
public class eok_0
extends ero_0 {
    private static final aox_1 rce = new enz_0(new eny_0("Buff de charac", new enx_0("Valeur (-1 = valeur de l'effet declencheur, -2 = 2*la valeur de l'effet d\u00e9clencheur)", eNA.qYC), new enx_0("Augmente la valeur courante (0 non 1 oui)", eNA.qYD), new enx_0("Diminue \u00e0 la d\u00e9sapplication (0 g\u00e9n\u00e9ralement. Si vous h\u00e9sitez, demandez ! Bug \u00e0 l'horizon)", eNA.qYD)));
    protected pt_0 rcf;
    protected boolean rcb = true;
    protected boolean rcc = true;
    protected int rcd = 0;

    @Override
    public aox_1 bEt() {
        return rce;
    }

    protected eok_0() {
    }

    public eok_0(pt_0 pt_02) {
        this.rcf = pt_02;
        this.bby();
    }

    public eok_0 fCX() {
        eok_0 eok_02 = new eok_0();
        eok_02.rcf = this.rcf;
        return eok_02;
    }

    public pt_0 fCY() {
        return this.rcf;
    }

    @Override
    public void bby() {
        super.bby();
        if (this.rcf == null) {
            return;
        }
        switch (this.rcf.aYW()) {
            case 0: {
                exx_2 exx_22 = (exx_2)this.rcf;
                if (!exx_22.fOH()) break;
                this.oC(exx_22.fOD());
            }
        }
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.fCZ() != null && this.fCZ().a(this.rcf)) {
            pr_0 pr_02 = this.fCZ().b(this.rcf);
            if (this.aQL == -1 && qD != null) {
                this.aQL = qD.getValue();
            }
            int n = pr_02.aYE();
            int n2 = pr_02.aYD();
            int n3 = pr_02.aYQ().aZc();
            this.fC(n, n3);
            pr_02.or(this.aQL);
            int n4 = pr_02.aYD();
            if (this.bbt()) {
                this.aQL = pr_02.aYE() - n;
                this.rcd = n4 - n2;
            }
            if (this.rcb && this.rcd != 0) {
                exx_2 exx_22;
                int n5 = this.fCZ().b(this.rcf).nt(this.rcd);
                if (n5 != 0 && this.rcf.aYW() == 0 && (exx_22 = (exx_2)this.rcf).fOH()) {
                    this.oC(exx_22.fOD());
                }
                this.rdU = true;
            }
            if (this.rcf == exx_2.rGI && this.bgJ.baf() != null) {
                this.bgJ.baf().bhI();
            }
        } else {
            this.mk(true);
        }
    }

    private void fC(int n, int n2) {
        if (!this.bbt() || n2 == -1) {
            return;
        }
        if (this.bbf() == null) {
            return;
        }
        if (this.a(eNi.qWE)) {
            return;
        }
        this.aQL = Math.min(n2 - n, this.aQL);
    }

    public void ma(boolean bl) {
        this.rcb = bl;
    }

    public void mb(boolean bl) {
        this.rcc = bl;
    }

    @Override
    public void E(QD qD) {
        if (this.bgC == null) {
            return;
        }
        short s = this.fHf();
        this.rcb = ((enk_0)this.bgC).a(1, s, ene_0.qPu) != 0;
        this.rcc = ((enk_0)this.bgC).a(2, s, ene_0.qPu) != 0;
        this.aQL = ((enk_0)this.bgC).a(0, s, ene_0.qPu);
        if (this.aQL == -2 && this.bbg() != null && ((enq_0)this.bbg()).fBh() != null && ((enq_0)this.bbg()).fBh().getValue() > 0) {
            this.aQL = ((enq_0)this.bbg()).fBh().getValue() * 2;
        }
    }

    @Override
    public void a(int n, float f2, boolean bl) {
        switch (n) {
            case 0: {
                if (bl) break;
                this.aQL += VJ.bt((float)this.aQL * f2 / 100.0f);
                break;
            }
            case 1: {
                if (bl) {
                    this.aQL = VJ.bt(f2);
                    break;
                }
                this.aQL = (int)((float)this.aQL + f2);
                break;
            }
        }
        if (this.aQL == 0) {
            this.fHg();
        }
    }

    protected qu_0 fCZ() {
        return this.bgF;
    }

    @Override
    public void bbS() {
        if (this.rdU) {
            if (this.fCZ() != null && this.fCZ().a(this.rcf)) {
                int n = this.aQL;
                if (this.rcf == exx_2.rGi) {
                    int n2 = this.fCZ().c(this.rcf);
                    int n3 = n = this.rcd > n2 ? n2 - 1 : this.rcd;
                }
                if (this.rcc) {
                    this.fCZ().b(this.rcf).oq(n);
                }
                this.fCZ().b(this.rcf).or(-this.aQL);
            }
            if (this.rcf == exx_2.rGI && this.bgJ.baf() != null) {
                this.bgJ.baf().bhI();
            }
        }
        super.bbS();
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
    protected void b(io_1 io_12) {
        io_12.a(ii_1.MR().u(this.rcb).v(this.rcc).ek(this.rcd));
    }

    @Override
    protected void f(im_1 im_12) {
        if (im_12.Qz()) {
            ii_1 ii_12 = im_12.QA();
            this.rcb = ii_12.Mx();
            this.rcc = ii_12.Mz();
            this.rcd = ii_12.getValue();
        }
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fCX();
    }
}

