/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cTT
 */
public class ctt_2
extends crw_2 {
    private static final ctt_2 nKP = new ctt_2();
    private static final alx_2 nKQ = string -> {
        if (string.equals("dimensionalBagRoomManagerDialog")) {
            aue_0.cVJ().b(nKP);
        }
    };
    private boolean nKR;

    public static ctt_2 eRh() {
        return nKP;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 19611: {
                fnA fnA2;
                long l;
                dbl_0 dbl_02 = (dbl_0)aam_22;
                bnv_2 bnv_22 = aue_0.cVJ().cVK().dnw();
                byte by = dbl_02.bCn();
                ffV ffV2 = dbl_02.getItem();
                boolean bl = dbl_02.bCu();
                byte by2 = (byte)dbl_02.bCo();
                long l2 = l = bl ? 0L : dbl_02.getSourceUniqueId();
                if (bl) {
                    boolean bl2;
                    if (by2 == by) {
                        return false;
                    }
                    boolean bl3 = bnv_22.g(by2, false) == null;
                    fnA2 = bnv_22.a(by2, bl3, by, bl2 = bnv_22.g(by, false) == null);
                    if (fnA2 == fnA.sJF) {
                        if (ctt_2.a(bnv_22, by2) && bnv_22.g(by2, false) == null) {
                            fiq_2.gCw().d(fik_2.a(string -> bnv_22.a(by2, bl3, by, bl2, false)).l("dimensionalBag.warn.resources", new Object[0]).vG(ccp_2.mRE.byf()).abQ(1));
                        } else {
                            bnv_22.a(by2, bl3, by, bl2, false);
                        }
                    }
                } else {
                    fnA2 = bnv_22.g(by, true) != null ? bnv_22.a(by, ffV2, l, false) : bnv_22.b(by, ffV2, l, false);
                }
                if (fnA2 != fnA.sJF) {
                    fiq_2.gCw().d(fik_2.gBZ().vE(bnv_2.a(fnA2)).abQ(3));
                }
                bnv_22.bv(by);
                return false;
            }
            case 17428: {
                dbl_0 dbl_03 = (dbl_0)aam_22;
                bnv_2 bnv_23 = aue_0.cVJ().cVK().dnw();
                byte by = dbl_03.bCn();
                long l = dbl_03.getDestinationUniqueId();
                byte by3 = (byte)dbl_03.getDestinationPosition();
                if (ctt_2.a(bnv_23, by) && bnv_23.g(by, false) == null) {
                    fiq_2.gCw().d(fik_2.a(string -> ctt_2.a(bnv_23, by, l, by3)).l("dimensionalBag.warn.resources", new Object[0]).vG(ccp_2.mRE.byf()).abQ(1));
                    break;
                }
                return ctt_2.a(bnv_23, by, l, by3);
            }
        }
        return true;
    }

    private static boolean a(bnv_2 bnv_22, byte by, long l, byte by2) {
        fnA fnA2 = bnv_22.a(by, l, by2, false, false);
        if (fnA2 == fnA.sJI) {
            fnA2 = bnv_22.a(by, l, by2, true, false);
        }
        if (fnA2 != fnA.sJF) {
            fiq_2.gCw().d(fik_2.gBZ().vE(bnv_2.a(fnA2)).abQ(3));
            return false;
        }
        bnv_22.bv(by);
        return false;
    }

    private static boolean a(bnv_2 bnv_22, byte by) {
        fnz fnz2 = bnv_22.bw(by);
        int n = fnz2.gel();
        int n2 = fnz2.gem();
        for (int i = n; i < n + 6; ++i) {
            for (int j = n2; j < n2 + 6; ++j) {
                if (bLe.ecw().dQ(i, j) == null) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        super.a(aye_22, bl);
        if (bl) {
            return;
        }
        fyw_0.gqw().a(nKQ);
        ccj_2.pd("dimensionalBagRoomManagerDialog");
        if (aue_0.cVJ().cVK().dnw() != null) {
            fse_1.gFu().f("editableDimensionalBag", aue_0.cVJ().cVK().dnw());
        }
        fyw_0.gqw().d("wakfu.roomManager", ceo_1.class);
        aue_0.cVJ().b(czi_2.eYU());
        cAY.eHc().eHq();
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        super.b(aye_22, bl);
        if (bl) {
            return;
        }
        fyw_0.gqw().b(nKQ);
        fse_1.gFu().vX("editableDimensionalBag");
        fyw_0.gqw().tl("dimensionalBagRoomManagerDialog");
        fyw_0.gqw().tc("wakfu.roomManager");
        aue_0.cVJ().a(czi_2.eYU());
        cAY.eHc().eHr();
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    public String toString() {
        return "UIDimensionalBagRoomManagerFrame{m_dialogUnloadListener=" + String.valueOf(nKQ) + "}";
    }
}

