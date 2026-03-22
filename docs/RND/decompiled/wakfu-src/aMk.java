/*
 * Decompiled with CFR 0.152.
 */
public class aMk
implements aqz_2 {
    protected int o;
    protected int eix;
    protected String ekf;
    protected int ekg;
    protected int ekh;
    protected int eki;
    protected int ciZ;
    protected boolean ekj;
    protected int[] ekk;
    protected int[] ekl;
    protected aMl[] ekm;

    public int d() {
        return this.o;
    }

    public int clO() {
        return this.eix;
    }

    public String cnu() {
        return this.ekf;
    }

    public int LR() {
        return this.ekg;
    }

    public int cnv() {
        return this.ekh;
    }

    public int cnw() {
        return this.eki;
    }

    public int aVt() {
        return this.ciZ;
    }

    public boolean cnx() {
        return this.ekj;
    }

    public int[] cny() {
        return this.ekk;
    }

    public int[] cnz() {
        return this.ekl;
    }

    public aMl[] cnA() {
        return this.ekm;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.eix = 0;
        this.ekf = null;
        this.ekg = 0;
        this.ekh = 0;
        this.eki = 0;
        this.ciZ = 0;
        this.ekj = false;
        this.ekk = null;
        this.ekl = null;
        this.ekm = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.eix = aqh_12.bGI();
        this.ekf = aqh_12.bGL().intern();
        this.ekg = aqh_12.bGI();
        this.ekh = aqh_12.bGI();
        this.eki = aqh_12.bGI();
        this.ciZ = aqh_12.bGI();
        this.ekj = aqh_12.bxv();
        this.ekk = aqh_12.bGM();
        this.ekl = aqh_12.bGM();
        int n = aqh_12.bGI();
        this.ekm = new aMl[n];
        for (int i = 0; i < n; ++i) {
            this.ekm[i] = new aMl();
            this.ekm[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oAN.d();
    }
}

