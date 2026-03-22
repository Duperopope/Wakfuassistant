/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bhU
 */
final class bhu_0
extends eyj_0 {
    private final pw_1 ijD;
    final /* synthetic */ bhJ ijE;

    bhu_0(bhJ bhJ2, pw_1 pw_12) {
        this.ijE = bhJ2;
        this.ijD = pw_12;
        this.ijD.DM().a(this);
    }

    @Override
    public void zl() {
        throw new UnsupportedOperationException("Pas de serialisation de part ici.");
    }

    @Override
    public void zm() {
        this.ijE.ijd = this.ijD.TS;
        if (this.ijE.ija instanceof bjq_1) {
            ((bjq_1)this.ijE.ija).jS(this.ijD.TS);
        }
    }
}

