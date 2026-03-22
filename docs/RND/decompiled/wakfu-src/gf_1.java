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
 * Renamed from Gf
 */
public class gf_1
extends gk_0 {
    @Expose(serialize=false)
    private static final String aDf = "service.character.change-color";
    @SerializedName(value="account_id")
    private final long aDg;
    @SerializedName(value="character_id")
    private final long aDh;
    @SerializedName(value="old_appearance")
    private final Go aDi;
    @SerializedName(value="new_appearance")
    private final Go aDj;

    public gf_1(long l, long l2, Go go, Go go2, String string) {
        this.aDg = l;
        this.aDh = l2;
        this.aDi = go;
        this.aDj = go2;
        this.aDD = new Gl(aDf, string);
    }

    @Override
    public String getName() {
        return aDf;
    }

    @Generated
    public long xl() {
        return this.aDg;
    }

    @Generated
    public long KU() {
        return this.aDh;
    }

    @Generated
    public Go aMp() {
        return this.aDi;
    }

    @Generated
    public Go aMq() {
        return this.aDj;
    }
}

