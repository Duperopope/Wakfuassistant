/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;

/*
 * Renamed from cAD
 */
public final class cad_0 {
    @SerializedName(value="_msg_id")
    private String cHc;
    @SerializedName(value="message")
    private String aCL;
    @SerializedName(value="type")
    private int bIi;

    public String getId() {
        return this.cHc;
    }

    public String getMessage() {
        return this.aCL;
    }

    public int aeV() {
        return this.bIi;
    }
}

