/*
 * Decompiled with CFR 0.152.
 */
public final class eSa
extends epe_0 {
    private static final aox_1 rjj = new enz_0(new eny_0("Interdit", new enx_0[0]));

    public eSa() {
        this.bby();
    }

    public eSa fHH() {
        eSa eSa2 = new eSa();
        return eSa2;
    }

    public static eSa b(qm_0<enk_0> qm_02, int n, qu_0 qu_02) {
        eSa eSa2 = new eSa();
        eSa2.o = enf_0.qPF.d();
        eSa2.bgM = ((ero_0)enf_0.qPF.bkx()).baZ();
        eSa2.aQL = n;
        eSa2.bby();
        eSa2.bgF = qu_02;
        eSa2.bgO = -1;
        eSa2.bgJ = qm_02;
        return eSa2;
    }

    @Override
    public aox_1 bEt() {
        return rjj;
    }

    @Override
    public void bby() {
        super.bby();
        this.oC(2246);
    }

    @Override
    protected void c(QD qD, boolean bl) {
        int n = this.a(this.aQL, exx_2.rHH);
        if (n == 0) {
            this.mk(true);
        }
    }

    private int a(int n, pt_0 pt_02) {
        if (this.bgF == null || n == 0 || !this.bgF.a(pt_02)) {
            return 0;
        }
        int n2 = this.bgF.c(pt_02);
        if (n > 0) {
            this.bgF.b(pt_02).nt(n);
        } else if (n < 0) {
            this.bgF.b(pt_02).oq(-n);
        }
        return n2 - this.bgF.c(pt_02);
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
    public boolean Ty() {
        return false;
    }

    @Override
    public void aVH() {
        super.aVH();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fHH();
    }
}

