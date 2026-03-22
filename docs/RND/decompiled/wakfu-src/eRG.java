/*
 * Decompiled with CFR 0.152.
 */
public class eRG
extends ero_0 {
    private static final aox_1 rit = new enz_0(new eny_0("Mise \u00e0 jour du modificateur final", new enx_0("Valeur", eNA.qYC)));

    @Override
    public aox_1 bEt() {
        return rit;
    }

    public eRG fGW() {
        eRG eRG2 = new eRG();
        return eRG2;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (!(qD instanceof esn_0)) {
            return;
        }
        if (!this.bbt()) {
            return;
        }
        esn_0 esn_02 = (esn_0)((Object)qD);
        esn_02.Sb(this.aQL);
    }

    @Override
    public void E(QD qD) {
        this.aQL = ((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu);
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
        return this.fGW();
    }
}

