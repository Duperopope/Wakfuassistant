/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from eJh
 */
class ejh_0 {
    private final Map<Integer, ejf_0> qyC = new HashMap<Integer, ejf_0>();
    private final Map<Integer, Integer> qyD = new HashMap<Integer, Integer>();

    ejh_0() {
    }

    int fl(int n, int n2) {
        int n3 = this.fm(n, n2);
        return n3 += this.PZ(n2);
    }

    private int fm(int n, int n2) {
        ejf_0 ejf_02 = this.qyC.get(n);
        if (ejf_02 == null) {
            return 0;
        }
        return ejf_02.PZ(n2);
    }

    private int PZ(int n) {
        Integer n2 = this.qyD.get(n);
        if (n2 == null) {
            return 0;
        }
        return n2;
    }

    void fk(int n, int n2) {
        Integer n3 = this.qyD.get(n);
        if (n3 == null) {
            this.qyD.put(n, n2);
        } else {
            this.qyD.put(n, n3 + n2);
        }
    }

    void ak(int n, int n2, int n3) {
        ejf_0 ejf_02 = this.qyC.get(n);
        if (ejf_02 == null) {
            ejf_02 = new ejf_0();
            this.qyC.put(n, ejf_02);
        }
        ejf_02.fk(n2, n3);
    }
}

