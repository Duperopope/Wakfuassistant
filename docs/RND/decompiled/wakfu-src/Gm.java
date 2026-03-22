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

public class Gm
extends gk_0 {
    @Expose(serialize=false)
    private static final String aDI = "service.guild.change-blazon";
    @SerializedName(value="account_id")
    private final long aDJ;
    @SerializedName(value="character_id")
    private final long aDK;
    @SerializedName(value="guild_id")
    private final long aDL;
    @SerializedName(value="old_blazon")
    private final long aDM;
    @SerializedName(value="new_blazon")
    private final long aDN;

    public Gm(long l, long l2, long l3, long l4, long l5, String string) {
        this.aDJ = l;
        this.aDK = l2;
        this.aDL = l3;
        this.aDM = l4;
        this.aDN = l5;
        this.aDD = new Gl(aDI, string);
    }

    @Override
    public String getName() {
        return aDI;
    }

    @Generated
    public long xl() {
        return this.aDJ;
    }

    @Generated
    public long KU() {
        return this.aDK;
    }

    @Generated
    public long Ya() {
        return this.aDL;
    }

    @Generated
    public long aME() {
        return this.aDM;
    }

    @Generated
    public long aMF() {
        return this.aDN;
    }
}

