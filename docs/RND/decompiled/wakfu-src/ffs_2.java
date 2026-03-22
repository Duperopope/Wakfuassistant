/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fFs
 */
public class ffs_2 {
    private static final Logger upG = Logger.getLogger(ffs_2.class);
    public static final int upH = 20;
    private float upI = Float.NaN;
    private float upJ = Float.NaN;
    private float upK = Float.NaN;
    private float upL = Float.NaN;
    private float upM = Float.NaN;
    private float upN = Float.NaN;
    private int upO = 1000;
    private float aXn;

    public void aaS(int n) {
        this.upO = n;
    }

    public void setZoom(float f2) {
        this.aXn = f2;
    }

    public float getIsoCenterX() {
        return this.upI;
    }

    public float getIsoCenterY() {
        return this.upJ;
    }

    public float getIsoCenterZ() {
        return this.upK;
    }

    public void setIsoCenterX(float f2) {
        if (Float.isNaN(this.upL)) {
            this.upI = f2;
            this.upL = f2;
        } else {
            this.upL = f2;
        }
        assert (!Float.isNaN(this.upI));
    }

    public void setIsoCenterY(float f2) {
        if (Float.isNaN(this.upM)) {
            this.upJ = f2;
            this.upM = f2;
        } else {
            this.upM = f2;
        }
        assert (!Float.isNaN(this.upJ));
    }

    public void setIsoCenterZ(float f2) {
        if (Float.isNaN(this.upN)) {
            this.upK = f2;
            this.upN = f2;
        } else {
            this.upN = f2;
        }
        assert (!Float.isNaN(this.upK));
    }

    public void reset() {
        this.upI = 0.0f;
        this.upJ = 0.0f;
        this.upK = 0.0f;
    }

    public float j(afV afV2) {
        return afV2.aM(this.upI, this.upJ);
    }

    public float k(afV afV2) {
        return afV2.j(this.upI, this.upJ, this.upK);
    }

    public int l(afV afV2) {
        return (int)afV2.aM(this.upL, this.upM);
    }

    public int m(afV afV2) {
        return (int)afV2.aN(this.upL, this.upM);
    }

    public acb_1 b(afV afV2, int n, int n2) {
        float f2 = afV2.aO(n, n2) + this.upI;
        float f3 = afV2.aP(n, n2) + this.upJ;
        return new acb_1(f2, f3);
    }

    public acb_1 a(afV afV2, int n, int n2, boolean bl) {
        float f2 = (float)n - (bl ? this.upL : this.upI);
        float f3 = (float)n2 - (bl ? this.upM : this.upJ);
        float f4 = afV2.aM(f2, f3);
        float f5 = afV2.aN(f2, f3);
        return new acb_1(f4, f5);
    }

    public acb_1 n(afV afV2) {
        float f2 = this.upI;
        float f3 = this.upJ;
        float f4 = this.upK;
        this.oL(true);
        float f5 = this.upI - f2;
        float f6 = this.upJ - f3;
        float f7 = afV2.aM(f5, f6);
        float f8 = afV2.j(f5, f6, this.upK - f4);
        return new acb_1(f7, f8);
    }

    public acb_1 a(afV afV2, boolean bl) {
        this.oL(bl);
        float f2 = this.j(afV2);
        float f3 = this.k(afV2);
        return new acb_1(f2, f3);
    }

    public float getIsoValue(float f2, float f3, boolean bl) {
        return bl ? f3 : this.bI(f2, f3);
    }

    private void oL(boolean bl) {
        this.upI = this.getIsoValue(this.upI, this.upL, bl);
        this.upJ = this.getIsoValue(this.upJ, this.upM, bl);
        this.upK = this.getIsoValue(this.upK, this.upN, bl);
    }

    private float bI(float f2, float f3) {
        assert (!Float.isNaN(f2)) : "position is NaN";
        assert (!Float.isNaN(f3)) : "BadMoFo !!!";
        if (f2 == f3) {
            return f2;
        }
        float f4 = f3 - f2;
        float f5 = Math.abs(f4);
        if (f5 > (float)this.upO) {
            return f3;
        }
        if (f5 > this.aXn) {
            return f2 + f4 / 20.0f;
        }
        return f2;
    }

    public boolean isInitialized() {
        return !Float.isNaN(this.upI) && !Float.isNaN(this.upJ) && !Float.isNaN(this.upK) && !Float.isNaN(this.upL) && !Float.isNaN(this.upM) && !Float.isNaN(this.upN);
    }
}

