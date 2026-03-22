/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TLongHashSet
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.set.hash.TLongHashSet;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bvZ
 */
public class bvz_0 {
    public static bgy ju(long l) {
        bgy bgy2 = bgg_0.dlO().ju(l);
        if (bgy2 != null) {
            return bgy2;
        }
        return (bgy)fcL.rUh.sw(l);
    }

    public static boolean bS(byte by) {
        int n;
        int n2;
        int n3;
        bgt_0 bgt_02 = bvz_0.dLl();
        if (bgt_02 == null) {
            return false;
        }
        eyp_1 eyp_12 = bgt_02.dnQ().dKL();
        int n4 = 0;
        int n5 = 0;
        if (eyp_12 != null) {
            n4 = eyp_12.pP(bgt_02.aZj()).size();
            n5 = Math.max(0, fcL.rUh.sA(bgt_02.aZj()) - 1);
        }
        if (n4 + n5 >= (n3 = ewo_0.oBF.i(ewr_0.oEt))) {
            return false;
        }
        if (eJX.qAX.pX(bgt_02.aZj())) {
            return true;
        }
        return !(by == 5 ? n4 >= (n2 = ewo_0.oBF.i(ewr_0.oEr)) : by == 0 && n5 >= (n = ewo_0.oBF.i(ewr_0.oEs)));
    }

    @Nullable
    public static bgt_0 dLl() {
        if (!fcI.fSM()) {
            return aue_0.cVJ().cVK();
        }
        aUQ aUQ2 = aue_0.cVJ().cVO();
        if (aUQ2 == null) {
            return null;
        }
        long l = fcK.rUe.sq(aUQ2.xl());
        Object t = fcL.rUh.sw(l);
        if (!(t instanceof bgt_0)) {
            return null;
        }
        return (bgt_0)t;
    }

    public static bgy x(bgt_0 bgt_02) {
        if (!fcI.fSM()) {
            return bgt_02;
        }
        bsj_0 bsj_02 = bgt_02.dkZ();
        if (bsj_02 == null) {
            return bgt_02;
        }
        bua bua2 = bsj_02.dGQ();
        if (bua2 == null) {
            return bgt_02;
        }
        TLongHashSet tLongHashSet = fcL.rUh.sx(bgt_02.Xi());
        int n = bua2.bhG();
        int n2 = Integer.MAX_VALUE;
        long l = 0L;
        int n3 = n;
        long l2 = 0L;
        for (long l3 : tLongHashSet.toArray()) {
            if (!bsj_02.ba((exP)fcL.rUh.sw(l3))) continue;
            int n4 = bua2.eB(l3);
            if (n4 < n3) {
                n3 = n4;
                l2 = l3;
                continue;
            }
            if (n4 <= n || n4 >= n2) continue;
            n2 = n4;
            l = l3;
        }
        if (n2 < Integer.MAX_VALUE) {
            return (bgy)fcL.rUh.sw(l);
        }
        if (n3 < n) {
            return (bgy)fcL.rUh.sw(l2);
        }
        return bgt_02;
    }

    public static boolean dLm() {
        bgt_0 bgt_02 = bvz_0.dLl();
        return bgt_02 == null || bgt_02.aqZ() == 725L;
    }
}

