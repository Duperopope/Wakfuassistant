/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.List;

/*
 * Renamed from cAJ
 */
public final class caj_0 {
    @SerializedName(value="_msg_id")
    private String cHc;
    @SerializedName(value="progress")
    private double mjh;
    @SerializedName(value="eta")
    private double mpd;
    @SerializedName(value="groups")
    private cai_0[] mpe;

    public String getId() {
        return this.cHc;
    }

    public double eCZ() {
        return this.mjh;
    }

    public double eGK() {
        return this.mpd;
    }

    public List<cai_0> eGL() {
        return Arrays.asList(this.mpe);
    }
}

