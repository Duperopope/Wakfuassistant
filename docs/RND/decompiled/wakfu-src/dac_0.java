/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from dac
 */
public class dac_0
extends dae_0 {
    private static final Logger obL = Logger.getLogger(dac_0.class);
    private int lrC;
    private bea_0 mZr;

    public int eCe() {
        return this.lrC;
    }

    public void NM(int n) {
        this.lrC = n;
    }

    public bea_0 getMerchantItem() {
        return this.mZr;
    }

    public void setMerchantItem(bea_0 bea_02) {
        this.mZr = bea_02;
    }
}

