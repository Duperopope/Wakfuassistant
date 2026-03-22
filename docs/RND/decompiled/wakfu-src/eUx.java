/*
 * Decompiled with CFR 0.152.
 */
class eUx {
    private static final int rvW = 2;
    private static final int rvX = 6;
    private final int rvY;
    private final int rvZ = 2;
    private int rwa = 6;
    private int rwb = 6;
    private Long rwc;
    private Long rwd;
    private Long rwe;
    private Long rwf;
    private Long rwg;
    private Long rvn;
    private boolean rwh = true;
    private boolean rwi = true;
    private boolean rwj = false;
    private boolean rwk = false;
    private boolean rwl = true;
    private boolean rwm = true;
    private boolean rvu = true;
    private boolean rvv = false;
    private eVb rvw = new eVa();
    private boolean rvx = false;
    private boolean rvy = false;
    private boolean rvz = false;
    private boolean rvS = false;
    private boolean rvA = true;
    private eui_0 rvB = eui_0.rxS;
    private boolean rvC = true;
    private boolean rvD = false;
    private boolean rvE = false;
    private boolean rwn = true;
    private boolean rvG = false;
    private boolean rvH = true;
    private boolean poZ = false;
    private boolean rvJ = false;
    private boolean irR = true;
    private boolean rvL = true;
    private boolean rwo = false;
    private boolean rvN = false;
    private eun_1 rvO = eun_1.ryb;
    private boolean rvF = false;
    private boolean rvP = false;
    private boolean rvQ = true;
    private boolean rvR = false;
    private boolean rvT = false;
    private boolean rvU = false;

    eUx(int n) {
        this.rvY = n;
    }

    public int d() {
        return this.rvY;
    }

    public int fLz() {
        return 2;
    }

    public int fLA() {
        return this.rwa;
    }

    public int fLB() {
        return this.rwb;
    }

    public Long fLC() {
        return this.rwc;
    }

    public Long fLD() {
        return this.rwd;
    }

    public Long fLE() {
        return this.rwe;
    }

    public Long fLF() {
        return this.rwf;
    }

    public Long fLG() {
        return this.rwg;
    }

    public Long fKS() {
        return this.rvn;
    }

    public boolean fLH() {
        return this.rwh;
    }

    public boolean fLI() {
        return this.rwi;
    }

    public boolean fLJ() {
        return this.rwj;
    }

    public boolean fLK() {
        return this.rwk;
    }

    public boolean fLL() {
        return this.rwl;
    }

    public boolean fLM() {
        return this.rwm;
    }

    public boolean fLN() {
        return this.rvu;
    }

    public boolean fKZ() {
        return this.rvv;
    }

    public boolean fLb() {
        return this.rvx;
    }

    public boolean fLc() {
        return this.rvy;
    }

    public eVb fLa() {
        return this.rvw;
    }

    public boolean fLd() {
        return this.rvz;
    }

    public boolean fLe() {
        return this.rvA;
    }

    public eui_0 fLg() {
        return this.rvB;
    }

    public boolean fLO() {
        return this.rvC;
    }

    boolean fLi() {
        return this.rvD;
    }

    boolean fLj() {
        return this.rvE;
    }

    public boolean fLP() {
        return this.rwn;
    }

    public boolean fLl() {
        return this.rvG;
    }

    public boolean fLm() {
        return this.rvH;
    }

    public boolean fLn() {
        return this.rvJ;
    }

    public boolean fLo() {
        return this.rvL;
    }

    public boolean fLq() {
        return this.rwo;
    }

    public boolean fLr() {
        return this.rvN;
    }

    public boolean fLp() {
        return this.rvQ;
    }

    public eun_1 fLs() {
        return this.rvO;
    }

    public boolean fLv() {
        return this.rvS;
    }

    public eUx fLQ() {
        this.rvu = false;
        return this;
    }

    public eUx SA(int n) {
        this.rwa = n;
        return this;
    }

