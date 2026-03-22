/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eOH
 */
public final class eoh_0
extends ero_0 {
    private static final aox_1 rbU = new enz_0(new eny_0("Default", new enx_0[0]), new eny_0("Ratio de la valeur transmise", new enx_0("Ratio (default 100%) (-2 pour recalculer les d\u00e9g\u00e2ts sur la nouvelle cible)", eNA.qYC)), new eny_0("Transmission (target/caster)", new enx_0("Ratio (default 100%) (-2 pour recalculer les d\u00e9g\u00e2ts sur la nouvelle cible)", eNA.qYC), new enx_0("Transmis \u00e0 la cible de cet effet (oui = 1, defaut = transmis au caster)", eNA.qYD)));
    public static final int rbV = -2;
    private boolean rbW;

    @Override
    public aox_1 bEt() {
        return rbU;
    }

    public eoh_0() {
        this.bby();
    }

    public eoh_0 fCT() {
        eoh_0 eoh_02 = new eoh_0();
        eoh_02.rbW = this.rbW;
        return eoh_02;
    }

    @Override
    public void E(QD qD) {
        this.aQL = -1;
        this.rbW = false;
        if (this.bgC == null) {
            return;
        }
        if (((enk_0)this.bgC).fAn() >= 1) {
            this.aQL = ((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu);
        }
        if (((enk_0)this.bgC).fAn() >= 2) {
            this.rbW = ((enk_0)this.bgC).a(1, this.fHf(), ene_0.qPu) == 1;
        }
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (!this.bbt()) {
            return;
        }
        QD qD2 = this.L(qD);
        if (qD2 == null) {
            return;
        }
        if (this.rbW) {
            qD2.f(this.bgF);
        } else {
            qD2.f(this.bgE);
        }
        if (this.aQL > 0) {
            qD2.a(0, this.aQL, true);
        } else if (this.aQL == -2) {
            qD2.n(null);
        }
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
        this.rbW = false;
        super.aVH();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fCT();
    }
}

