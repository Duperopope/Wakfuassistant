/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cEi
 */
@fyf_0
public class cei_2 {
    public static final String PACKAGE = "wakfu.craftTable";

    public static void openItemDetailWindow(flg_2 flg_22, fey_2 fey_22) {
        cfe_1.openItemDetailWindow(flg_22, fey_22);
    }

    public static void inventoryDragItem(fiq_1 fiq_12, ffV ffV2) {
        daj_0 daj_02 = new daj_0(ffV2.avr());
        aaw_1.bUq().h(daj_02);
    }

    public static void inventoryDropOutItem(fiq_1 fiq_12) {
        ctg_1.eQG().ki(false);
    }

    public static void dropIngredient(fla_2 fla_22) {
        Object object = fla_22.getValue();
        if (object instanceof bmj_2) {
            cei_2.a((bmj_2)object);
        }
    }

    public static void dropItem(fla_2 fla_22) {
        Object object = fla_22.getValue();
        if (object instanceof bmj_2) {
            cei_2.a((bmj_2)object);
        }
        boolean bl = fla_22.gDT();
        boolean bl2 = ((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljt);
        ffV ffV2 = (ffV)object;
        if (ffV2.bfd() > 1 && bl ^ bl2) {
            che_1.setMaxQuantity(ffV2.bfd());
            che_1.setMessageType((short)16019);
            che_1.setItem(ffV2);
            dbl_0 dbl_02 = new dbl_0();
            dbl_02.setItem(ffV2);
            dbl_02.cY((short)fla_22.getScreenX());
            dbl_02.cZ((short)fla_22.getScreenY());
            dbl_02.lK(16021);
            aaw_1.bUq().h(dbl_02);
        } else {
            dbl_0 dbl_03 = new dbl_0();
            dbl_03.setItem(ffV2);
            dbl_03.ak((short)-1);
            dbl_03.lK(16019);
            aaw_1.bUq().h(dbl_03);
        }
    }

    public static void itemDropOut(flc_2 flc_22) {
        cei_2.a((bmj_2)flc_22.getValue());
    }

    private static void a(bmj_2 bmj_22) {
        cei_2.a(bmj_22, (short)-1);
    }

    private static void a(bmj_2 bmj_22, short s) {
        dak_0 dak_02 = new dak_0(bmj_22);
        dak_02.az(s);
        aaw_1.bUq().h(dak_02);
    }

    public static void removeIngredient(flg_2 flg_22) {
        cei_2.a((bmj_2)flg_22.getItemValue(), (short)1);
    }

    public static void addIngredient(flg_2 flg_22) {
        dbl_0 dbl_02 = new dbl_0();
        dbl_02.setItem((ffV)flg_22.getItemValue());
        dbl_02.ak((short)1);
        dbl_02.lK(16019);
        aaw_1.bUq().h(dbl_02);
    }

    public static void selectRecipe(flp_2 flp_22, fey_2 fey_22, bmv_1 bmv_12) {
        if (flp_22.gEm()) {
            ceh_2.openProducedItemDescription(flp_22, bmv_12, fey_22);
            return;
        }
        dam_0 dam_02 = new dam_0(bmv_12);
        aaw_1.bUq().h(dam_02);
    }

    public static void startCraft(flp_2 flp_22, fce_2 fce_22) {
        boolean bl = fse_1.gFu().dp("craftRunning");
        if (!flp_22.gEk()) {
            fdd_2 fdd_22 = (fdd_2)flp_22.gBE();
            fdd_22.setSelected(bl);
            return;
        }
        if (bl) {
            dae_0.cV((short)19114);
        } else {
            aaw_1.bUq().h(new dan_0(fce_22, (fdd_2)flp_22.gBD()));
        }
    }

    public static boolean setCurrentCraftNumber(fiq_1 fiq_12, fdu_1 fdu_12) {
        String string = fdu_12.getText();
        if (string.length() == 0) {
            return true;
        }
        int n = Integer.parseInt(string);
        dae_0 dae_02 = new dae_0();
        dae_02.sY(n);
        dae_02.lK(18508);
        aaw_1.bUq().h(dae_02);
        return true;
    }

    public static boolean setCurrentCraftMaxNumber(fiq_1 fiq_12) {
        dae_0.cV((short)19236);
        return true;
    }

    public static void changeItemBackground(flp_2 flp_22, ffV ffV2) {
        cei_2.changeItemBackground(flp_22, ffV2, null);
    }

    public static void changeItemBackground(flp_2 flp_22) {
        String string = "";
        fes_2 fes_22 = (fes_2)flp_22.gBE();
        if (flp_22.gBy() == fzq_0.tJQ) {
            string = "itemSelectedBackground";
        } else if (flp_22.gBy() == fzq_0.tJR) {
            string = "itemBackground";
        }
        fes_22.setStyle(string);
    }

    public static void changeItemBackground(flp_2 flp_22, ffV ffV2, frx_1 frx_12) {
        String string = "";
        fes_2 fes_22 = (fes_2)flp_22.gBE();
        if (ffV2 != null) {
            if (flp_22.gBy() == fzq_0.tJQ) {
                string = "itemSelectedBackground";
            } else if (flp_22.gBy() == fzq_0.tJR) {
                string = ((bgv_2)ffV2.dOg()).dUs() ? "itemSetSelectedBackground" : "itemBackground";
            }
            fes_22.setStyle(string);
        }
        if (frx_12 != null) {
            if (flp_22.gBy() == fzq_0.tJQ) {
                cgn_1.showPopup(flp_22, ffV2, frx_12, fes_22);
            } else {
                cgn_1.closePopup(flp_22);
            }
        }
    }
}

