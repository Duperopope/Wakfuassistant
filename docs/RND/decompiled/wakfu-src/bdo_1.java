/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bdO
 */
public class bdo_1
extends beh_2 {
    public final String hMr;

    public bdo_1(enk_0 enk_02, String string) {
        super(enk_02);
        this.hMr = string;
    }

    private bdo_1(bdo_1 bdo_12) {
        super(bdo_12.hMZ);
        this.hMr = bdo_12.hMr;
    }

    public bdo_1 dee() {
        return new bdo_1(this);
    }

    @Override
    public void p(bdj_2 bdj_22) {
        if (bdj_22.dZ(this.hMr)) {
            bdj_22.dT(this.hMr);
            bdj_22.dcQ();
        }
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
        bdo_1 bdo_12 = (bdo_1)object;
        return !(this.hMr != null ? !this.hMr.equals(bdo_12.hMr) : bdo_12.hMr != null);
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        n = 31 * n + (this.hMr != null ? this.hMr.hashCode() : 0);
        return n;
    }

    public /* synthetic */ beh_2 deb() {
        return this.dee();
    }
}

