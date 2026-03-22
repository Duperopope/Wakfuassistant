/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntIntIterator
 *  gnu.trove.map.hash.TIntIntHashMap
 */
import gnu.trove.iterator.TIntIntIterator;
import gnu.trove.map.hash.TIntIntHashMap;
import java.util.Arrays;

public class fdl
extends fdz_0 {
    private final short rVB;
    private final boolean rVC;
    private final int rVD;
    private final TIntIntHashMap rVE = new TIntIntHashMap();

    public fdl(int n, int n2, short s, boolean bl, int n3) {
        super(n, n2, eIx.qwB, 0);
        this.rVB = s;
        this.rVC = bl;
        this.rVD = n3;
    }

    public short clh() {
        return this.rVB;
    }

    public boolean bfb() {
        return this.rVC;
    }

    public void fN(int n, int n2) {
        this.rVE.put(n, n2);
    }

    public TIntIntIterator fTo() {
        return this.rVE.iterator();
    }

    public boolean fTp() {
        return this.rVD != 0 || !this.rVE.isEmpty();
    }

    public int Ui(int n) {
        return this.rVE.get(n);
    }

    public int cmm() {
        return this.rVD;
    }

    public String toString() {
        return "IECollectParameter{m_capacity=" + this.rVB + ", m_locked=" + this.rVC + ", m_items=" + Arrays.toString(this.rVE.keys()) + "}";
    }
}

