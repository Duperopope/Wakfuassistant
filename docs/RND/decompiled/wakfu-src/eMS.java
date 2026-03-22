/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class eMS {
    private final HashMap<Integer, Integer> qNY = new HashMap();

    public void fA(int n, int n2) {
        this.qNY.put(n, n2);
    }

    public int RE(int n) {
        return Optional.ofNullable(this.qNY.get(n)).orElse(0);
    }

    public Set<Map.Entry<Integer, Integer>> fAM() {
        return this.qNY.entrySet();
    }

    public boolean RF(int n) {
        return this.qNY.containsKey(n);
    }
}

