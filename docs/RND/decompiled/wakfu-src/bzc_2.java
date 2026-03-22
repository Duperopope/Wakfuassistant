/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bZC
 */
public class bzc_2
extends asn_1 {
    private static final Logger lDC = Logger.getLogger(bzc_2.class);
    private aag_0 ctw;

    private static String cgO() {
        try {
            return auc_0.cVq().bS("shadersPath");
        }
        catch (fu_0 fu_02) {
            lDC.error((Object)"", (Throwable)fu_02);
            return "";
        }
    }

    public bzc_2() {
        super(bzc_2.cgO() + "rain.cgfx", "rain0", new asl_1(new ase_1("gStrength", asf_1.cZr), new ase_1("threshold", asf_1.cZr), new ase_1("camera", asf_1.cZt), new ase_1("high", asf_1.cZs), new ase_1("low", asf_1.cZs), new ase_1("highlight", asf_1.cZr)));
    }

    public void eN(float f2) {
        this.cZG.c("highlight", f2);
    }

    public void d(aag_0 aag_02) {
        this.ctw = aag_02;
    }

    public void bK(float f2) {
        this.cZG.c("gStrength", f2);
    }

    public void eQ(float f2) {
        this.cZG.c("threshold", f2);
    }

    @Override
    public void qF(int n) {
        float f2 = (float)this.cwf / 1000.0f;
        float f3 = 0.1f;
        float f4 = 0.01f;
        float f5 = this.ctw.bsf();
        float f6 = this.ctw.bsg();
        float f7 = (float)Math.sin(f2 * 0.1f);
        float f8 = (float)Math.cos(f2 * 0.1f);
        float f9 = (float)Math.sin(f2 * 0.01f);
        float f10 = (float)Math.cos(f2 * 0.01f);
        this.cZG.a("low", f9, f10);
        this.cZG.a("high", f7, f8);
        this.cZG.a("camera", f5, f6, this.ctw.getZoomFactor());
        super.qF(n);
    }
}

