/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ePR
 */
public final class epr_0
extends epy_0 {
    private static final aox_1 reE = new enz_0(new eny_0("Retrait uniquement", new enx_0("Zone a retirer (-1 pour tout retirer)", eNA.qYC)));

    @Override
    public aox_1 bEt() {
        return reE;
    }

    public epr_0() {
        this.bby();
    }

    public epr_0 fEX() {
        return new epr_0();
    }

    @Override
    protected boolean y(QQ qQ) {
        return !qQ.bcS() || super.y(qQ);
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
    public /* synthetic */ epy_0 fEV() {
        return this.fEX();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fEX();
    }
}

