/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eRD
 */
public class erd_0
extends ero_0 {
    private static final aox_1 rio = new enz_0(new eny_0("Pas de param", new enx_0[0]));

    @Override
    public aox_1 bEt() {
        return rio;
    }

    public erd_0() {
        this.bby();
    }

    public erd_0 fGT() {
        erd_0 erd_02 = new erd_0();
        this.bgO = 1;
        return erd_02;
    }

    @Override
    public void bby() {
        super.bby();
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.bgF != null) {
            this.bgF.f(exe_1.rDt);
            this.bgF.f(exe_1.rDn);
            this.d(qD, bl);
            this.bgF.b(exx_2.rGi).aYP();
            this.bgF.b(exx_2.rGs).ot(0);
        } else {
            this.mk(true);
        }
    }

    @Override
    public void E(QD qD) {
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
    public /* synthetic */ QD bbo() {
        return this.fGT();
    }
}

