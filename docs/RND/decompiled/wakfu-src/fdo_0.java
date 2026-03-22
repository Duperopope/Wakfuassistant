/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import lombok.Generated;

/*
 * Renamed from fdO
 */
public class fdo_0 {
    private final int rXW;
    private final int rXX;
    private final int rXY;
    private final int rXZ;

    @Generated
    public static fdp_0 fUe() {
        return new fdp_0();
    }

    @Generated
    public fdo_0(int n, int n2, int n3, int n4) {
        this.rXW = n;
        this.rXX = n2;
        this.rXY = n3;
        this.rXZ = n4;
    }

    @Generated
    public int d() {
        return this.rXW;
    }

    @Generated
    public int azv() {
        return this.rXX;
    }

    @Generated
    public int oP() {
        return this.rXY;
    }

    @Generated
    public int aYs() {
        return this.rXZ;
    }

    @Generated
    public String toString() {
        return "SteleReward(m_id=" + this.d() + ", m_itemId=" + this.azv() + ", m_quantity=" + this.oP() + ", m_order=" + this.aYs() + ")";
    }

    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof fdo_0)) {
            return false;
        }
        fdo_0 fdo_02 = (fdo_0)object;
        if (!fdo_02.C(this)) {
            return false;
        }
        if (this.d() != fdo_02.d()) {
            return false;
        }
        if (this.azv() != fdo_02.azv()) {
            return false;
        }
        if (this.oP() != fdo_02.oP()) {
            return false;
        }
        return this.aYs() == fdo_02.aYs();
    }

    @Generated
    protected boolean C(Object object) {
        return object instanceof fdo_0;
    }

    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = 1;
        n2 = n2 * 59 + this.d();
        n2 = n2 * 59 + this.azv();
        n2 = n2 * 59 + this.oP();
        n2 = n2 * 59 + this.aYs();
        return n2;
    }
}

