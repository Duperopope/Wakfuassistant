/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aOC
 */
public class aoc_0
implements aqz_2 {
    protected int bfE;
    protected int bfF;
    protected int egx;
    protected short eta;
    protected int[] etb;
    protected short etc;
    protected short etd;
    protected int[] ete;
    protected short etf;
    protected int[] etg;
    protected int[] eth;
    protected int[] eti;
    protected int[] etj;
    protected int[] etk;
    protected int[] etl;
    protected int[] etm;
    protected String etn;
    protected long[] eto;
    protected boolean bfY;
    protected int etp;
    protected float etq;
    protected boolean esK;
    protected boolean etr;
    protected short ets;
    protected float ett;
    protected float[] biv;
    protected float etu;
    protected float etv;
    protected byte etw;
    protected byte etx;
    protected byte ety;
    protected int bfW;
    protected boolean etz;
    protected short etA;
    protected float etB;
    protected byte etC;
    protected boolean etD;
    protected String etE;
    protected short etF;
    protected short etG;
    protected String etH;
    protected String etI;
    protected String etJ;
    protected boolean bfK;
    protected boolean etK;
    protected boolean etL;
    protected boolean etM;
    protected boolean etN;
    protected boolean etO;
    protected int dKh;
    protected boolean bfZ;
    protected int[] etP;
    protected boolean etQ;
    protected boolean etR;
    protected boolean etS;
    protected boolean etT;
    protected boolean etU;

    public boolean aZz() {
        return false;
    }

    public boolean cwG() {
        return false;
    }

    public boolean cwH() {
        return false;
    }

    public boolean cwI() {
        String string = this.cxu().trim();
        boolean bl = this.cxo();
        boolean bl2 = this.cwJ();
        if (bl2) {
            return false;
        }
        if (string.startsWith("ITEM")) {
            return bl && this.cwK();
        }
        String string2 = this.cxt().trim();
        return string2.startsWith("SPELL") && bl || string2.startsWith("GROUP") || string2.startsWith("BOMB") || string2.startsWith("AREA") || string2.startsWith("IEP_DESTRUCTIBLE") || string2.startsWith("STATE") && bl || string2.startsWith("TIMELINE") && bl;
    }

    public boolean cwJ() {
        if (this.etP == null) {
            return false;
        }
        for (int i = 0; i < this.etP.length; ++i) {
            int n = this.etP[i];
            eNi eNi2 = eNi.RQ(n);
            if (eNi2 != eNi.qWH) continue;
            return true;
        }
        return false;
    }

    public boolean cwK() {
        String string = this.cxu().trim();
        boolean bl = this.cwJ();
        if (bl) {
            return false;
        }
        if (string.startsWith("ITEM")) {
            return string.endsWith("_USE");
        }
        boolean bl2 = this.cxo();
        String string2 = this.cxt().trim();
        return !string2.startsWith("SET") && (!string2.startsWith("SPELL") || bl2) && !string2.startsWith("PROTECTOR") && !string2.startsWith("BUILDING") && !string2.startsWith("ABILITY") && !string2.startsWith("APTITUDE");
    }

    public int aZH() {
        return this.bfE;
    }

    public int avZ() {
        return this.bfF;
    }

    public int cjJ() {
        return this.egx;
    }

    public short cwL() {
        return this.eta;
    }

    public int[] cwM() {
        return this.etb;
    }

    public short cwN() {
        return this.etc;
    }

    public short cwO() {
        return this.etd;
    }

    public int[] cwP() {
        return this.ete;
    }

    public short cwQ() {
        return this.etf;
    }

    public int[] cwR() {
        return this.etg;
    }

    public int[] cwS() {
        return this.eth;
    }

    public int[] cwT() {
        return this.eti;
    }

    public int[] cwU() {
        return this.etj;
    }

    public int[] cwV() {
        return this.etk;
    }

    public int[] cwW() {
        return this.etl;
    }

    public int[] cwX() {
        return this.etm;
    }

    public String cwY() {
        return this.etn;
    }

    public long[] cwZ() {
        return this.eto;
    }

    public boolean aZT() {
        return this.bfY;
    }

    public int cxa() {
        return this.etp;
    }

    public float cxb() {
        return this.etq;
    }

    public boolean cwq() {
        return this.esK;
    }

    public boolean cxc() {
        return this.etr;
    }

    public short cxd() {
        return this.ets;
    }

    public float cxe() {
        return this.ett;
    }

    public float[] ckl() {
        return this.biv;
    }

    public float cxf() {
        return this.etu;
    }

    public float cxg() {
        return this.etv;
    }

    public byte cxh() {
        return this.etw;
    }

    public byte cxi() {
        return this.etx;
    }

    public byte cxj() {
        return this.ety;
    }

    public int aZP() {
        return this.bfW;
    }

    public boolean cxk() {
        return this.etz;
    }

    public short cxl() {
        return this.etA;
    }

    public float cxm() {
        return this.etB;
    }

    public byte cxn() {
        return this.etC;
    }

    public boolean cxo() {
        return this.etD;
    }

    public String cxp() {
        return this.etE;
    }

    public short cxq() {
        return this.etF;
    }

    public short cxr() {
        return this.etG;
    }

    public String cxs() {
        return this.etH;
    }

    public String cxt() {
        return this.etI;
    }

    public String cxu() {
        return this.etJ;
    }

    public boolean cxv() {
        return this.bfK;
    }

    public boolean cxw() {
        return this.etK;
    }

    public boolean cwA() {
        return this.etL;
    }

    public boolean cxx() {
        return this.etM;
    }

    public boolean cxy() {
        return this.etN;
    }

    public boolean cxz() {
        return this.etO;
    }

    public int cbj() {
        return this.dKh;
    }

    public boolean aZW() {
        return this.bfZ;
    }

    public int[] cxA() {
        return this.etP;
    }

    public boolean cxB() {
        return this.etQ;
    }

    public boolean cxC() {
        return this.etR;
    }

    public boolean cxD() {
        return this.etS;
    }

    public boolean cwr() {
        return this.etT;
    }

    public boolean cxE() {
        return this.etU;
    }

    @Override
    public void reset() {
        this.bfE = 0;
        this.bfF = 0;
        this.egx = 0;
        this.eta = 0;
        this.etb = null;
        this.etc = 0;
        this.etd = 0;
        this.ete = null;
        this.etf = 0;
        this.etg = null;
        this.eth = null;
        this.eti = null;
        this.etj = null;
        this.etk = null;
        this.etl = null;
        this.etm = null;
        this.etn = null;
        this.eto = null;
        this.bfY = false;
        this.etp = 0;
        this.etq = 0.0f;
        this.esK = false;
        this.etr = false;
        this.ets = 0;
        this.ett = 0.0f;
        this.biv = null;
        this.etu = 0.0f;
        this.etv = 0.0f;
        this.etw = 0;
        this.etx = 0;
        this.ety = 0;
        this.bfW = 0;
        this.etz = false;
        this.etA = 0;
        this.etB = 0.0f;
        this.etC = 0;
        this.etD = false;
        this.etE = null;
        this.etF = 0;
        this.etG = 0;
        this.etH = null;
        this.etI = null;
        this.etJ = null;
        this.bfK = false;
        this.etK = false;
        this.etL = false;
        this.etM = false;
        this.etN = false;
        this.etO = false;
        this.dKh = 0;
        this.bfZ = false;
        this.etP = null;
        this.etQ = false;
        this.etR = false;
        this.etS = false;
        this.etT = false;
        this.etU = false;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.bfE = aqh_12.bGI();
        this.bfF = aqh_12.bGI();
        this.egx = aqh_12.bGI();
        this.eta = aqh_12.bGG();
        this.etb = aqh_12.bGM();
        this.etc = aqh_12.bGG();
        this.etd = aqh_12.bGG();
        this.ete = aqh_12.bGM();
        this.etf = aqh_12.bGG();
        this.etg = aqh_12.bGM();
        this.eth = aqh_12.bGM();
        this.eti = aqh_12.bGM();
        this.etj = aqh_12.bGM();
        this.etk = aqh_12.bGM();
        this.etl = aqh_12.bGM();
        this.etm = aqh_12.bGM();
        this.etn = aqh_12.bGL().intern();
        this.eto = aqh_12.bxz();
        this.bfY = aqh_12.bxv();
        this.etp = aqh_12.bGI();
        this.etq = aqh_12.bGH();
        this.esK = aqh_12.bxv();
        this.etr = aqh_12.bxv();
        this.ets = aqh_12.bGG();
        this.ett = aqh_12.bGH();
        this.biv = aqh_12.bxA();
        this.etu = aqh_12.bGH();
        this.etv = aqh_12.bGH();
        this.etw = aqh_12.aTf();
        this.etx = aqh_12.aTf();
        this.ety = aqh_12.aTf();
        this.bfW = aqh_12.bGI();
        this.etz = aqh_12.bxv();
        this.etA = aqh_12.bGG();
        this.etB = aqh_12.bGH();
        this.etC = aqh_12.aTf();
        this.etD = aqh_12.bxv();
        this.etE = aqh_12.bGL().intern();
        this.etF = aqh_12.bGG();
        this.etG = aqh_12.bGG();
        this.etH = aqh_12.bGL().intern();
        this.etI = aqh_12.bGL().intern();
        this.etJ = aqh_12.bGL().intern();
        this.bfK = aqh_12.bxv();
        this.etK = aqh_12.bxv();
        this.etL = aqh_12.bxv();
        this.etM = aqh_12.bxv();
        this.etN = aqh_12.bxv();
        this.etO = aqh_12.bxv();
        this.dKh = aqh_12.bGI();
        this.bfZ = aqh_12.bxv();
        this.etP = aqh_12.bGM();
        this.etQ = aqh_12.bxv();
        this.etR = aqh_12.bxv();
        this.etS = aqh_12.bxv();
        this.etT = aqh_12.bxv();
        this.etU = aqh_12.bxv();
    }

    @Override
    public final int bGA() {
        return ewj_2.ozF.d();
    }
}

