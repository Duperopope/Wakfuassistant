/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eyb
 */
final class eyb_0
extends eyj_0 {
    private final rz_1 pha;
    final /* synthetic */ exP phb;

    eyb_0(exP exP2, rz_1 rz_12) {
        this.phb = exP2;
        this.pha = rz_12;
        this.pha.DM().a(this);
    }

    @Override
    public void zl() {
        if (this.phb.pgk != null) {
            this.pha.Xb = new rc_1();
            this.phb.pgk.a(this.pha.Xb.Xf);
        } else {
            this.pha.Xb = null;
        }
    }

    @Override
    public void zm() {
        if (this.pha.Xb != null) {
            if (this.phb.pgk == null) {
                this.phb.pgk = ezg_0.a((byte)0, this.phb);
            }
            this.phb.pgk.b(this.pha.Xb.Xf);
        } else if (this.phb.pgk != null) {
            this.phb.pgk = null;
        }
    }
}

