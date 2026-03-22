/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aMe
 */
public class ame_0
implements aqz_2 {
    protected int o;
    protected short aXy;
    protected String ejN;
    protected boolean ejO;
    protected boolean ejP;
    protected boolean ejQ;
    protected String[] ejR;
    protected int bMn;
    protected int efU;
    protected String eik;
    protected int[] ejS;
    protected int[] ejT;

    public int d() {
        return this.o;
    }

    public short clb() {
        return this.aXy;
    }

    public String cnc() {
        return this.ejN;
    }

    public boolean cnd() {
        return this.ejO;
    }

    public boolean cne() {
        return this.ejP;
    }

    public boolean cnf() {
        return this.ejQ;
    }

    public String[] cng() {
        return this.ejR;
    }

    public int getDuration() {
        return this.bMn;
    }

    public int cji() {
        return this.efU;
    }

    public String clB() {
        return this.eik;
    }

    public int[] cnh() {
        return this.ejS;
    }

    public int[] cni() {
        return this.ejT;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.aXy = 0;
        this.ejN = null;
        this.ejO = false;
        this.ejP = false;
        this.ejQ = false;
        this.ejR = null;
        this.bMn = 0;
        this.efU = 0;
        this.eik = null;
        this.ejS = null;
        this.ejT = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.aXy = aqh_12.bGG();
        this.ejN = aqh_12.bGL().intern();
        this.ejO = aqh_12.bxv();
        this.ejP = aqh_12.bxv();
        this.ejQ = aqh_12.bxv();
        this.ejR = aqh_12.bGO();
        this.bMn = aqh_12.bGI();
        this.efU = aqh_12.bGI();
        this.eik = aqh_12.bGL().intern();
        this.ejS = aqh_12.bGM();
        this.ejT = aqh_12.bGM();
    }

    @Override
    public final int bGA() {
        return ewj_2.ozS.d();
    }
}

