/*
 * Decompiled with CFR 0.152.
 */
public final class eOD
extends ero_0 {
    private static final aox_1 rbO = new enz_0(new eny_0("Id du mob, niveaux = niveau moyen du mob", new enx_0("Id du mob", eNA.qYC)), new eny_0("Id du mob, niveaux = niveau moyen du mob ou du joueur", new enx_0("Id du mob", eNA.qYC), new enx_0("Niveaux : 0 : niveau du mob, 1 = niveau du joueur", eNA.qYC)));
    private static final int rbP = -1;
    private eyc rbQ;

    @Override
    public aox_1 bEt() {
        return rbO;
    }

    public eOD() {
        this.bby();
    }

    public eOD fCP() {
        eOD eOD2 = new eOD();
        eOD2.rbQ = eyc.phc;
        return eOD2;
    }

    @Override
    public void E(QD qD) {
        int n;
        if (this.bgC == null) {
            return;
        }
        this.aQL = ((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu);
        this.rbQ = ((enk_0)this.bgC).fAn() >= 2 ? ((n = ((enk_0)this.bgC).a(1, this.fHf(), ene_0.qPu)) == 1 ? eyc.phd : eyc.phc) : eyc.phc;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.bgF == null) {
            this.fHg();
            return;
        }
        if (!(this.bgF instanceof exP)) {
            this.fHg();
            return;
        }
        if (((exP)this.bgF).dkN()) {
            ((exP)this.bgF).dkM();
        }
        ((exP)this.bgF).b(this.aQL, this.rbQ);
    }

    @Override
    public boolean bbI() {
        if (!(this.bgF instanceof exP)) {
            return false;
        }
        return super.bbI();
    }

    @Override
    public void bbS() {
        if (!this.rdU) {
            return;
        }
        if (!(this.bgF instanceof exP)) {
            return;
        }
        ((exP)this.bgF).OM(this.aQL);
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
        this.aQL = -1;
        this.rbQ = eyc.phc;
        super.aVH();
    }

    @Override
    protected void b(io_1 io_12) {
        io_12.a(ii_1.MR().en(this.rbQ.ordinal()));
    }

    @Override
    protected void f(im_1 im_12) {
        if (im_12.Qz()) {
            int n = im_12.QA().tL();
            for (eyc eyc2 : eyc.values()) {
                if (eyc2.ordinal() != n) continue;
                this.rbQ = eyc2;
                return;
            }
        }
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fCP();
    }
}

