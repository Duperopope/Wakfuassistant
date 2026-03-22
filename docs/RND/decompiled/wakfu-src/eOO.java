/*
 * Decompiled with CFR 0.152.
 */
public class eOO
extends eot_0 {
    private static final int rcm = 200;
    private esm_0 rcn;

    public eOO() {
    }

    public eOO(pt_0 pt_02) {
        super(pt_02);
    }

    public eOO(pt_0 pt_02, esm_0 esm_02) {
        super(pt_02);
        this.rcn = esm_02;
    }

    public eOO(pt_0 pt_02, boolean bl) {
        super(pt_02, bl);
    }

    public eOO fBS() {
        eOO eOO2 = new eOO();
        eOO2.rcf = this.rcf;
        eOO2.rcs = this.rcs;
        eOO2.rcn = this.rcn;
        return eOO2;
    }

    @Override
    public void bby() {
        super.bby();
        if (this.rcf == null) {
            return;
        }
        if (this.rcf.aYW() == 0) {
            exx_2 exx_22 = (exx_2)this.rcf;
            if (exx_22.fOK()) {
                this.oC(exx_22.fOG());
            }
            if (exx_22 == exx_2.rGQ) {
                this.oC(2140);
            }
        }
    }

    @Override
    public void E(QD qD) {
        super.E(qD);
        if (this.rcn == esm_0.rjB && this.bgF != null) {
            int n = this.aQL;
            QE qE = this.bgF.baz();
            for (QD qD2 : qE) {
                if (qD2.d() != this.d() || ((eOO)qD2).cXt() != 0) continue;
                n += qD2.getValue();
            }
            if (n >= 200) {
                int n2 = this.aQL;
                this.aQL = Math.max(0, n2 - (n - 200));
            }
        }
    }

    @Override
    boolean fBQ() {
        if (super.fBQ()) {
            return true;
        }
        return this.rcf == exx_2.rGk && this.fCZ().a(exe_1.rDf);
    }

    @Override
    void d(pr_0 pr_02) {
        this.aQL = pr_02.oq(this.aQL);
        this.fh((byte)0);
        if (this.aQL == 0 && this.fBR()) {
            this.fHg();
        }
    }

    @Override
    public boolean bbI() {
        int n;
        int n2;
        if (this.bbt() && (n2 = this.fCs()) < 100 && n2 < (n = ve_0.pV(100))) {
            this.aQL = 0;
            return false;
        }
        return super.bbI();
    }

    protected int fCs() {
        int n = this.bgC != null && ((enk_0)this.bgC).fAn() >= 4 ? ((enk_0)this.bgC).a(3, this.fHf(), ene_0.qPu) : -1;
        if (n < 0) {
            return 100;
        }
        return GC.a(n, 0, 100);
    }

    @Override
    void fDc() {
        pr_0 pr_02 = this.fCZ().b(this.rcf);
        pr_02.nt(this.aQL);
        if (this.rcn != esm_0.rjB) {
            return;
        }
        this.a(pr_02, 200);
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fBS();
    }
}

