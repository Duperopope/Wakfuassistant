/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import lombok.Generated;

/*
 * Renamed from fdP
 */
@Generated
public class fdp_0 {
    @Generated
    private int adr;
    @Generated
    private int rYa;
    @Generated
    private int rYb;
    @Generated
    private int rYc;

    @Generated
    fdp_0() {
    }

    @Generated
    public fdp_0 Uq(int n) {
        this.adr = n;
        return this;
    }

    @Generated
    public fdp_0 Ur(int n) {
        this.rYa = n;
        return this;
    }

    @Generated
    public fdp_0 Us(int n) {
        this.rYb = n;
        return this;
    }

    @Generated
    public fdp_0 Ut(int n) {
        this.rYc = n;
        return this;
    }

    @Generated
    public fdo_0 fUf() {
        return new fdo_0(this.adr, this.rYa, this.rYb, this.rYc);
    }

    @Generated
    public String toString() {
        return "SteleReward.SteleRewardBuilder(id=" + this.adr + ", itemId=" + this.rYa + ", quantity=" + this.rYb + ", order=" + this.rYc + ")";
    }
}

