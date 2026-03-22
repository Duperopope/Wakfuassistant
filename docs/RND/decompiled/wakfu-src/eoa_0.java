/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eOA
 */
public class eoa_0
extends era_0 {
    private static final aox_1 rbx = new enz_0(new eny_0("Normal", new enx_0[0]), new eny_0("Original controleur", new enx_0("Controleur courant du caster (0 = non, 1 = oui)", eNA.qYD)));
    private boolean rby;
    private boolean rbz;

    @Override
    protected void b(io_1 io_12) {
        super.b(io_12);
        io_12.a(io_12.QA().MS().r(this.rbz));
    }

    @Override
    protected void f(im_1 im_12) {
        super.f(im_12);
        if (im_12.Qz()) {
            this.rbz = im_12.QA().Mc();
        }
    }

    @Override
    public aox_1 bEt() {
        return rbx;
    }

    public eoa_0 fCM() {
        return new eoa_0();
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.bgE == null || this.bgF == null) {
            this.fHg();
            return;
        }
        if (!(this.bgE instanceof exP)) {
            return;
        }
        if (!(this.bgF instanceof exP)) {
            return;
        }
        exP exP2 = (exP)this.bgE;
        long l = this.rbz && exP2.dlL() != null ? exP2.dlL().Sn() : this.bgE.Sn();
        exP2.p(this.bgF.Sn(), l);
        if (this.bbt()) {
            this.fGa();
        }
        this.rby = ((exP)this.bgF).fgk();
        if (((exP)this.bgE).fgk()) {
            ((exP)this.bgF).lk(true);
        }
    }

    @Override
    public void bbS() {
        if (this.rdU && this.bgF instanceof exP) {
            exP exP2 = (exP)this.bgF;
            exP2.aZh();
            exP2.lk(this.rby);
        }
        super.bbS();
    }

    @Override
    public void E(QD qD) {
        if (this.bgC == null) {
            return;
        }
        this.rbz = ((enk_0)this.bgC).fAn() >= 1 ? ((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu) == 1 : false;
    }

    @Override
    public boolean bbA() {
        return true;
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
        this.rbz = false;
        super.aVH();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fCM();
    }
}

