/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eOn
 */
public final class eon_0
extends ero_0 {
    private static final aox_1 raT = new enz_0(new eny_0("Default", new enx_0[0]));
    private eoo_0 raU;

    @Override
    public aox_1 bEt() {
        return raT;
    }

    public eon_0() {
        this.bby();
    }

    public eon_0 fCm() {
        eon_0 eon_02 = new eon_0();
        return eon_02;
    }

    @Override
    public void E(QD qD) {
        if (this.bgF == null || !this.bgF.a(exx_2.rGj) || !this.bgF.a(exx_2.rGk)) {
            return;
        }
        pr_0 pr_02 = this.bgF.b(exx_2.rGj);
        this.aQL = pr_02.aYD();
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.bgF == null || !this.bgF.a(exx_2.rGj) || !this.bgF.a(exx_2.rGk)) {
            this.fHg();
            return;
        }
        pr_0 pr_02 = this.bgF.b(exx_2.rGj);
        pr_0 pr_03 = this.bgF.b(exx_2.rGk);
        int n = pr_02.aYB();
        pr_03.ot(pr_03.aYE() + this.aQL);
        pr_03.nt(n);
        this.raU = new eoo_0();
        this.raU.raV = pr_02.aYD();
        this.raU.raW = pr_02.aYB();
        this.raU.bgF = this.bgF;
        pr_02.a(this.raU);
        this.bgF.f(exe_1.rDY);
    }

    @Override
    public void bbS() {
        if (this.bgF == null || !this.bgF.a(exx_2.rGj) || !this.bgF.a(exx_2.rGk)) {
            return;
        }
        pr_0 pr_02 = this.bgF.b(exx_2.rGj);
        pr_0 pr_03 = this.bgF.b(exx_2.rGk);
        pr_02.b(this.raU);
        int n = this.raU == null ? 0 : this.raU.raX;
        pr_03.ot(pr_03.aYE() - this.aQL - n);
        pr_03.aYO();
        this.bgF.h(exe_1.rDY);
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
    public void aVH() {
        super.aVH();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fCm();
    }
}

