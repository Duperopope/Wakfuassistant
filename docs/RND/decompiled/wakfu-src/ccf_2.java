/*
 * Decompiled with CFR 0.152.
 */
import java.time.Duration;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from cCF
 */
public class ccf_2
implements Runnable {
    public static final Duration mAO = Duration.ofMillis(250L);
    private final int mAP;
    private final Map<Integer, Runnable> mAQ = Collections.synchronizedMap(new HashMap());

    public ccf_2() {
        this(mAO);
    }

    public ccf_2(Duration duration) {
        this((int)duration.toMillis());
    }

    protected ccf_2(int n) {
        this.mAP = n;
    }

    public void a(int n, Runnable runnable) {
        this.mAQ.put(n, runnable);
        abg_2.bUP().h(this);
        abg_2.bUP().a((Runnable)this, this.mAP, 1);
    }

    public void LQ(int n) {
        this.mAQ.remove(n);
    }

    public void clear() {
        abg_2.bUP().h(this);
        this.mAQ.clear();
    }

    public void eJG() {
        abg_2.bUP().h(this);
        this.run();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        Map<Integer, Runnable> map = this.mAQ;
        synchronized (map) {
            for (Runnable runnable : this.mAQ.values()) {
                runnable.run();
            }
            this.mAQ.clear();
        }
    }
}

