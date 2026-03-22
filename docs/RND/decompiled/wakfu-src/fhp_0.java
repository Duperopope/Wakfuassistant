/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fhP
 */
public class fhp_0 {
    private rd_0[] sqj;
    private fhr_0 iUF;

    public fhp_0() {
    }

    public fhp_0(fhr_0 fhr_02) {
        this.iUF = fhr_02;
        this.sqj = new rd_0[0];
    }

    public rd_0[] fZe() {
        return this.sqj;
    }

    public void c(rd_0[] rd_0Array) {
        this.sqj = (rd_0[])rd_0Array.clone();
    }

    public fhr_0 dCF() {
        return this.iUF;
    }

    public void c(fhr_0 fhr_02) {
        this.iUF = fhr_02;
    }
}

