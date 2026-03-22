/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.set.hash.TIntHashSet;

public class fnt {
    public static final fnt sJb = new fnt();
    private final TIntObjectHashMap<fns> sJc = new TIntObjectHashMap();
    private final TIntHashSet sJd = new TIntHashSet();

    public void a(fns fns2) {
        int n = fns2.d();
        this.sJc.put(n, (Object)fns2);
        if (fns2.cmv()) {
            this.sJd.add(n);
        }
    }

    public fns Xh(int n) {
        return (fns)this.sJc.get(n);
    }

    public boolean Xi(int n) {
        fns fns2 = this.Xh(n);
        return fns2 == null || fns2.ger();
    }

    public boolean Xj(int n) {
        fns fns2 = this.Xh(n);
        return fns2 == null || fns2.ges();
    }

    public boolean Xk(int n) {
        return this.sJc.contains(n);
    }

    public TIntHashSet geu() {
        return this.sJd;
    }
}

