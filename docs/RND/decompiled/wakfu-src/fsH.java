/*
 * Decompiled with CFR 0.152.
 */
public abstract class fsH
extends fsQ<fsm_0> {
    public fsH(fsm_0 fsm_02) {
        super(fsm_02);
    }

    public boolean k(fam_0 fam_02) {
        if (fam_02.fRa()) {
            this.n(fam_02);
            this.m(fam_02);
            this.l(fam_02);
        }
        this.o(fam_02);
        this.p(fam_02);
        return !this.gly();
    }

    protected abstract void l(fam_0 var1);

    private void m(fam_0 fam_02) {
        int n = fsl_0.b(fam_02, (fsm_0)this.teA);
        if (n > 0) {
            this.a(new ftb_0(new fsb_0(fam_02), n));
        }
    }

    private void n(fam_0 fam_02) {
        long l = fsl_0.a(fam_02, (fsm_0)this.teA);
        if (l > 0L) {
            this.a(new fta_0(new fsb_0(fam_02), l));
        }
    }

    private void o(fam_0 fam_02) {
        int n = fsl_0.c(fam_02, (fsm_0)this.teA);
        if (n > 0) {
            this.a(new ftc_0(new fsb_0(fam_02), n));
        }
    }

    private void p(fam_0 fam_02) {
        fcp_0 fcp_02 = fsl_0.d(fam_02, (fsm_0)this.teA);
        fcp_02.b(new fsI(this, fam_02));
    }
}

