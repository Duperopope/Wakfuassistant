/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;

/*
 * Renamed from aXw
 */
public class axw_0 {
    @SerializedName(value="success")
    private boolean asG;
    @SerializedName(value="errCode")
    private int hwT;

    public boolean aGv() {
        return this.asG;
    }

    public void ak(boolean bl) {
        this.asG = bl;
    }

    public int cXX() {
        return this.hwT;
    }

    public void Aj(int n) {
        this.hwT = n;
    }

    public String toString() {
        return "InterChatAuthenticationResult{m_success=" + this.asG + ", m_errCode=" + this.hwT + "}";
    }
}

