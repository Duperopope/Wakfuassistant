/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class b {
    private final Set<e> k = new HashSet<e>();

    public b(c c2) {
        this.k.addAll(Arrays.asList(c2.e()));
    }

    public Set<e> c() {
        return this.k;
    }

    public void a(e ... eArray) {
        this.k.addAll(Arrays.asList(eArray));
    }

    public void b(e ... eArray) {
        this.k.removeAll(Arrays.asList(eArray));
    }

    public b a(d ... dArray) {
        for (d d2 : dArray) {
            d2.b(this, d2);
        }
        return this;
    }

    public b b(d ... dArray) {
        for (d d2 : dArray) {
            d2.a(this, d2);
        }
        return this;
    }
}

