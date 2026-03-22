/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fLW
 */
public class flw_2
extends fiq_1 {
    private static Logger oO = Logger.getLogger(flw_2.class);
    private float awY = 0.0f;

    public flw_2(fes_2 fes_22) {
        this.uBe = fes_22;
    }

    public void setValue(float f2) {
        this.awY = f2;
    }

    public float getValue() {
        return this.awY;
    }

    @Override
    public fzq_0 gBy() {
        return fzq_0.tKa;
    }
}

