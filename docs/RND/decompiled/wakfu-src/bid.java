/*
 * Decompiled with CFR 0.152.
 */
final class bid
extends eyj_0 {
    private final qz_2 ijW;
    final /* synthetic */ bhJ ijX;

    bid(bhJ bhJ2, qz_2 qz_22) {
        this.ijX = bhJ2;
        this.ijW = qz_22;
        this.ijW.DM().a(this);
    }

    @Override
    public void zl() {
        bhJ.dqd().error((Object)"[NATION] Pas de s\u00e9rialization de la nation PUBLIC dans le client pour l'instant", (Throwable)new UnsupportedOperationException());
    }

    @Override
    public void zm() {
        bri_2 bri_22 = (bri_2)this.ijX.ffF();
        bri_22.b(fkL.ue(this.ijW.Wa));
        bri_22.z(fkK.ud(this.ijW.VT));
        bri_22.Z(uw_0.fn(this.ijW.VU));
        bri_22.a(fng_0.gW(this.ijW.VV));
        bri_22.iw(this.ijW.Wb);
        bri_22.b(fpp_0.hk(this.ijW.VF));
        bri_22.elq();
    }
}

