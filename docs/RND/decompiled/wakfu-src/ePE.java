/*
 * Decompiled with CFR 0.152.
 */
public class ePE
extends ero_0 {
    private static final aox_1 rdS = new enz_0(new eny_0("Pas de params", new enx_0[0]), new eny_0("Set (certaines propri\u00e9t\u00e9s seulement)", new enx_0("valeur", eNA.qYC)));
    private pv_0 pso;
    private boolean rdT;
    private boolean rdU = false;
    private byte rdV = (byte)-1;
    private acd_1 rba;
    private abi_1 rbb;

    @Override
    public aox_1 bEt() {
        return rdS;
    }

    public ePE() {
        this.bby();
    }

    public ePE(pv_0 pv_02) {
        this.pso = pv_02;
        this.bby();
    }

    @Override
    public void aVH() {
        this.rdU = false;
        super.aVH();
    }

    public pv_0 fED() {
        return this.pso;
    }

    public ePE fEE() {
        ePE ePE2 = new ePE();
        ePE2.pso = this.pso;
        ePE2.rdT = this.rdT;
        ePE2.rdV = this.rdV;
        return ePE2;
    }

    @Override
    public void bby() {
        super.bby();
    }

    @Override
    protected void c(QD qD, boolean bl) {
        rh_0 rh_02;
        boolean bl2;
        if (this.bgF == null || this.pso == null) {
            this.mk(true);
            return;
        }
        switch (this.pso.aZd()) {
            case 4: {
                if (!(this.bgF instanceof QQ)) break;
                if (this.rdV > 0) {
                    byte by = this.bgF.b(this.pso);
                    if (by + this.rdV > 127) {
                        this.rdV = (byte)(127 - by);
                    }
                    this.bgF.a(this.pso, this.rdV);
                } else {
                    this.bgF.f(this.pso);
                }
                this.rdU = true;
                break;
            }
            case 0: {
                if (this.bbh().baj() != 1) {
                    if (this.rdV > 0) {
                        byte by = this.bgF.b(this.pso);
                        if (by + this.rdV > 127) {
                            this.rdV = (byte)(127 - by);
                        }
                        this.bgF.a(this.pso, this.rdV);
                    } else {
                        this.bgF.f(this.pso);
                    }
                    this.rdU = true;
                    break;
                }
                exe_1 exe_12 = ((ezj_0)this.pso).fmM();
                if (exe_12 == null) break;
                if (this.rdV > 0) {
                    byte by = this.bgF.b(this.pso);
                    if (by + this.rdV > 127) {
                        this.rdV = (byte)(127 - by);
                    }
                    this.bgF.a(exe_12, this.rdV);
                } else {
                    this.bgF.f(exe_12);
                }
                this.rdU = true;
                break;
            }
            default: {
                if (this.rdV > 0) {
                    byte by = this.bgF.b(this.pso);
                    if (by + this.rdV > 127) {
                        this.rdV = (byte)(127 - by);
                    }
                    this.bgF.a(this.pso, (byte)(by + this.rdV));
                } else {
                    this.bgF.f(this.pso);
                }
                this.rdU = true;
            }
        }
        boolean bl3 = bl2 = this.bgJ.baf() != null;
        if (this.pso == exe_1.rDL && bl2) {
            ((ewk_1)this.bgJ.baf()).re(this.bgF.Sn());
        }
        if (this.pso == exe_1.rDl && bl2) {
            this.bgJ.baf().bhI();
        }
        if (this.pso == exe_1.rDF && this.bgF.a(exx_2.rGj)) {
            this.bgF.b(exx_2.rGj).aYP();
        }
        if (this.pso == exe_1.rDI && this.bgF.a(exx_2.rGk)) {
            this.bgF.b(exx_2.rGk).aYP();
        }
        if (this.pso == exe_1.rDz && this.bgF.a(exx_2.rGl)) {
            pr_0 pr_02 = this.bgF.b(exx_2.rGl);
            if (pr_02 == null) {
                bgA.error((Object)("charac nulle alors hasCharac renvoie true " + String.valueOf(this.bgF) + ", " + this.bgF.getClass().getSimpleName()));
            } else {
                pr_02.aYT();
            }
        }
        if ((this.pso == exe_1.rDg || this.pso == exe_1.rDs) && this.bgF instanceof rj_0 && (rh_02 = this.bgJ.bag()) != null) {
            rh_02.d((rj_0)((Object)this.bgF));
        }
    }

    public byte fEF() {
        if (this.bgC == null) {
            return -1;
        }
        short s = this.fHf();
        if (((enk_0)this.bgC).fAn() > 1) {
            return (byte)((enk_0)this.bgC).a(1, s, ene_0.qPu);
        }
        if (((enk_0)this.bgC).fAn() == 1) {
            return (byte)((enk_0)this.bgC).a(0, s, ene_0.qPu);
        }
        return -1;
    }

    @Override
    public void E(QD qD) {
        this.rdU = false;
        short s = this.fHf();
        this.rdV = this.bgC == null ? (byte)-1 : (((enk_0)this.bgC).fAn() == 1 ? (byte)((enk_0)this.bgC).a(0, s, ene_0.qPu) : (byte)-1);
        this.aQL = this.pso.aJr();
    }

    @Override
    public void bbS() {
        if (this.rdU && this.bgF != null && this.pso != null) {
            byte by;
            if (this.rdV > 1) {
                by = (byte)(this.bgF.b(this.pso) - this.rdV);
                this.bgF.a(this.pso, by);
            } else {
                this.bgF.g(this.pso);
            }
            this.rdT = false;
            if (this.pso == exe_1.rDl && this.bgJ.baf() != null) {
                this.bgJ.baf().bhI();
            }
            byte by2 = by = this.pso == exe_1.rDg || this.pso == exe_1.rDs ? (byte)1 : 0;
            if (by != 0) {
                rh_0 rh_02;
                if (this.rba != null) {
                    this.bgF.b(this.rba.getX(), this.rba.getY(), this.rba.bdi());
                    this.bgF.a(this.rbb);
                }
                if ((rh_02 = this.bgJ.bag()) != null) {
                    if (this.bgF instanceof rj_0) {
                        rh_02.c((rj_0)((Object)this.bgF));
                    }
                    rh_02.e((rj_0)((Object)this.bgF));
                } else {
                    bgA.error((Object)("pas de combat associ\u00e9 \u00e0 la target " + this.bgF.toString()));
                }
            }
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
        return false;
    }

    public void aq(acd_1 acd_12) {
        this.rba = acd_12;
    }

    @Override
    protected void b(io_1 io_12) {
        ik_1 ik_12 = ii_1.MR();
        ik_12.w(this.rdU);
        if (this.pso != exe_1.rDg && this.pso != exe_1.rDs) {
            return;
        }
        io_12.a(ik_12.a(ii_2.Qc().eH(this.bgF.bcC()).eI(this.bgF.bcD()).eJ(this.bgF.bcE())).eo(this.bgF.bcB().dzy));
    }

    @Override
    protected void f(im_1 im_12) {
        if (im_12.Qz()) {
            ii_1 ii_12 = im_12.QA();
            this.rdU = ii_12.MB();
            if (!ii_12.LW()) {
                return;
            }
            ii_2 ii_22 = ii_12.LX();
            this.rba = new acd_1(ii_22.getX(), ii_22.getY(), GC.cu(ii_22.NN()));
            this.rbb = abi_1.wG(ii_12.Ma());
        }
    }

    @Override
    public boolean fCn() {
        if (this.pso == exe_1.rDg || this.pso == exe_1.rDs) {
            return true;
        }
        return super.fCn();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fEE();
    }
}

