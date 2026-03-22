/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bwT
 */
public final class bwt_0 {
    private final anp_2 jAm;
    private final boolean jAn;
    private boolean jAo;

    public bwt_0(anp_2 anp_22, boolean bl) {
        this.jAm = anp_22;
        this.jAn = bl;
    }

    public anp_2 dMW() {
        return this.jAm;
    }

    public boolean dMX() {
        return this.jAn;
    }

    public boolean dMY() {
        return this.jAo;
    }

    public void hp(boolean bl) {
        this.jAo = bl;
    }

    public int bDU() {
        if (this.jAm == null) {
            return 0;
        }
        return this.jAm.bDU();
    }
}

