/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntIntIterator
 *  gnu.trove.map.hash.TIntIntHashMap
 */
import gnu.trove.iterator.TIntIntIterator;
import gnu.trove.map.hash.TIntIntHashMap;

public abstract class eJG
extends eJy<eJF, eJH> {
    protected final TIntIntHashMap qAf = new TIntIntHashMap();
    private final fdl qAg;

    protected eJG(fdl fdl2) {
        super(new eJF(fdl2));
        this.qAg = fdl2;
    }

    public void fn(int n, int n2) {
        if (this.qzZ != null) {
            ((eJH)this.qzZ).fr(n, n2);
        }
    }

    public boolean fo(int n, int n2) {
        if (!this.fp(n, n2)) {
            return false;
        }
        this.qAf.adjustOrPutValue(n, n2, n2);
        this.fn(n, n2);
        return true;
    }

    public int Qe(int n) {
        return this.qAf.get(n);
    }

    @Override
    public boolean isFull() {
        if (this.qAa.exS() < (long)this.qAg.cmm()) {
            return false;
        }
        TIntIntIterator tIntIntIterator = this.qAg.fTo();
        while (tIntIntIterator.hasNext()) {
            tIntIntIterator.advance();
            if (this.Qe(tIntIntIterator.key()) >= tIntIntIterator.value()) continue;
            return false;
        }
        return true;
    }

    @Override
    public void clear() {
        super.clear();
        this.qAf.clear();
    }

    public boolean fp(int n, int n2) {
        return ((eJF)this.qzY).a(this, n, n2);
    }

    public int fq(int n, int n2) {
        return ((eJF)this.qzY).b(this, n, n2);
    }
}

