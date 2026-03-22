/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Iterator;

/*
 * Renamed from aoX
 */
public abstract class aox_1
implements Iterable<aow_1> {
    private final HashMap<Integer, aow_1> cNg = new HashMap();

    protected aox_1(aow_1 ... aow_1Array) {
        for (aow_1 aow_12 : aow_1Array) {
            if (this.cNg.containsKey(aow_12.bEJ())) {
                throw new RuntimeException("D\u00e9finition des listes de param\u00e8tres impossibles : liste \u00e0 " + aow_12.bEJ() + " param\u00e8tres d\u00e9j\u00e0 d\u00e9finie");
            }
            this.cNg.put(aow_12.bEJ(), aow_12);
        }
    }

    public aow_1 tm(int n) {
        return this.cNg.get(n);
    }

    public int bEL() {
        int n = 0;
        for (aow_1 aow_12 : this.cNg.values()) {
            n = Math.max(n, aow_12.bEJ());
        }
        return n;
    }

    @Override
    public final Iterator<aow_1> iterator() {
        return this.cNg.values().iterator();
    }

    public final boolean tn(int n) {
        if (n > 0) {
            return this.cNg.containsKey(n);
        }
        return this.cNg.isEmpty() || this.cNg.containsKey(0);
    }

    public int aVo() {
        return this.cNg.size();
    }

    public abstract boolean oQ(int var1);
}

