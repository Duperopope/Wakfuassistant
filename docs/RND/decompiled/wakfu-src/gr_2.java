/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Renamed from GR
 */
public class gr_2 {
    private static final String aHs = "wakfu.metric.";
    @SerializedName(value="@timestamp")
    private final String aHt;
    @SerializedName(value="@index")
    private final String aHu;
    @SerializedName(value="platform")
    private final String aHv;
    @SerializedName(value="service")
    private final String aHw;

    protected gr_2(String string) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        this.aHt = simpleDateFormat.format(new Date(System.currentTimeMillis()));
        this.aHv = mr_1.aSg.aTH();
        this.aHw = ms_1.aSi.aTK();
        this.aHu = aHs + string;
    }
}

