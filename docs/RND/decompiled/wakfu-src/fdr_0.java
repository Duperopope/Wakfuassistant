/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.util.List;
import lombok.Generated;

/*
 * Renamed from fdR
 */
@Generated
public class fdr_0 {
    @Generated
    private int adr;
    @Generated
    private int rYj;
    @Generated
    private int rYk;
    @Generated
    private List<fdo_0> rYl;
    @Generated
    private List<fdo_0> rYm;
    @Generated
    private short rYn;

    @Generated
    fdr_0() {
    }

    @Generated
    public fdr_0 Uu(int n) {
        this.adr = n;
        return this;
    }

    @Generated
    public fdr_0 Uv(int n) {
        this.rYj = n;
        return this;
    }

    @Generated
    public fdr_0 Uw(int n) {
        this.rYk = n;
        return this;
    }

    @Generated
    public fdr_0 ba(List<fdo_0> list) {
        this.rYl = list;
        return this;
    }

    @Generated
    public fdr_0 bb(List<fdo_0> list) {
        this.rYm = list;
        return this;
    }

    @Generated
    public fdr_0 eN(short s) {
        this.rYn = s;
        return this;
    }

    @Generated
    public fdq_0 fUj() {
        return new fdq_0(this.adr, this.rYj, this.rYk, this.rYl, this.rYm, this.rYn);
    }

    @Generated
    public String toString() {
        return "SteleRewardTier.SteleRewardTierBuilder(id=" + this.adr + ", requiredDifficulty=" + this.rYj + ", freeRewardsCount=" + this.rYk + ", staticRewards=" + String.valueOf(this.rYl) + ", dynamicRewards=" + String.valueOf(this.rYm) + ", dynamicRewardsCount=" + this.rYn + ")";
    }
}

