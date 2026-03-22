/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.map.hash.TLongObjectHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from aVz
 */
public class avz_0
extends agb_1 {
    final TLongArrayList hte = new TLongArrayList();
    private boolean htf = false;
    public boolean htg = false;
    private static final int hth = 10;

    public avz_0(int n, int n2, int n3, TLongObjectHashMap<acd_1> tLongObjectHashMap) {
        super(n, n2, n3);
        TLongObjectIterator tLongObjectIterator = tLongObjectHashMap.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            long l = tLongObjectIterator.key();
            this.hte.add(l);
            bsW.jjJ.a(l, this);
        }
    }

    @Override
    public long cbk() {
        try {
            int n = this.cWN();
            if (!this.htf) {
                return 0L;
            }
            return n;
        }
        catch (Exception exception) {
            dJP.error((Object)"Exception levee", (Throwable)exception);
            return 0L;
        }
    }

    public void fa(boolean bl) {
        this.htg = bl;
    }

    private int cWN() {
        int n = 0;
        int n2 = this.hte.size();
        for (int i = 0; i < n2; ++i) {
            Object object;
            long l = this.hte.get(i);
            bgy bgy2 = bgg_0.dlO().ju(l);
            if (bgy2 == null || !bsW.jjJ.b(l, this)) continue;
            acd_1 acd_12 = bsW.jjJ.kB(l);
            bsW.jjJ.kA(l);
            bdj_2 bdj_22 = bgy2.ddI();
            if (this.htg || bgy2.a(ezj_0.psP)) {
                object = bdj_22.bvD();
                bdj_22.a(aez.bwu());
                bgy2.b(acd_12.getX(), acd_12.getY(), acd_12.bdi());
                bdj_22.a((aex)object);
                continue;
            }
            if (bgy2.aZw().A(acd_12) > 10) {
                bgy2.b(acd_12.getX(), acd_12.getY(), acd_12.bdi());
                continue;
            }
            object = aue_0.cVJ().cVK();
            if (bgy2 == object) {
                this.htf = true;
                ((bgt_0)object).fZ(false);
                this.J(bgy2);
            }
            bdj_2 bdj_23 = bdj_22;
            bdj_23.ddf();
            anp_2 anp_22 = bdj_23.a(acd_12, false, false);
            int n3 = anp_22.bDU();
            int n4 = bdj_23.bvD().c(bdj_23, n3).a(bdj_23);
            int n5 = n3 * n4;
            if (anp_22.bDV() && n3 > 0) {
                if (n < n5) {
                    n = n5;
                }
                bdj_23.a(anp_22, true);
                continue;
            }
            bgy2.b(acd_12.getX(), acd_12.getY(), acd_12.bdi());
        }
        return n;
    }

    private void J(bgy bgy2) {
        ava_0 ava_02 = new ava_0(this, bgy2);
        bgy2.ddI().b(ava_02);
    }

    void K(bgy bgy2) {
        if (bgy2.dkQ()) {
            cue_2.eSA().eSE();
        }
    }

    @Override
    protected void caV() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return;
        }
        if (this.hte.contains(bgt_02.Sn())) {
            bgt_02.fZ(true);
        }
    }

    static /* synthetic */ Logger aGh() {
        return dJP;
    }
}

