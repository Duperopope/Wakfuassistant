/*
 * Decompiled with CFR 0.152.
 */
final class bhR
extends eyj_0 {
    private final pi_2 ijx;
    final /* synthetic */ bhJ ijy;

    bhR(bhJ bhJ2, pi_2 pi_22) {
        this.ijy = bhJ2;
        this.ijx = pi_22;
        this.ijx.DM().a(this);
    }

    @Override
    public void zl() {
        if (this.ijx.Ss == null) {
            this.ijx.Ss = new pl_2();
        }
    }

    @Override
    public void zm() {
        if (this.ijx.Ss != null) {
            this.ijy.iiL = this.ijx.Ss.Sx;
            this.ijy.iiM = this.ijx.Ss.Sy;
        }
    }
}

