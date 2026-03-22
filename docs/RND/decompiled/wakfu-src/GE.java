/*
 * Decompiled with CFR 0.152.
 */
import java.time.Duration;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class GE {
    private final LinkedList<Long> aGI = new LinkedList();
    private final long aGJ;
    private final Supplier<Long> aGK;

    public GE(int n, TimeUnit timeUnit) {
        this(n, timeUnit, System::currentTimeMillis);
    }

    public GE(int n, TimeUnit timeUnit, Supplier<Long> supplier) {
        this.aGJ = timeUnit.toMillis(n);
        this.aGK = supplier;
    }

    public GE(Duration duration) {
        this.aGJ = duration.toMillis();
        this.aGK = System::currentTimeMillis;
    }

    public int aNQ() {
        return this.cA(this.aGK.get());
    }

    public int cA(long l) {
        this.cB(l);
        this.aGI.offer(l);
        return this.aGI.size();
    }

    private void cB(long l) {
        while (!this.aGI.isEmpty() && this.aGI.peek() + this.aGJ < l) {
            this.aGI.poll();
        }
    }

    public int aNR() {
        return this.aGI.size();
    }

    public int aNS() {
        this.cB(this.aGK.get());
        return this.aGI.size();
    }
}

