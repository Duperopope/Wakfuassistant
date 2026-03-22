/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ePu
 */
public class epu_0
extends ero_0 {
    private static final aox_1 rdv = new enz_0(new eny_0("Valeur du modificateur", new enx_0("Modificateur", eNA.qYC)), new eny_0("M\u00e9tier concern\u00e9", new enx_0("Modificateur", eNA.qYC), new enx_0("Id du m\u00e9tier", eNA.qYD)));
    private eje_0 rdw;
    private int bfF;
    private int jUA;

    @Override
    public aox_1 bEt() {
        return rdv;
    }

    private epu_0() {
    }

    public epu_0(eje_0 eje_02, int n) {
        this.rdw = eje_02;
        this.bfF = n;
    }

    public epu_0 fEa() {
        epu_0 epu_02 = new epu_0();
        epu_02.rdw = this.rdw;
        epu_02.jUA = this.jUA;
        epu_02.bfF = this.bfF;
        return epu_02;
    }

    @Override
    public void E(QD qD) {
        if (this.bgC == null) {
            return;
        }
        this.aQL = ((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu);
        if (((enk_0)this.bgC).fAn() > 1) {
            this.jUA = ((enk_0)this.bgC).a(1, this.fHf(), ene_0.qPu);
        }
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (!(this.bgF instanceof exP)) {
            bgA.warn((Object)"Target has to be a character");
            return;
        }
        exP exP2 = (exP)this.bgF;
        ejg_0 ejg_02 = exP2.dmn();
        if (this.jUA == 0) {
            ejg_02.b(this.rdw, this.bfF, this.aQL);
        } else {
            ejg_02.a(this.rdw, this.jUA, this.bfF, this.aQL);
        }
    }

    @Override
    public void bbS() {
        if (!this.rdU) {
            return;
        }
        if (!(this.bgF instanceof exP)) {
            bgA.warn((Object)"Target has to be a character");
            return;
        }
        exP exP2 = (exP)this.bgF;
        ejg_0 ejg_02 = exP2.dmn();
        if (this.jUA == 0) {
            ejg_02.b(this.rdw, this.bfF, -this.aQL);
        } else {
            ejg_02.a(this.rdw, this.jUA, this.bfF, -this.aQL);
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
    public void aVH() {
        super.aVH();
        this.jUA = 0;
        this.bfF = 0;
    }

    @Override
    protected void b(io_1 io_12) {
        super.b(io_12);
        io_12.a(io_12.QA().MS().ep(this.jUA));
    }

    @Override
    protected void f(im_1 im_12) {
        super.f(im_12);
        this.jUA = im_12.QA().Mg();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fEa();
    }
}

