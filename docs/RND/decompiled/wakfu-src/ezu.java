/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.list.array.TIntArrayList;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class ezu {
    private static final Logger prH = Logger.getLogger(ezu.class);
    public static final int prI = 10;
    public static final ezu prJ = new ezu();
    private final ezt[] prK = new ezt[11];

    private ezu() {
    }

    public void a(@NotNull ezt ezt2) {
        this.prK[ezt2.d()] = ezt2;
    }

    public int Ph(int n) {
        assert (ezu.Pi(n)) : "Level de guilde invalide !";
        ezn ezn2 = ezr.Pf(n);
        if (ezn2 == null) {
            return 0;
        }
        return ezn2.fmw().cqq();
    }

    public static boolean Pi(int n) {
        return n >= 0 && n <= 10;
    }

    public int Pj(int n) {
        for (int i = 0; i <= 10; ++i) {
            ezt ezt2 = this.prK[i];
            if (ezt2 == null || !ezt2.Pg(n)) continue;
            return ezt2.d();
        }
        return 0;
    }

    public boolean fi(int n, int n2) {
        TIntArrayList tIntArrayList = this.Pk(n2);
        return tIntArrayList.contains(n);
    }

    public TIntArrayList Pk(int n) {
        TIntArrayList tIntArrayList = new TIntArrayList();
        for (int i = 0; i <= n; ++i) {
            if (this.prK[i] == null) continue;
            this.prK[i].c(tIntArrayList);
        }
        return tIntArrayList;
    }
}

