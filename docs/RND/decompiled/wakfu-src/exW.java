/*
 * Decompiled with CFR 0.152.
 */
final class exW
extends eyj_0 {
    private final qi_1 pgQ;
    final /* synthetic */ exP pgR;

    exW(exP exP2, qi_1 qi_12) {
        this.pgR = exP2;
        this.pgQ = qi_12;
        this.pgQ.DM().a(this);
    }

    @Override
    public void zl() {
        this.pgQ.Uo = this.pgR.Sn();
    }

    @Override
    public void zm() {
        this.pgR.dC(this.pgQ.Uo);
        for (eyk_0 eyk_02 : this.pgR.pga) {
            eyk_02.k(this.pgR);
        }
    }
}

