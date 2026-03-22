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

public class Gn
extends gk_0 {
    @Expose(serialize=false)
    private static final String aDO = "service.guild.rename";
    @SerializedName(value="account_id")
    private final long aDP;
    @SerializedName(value="character_id")
    private final long aDQ;
    @SerializedName(value="guild_id")
    private final long aDR;
    @SerializedName(value="old_name")
    private final String aDS;
    @SerializedName(value="new_name")
    private final String aDT;

    public Gn(long l, long l2, long l3, String string, String string2, String string3) {
        this.aDP = l;
        this.aDQ = l2;
        this.aDR = l3;
        this.aDS = string;
        this.aDT = string2;
        this.aDD = new Gl(aDO, string3);
    }

    @Override
    public String getName() {
        return aDO;
    }

    @Generated
    public long xl() {
        return this.aDP;
    }

    @Generated
    public long KU() {
        return this.aDQ;
    }

    @Generated
    public long Ya() {
        return this.aDR;
    }

    @Generated
    public String aMx() {
        return this.aDS;
    }

    @Generated
    public String aMy() {
        return this.aDT;
    }
}

