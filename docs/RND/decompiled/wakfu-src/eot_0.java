/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eOT
 */
public abstract class eot_0
extends ero_0 {
    private static final aox_1 rcq = new enz_0(new eny_0("Modif de Charac", new enx_0("valeur (eventuellement en %) (-1 pour valeur de l'effet declencheur)", eNA.qYC)), new eny_0("Modif de Charac variable", new enx_0("", eNA.qYC), new enx_0("D", eNA.qYC), new enx_0("+", eNA.qYC), new enx_0("(fake, sert \u00e0 rien, laisser \u00e0 0)", eNA.qYD)), new eny_0("Specification du type de Modif (% ou fixe)", new enx_0("valeur (eventuellement en %) (-1 pour valeur de l'effet declencheur)", eNA.qYC), new enx_0("Fixe = 0; %=1", eNA.qYD)), new eny_0("Avec id de la charac (cf FighterCharacteriticType)", new enx_0("valeur (eventuellement en %) (-1 pour valeur de l'effet declencheur)", eNA.qYC), new enx_0("Fixe = 0; %=1", eNA.qYD), new enx_0("Id de la charac", eNA.qYD)), new eny_0("Avec % d'application", new enx_0("valeur (eventuellement en %) (-1 pour valeur de l'effet declencheur)", eNA.qYC), new enx_0("Fixe = 0; %=1", eNA.qYD), new enx_0("Id de la charac (defaut = -1)", eNA.qYD), new enx_0("% d'application (defaut = -1)", eNA.qYD), new enx_0("(fake, sert \u00e0 rien, laisser \u00e0 0)", eNA.qYD)));
    protected pt_0 rcf;
    protected int rcr;
    protected boolean rcs;

    @Override
    public aox_1 bEt() {
        return rcq;
    }

    protected eot_0() {
    }

    protected eot_0(pt_0 pt_02) {
        this.rcf = pt_02;
        this.rcs = false;
        this.bby();
    }

    protected eot_0(pt_0 pt_02, boolean bl) {
        this.rcf = pt_02;
        this.rcs = bl;
        this.bby();
    }

    public pt_0 fCY() {
        return this.rcf;
    }

    public int Mt() {
        return this.rcr;
    }

    @Override
    public boolean bbI() {
        if (this.aQL == 0 && this.fBR()) {
            return false;
        }
        return super.bbI();
    }

    protected boolean fBR() {
        return true;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.fBQ()) {
            this.mk(true);
            return;
        }
        pr_0 pr_02 = this.fDf();
        if (pr_02 == null) {
            this.mk(true);
            return;
        }
        if (this.rcs && this.bbt()) {
            this.f(pr_02);
        }
        this.d(pr_02);
        this.fDh();
    }

    @Override
    public void a(int n, float f2, boolean bl) {
        switch (n) {
            case 0: {
                if (bl) break;
                this.aQL += VJ.bt((float)this.aQL * f2 / 100.0f);
                break;
            }
            case 1: {
                if (bl) {
                    this.aQL = VJ.bt(f2);
                    break;
                }
                this.aQL = (int)((float)this.aQL + f2);
                break;
            }
        }
        if (this.aQL == 0) {
            this.fHg();
        }
    }

    boolean fBQ() {
        return this.rcf == null || this.fCZ() == null || !this.fCZ().a(this.rcf);
    }

    private pr_0 fDf() {
        pr_0 pr_02 = null;
        switch (this.rcf.aYW()) {
            case 0: {
                pr_02 = this.fCZ().b(this.rcf);
                break;
            }
            default: {
                bgA.warn((Object)("On veut appliquer une modification de charac sur autre chose qu'une fighterCharac " + String.valueOf(this.rcf)));
            }
        }
        return pr_02;
    }

    private void f(pr_0 pr_02) {
        this.aQL = (int)((float)pr_02.aYB() / 100.0f * (float)this.aQL);
    }

    abstract void d(pr_0 var1);

    private void fDh() {
        if (this.rcf == exx_2.rGI && this.bgJ != null && this.bgJ.baf() != null) {
            this.bgJ.baf().bhI();
        }
    }

    @Override
    public void E(QD qD) {
        Object object;
        if (this.bgC == null) {
            return;
        }
        short s = this.fHf();
        if (((enk_0)this.bgC).fAn() == 4) {
            this.aQL = ve_0.d(((enk_0)this.bgC).a(0, s, ene_0.qPu), ((enk_0)this.bgC).a(1, s, ene_0.qPu), ((enk_0)this.bgC).a(2, s, ene_0.qPu));
        } else {
            int n;
            this.aQL = ((enk_0)this.bgC).a(0, s, ene_0.qPu);
            if (((enk_0)this.bgC).fAn() > 1) {
                boolean bl = this.rcs = ((enk_0)this.bgC).a(1, s, ene_0.qPu) == 1;
            }
            if (((enk_0)this.bgC).fAn() > 2 && ((n = ((enk_0)this.bgC).a(2, s, ene_0.qPu)) != -1 || this.rcf == null)) {
                object = exx_2.c((byte)n);
                if (object == null) {
                    bgA.error((Object)("Param\u00e9trage foireux d'un effet de modification de charac " + ((enk_0)this.bgC).aZH()));
                } else {
                    this.rcf = object;
                }
            }
        }
        if (this.aQL == -1) {
            ero_0 ero_02 = (ero_0)qD;
            if (ero_02 == null) {
                ero_02 = ((enq_0)this.bbg()).fBh();
            }
            if (ero_02 == null) {
                bgA.error((Object)"On ne peut pas copier la valeur de l'effet declencheur, celui-ci est inconnu");
                this.aQL = 0;
                return;
            }
            if (ero_02 instanceof eoc_0) {
                object = (eoc_0)ero_02;
                byte by = this.rcf.aJr();
                if (by == exx_2.rGj.aJr()) {
                    this.aQL = ((eoc_0)object).fBZ();
                } else if (by == exx_2.rGk.aJr()) {
                    this.aQL = ((eoc_0)object).fBY();
                } else if (by == exx_2.rGl.aJr()) {
                    this.aQL = ((eoc_0)object).fBX();
                }
            } else {
                this.aQL = ero_02.getValue();
            }
        }
        this.rcr = this.aQL;
    }

    @Override
    public final void bbS() {
        if (this.rdU && this.Ty() && this.rcf != null) {
            switch (this.rcf.aYW()) {
                case 0: {
                    if (this.fCZ() == null || !this.fCZ().a(this.rcf)) break;
                    this.fDc();
                    this.fDh();
                }
            }
        }
        super.bbS();
    }

    abstract void fDc();

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
    public eNd dTh() {
        eNd eNd2;
        if (this.rcf != null && this.rcf.aYW() == 0 && (eNd2 = ((exx_2)this.rcf).fOM()) != null) {
            return eNd2;
        }
        return eNd.qOY;
    }

    @Override
    protected boolean fCv() {
        return this.fHp();
    }

    @Override
    protected void b(io_1 io_12) {
        io_12.a(ii_1.MR().em(this.rcf != null ? (int)this.rcf.aJr() : 0).er(this.rcr));
    }

    @Override
    protected void f(im_1 im_12) {
        if (im_12.Qz()) {
            this.rcf = exx_2.c(GC.ct(im_12.QA().LT()));
            this.rcr = im_12.QA().Mt();
        }
    }

    protected qu_0 fCZ() {
        return this.bgF;
    }

    void a(pr_0 pr_02, int n) {
        if (this.bgF == null) {
            return;
        }
        int n2 = pr_02.aYB();
        int n3 = n - Math.abs(n2);
        if (n3 <= 0) {
            return;
        }
        QE qE = this.bgF.baz();
        for (QD qD : qE) {
            eOO eOO2;
            if (!(qD instanceof eOO) || (eOO2 = (eOO)qD).d() != this.d() || eOO2.cXt() != 0) continue;
            if (n3 <= 0) {
                return;
            }
            int n4 = eOO2.getValue();
            int n5 = eOO2.Mt();
            if (n5 == n4) continue;
            int n6 = n5 - n4;
            int n7 = Math.min(n3, n6);
            pr_02.oq(n7);
            n3 -= n7;
            eOO2.aQL += n7;
        }
    }
}

