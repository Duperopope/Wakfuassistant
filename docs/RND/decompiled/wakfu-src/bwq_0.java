/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TLongHashSet
 */
import gnu.trove.set.hash.TLongHashSet;

/*
 * Renamed from bwQ
 */
public class bwq_0
extends sr_0 {
    private static final float jAg = 2.0f;
    final TLongHashSet jAh = new TLongHashSet();

    public void reset() {
        this.jAh.clear();
    }

    public void bF(bgy bgy2) {
        bgg_0.dlO().a(new bwr_0(this, bgy2));
    }

    @Override
    public void aVH() {
        super.aVH();
        this.jAh.clear();
    }

    @Override
    protected float a(ss_0 ss_02, wt_0 wt_02, ss_0 ss_03, wt_0 wt_03, byte by) {
        float f2 = super.a(ss_02, wt_02, ss_03, wt_03, by);
        if (this.jAh.contains(bwq_0.ai(wt_03.bap, wt_03.baq))) {
            f2 += 2.0f;
        }
        return f2;
    }

    static /* synthetic */ long dF(int n, int n2) {
        return bwq_0.ai(n, n2);
    }
}

