/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from agH
 */
public class agh_0 {
    protected static Logger oO = Logger.getLogger(agh_0.class);
    private int bUi;
    private float aPW;
    private float cut;
    private float cuu;
    private float cuv;
    private float cuw;
    private float cux;
    private float cuy;
    private float cuz;
    private static final int cuA = 1;
    private static final int cuB = 100;
    private static final int cuC = 50;
    private final agq_0 cuD = new agr_0(1, 1);
    private final agq_0 cuE = new agr_0(100, 50);
    private agi_0 cuF = agj_0.cuG;

    public void b(agj_0 agj_02) {
        this.cuF = agj_02;
    }

    public void cF(float f2) {
        this.cut = f2;
    }

    protected float bzg() {
        return this.cut;
    }

    public void setSpeed(float f2) {
        this.aPW = f2;
    }

    public void aS(float f2, float f3) {
        this.cuw = this.cuy = f2;
        this.cuu = this.cuy;
        this.cux = this.cuz = f3;
        this.cuv = this.cuz;
    }

    public void setX(int n) {
        this.cuw = this.cuy = (float)n;
        this.cuu = this.cuy;
    }

    public void setY(int n) {
        this.cux = this.cuz = (float)n;
        this.cuv = this.cuz;
    }

    public void aT(float f2, float f3) {
        this.cuu = f2;
        this.cuv = f3;
        this.bUi = 0;
    }

    public void aU(float f2, float f3) {
        this.cuw = f2;
        this.cux = f3;
        this.bUi = 0;
    }

    public float bzh() {
        return this.cuw;
    }

    public float bzi() {
        return this.cux;
    }

    public float bzj() {
        return this.cuy;
    }

    public float bzk() {
        return this.cuz;
    }

    public boolean b(int n, float f2, boolean bl) {
        this.cuD.setScale(f2);
        this.cuE.setScale(f2);
        return this.c(n, bl);
    }

    protected boolean c(int n, boolean bl) {
        acb_1 acb_12;
        float f2 = this.cuw - this.cuy;
        float f3 = this.cux - this.cuz;
        acb_1 acb_13 = acb_12 = bl ? this.cuD.aV(f2, f3) : this.cuE.aV(f2, f3);
        if (acb_12 == null) {
            this.cuu = this.cuy;
            this.cuv = this.cuz;
            return false;
        }
        float f4 = this.cuy;
        float f5 = this.cuz;
        this.bUi += n;
        float f6 = (float)this.bUi * this.aPW / 1000.0f;
        if (f6 > 1.0f) {
            this.cuy = this.cuw;
            this.cuz = this.cux;
        } else {
            float f7 = this.cuw - acb_12.bWv();
            float f8 = this.cux - acb_12.bWw();
            this.o(f7, f8, f6);
        }
        return !GC.c(f4, this.cuy, 1.0E-4f) || !GC.c(f5, this.cuz, 1.0E-4f);
    }

    private void o(float f2, float f3, float f4) {
        this.cuy = this.cuF.j(this.cuu, this.cuy, f2, f4);
        this.cuz = this.cuF.j(this.cuv, this.cuz, f3, f4);
    }
}

