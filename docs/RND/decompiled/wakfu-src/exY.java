/*
 * Decompiled with CFR 0.152.
 */
final class exY
extends eyj_0 {
    private final qg_2 pgU;
    final /* synthetic */ exP pgV;

    public exY(exP exP2, qg_2 qg_22) {
        this.pgV = exP2;
        this.pgU = qg_22;
        this.pgU.DM().a(this);
    }

    @Override
    public void zl() {
        this.pgU.Vk = this.pgV.getName();
    }

    @Override
    public void zm() {
        this.pgV.setName(this.pgU.Vk);
    }
}

