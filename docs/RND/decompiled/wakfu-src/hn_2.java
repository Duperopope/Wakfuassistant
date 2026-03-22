/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;

/*
 * Renamed from Hn
 */
class hn_2
extends gs_2 {
    @SerializedName(value="message")
    private final int aIz;
    @SerializedName(value="totalDuration")
    private final long aIA;

    hn_2(gh_2 gh_22, hm_2 hm_22) {
        super("network.message.compute.time", gh_22, hm_22);
        this.aIz = hm_22.aIy;
        this.aIA = hm_22.aHQ;
    }
}

