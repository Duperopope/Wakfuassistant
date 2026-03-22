/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aAU
 */
class aau_1
extends Thread
implements ayx_2 {
    aas_2 dxf;
    Runnable dxg;
    long dxh;
    int dxi;
    boolean dxj;
    boolean dxk;
    final /* synthetic */ aas_2 dxl;

    aau_1(aas_2 aas_22) {
        this.dxl = aas_22;
    }

    aau_1(aas_2 aas_22, aas_2 aas_23, Runnable runnable, long l, int n) {
        this.dxl = aas_22;
        this.dxf = aas_23;
        this.dxg = runnable;
        this.dxh = l;
        this.dxi = n;
        this.dxk = true;
    }

    @Override
    public void run() {
        if (this.dxi == -1) {
            while (this.dxk) {
                this.bUo();
            }
        } else {
            for (int i = 0; i < this.dxi; ++i) {
                this.bUo();
            }
        }
        this.dxf.a(this);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void bUo() {
        aau_1 aau_12 = this;
        synchronized (aau_12) {
            try {
                this.wait(this.dxh);
            }
            catch (InterruptedException interruptedException) {
                aas_2.dwZ.error((Object)"Exception levee", (Throwable)interruptedException);
            }
        }
        if (this.dxk) {
            this.dxg.run();
        }
    }

    @Override
    public void aVI() {
    }

    @Override
    public void aVH() {
        this.dxf = null;
        this.dxg = null;
        this.dxh = 0L;
        this.dxi = 0;
    }

    public void aZp() {
        if (this.dxj) {
            try {
                this.dxl.dxd.returnObject((Object)this);
            }
            catch (Exception exception) {
                aas_2.dwZ.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }
}

