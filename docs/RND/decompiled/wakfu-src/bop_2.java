/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

/*
 * Renamed from bOp
 */
public final class bop_2 {
    private static final bop_2 kKy = new bop_2();
    private final Map<Integer, bon_2> kKz = new HashMap<Integer, bon_2>();
    private final Map<Integer, bom_2> kKA = new HashMap<Integer, bom_2>();

    private bop_2() {
    }

    public static bop_2 egN() {
        return kKy;
    }

    public Optional<bon_2> Ix(int n) {
        return Optional.ofNullable(this.kKz.get(n));
    }

    public Optional<bom_2> Iy(int n) {
        return Optional.ofNullable(this.kKA.get(n));
    }

    public void a(bon_2 bon_22) {
        this.kKz.put(bon_22.d(), bon_22);
    }

    public void a(bom_2 bom_22) {
        this.kKA.put(bom_22.d(), bom_22);
    }

    public Set<Integer> egO() {
        return this.kKA.keySet();
    }
}

