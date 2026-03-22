/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  lombok.Generated
 */
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import lombok.Generated;

public class Gv
implements Serializable {
    private static final long aFA = -8873042786400661789L;
    @SerializedName(value="account_id")
    private final Long aFB;
    @SerializedName(value="character_id")
    private final Long aFC;
    @SerializedName(value="character_name")
    private final String aFD;
    @SerializedName(value="guild_id")
    private final Long aFE;
    @SerializedName(value="guild_name")
    private final String aFF;
    @SerializedName(value="compartment_id")
    private final String aFG;
    @SerializedName(value="element_id")
    private final Long aFH;
    @SerializedName(value="element_param_id")
    private final Long aFI;
    @SerializedName(value="breed_id")
    private final Short aFJ;
    @SerializedName(value="npc_id")
    private final Integer aFK;
    @SerializedName(value="character_level")
    private final Short aFL;
    @SerializedName(value="character_real_level")
    private final Short aFM;
    @SerializedName(value="account_max_level")
    private final Short aFN;

    @Generated
    Gv(Long l, Long l2, String string, Long l3, String string2, String string3, Long l4, Long l5, Short s, Integer n, Short s2, Short s3, Short s4) {
        this.aFB = l;
        this.aFC = l2;
        this.aFD = string;
        this.aFE = l3;
        this.aFF = string2;
        this.aFG = string3;
        this.aFH = l4;
        this.aFI = l5;
        this.aFJ = s;
        this.aFK = n;
        this.aFL = s2;
        this.aFM = s3;
        this.aFN = s4;
    }

    @Generated
    public static Gw aNr() {
        return new Gw();
    }

    @Generated
    public Gw aNs() {
        return new Gw().p(this.aFB).q(this.aFC).cv(this.aFD).r(this.aFE).cw(this.aFF).cx(this.aFG).s(this.aFH).t(this.aFI).d(this.aFJ).m(this.aFK).e(this.aFL).f(this.aFM).g(this.aFN);
    }

    @Generated
    public Long aMh() {
        return this.aFB;
    }

    @Generated
    public Long aMi() {
        return this.aFC;
    }

    @Generated
    public String xO() {
        return this.aFD;
    }

    @Generated
    public Long aNt() {
        return this.aFE;
    }

    @Generated
    public String HR() {
        return this.aFF;
    }

    @Generated
    public String ajm() {
        return this.aFG;
    }

    @Generated
    public Long aNu() {
        return this.aFH;
    }

    @Generated
    public Long aNv() {
        return this.aFI;
    }

    @Generated
    public Short aMX() {
        return this.aFJ;
    }

    @Generated
    public Integer aNw() {
        return this.aFK;
    }

    @Generated
    public Short aNx() {
        return this.aFL;
    }

    @Generated
    public Short aNy() {
        return this.aFM;
    }

    @Generated
    public Short aNz() {
        return this.aFN;
    }

    @Generated
    public String toString() {
        return "TransactionUser(m_accountId=" + this.aMh() + ", m_characterId=" + this.aMi() + ", m_characterName=" + this.xO() + ", m_guildId=" + this.aNt() + ", m_guildName=" + this.HR() + ", m_compartmentId=" + this.ajm() + ", m_ieId=" + this.aNu() + ", m_ieParamId=" + this.aNv() + ", m_breedId=" + this.aMX() + ", m_npcId=" + this.aNw() + ", m_characterLevel=" + this.aNx() + ", m_characterRealLevel=" + this.aNy() + ", m_accountMaxLevel=" + this.aNz() + ")";
    }
}

