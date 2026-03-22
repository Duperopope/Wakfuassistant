/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class fhg {
    private final Map<Long, fhe> sob = new HashMap<Long, fhe>();

    public fhe tu(long l) {
        return this.sob.get(l);
    }

    public void b(long l, fhe fhe2) {
        this.sob.put(l, fhe2);
    }

    public void tv(long l) {
        this.sob.remove(l);
    }

    public void h(BiConsumer<Long, fhe> biConsumer) {
        this.sob.forEach(biConsumer);
    }

    public Collection<fhe> fXH() {
        return this.sob.values();
    }
}

