/*
 * Decompiled with CFR 0.152.
 */
public class aMU
implements aqz_2 {
    protected int o;
    protected short elG;
    protected int ciZ;
    protected int elH;
    protected int elI;
    protected short ejt;
    protected String[] elJ;
    protected int elK;
    protected short elL;
    protected byte elM;
    protected byte elN;
    protected byte elO;
    protected int elP;
    protected int elQ;
    protected boolean elR;
    protected boolean elS;
    protected boolean elT;
    protected boolean elU;
    protected short elV;
    protected byte elW;
    protected String elX;
    protected int[] elY;
    protected byte elZ;
    protected byte ema;
    protected byte emb;
    protected byte emc;
    protected float emd;
    protected float eme;
    protected byte emf;
    protected int[] egL;
    protected amw_0[] emg;
    protected amx_0 emh;
    protected amy_0 emi;
    protected amv_0[] emj;

    public int d() {
        return this.o;
    }

    public short cpe() {
        return this.elG;
    }

    public int aVt() {
        return this.ciZ;
    }

    public int cpf() {
        return this.elH;
    }

    public int cpg() {
        return this.elI;
    }

    public short cmL() {
        return this.ejt;
    }

    public String[] cph() {
        return this.elJ;
    }

    public int cpi() {
        return this.elK;
    }

    public short cpj() {
        return this.elL;
    }

    public byte cpk() {
        return this.elM;
    }

    public byte cpl() {
        return this.elN;
    }

    public byte cpm() {
        return this.elO;
    }

    public int cpn() {
        return this.elP;
    }

    public int cpo() {
        return this.elQ;
    }

    public boolean cpp() {
        return this.elR;
    }

    public boolean cpq() {
        return this.elS;
    }

    public boolean cpr() {
        return this.elT;
    }

    public boolean cps() {
        return this.elU;
    }

    public short cpt() {
        return this.elV;
    }

    public byte cpu() {
        return this.elW;
    }

    public String cpv() {
        return this.elX;
    }

    public int[] cpw() {
        return this.elY;
    }

    public byte cpx() {
        return this.elZ;
    }

    public byte cpy() {
        return this.ema;
    }

    public byte cpz() {
        return this.emb;
    }

    public byte cpA() {
        return this.emc;
    }

    public float cpB() {
        return this.emd;
    }

    public float cpC() {
        return this.eme;
    }

    public byte cpD() {
        return this.emf;
    }

    public int[] cjX() {
        return this.egL;
    }

    public amw_0[] cpE() {
        return this.emg;
    }

    public amx_0 cpF() {
        return this.emh;
    }

    public amy_0 cpG() {
        return this.emi;
    }

    public amv_0[] cpH() {
        return this.emj;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.elG = 0;
        this.ciZ = 0;
        this.elH = 0;
        this.elI = 0;
        this.ejt = 0;
        this.elJ = null;
        this.elK = 0;
        this.elL = 0;
        this.elM = 0;
        this.elN = 0;
        this.elO = 0;
        this.elP = 0;
        this.elQ = 0;
        this.elR = false;
        this.elS = false;
        this.elT = false;
        this.elU = false;
        this.elV = 0;
        this.elW = 0;
        this.elX = null;
        this.elY = null;
        this.elZ = 0;
        this.ema = 0;
        this.emb = 0;
        this.emc = 0;
        this.emd = 0.0f;
        this.eme = 0.0f;
        this.emf = 0;
        this.egL = null;
        this.emg = null;
        this.emh = null;
        this.emi = null;
        this.emj = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        int n;
        this.o = aqh_12.bGI();
        this.elG = aqh_12.bGG();
        this.ciZ = aqh_12.bGI();
        this.elH = aqh_12.bGI();
        this.elI = aqh_12.bGI();
        this.ejt = aqh_12.bGG();
        this.elJ = aqh_12.bGO();
        this.elK = aqh_12.bGI();
        this.elL = aqh_12.bGG();
        this.elM = aqh_12.aTf();
        this.elN = aqh_12.aTf();
        this.elO = aqh_12.aTf();
        this.elP = aqh_12.bGI();
        this.elQ = aqh_12.bGI();
        this.elR = aqh_12.bxv();
        this.elS = aqh_12.bxv();
        this.elT = aqh_12.bxv();
        this.elU = aqh_12.bxv();
        this.elV = aqh_12.bGG();
        this.elW = aqh_12.aTf();
        this.elX = aqh_12.bGL().intern();
        this.elY = aqh_12.bGM();
        this.elZ = aqh_12.aTf();
        this.ema = aqh_12.aTf();
        this.emb = aqh_12.aTf();
        this.emc = aqh_12.aTf();
        this.emd = aqh_12.bGH();
        this.eme = aqh_12.bGH();
        this.emf = aqh_12.aTf();
        this.egL = aqh_12.bGM();
        int n2 = aqh_12.bGI();
        this.emg = new amw_0[n2];
        for (n = 0; n < n2; ++n) {
            this.emg[n] = new amw_0();
            this.emg[n].a(aqh_12);
        }
        if (aqh_12.aTf() != 0) {
            this.emh = new amx_0();
            this.emh.a(aqh_12);
        } else {
            this.emh = null;
        }
        if (aqh_12.aTf() != 0) {
            this.emi = new amy_0();
            this.emi.a(aqh_12);
        } else {
            this.emi = null;
        }
        n = aqh_12.bGI();
        this.emj = new amv_0[n];
        for (int i = 0; i < n; ++i) {
            this.emj[i] = new amv_0();
            this.emj[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oyZ.d();
    }
}

