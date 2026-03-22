/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bZo
 */
abstract class bzo_1 {
    protected static final Logger lCG = Logger.getLogger(bzo_1.class);
    protected boolean hNy = false;
    protected boolean bmg = true;
    protected final bzb_2 lCH = new bzb_2(0.0f);
    private bzp_1 lCI;

    bzo_1() {
    }

    public void a(bzp_1 bzp_12) {
        this.lCI = bzp_12;
    }

    public boolean isVisible() {
        return this.bmg;
    }

    public void setVisible(boolean bl) {
        this.bmg = bl;
    }

    boolean bhl() {
        return this.hNy;
    }

    void bK(float f2) {
        this.lCH.cG(f2);
    }

    float bnY() {
        return this.lCH.epJ();
    }

    void a(float f2, int n, long l) {
        this.lCH.a(f2, n, l);
    }

    void mv(long l) {
        this.lCH.hD(l);
    }

    void i(afV afV2) {
        if (this.lCI != null && !this.hNy) {
            this.lCI.cby();
        }
    }

    void bhk() {
        if (this.lCI != null && this.hNy) {
            this.lCI.cbz();
        }
    }

    abstract void b(afV var1, float var2, float var3);
}

