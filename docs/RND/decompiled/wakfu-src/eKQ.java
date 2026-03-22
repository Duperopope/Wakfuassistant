/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class eKQ {
    public static final eKQ qEb = new eKQ();
    private final Map<Integer, ekw_0> qEc = new HashMap<Integer, ekw_0>();
    private final Map<Integer, eKW> qEd = new HashMap<Integer, eKW>();

    public void m(eKW eKW2) {
        int n = eKW2.d();
        this.qEd.put(n, eKW2);
        if (eKW2.cmw()) {
            this.qEc.put(n, new ekw_0());
        }
    }

    public eKW QV(int n) {
        return this.qEd.get(n);
    }

    public Collection<eKW> fyU() {
        return this.qEd.values();
    }

    public ekw_0 QW(int n) {
        return this.qEc.get(n);
    }

    public void p(Consumer<eKW> consumer) {
        this.qEd.values().forEach(eKW2 -> {
            if (!eKW2.cmv()) {
                return;
            }
            consumer.accept((eKW)eKW2);
        });
    }

    public void q(Consumer<eKW> consumer) {
        this.qEd.values().forEach(consumer);
    }

    public boolean M(int ... nArray) {
        for (eKW eKW2 : this.qEd.values()) {
            for (int n : nArray) {
                if (!eKW2.Rc(n)) continue;
                return true;
            }
        }
        return false;
    }

    public boolean fw(int n, int n2) {
        if (n == n2) {
            return true;
        }
        for (eKW eKW2 : this.qEd.values()) {
            int n3;
            Map<Integer, Integer> map = eKW2.fzf();
            if (!map.containsKey(n) || !this.fw(n3 = map.get(n).intValue(), n2)) continue;
            return true;
        }
        return false;
    }
}

