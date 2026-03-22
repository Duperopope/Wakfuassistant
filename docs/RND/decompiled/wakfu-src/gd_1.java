/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;

/*
 * Renamed from Gd
 */
class gd_1 {
    @SerializedName(value="ref")
    private final Integer aDa;
    @SerializedName(value="from_uid")
    private final Long aDb;
    @SerializedName(value="to_uid")
    private final Long aDc;

    gd_1(Integer n, Long l, Long l2) {
        this.aDa = n;
        this.aDb = l;
        this.aDc = l2;
    }

    public Long aMk() {
        return this.aDb;
    }

    public Integer aMl() {
        return this.aDa;
    }

    public Long aMm() {
        return this.aDc;
    }
}

