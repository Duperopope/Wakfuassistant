/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from arP
 */
public class arp_2 {
    private awx_1 cVs = null;
    private int cVt;
    private int bap;
    private int baq;

    public arp_2(String string, int n, int n2) {
        this(awk_2.f(string, n, n2));
    }

    public arp_2() {
        this("COPRGTL", 4, 11);
    }

    public arp_2(awh_2 awh_22) {
        this.cVs = awa_1.c(awh_22);
        this.cVs.c(0.8f, 0.8f, 0.8f, 1.0f);
    }

    public void a(art_1 art_12, int n, int n2) {
        this.cVs.bNA();
        this.cVt = this.cVs.bNx();
        this.cVs.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.bap = n - art_12.bIt() / 2;
        this.baq = (int)(1.5f * (float)art_12.bIu()) - n2 - this.cVt;
    }

    public void fY(String string) {
        this.cVs.a(string.toCharArray(), this.bap, this.baq);
        this.baq -= this.cVt;
    }

    public void c(String string, int n, int n2) {
        this.cVs.a(string.toCharArray(), this.bap + n, this.baq - n2);
    }

    public void bIi() {
        this.cVs.bNz();
    }
}

