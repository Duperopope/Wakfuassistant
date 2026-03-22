/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ePn
 */
public final class epn_0
extends epz_0 {
    private static final aox_1 rde = new enz_0(new eny_0("Se rapproche au maximum de la cible", new enx_0[0]), new eny_0("Rapproche le caster de la cible", new enx_0("nombre de case d'\u00e9cart (0 possible)", eNA.qYC)));

    @Override
    public aox_1 bEt() {
        return rde;
    }

    public epn_0 fDM() {
        return new epn_0();
    }

    @Override
    public void bby() {
        super.bby();
        this.oC(193);
    }

    @Override
    public boolean bbA() {
        return true;
    }

    @Override
    public boolean bbB() {
        return false;
    }

    @Override
    public boolean bbC() {
        return true;
    }

    @Override
    public boolean fDH() {
        return this.bgE != null && this.bgG != null && !this.fEh() && !this.fEi() && !this.fEm() && !this.fEj();
    }

    @Override
    boolean fDI() {
        return false;
    }

    @Override
    public esu_0 fDJ() {
        if (this.bgE instanceof esu_0) {
            return (esu_0)this.bgE;
        }
        return null;
    }

    @Override
    acd_1 fDK() {
        return this.bgG;
    }

    @Override
    boolean fDL() {
        return true;
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fDM();
    }
}

