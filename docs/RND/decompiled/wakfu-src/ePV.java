/*
 * Decompiled with CFR 0.152.
 */
public final class ePV
extends ero_0 {
    private static final aox_1 reI = new enz_0(new eny_0("D\u00e9faut", new enx_0("Id de la propri\u00e9t\u00e9", eNA.qYC)));

    @Override
    public aox_1 bEt() {
        return reI;
    }

    public ePV() {
        this.bby();
    }

    @Override
    public QD<enk_0, eNl> bbo() {
        ePV ePV2 = new ePV();
        ePV2.aQL = this.aQL;
        return ePV2;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.bgF == null) {
            this.mk(true);
            return;
        }
        exe_1 exe_12 = exe_1.Te(this.aQL);
        if (exe_12 == null) {
            this.mk(true);
            return;
        }
        this.bgF.h(exe_12);
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

