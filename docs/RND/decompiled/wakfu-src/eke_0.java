/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import lombok.Generated;

/*
 * Renamed from eKE
 */
@Generated
public class eke_0 {
    @Generated
    private int qDy;
    @Generated
    private int qDz;

    @Generated
    eke_0() {
    }

    @Generated
    public eke_0 QQ(int n) {
        this.qDy = n;
        return this;
    }

    @Generated
    public eke_0 QR(int n) {
        this.qDz = n;
        return this;
    }

    @Generated
    public ekd_0 fyH() {
        return new ekd_0(this.qDy, this.qDz);
    }

    @Generated
    public String toString() {
        return "CraftStepFees.CraftStepFeesBuilder(equipmentFees=" + this.qDy + ", componentFees=" + this.qDz + ")";
    }
}

