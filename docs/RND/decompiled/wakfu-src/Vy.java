/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.apache.log4j.Logger;

public class Vy {
    private static final Logger bIM = Logger.getLogger(Vy.class);
    private final ExecutorService bIN;
    final aaq_1<Future> bIO;

    public Vy(String string) {
        this(string, 25);
    }

    public Vy(String string, int n) {
        this.bIN = Executors.newFixedThreadPool(1, new Vz(this, string));
        this.bIO = new aaq_1(n);
    }

    public void a(long l, Runnable runnable) {
        Future<?> future = this.bIN.submit(new va_0(this, runnable, l));
        this.bIO.a(l, future);
    }

    public final void fv(long l) {
        Future future = this.bIO.hd(l);
        if (future == null) {
            return;
        }
        while (!future.isDone()) {
            try {
                Thread.sleep(3L);
            }
            catch (InterruptedException interruptedException) {
                bIM.error((Object)"", (Throwable)interruptedException);
            }
        }
    }

    public final void fw(long l) {
        Future future = this.bIO.hc(l);
        if (future != null) {
            future.cancel(true);
        }
    }

    public final void bkv() {
        for (int i = 0; i < this.bIO.aVo(); ++i) {
            Future future = this.bIO.vU(i);
            if (future == null) continue;
            future.cancel(true);
        }
        this.bIO.clear();
    }
}

