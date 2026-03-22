/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fxP
 */
public class fxp_0
implements aqz_2 {
    public static byte tBj;
    protected int o;
    protected int bIi;
    protected int eqU;
    protected short eqV;
    protected short eqW;
    protected boolean eqX;
    protected boolean eqZ;
    protected boolean era;
    protected short erb;
    protected int[] baD;
    protected int[] erc;
    protected byte tBk;
    protected fxQ[] tBl;

    public int d() {
        return this.o;
    }

    public int aeV() {
        return this.bIi;
    }

    public int cuw() {
        return this.eqU;
    }

    public short cux() {
        return this.eqV;
    }

    public short cuy() {
        return this.eqW;
    }

    public boolean cuz() {
        return this.eqX;
    }

    public boolean cuB() {
        return this.eqZ;
    }

    public boolean cuC() {
        return this.era;
    }

    public short cuD() {
        return this.erb;
    }

    public int[] ckm() {
        return this.baD;
    }

    public int[] cuE() {
        return this.erc;
    }

    public byte gqc() {
        return this.tBk;
    }

    public fxQ[] gqd() {
        return this.tBl;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.bIi = 0;
        this.eqU = 0;
        this.eqV = 0;
        this.eqW = 0;
        this.eqX = false;
        this.eqZ = false;
        this.era = false;
        this.erb = 0;
        this.baD = null;
        this.erc = null;
        this.tBk = 0;
        this.tBl = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.bIi = aqh_12.bGI();
        this.eqU = aqh_12.bGI();
        this.eqV = aqh_12.bGG();
        this.eqW = aqh_12.bGG();
        this.eqX = aqh_12.bxv();
        this.eqZ = aqh_12.bxv();
        this.era = aqh_12.bxv();
        this.erb = aqh_12.bGG();
        this.baD = aqh_12.bGM();
        this.erc = aqh_12.bGM();
        this.tBk = aqh_12.aTf();
        int n = aqh_12.bGI();
        this.tBl = new fxQ[n];
        for (int i = 0; i < n; ++i) {
            this.tBl[i] = new fxQ();
            this.tBl[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.ozy.d();
    }
}

