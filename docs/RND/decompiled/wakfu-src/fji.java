/*
 * Decompiled with CFR 0.152.
 */
public class fji {
    private static final int[] sxD = new int[]{ffS.sgB.shb, ffS.sgG.shb, ffS.sgE.shb, ffS.sgO.shb, ffS.sgN.shb, ffS.sgQ.shb, ffS.sgR.shb};

    public static fjj d(ffV ffV2, ffV ffV3) {
        int n;
        fjj fjj2 = fji.dd(ffV2);
        if (fjj2 != fjj.sxE) {
            return fjj2;
        }
        fjj fjj3 = fji.dd(ffV3);
        if (fjj3 != fjj.sxE) {
            return fjj3;
        }
        if (ffV2.LV() == ffV3.LV()) {
            return fjj.sxG;
        }
        int n2 = ffV2.avr();
        int n3 = ffV2.fUX() == 0 ? n2 : ffV2.fUX();
        int n4 = n = ffV3.fUX() == 0 ? ffV3.avr() : ffV3.fUX();
        if (n3 == n || n2 == n) {
            return fjj.sxH;
        }
        fhy_0 fhy_02 = fji.r(ffV2.fWi());
        fhy_0 fhy_03 = fji.r(ffV3.fWi());
        if (fhy_02 == null || fhy_03 == null) {
            return fjj.sxF;
        }
        if (fhy_02.aIi() != fhy_03.aIi()) {
            return fjj.sxI;
        }
        return fjj.sxE;
    }

    public static fjj dd(ffV ffV2) {
        if (ffV2 == null) {
            return fjj.sxF;
        }
        if (ffV2.bfd() > 1) {
            return fjj.sxK;
        }
        if (!fji.de(ffV2)) {
            return fjj.sxF;
        }
        return fjj.sxE;
    }

    public static boolean de(ffV ffV2) {
        ffS[] ffSArray = ffV2.fWi().fZq();
        if (ffSArray.length == 0) {
            return false;
        }
        for (ffS ffS2 : ffSArray) {
            if (ado_1.a(sxD, (int)ffS2.aJr())) continue;
            return false;
        }
        return ffV2.dOg().a(ffj_0.sgj) == null;
    }

    public static fhy_0 r(fhy_0 fhy_02) {
        if (fhy_02 == null || fhy_02.cpZ()) {
            return fhy_02;
        }
        return fji.r(fhy_02.fZm());
    }

    public static fgr_0 df(ffV ffV2) {
        if (ffV2.fUY() != null && ffV2.fUY().fXu().fXx()) {
            return ffV2.fUY();
        }
        return fgt_0.a(fgW.smn, true);
    }
}

