/*
 * Decompiled with CFR 0.152.
 */
public class eRI
extends ero_0 {
    private static final aox_1 riv = new enz_0(new eny_0("modifie la valeur de l'effet d\u00e9clencheur", new enx_0("PERCENT = 0 (% de l'ancienne valeur), VALUE = 1 (valeur sp\u00e9cifi\u00e9e)", eNA.qYD), new enx_0("Valeur", eNA.qYC), new enx_0("ADD = 0 (ajout\u00e9 \u00e0 l'ancienne), REPLACE = 1 (remplace l'ancienne)", eNA.qYD)));
    private int riw = -1;
    private boolean rix = false;

    @Override
    public aox_1 bEt() {
        return riv;
    }

    public eRI fGY() {
        eRI eRI2 = new eRI();
        return eRI2;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (qD != null && this.riw >= 0) {
            qD.a(this.riw, this.aQL, this.rix);
        }
        this.mk(true);
    }

    @Override
    public void E(QD qD) {
        if (this.bgC != null) {
            short s = this.fHf();
            this.riw = ((enk_0)this.bgC).a(0, s, ene_0.qPu);
            this.aQL = ((enk_0)this.bgC).a(1, s, ene_0.qPu);
            this.rix = ((enk_0)this.bgC).a(2, s, ene_0.qPu) != 0;
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
    public /* synthetic */ QD bbo() {
        return this.fGY();
    }
}

