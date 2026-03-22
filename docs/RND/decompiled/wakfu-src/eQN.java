/*
 * Decompiled with CFR 0.152.
 */
public class eQN
extends ero_0 {
    private static final aox_1 rgB = new enz_0(new eny_0("Standard", new enx_0("area ID", eNA.qYB)), new eny_0("Niveau de la zone", new enx_0("area ID", eNA.qYB), new enx_0("area Level", eNA.qYC)), new eny_0("Dur\u00e9e de la zone apr\u00e8s la fin de cet effet", new enx_0("area ID", eNA.qYB), new enx_0("area Level", eNA.qYD), new enx_0("L'area reste apres la fin de cet effet (1 = Oui, 0 = Non (default))", eNA.qYD)), new eny_0("Direction de la zone", new enx_0("area ID", eNA.qYB), new enx_0("area Level", eNA.qYD), new enx_0("L'area reste apres la fin de cet effet (1 = Oui, 0 = Non (default))", eNA.qYD), new enx_0("area Direction (default = caster if he exists else 7)", eNA.qYC)));
    protected eSS odg;
    protected long rgq;
    protected short rgC;
    protected boolean rgD = false;
    private boolean rgE = false;
    private boolean pya = false;
    private boolean rgF = true;
    protected abi_1 rgG;
    static final int rgH = 15;

    public eQN() {
        this.bby();
    }

    public eQN(boolean bl, boolean bl2, boolean bl3) {
        this.rgE = bl;
        this.pya = bl2;
        this.rgF = bl3;
    }

    public static eQN a(qm_0<enk_0> qm_02, acd_1 acd_12, int n) {
        eQN eQN2 = new eQN();
        eQN2.o = enf_0.qTV.d();
        eQN2.bgM = ((ero_0)enf_0.qTV.bkx()).baZ();
        eQN2.bby();
        eQN2.bgG.C(acd_12);
        eQN2.aQL = n;
        eQN2.rgq = qm_02.bah().bam();
        eQN2.bgO = -1;
        eQN2.rgC = (short)-1;
        eQN2.bgJ = qm_02;
        return eQN2;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.rgD = false;
        this.odg = null;
        this.rgG = null;
    }

    public eQN fFK() {
        return new eQN();
    }

    public eQN fFQ() {
        eQN eQN2 = this.fFK();
        eQN2.rgq = this.rgq;
        eQN2.odg = this.odg;
        eQN2.rgD = this.rgD;
        eQN2.rgE = this.rgE;
        eQN2.pya = this.pya;
        eQN2.rgF = this.rgF;
        eQN2.rgC = this.rgC;
        return eQN2;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        eSS eSS2 = eTo.fIZ().iY(this.aQL);
        if (eSS2 != null && this.bgG != null) {
            this.d(eSS2);
            if (this.bgJ == null || this.bgJ.bai() == null) {
                bgA.warn((Object)"Impossible d'ajouter une zone d'effet au combat le contexte est null ou l'effectAreaManager est null");
                return;
            }
            this.d(qD, bl);
            this.odg.bcW();
            this.bgJ.bai().a(this.odg);
            this.mj(bl);
        } else {
            bgA.error((Object)("Impossible d'ajouter une zone inconnue " + this.aQL));
            this.mk(true);
        }
    }

    protected void d(eSS eSS2) {
        abi_1 abi_12 = this.rgG != null ? this.rgG : (this.bgE != null ? this.bgE.bcB() : abi_1.dzq);
        this.odg = eSS2.b(new etj_0(this.rgq, this.bgG.getX(), this.bgG.getY(), this.bgG.bdi(), this.bgJ, this.bci() != null ? this.bci().Sn() : 0L, this.bci(), this.rgC, abi_12));
        this.odg.bc(!this.rgD);
        if (this.Ty() && !this.rgD) {
            this.odg.a(this);
        }
    }

    protected qu_0 bci() {
        return this.bgE;
    }

    public void mc(boolean bl) {
        this.rgE = bl;
    }

    @Override
    public boolean bbA() {
        return this.rgE;
    }

    @Override
    public boolean bbB() {
        return this.pya;
    }

    @Override
    public boolean bbC() {
        return this.rgF;
    }

    @Override
    public void E(QD qD) {
        short s = this.fHf();
        if (this.bgC != null) {
            this.aQL = ((enk_0)this.bgC).a(0, s, ene_0.qPu);
        }
        this.rgq = this.bgJ.bah().bam();
        this.en(s);
        if (((enk_0)this.bgC).fAn() >= 3) {
            boolean bl = this.rgD = ((enk_0)this.bgC).a(2, s, ene_0.qPu) == 1;
        }
        if (((enk_0)this.bgC).fAn() >= 4) {
            this.rgG = abi_1.wG(((enk_0)this.bgC).a(3, s, ene_0.qPu));
        }
    }

    private void en(short s) {
        this.rgC = ((enk_0)this.bgC).fAn() >= 2 ? (short)((enk_0)this.bgC).a(1, s, ene_0.qPu) : this.fHf();
    }

    @Override
    public void bbS() {
        if (this.odg != null && !this.rgD && this.Ty()) {
            this.bgJ.bai().b(this.odg);
        }
        super.bbS();
    }

    @Override
    public aox_1 bEt() {
        return rgB;
    }

    public void md(boolean bl) {
        this.rgD = bl;
    }

    public void eo(short s) {
        this.rgC = s;
    }

    public eSS fav() {
        return this.odg;
    }

    @Override
    protected void b(io_1 io_12) {
        io_12.a(ii_1.MR().af(this.rgq).en(this.rgC).r(this.rgD).eo(this.rgG != null ? this.rgG.wp() : -1));
    }

    @Override
    protected void f(im_1 im_12) {
        if (im_12.Qz()) {
            ii_1 ii_12 = im_12.QA();
            this.rgq = ii_12.Mk();
            this.rgC = GC.cu(ii_12.tL());
            this.rgD = ii_12.Mc();
            this.rgG = ii_12.Ma() == -1 ? null : abi_1.wG(ii_12.Ma());
        }
    }

    public static QQ<enk_0, etj_0> a(enk_0 enk_02, eNl eNl2) {
        short s = eNl2.cmL();
        int n = enk_02.a(0, s, ene_0.qPu);
        return eTo.fIZ().iY(n);
    }

    public void o(abi_1 abi_12) {
        this.rgG = abi_12;
    }

    public long RD() {
        return this.rgq;
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fFQ();
    }
}

