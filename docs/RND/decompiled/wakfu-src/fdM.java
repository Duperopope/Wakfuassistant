/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import lombok.Generated;

public class fdM {
    private final int rXR;
    private final int rXS;
    private final int rXT;

    @Generated
    public fdM(int n, int n2, int n3) {
        this.rXR = n;
        this.rXS = n2;
        this.rXT = n3;
    }

    @Generated
    public int d() {
        return this.rXR;
    }

    @Generated
    public int aXY() {
        return this.rXS;
    }

    @Generated
    public int LR() {
        return this.rXT;
    }

    @Generated
    public String toString() {
        return "SteleDifficulty(m_id=" + this.d() + ", m_weight=" + this.aXY() + ", m_stateId=" + this.LR() + ")";
    }

    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof fdM)) {
            return false;
        }
        fdM fdM2 = (fdM)object;
        if (!fdM2.C(this)) {
            return false;
        }
        return this.d() == fdM2.d();
    }

    @Generated
    protected boolean C(Object object) {
        return object instanceof fdM;
    }

    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = 1;
        n2 = n2 * 59 + this.d();
        return n2;
    }
}

