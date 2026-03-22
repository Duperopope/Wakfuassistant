/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from eJf
 */
class ejf_0 {
    private final Map<Integer, Integer> qyB = new HashMap<Integer, Integer>();

    ejf_0() {
    }

    int PZ(int n) {
        Integer n2 = this.qyB.get(n);
        if (n2 == null) {
            return 0;
        }
        return n2;
    }

    void fk(int n, int n2) {
        Integer n3 = this.qyB.get(n);
        if (n3 == null) {
            this.qyB.put(n, n2);
        } else {
            this.qyB.put(n, n3 + n2);
        }
    }
}

