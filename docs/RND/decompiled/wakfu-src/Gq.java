/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import lombok.Generated;

@Generated
public class Gq {
    @Generated
    private long adP;
    @Generated
    private String Vk;
    @Generated
    private String aEl;
    @Generated
    private Gv aEm;
    @Generated
    private Gv aEn;
    @Generated
    private Gr aEo;
    @Generated
    private Gt aEp;

    @Generated
    Gq() {
    }

    @Generated
    public Gq cs(long l) {
        this.adP = l;
        return this;
    }

    @Generated
    public Gq cq(String string) {
        this.Vk = string;
        return this;
    }

    @Generated
    public Gq cr(String string) {
        this.aEl = string;
        return this;
    }

    @Generated
    public Gq a(Gv gv) {
        this.aEm = gv;
        return this;
    }

    @Generated
    public Gq b(Gv gv) {
        this.aEn = gv;
        return this;
    }

    @Generated
    public Gq a(Gr gr) {
        this.aEo = gr;
        return this;
    }

    @Generated
    public Gq a(Gt gt) {
        this.aEp = gt;
        return this;
    }

    @Generated
    public Gp aMM() {
        return new Gp(this.adP, this.Vk, this.aEl, this.aEm, this.aEn, this.aEo, this.aEp);
    }

    @Generated
    public String toString() {
        return "Transaction.TransactionBuilder(uid=" + this.adP + ", name=" + this.Vk + ", serverDenomination=" + this.aEl + ", source=" + String.valueOf(this.aEm) + ", target=" + String.valueOf(this.aEn) + ", content=" + String.valueOf(this.aEo) + ", miscData=" + String.valueOf(this.aEp) + ")";
    }
}

