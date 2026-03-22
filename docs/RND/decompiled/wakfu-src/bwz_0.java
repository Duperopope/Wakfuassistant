/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from bwZ
 */
public class bwz_0 {
    public static final bwz_0 jAA = new bwz_0();
    private final Map<Integer, bxa_0> jAB = new HashMap<Integer, bxa_0>();
    private final Map<Integer, Integer> jAC = new HashMap<Integer, Integer>();
    private final Map<Integer, Integer> jAD = new HashMap<Integer, Integer>();
    private final Map<Long, Integer> jAE = new HashMap<Long, Integer>();

    private bwz_0() {
    }

    public void a(int n, bxa_0 bxa_02) {
        this.jAB.put(n, bxa_02);
    }

    public void a(int n, int n2, long[] lArray) {
        this.jAC.put(n2, n);
        this.jAD.put(n, n2);
        for (long l : lArray) {
            this.jAE.put(l, n2);
        }
    }

    public void i(Consumer<bxa_0> consumer) {
        this.jAB.values().forEach(consumer);
    }

    public Optional<bxa_0> FX(int n) {
        return Optional.ofNullable(this.jAB.get(n));
    }

    public int kU(long l) {
        if (!this.jAE.containsKey(l)) {
            return 0;
        }
        return this.jAE.get(l);
    }

    public Optional<bxa_0> FY(int n) {
        if (!this.jAC.containsKey(n)) {
            return Optional.empty();
        }
        int n2 = this.jAC.get(n);
        return Optional.ofNullable(this.jAB.get(n2));
    }

    public Optional<bxa_0> FZ(int n) {
        for (bxa_0 bxa_02 : this.jAB.values()) {
            if (n != bxa_02.coK()) continue;
            return Optional.of(bxa_02);
        }
        return Optional.empty();
    }

    public Optional<bxa_0> kV(long l) {
        return Optional.ofNullable(this.jAE.get(l)).map(this.jAC::get).map(this.jAB::get);
    }

    public Map<Integer, bxa_0> dMZ() {
        return this.jAC.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, entry -> this.jAB.get(entry.getValue())));
    }

    public @Unmodifiable Set<Long> dNa() {
        return Collections.unmodifiableSet(this.jAE.keySet());
    }

    public Optional<Integer> Ga(int n) {
        return Optional.ofNullable(this.jAD.get(n));
    }
}

