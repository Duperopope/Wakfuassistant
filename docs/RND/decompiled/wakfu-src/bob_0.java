/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * Renamed from bob
 */
public class bob_0 {
    private static final bob_0 iMs = new bob_0();
    private final Map<boc, Set<Integer>> iMt = new HashMap<boc, Set<Integer>>();

    public static bob_0 dAs() {
        return iMs;
    }

    private bob_0() {
    }

    private static boc kh(long l) {
        ux_0 ux_02 = ue_0.bjV().bjc();
        return new boc(l, ux_02.bjI(), ux_02.bjG());
    }

    public void a(long l, Set<Integer> set) {
        boc boc2 = bob_0.kh(l);
        if (set.isEmpty()) {
            this.iMt.remove(boc2);
            return;
        }
        this.iMt.put(boc2, new HashSet<Integer>(set));
    }

    public void z(long l, int n) {
        this.iMt.computeIfAbsent(bob_0.kh(l), boc2 -> new HashSet()).add(n);
    }

    public void clear() {
        this.iMt.clear();
    }

    public boolean A(long l, int n) {
        Set<Integer> set = this.iMt.get(bob_0.kh(l));
        if (set == null) {
            return false;
        }
        return set.contains(n);
    }
}

