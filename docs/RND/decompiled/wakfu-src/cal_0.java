/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;

/*
 * Renamed from cAL
 */
public final class cal_0 {
    @SerializedName(value="_msg_id")
    private String cHc;
    @SerializedName(value="updating")
    private boolean mpg;
    @SerializedName(value="upToDate")
    private boolean mph;
    @SerializedName(value="updateFailed")
    private boolean mpi;

    public boolean eGM() {
        return this.mpg;
    }

    public boolean eGN() {
        return this.mph;
    }

    public boolean eGO() {
        return this.mpi;
    }
}

