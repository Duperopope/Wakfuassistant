/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  lombok.Generated
 */
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

public class Gp {
    @SerializedName(value="service.node.name")
    private static final String aEf = ms_1.aSi.aTK();
    @SerializedName(value="id")
    private Long aEg;
    @SerializedName(value="metadata")
    private Gl aDD;
    @SerializedName(value="from")
    private Gv aEh;
    @SerializedName(value="to")
    private Gv aEi;
    @SerializedName(value="content")
    private Gr aEj;
    @SerializedName(value="misc")
    private Gt aEk;

    public Gp(long l, String string, String string2, Gv gv, Gv gv2, Gr gr, Gt gt) {
        this.aEg = l;
        this.aEh = gv;
        this.aEi = gv2;
        this.aEj = gr;
        this.aEk = gt;
        this.aDD = new Gl(string, string2);
    }

    @Generated
    public static Gq aMG() {
        return new Gq();
    }

    @Generated
    public Long aMH() {
        return this.aEg;
    }

    @Generated
    public Gl aMz() {
        return this.aDD;
    }

    @Generated
    public Gv aMI() {
        return this.aEh;
    }

    @Generated
    public Gv aMJ() {
        return this.aEi;
    }

    @Generated
    public Gr aMK() {
        return this.aEj;
    }

    @Generated
    public Gt aML() {
        return this.aEk;
    }
}

