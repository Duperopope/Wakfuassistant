/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;

public class foC {
    public static final foC sLW = new foC();
    private final Map<Integer, foA> sLX = new HashMap<Integer, foA>();
    private final Map<Integer, foA> sLY = new HashMap<Integer, foA>();

    private foC() {
    }

    public foA a(Integer n, foA foA2) {
        int n2 = foA2.AK();
        if (this.sLX.containsKey(foA2.d())) {
            foA foA3 = this.sLX.get(foA2.d());
            throw new IllegalArgumentException("We can't have two skins with the same id : " + String.valueOf(foA3) + ", " + String.valueOf(foA2));
        }
        if (n2 > 0 && this.sLY.containsKey(n2)) {
            foA foA4 = this.sLY.get(n2);
            throw new IllegalArgumentException("We can't have two skins with the same refId : " + String.valueOf(foA4) + ", " + String.valueOf(foA2));
        }
        foA foA5 = this.sLX.put(n, foA2);
        if (n2 > 0) {
            this.sLY.put(n2, foA2);
        }
        return foA5;
    }

    public foA aE(Integer n) {
        return this.sLX.get(n);
    }

    public foA aF(Integer n) {
        return this.sLY.get(n);
    }

    public void h(BiConsumer<? super Integer, ? super foA> biConsumer) {
        this.sLX.forEach(biConsumer);
    }

    public Optional<foA> XU(int n) {
        for (foA foA2 : this.sLX.values()) {
            if (foA2.ctm() != n) continue;
            return Optional.of(foA2);
        }
        return Optional.empty();
    }

    public boolean XI(int n) {
        return this.sLY.containsKey(n);
    }
}

