/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fdL
 */
@Generated
public class fdl_0 {
    @Generated
    private int rXG;
    @Generated
    private int rXH;
    @Generated
    private eIx rXI;
    @Generated
    private int rXJ;
    @Generated
    private boolean rXK;
    @Generated
    private fdn_0 rXL;
    @Generated
    private fdn_0 rXM;
    @Generated
    private List<fdM> rXN;
    @Generated
    private List<fdo_0> rXO;
    @Generated
    private List<fdq_0> rXP;
    @Generated
    private ang_2 rXQ;

    @Generated
    fdl_0() {
    }

    @Generated
    public fdl_0 Un(int n) {
        this.rXG = n;
        return this;
    }

    @Generated
    public fdl_0 Uo(int n) {
        this.rXH = n;
        return this;
    }

    @Generated
    public fdl_0 a(eIx eIx2) {
        this.rXI = eIx2;
        return this;
    }

    @Generated
    public fdl_0 Up(int n) {
        this.rXJ = n;
        return this;
    }

    @Generated
    public fdl_0 mU(boolean bl) {
        this.rXK = bl;
        return this;
    }

    @Generated
    public fdl_0 a(fdn_0 fdn_02) {
        this.rXL = fdn_02;
        return this;
    }

    @Generated
    public fdl_0 b(fdn_0 fdn_02) {
        this.rXM = fdn_02;
        return this;
    }

    @Generated
    public fdl_0 aX(List<fdM> list) {
        this.rXN = list;
        return this;
    }

    @Generated
    public fdl_0 aY(List<fdo_0> list) {
        this.rXO = list;
        return this;
    }

    @Generated
    public fdl_0 aZ(List<fdq_0> list) {
        this.rXP = list;
        return this;
    }

    @Generated
    public fdl_0 i(@Nullable ang_2 ang_22) {
        this.rXQ = ang_22;
        return this;
    }

    @Generated
    public fdK fUc() {
        return new fdK(this.rXG, this.rXH, this.rXI, this.rXJ, this.rXK, this.rXL, this.rXM, this.rXN, this.rXO, this.rXP, this.rXQ);
    }

    @Generated
    public String toString() {
        return "IESteleParameter.IESteleParameterBuilder(paramId=" + this.rXG + ", visualId=" + this.rXH + ", chaosCategory=" + String.valueOf(this.rXI) + ", chaosCollectorId=" + this.rXJ + ", randomizedRewards=" + this.rXK + ", activationPrice=" + String.valueOf(this.rXL) + ", additionalPrice=" + String.valueOf(this.rXM) + ", difficulties=" + String.valueOf(this.rXN) + ", rewardPool=" + String.valueOf(this.rXO) + ", rewardTiers=" + String.valueOf(this.rXP) + ", activationCriterion=" + String.valueOf(this.rXQ) + ")";
    }
}

