/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TLongHashSet
 */
import gnu.trove.set.hash.TLongHashSet;

/*
 * Renamed from bZD
 */
public final class bzd_2 {
    private static final int lDD = 80;
    private static final azs_2<Long, TLongHashSet> lDE = new azs_2(80);

    static void a(bze_2 bze_22, adq[] adqArray) {
        long l = GC.s(bze_22.getX(), bze_22.getY());
        TLongHashSet tLongHashSet = new TLongHashSet();
        for (int i = 0; i < adqArray.length; ++i) {
            adq adq2 = adqArray[i];
            bcw_0.dQn().a(new RE(adq2.aXv, adq2.aXy, adq2.ayE), adq2.cjr);
            tLongHashSet.add(adq2.aXv);
        }
        lDE.f(l, tLongHashSet);
    }

    static void b(bze_2 bze_22, adq[] adqArray) {
        for (int i = 0; i < adqArray.length; ++i) {
            adq adq2 = adqArray[i];
            if (!adq2.bfg) continue;
            bCA bCA2 = bCA.b(adq2.aXv, null);
            bze_22.d(bCA2);
        }
    }

    public static void ed(int n, int n2) {
        long l = GC.s(n, n2);
        TLongHashSet tLongHashSet = lDE.O(l);
        if (tLongHashSet != null) {
            for (long l2 : tLongHashSet) {
                bcw_0.dQn().dv(l2);
            }
        }
    }
}

