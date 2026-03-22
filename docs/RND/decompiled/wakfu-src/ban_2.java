/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.set.hash.TIntHashSet;
import java.util.List;

/*
 * Renamed from baN
 */
public final class ban_2 {
    public static final ban_2 hzt = new ban_2();

    private ban_2() {
    }

    public void i(bgt_0 bgt_02) {
        this.a(bgt_02, 34, enb_0.qOU, bgt_02.dnt(), false);
    }

    public void a(bgt_0 bgt_02, boolean bl) {
        this.a(bgt_02, 32, enb_0.qOT, bgt_02.dns(), bl);
    }

    public void b(bgt_0 bgt_02, boolean bl) {
        this.a(bgt_02, 28, enb_0.qOR, bgt_02.dnq(), bl);
    }

    private void a(bgt_0 bgt_02, int n, Qk qk, TIntHashSet tIntHashSet, boolean bl) {
        bgt_02.dmz().Se(n);
        if (tIntHashSet == null || tIntHashSet.isEmpty()) {
            return;
        }
        int[] nArray = tIntHashSet.toArray();
        if (bl) {
            bgt_02.e(exx_2.rGi).fOA();
        }
        for (int i = 0; i < nArray.length; ++i) {
            int n2 = nArray[i];
            enk_0 enk_02 = bat_2.cZD().RN(n2);
            if (enk_02 == null) continue;
            enk_02.a(qk, bgt_02, bgt_02.fgg(), enf_0.fBb(), bgt_02.bcC(), bgt_02.bcD(), bgt_02.bcE(), bgt_02, null, false);
        }
        if (bl) {
            bgt_02.e(exx_2.rGi).fOB();
        }
    }

    public static void D(List<QD> list) {
        for (int i = 0; i < list.size(); ++i) {
            QD qD = list.get(i);
            if (qD instanceof erh_0 && ((erh_0)qD).cwt()) {
                qD.bbs();
            } else {
                qD.bbr();
            }
            if (qD.aZQ() || qD.bbX()) continue;
            qD.bbF();
            qD.bbK();
        }
    }
}

