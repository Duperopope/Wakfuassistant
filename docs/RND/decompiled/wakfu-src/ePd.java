/*
 * Decompiled with CFR 0.152.
 */
public final class ePd
extends ero_0 {
    private static final aox_1 rcK = new enz_0(new eny_0("Drop basique", new enx_0[0]), new eny_0("Drop am\u00e9lior\u00e9", new enx_0("Drop Am\u00e9lior\u00e9 (1 = oui, 0 = non (defaut)", eNA.qYD)));
    private boolean rcL;

    @Override
    public aox_1 bEt() {
        return rcK;
    }

    public ePd() {
        this.bby();
    }

    public ePd fDs() {
        ePd ePd2 = new ePd();
        return ePd2;
    }

    @Override
    public void E(QD qD) {
        if (this.bgC == null) {
            return;
        }
        this.rcL = ((enk_0)this.bgC).fAn() >= 1 && ((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu) == 1;
        exP exP2 = (exP)this.bgF;
        exP exP3 = exP2.fgj();
        if (exP3 == null) {
            return;
        }
        this.bgF = exP3;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (!this.bbt()) {
            return;
        }
        if (!(this.bgD instanceof eSX)) {
            this.fHg();
            return;
        }
        if (!(this.bgF instanceof exP)) {
            this.fHg();
            return;
        }
        QP qP = (QP)((Object)this.bgD);
        if (!(this.bgJ instanceof ent_0)) {
            this.fHg();
            return;
        }
        qu_0 qu_02 = qP.bci();
        if (!(qu_02 instanceof fhu)) {
            this.fHg();
            return;
        }
        exP exP2 = (exP)this.bgF;
        exP exP3 = exP2.fgj();
        if (exP3 == null) {
            this.fHg();
            return;
        }
        if (exP3 instanceof fhx) {
            ((ent_0)this.bgJ).fBq().a((fhu)((Object)qu_02), (fhx)((Object)exP3), true, this.rcL);
        }
        this.aQL = 3920;
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
        this.rcL = false;
        super.aVH();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fDs();
    }
}

