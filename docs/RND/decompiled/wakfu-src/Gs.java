/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import lombok.Generated;

@Generated
public class Gs {
    @Generated
    private Integer aEx;
    @Generated
    private Long aEy;
    @Generated
    private Long aEz;
    @Generated
    private String aEA;
    @Generated
    private Integer aEB;
    @Generated
    private Long aEC;
    @Generated
    private Long aED;

    @Generated
    Gs() {
    }

    @Generated
    public Gs c(Integer n) {
        this.aEx = n;
        return this;
    }

    @Generated
    public Gs c(Long l) {
        this.aEy = l;
        return this;
    }

    @Generated
    public Gs d(Long l) {
        this.aEz = l;
        return this;
    }

    @Generated
    public Gs cs(String string) {
        this.aEA = string;
        return this;
    }

    @Generated
    public Gs d(Integer n) {
        this.aEB = n;
        return this;
    }

    @Generated
    public Gs e(Long l) {
        this.aEC = l;
        return this;
    }

    @Generated
    public Gs f(Long l) {
        this.aED = l;
        return this;
    }

    @Generated
    public Gr aMT() {
        return new Gr(this.aEx, this.aEy, this.aEz, this.aEA, this.aEB, this.aEC, this.aED);
    }

    @Generated
    public String toString() {
        return "TransactionContent.TransactionContentBuilder(itemId=" + this.aEx + ", itemFromUid=" + this.aEy + ", itemToUid=" + this.aEz + ", details=" + this.aEA + ", quantity=" + this.aEB + ", kamas=" + this.aEC + ", ogrines=" + this.aED + ")";
    }
}

