/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TIntObjectProcedure
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TIntObjectProcedure;
import gnu.trove.set.hash.TIntHashSet;
import java.io.IOException;
import org.apache.log4j.Logger;

/*
 * Renamed from add
 */
public class add_0 {
    protected static final Logger ciz = Logger.getLogger(add_0.class);
    public TIntObjectHashMap<TIntHashSet> ciA;

    public void bkZ() {
        this.ciA = new TIntObjectHashMap();
    }

    public void reset() {
        if (this.ciA != null) {
            this.ciA.clear();
        }
    }

    public void w(int n, int n2, int n3) {
        int n4;
        TIntHashSet tIntHashSet = (TIntHashSet)this.ciA.get(n);
        if (tIntHashSet == null) {
            tIntHashSet = new TIntHashSet();
            this.ciA.put(n, (Object)tIntHashSet);
        }
        if (!tIntHashSet.contains(n4 = add_0.bt(n2, n3))) {
            tIntHashSet.add(n4);
        }
    }

    public TIntHashSet rO(int n) {
        if (this.ciA != null) {
            return (TIntHashSet)this.ciA.get(n);
        }
        return null;
    }

    public static int bt(int n, int n2) {
        return GC.t(n, n2);
    }

    public static short rP(int n) {
        return GC.mS(n);
    }

    public static short rQ(int n) {
        return GC.mT(n);
    }

    public void a(apl_1 apl_12) {
        int n = apl_12.aIA();
        this.ciA = new TIntObjectHashMap(n);
        for (int i = 0; i < n; ++i) {
            int n2 = apl_12.aIA();
            int n3 = apl_12.aIA();
            if (n3 == 0) continue;
            TIntHashSet tIntHashSet = new TIntHashSet(n3);
            this.ciA.put(n2, (Object)tIntHashSet);
            for (int j = 0; j < n3; ++j) {
                tIntHashSet.add(apl_12.aIA());
            }
        }
    }

    public void b(fs_0 fs_02) {
        try {
            fs_02.mz(this.ciA.size());
            if (!this.ciA.isEmpty()) {
                this.ciA.forEachEntry((TIntObjectProcedure)new ade(this, fs_02));
            }
        }
        catch (IOException iOException) {
            ciz.error((Object)"IOException during save", (Throwable)iOException);
        }
    }
}

