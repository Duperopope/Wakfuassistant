/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bdR
 */
public class bdr_1
extends beh_2 {
    public final String hMx;

    public bdr_1(enk_0 enk_02, String string) {
        super(enk_02);
        this.hMx = string;
    }

    private bdr_1(bdr_1 bdr_12) {
        super(bdr_12.hMZ);
        this.hMx = bdr_12.hMx;
    }

    public bdr_1 def() {
        return new bdr_1(this);
    }

    @Override
    public void p(bdj_2 bdj_22) {
        if (bdj_22.bqd() == null) {
            bdp_1.hMs.error((Object)("Impossible d'appliquer le changement d'anim statique " + this.hMx));
            return;
        }
        bdj_22.d(new bds_1(this, bdj_22));
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        bdr_1 bdr_12 = (bdr_1)object;
        return !(this.hMx != null ? !this.hMx.equals(bdr_12.hMx) : bdr_12.hMx != null);
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        n = 31 * n + (this.hMx != null ? this.hMx.hashCode() : 0);
        return n;
    }

    public /* synthetic */ beh_2 deb() {
        return this.def();
    }
}

