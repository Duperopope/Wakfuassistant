/*
 * Decompiled with CFR 0.152.
 */
public final class eOz
extends ero_0 {
    private static final aox_1 rbw = new enz_0(new eny_0("Params", new enx_0[0]));

    @Override
    public aox_1 bEt() {
        return rbw;
    }

    public eOz() {
        this.bby();
    }

    public eOz fCL() {
        eOz eOz2 = new eOz();
        return eOz2;
    }

    @Override
    public void E(QD qD) {
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.bgF == null) {
            this.fHg();
            return;
        }
        if (!(this.bgF instanceof QQ)) {
            this.fHg();
            return;
        }
        QQ qQ = (QQ)this.bgF;
        qQ.b(this.bgG);
        qQ.bcW();
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
        return this.fCL();
    }
}

