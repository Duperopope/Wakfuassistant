/*
 * Decompiled with CFR 0.152.
 */
public final class eOt
extends ero_0 {
    private static final aox_1 rbl = new enz_0(new eny_0("D\u00e9faut", new enx_0("Id de la propri\u00e9t\u00e9", eNA.qYC)));

    @Override
    public aox_1 bEt() {
        return rbl;
    }

    public eOt() {
        this.bby();
    }

    @Override
    public QD<enk_0, eNl> bbo() {
        eOt eOt2 = new eOt();
        eOt2.aQL = this.aQL;
        return eOt2;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        boolean bl2;
        if (this.bgF == null) {
            this.mk(true);
            return;
        }
        if (!(this.bgF instanceof exP)) {
            bgA.error((Object)("Can not ApplyWorldProperty " + this.aQL + "on something else than BasicCharacterInfo"));
            this.mk(true);
            return;
        }
        ezj_0 ezj_02 = ezj_0.Pl(this.aQL);
        if (ezj_02 == null) {
            this.mk(true);
            return;
        }
        exe_1 exe_12 = ezj_02.fmM();
        boolean bl3 = bl2 = this.bbh().baj() == 1;
        if (bl2 && exe_12 != null) {
            this.bgF.f(exe_12);
        }
        this.bgF.f(ezj_02);
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
    public void E(QD qD) {
        this.aQL = ((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu);
    }

    @Override
    public void bbS() {
        if (this.bgF == null) {
            return;
        }
        ezj_0 ezj_02 = ezj_0.Pl(this.aQL);
        if (ezj_02 == null) {
            return;
        }
        exe_1 exe_12 = ezj_02.fmM();
        if (exe_12 != null) {
            this.bgF.g(exe_12);
        }
        this.bgF.g(ezj_02);
    }
}

