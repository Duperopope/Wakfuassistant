/*
 * Decompiled with CFR 0.152.
 */
public class eOB
extends ero_0 {
    private static final aox_1 rbA = new enz_0(new eny_0("Script Id", new enx_0("Script Id", eNA.qYC)));

    @Override
    public aox_1 bEt() {
        return rbA;
    }

    public eOB fCN() {
        eOB eOB2 = new eOB();
        return eOB2;
    }

    @Override
    public void bby() {
        super.bby();
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.bgF == null) {
            this.fHg();
            return;
        }
        if (!(this.bgF instanceof exP)) {
            return;
        }
        exP exP2 = (exP)this.bgF;
        exP2.OD(this.aQL);
    }

    @Override
    public void E(QD qD) {
        if (this.bgC == null) {
            return;
        }
        this.aQL = ((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu);
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
    public void bbS() {
        if (this.bgF == null) {
            return;
        }
        if (!(this.bgF instanceof exP)) {
            return;
        }
        exP exP2 = (exP)this.bgF;
        exP2.OD(-1);
    }

    @Override
    public boolean bce() {
        return true;
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fCN();
    }
}

