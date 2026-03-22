/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  lombok.Generated
 */
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

public class euN {
    @SerializedName(value="id")
    private long aXv;
    @SerializedName(value="nicknameWithTag")
    private String orH;

    @Generated
    public long Sn() {
        return this.aXv;
    }

    @Generated
    public String fdp() {
        return this.orH;
    }

    @Generated
    public String toString() {
        return "ZaapUserInfo(m_id=" + this.Sn() + ", m_nicknameWithTag=" + this.fdp() + ")";
    }
}

