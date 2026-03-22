/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import lombok.Generated;

@Generated
public class Gw {
    @Generated
    private Long aFO;
    @Generated
    private Long aFP;
    @Generated
    private String acN;
    @Generated
    private Long aFQ;
    @Generated
    private String Ud;
    @Generated
    private String aFR;
    @Generated
    private Long aFS;
    @Generated
    private Long aFT;
    @Generated
    private Short aFg;
    @Generated
    private Integer aFU;
    @Generated
    private Short aFV;
    @Generated
    private Short aFW;
    @Generated
    private Short aFX;

    @Generated
    Gw() {
    }

    @Generated
    public Gw p(Long l) {
        this.aFO = l;
        return this;
    }

    @Generated
    public Gw q(Long l) {
        this.aFP = l;
        return this;
    }

    @Generated
    public Gw cv(String string) {
        this.acN = string;
        return this;
    }

    @Generated
    public Gw r(Long l) {
        this.aFQ = l;
        return this;
    }

    @Generated
    public Gw cw(String string) {
        this.Ud = string;
        return this;
    }

    @Generated
    public Gw cx(String string) {
        this.aFR = string;
        return this;
    }

    @Generated
    public Gw s(Long l) {
        this.aFS = l;
        return this;
    }

    @Generated
    public Gw t(Long l) {
        this.aFT = l;
        return this;
    }

    @Generated
    public Gw d(Short s) {
        this.aFg = s;
        return this;
    }

    @Generated
    public Gw m(Integer n) {
        this.aFU = n;
        return this;
    }

    @Generated
    public Gw e(Short s) {
        this.aFV = s;
        return this;
    }

    @Generated
    public Gw f(Short s) {
        this.aFW = s;
        return this;
    }

    @Generated
    public Gw g(Short s) {
        this.aFX = s;
        return this;
    }

    @Generated
    public Gv aNA() {
        return new Gv(this.aFO, this.aFP, this.acN, this.aFQ, this.Ud, this.aFR, this.aFS, this.aFT, this.aFg, this.aFU, this.aFV, this.aFW, this.aFX);
    }

    @Generated
    public String toString() {
        return "TransactionUser.TransactionUserBuilder(accountId=" + this.aFO + ", characterId=" + this.aFP + ", characterName=" + this.acN + ", guildId=" + this.aFQ + ", guildName=" + this.Ud + ", compartmentId=" + this.aFR + ", ieId=" + this.aFS + ", ieParamId=" + this.aFT + ", breedId=" + this.aFg + ", npcId=" + this.aFU + ", characterLevel=" + this.aFV + ", characterRealLevel=" + this.aFW + ", accountMaxLevel=" + this.aFX + ")";
    }
}

