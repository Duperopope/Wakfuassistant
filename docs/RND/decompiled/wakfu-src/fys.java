/*
 * Decompiled with CFR 0.152.
 */
public class fys
implements aqz_2 {
    protected int o;
    protected double ejs;
    protected short enb;
    protected short enc;
    protected String eik;
    protected short euL;
    protected short[] euM;
    protected short[] euN;
    protected fyt[] tBC;

    public int d() {
        return this.o;
    }

    public double cmK() {
        return this.ejs;
    }

    public short cqz() {
        return this.enb;
    }

    public short cqA() {
        return this.enc;
    }

    public String clB() {
        return this.eik;
    }

    public short cyv() {
        return this.euL;
    }

    public short[] cyw() {
        return this.euM;
    }

    public short[] cyx() {
        return this.euN;
    }

    public fyt[] gqv() {
        return this.tBC;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.ejs = 0.0;
        this.enb = 0;
        this.enc = 0;
        this.eik = null;
        this.euL = 0;
        this.euM = null;
        this.euN = null;
        this.tBC = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.ejs = aqh_12.bGJ();
        this.enb = aqh_12.bGG();
        this.enc = aqh_12.bGG();
        this.eik = aqh_12.bGL().intern();
        this.euL = aqh_12.bGG();
        this.euM = aqh_12.bGN();
        this.euN = aqh_12.bGN();
        int n = aqh_12.bGI();
        this.tBC = new fyt[n];
        for (int i = 0; i < n; ++i) {
            this.tBC[i] = new fyt();
            this.tBC[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.ozM.d();
    }
}

