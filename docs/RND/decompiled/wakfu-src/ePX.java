/*
 * Decompiled with CFR 0.152.
 */
public final class ePX
extends ero_0 {
    private static final aox_1 reK = new enz_0(new eny_0("D\u00e9faut", new enx_0("Id de la propri\u00e9t\u00e9", eNA.qYC)));

    @Override
    public aox_1 bEt() {
        return reK;
    }

    public ePX() {
        this.bby();
    }

    @Override
    public QD<enk_0, eNl> bbo() {
        ePX ePX2 = new ePX();
        ePX2.aQL = this.aQL;
        return ePX2;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.bgF == null) {
            this.mk(true);
            return;
        }
        ezj_0 ezj_02 = ezj_0.Pl(this.aQL);
        if (ezj_02 == null) {
            this.mk(true);
            return;
        }
        this.bgF.h(ezj_02);
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
}

