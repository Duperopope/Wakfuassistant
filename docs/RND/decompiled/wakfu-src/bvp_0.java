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
 * Renamed from bvP
 */
public final class bvp_0 {
    public static void f(eyp_1 eyp_12) {
        bvp_0.h(eyp_12);
        bvp_0.i(eyp_12);
    }

    public static void g(eyp_1 eyp_12) {
        TLongObjectHashMap<exz_1> tLongObjectHashMap = eyp_12.fPG();
        TLongObjectIterator tLongObjectIterator = tLongObjectHashMap.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            exz_1 exz_12 = (exz_1)tLongObjectIterator.value();
            bgy bgy2 = bvz_0.ju(exz_12.KU());
            if (bgy2 == null) continue;
            bgy2.djo();
        }
    }

    private static void h(eyp_1 eyp_12) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        TLongObjectHashMap<exz_1> tLongObjectHashMap = eyp_12.fPG();
        TLongObjectIterator tLongObjectIterator = tLongObjectHashMap.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            exz_1 exz_12 = (exz_1)tLongObjectIterator.value();
            if (exz_12.KU() == bgt_02.Sn()) continue;
            bif_2.dYO().w(0, exz_12.KU());
            if (bgt_02.aqZ() == exz_12.aqZ()) continue;
            bir_1.dZt().k(0, exz_12.KU());
        }
    }

    private static void i(eyp_1 eyp_12) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        TLongObjectHashMap<exz_1> tLongObjectHashMap = eyp_12.fPG();
        TLongObjectIterator tLongObjectIterator = tLongObjectHashMap.iterator();
        while (tLongObjectIterator.hasNext()) {
            acd_1 acd_12;
            tLongObjectIterator.advance();
            exz_1 exz_12 = (exz_1)tLongObjectIterator.value();
            if (exz_12.aXd() || exz_12.dmc() || (acd_12 = exz_12.aZw()) == null || exz_12.KU() == bgt_02.Sn()) continue;
            bir_1.dZt().a(0, exz_12.KU(), acd_12.getX(), acd_12.getY(), acd_12.bdi());
            big_2.a(exz_12.KU(), 0, acd_12.getX(), acd_12.getY(), acd_12.bdi(), exz_12.aqZ(), exz_12, bit_2.kgw, exz_12.getName(), aid_0.dUO, bif_2.dYO());
        }
    }
}

