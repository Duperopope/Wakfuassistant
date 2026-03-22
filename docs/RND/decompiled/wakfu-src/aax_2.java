/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.TimeUnit;

/*
 * Renamed from aAX
 */
class aax_2
implements Runnable {
    private final Runnable dxt;
    final /* synthetic */ aaw_1 dxu;

    aax_2(aaw_1 aaw_12, Runnable runnable) {
        this.dxu = aaw_12;
        this.dxt = runnable;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        aaw_1.dxm.info((Object)"Worker running");
        this.dxu.cL(true);
        while (this.dxu.bhl()) {
            this.dxt.run();
            long l = abg_2.bUP().bUR();
            if (l <= 0L || !this.dxu.dxp.tryLock()) continue;
            try {
                this.dxu.dxq.await(l, TimeUnit.MILLISECONDS);
            }
            catch (InterruptedException interruptedException) {
                aaw_1.dxm.error((Object)"Worker interrupted", (Throwable)interruptedException);
            }
            finally {
                this.dxu.dxp.unlock();
            }
        }
        aaw_1.dxm.info((Object)"Worker stopped");
        this.dxu.dxr = null;
    }
}

