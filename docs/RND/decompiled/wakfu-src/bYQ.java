/*
 * Decompiled with CFR 0.152.
 */
public class bYQ
implements aao_2 {
    private long cwe;
    private long lBk;
    private long dxy;
    private final int lBl;
    private final int lBm;
    private final String lBn;

    public bYQ(int n, int n2, String string) {
        this.lBl = n;
        this.lBm = n2;
        this.lBn = string;
    }

    public String eoV() {
        return this.lBn;
    }

    public void fm(long l) {
        this.bhk();
        this.lBk = l;
        this.fY(l);
        this.dxy = abb_2.bUA().a(this, 1000L, 0, l);
    }

    public void bhk() {
        this.lBk = 0L;
        this.fY(0L);
        abb_2.bUA().hk(this.dxy);
    }

    protected byte mt(long l) {
        if (l > (long)this.lBl) {
            return 0;
        }
        if (l > (long)this.lBm) {
            return 1;
        }
        return 2;
    }

    protected void fY(long l) {
        this.cwe = Math.max(l, 0L);
        if (this.lBn != null) {
            fse_1.gFu().b("countdownValue", this.cwe, this.lBn);
            fse_1.gFu().b("countdownText", (Object)this.dhw(), this.lBn);
            fse_1.gFu().b("countdownPercentage", Float.valueOf((float)this.cwe / (float)this.lBk), this.lBn);
            fse_1.gFu().b("countdownState", this.mt(l), this.lBn);
        } else {
            fse_1.gFu().f("countdownValue", this.cwe);
            fse_1.gFu().f("countdownText", this.dhw());
            fse_1.gFu().f("countdownPercentage", Float.valueOf((float)this.cwe / (float)this.lBk));
            fse_1.gFu().f("countdownState", this.mt(l));
        }
    }

    protected final long epz() {
        return this.cwe;
    }

    protected String dhw() {
        return String.valueOf(this.cwe);
    }

    @Override
    public boolean b(aam_2 aam_22) {
        this.fY(this.cwe - 1L);
        if (this.cwe == 0L) {
            this.bhk();
        }
        return false;
    }

    @Override
    public long Sn() {
        return 1L;
    }

    @Override
    public void dC(long l) {
    }
}

