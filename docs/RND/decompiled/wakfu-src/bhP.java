/*
 * Decompiled with CFR 0.152.
 */
final class bhP
extends eyj_0 {
    private final qo_2 ijt;
    final /* synthetic */ bhJ iju;

    bhP(bhJ bhJ2, qo_2 qo_22) {
        this.iju = bhJ2;
        this.ijt = qo_22;
        this.ijt.DM().a(this);
    }

    @Override
    public void zl() {
        bhJ.dqc().error((Object)"[NATION] Pas de s\u00e9rialization de la nation ID dans le client (SERVER => CLIENT)", (Throwable)new UnsupportedOperationException());
    }

    @Override
    public void zm() {
        bgr_0.dmo().f(this.iju, this.ijt.Vu);
    }
}

