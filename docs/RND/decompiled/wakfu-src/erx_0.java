/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eRx
 */
public class erx_0
extends epe_0 {
    private static final aox_1 rif = new enz_0(new eny_0("Interdit", new enx_0[0]));

    public erx_0() {
        this.bby();
    }

    public erx_0 fGL() {
        erx_0 erx_02 = new erx_0();
        return erx_02;
    }

    public static erx_0 c(qm_0<enk_0> qm_02, fqO fqO2, qu_0 qu_02) {
        erx_0 erx_02 = new erx_0();
        erx_02.o = enf_0.qPE.d();
        erx_02.bgM = ((ero_0)enf_0.qPE.bkx()).baZ();
        erx_02.aQL = fqO2.r(exx_2.rGk);
        erx_02.bby();
        erx_02.bgF = qu_02;
        erx_02.bgO = -1;
        erx_02.bgJ = qm_02;
        return erx_02;
    }

    @Override
    public aox_1 bEt() {
        return rif;
    }

    @Override
    public void bby() {
        super.bby();
        this.oC(76);
        if (this.getValue() > 0) {
            this.oC(65);
            this.oC(2242);
        }
    }

    @Override
    protected void c(QD qD, boolean bl) {
        int n = this.a(this.aQL, exx_2.rGk);
        if (n == 0) {
            this.mk(true);
        }
    }

    private int a(int n, pt_0 pt_02) {
        if (this.bgF != null && n > 0 && this.bgF.a(pt_02)) {
            int n2 = this.bgF.c(pt_02);
            this.bgF.b(pt_02).oq(n);
            return n2 - this.bgF.c(pt_02);
        }
        return 0;
    }

    @Override
    public void E(QD qD) {
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
        return this.fGL();
    }
}

