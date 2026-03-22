/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fLt
 */
public class flt_2
extends fiq_1 {
    private static Logger oO = Logger.getLogger(flt_2.class);
    private boolean uIq = false;

    public flt_2(fes_2 fes_22, boolean bl) {
        this.uBe = fes_22;
        this.uIq = bl;
    }

    public boolean isFull() {
        return this.uIq;
    }

    @Override
    public fzq_0 gBy() {
        return fzq_0.tJu;
    }
}

