/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from buv
 */
public class buv_0 {
    private static final buv_0 jpy = new buv_0();
    private final Map<Integer, buu_0> jpz = new HashMap<Integer, buu_0>();

    public static buv_0 dIZ() {
        return jpy;
    }

    public void a(buu_0 buu_02) {
        this.jpz.put(buu_02.aHp(), buu_02);
    }

    public buu_0 T(Integer n) {
        return this.jpz.getOrDefault(n, buu_0.jpv);
    }
}

