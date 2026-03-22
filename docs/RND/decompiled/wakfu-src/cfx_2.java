/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cFx
 */
public class cfx_2
implements Runnable {
    public static final cfx_2 mWj = new cfx_2();
    public static final int mWk = 250;
    private dae_0 mWl;
    private boolean btq;
    private long dfi;
    private boolean mWm;
    private static final int mWn = 225;
    private static final int mWo = 350;
    private static final int mWp = 3500;
    private fad_1 mWq;
    private final fis_1 mWr = new cfy_2(this);

    public void a(dae_0 dae_02, fad_1 fad_12) {
        this.dfi = System.currentTimeMillis();
        this.mWm = false;
        this.mWl = dae_02;
        this.mWq = fad_12;
        abg_2.bUP().a((Runnable)this, 250L);
        fbj_1.getInstance().a(fzq_0.tJT, this.mWr, true);
        this.btq = true;
        this.run();
    }

    @Override
    public void run() {
        if (!this.btq) {
            if (!this.mWm) {
                this.eKx();
            }
            abg_2.bUP().h(this);
            return;
        }
        long l = System.currentTimeMillis() - this.dfi;
        if (l < 350L) {
            return;
        }
        this.eKx();
        int n = (int)((float)l / 3500.0f * 225.0f);
        if (n > 0 && n <= 225) {
            abg_2.bUP().h(this);
            abg_2.bUP().a((Runnable)this, (long)(250 - n));
        }
    }

    private void eKx() {
        aaw_1.bUq().h(this.mWl);
        this.mWm = true;
    }

    public boolean bhl() {
        return this.btq;
    }

    public void bhk() {
        if (!this.mWm) {
            this.eKx();
        }
        this.btq = false;
    }

    public final void eKy() {
        if (this.mWq != null && this.mWq.getAppearance() != null) {
            this.mWq.getAppearance().gqS();
        }
        abg_2.bUP().h(this);
        this.bhk();
        fbj_1.getInstance().b(fzq_0.tJT, this.mWr, true);
    }
}

