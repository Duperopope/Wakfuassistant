/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from auV
 */
public class auv_2 {
    private awx_1 cVs = null;
    private int cVt;
    private int bap;
    private int baq;

    public auv_2(String string, int n, int n2) {
        awh_2 awh_22 = awk_2.f(string, n, n2);
        if (awh_22 != null) {
            if (awh_22 instanceof avo_2) {
                ((avo_2)awh_22).bNt();
            }
            this.cVs = awa_1.c(awh_22);
        }
        this.cVs.c(0.8f, 0.8f, 0.8f, 1.0f);
    }

    public void a(art_1 art_12, int n, int n2) {
        this.cVs.bNA();
        this.cVt = this.cVs.bNx();
        this.bap = n - art_12.bIt() / 2;
        this.baq = (int)(0.5f * (float)art_12.bIu()) - n2 - this.cVt;
    }

    public void fY(String string) {
        this.e(string, null);
    }

    public void e(String string, float[] fArray) {
        if (fArray != null) {
            this.cVs.c(fArray[0], fArray[1], fArray[2], fArray[3]);
        } else {
            this.cVs.c(1.0f, 1.0f, 1.0f, 1.0f);
        }
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

