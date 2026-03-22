/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 */
import gnu.trove.list.array.TLongArrayList;

public class cCC
implements agg_1 {
    private final bgy mAA;
    private static final TLongArrayList mAB = new TLongArrayList(new long[]{120L, 320L, 920L});
    private static final TLongArrayList mAC = new TLongArrayList(new long[]{100L, 300L, 400L, 410L, 502L});
    private static final TLongArrayList mAD = new TLongArrayList(new long[]{130L, 330L, 502L, 930L});

    public cCC(bgy bgy2) {
        this.mAA = bgy2;
    }

    @Override
    public boolean cbx() {
        int n = aue_0.cVJ().cVK().dmW();
        return n != 0 && n == this.mAA.bqo();
    }

    @Override
    public boolean hC(long l) {
        int n = aue_0.cVJ().cVK().dmW();
        long l2 = ahk_2.hT(l);
        if (n != -1) {
            return n == this.mAA.bqo() && !mAB.contains(l2);
        }
        if (this.mAA.bqo() != -1) {
            return mAC.contains(l2);
        }
        return mAD.contains(l2);
    }

    static {
        mAD.add(mAB.toArray());
    }
}

