/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from beu
 */
final class beu_2 {
    private static final int hNw = 3000;
    final bew_2 hNx;
    private Runnable gvp;
    private boolean hNy;

    beu_2(bew_2 bew_22) {
        this.hNx = bew_22;
    }

    public void dex() {
        this.hNy = true;
        this.gvp = new bev_2(this);
        abg_2.bUP().a(this.gvp, 3000L);
    }

    public void dey() {
        abg_2.bUP().h(this.gvp);
        this.hNy = false;
    }

    public boolean bhl() {
        return this.hNy;
    }
}

