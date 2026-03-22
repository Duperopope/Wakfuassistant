/*
 * Decompiled with CFR 0.152.
 */
public final class bbB {
    private final eSS hAF;
    private String hAv;
    private String hAw;
    private String egZ;
    private int hAz = 1;
    private String eha;
    private short bVV;

    public bbB(eSS eSS2) {
        this.hAF = eSS2;
    }

    public bbB lh(String string) {
        this.hAv = string;
        return this;
    }

    public bbB li(String string) {
        this.hAw = string;
        return this;
    }

    public bbB lj(String string) {
        this.egZ = string;
        return this;
    }

    public bbB q(String string, int n) {
        this.egZ = string;
        this.hAz = n;
        return this;
    }

    public bbB lk(String string) {
        this.eha = string;
        return this;
    }

    public bbB bf(short s) {
        this.bVV = s;
        return this;
    }

    public bbA daf() {
        bbA bbA2 = new bbA(this.hAF);
        bbA2.le(this.egZ);
        bbA2.lc(this.eha);
        bbA2.AA(this.hAz);
        bbA2.lf(this.hAv);
        bbA2.lg(this.hAw);
        bbA2.aq(this.bVV);
        return bbA2;
    }
}

