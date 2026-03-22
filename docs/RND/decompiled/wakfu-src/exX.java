/*
 * Decompiled with CFR 0.152.
 */
final class exX
extends eyj_0 {
    private final qk_2 pgS;
    final /* synthetic */ exP pgT;

    exX(exP exP2, qk_2 qk_22) {
        this.pgT = exP2;
        this.pgS = qk_22;
        this.pgS.DM().a(this);
    }

    @Override
    public void zl() {
        this.pgS.Ut = this.pgT.Xi();
        this.pgS.Us = this.pgT.aFW();
    }

    @Override
    public void zm() {
        this.pgT.pi(this.pgS.Ut);
        this.pgT.a(this.pgS.Us);
        for (eyk_0 eyk_02 : this.pgT.pga) {
            eyk_02.k(this.pgT);
        }
    }
}

