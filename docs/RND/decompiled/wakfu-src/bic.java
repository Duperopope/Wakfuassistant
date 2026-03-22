/*
 * Decompiled with CFR 0.152.
 */
final class bic
extends eyj_0 {
    private final qq_1 ijU;
    final /* synthetic */ bhJ ijV;

    bic(bhJ bhJ2, qq_1 qq_12) {
        this.ijV = bhJ2;
        this.ijU = qq_12;
        this.ijU.DM().a(this);
    }

    @Override
    public void zl() {
        bhJ.dqe().error((Object)"[NATION] Pas de s\u00e9rialization de la nation PUBLIC dans le client pour l'instant", (Throwable)new UnsupportedOperationException());
    }

    @Override
    public void zm() {
        bri_2 bri_22 = (bri_2)this.ijV.ffF();
        bri_22.b(fpp_0.hk(this.ijU.VF));
        bri_22.tO(this.ijU.VG);
        bri_22.elq();
    }
}

