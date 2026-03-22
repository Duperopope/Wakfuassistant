/*
 * Decompiled with CFR 0.152.
 */
public final class ePy
extends ero_0 {
    private static final aox_1 rdE = new enz_0(new eny_0("Pas de param", new enx_0[0]));
    private boolean rdF;

    public static ePy fEe() {
        return new ePy();
    }

    @Override
    public aox_1 bEt() {
        return rdE;
    }

    @Override
    public QD<enk_0, eNl> bbo() {
        ePy ePy2 = new ePy();
        return ePy2;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.bgF == null) {
            return;
        }
        this.d(qD, bl);
        if (this.bgF instanceof exP) {
            ((exP)this.bgF).fhx();
        }
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
    }
}

