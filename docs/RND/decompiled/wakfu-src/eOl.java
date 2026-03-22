/*
 * Decompiled with CFR 0.152.
 */
public final class eOl
extends ero_0 {
    private static final aox_1 raR = new enz_0(new eny_0("Id du sort \u00e0 ajouter, et niveau", new enx_0("Id du sort", eNA.qYC), new enx_0("Niveau : -1 = niveau de la cible, -2 = niveau du caster, -3 = niveau du sort courant", eNA.qYC)));
    private short raO;

    @Override
    public aox_1 bEt() {
        return raR;
    }

    public eOl() {
        this.bby();
    }

    public eOl fCl() {
        eOl eOl2 = new eOl();
        eOl2.raO = 0;
        return eOl2;
    }

    @Override
    public void E(QD qD) {
        if (this.bgC == null) {
            return;
        }
        this.aQL = ((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu);
        short s = (short)((enk_0)this.bgC).a(1, this.fHf(), ene_0.qPu);
        switch (s) {
            case -1: {
                if (this.bbd() != null && this.bbd() instanceof euc_1) {
                    this.raO = ((euc_1)this.bbd()).cmL();
                    break;
                }
                this.raO = 0;
                break;
            }
            case -2: {
                if (this.bbc() != null && this.bbc() instanceof euc_1) {
                    this.raO = ((euc_1)this.bbc()).cmL();
                    break;
                }
                this.raO = 0;
                break;
            }
            case -3: {
                this.raO = this.fHf();
                break;
            }
            default: {
                this.raO = s;
            }
        }
    }

    @Override
    protected void c(QD qD, boolean bl) {
        boolean bl2;
        if (this.bgF == null) {
            this.fHg();
            return;
        }
        if (!(this.bgF instanceof exP)) {
            this.fHg();
            return;
        }
        exP exP2 = (exP)this.bgF;
        if (!exP2.dkN()) {
            exP2.dkK();
        }
        if (!(bl2 = exP2.d(this.aQL, this.raO))) {
            bgA.info((Object)("Unable to add spell " + this.aQL + " to temporary inventory of " + String.valueOf(this.bgF)));
            this.fHg();
        }
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
        this.aQL = 0;
        this.raO = 0;
        super.aVH();
    }

    @Override
    protected void b(io_1 io_12) {
        io_12.a(ii_1.MR().en(this.raO));
    }

    @Override
    protected void f(im_1 im_12) {
        if (im_12.Qz()) {
            this.raO = GC.cu(im_12.QA().tL());
        }
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fCl();
    }
}

