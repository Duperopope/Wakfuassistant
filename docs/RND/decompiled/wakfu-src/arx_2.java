/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from arX
 */
public class arx_2 {
    protected static final Logger cWm = Logger.getLogger(arx_2.class);
    private int cWn;
    private double cWo;
    private double cWp;
    private double cWq;
    private double cWr;

    public int bIK() {
        return this.cWn;
    }

    public void ug(int n) {
        this.cWn = n;
    }

    public double bIL() {
        return this.cWo;
    }

    public void D(double d2) {
        this.cWo = d2;
    }

    public double bIM() {
        return this.cWp;
    }

    public void E(double d2) {
        this.cWp = d2;
    }

    public double bIN() {
        return this.cWq;
    }

    public void F(double d2) {
        this.cWq = d2;
    }

    public double bIO() {
        return this.cWr;
    }

    public void G(double d2) {
        this.cWr = d2;
    }

    public void bIP() {
        cWm.info((Object)"Benchmark result :");
        cWm.info((Object)("\t* best texture format : " + (this.cWn == 6408 ? "RGBA" : "BGRA")));
        cWm.info((Object)("\t* rgba bandwidth index : " + this.cWo));
        cWm.info((Object)("\t* bgra bandwidth index : " + this.cWp));
        cWm.info((Object)("\t* pixel fillrate index : " + this.cWq));
        cWm.info((Object)("\t* texture fillrate index : " + this.cWr));
    }
}

