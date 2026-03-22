/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fvu
 */
public class fvu_0
implements aqz_2 {
    protected short ejr;
    protected double ejs;

    public short cmJ() {
        return this.ejr;
    }

    public double cmK() {
        return this.ejs;
    }

    @Override
    public void reset() {
        this.ejr = 0;
        this.ejs = 0.0;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.ejr = aqh_12.bGG();
        this.ejs = aqh_12.bGJ();
    }

    @Override
    public final int bGA() {
        return ewj_2.ozV.d();
    }
}

