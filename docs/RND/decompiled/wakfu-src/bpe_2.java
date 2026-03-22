/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;

/*
 * Renamed from bPE
 */
public class bpe_2 {
    @SerializedName(value="id")
    private final int kSl;
    @SerializedName(value="quantity")
    private final int kSm;
    @SerializedName(value="amount")
    private final double kSn;

    public bpe_2(bpb_2 bpb_22) {
        this.kSl = (Integer)bpb_22.eid();
        this.kSm = 1;
        this.kSn = bpb_22.eis();
    }
}

