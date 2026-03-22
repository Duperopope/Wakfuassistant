/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public abstract class agb {
    private static final Logger csL = Logger.getLogger(agb.class);
    protected final afV csM;
    private final aci_1 csN = new aci_1();
    private boolean csO = true;
    private float csP = 1.0f;
    private int csQ;
    private int bVH;
    private aab_2<age> csR;

    protected agb(afV afV2) {
        this.csM = afV2;
        this.byH();
    }

    public final float byB() {
        return this.csP * this.getZoomFactor();
    }

    public final float byC() {
        return this.csP;
    }

    public final int byD() {
        return this.csQ;
    }

    public final int byE() {
        return this.bVH;
    }

    public final boolean m(int n, int n2, int n3, int n4) {
        return n4 >= this.csN.cuQ && n2 <= this.csN.cuR && n >= this.csN.cuS && n3 <= this.csN.cuT;
    }

    public final void bD(int n, int n2) {
        this.csQ = n;
        this.bVH = n2;
        float f2 = (float)n / 1024.0f;
        float f3 = (float)n2 / 768.0f;
        this.csP = Math.max(1.0f, Math.min(f2, f3));
        this.byH();
    }

    protected final void byF() {
        this.a(this.bsh(), this.bsi(), this.csN);
        this.csO = false;
        this.byI();
    }

    public final void a(float f2, float f3, aci_1 aci_12) {
        float f4 = Math.abs(1.0f / (2.0f * this.byB()));
        float f5 = (float)this.byD() * f4;
        float f6 = (float)this.byE() * f4;
        aci_12.cuQ = GC.B(f2 - f5);
        aci_12.cuR = GC.C(f2 + f5);
        aci_12.cuS = GC.B(f3 - f6);
        aci_12.cuT = GC.C(f3 + f6);
    }

    public final boolean byG() {
        return this.csO;
    }

    protected final void byH() {
        this.csO = true;
    }

    public final void a(age age2) {
        if (this.csR == null) {
            this.csR = new aab_2<age>(new agc(this));
        }
        this.csR.aa(age2);
    }

    public final void b(age age2) {
        this.csR.ab(age2);
    }

    private void byI() {
        if (this.csR != null) {
            this.csR.bUe();
        }
    }

    public final aci_1 byJ() {
        return this.csN;
    }

    public final int byK() {
        return GC.A(this.bsh());
    }

    public final int byL() {
        return GC.A(this.bsi());
    }

    public abstract float bsf();

    public abstract float bsg();

    public abstract float bsh();

    public abstract float bsi();

    public abstract float aRX();

    public abstract float getZoomFactor();

    public abstract void qy(int var1);

    public afW byM() {
        return new agd(this);
    }
}

