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
 * Renamed from Gj
 */
public class gj_0
extends gk_0 {
    @Expose(serialize=false)
    private static final String aDy = "service.character.rename";
    @SerializedName(value="account_id")
    private final long aDz;
    @SerializedName(value="character_id")
    private final long aDA;
    @SerializedName(value="old_name")
    private final String aDB;
    @SerializedName(value="new_name")
    private final String aDC;

    public gj_0(long l, long l2, String string, String string2, String string3) {
        this.aDz = l;
        this.aDA = l2;
        this.aDB = string;
        this.aDC = string2;
        this.aDD = new Gl(aDy, string3);
    }

    @Override
    public String getName() {
        return aDy;
    }

    @Generated
    public long xl() {
        return this.aDz;
    }

    @Generated
    public long KU() {
        return this.aDA;
    }

    @Generated
    public String aMx() {
        return this.aDB;
    }

    @Generated
    public String aMy() {
        return this.aDC;
    }
}

