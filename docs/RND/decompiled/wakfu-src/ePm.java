/*
 * Decompiled with CFR 0.152.
 */
public final class ePm
extends epz_0 {
    private static final aox_1 rdd = new enz_0(new eny_0("Distance a parcourir", new enx_0("valeur", eNA.qYC)));

    @Override
    public aox_1 bEt() {
        return rdd;
    }

    public ePm fDG() {
        return new ePm();
    }

    @Override
    public void bby() {
        super.bby();
        this.oC(194);
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
        return this.bgE != null && this.bgG != null && !this.fEh() && !this.fEi() && !this.fEl() && !this.fEj();
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
        return false;
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fDG();
    }
}

