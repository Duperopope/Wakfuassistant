/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fLV
 */
public class flv_2
extends fiq_1 {
    private static Logger oO = Logger.getLogger(flv_2.class);
    private boolean bWn = false;

    public flv_2(fhv_1 fhv_12, boolean bl) {
        this.bWn = bl;
        this.uBe = fhv_12;
    }

    public boolean bqr() {
        return this.bWn;
    }

    public void setSelected(boolean bl) {
        this.bWn = bl;
    }

    @Override
    public fzq_0 gBy() {
        return fzq_0.tJZ;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.bWn = false;
    }

    @Override
    public void aVI() {
        super.aVI();
    }
}

