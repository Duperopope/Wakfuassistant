/*
 * Decompiled with CFR 0.152.
 */
public class ePh
extends ero_0 {
    private static final aox_1 rcO = new enz_0(new eny_0("Echange de position standard", new enx_0[0]), new eny_0("Bypass stabilisation", new enx_0("Bypass stabilisation (0 = false, 1 = true)", eNA.qYC)));
    private etx_0 rcP;
    private etx_0 rcQ;
    private int rcR;
    private int rcS;
    private short rcT;
    private int nan;
    private int nao;
    private short rcU;

    @Override
    public aox_1 bEt() {
        return rcO;
    }

    public ePh() {
        this.bby();
    }

    @Override
    public final void bby() {
        super.bby();
        this.oC(184);
    }

    public ePh fDv() {
        ePh ePh2 = new ePh();
        ePh2.rcR = this.rcR;
        ePh2.rcS = this.rcS;
        ePh2.rcT = this.rcT;
        ePh2.nan = this.nan;
        ePh2.nao = this.nao;
        ePh2.rcU = this.rcU;
        return ePh2;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        boolean bl2 = true;
        if (this.bgE instanceof eza_0) {
            if (((eza_0)((Object)this.bgE)).buW()) {
                bl2 = false;
            }
            if (this.bgE.baI() || this.bgE.baM()) {
                bl2 = false;
            }
        }
        if (this.bgF instanceof eza_0 && ((eza_0)((Object)this.bgF)).buW()) {
            bl2 = false;
        }
        qu_0 qu_02 = this.bgF;
        qu_0 qu_03 = this.bgE;
        boolean bl3 = false;
        if (((enk_0)this.bgC).fAn() == 1) {
            boolean bl4 = bl3 = ((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu) == 1;
        }
        if (!bl3 && !this.a(eNi.qWX)) {
            boolean bl5;
            boolean bl6;
            boolean bl7;
            boolean bl8 = bl7 = this.bgF != null && !this.bgF.a(exe_1.rEc);
            if (this.bgF != null && (this.bgF.a(exe_1.rDm) || !bl7)) {
                this.mk(true);
                return;
            }
            boolean bl9 = bl6 = this.bgE != null && !this.bgE.a(exe_1.rEc);
            if (this.bgE != null && (this.bgE.a(exe_1.rDm) || !bl6)) {
                this.mk(true);
                return;
            }
            boolean bl10 = this.bgE != null && this.bgF != null;
            boolean bl11 = bl10 && ((eyo_0)((Object)this.bgF)).bcP() == ((eyo_0)((Object)this.bgE)).bcP();
            boolean bl12 = bl7 && bl6;
            boolean bl13 = bl10 && (this.bgF.a(exe_1.rFe) || this.bgE.a(exe_1.rFe));
            boolean bl14 = bl5 = bl10 && (this.bgF.a(exe_1.rFf) || this.bgE.a(exe_1.rFf));
            if (!(bl11 || bl12 && !bl13)) {
                this.mk(true);
                return;
            }
            if (bl11 && (!bl12 || bl5)) {
                this.mk(true);
                return;
            }
        }
        if (bl2 && qu_03 != null && qu_02 != null && this.bgF instanceof esu_0) {
            if (this.bbt()) {
                this.rcR = qu_03.bcC();
                this.rcS = qu_03.bcD();
                this.rcT = qu_03.bcE();
                this.nan = qu_02.bcC();
                this.nao = qu_02.bcD();
                this.rcU = qu_02.bcE();
            }
            if (this.bbt() && qu_02 instanceof exP && qu_03 instanceof exP) {
                this.c((exP)qu_02, (exP)qu_03);
            }
            qu_03.b(this.nan, this.nao, this.rcU);
            qu_02.b(this.rcR, this.rcS, this.rcT);
            QD qD2 = this.L(qD);
            if (qD2 != null) {
                if (this.aZD()) {
                    qD2.f(qu_02);
                } else {
                    qD2.f(qu_03);
                }
            }
            this.d(qD2, bl);
            if (this.bgJ.bai() != null && this.bbt()) {
                this.b(qu_02, qu_03);
            }
        } else {
            this.mk(true);
        }
    }

    private void c(exP exP2, exP exP3) {
        etu_0 etu_02 = ((ent_0)this.bgJ).fBq();
        this.rcP = new etx_0(etu_02, exP3, exP3.aZw());
        this.rcP.aw(exP3.aZw());
        this.rcQ = new etx_0(etu_02, exP2, exP2.aZw());
        this.rcQ.aw(exP2.aZw());
    }

    private void b(qu_0 qu_02, qu_0 qu_03) {
        if (this.rcP == null || this.rcQ == null) {
            return;
        }
        this.rcP.av(qu_03.aZw());
        this.rcP.fJM();
        if (this.rcP.fJN()) {
            this.rcP.fJS();
        }
        this.rcQ.av(qu_02.aZw());
        this.rcQ.fJM();
        if (this.rcQ.fJN()) {
            this.rcQ.fJS();
        }
    }

    @Override
    public void E(QD qD) {
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
        this.rcP = null;
        this.rcQ = null;
        super.aVH();
    }

    @Override
    protected void b(io_1 io_12) {
        io_12.a(ii_1.MR().a(ii_2.Qc().eH(this.nan).eI(this.nao).eJ(this.rcU)).b(ii_2.Qc().eH(this.rcR).eI(this.rcS).eJ(this.rcT)));
    }

    @Override
    protected void f(im_1 im_12) {
        if (im_12.Qz()) {
            ii_1 ii_12 = im_12.QA();
            ii_2 ii_22 = ii_12.LX();
            this.nan = ii_22.getX();
            this.nao = ii_22.getY();
            this.rcU = GC.cu(ii_22.NN());
            ii_2 ii_23 = ii_12.Mo();
            this.rcR = ii_23.getX();
            this.rcS = ii_23.getY();
            this.rcT = GC.cu(ii_23.NN());
        }
    }

    public int fDw() {
        return this.rcR;
    }

    public int fDx() {
        return this.rcS;
    }

    public short fDy() {
        return this.rcT;
    }

    public int fDz() {
        return this.nan;
    }

    public int fDA() {
        return this.nao;
    }

    public short fDB() {
        return this.rcU;
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fDv();
    }
}

