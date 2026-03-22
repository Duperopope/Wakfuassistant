/*
 * Decompiled with CFR 0.152.
 */
public final class eOg
extends eNX {
    private static final aox_1 raC = new enz_0(new eny_0("Copie de Charac entre cible et caster", new enx_0("Id de la charac source", eNA.qYD), new enx_0("Id de la charac destination", eNA.qYD)), new eny_0("La cible copie le max de la charac du caster", new enx_0("Id de la charac \u00e0 copier", eNA.qYD), new enx_0("Id de la charac destination", eNA.qYD), new enx_0("1 pour cible copie caster, 0 sinon (defaut)", eNA.qYD)), new eny_0("Ratio de la valeur a copier", new enx_0("Id de la charac \u00e0 copier", eNA.qYD), new enx_0("Id de la charac destination", eNA.qYD), new enx_0("1 pour cible copie caster, 0 sinon (defaut)", eNA.qYD), new enx_0("Palier pour 1 point dans la charac destination (defaut = 1)", eNA.qYD)), new eny_0("Ratio de la valeur a copier", new enx_0("Id de la charac \u00e0 copier", eNA.qYD), new enx_0("Id de la charac destination", eNA.qYD), new enx_0("1 pour cible copie caster, 0 sinon (defaut)", eNA.qYD), new enx_0("Palier pour 1 point dans la charac destination (defaut = 1)", eNA.qYD), new enx_0("Modification max de la charac destination (defaut = pas de max = 0)", eNA.qYD)), new eny_0("Ratio de la valeur a copier", new enx_0("Id de la charac \u00e0 copier", eNA.qYD), new enx_0("Id de la charac destination", eNA.qYD), new enx_0("1 pour cible copie caster, 0 sinon (defaut)", eNA.qYD), new enx_0("Palier pour 1 point dans la charac destination (defaut = 1)", eNA.qYD), new enx_0("Modification max de la charac destination (defaut = pas de max = 0)", eNA.qYD), new enx_0("Modification min de la charac destination (defaut = pas de min =  -2 147 483 648)", eNA.qYD)));
    int raD;
    int raw;
    int rax;

    @Override
    public aox_1 bEt() {
        return raC;
    }

    public eOg() {
        this.bby();
    }

    public eOg fCd() {
        return new eOg();
    }

    @Override
    public void E(QD qD) {
        this.aQL = -1;
        this.rae = false;
        this.raD = 1;
        this.raw = 0;
        this.raw = Integer.MIN_VALUE;
        if (this.bgC == null) {
            return;
        }
        this.aQL = ((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu);
        this.rad = ((enk_0)this.bgC).a(1, this.fHf(), ene_0.qPu);
        if (((enk_0)this.bgC).fAn() > 2) {
            boolean bl = this.rae = ((enk_0)this.bgC).a(2, this.fHf(), ene_0.qPu) == 1;
        }
        if (((enk_0)this.bgC).fAn() > 3) {
            this.raD = ((enk_0)this.bgC).a(3, this.fHf(), ene_0.qPu);
        }
        if (((enk_0)this.bgC).fAn() > 4) {
            this.raw = ((enk_0)this.bgC).a(4, this.fHf(), ene_0.qPu);
        }
        if (((enk_0)this.bgC).fAn() > 5) {
            this.rax = ((enk_0)this.bgC).a(5, this.fHf(), ene_0.qPu);
        }
    }

    @Override
    protected eNY a(exf_2 exf_22, exf_2 exf_23) {
        return new eOh(this, exf_22, exf_23);
    }

    @Override
    protected void b(io_1 io_12) {
        io_12.a(ii_1.MR().r(this.rae).ep(this.raD).em(this.rad).ek(this.raw).eq(this.rax));
    }

    @Override
    protected void f(im_1 im_12) {
        if (im_12.Qz()) {
            ii_1 ii_12 = im_12.QA();
            this.rae = ii_12.Mc();
            this.raD = ii_12.Mg();
            this.rad = ii_12.LT();
            this.raw = ii_12.getValue();
            this.rax = ii_12.Mi();
        }
    }

    @Override
    public void aVH() {
        this.rae = false;
        this.raD = 1;
        this.rad = -1;
        this.raw = 0;
        this.raw = 0;
        super.aVH();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fCd();
    }
}

