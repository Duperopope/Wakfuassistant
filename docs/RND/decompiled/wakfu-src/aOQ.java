/*
 * Decompiled with CFR 0.152.
 */
public class aOQ
implements aqz_2 {
    protected int o;
    protected int euF;
    protected int euG;
    protected short bol;
    protected int euH;
    protected int euI;
    protected int bMn;
    protected String asF;
    protected float euJ;

    public int d() {
        return this.o;
    }

    public int cyp() {
        return this.euF;
    }

    public int cyq() {
        return this.euG;
    }

    public short bfd() {
        return this.bol;
    }

    public int cyr() {
        return this.euH;
    }

    public int cys() {
        return this.euI;
    }

    public int getDuration() {
        return this.bMn;
    }

    public String aGr() {
        return this.asF;
    }

    public float cyt() {
        return this.euJ;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.euF = 0;
        this.euG = 0;
        this.bol = 0;
        this.euH = 0;
        this.euI = 0;
        this.bMn = 0;
        this.asF = null;
        this.euJ = 0.0f;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.euF = aqh_12.bGI();
        this.euG = aqh_12.bGI();
        this.bol = aqh_12.bGG();
        this.euH = aqh_12.bGI();
        this.euI = aqh_12.bGI();
        this.bMn = aqh_12.bGI();
        this.asF = aqh_12.bGL().intern();
        this.euJ = aqh_12.bGH();
    }

    @Override
    public final int bGA() {
        return ewj_2.oAG.d();
    }
}

