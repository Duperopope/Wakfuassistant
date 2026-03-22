/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  lombok.Generated
 */
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/*
 * Renamed from Gk
 */
public abstract class gk_0 {
    @SerializedName(value="metadata")
    protected Gl aDD;
    @SerializedName(value="service.node.name")
    private final String aDE = ms_1.aSi.aTK();

    protected gk_0() {
    }

    public abstract String getName();

    @Generated
    public Gl aMz() {
        return this.aDD;
    }

    @Generated
    public String aMA() {
        return this.aDE;
    }
}

