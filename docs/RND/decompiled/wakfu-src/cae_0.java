/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;

/*
 * Renamed from cAE
 */
public final class cae_0 {
    @SerializedName(value="_msg_id")
    private String cHc;
    @SerializedName(value="id")
    private String aCR;

    public static cae_0 eGF() {
        return new cae_0("HELLO", "GAME");
    }

    cae_0() {
    }

    public String getId() {
        return this.cHc;
    }

    public String aLZ() {
        return this.aCR;
    }

    private cae_0(String string, String string2) {
        this.cHc = string;
        this.aCR = string2;
    }
}

