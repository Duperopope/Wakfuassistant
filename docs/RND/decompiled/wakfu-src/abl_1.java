/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

/*
 * Renamed from aBL
 */
public class abl_1 {
    protected final double dzL;
    protected final double dzM;
    protected final double dzN;
    protected final Random dzO;

    public abl_1(double d2, double d3) {
        this(d2, d3, System.currentTimeMillis());
    }

    public abl_1(double d2, double d3, long l) {
        this.dzL = d2;
        this.dzM = d3;
        this.dzN = this.dzM * this.dzM;
        this.dzO = new GD(l);
    }

    public double I(double d2) {
        double d3 = d2 - this.dzL;
        double d4 = 1.0 / Math.sqrt(Math.PI * 2 * this.dzN);
        return d4 * Math.exp(-(d3 * d3) / (2.0 * this.dzN));
    }

    public double nextDouble() {
        double d2 = this.dzO.nextGaussian();
        return this.dzL + this.dzM * d2;
    }

    public String toString() {
        return "CraftDistribution{m_mean=" + this.dzL + ", m_deviation=" + this.dzM + ", m_variance=" + this.dzN + "}";
    }
}

