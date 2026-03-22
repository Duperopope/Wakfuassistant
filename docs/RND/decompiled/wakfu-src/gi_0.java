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
 * Renamed from Gi
 */
public class gi_0
extends gk_0 {
    @Expose(serialize=false)
    private static final String aDu = "service.character.migrate";
    @SerializedName(value="origin_account_id")
    private final long aDv;
    @SerializedName(value="target_account_id")
    private final long aDw;
    @SerializedName(value="character_id")
    private final long aDx;

    public gi_0(long l, long l2, long l3, String string) {
        this.aDv = l;
        this.aDw = l2;
        this.aDx = l3;
        this.aDD = new Gl(aDu, string);
    }

    @Override
    public String getName() {
        return aDu;
    }

    @Generated
    public long aMv() {
        return this.aDv;
    }

    @Generated
    public long aMw() {
        return this.aDw;
    }

    @Generated
    public long KU() {
        return this.aDx;
    }
}

