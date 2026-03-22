/*
 * Decompiled with CFR 0.152.
 */
public abstract class eOR
extends ero_0 {
    private static final aox_1 rco = new enz_0(new eny_0("Ajout/Retrait au max de la caracteristique", new enx_0("Id de la caracteristique", eNA.qYD), new enx_0("Modification de la valeur", eNA.qYC)));
    protected pt_0 rcf;

    @Override
    public aox_1 bEt() {
        return rco;
    }

    protected eOR() {
    }

    protected eOR(pt_0 pt_02) {
        this.rcf = pt_02;
        this.bby();
    }

    public pt_0 fCY() {
        return this.rcf;
    }

    @Override
    public void E(QD qD) {
        short s = this.fHf();
        if (this.bgC == null) {
            return;
        }
        if (((enk_0)this.bgC).fAn() < 2) {
            this.mk(true);
            return;
        }
        this.aQL = ((enk_0)this.bgC).a(1, s, ene_0.qPu);
        int n = ((enk_0)this.bgC).a(0, s, ene_0.qPu);
        if (n != -1 || this.rcf == null) {
            exx_2 exx_22 = exx_2.c((byte)n);
            if (exx_22 == null) {
                bgA.error((Object)("Param\u00e9trage foireux d'un effet de modification du max d'une caracteristique " + ((enk_0)this.bgC).aZH()));
            } else {
                this.rcf = exx_22;
            }
        }
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.bgF == null) {
            this.fHg();
            return;
        }
        pr_0 pr_02 = this.fDf();
        if (pr_02 == null) {
            this.mk(true);
            return;
        }
        this.d(pr_02);
    }

    @Override
    public void bbS() {
        if (this.bgF == null) {
            return;
        }
        pr_0 pr_02 = this.fDf();
        if (pr_02 == null) {
            return;
        }
        this.e(pr_02);
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
    public void aVH() {
        this.rcf = null;
        super.aVH();
    }

    @Override
    protected void b(io_1 io_12) {
        io_12.a(ii_1.MR().em(this.rcf != null ? (int)this.rcf.aJr() : -1));
    }

    @Override
    protected void f(im_1 im_12) {
        if (im_12.Qz()) {
            this.rcf = exx_2.c(GC.ct(im_12.QA().LT()));
        }
    }

    abstract void d(pr_0 var1);

    abstract void e(pr_0 var1);

    private pr_0 fDf() {
        pr_0 pr_02 = null;
        switch (this.rcf.aYW()) {
            case 0: {
                pr_02 = this.bgF.b(this.rcf);
                break;
            }
            default: {
                bgA.warn((Object)("On veut appliquer une modification du max de charac sur autre chose qu'une fighterCharac " + String.valueOf(this.rcf)));
            }
        }
        return pr_02;
    }
}

