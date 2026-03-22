/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.micrometer.core.instrument.MeterRegistry
 *  io.micrometer.core.instrument.Metrics
 *  io.micrometer.core.instrument.Tags
 *  io.micrometer.core.instrument.binder.jvm.ExecutorServiceMetrics
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Unmodifiable
 */
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Metrics;
import io.micrometer.core.instrument.Tags;
import io.micrometer.core.instrument.binder.jvm.ExecutorServiceMetrics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from Fn
 */
public class fn_0<K> {
    private final ReentrantLock aAV = new ReentrantLock();
    private final Map<Integer, ExecutorService> aAW = new HashMap<Integer, ExecutorService>();
    private int aAX;
    private final ThreadFactory aAY;
    private String aAZ = "";
    private final HashMap<ExecutorService, AtomicInteger> aBa = new HashMap();

    private fn_0(int n, ThreadFactory threadFactory) {
        this.aAX = n;
        this.aAY = threadFactory;
    }

    public static <K> fn_0<K> mN(int n) {
        return fn_0.a(n, Executors.defaultThreadFactory());
    }

    public static <K> fn_0<K> a(int n, ThreadFactory threadFactory) {
        return new fn_0<K>(n, threadFactory);
    }

    public void aKM() {
        this.aAV.lock();
        try {
            for (ExecutorService executorService : this.aAW.values()) {
                executorService.shutdown();
            }
        }
        finally {
            this.aAV.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public List<Runnable> aKN() {
        this.aAV.lock();
        try {
            ArrayList<Runnable> arrayList = new ArrayList<Runnable>();
            for (ExecutorService executorService : this.aAW.values()) {
                arrayList.addAll(executorService.shutdownNow());
            }
            ArrayList<Runnable> arrayList2 = arrayList;
            return arrayList2;
        }
        finally {
            this.aAV.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean aKO() {
        this.aAV.lock();
        try {
            for (ExecutorService executorService : this.aAW.values()) {
                if (executorService.isShutdown()) continue;
                boolean bl = false;
                return bl;
            }
            boolean bl = true;
            return bl;
        }
        finally {
            this.aAV.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean aKP() {
        this.aAV.lock();
        try {
            for (ExecutorService executorService : this.aAW.values()) {
                if (executorService.isTerminated()) continue;
                boolean bl = false;
                return bl;
            }
            boolean bl = true;
            return bl;
        }
        finally {
            this.aAV.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(long l, TimeUnit timeUnit) {
        long l2 = System.nanoTime();
        long l3 = timeUnit.toNanos(l);
        this.aAV.lock();
        try {
            for (ExecutorService executorService : this.aAW.values()) {
                if (!executorService.awaitTermination(l3, TimeUnit.NANOSECONDS)) {
                    boolean bl = false;
                    return bl;
                }
                l3 -= System.nanoTime() - l2;
            }
            boolean bl = true;
            return bl;
        }
        finally {
            this.aAV.unlock();
        }
    }

    public void a(K k2, Runnable runnable) {
        this.b(k2, runnable);
    }

    public <T> Future<T> a(K k2, Callable<T> callable) {
        ExecutorService executorService = this.t(k2);
        return this.a(executorService, callable);
    }

    public <T> Future<T> a(K k2, Runnable runnable, T t) {
        ExecutorService executorService = this.t(k2);
        return this.a(executorService, () -> {
            runnable.run();
            return t;
        });
    }

    public Future<?> b(K k2, Runnable runnable) {
        ExecutorService executorService = this.t(k2);
        return this.a(executorService, () -> {
            runnable.run();
            return null;
        });
    }

    private <T> Future<T> a(ExecutorService executorService, Callable<T> callable) {
        Future<Object> future = executorService.submit(() -> {
            AtomicInteger atomicInteger;
            Object v = callable.call();
            if (!this.aBa.containsKey(executorService)) {
                return v;
            }
            AtomicInteger atomicInteger2 = atomicInteger = this.aBa.get(executorService);
            synchronized (atomicInteger2) {
                atomicInteger.decrementAndGet();
            }
            return v;
        });
        this.a(executorService);
        return future;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(ExecutorService executorService) {
        HashMap<ExecutorService, AtomicInteger> hashMap = this.aBa;
        synchronized (hashMap) {
            AtomicInteger atomicInteger;
            AtomicInteger atomicInteger2 = atomicInteger = this.aBa.getOrDefault(executorService, new AtomicInteger());
            synchronized (atomicInteger2) {
                atomicInteger.incrementAndGet();
            }
            this.aBa.put(executorService, atomicInteger);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private ExecutorService t(K k2) {
        this.aAV.lock();
        try {
            int n = k2.hashCode() % this.aAX;
            ExecutorService executorService = this.aAW.computeIfAbsent(n, n2 -> this.mO(n));
            return executorService;
        }
        finally {
            this.aAV.unlock();
        }
    }

    private ExecutorService mO(int n) {
        ExecutorService executorService = Executors.newSingleThreadExecutor(this.aAY);
        if (!this.aAZ.isBlank()) {
            new ExecutorServiceMetrics(executorService, this.aAZ, (Iterable)Tags.of((String)"id", (String)String.valueOf(n))).bindTo((MeterRegistry)Metrics.globalRegistry);
        }
        return executorService;
    }

    public void mP(int n) {
        if (n == this.aAX) {
            return;
        }
        this.aAV.lock();
        try {
            if (n < this.aAX) {
                List<Map.Entry> list = this.aAW.entrySet().stream().filter(entry -> (Integer)entry.getKey() >= n).toList();
                list.forEach(entry -> {
                    ((ExecutorService)entry.getValue()).shutdown();
                    this.aAW.remove(entry.getKey(), entry.getValue());
                });
            }
            this.aAX = n;
        }
        finally {
            this.aAV.unlock();
        }
    }

    public int aKQ() {
        return this.aAX;
    }

    public int aKR() {
        this.aAV.lock();
        try {
            int n = this.aAW.size();
            return n;
        }
        finally {
            this.aAV.unlock();
        }
    }

    @NotNull
    public @Unmodifiable Map<ExecutorService, AtomicInteger> aKS() {
        return Collections.unmodifiableMap(this.aBa);
    }

    @Generated
    public void bw(String string) {
        this.aAZ = string;
    }
}

