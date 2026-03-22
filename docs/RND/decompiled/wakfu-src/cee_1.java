/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cEE
 */
@fyf_0
public class cee_1 {
    public static final String PACKAGE = "wakfu.exchangeMachine";

    public static void selectExchange(flp_2 flp_22, bsu_0 bsu_02) {
        if (!"exchangeBackground".equals(((fhv_1)flp_22.gBE()).getId())) {
            return;
        }
        if (flp_22.gEm()) {
            cee_1.a(flp_22, bsu_02);
            return;
        }
    }

    private static void a(flp_2 flp_22, bsu_0 bsu_02) {
        ffV ffV2;
        if (!flp_22.gEm()) {
            return;
        }
        bmj_2 bmj_22 = bsu_02.dFW();
        if (bmj_22 == null) {
            return;
        }
        if (bmj_22.aEv() != null && bmj_22.aEv().aaz()) {
            ffV2 = fga_0.w(bmj_22.aEv().aaA());
            if (ffV2 == null) {
                return;
            }
            ffV2.tn(ffV2.avr());
        } else {
            bgv_2 bgv_22 = bmj_22.duo();
            ffV2 = ffV.a(bgv_22.d(), bgv_22);
            if (ffV2 == null) {
                return;
            }
        }
        cee_1.b(flp_22, ffV2);
    }

    public static void openCostItemDescription(flp_2 flp_22, bmj_2 bmj_22) {
        if (!flp_22.gEm()) {
            return;
        }
        bgv_2 bgv_22 = bmj_22.duo();
        ffV ffV2 = ffV.a(bgv_22.d(), bgv_22);
        if (ffV2 == null) {
            return;
        }
        ffV2.l(bgv_22);
        cee_1.b(flp_22, ffV2);
    }

    private static void b(flp_2 flp_22, ffV ffV2) {
        dbE dbE2;
        if (ffV2 == null) {
            return;
        }
        if (ffV2.adO()) {
            dbE2 = new dbo_0<bjm_0>(new bjm_0(ffV2));
            dbE2.lK(19685);
        } else {
            dbE2 = new dbk_0();
            dbE2.c(ffV2);
            dbE2.lK(16264);
        }
        dbE2.setX(fhz_2.gAS().getX());
        fes_2 fes_22 = (fes_2)flp_22.gBE();
        dbE2.setY(flp_22.getScreenY() + fes_22.getHeight());
        aaw_1.bUq().h(dbE2);
    }

    public static void openItemPopup(flg_2 flg_22) {
        Object object = flg_22.getItemValue();
        if (!(object instanceof bsy_0)) {
            return;
        }
        bsy_0 bsy_02 = (bsy_0)object;
        object = bsy_02.duo();
        ffV ffV2 = ffV.a(((fhc_0)object).d(), (fhc_0)object);
        cee_1.b(flg_22, ffV2);
    }

    public static void purchase(fiq_1 fiq_12, bsu_0 bsu_02) {
        if (!(fiq_12 instanceof flp_2)) {
            cee_1.e(bsu_02);
            return;
        }
        flp_2 flp_22 = (flp_2)fiq_12;
        bmj_2 bmj_22 = bsu_02.dFW();
        long l = bmj_22 == null ? 1 : bmj_22.duo().bfe() / bmj_22.bfd();
        long l2 = bsu_02.dFT();
        long l3 = Math.min(l2, l);
        if (l3 == 1L) {
            cee_1.e(bsu_02);
            return;
        }
        che_1.setMaxQuantity(l3);
        che_1.setMessageType((short)17579);
        che_1.setExchangeEntryView(bsu_02);
        dbl_0 dbl_02 = new dbl_0();
        dbl_02.ak((short)1);
        dbl_02.cY((short)flp_22.getScreenX());
        dbl_02.cZ((short)flp_22.getScreenY());
        dbl_02.lK(16021);
        aaw_1.bUq().h(dbl_02);
    }

    public static void checkIsAffordable(fiq_1 fiq_12) {
        bsa_0 bsa_02 = (bsa_0)fse_1.gFu().vY("exchangeMachine");
        bsa_02.dGc();
    }

    public static void checkIsLearnable(fiq_1 fiq_12) {
        bsa_0 bsa_02 = (bsa_0)fse_1.gFu().vY("exchangeMachine");
        bsa_02.dGd();
    }

    public static void changeTypeSelected(flk_2 flk_22) {
        if (!flk_22.bqr() || !(flk_22.getValue() instanceof bse_0)) {
            return;
        }
        bsa_0 bsa_02 = (bsa_0)fse_1.gFu().vY("exchangeMachine");
        bsa_02.a((bse_0)flk_22.getValue());
    }

    private static void e(bsu_0 bsu_02) {
        dbj dbj2 = new dbj();
        dbj2.f(bsu_02);
        dbj2.ak((short)1);
        dbj2.lK(17579);
        aaw_1.bUq().h(dbj2);
    }

    public static void outExchange(fiq_1 fiq_12, fbt_1 fbt_12) {
        cee_1.outExchange(fiq_12, fbt_12, null);
    }

    public static void overExchange(fiq_1 fiq_12, fbt_1 fbt_12) {
        cee_1.overExchange(fiq_12, fbt_12, null);
    }

    public static void outExchange(fiq_1 fiq_12, fbt_1 fbt_12, fes_2 fes_22) {
        fbt_12.setDisplaySize(new fsm_1(46, 46));
        if (fes_22 != null) {
            fes_22.setVisible(false);
        }
    }

    public static void overExchange(fiq_1 fiq_12, fbt_1 fbt_12, fes_2 fes_22) {
        fbt_12.setDisplaySize(new fsm_1(50, 50));
        if (fes_22 != null) {
            fes_22.setVisible(true);
        }
    }

    public static void resetItemFilter(fiq_1 fiq_12, fdu_1 fdu_12) {
        fdu_12.guD();
    }

    public static void switchCharacter(fiq_1 fiq_12, bgt_0 bgt_02) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(19166);
        dae_02.D(bgt_02);
        aaw_1.bUq().h(dae_02);
    }

    public static void showItemPopup(fiq_1 fiq_12, bmj_2 bmj_22, frx_1 frx_12) {
        flg_2 flg_22 = new flg_2();
        flg_22.x((fhv_1)fiq_12.gBE());
        flg_22.setItemValue(bmj_22);
        cdd_2.showItemPopup(flg_22, frx_12);
    }

    public static void showItemPopup(fiq_1 fiq_12, bsu_0 bsu_02, frx_1 frx_12) {
        flg_2 flg_22 = new flg_2();
        flg_22.x((fhv_1)fiq_12.gBE());
        flg_22.setItemValue(bsu_02.dFW().duo());
        fse_1.gFu().f("exchangeMachineHoverResult", bsu_02);
        cdd_2.showItemPopup(flg_22, frx_12);
    }

    public static void closePopup(fiq_1 fiq_12) {
        fse_1.gFu().f("exchangeMachineHoverResult", (Object)null);
        fyd_0.closePopup(fiq_12);
    }
}

