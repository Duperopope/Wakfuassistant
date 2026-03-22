/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import lombok.Generated;

@Generated
public class bmd {
    @Generated
    private bme iyA;
    @Generated
    private fm_1 iyB;
    @Generated
    private ekp_0 iyC;
    @Generated
    private ekp_0 iyD;
    @Generated
    private String iyE;
    @Generated
    private String iyF;

    @Generated
    bmd() {
    }

    @Generated
    public bmd a(bme bme2) {
        this.iyA = bme2;
        return this;
    }

    @Generated
    public bmd o(fm_1 fm_12) {
        this.iyB = fm_12;
        return this;
    }

    @Generated
    public bmd c(ekp_0 ekp_02) {
        this.iyC = ekp_02;
        return this;
    }

    @Generated
    public bmd d(ekp_0 ekp_02) {
        this.iyD = ekp_02;
        return this;
    }

    @Generated
    public bmd ma(String string) {
        this.iyE = string;
        return this;
    }

    @Generated
    public bmd mb(String string) {
        this.iyF = string;
        return this;
    }

    @Generated
    public bmc dvm() {
        return new bmc(this.iyA, this.iyB, this.iyC, this.iyD, this.iyE, this.iyF);
    }

    @Generated
    public String toString() {
        return "CosmeticPresetsModifications.PresetModification.PresetModificationBuilder(type=" + String.valueOf((Object)this.iyA) + ", cosmeticType=" + String.valueOf((Object)this.iyB) + ", addedItem=" + String.valueOf(this.iyC) + ", removedItem=" + String.valueOf(this.iyD) + ", previousCode=" + this.iyE + ", appliedCode=" + this.iyF + ")";
    }
}

