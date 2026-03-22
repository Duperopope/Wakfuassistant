/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  org.jetbrains.annotations.NotNull
 */
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aEf
 */
public class aef_1 {
    private final ExecutorService dEX;

    public aef_1(String string) {
        this(string, -1);
    }

    public aef_1(String string, int n) {
        ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat(string + "-%d").build();
        this.dEX = n < 1 ? Executors.newCachedThreadPool(threadFactory) : (n == 1 ? Executors.newSingleThreadExecutor(threadFactory) : Executors.newFixedThreadPool(n, threadFactory));
    }

    public boolean hz(long l) {
        try {
            return this.dEX.awaitTermination(l, TimeUnit.MILLISECONDS);
        }
        catch (InterruptedException interruptedException) {
            return true;
        }
    }

    public void aKM() {
        this.dEX.shutdown();
    }

    public void bZf() {
        this.dEX.shutdownNow();
    }

    public Future<aei_1> a(@NotNull aei_1 aei_12) {
        return this.dEX.submit(new ael_2(aei_12));
    }

    public Future<aei_1> a(@NotNull aei_1 aei_12, @NotNull aej_1 aej_12) {
        aei_12.a(aej_12);
        return this.a(aei_12);
    }
}

