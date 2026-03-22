/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;

/*
 * Renamed from bGO
 */
public class bgo_2 {
    private static final TLongObjectHashMap<fie> jWy = new TLongObjectHashMap();

    public static void c(TLongObjectHashMap<fif> tLongObjectHashMap) {
        bgo_2.a(tLongObjectHashMap, true);
    }

    public static void a(TLongObjectHashMap<fif> tLongObjectHashMap, boolean bl) {
        jWy.clear();
        TLongObjectIterator tLongObjectIterator = tLongObjectHashMap.iterator();
        block5: while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            long l = tLongObjectIterator.key();
            fif fif2 = (fif)tLongObjectIterator.value();
            bgt_0 bgt_02 = (bgt_0)fcI.ac(aue_0.cVJ().cVK().Xi(), l);
            switch (fif2.fZw()) {
                case 0: {
                    fif fif3 = (fie)fif2;
                    jWy.put(l, (Object)fif3);
                    continue block5;
                }
                case 1: {
                    bej_1.a(bgt_02, l, bl);
                    continue block5;
                }
                case 2: {
                    fif fif3 = (fii_0)fif2;
                    bgo_2.a((exP)bgt_02, l, (fii_0)fif3, bl);
                    continue block5;
                }
            }
        }
        tLongObjectIterator = jWy.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            bgt_0 bgt_03 = (bgt_0)fcI.ab(aue_0.cVJ().cVK().Xi(), ((fie)tLongObjectIterator.value()).bkj());
            if (bgt_03 == null) continue;
            bgo_2.a((exP)bgt_03, tLongObjectIterator.key(), (fie)tLongObjectIterator.value(), bl);
        }
        jWy.clear();
    }

    private static void a(exP exP2, long l, fii_0 fii_02, boolean bl) {
        ffV ffV2 = exP2.dod().tb(l);
        short s = (short)(fii_02.fQY() - ffV2.bfd());
        exP2.dod().b(l, s);
        if (bl && s > 0 && !fii_02.fZx()) {
            bgz_2.a(ffV2, s, exP2);
        } else if (bl && s < 0 && !fii_02.fZx()) {
            bgz_2.e(ffV2, Math.abs(s));
        }
    }

    private static void a(exP exP2, long l, fie fie2, boolean bl) {
        bgv_2 bgv_22 = (bgv_2)fgD.fXh().Vd(fie2.acs());
        ffV ffV2 = new ffV(l);
        ffV2.l(bgv_22);
        ffV2.ak(fie2.fQY());
        ffV2.a(fie2.fZy());
        ffV2.a(fie2.fZz());
        ffV2.a(fie2.fZA());
        ffV2.a(fie2.fZB());
        ffV2.UX(fie2.fZE());
        ffV2.a(fie2.fUY());
        ffV2.a(fie2.fZC());
        ffV2.a(fie2.fZD());
        exP2.dod().sY(fie2.bkj()).i(ffV2, fie2.fZv());
        if (!fie2.fZx() && bl) {
            bgz_2.a(ffV2, ffV2.bfd(), exP2);
        }
    }
}

