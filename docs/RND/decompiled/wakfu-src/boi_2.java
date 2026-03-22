/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntProcedure
 */
import gnu.trove.procedure.TIntProcedure;

/*
 * Renamed from bOi
 */
public class boi_2 {
    private final int kJV;
    private final int[] kJW;
    private static int kJX;
    private final int kJY;

    public boi_2(int n, int ... nArray) {
        this.kJV = n;
        this.kJW = nArray;
        this.kJY = kJX++;
    }

    public int aYs() {
        return this.kJY;
    }

    public int d() {
        return this.kJV;
    }

    public boolean b(TIntProcedure tIntProcedure) {
        for (int n : this.kJW) {
            tIntProcedure.execute(n);
        }
        return true;
    }

    public String getName() {
        return aum_0.cWf().a(139, (long)this.kJV, new Object[0]);
    }
}

