/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aKP
 */
public class akp_0
implements aqz_2 {
    protected int o;
    protected int efP;
    protected boolean bYX;
    protected boolean efQ;
    protected boolean dxk;
    protected String asF;
    protected String efR;
    protected akq_0[] efS;
    protected aks_0[] efT;
    protected int bMn;
    protected int efU;
    protected boolean efV;
    protected boolean efW;
    protected boolean efX;
    protected int efY;
    protected int efZ;
    protected boolean ega;
    protected int egb;
    protected long egc;
    protected long egd;
    protected boolean ege;
    protected int ciZ;
    protected boolean egf;
    protected int egg;
    protected byte egh;
    protected int egi;
    protected String egj;
    protected int bIi;

    public int d() {
        return this.o;
    }

    public int cjd() {
        return this.efP;
    }

    public boolean isVisible() {
        return this.bYX;
    }

    public boolean cje() {
        return this.efQ;
    }

    public boolean apo() {
        return this.dxk;
    }

    public String aGr() {
        return this.asF;
    }

    public String cjf() {
        return this.efR;
    }

    public akq_0[] cjg() {
        return this.efS;
    }

    public aks_0[] cjh() {
        return this.efT;
    }

    public int getDuration() {
        return this.bMn;
    }

    public int cji() {
        return this.efU;
    }

    public boolean cjj() {
        return this.efV;
    }

    public boolean aYo() {
        return this.efW;
    }

    public boolean cjk() {
        return this.efX;
    }

    public int cjl() {
        return this.efY;
    }

    public int cjm() {
        return this.efZ;
    }

    public boolean cjn() {
        return this.ega;
    }

    public int cjo() {
        return this.egb;
    }

    public long cjp() {
        return this.egc;
    }

    public long cjq() {
        return this.egd;
    }

    public boolean cjr() {
        return this.ege;
    }

    public int aVt() {
        return this.ciZ;
    }

    public boolean cjs() {
        return this.egf;
    }

    public int cjt() {
        return this.egg;
    }

    public byte cju() {
        return this.egh;
    }

    public int aYs() {
        return this.egi;
    }

    public String cjv() {
        return this.egj;
    }

    public int aeV() {
        return this.bIi;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.efP = 0;
        this.bYX = false;
        this.efQ = false;
        this.dxk = false;
        this.asF = null;
        this.efR = null;
        this.efS = null;
        this.efT = null;
        this.bMn = 0;
        this.efU = 0;
        this.efV = false;
        this.efW = false;
        this.efX = false;
        this.efY = 0;
        this.efZ = 0;
        this.ega = false;
        this.egb = 0;
        this.egc = 0L;
        this.egd = 0L;
        this.ege = false;
        this.ciZ = 0;
        this.egf = false;
        this.egg = 0;
        this.egh = 0;
        this.egi = 0;
        this.egj = null;
        this.bIi = 0;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        int n;
        this.o = aqh_12.bGI();
        this.efP = aqh_12.bGI();
        this.bYX = aqh_12.bxv();
        this.efQ = aqh_12.bxv();
        this.dxk = aqh_12.bxv();
        this.asF = aqh_12.bGL().intern();
        this.efR = aqh_12.bGL().intern();
        int n2 = aqh_12.bGI();
        this.efS = new akq_0[n2];
        for (n = 0; n < n2; ++n) {
            this.efS[n] = new akq_0();
            this.efS[n].a(aqh_12);
        }
        n = aqh_12.bGI();
        this.efT = new aks_0[n];
        for (int i = 0; i < n; ++i) {
            this.efT[i] = new aks_0();
            this.efT[i].a(aqh_12);
        }
        this.bMn = aqh_12.bGI();
        this.efU = aqh_12.bGI();
        this.efV = aqh_12.bxv();
        this.efW = aqh_12.bxv();
        this.efX = aqh_12.bxv();
        this.efY = aqh_12.bGI();
        this.efZ = aqh_12.bGI();
        this.ega = aqh_12.bxv();
        this.egb = aqh_12.bGI();
        this.egc = aqh_12.bGK();
        this.egd = aqh_12.bGK();
        this.ege = aqh_12.bxv();
        this.ciZ = aqh_12.bGI();
        this.egf = aqh_12.bxv();
        this.egg = aqh_12.bGI();
        this.egh = aqh_12.aTf();
        this.egi = aqh_12.bGI();
        this.egj = aqh_12.bGL().intern();
        this.bIi = aqh_12.bGI();
    }

    @Override
    public final int bGA() {
        return ewj_2.oyr.d();
    }
}

