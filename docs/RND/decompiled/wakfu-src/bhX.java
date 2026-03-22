/*
 * Decompiled with CFR 0.152.
 */
final class bhX
extends eyj_0 {
    private final rk_1 ijJ;
    final /* synthetic */ bhJ ijK;

    bhX(bhJ bhJ2, rk_1 rk_12) {
        this.ijK = bhJ2;
        this.ijJ = rk_12;
        this.ijJ.DM().a(this);
    }

    @Override
    public void zl() {
        throw new UnsupportedOperationException("Pas de serialisation de part ici.");
    }

    @Override
    public void zm() {
        bjq_1 bjq_12 = (bjq_1)this.ijK.ija;
        bjq_12.jQ(this.ijJ.TL);
        bjq_12.jS(this.ijJ.Xq);
        bjq_12.setName(this.ijJ.Ud);
        bjq_12.bw(this.ijJ.Xr);
    }
}

