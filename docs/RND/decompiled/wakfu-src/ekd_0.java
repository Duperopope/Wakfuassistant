/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 */
import lombok.Generated;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eKD
 */
public class ekd_0 {
    private final int qDw;
    private final int qDx;

    public int d(@NotNull eKR eKR2) {
        return eKR2.fyX() ? this.fyF() : this.fyG();
    }

    public eke_0 fyD() {
        return ekd_0.fyE().QR(this.fyG()).QQ(this.fyF());
    }

    @Generated
    public static eke_0 fyE() {
        return new eke_0();
    }

    @Generated
    public int fyF() {
        return this.qDw;
    }

    @Generated
    public int fyG() {
        return this.qDx;
    }

    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ekd_0)) {
            return false;
        }
        ekd_0 ekd_02 = (ekd_0)object;
        if (!ekd_02.C(this)) {
            return false;
        }
        if (this.fyF() != ekd_02.fyF()) {
            return false;
        }
        return this.fyG() == ekd_02.fyG();
    }

    @Generated
    protected boolean C(Object object) {
        return object instanceof ekd_0;
    }

    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = 1;
        n2 = n2 * 59 + this.fyF();
        n2 = n2 * 59 + this.fyG();
        return n2;
    }

    @Generated
    public String toString() {
        return "CraftStepFees(m_equipmentFees=" + this.fyF() + ", m_componentFees=" + this.fyG() + ")";
    }

    @Generated
    public ekd_0(int n, int n2) {
        this.qDw = n;
        this.qDx = n2;
    }
}

