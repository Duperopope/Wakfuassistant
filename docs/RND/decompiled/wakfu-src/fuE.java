/*
 * Decompiled with CFR 0.152.
 */
public class fuE
implements aqz_2 {
    protected int o;
    protected int[] tyC;
    protected int[] tyB;
    protected short tyD;
    protected String egv;
    protected short tyE;
    protected String tyF;

    public int d() {
        return this.o;
    }

    public int[] gnv() {
        return this.tyC;
    }

    public int[] gnu() {
        return this.tyB;
    }

    public short gnw() {
        return this.tyD;
    }

    public String cjH() {
        return this.egv;
    }

    public short gnx() {
        return this.tyE;
    }

    public String gny() {
        return this.tyF;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.tyC = null;
        this.tyB = null;
        this.tyD = 0;
        this.egv = null;
        this.tyE = 0;
        this.tyF = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.tyC = aqh_12.bGM();
        this.tyB = aqh_12.bGM();
        this.tyD = aqh_12.bGG();
        this.egv = aqh_12.bGL().intern();
        this.tyE = aqh_12.bGG();
        this.tyF = aqh_12.bGL().intern();
    }

    @Override
    public final int bGA() {
        return ewj_2.ozZ.d();
    }
}

