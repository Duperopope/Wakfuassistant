/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.HashMap;
import java.util.Optional;

public final class fpu {
    public static final fpu sOH = new fpu();
    private final HashMap<Integer, fpt> sOI = new HashMap();

    private fpu() {
    }

    public void b(fpt fpt2) {
        this.sOI.put(fpt2.d(), fpt2);
    }

    public Optional<fpt> FP(int n) {
        return Optional.ofNullable(this.sOI.get(n));
    }

    public Collection<fpt> ggE() {
        return this.sOI.values();
    }
}

