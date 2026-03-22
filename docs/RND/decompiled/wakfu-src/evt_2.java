/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;

/*
 * Renamed from evt
 */
public class evt_2 {
    @SerializedName(value="server")
    private final int ovK;
    @SerializedName(value="right")
    private final evp_2 ovL;

    public evt_2(int n, evp_2 evp_22) {
        this.ovK = n;
        this.ovL = evp_22;
    }

    public int vY() {
        return this.ovK;
    }

    public evp_2 feh() {
        return this.ovL;
    }

    public String toString() {
        return "Rights{m_serverId=" + this.ovK + ", m_right=" + String.valueOf((Object)this.ovL) + "}";
    }
}

