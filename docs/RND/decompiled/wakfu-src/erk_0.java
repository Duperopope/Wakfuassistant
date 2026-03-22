/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eRk
 */
abstract class erk_0
extends ero_0 {
    protected long rgq;
    protected ezw rhx;
    private esy_0 rhy;
    private static final aox_1 rhz = new enz_0(new eny_0("Params", new enx_0[0]), new eny_0("Avec Ratio de puissance", new enx_0("Ratio", eNA.qYD)));
    public final fi_1 rhA = new eRl(this);

    @Override
    public aox_1 bEt() {
        return rhz;
    }

    protected erk_0() {
        this.bby();
    }

    @Override
    public void aVH() {
        this.rhy = null;
        this.rhx = null;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (!(this.bgE instanceof exP)) {
            this.fHg();
            return;
        }
        bgA.info((Object)("Instanciation d'une nouvelle invocation avec un id de " + this.rgq));
        esy_0 esy_02 = this.fGB();
        exP exP2 = this.fGy();
        exP exP3 = exP2.b(this.rgq, this.fGA(), esy_02.aWP(), this.rhx, null, esy_02.fIp(), null);
        if (esy_02.fIv() && this.bgE instanceof exP) {
            exP3.OE(((exP)this.bgE).doZ());
        }
        if (this.bbt()) {
            this.rhx.N(exP3.bcQ());
        }
        this.d(qD, bl);
        if (this.bbt() && exP2.dlK() != null) {
            exP2.dlK().bm(exP3);
        }
    }

    @Override
    public void E(QD qD) {
        this.rgq = this.bgJ.bah().bam();
        exP exP2 = this.fGz();
        esy_0 esy_02 = this.fGB();
        esx_0 esx_02 = esy_02.fIs();
        fqP<fqE> fqP2 = esx_02.a(exP2, esy_02, this.fHf());
        this.rhx = esy_02.fIr().b(exP2.doV().aWP(), exP2.getName() + " clone", exP2.c(exx_2.rGi), exP2.cmL(), exP2, this.fGx(), fqP2);
    }

    @Override
    protected void a(io_1 io_12) {
        super.a(io_12);
        io_12.a(iq_1.RF().aq(this.rgq).RL());
    }

    @Override
    protected void e(im_1 im_12) {
        super.e(im_12);
        if (im_12.QJ()) {
            iq_1 iq_12 = im_12.QK();
            this.rgq = iq_12.RD();
            this.bgF = null;
        }
    }

    @Override
    public fi_1 bcc() {
        return this.rhA;
    }

    protected void fGw() {
        exP exP2 = (exP)this.bbc();
        this.rhx = exP2.dkB() == null ? this.fGB().fIr().edS() : this.fGB().fIr().b((short)100, exP2.dkB().beS(), exP2.dkB().beR(), false, false, false);
    }

    protected final int fGx() {
        short s = this.fHf();
        if (this.bgC != null && ((enk_0)this.bgC).fAn() > 0) {
            return ((enk_0)this.bgC).a(0, s, ene_0.qPu);
        }
        return 100;
    }

    protected final exP fGy() {
        if (this.bgE instanceof exP) {
            return (exP)this.bgE;
        }
        return null;
    }

    protected exP fGz() {
        qu_0 qu_02;
        qu_0 qu_03 = qu_02 = this.fGB().fIo() ? this.bgE : this.bgF;
        if (qu_02 instanceof exP) {
            return (exP)qu_02;
        }
        return null;
    }

    protected acd_1 fGA() {
        return this.bgG;
    }

    @Override
    public boolean bbA() {
        return true;
    }

    @Override
    public boolean bbC() {
        return true;
    }

    @Override
    public boolean bbB() {
        return false;
    }

    @NotNull
    protected esy_0 fGB() {
        if (this.rhy != null) {
            return this.rhy;
        }
        this.rhy = this.fGC();
        return this.rhy;
    }

    @NotNull
    protected abstract esy_0 fGC();
}

