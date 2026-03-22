/*
 * Decompiled with CFR 0.152.
 */
public class fvy
implements aqz_2 {
    protected int o;
    protected short aWL;
    protected short ejA;
    protected long aHT;
    protected long[] asV;
    protected boolean ejB;
    protected boolean ejC;
    protected boolean ejD;
    protected int[] ejE;
    protected int ejF;
    protected String ejG;
    protected short ejH;
    protected int ejI;

    public int d() {
        return this.o;
    }

    public short aVf() {
        return this.aWL;
    }

    public short cmS() {
        return this.ejA;
    }

    public long aqZ() {
        return this.aHT;
    }

    public long[] aGN() {
        return this.asV;
    }

    public boolean cmT() {
        return this.ejB;
    }

    public boolean cmU() {
        return this.ejC;
    }

    public boolean cmV() {
        return this.ejD;
    }

    public int[] cmW() {
        return this.ejE;
    }

    public int cmX() {
        return this.ejF;
    }

    public String cmY() {
        return this.ejG;
    }

    public short cmZ() {
        return this.ejH;
    }

    public int ayQ() {
        return this.ejI;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.aWL = 0;
        this.ejA = 0;
        this.aHT = 0L;
        this.asV = null;
        this.ejB = false;
        this.ejC = false;
        this.ejD = false;
        this.ejE = null;
        this.ejF = 0;
        this.ejG = null;
        this.ejH = 0;
        this.ejI = 0;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.aWL = aqh_12.bGG();
        this.ejA = aqh_12.bGG();
        this.aHT = aqh_12.bGK();
        this.asV = aqh_12.bxz();
        this.ejB = aqh_12.bxv();
        this.ejC = aqh_12.bxv();
        this.ejD = aqh_12.bxv();
        this.ejE = aqh_12.bGM();
        this.ejF = aqh_12.bGI();
        this.ejG = aqh_12.bGL().intern();
        this.ejH = aqh_12.bGG();
        this.ejI = aqh_12.bGI();
    }

    @Override
    public final int bGA() {
        return ewj_2.oAD.d();
    }
}

