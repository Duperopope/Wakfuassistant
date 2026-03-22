/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.Gauge
 *  com.google.gson.annotations.SerializedName
 */
import com.codahale.metrics.Gauge;
import com.google.gson.annotations.SerializedName;

/*
 * Renamed from GP
 */
public class gp_2
extends gr_2 {
    @SerializedName(value="type")
    private static final String aHe = "gauge";
    @SerializedName(value="value")
    private final Object aHf;

    public gp_2(String string, Gauge<?> gauge) {
        super(string);
        this.aHf = gauge.getValue();
    }
}

