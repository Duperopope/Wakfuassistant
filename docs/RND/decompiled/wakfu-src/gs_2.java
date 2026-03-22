/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.Timer
 *  com.google.gson.annotations.SerializedName
 */
import com.codahale.metrics.Timer;
import com.google.gson.annotations.SerializedName;

/*
 * Renamed from GS
 */
public class gs_2
extends gr_2 {
    @SerializedName(value="type")
    private static final String aHx = "timer";
    @SerializedName(value="count")
    private final long aHy;
    @SerializedName(value="mean_rate")
    private final double aHz;
    @SerializedName(value="m1_rate")
    private final double aHA;
    @SerializedName(value="m5_rate")
    private final double aHB;
    @SerializedName(value="m15_rate")
    private final double aHC;
    @SerializedName(value="min")
    private final double aHD;
    @SerializedName(value="max")
    private final double aHE;
    @SerializedName(value="mean")
    private final double aHF;
    @SerializedName(value="median")
    private final double aHG;
    @SerializedName(value="stddev")
    private final double aHH;
    @SerializedName(value="p75")
    private final double aHI;
    @SerializedName(value="p95")
    private final double aHJ;
    @SerializedName(value="p98")
    private final double aHK;
    @SerializedName(value="p99")
    private final double aHL;
    @SerializedName(value="p999")
    private final double aHM;
    @SerializedName(value="rate_unit")
    private final String aHN;
    @SerializedName(value="duration_unit")
    private final String aHO;

    public gs_2(String string, gh_2 gh_22, Timer timer) {
        super(string);
        this.aHy = timer.getCount();
        this.aHz = gh_22.m(timer.getMeanRate());
        this.aHA = gh_22.m(timer.getOneMinuteRate());
        this.aHB = gh_22.m(timer.getFiveMinuteRate());
        this.aHC = gh_22.m(timer.getFifteenMinuteRate());
        this.aHD = gh_22.n(timer.getSnapshot().getMin());
        this.aHE = gh_22.n(timer.getSnapshot().getMax());
        this.aHF = gh_22.n(timer.getSnapshot().getMean());
        this.aHG = gh_22.n(timer.getSnapshot().getMedian());
        this.aHH = gh_22.n(timer.getSnapshot().getStdDev());
        this.aHI = gh_22.n(timer.getSnapshot().get75thPercentile());
        this.aHJ = gh_22.n(timer.getSnapshot().get95thPercentile());
        this.aHK = gh_22.n(timer.getSnapshot().get98thPercentile());
        this.aHL = gh_22.n(timer.getSnapshot().get98thPercentile());
        this.aHM = gh_22.n(timer.getSnapshot().get999thPercentile());
        this.aHN = String.format("calls/%s", gh_22.aNX());
        this.aHO = String.format("%s", gh_22.aNY());
    }
}

