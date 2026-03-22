/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fLE
 */
public class fle_2
extends fiq_1 {
    private static Logger oO = Logger.getLogger(fle_2.class);
    private boolean ukK;
    private fhv_1 uIG;

    public fle_2(fes_2 fes_22, boolean bl) {
        this.uBe = fes_22;
        this.ukK = bl;
    }

    public void setFocused(boolean bl) {
        this.ukK = bl;
    }

    public boolean gDO() {
        return this.ukK;
    }

    public fhv_1 gDP() {
        return this.uIG;
    }

    @Override
    public fzq_0 gBy() {
        return fzq_0.tJA;
    }
}

