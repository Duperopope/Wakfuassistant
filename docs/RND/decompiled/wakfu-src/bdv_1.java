/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bdV
 */
public class bdv_1
extends beh_2 {
    public final String hMF;

    public bdv_1(enk_0 enk_02, String string) {
        super(enk_02);
        this.hMF = string;
    }

    private bdv_1(bdv_1 bdv_12) {
        super(bdv_12.hMZ);
        this.hMF = bdv_12.hMF;
    }

    public bdv_1 deg() {
        return new bdv_1(this);
    }

    @Override
    public void p(bdj_2 bdj_22) {
        if (bdj_22.bqd() == null) {
            bdt_1.hMA.error((Object)("Impossible d'appliquer le changement d'anim statique " + this.hMF));
            return;
        }
        bdj_22.d(new bdw_1(this, bdj_22));
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
        bdv_1 bdv_12 = (bdv_1)object;
        return !(this.hMF != null ? !this.hMF.equals(bdv_12.hMF) : bdv_12.hMF != null);
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        n = 31 * n + (this.hMF != null ? this.hMF.hashCode() : 0);
        return n;
    }

    public /* synthetic */ beh_2 deb() {
        return this.deg();
    }
}

