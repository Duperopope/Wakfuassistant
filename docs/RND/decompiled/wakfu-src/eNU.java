/*
 * Decompiled with CFR 0.152.
 */
public class eNU
extends ero_0 {
    private static final aox_1 qZX = new enz_0(new eny_0("Ordre \u00e0 une cr\u00e9ature cibl\u00e9 sur une autre cr\u00e9ature", new enx_0("Id", eNA.qYB)));
    private long qZY;

    @Override
    public aox_1 bEt() {
        return qZX;
    }

    public eNU() {
        this.bby();
    }

    public eNU fBN() {
        return new eNU();
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.bgF != null && this.bgF instanceof exP && this.aQL >= 0) {
            ((exP)this.bgF).d(this.aQL, this.bgF);
        }
    }

    @Override
    public void bbS() {
        if (this.bgF != null && this.bgF instanceof exP && this.aQL >= 0) {
            ((exP)this.bgF).e(this.aQL, this.bgF);
        }
        super.bbS();
    }

    @Override
    public void E(QD qD) {
        short s = this.fHf();
        this.aQL = this.bgC != null ? ((enk_0)this.bgC).a(0, s, ene_0.qPu) : -1;
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
    protected void b(io_1 io_12) {
        io_12.a(ii_1.MR().ae(this.qZY));
    }

    @Override
    protected void f(im_1 im_12) {
        if (im_12.Qz()) {
            this.qZY = im_12.QA().LV();
        }
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fBN();
    }
}

