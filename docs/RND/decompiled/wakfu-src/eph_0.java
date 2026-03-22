/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ePH
 */
public final class eph_0
extends ePJ {
    private static final aox_1 rem = new enz_0(new eny_0("Nombre d'ex\u00e9cutions fixe", new enx_0("Nombre d'executions", eNA.qYC)), new eny_0("Nombre d'ex\u00e9cutions fixe, avec condition d'arr\u00eat", new enx_0("Nombre d'executions", eNA.qYC), new enx_0("Doit s'arr\u00eater quand un effet n'est pas ex\u00e9cut\u00e9 (1=oui, 0=non,d\u00e9faut)", eNA.qYC)));

    @Override
    public aox_1 bEt() {
        return rem;
    }

    public eph_0() {
        this.bby();
    }

    public eph_0 fEJ() {
        return new eph_0();
    }

    @Override
    protected int I(QD qD) {
        if (this.bgC == null || ((enk_0)this.bgC).fAn() < 1) {
            return 0;
        }
        return ((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu);
    }

    @Override
    protected boolean J(QD qD) {
        if (this.bgC == null || ((enk_0)this.bgC).fAn() < 2) {
            return false;
        }
        return ((enk_0)this.bgC).a(1, this.fHf(), ene_0.qPu) == 1;
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
    public /* synthetic */ QD bbo() {
        return this.fEJ();
    }
}

