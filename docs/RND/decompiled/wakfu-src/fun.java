/*
 * Decompiled with CFR 0.152.
 */
public class fun
implements aqz_2 {
    protected int o;
    protected int efP;
    protected boolean bYX;
    protected boolean dxk;
    protected String asF;
    protected String efR;
    protected fup_0[] tyo;
    protected fur[] typ;
    protected int bMn;
    protected int efU;
    protected boolean efV;
    protected boolean efW;
    protected boolean efX;
    protected int efY;
    protected boolean ega;
    protected int tyq;
    protected long[] tyr;
    protected long egc;
    protected long egd;
    protected boolean tys;
    protected boolean egz;
    protected boolean egf;
    protected int egg;
    protected byte egh;
    protected int egi;
    protected boolean tyt;

    public int d() {
        return this.o;
    }

    public int cjd() {
        return this.efP;
    }

    public boolean isVisible() {
        return this.bYX;
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

    public fup_0[] gni() {
        return this.tyo;
    }

    public fur[] gnj() {
        return this.typ;
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

    public boolean cjn() {
        return this.ega;
    }

    public int bMY() {
        return this.tyq;
    }

    public long[] gnk() {
        return this.tyr;
    }

    public long cjp() {
        return this.egc;
    }

    public long cjq() {
        return this.egd;
    }

    public boolean gnl() {
        return this.tys;
    }

    public boolean cjL() {
        return this.egz;
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

    public boolean gnm() {
        return this.tyt;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.efP = 0;
        this.bYX = false;
        this.dxk = false;
        this.asF = null;
        this.efR = null;
        this.tyo = null;
        this.typ = null;
        this.bMn = 0;
        this.efU = 0;
        this.efV = false;
        this.efW = false;
        this.efX = false;
        this.efY = 0;
        this.ega = false;
        this.tyq = 0;
        this.tyr = null;
        this.egc = 0L;
        this.egd = 0L;
        this.tys = false;
        this.egz = false;
        this.egf = false;
        this.egg = 0;
        this.egh = 0;
        this.egi = 0;
        this.tyt = false;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        int n;
        this.o = aqh_12.bGI();
        this.efP = aqh_12.bGI();
        this.bYX = aqh_12.bxv();
        this.dxk = aqh_12.bxv();
        this.asF = aqh_12.bGL().intern();
        this.efR = aqh_12.bGL().intern();
        int n2 = aqh_12.bGI();
        this.tyo = new fup_0[n2];
        for (n = 0; n < n2; ++n) {
            this.tyo[n] = new fup_0();
            this.tyo[n].a(aqh_12);
        }
        n = aqh_12.bGI();
        this.typ = new fur[n];
        for (int i = 0; i < n; ++i) {
            this.typ[i] = new fur();
            this.typ[i].a(aqh_12);
        }
        this.bMn = aqh_12.bGI();
        this.efU = aqh_12.bGI();
        this.efV = aqh_12.bxv();
        this.efW = aqh_12.bxv();
        this.efX = aqh_12.bxv();
        this.efY = aqh_12.bGI();
        this.ega = aqh_12.bxv();
        this.tyq = aqh_12.bGI();
        this.tyr = aqh_12.bxz();
        this.egc = aqh_12.bGK();
        this.egd = aqh_12.bGK();
        this.tys = aqh_12.bxv();
        this.egz = aqh_12.bxv();
        this.egf = aqh_12.bxv();
        this.egg = aqh_12.bGI();
        this.egh = aqh_12.aTf();
        this.egi = aqh_12.bGI();
        this.tyt = aqh_12.bxv();
    }

    @Override
    public final int bGA() {
        return ewj_2.oyr.d();
    }
}

