/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public final class fdb {
    public static final int rUQ = -1;
    private final Map<Integer, Long> rUR = new HashMap<Integer, Long>();
    private final Map<Long, Integer> rUS = new HashMap<Long, Integer>();
    private final Map<Integer, List<Integer>> rUT = new HashMap<Integer, List<Integer>>();
    private final Map<Integer, Integer> rUU = new HashMap<Integer, Integer>();
    private int rUV;
    private int rUW;
    private int rUX;
    private static final fdb rUY = new fdb();

    public static fdb fSX() {
        return rUY;
    }

    public void H(int n, long l) {
        this.rUR.put(n, l);
        this.rUS.put(l, n);
        ++this.rUV;
    }

    public long Ue(int n) {
        return this.rUR.get(n);
    }

    public boolean Uf(int n) {
        return this.rUR.containsKey(n);
    }

    public void fM(int n2, int n3) {
        this.rUT.computeIfAbsent(n2, n -> new ArrayList()).add(n3);
        this.rUU.put(n3, n2);
        ++this.rUX;
    }

    public int Ug(int n) {
        return this.rUU.getOrDefault(n, -1);
    }

    public Optional<Integer> sE(long l) {
        return Optional.ofNullable(this.rUS.get(l));
    }

    public int Uh(int n) {
        return Optional.ofNullable(this.rUT.get(n)).map(List::size).orElse(0);
    }

    public void fSY() {
        this.rUW = this.rUV - this.rUX;
    }

    public int fSZ() {
        return this.rUW;
    }
}

