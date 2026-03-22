/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;

/*
 * Renamed from cAH
 */
public final class cah_0 {
    @SerializedName(value="_msg_id")
    private String cHc;
    @SerializedName(value="numberOfClients")
    private int mpb;
    @SerializedName(value="newClientPid")
    private long mpc;

    cah_0() {
    }

    public String getId() {
        return this.cHc;
    }

    public int eGI() {
        return this.mpb;
    }

    public long eGJ() {
        return this.mpc;
    }
}