    public eUx SB(int n) {
        this.rwb = n;
        return this;
    }

    public eUx qL(long l) {
        this.rwc = l;
        return this;
    }

    public eUx qM(long l) {
        this.rwd = l;
        if (this.rvn != null && this.rwd > this.rvn) {
            this.rvn = this.rwd;
        }
        return this;
    }

    public eUx qN(long l) {
        this.rwe = l;
        if (this.rvn != null && this.rwe > this.rvn) {
            this.rvn = this.rwe;
        }
        return this;
    }

    public eUx qO(long l) {
        this.rwf = l;
        if (this.rvn != null && this.rwf > this.rvn) {
            this.rvn = this.rwf;
        }
        return this;
    }

    public eUx qP(long l) {
        this.rwg = l;
        return this;
    }

    public eUx qQ(long l) {
        if (!(this.rwd != null && this.rvn < this.rwd || this.rwe != null && this.rvn < this.rwe || this.rwf != null && this.rvn < this.rwf)) {
            this.rvn = l;
        }
        return this;
    }

    public eUx fLR() {
        this.rwh = false;
        this.rwi = false;
        return this;
    }

    public eUx fLS() {
        this.rwh = false;
        return this;
    }

    public eUx fLT() {
        this.rwj = true;
        return this;
    }

    public eUx fLU() {
        this.rwk = true;
        return this;
    }

    public eUx fLV() {
        this.rwl = false;
        return this;
    }

    public eUx fLW() {
        this.rwm = false;
        return this;
    }

    public eUx fLX() {
        this.rvv = true;
        return this;
    }

    public eUx a(eVb eVb2) {
        this.rvw = eVb2;
        return this;
    }

    public eUx fLY() {
        this.rvx = true;
        return this;
    }

    public eUx fLZ() {
        this.rvy = true;
        return this;
    }

    public eUx fMa() {
        this.rvz = true;
        return this;
    }

    public eUx fMb() {
        this.rvA = false;
        return this;
    }

    public eUx a(eui_0 eui_02) {
        this.rvB = eui_02;
        return this;
    }

    public eUx fMc() {
        this.rvC = false;
        return this;
    }

    public eUx fMd() {
        this.rvD = true;
        return this;
    }

    public eUx fMe() {
        this.rvE = true;
        return this;
    }

    public eUx fMf() {
        this.rwn = false;
        return this;
    }

    public eUx fMg() {
        this.rvG = true;
        return this;
    }

    public eUx fMh() {
        this.rvH = false;
        return this;
    }

    public eUx fMi() {
        this.poZ = true;
        return this;
    }

    public eUx fMj() {
        this.rvJ = true;
        return this;
    }

    public eUx fMk() {
        this.irR = false;
        return this;
    }

    public eUx fMl() {
        this.rvL = false;
        return this;
    }

    public eUx fMm() {
        this.rvQ = false;
        return this;
    }

    public eUx fMn() {
        this.rwo = true;
        return this;
    }

    public eUx fMo() {
        this.rvN = true;
        return this;
    }

    public eUx a(eun_1 eun_12) {
        this.rvO = eun_12;
        return this;
    }

    public eUx fMp() {
        this.rvF = true;
        return this;
    }

    public eUx fMq() {
        this.rvP = true;
        return this;
    }

    public eUx fMr() {
        this.rvR = true;
        return this;
    }

    public eUx fMs() {
        this.rvS = true;
        return this;
    }

    public eUx fMt() {
        this.rvU = true;
        return this;
    }

    public boolean fmn() {
        return this.poZ;
    }

    public boolean fMu() {
        return this.irR;
    }

    public boolean fLk() {
        return this.rvF;
    }

    public boolean fLt() {
        return this.rvP;
    }

    public boolean fLu() {
        return this.rvR;
    }

    public eUx mG(boolean bl) {
        this.rvT = bl;
        return this;
    }

    public boolean fLx() {
        return this.rvU;
    }

    public boolean fLw() {
        return this.rvT;
    }
}

