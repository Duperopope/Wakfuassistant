/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/*
 * Renamed from cbN
 */
public class cbn_2 {
    @SerializedName(value="game_id")
    private final long lKT;
    @SerializedName(value="event_id")
    private final long lKU;
    @SerializedName(value="session_id")
    private long lKV;
    @SerializedName(value="data")
    private Object att;

    public cbn_2(int n) {
        this.lKT = 3L;
        this.lKU = n;
    }

    public void mM(long l) {
        this.lKV = l;
    }

    public void aw(Object object) {
        this.att = object;
    }

    public long esv() {
        return this.lKT;
    }

    public long esw() {
        return this.lKU;
    }

    public long esx() {
        return this.lKV;
    }

    public String esy() {
        return new Gson().toJson(this.att);
    }
}

