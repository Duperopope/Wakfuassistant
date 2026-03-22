/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.Histogram
 *  com.codahale.metrics.Snapshot
 *  com.google.gson.annotations.SerializedName
 */
import com.codahale.metrics.Histogram;
import com.codahale.metrics.Snapshot;
import com.google.gson.annotations.SerializedName;

/*
 * Renamed from GQ
 */
public class gq_2
extends gr_2 {
    @SerializedName(value="type")
    private static final String aHg = "histogram";
    @SerializedName(value="count")
    private final long aHh;
    @SerializedName(value="min")
    private final long aHi;
    @SerializedName(value="max")
    private final long aHj;
    @SerializedName(value="mean")
    private final double aHk;
    @SerializedName(value="median")
    private final double aHl;
    @SerializedName(value="stddev")
    private final double aHm;
    @SerializedName(value="p75")
    private final double aHn;
    @SerializedName(value="p95")
    private final double aHo;
    @SerializedName(value="p98")
    private final double aHp;
    @SerializedName(value="p99")
    private final double aHq;
    @SerializedName(value="p999")
    private final double aHr;

    public gq_2(String string, Histogram histogram) {
        super(string);
        Snapshot snapshot = histogram.getSnapshot();
        this.aHh = histogram.getCount();
        this.aHi = snapshot.getMin();
        this.aHj = snapshot.getMax();
        this.aHk = snapshot.getMean();
        this.aHl = snapshot.getMedian();
        this.aHm = snapshot.getStdDev();
        this.aHn = snapshot.get75thPercentile();
        this.aHo = snapshot.get95thPercentile();
        this.aHp = snapshot.get98thPercentile();
        this.aHq = snapshot.get98thPercentile();
        this.aHr = snapshot.get999thPercentile();
    }
}

