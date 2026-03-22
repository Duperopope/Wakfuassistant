/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.Arrays;
import java.util.Comparator;
import org.apache.log4j.Logger;

public class aba<T> {
    private static final Logger ccP = Logger.getLogger(aba.class);
    public static final Comparator<abc> ccQ = new abb();
    private final float ccR = 0.5f;
    private final TLongObjectHashMap<abc> ccS;
    private final abc[] ccT;

    public aba(int n) {
        this.ccS = new TLongObjectHashMap(n, 1.0f);
        this.ccT = new abc[n];
    }

    T q(int n, int n2, int n3) {
        long l = GC.s(GC.t(n, n2), n3);
        abc abc2 = (abc)this.ccS.get(l);
        if (abc2 != null) {
            abc2.ccW = this.bsV();
            return abc2.ccV;
        }
        return null;
    }

    private long bsV() {
        return 0L;
    }

    void a(int n, int n2, int n3, T t) {
        abc<T> abc2;
        this.bsW();
        long l = GC.s(GC.t(n, n2), n3);
        this.ccT[this.ccS.size()] = abc2 = new abc<T>(l, t);
        this.ccS.put(l, abc2);
        abc2.ccW = this.bsV();
    }

    private void bsW() {
        int n = this.ccT.length;
        if (this.ccS.size() > n - 1) {
            Arrays.sort(this.ccT, ccQ);
            for (int i = GC.B((float)n * 0.5f); i < n; ++i) {
                this.ccS.remove(this.ccT[i].ccU);
                this.ccT[i] = null;
            }
        }
    }

    void clear() {
        this.ccS.clear();
        Arrays.fill(this.ccT, null);
    }
}

