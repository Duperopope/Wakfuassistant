/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ePv
 */
public class epv_0
extends ero_0 {
    private static final aox_1 rdx = new enz_0(new eny_0("Valeur du modificateur", new enx_0("Modificateur", eNA.qYC)), new eny_0("M\u00e9tier concern\u00e9", new enx_0("Modificateur", eNA.qYC), new enx_0("Id du m\u00e9tier", eNA.qYD)));
    private int jUA;

    @Override
    public aox_1 bEt() {
        return rdx;
    }

    public epv_0 fEb() {
        epv_0 epv_02 = new epv_0();
        epv_02.jUA = this.jUA;
        return epv_02;
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
            ejg_02.b(eje_0.qyu, 2, this.aQL);
            ejg_02.b(eje_0.qyu, 3, this.aQL);
            ejg_02.b(eje_0.qyu, 8, this.aQL);
        } else {
            ejg_02.a(eje_0.qyu, this.jUA, 2, this.aQL);
            ejg_02.a(eje_0.qyu, this.jUA, 3, this.aQL);
            ejg_02.a(eje_0.qyu, this.jUA, 8, this.aQL);
        }
    }

    @Override
    public void bbS() {
        if (!(this.bgF instanceof exP)) {
            bgA.warn((Object)"Target has to be a character");
            return;
        }
        exP exP2 = (exP)this.bgF;
        ejg_0 ejg_02 = exP2.dmn();
        if (this.jUA == 0) {
            ejg_02.b(eje_0.qyu, 2, -this.aQL);
            ejg_02.b(eje_0.qyu, 3, -this.aQL);
            ejg_02.b(eje_0.qyu, 8, -this.aQL);
        } else {
            ejg_02.a(eje_0.qyu, this.jUA, 2, -this.aQL);
            ejg_02.a(eje_0.qyu, this.jUA, 3, -this.aQL);
            ejg_02.a(eje_0.qyu, this.jUA, 8, -this.aQL);
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
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fEb();
    }
}

