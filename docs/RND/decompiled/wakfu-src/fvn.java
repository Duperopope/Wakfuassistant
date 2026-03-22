/*
 * Decompiled with CFR 0.152.
 */
public class fvn
implements aqz_2 {
    protected int ejc;
    protected int ejd;
    protected float eje;
    protected boolean ejf;
    protected boolean ejg;
    protected boolean ejh;

    public int cms() {
        return this.ejc;
    }

    public int cmt() {
        return this.ejd;
    }

    public float cmu() {
        return this.eje;
    }

    public boolean cmv() {
        return this.ejf;
    }

    public boolean cmw() {
        return this.ejg;
    }

    public boolean cmx() {
        return this.ejh;
    }

    @Override
    public void reset() {
        this.ejc = 0;
        this.ejd = 0;
        this.eje = 0.0f;
        this.ejf = false;
        this.ejg = false;
        this.ejh = false;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.ejc = aqh_12.bGI();
        this.ejd = aqh_12.bGI();
        this.eje = aqh_12.bGH();
        this.ejf = aqh_12.bxv();
        this.ejg = aqh_12.bxv();
        this.ejh = aqh_12.bxv();
    }

    @Override
    public final int bGA() {
        return ewj_2.oyN.d();
    }
}

