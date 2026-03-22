/*
 * Decompiled with CFR 0.152.
 */
public class eRq
extends ero_0 {
    private static final aox_1 rhO = new enz_0(new eny_0("Invocation d'une image", new enx_0("ID de la breed qui servira de base \u00e0 l'image", eNA.qYC), new enx_0("Niveau de l'invocation (<= 0 = niveau du controller)", eNA.qYC)));
    private static final short rhP = 0;
    private short aZk;
    private long rgq;
    protected eze_0 rhQ;
    public final fi_1 rhR = new eRr(this);

    @Override
    public aox_1 bEt() {
        return rhO;
    }

    public eRq() {
        this.bby();
    }

    public eRq fGG() {
        eRq eRq2 = new eRq();
        return eRq2;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.bgE instanceof exP) {
            bgA.info((Object)("Instanciation d'une nouvelle invocation avec un id de " + this.rgq));
            exP exP2 = (exP)this.bgE;
            exP exP3 = exP2.b(this.rgq, this.bgG, this.aZk, this.rhQ, null, false, null);
            if (this.bbt()) {
                this.rhQ.N(exP3.bcQ());
            }
            this.d(qD, bl);
            if (this.bbt() && ((exP)this.bgE).dlK() != null) {
                ((exP)this.bgE).dlK().bm(exP3);
            }
            exP3.f(exe_1.rEh);
            exP3.f(exe_1.rDt);
        }
    }

    @Override
    public void E(QD qD) {
        if (this.bgC == null) {
            return;
        }
        exP exP2 = (exP)this.bgE;
        short s = this.fHf();
        this.aZk = (short)((enk_0)this.bgC).a(0, s, ene_0.qPu);
        this.aQL = ((enk_0)this.bgC).a(1, s, ene_0.qPu);
        if (this.aQL <= 0) {
            this.aQL = exP2.cmL();
        }
        this.rgq = this.bgJ.bah().bam();
        fqP<? extends fqE> fqP2 = exP2.dkB();
        fqP<fqE> fqP3 = new fqP<fqE>(0, fqP2.beS(), fqP2.beR(), false, false, false);
        this.rhQ = eze_0.fmL().b(exP2.doV().aWP(), exP2.getName() + " clone", exP2.c(exx_2.rGi), (short)this.aQL, exP2, fqP3);
    }

    @Override
    public boolean bbA() {
        return true;
    }

    @Override
    public boolean bbB() {
        return false;
    }

    @Override
    public boolean bbC() {
        return true;
    }

    @Override
    protected void a(io_1 io_12) {
        super.a(io_12);
        io_12.a(iq_1.RF().aq(this.rgq).eP(this.aZk).RL());
    }

    @Override
    protected void e(im_1 im_12) {
        super.e(im_12);
        if (im_12.QJ()) {
            iq_1 iq_12 = im_12.QK();
            this.rgq = iq_12.RD();
            this.aZk = GC.cu(iq_12.xT());
            this.bgF = null;
        }
    }

    @Override
    public fi_1 bcc() {
        return this.rhR;
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fGG();
    }
}

