/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eOX
 */
public final class eox_0
extends ero_0 {
    private static final aox_1 rcx = new enz_0(new eny_0("Copie de Charac entre cible et caster", new enx_0("Id de la charac \u00e0 copier", eNA.qYD)), new eny_0("La cible copie le max de la charac du caster", new enx_0("Id de la charac \u00e0 copier", eNA.qYD), new enx_0("1 pour cible copie caster, 0 sinon (defaut)", eNA.qYD)), new eny_0("Ratio de la valeur a copier", new enx_0("Id de la charac \u00e0 copier", eNA.qYD), new enx_0("1 pour cible copie caster, 0 sinon (defaut)", eNA.qYD), new enx_0("% \u00e0 copier, (defaut = 100)", eNA.qYD)));
    private pu_0 jvy;
    int rav;
    private boolean rae;

    @Override
    public aox_1 bEt() {
        return rcx;
    }

    public eox_0() {
        this.bby();
    }

    public eox_0 fDn() {
        eox_0 eox_02 = new eox_0();
        return eox_02;
    }

    @Override
    public void E(QD qD) {
        this.aQL = -1;
        this.rae = false;
        this.rav = 100;
        if (this.bgC == null) {
            return;
        }
        this.aQL = ((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu);
        if (((enk_0)this.bgC).fAn() > 1) {
            boolean bl = this.rae = ((enk_0)this.bgC).a(1, this.fHf(), ene_0.qPu) == 1;
        }
        if (((enk_0)this.bgC).fAn() > 2) {
            this.rav = ((enk_0)this.bgC).a(2, this.fHf(), ene_0.qPu);
        }
    }

    @Override
    protected void c(QD qD, boolean bl) {
        exx_2 exx_22 = exx_2.c((byte)this.aQL);
        if (exx_22 == null) {
            this.fHg();
            bgA.error((Object)("Erreur de saisie, charac inexistante " + this.aQL));
            return;
        }
        exf_2 exf_22 = (exf_2)(this.rae ? this.bgE.b(exx_22) : this.bgF.b(exx_22));
        exf_2 exf_23 = (exf_2)(this.rae ? this.bgF.b(exx_22) : this.bgE.b(exx_22));
        if (exf_23 == null || exf_22 == null) {
            this.fHg();
            return;
        }
        this.jvy = new eOY(this, exf_23);
        exf_22.a(this.jvy);
        if (this.rav == 100) {
            exf_23.h(exf_22);
        } else {
            exf_23.a(exf_22, this.rav);
        }
    }

    @Override
    public void bbS() {
        pr_0 pr_02;
        if (!this.Ty()) {
            return;
        }
        exx_2 exx_22 = exx_2.c((byte)this.aQL);
        if (exx_22 == null) {
            return;
        }
        pr_0 pr_03 = pr_02 = this.rae ? this.bgE.b(exx_22) : this.bgF.b(exx_22);
        if (pr_02 != null) {
            pr_02.b(this.jvy);
        }
        super.bbS();
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
    protected void b(io_1 io_12) {
        io_12.a(ii_1.MR().r(this.rae).ek(this.rav));
    }

    @Override
    protected void f(im_1 im_12) {
        if (im_12.Qz()) {
            ii_1 ii_12 = im_12.QA();
            this.rae = ii_12.Mc();
            this.rav = ii_12.getValue();
        }
    }

    @Override
    public void aVH() {
        this.rae = false;
        this.rav = 100;
        super.aVH();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fDn();
    }
}

