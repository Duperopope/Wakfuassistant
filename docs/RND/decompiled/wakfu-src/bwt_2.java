/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bWt
 */
class bwt_2 {
    protected final int ltp;
    protected final byte ltq;
    protected final String ltr;
    protected final int lts;
    protected final eyp ltt;
    protected final byte ltu;

    public bwt_2(eyp eyp2, int n, String string, byte by, byte by2, int n2) {
        this.ltt = eyp2;
        this.lts = n;
        this.ltr = string;
        this.ltu = by;
        this.ltq = by2;
        this.ltp = n2;
    }

    public eyp doV() {
        return this.ltt;
    }

    public int getHeight() {
        return this.lts;
    }

    public String getName() {
        return this.ltr;
    }

    public byte aWO() {
        return this.ltu;
    }

    public boolean egX() {
        return this.ltq == 1;
    }

    public boolean eox() {
        return this.ltq == 2;
    }

    public boolean dtZ() {
        return this.ltq == 0;
    }

    public boolean aXd() {
        return this.ltq == 5;
    }

    public int aHp() {
        return this.ltp;
    }
}

