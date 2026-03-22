/*
 * Decompiled with CFR 0.152.
 */
public final class eOq
extends ero_0 {
    private static final aox_1 raZ = new enz_0(new eny_0("D\u00e9faut", new enx_0("Id de la propri\u00e9t\u00e9", eNA.qYC)));
    private acd_1 rba;
    private abi_1 rbb;

    @Override
    public aox_1 bEt() {
        return raZ;
    }

    public eOq() {
        this.bby();
    }

    public void aq(acd_1 acd_12) {
        this.rba = acd_12;
    }

    @Override
    public QD<enk_0, eNl> bbo() {
        eOq eOq2 = new eOq();
        eOq2.aQL = this.aQL;
        return eOq2;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        Object object;
        boolean bl2;
        if (this.bgF == null) {
            this.mk(true);
            return;
        }
        if (!(this.bgF instanceof exP)) {
            bgA.error((Object)("Can not use ApplyFightProperty " + this.aQL + " on something else than BasicCharacterInfo, effectId : " + this.aZH()));
            this.mk(true);
            return;
        }
        exe_1 exe_12 = exe_1.Te(this.aQL);
        if (exe_12 == null) {
            this.mk(true);
            return;
        }
        this.bgF.f(exe_12);
        boolean bl3 = bl2 = this.bgJ.baf() != null;
        if (exe_12 == exe_1.rDL && bl2) {
            ((ewk_1)this.bgJ.baf()).re(this.bgF.Sn());
        }
        if (exe_12 == exe_1.rDl && bl2) {
            this.bgJ.baf().bhI();
        }
        if (exe_12 == exe_1.rDF && this.bgF.a(exx_2.rGj)) {
            this.bgF.b(exx_2.rGj).aYP();
        }
        if (exe_12 == exe_1.rDI && this.bgF.a(exx_2.rGk)) {
            this.bgF.b(exx_2.rGk).aYP();
        }
        if (exe_12 == exe_1.rDz && this.bgF.a(exx_2.rGl)) {
            object = this.bgF.b(exx_2.rGl);
            if (object == null) {
                bgA.error((Object)("charac nulle alors hasCharac renvoie true " + String.valueOf(this.bgF) + ", " + this.bgF.getClass().getSimpleName()));
            } else {
                ((pr_0)object).aYT();
            }
        }
        if ((exe_12 == exe_1.rDg || exe_12 == exe_1.rDs) && this.bgF instanceof rj_0 && (object = this.bgJ.bag()) != null) {
            ((rh_0)object).d((rj_0)((Object)this.bgF));
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
    public void E(QD qD) {
        this.aQL = ((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu);
    }

    @Override
    public void bbS() {
        boolean bl;
        if (this.bgF == null) {
            return;
        }
        exe_1 exe_12 = exe_1.Te(this.aQL);
        if (exe_12 == null) {
            return;
        }
        this.bgF.g(exe_12);
        boolean bl2 = bl = exe_12 == exe_1.rDg || exe_12 == exe_1.rDs;
        if (bl) {
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

    @Override
    protected void b(io_1 io_12) {
        ik_1 ik_12 = ii_1.MR();
        ik_12.w(this.rdU);
        exe_1 exe_12 = exe_1.Te(this.aQL);
        if (exe_12 != exe_1.rDg && exe_12 != exe_1.rDs) {
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
        exe_1 exe_12 = exe_1.Te(this.aQL);
        if (exe_12 == exe_1.rDg || exe_12 == exe_1.rDs) {
            return true;
        }
        return super.fCn();
    }
}

