/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicInteger;

/*
 * Renamed from ccA
 */
class cca_1
implements Runnable {
    private final AtomicInteger lPe;
    private final int lPf;

    cca_1(ccz_1 ccz_12, int n) {
        this.lPf = n;
        this.lPe = new AtomicInteger(0);
    }

    @Override
    public void run() {
        if (this.lPe.incrementAndGet() >= this.lPf) {
            ccz_1.etI();
        }
    }
}

