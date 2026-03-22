/*
 * Decompiled with CFR 0.152.
 */
public class ePl
extends epe_0 {
    private static final aox_1 rdc = new enz_0(new eny_0("Utilisation", new enx_0[0]));

    public QD a(enk_0 enk_02, eNl eNl2, qm_0 qm_02, qu_0 qu_02, qu_0 qu_03, int n, int n2, short s, enq_0 enq_02) {
        this.f(qu_03);
        return this;
    }

    public ePl() {
        this.bby();
    }

    @Override
    public aox_1 bEt() {
        return rdc;
    }

    public ePl fDF() {
        ePl ePl2 = new ePl();
        return ePl2;
    }

    public static ePl Sc(int n) {
        ePl ePl2 = new ePl();
        ePl2.o = enf_0.qPB.d();
        ePl2.bgM = ((ero_0)enf_0.qPB.bkx()).baZ();
        ePl2.bby();
        ePl2.oC(n);
        ePl2.bgO = -1;
        return ePl2;
    }

    @Override
    public void bby() {
        super.bby();
    }

    @Override
    protected void c(QD qD, boolean bl) {
        this.mk(true);
    }

    @Override
    public void E(QD qD) {
    }

    @Override
    public void bbR() {
        this.bbZ();
        this.bbG();
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
        return true;
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fDF();
    }
}

