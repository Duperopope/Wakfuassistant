/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;

/*
 * Renamed from GU
 */
class gu_2
extends gs_2 {
    @SerializedName(value="breed")
    private final int aHR;
    @SerializedName(value="totalDuration")
    private final long aHS;

    gu_2(gh_2 gh_22, gt_2 gt_22) {
        super("ai.decision.compute.time", gh_22, gt_22);
        this.aHR = gt_22.aHP;
        this.aHS = gt_22.aHQ;
    }
}

