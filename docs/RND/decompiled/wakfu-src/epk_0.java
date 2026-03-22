/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ePK
 */
public class epk_0
extends ero_0 {
    private static final aox_1 rer = new enz_0(new eny_0("Pas de param", new enx_0[0]), new eny_0("% PV restor\u00e9", new enx_0("%", eNA.qYC)), new eny_0("Uniquement si le controlleur original est encore en jeu", new enx_0("%", eNA.qYC), new enx_0("controleur encore en jeu (1 = oui, 0 == non (defaut))", eNA.qYC)), new eny_0("Restore aussi les pvs virtuels", new enx_0("%", eNA.qYC), new enx_0("controleur encore en jeu (1 = oui, 0 == non (defaut))", eNA.qYD), new enx_0("restore aussi les pvs virtuels (1 = oui, 0 == non (defaut))", eNA.qYD)), new eny_0("Met les PA et PM au max", new enx_0("%", eNA.qYC), new enx_0("controleur encore en jeu (1 = oui, 0 == non (defaut))", eNA.qYD), new enx_0("restore aussi les pvs virtuels (1 = oui, 0 == non (defaut))", eNA.qYD), new enx_0("PA/PM au max (1 = oui, 0 == non (defaut))", eNA.qYD)));
    private int res = 0;
    private boolean ret = false;
    private boolean reu = false;
    private boolean rev = false;
    private int aza = 0;
    private boolean rew = false;

    @Override
    protected void b(io_1 io_12) {
        io_12.a(ii_1.MR().ek(this.res).r(this.ret).s(this.reu));
    }

    @Override
    protected void f(im_1 im_12) {
        if (im_12.Qz()) {
            ii_1 ii_12 = im_12.QA();
            this.res = ii_12.getValue();
            this.ret = ii_12.Mc();
            this.reu = ii_12.Me();
        }
    }

    @Override
    public aox_1 bEt() {
        return rer;
    }

    public epk_0() {
        this.bby();
    }

    public epk_0 fEM() {
        epk_0 epk_02 = new epk_0();
        this.bgO = 1;
        epk_02.rew = this.rew;
        epk_02.aza = this.aza;
        return epk_02;
    }

    @Override
    public void bby() {
        super.bby();
        this.oC(202);
        this.oC(1);
    }

    @Override
    protected void c(QD qD, boolean bl) {
        exP exP2;
        if (this.rew && this.bgF instanceof exP && (exP2 = ((exP)this.bgF).dlI()) != null && !exP2.baH()) {
            this.fHg();
            return;
        }
        if (this.bgF != null && this.bgF.a(exx_2.rGi) && !this.bgF.a(exe_1.rEn)) {
            this.fEN();
        } else {
            this.mk(true);
        }
    }

    void fEN() {
        if (this.rev && this.bbt()) {
            int n = this.bgF.b(exx_2.rGi).aYD();
            this.aQL = Math.max(1, VJ.bt((float)n / 100.0f * (float)this.aza));
            if (this.bgF.a(exx_2.rHp)) {
                int n2 = this.bgF.b(exx_2.rHp).aYD();
                this.res = Math.max(1, VJ.bt((float)n2 / 100.0f * (float)this.aza));
            }
        }
        this.bgF.b(exx_2.rGi).op(this.aQL);
        if (this.ret && this.bgF.a(exx_2.rHp)) {
            this.bgF.b(exx_2.rHp).op(this.res);
        }
        if (this.bgF instanceof exP && this.bbg() != null && ((enq_0)this.bbg()).fBh() != null && this.fEO()) {
            ((exP)this.bgF).lq(true);
        }
        if (this.reu) {
            if (this.bgF.a(exx_2.rGj)) {
                this.bgF.b(exx_2.rGj).aYO();
            }
            if (this.bgF.a(exx_2.rGk)) {
                this.bgF.b(exx_2.rGk).aYO();
            }
        }
    }

    @Override
    public void E(QD qD) {
        this.rew = false;
        this.aza = 0;
        short s = this.fHf();
        if (this.bgC == null) {
            return;
        }
        if (((enk_0)this.bgC).fAn() <= 0) {
            this.aQL = 1;
            return;
        }
        this.aza = ((enk_0)this.bgC).a(0, s, ene_0.qPu);
        this.rev = true;
        if (((enk_0)this.bgC).fAn() > 1) {
            boolean bl = this.rew = ((enk_0)this.bgC).a(1, s, ene_0.qPu) == 1;
        }
        if (((enk_0)this.bgC).fAn() > 2) {
            boolean bl = this.ret = ((enk_0)this.bgC).a(2, s, ene_0.qPu) == 1;
        }
        if (((enk_0)this.bgC).fAn() > 3) {
            this.reu = ((enk_0)this.bgC).a(3, s, ene_0.qPu) == 1;
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
    protected boolean bce() {
        return true;
    }

    private boolean fEO() {
        return ((enq_0)this.bbg()).fBh().oE(1010);
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fEM();
    }
}

