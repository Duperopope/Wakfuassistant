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
 * Renamed from Gg
 */
public class gg_0
extends gk_0 {
    @Expose(serialize=false)
    private static final String aDk = "service.character.change-breed";
    @SerializedName(value="account_id")
    private final long aDl;
    @SerializedName(value="character_id")
    private final long aDm;
    @SerializedName(value="old_breed")
    private final int aDn;
    @SerializedName(value="new_breed")
    private final int aDo;

    public gg_0(long l, long l2, int n, int n2, String string) {
        this.aDl = l;
        this.aDm = l2;
        this.aDn = n;
        this.aDo = n2;
        this.aDD = new Gl(aDk, string);
    }

    @Override
    public String getName() {
        return aDk;
    }

    @Generated
    public long xl() {
        return this.aDl;
    }

    @Generated
    public long KU() {
        return this.aDm;
    }

    @Generated
    public int aMr() {
        return this.aDn;
    }

    @Generated
    public int aMs() {
        return this.aDo;
    }
}

