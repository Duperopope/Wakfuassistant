/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from cPQ
 */
public final class cpq_1 {
    public static boolean og(long l) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        long l2 = bgt_02.aqZ();
        if (!caf_2.lFq.rV(l2)) {
            return false;
        }
        bjn_1 bjn_12 = bgt_02.dpI();
        long l3 = bjn_12.Ya();
        long l4 = caf_2.lFq.rT(l3);
        if (l4 != l2) {
            return false;
        }
        ezz_1 ezz_12 = bjn_12.jP(bgt_02.Sn());
        if (ezz_12 == null) {
            return false;
        }
        fab fab2 = bjn_12.jR(ezz_12.Xm());
        return fab2 != null && fab2.b(eyh_2.rKM);
    }

    public static boolean bU(bgy bgy2) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bzq_2 bzq_22 = bzp_2.eqt().mA(bgt_02.aqZ());
        if (!bzq_22.eqw()) {
            return false;
        }
        Optional<fpv> optional = cux_0.mjE.eDE();
        if (optional.isEmpty()) {
            return false;
        }
        fpv fpv2 = optional.get();
        return fpv2.gm(bgt_02.Xt(), bgy2.Xt());
    }

    public static boolean eLG() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (!bgt_02.dpO()) {
            return false;
        }
        bjn_1 bjn_12 = bgt_02.dpI();
        ezz_1 ezz_12 = bjn_12.jP(bgt_02.Sn());
        return ezz_12 != null && ezz_12.Xm() == bjn_12.drj();
    }
}

