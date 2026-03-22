/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;

public class eyv
implements PH {
    private final int pjd;
    private final int pje;
    private final eyx pjf;
    private final TIntArrayList pjg;
    private final TIntArrayList pjh;

    public eyv(int n, int n2, eyx eyx2) {
        this.pjd = n;
        this.pje = n2;
        this.pjf = eyx2;
        this.pjg = new TIntArrayList();
        this.pjh = new TIntArrayList();
    }

    public void OU(int n) {
        if (!this.pjg.contains(n)) {
            this.pjg.add(n);
        }
    }

    public void OV(int n) {
        if (!this.pjh.contains(n)) {
            this.pjh.add(n);
        }
    }

    public int cqy() {
        return this.pjd;
    }

    public TIntArrayList fig() {
        return this.pjg;
    }

    public TIntArrayList fih() {
        return this.pjh;
    }

    @Override
    public int avr() {
        return this.pjd;
    }

    public int fii() {
        return this.pje;
    }

    public eyx fij() {
        return this.pjf;
    }
}

