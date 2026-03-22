/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from fKB
 */
public abstract class fkb_1
implements fkc_1 {
    private final double uHc;
    private final double uHd;
    private final double uHe;
    private double uHf;
    private long gwj;

    protected fkb_1(double d2, double d3) {
        this(d2, d3, 1.0);
    }

    protected fkb_1(double d2, double d3, double d4) {
        this.uHc = d2;
        this.uHd = d3;
        this.uHe = d4;
        this.uHf = d2;
        this.gwj = System.currentTimeMillis();
    }

    @Override
    public Optional<acb_1> gwp() {
        long l = System.currentTimeMillis();
        double d2 = this.uHe * (double)(l - this.gwj) / 1000.0;
        this.uHf += d2;
        if (this.uHf >= this.uHd) {
            this.uHf -= this.uHd - this.uHc;
        }
        this.gwj = l;
        return this.i(this.uHf, d2);
    }

    protected abstract Optional<acb_1> i(double var1, double var3);
}

