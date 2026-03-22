/*
 * Decompiled with CFR 0.152.
 */
public class eQG
extends ero_0 {
    private static final aox_1 rgo = new enz_0(new eny_0("Param standard (le level de l'aura = level du sort)", new enx_0("id de l'aura", eNA.qYB)));
    private QQ rgp;
    private long rgq;

    @Override
    public aox_1 bEt() {
        return rgo;
    }

    public eQG fFJ() {
        eQG eQG2 = new eQG();
        eQG2.rgq = this.rgq;
        eQG2.rgp = this.rgp;
        return eQG2;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        eSK eSK2 = eTo.fIZ().iT(this.aQL);
        if (eSK2 != null && this.bgF != null && this.bgG != null) {
            short s = this.fHf();
            this.rgp = eSK2.b(new etj_0(this.rgq, this.bgG.getX(), this.bgG.getY(), this.bgG.bdi(), this.bgJ, this.bgF.Sn(), this.bgF, s, this.bgF.bcB()));
            this.d(qD, bl);
            if (this.bgJ.bai() != null) {
                this.bgJ.bai().a(this.rgp);
            }
        } else {
            this.mk(true);
        }
    }

    @Override
    public void E(QD qD) {
        short s = this.fHf();
        if (this.bgC != null) {
            this.aQL = ((enk_0)this.bgC).a(0, s, ene_0.qPu);
        }
        this.rgq = this.bgJ.bah().bam();
    }

    @Override
    public void bbS() {
        QR qR;
        if (this.rgp != null && (qR = this.bgJ.bai()) != null) {
            qR.b(this.rgp);
        }
        super.bbS();
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
        return true;
    }

    @Override
    protected void b(io_1 io_12) {
        io_12.a(ii_1.MR().af(this.rgq));
    }

    @Override
    protected void f(im_1 im_12) {
        if (im_12.Qz()) {
            this.rgq = im_12.QA().Mk();
        }
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fFJ();
    }
}

