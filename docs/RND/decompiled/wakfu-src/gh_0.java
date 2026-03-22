/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.Expose
 *  com.google.gson.annotations.SerializedName
 *  lombok.Generated
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/*
 * Renamed from Gh
 */
public class gh_0
extends gk_0 {
    @Expose(serialize=false)
    private static final String aDp = "service.character.change-sex";
    @SerializedName(value="account_id")
    private final long aDq;
    @SerializedName(value="character_id")
    private final long aDr;
    @SerializedName(value="old_sex")
    private final String aDs;
    @SerializedName(value="new_sex")
    private final String aDt;

    public gh_0(long l, long l2, byte by, byte by2, String string) {
        this.aDq = l;
        this.aDr = l2;
        this.aDs = by == 0 ? "M" : "F";
        this.aDt = by2 == 0 ? "M" : "F";
        this.aDD = new Gl(aDp, string);
    }

    @Override
    public String getName() {
        return aDp;
    }

    @Generated
    public long xl() {
        return this.aDq;
    }

    @Generated
    public long KU() {
        return this.aDr;
    }

    @Generated
    public String aMt() {
        return this.aDs;
    }

    @Generated
    public String aMu() {
        return this.aDt;
    }
}

