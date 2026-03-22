/*
 * Decompiled with CFR 0.152.
 */
final class exV
extends eyj_0 {
    private final rz_1 pgO;
    final /* synthetic */ exP pgP;

    exV(exP exP2, rz_1 rz_12) {
        this.pgP = exP2;
        this.pgO = rz_12;
        this.pgO.DM().a(this);
    }

    @Override
    public void zl() {
        if (this.pgP.pgj != null) {
            this.pgO.Xb = new rc_1();
            this.pgP.pgj.a(this.pgO.Xb.Xf);
        } else {
            this.pgO.Xb = null;
        }
    }

    @Override
    public void zm() {
        if (this.pgO.Xb != null) {
            if (this.pgP.pgj == null) {
                this.pgP.pgj = ezg_0.a((byte)1, this.pgP);
            }
            this.pgP.pgj.b(this.pgO.Xb.Xf);
        } else if (this.pgP.pgj != null) {
            this.pgP.pgj = null;
        }
    }
}

