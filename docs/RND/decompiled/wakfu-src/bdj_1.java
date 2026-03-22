/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bdJ
 */
public class bdj_1
extends beh_2 {
    public final String hMn;

    public bdj_1(enk_0 enk_02, String string) {
        super(enk_02);
        this.hMn = string;
    }

    public bdj_1 dec() {
        return new bdj_1(this);
    }

    private bdj_1(bdj_1 bdj_12) {
        super(bdj_12.hMZ);
        this.hMn = bdj_12.hMn;
    }

    @Override
    public void p(bdj_2 bdj_22) {
        bdj_22.dU(this.hMn);
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
        bdj_1 bdj_12 = (bdj_1)object;
        return !(this.hMn != null ? !this.hMn.equals(bdj_12.hMn) : bdj_12.hMn != null);
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        n = 31 * n + (this.hMn != null ? this.hMn.hashCode() : 0);
        return n;
    }

    public /* synthetic */ beh_2 deb() {
        return this.dec();
    }
}

