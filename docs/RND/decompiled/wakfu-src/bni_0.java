/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.set.hash.TIntHashSet;

/*
 * Renamed from bnI
 */
public class bni_0
implements bnh_0 {
    private final bnk_2[] iJF;
    private final int iJG;
    private final int iJH;

    public bni_0(bnk_2 ... bnk_2Array) {
        assert (bnk_2Array != null && bnk_2Array.length >= 2) : "A motifBoardPattern need at least 2 motifs to be usefull...";
        this.iJF = bnk_2Array;
        this.iJG = bnk_2Array[0].getWidth();
        this.iJH = bnk_2Array[1].getWidth();
        assert (this.dzw()) : "Motifs don't have identical dimensions in the MotifBoardPattern";
    }

    private boolean dzw() {
        for (int i = 0; i < this.iJF.length; ++i) {
            if (this.iJF[i] != null && this.iJF[i].getWidth() == this.iJG && this.iJF[i].getHeight() == this.iJH) continue;
            return false;
        }
        return true;
    }

    @Override
    public int dw(int n, int n2) {
        int n3 = n / this.iJG;
        int n4 = n2 / this.iJH;
        int n5 = (n3 + n4) % this.iJF.length;
        if (n5 < 0) {
            n5 += this.iJF.length;
        }
        bnk_2 bnk_22 = this.iJF[n5];
        return bnk_22.dw(n, n2);
    }

    @Override
    public void a(TIntHashSet tIntHashSet) {
        for (bnk_2 bnk_22 : this.iJF) {
            bnk_22.a(tIntHashSet);
        }
    }
}

