/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eRc
 */
abstract class erc_0
extends ero_0 {
    private static final aox_1 rgW = new enz_0(new eny_0("Propri\u00e9t\u00e9", new enx_0("Valeur", eNA.qYC), new enx_0("Propri\u00e9t\u00e9", eNA.qYD)));
    protected int rgX;

    erc_0() {
    }

    @Override
    protected void b(io_1 io_12) {
        io_12.a(ii_1.MR().ek(this.rgX));
    }

    @Override
    protected void f(im_1 im_12) {
        if (im_12.Qz()) {
            this.rgX = im_12.QA().getValue();
        }
    }

    @Override
    public aox_1 bEt() {
        return rgW;
    }

    @Override
    public void E(QD qD) {
        if (this.bgC == null) {
            return;
        }
        this.aQL = ((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu);
        this.rgX = ((enk_0)this.bgC).a(1, this.fHf(), ene_0.qPu);
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (!(this.bgF instanceof exP)) {
            this.fHg();
            return;
        }
        fqS fqS2 = fqS.Zk(this.rgX);
        if (fqS2 == null) {
            bgA.error((Object)("Propri\u00e9t\u00e9 inconnue " + this.rgX + " m_effectId = " + this.aZH()));
            this.fHg();
            return;
        }
        this.c(fqS2);
    }

    @Override
    public void bbS() {
        if (!(this.bgF instanceof exP)) {
            return;
        }
        fqS fqS2 = fqS.Zk(this.rgX);
        if (fqS2 == null) {
            bgA.error((Object)("Propri\u00e9t\u00e9 inconnue " + this.rgX + " m_effectId = " + this.aZH()));
            return;
        }
        this.d(fqS2);
    }

    abstract void c(fqS var1);

    abstract void d(fqS var1);

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
}

