/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from bwN
 */
public final class bwn_0 {
    public static bwm_0 bD(bgy bgy2) {
        eyp eyp2 = bgy2.doV();
        acd_1 acd_12 = cub_1.eSi().eSj();
        if (eyp2 == eym.pia && acd_12 != null && bgy2.c((pt_0)exx_2.rGl) > 0) {
            boolean bl;
            boolean bl2 = bl = bwn_0.b(bgy2, bgy2.aZw()) && bwn_0.b(bgy2, acd_12);
            if (bl) {
                return bwm_0.jzW;
            }
        }
        if (acd_12 != null && bwn_0.bE(bgy2) && bwn_0.a(bgy2, bgy2.aZw(), acd_12)) {
            return bwm_0.jzX;
        }
        return bwm_0.jzV;
    }

    private static boolean bE(bgy bgy2) {
        return !bgy2.a(exe_1.rEZ);
    }

    private static boolean a(bgy bgy2, acd_1 acd_12, acd_1 acd_13) {
        bsj_0 bsj_02 = bgy2.dkZ();
        if (bsj_02 == null) {
            return false;
        }
        QR qR = bsj_02.bai();
        byte by = bwn_0.a(acd_12, qR);
        byte by2 = bwn_0.a(acd_13, qR);
        return by != -1 && by == by2;
    }

    private static byte a(acd_1 acd_12, QR qR) {
        byte by = -1;
        List<QQ> list = qR.g(acd_12);
        for (QQ qQ : list) {
            if (qQ.aeV() != etm_0.rnG.aHp()) continue;
            by = qQ.bcP();
        }
        return by;
    }

    public static boolean b(bgy bgy2, acd_1 acd_12) {
        bsj_0 bsj_02 = bgy2.dkZ();
        if (bsj_02 == null) {
            return false;
        }
        QR qR = bsj_02.bai();
        List<QQ> list = qR.g(acd_12);
        for (QQ qQ : list) {
            if (qQ.bci() != bgy2 || qQ.aeV() != etm_0.rnr.aHp()) continue;
            return true;
        }
        return false;
    }
}

