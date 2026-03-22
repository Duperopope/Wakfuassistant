/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from asR
 */
public class asr_2 {
    public static final asr_2 dak = new asr_2(1.0f, 1.0f, 1.0f);
    public static final asr_2 dal = new asr_2(0.0f, 0.0f, 0.0f);
    protected float axp;
    protected float axq;
    protected float axr;
    protected float caG;
    protected float caH;
    protected float caI;
    protected int bUi;
    protected int dam;

    public asr_2(asr_2 asr_22) {
        this(asr_22.axp, asr_22.axq, asr_22.axr);
    }

    public asr_2(float f2, float f3, float f4) {
        this.caG = this.axp = f2;
        this.caH = this.axq = f3;
        this.caI = this.axr = f4;
        this.dam = 0;
        this.bUi = 0;
    }

    public float aIU() {
        return this.axp;
    }

    public float aIV() {
        return this.axq;
    }

    public float aIW() {
        return this.axr;
    }

    public void a(float f2, float f3, float f4, int n) {
        this.caG = f2;
        this.caH = f3;
        this.caI = f4;
        this.dam = n;
        this.bUi = 0;
    }

    public void m(float f2, float f3, float f4) {
        this.axp = this.caG = f2;
        this.axq = this.caH = f3;
        this.axr = this.caI = f4;
        this.dam = 0;
        this.bUi = 0;
    }

    public void qF(int n) {
        if (this.dam == 0) {
            return;
        }
        this.bUi += n;
        if (this.bUi < this.dam) {
            float f2 = (float)this.bUi / (float)this.dam;
            this.axp = GC.a(this.axp, this.caG, f2);
            this.axq = GC.a(this.axq, this.caH, f2);
            this.axr = GC.a(this.axr, this.caI, f2);
        } else {
            this.axp = this.caG;
            this.axq = this.caH;
            this.axr = this.caI;
            this.dam = 0;
        }
    }

    public boolean bzm() {
        return this.dam != 0;
    }

    public String toString() {
        return "{" + this.axp + " ; " + this.axq + " ; " + this.axr + "}";
    }
}

