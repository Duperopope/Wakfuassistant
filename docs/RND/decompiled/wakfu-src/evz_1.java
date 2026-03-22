/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from evZ
 */
class evz_1 {
    private final Map<azw_1, evx_1> oxM = new HashMap<azw_1, evx_1>();

    evz_1() {
    }

    public evx_1 N(long l, int n) {
        azw_1 azw_12 = new azw_1(l, n);
        evx_1 evx_12 = this.oxM.get(azw_12);
        return evx_12 != null ? evx_12 : evx_1.oxF;
    }

    public void a(long l, int n, evx_1 evx_12) {
        this.oxM.put(new azw_1(l, n), evx_12);
    }

    public String toString() {
        return "InstanceInteractionLevelsDictionary{m_map=" + String.valueOf(this.oxM) + "}";
    }
}

