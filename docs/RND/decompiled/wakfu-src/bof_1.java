/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bOF
 */
public final class bof_1 {
    protected static final Logger kMA = Logger.getLogger(bof_1.class);
    private float kMB;
    private float kMC;
    private float bMk;
    private float[] kMD;
    private float kME;
    private fsc kMF = fsc.tbe;
    private fsa kMG = fsa.taT;
    private float bMx;
    private bzw_1 kMH = bzw_1.lDj;
    private boolean kMI = true;
    private wg_0 bMF = wg_0.bMG;
    private boolean kMJ = true;
    private fsc kMK = fsc.tbe;
    private bzw_1 kML = bzw_1.lDj;
    private float kMM;
    private float kMN;

    public float blu() {
        return this.bMk;
    }

    public void eE(float f2) {
        this.bMk = f2;
    }

    public float ehy() {
        return this.kMB;
    }

    public float ehz() {
        return this.kMC;
    }

    public float ehA() {
        return this.kMD != null ? this.kMD[0] : 0.0f;
    }

    public float ehB() {
        return this.kMD != null ? this.kMD[1] : 0.0f;
    }

    public float ehC() {
        return this.kME;
    }

    public float blD() {
        return this.bMx;
    }

    public fsc ehD() {
        return this.kMF;
    }

    public fsa ehE() {
        return this.kMG;
    }

    public bzw_1 ehF() {
        return this.kMH;
    }

    public static bzw_1 eF(float f2) {
        if (f2 < 0.33f) {
            return bzw_1.lDj;
        }
        if (f2 < 0.66f) {
            return bzw_1.lDk;
        }
        return bzw_1.lDl;
    }

    public void a(float f2, float f3, float f4, float f5, float[] fArray, wg_0 wg_02, float f6, float f7) {
        this.bMF = wg_02;
        fsc fsc2 = fsd.a(wg_02, f2 + f5, f6 + f7);
        if (fsc2 != this.kMF) {
            this.kMI = true;
            this.kMF = fsc2;
        }
        this.kMG = fsa.c(wg_02);
        this.bMk = f2;
        this.kMB = f3;
        this.kMC = f4;
        this.kMD = fArray;
        this.kME = f5;
        this.bMx = f6;
        bzw_1 bzw_12 = bof_1.eF(f6);
        if (this.kMH != bzw_12) {
            this.kMH = bzw_12;
            this.kMI = true;
        }
    }

    public void a(float f2, float f3, float f4, float f5, float f6, wg_0 wg_02) {
        bzw_1 bzw_12;
        this.kMM = f2 + f4;
        this.kMN = f3 + f4;
        float f7 = f5 + f6;
        fsc fsc2 = fsd.a(wg_02, (this.kMM + this.kMN) * 0.5f, f7);
        if (fsc2 != this.kMK) {
            this.kMJ = true;
            this.kMK = fsc2;
        }
        if ((bzw_12 = bof_1.eF(f7)) != this.kML) {
            this.kMJ = true;
            this.kML = bzw_12;
        }
    }

    public void g(bJr bJr2) {
        boh_1.ehH().b(this);
        bzq_1.lCJ.d(this.kMF);
        bzq_1.lCJ.eP(this.bMx);
        if (this.kMJ) {
            this.kMJ = false;
            bJT bJT2 = (bJT)bjy_0.kmP.ebc();
            bJT2.f(bJr2);
            fpm.sNJ.b(bJT2);
        }
        if (this.kMI) {
            this.kMI = false;
        }
        kMA.debug((Object)("****** Mise \u00e0 jour des vues relatives \u00e0 la m\u00e9t\u00e9o : " + this.toString()));
    }

    public wg_0 blE() {
        return this.bMF;
    }

    public String toString() {
        return "Weather {\n\ttemperature : " + this.bMk + "\u00b0\n\ttendance : " + this.kMF.toString() + "\n\train : d=" + String.valueOf((Object)this.bMF) + "\twind : " + this.bMx + " / 1.0\n}\n";
    }
}

