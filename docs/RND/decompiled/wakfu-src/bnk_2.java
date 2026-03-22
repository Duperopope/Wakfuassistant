/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.set.hash.TIntHashSet;

/*
 * Renamed from bnK
 */
public class bnk_2
implements bnF {
    private final int iJL;
    private final int iJM;
    private final int[] iJN;

    public bnk_2(int n, int n2, int ... nArray) {
        assert (n > 0 && n2 > 0) : "Motif can't have dimensions less or equal to 0.";
        assert (nArray != null) : "Motif gfx can't be null";
        assert (n * n2 == nArray.length) : "Motif is " + n + "x " + n2 + ". " + n * n2 + " gfx attended, " + nArray.length + " found";
        this.iJL = n;
        this.iJM = n2;
        this.iJN = nArray;
    }

    public int getWidth() {
        return this.iJL;
    }

    public int getHeight() {
        return this.iJM;
    }

    public int dw(int n, int n2) {
        int n3;
        int n4 = n % this.iJL;
        if (n4 < 0) {
            n4 += this.iJL;
        }
        if ((n3 = n2 % this.iJM) < 0) {
            n3 += this.iJM;
        }
        return this.iJN[n3 * this.iJL + n4];
    }

    @Override
    public void a(TIntHashSet tIntHashSet) {
        tIntHashSet.addAll(this.iJN);
    }
}

