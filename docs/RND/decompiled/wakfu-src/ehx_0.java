/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.HashSet;
import java.util.Set;

/*
 * Renamed from eHX
 */
public final class ehx_0 {
    private final int qtW;
    private final Set<ehw_0> qtX = new HashSet<ehw_0>();
    private final TIntArrayList qtY;

    public ehx_0(int n, TIntArrayList tIntArrayList) {
        this.qtW = n;
        this.qtY = tIntArrayList;
        this.qtY.sort();
    }

    public void c(ehw_0 ehw_02) {
        if (ehw_02 == null) {
            return;
        }
        this.qtX.add(ehw_02);
    }

    public int d() {
        return this.qtW;
    }

    public <T extends ehw_0> Set<T> fvZ() {
        return new HashSet<ehw_0>(this.qtX);
    }

    public boolean dv(short s) {
        return this.qtY.contains((int)s);
    }

    public int dw(short s) {
        int n = this.qtY.size();
        for (int i = 0; i < n; ++i) {
            if (s >= this.qtY.get(i)) continue;
            return i;
        }
        return n;
    }

    public int dx(short s) {
        for (int n : this.qtY.toArray()) {
            if (n <= s) continue;
            return n;
        }
        return -1;
    }

    public int PF(int n) {
        if (n <= 0) {
            return 0;
        }
        int n2 = this.qtY.size();
        if (n > n2) {
            return this.qtY.get(n2 - 1);
        }
        return this.qtY.get(n - 1);
    }

    public int deV() {
        if (this.qtY.isEmpty()) {
            return Integer.MAX_VALUE;
        }
        return this.qtY.get(0);
    }

    public String toString() {
        return "AptitudeCategoryModel{m_id=" + this.qtW + ", m_bonusSet=" + String.valueOf(this.qtX) + ", m_activationLevels=" + String.valueOf(this.qtY) + "}";
    }
}

