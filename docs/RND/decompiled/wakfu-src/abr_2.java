/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aBr
 */
public class abr_2 {
    private final int dyJ;
    private int dyK;
    private boolean cHn;
    private final Runnable dyL;

    public abr_2(int n, Runnable runnable) {
        this.dyJ = n;
        this.dyK = 0;
        this.dyL = runnable;
        this.cHn = true;
    }

    public synchronized void bVb() {
        if (!this.cHn) {
            return;
        }
        if (this.bVh() > 0) {
            ++this.dyK;
            if (this.bVh() == 0) {
                this.bVi();
            }
        } else {
            throw new RuntimeException("Barrier already open");
        }
    }

    public synchronized void bVc() {
        if (!this.cHn) {
            return;
        }
        if (this.bVh() <= 0) {
            throw new RuntimeException("Barrier already open");
        }
        this.dyK = this.dyJ;
        this.bVi();
    }

    public void bVd() {
        this.cHn = true;
    }

    public synchronized void aOX() {
        this.cHn = false;
    }

    public synchronized boolean isEnabled() {
        return this.cHn;
    }

    public synchronized boolean bVe() {
        if (this.cHn) {
            return this.dyK == this.dyJ;
        }
        return true;
    }

    public synchronized void reset() {
        this.dyK = 0;
    }

    public synchronized int bVf() {
        if (this.cHn) {
            return this.dyK;
        }
        return this.dyJ;
    }

    public synchronized int bVg() {
        return this.dyJ;
    }

    public synchronized int bVh() {
        if (this.cHn) {
            return this.dyJ - this.dyK;
        }
        return 0;
    }

    private void bVi() {
        if (this.dyL != null) {
            this.dyL.run();
        }
    }
}

