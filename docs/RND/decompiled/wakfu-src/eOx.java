/*
 * Decompiled with CFR 0.152.
 */
public class eOx
extends ero_0 {
    private static final aox_1 rbt = new enz_0(new eny_0("Rappelle l'invocation dans le symbiote", new enx_0[0]));

    @Override
    public aox_1 bEt() {
        return rbt;
    }

    public eOx() {
        this.bby();
    }

    public eOx fCJ() {
        return new eOx();
    }

    @Override
    protected void c(QD qD, boolean bl) {
        qu_0 qu_02 = this.fCI();
        if (!(qu_02 instanceof exP) || !(qu_02 instanceof ezi_0)) {
            this.fHg();
            return;
        }
        ezi_0 ezi_02 = (ezi_0)((Object)qu_02);
        Object t = ezi_02.dob();
        if (t == null) {
            this.fHg();
            return;
        }
        if (!(this.bgF instanceof exP)) {
            this.fHg();
            return;
        }
        exP exP2 = (exP)this.bgF;
        if (exP2.dlI() != ezi_02) {
            this.fHg();
            return;
        }
        this.bgF.f(exe_1.rEm);
        this.bgF.f(exe_1.rEn);
        this.bgF.f(exe_1.rDt);
        this.bgF.f(exe_1.rDn);
        this.d(qD, bl);
        this.bgF.b(exx_2.rGi).aYP();
        this.bgF.b(exx_2.rGs).ot(0);
    }

    protected qu_0 fCI() {
        return this.bgE;
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
        return true;
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fCJ();
    }
}

