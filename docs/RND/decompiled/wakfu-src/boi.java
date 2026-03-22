/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public final class boi {
    public static final boi iMT = new boi();
    private final Map<Integer, boh> iMU = new HashMap<Integer, boh>();

    private boi() {
    }

    public void k(int n, int n2, boolean bl) {
        this.iMU.put(n, new boh(n2, bl));
    }

    public Optional<boh> EM(int n) {
        return Optional.ofNullable(this.iMU.get(n));
    }

    public void clear() {
        this.iMU.clear();
    }
}

