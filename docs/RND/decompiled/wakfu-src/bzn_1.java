/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bZn
 */
public class bzn_1
extends abb_0 {
    public static final awx_2 lCz = new awx_2(0.8f, 0.8f, 0.8f, 0.8f);
    public static final int lCA = 5000;
    public static final int lCB = 20000;
    private int lCC;
    private final int lCD;
    private final int lCE;
    private final awx_2 lCF = new awx_2(lCz);

    public bzn_1() {
        this(5000, 20000);
    }

    public bzn_1(int n, int n2) {
        this.lCD = n;
        this.lCE = n2;
    }

    public void setColor(axb_2 axb_22) {
        this.lCF.c(axb_22);
    }

    @Override
    public void clear() {
    }

    @Override
    public void reset() {
        super.reset();
        this.lCC = GC.q(this.lCD, this.lCE);
    }

    @Override
    public void qF(int n) {
        super.qF(n);
        this.lCC -= n;
        if (this.lCC < 0) {
            this.lCC = GC.q(this.lCD, this.lCE);
            bzq_1.a(this.bUu, this.lCF);
        }
    }

    @Override
    public void b(art_1 art_12) {
    }

    public axb_2 epO() {
        return this.lCF;
    }
}

