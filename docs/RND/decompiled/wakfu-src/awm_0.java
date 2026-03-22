/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aWM
 */
public class awm_0 {
    protected static Logger oO = Logger.getLogger(aVi.class);
    private static final awm_0 hvE = new awm_0();
    private final afz_1 hvF = new afz_1();

    public static awm_0 cXG() {
        return hvE;
    }

    public afw_2 h(aft_2 aft_22) {
        if (aft_22 == null) {
            return null;
        }
        return this.hvF.c(aft_22);
    }

    public void cbg() {
        this.hvF.cbg();
    }

    public void cXH() {
        this.hvF.cbd();
    }

    public afz_1 cXI() {
        return this.hvF;
    }

    public void clear() {
        this.hvF.clear();
    }
}

