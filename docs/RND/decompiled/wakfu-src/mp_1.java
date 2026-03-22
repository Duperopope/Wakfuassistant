/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;

/*
 * Renamed from MP
 */
public class mp_1 {
    private final int aXp;
    private final TIntArrayList aXq = new TIntArrayList();

    public mp_1(int n) {
        this.aXp = n;
    }

    public void h(int[] nArray) {
        this.aXq.add(nArray);
    }

    public int d() {
        return this.aXp;
    }

    public int nL(int n) {
        return this.aXq.get(n);
    }

    public int aVo() {
        return this.aXq.size();
    }
}

