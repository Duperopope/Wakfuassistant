/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  lombok.Generated
 */
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

public class Gr {
    @SerializedName(value="id")
    private final Integer aEq;
    @SerializedName(value="old_uid")
    private final Long aEr;
    @SerializedName(value="new_uid")
    private final Long aEs;
    @SerializedName(value="details")
    private final String aEt;
    @SerializedName(value="quantity")
    private final Integer aEu;
    @SerializedName(value="kamas")
    private final Long aEv;
    @SerializedName(value="ogrines")
    private final Long aEw;

    @Generated
    Gr(Integer n, Long l, Long l2, String string, Integer n2, Long l3, Long l4) {
        this.aEq = n;
        this.aEr = l;
        this.aEs = l2;
        this.aEt = string;
        this.aEu = n2;
        this.aEv = l3;
        this.aEw = l4;
    }

    @Generated
    public static Gs aMN() {
        return new Gs();
    }

    @Generated
    public Integer aMO() {
        return this.aEq;
    }

    @Generated
    public Long aMd() {
        return this.aEr;
    }

    @Generated
    public Long aMP() {
        return this.aEs;
    }

    @Generated
    public String aMQ() {
        return this.aEt;
    }

    @Generated
    public Integer aMR() {
        return this.aEu;
    }

    @Generated
    public Long aMg() {
        return this.aEv;
    }

    @Generated
    public Long aMS() {
        return this.aEw;
    }
}

