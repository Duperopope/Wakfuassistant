/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  org.apache.commons.lang3.ArrayUtils
 */
import gnu.trove.list.array.TIntArrayList;
import org.apache.commons.lang3.ArrayUtils;

public class ezt {
    private final int prF;
    private final int[] prG;

    public ezt(int n, int ... nArray) {
        this.prF = n;
        this.prG = ezr.K(nArray);
    }

    public int d() {
        return this.prF;
    }

    public boolean Pg(int n) {
        return ArrayUtils.contains((int[])this.prG, (int)n);
    }

    public void c(TIntArrayList tIntArrayList) {
        tIntArrayList.add(this.prG);
    }
}

