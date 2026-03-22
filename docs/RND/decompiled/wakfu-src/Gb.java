/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;

public class Gb {
    @SerializedName(value="server_id")
    private final String aCN;
    @SerializedName(value="date")
    private final String aCO;
    @SerializedName(value="from")
    private final gc_1 aCP;
    @SerializedName(value="to")
    private final gc_1 aCQ;
    @SerializedName(value="type")
    private final String aCR;
    @SerializedName(value="external")
    private final Long aCS;
    @SerializedName(value="instance")
    private final Long aCT;
    @SerializedName(value="item")
    private final gd_1 aCU;
    @SerializedName(value="quantity")
    private final Short aCV;
    @SerializedName(value="kama")
    private final Long aCW;

    public Gb(String string, String string2, Long l, Long l2, String string3, Long l3, Long l4, String string4, String string5, Long l5, Long l6, Integer n, Long l7, Long l8, Short s, Long l9) {
        this.aCN = string;
        this.aCO = string2;
        this.aCP = new gc_1(l, l2, string3);
        this.aCQ = new gc_1(l3, l4, string4);
        this.aCR = string5;
        this.aCS = l5;
        this.aCT = l6;
        this.aCU = new gd_1(n, l7, l8);
        this.aCV = s;
        this.aCW = l9;
    }

    public String aLR() {
        return this.aCN;
    }

    public String aLS() {
        return this.aCO;
    }

    public Long aLT() {
        return this.aCP.aMh();
    }

    public Long aLU() {
        return this.aCP.aMi();
    }

    public String aLV() {
        return this.aCP.aMj();
    }

    public Long aLW() {
        return this.aCQ.aMh();
    }

    public Long aLX() {
        return this.aCQ.aMi();
    }

    public String aLY() {
        return this.aCQ.aMj();
    }

    public String aLZ() {
        return this.aCR;
    }

    public Long aMa() {
        return this.aCS;
    }

    public Long aMb() {
        return this.aCT;
    }

    public Integer aMc() {
        return this.aCU.aMl();
    }

    public Long aMd() {
        return this.aCU.aMk();
    }

    public Long aMe() {
        return this.aCU.aMm();
    }

    public Short aMf() {
        return this.aCV;
    }

    public Long aMg() {
        return this.aCW;
    }
}

