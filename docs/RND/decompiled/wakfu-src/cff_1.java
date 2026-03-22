/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cFf
 */
@fyf_0
public class cff_1
extends cdu_1 {
    public static final int mVA = 0;
    public static final int mVB = 7;

    public static void openItemDetailWindow(flg_2 flg_22, fey_2 fey_22, bgl_0 bgl_02) {
        cff_1.openItemDetailWindow(flg_22, fey_22, bgl_02.dcP());
    }

    public static void openItemDetailWindow(flg_2 flg_22, fey_2 fey_22, bgy bgy2) {
        Object object = flg_22.getItemValue();
        if (aPe.a(flg_22)) {
            aPe.ag(object);
            return;
        }
        if (object instanceof bee_0) {
            cff_1.openItemDetailWindow(flg_22, fey_22);
        }
    }

    public static void openItemDetailWindow(flg_2 flg_22, fey_2 fey_22) {
        ffV ffV2;
        Object object = flg_22.getItemValue();
        if (object instanceof bEb) {
            return;
        }
        if (object instanceof bdh_0) {
            bde_0 bde_02 = ((bdh_0)object).dNO();
            Object r = fgD.fXh().Vd(bde_02.avr());
            ffV2 = new ffV(bde_02.Lx());
            ffV2.l((fhc_0)r);
        } else {
            ffV2 = object instanceof bee_0 ? ((bee_0)object).dSy() : (object instanceof bgp_1 ? ((bgp_1)object).getItem() : (ffV)object);
        }
        if (ffV2 == null) {
            return;
        }
        if (aPe.a(flg_22)) {
            aPe.ag(object);
            return;
        }
        cff_1.openItemDetailWindow((flp_2)flg_22, fey_22, ffV2);
    }

    public static void openItemDetailWindow(flp_2 flp_22, fey_2 fey_22, ffV ffV2) {
        fhs_2 fhs_22 = fey_22.getElementMap();
        if (fhs_22 == null) {
            return;
        }
        if (flp_22.gEm()) {
            Object object;
            if (ffV2.adO()) {
                object = new bjm_0(ffV2);
                cff_1.customizePet((bjm_0)object, fey_22);
            } else {
                cff_1.showItemPopupMenu(ffV2, fey_22);
            }
            object = (fbz_2)fhs_22.uH("itemList");
            if (object != null) {
                ((fbz_2)object).setSelectedValue(null);
            }
        }
    }

    public static void openItemDetailWindow(flp_2 flp_22, fey_2 fey_22, bgp_1 bgp_12) {
        ffS ffS2 = bgp_12.dTQ();
        ffV ffV2 = bgp_12.getItem();
        if (ffV2 == null) {
            return;
        }
        if (aPe.a(flp_22)) {
            aPe.a((ejl_0)ffV2);
            return;
        }
        cff_1.openItemDetailWindow(flp_22, fey_22, ffV2);
    }

    public static void changeDirection(flp_2 flp_22, fax_1 fax_12, String string) {
        cff_1.a(flp_22, fax_12, Integer.valueOf(string));
    }

    private static void a(flp_2 flp_22, fax_1 fax_12, int n) {
        int n2 = flp_22.fca();
        if (n2 != 1 && n2 != 3) {
            return;
        }
        int n3 = n2 == 1 ? -n : n;
        int n4 = (fax_12.getDirection() + n3) % 8;
        if (n4 < 0) {
            n4 = 7;
        }
        fax_12.setDirection(n4);
    }

    public static void changeDirection(flp_2 flp_22, fax_1 fax_12) {
        cff_1.a(flp_22, fax_12, 1);
    }

    public static void customizePet(bjm_0 bjm_02, fey_2 fey_22) {
        dbo_0<bjm_0> dbo_02 = new dbo_0<bjm_0>(bjm_02);
        dbo_02.lK(17533);
        dbo_02.rb(fey_22 == null ? "inventoryDialog" : fey_22.getElementMap().getId());
        aaw_1.bUq().h(dbo_02);
    }

    public static void showItemPopupMenu(ffV ffV2, fey_2 fey_22) {
        dbk_0 dbk_02 = new dbk_0();
        dbk_02.lK(16264);
        dbk_02.rb(fey_22 != null ? fey_22.getElementMap().getId() : null);
        dbk_02.c(ffV2);
        aaw_1.bUq().h(dbk_02);
    }

    public static void changePetItemBackground(flp_2 flp_22, frx_1 frx_12) {
        String string = "";
        fhs_2 fhs_22 = ((fhv_1)flp_22.gBE()).getElementMap();
        fes_2 fes_22 = (fes_2)fhs_22.uH("petContainer");
        if (flp_22.gBy() == fzq_0.tJQ) {
            string = "itemSelectedBackground";
        } else if (flp_22.gBy() == fzq_0.tJR) {
            string = fse_1.gFu().i("pet", fhs_22) != null ? "itemSelectedBackground" : "itemBackground";
        }
        fes_22.setStyle(string);
        if (frx_12 != null) {
            if (flp_22.gBy() == fzq_0.tJQ) {
                fyd_0.popup((fiq_1)flp_22, frx_12, fes_22);
            } else {
                fyd_0.closePopup(flp_22);
            }
        }
    }

    public static void changeItemBackground(flp_2 flp_22, bgl_0 bgl_02, ffV ffV2, String string, fey_2 fey_22, frx_1 frx_12, boolean bl) {
        fgd_0 fgd_02;
        String string2 = "";
        fes_2 fes_22 = (fes_2)flp_22.gBE();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        fgd_0 fgd_03 = fgd_02 = bgl_02 == null ? bgt_02.doC() : bgl_02.dme();
        if (bsl_0.jfZ.dFt() != null && fse_1.gFu().vY("exchange.sourceBag") instanceof bde_0) {
            return;
        }
        if (string != null) {
            ffV2 = (ffV)fgd_02.ai(Short.parseShort(string));
        }
        if (ffV2 != null) {
            boolean bl2 = false;
            if (flp_22.gBy() == fzq_0.tJQ) {
                bl2 = true;
                string2 = ffV2.dOg().dpq() != 0 ? "itemSetSelectedBackground" : "itemSelectedBackground";
            } else if (flp_22.gBy() == fzq_0.tJR) {
                string2 = bEf.az(ffV2);
            }
            fes_22.setStyle(string2);
            if (bl && ffV2.dOg().dpq() != 0) {
                fgd_0 fgd_04 = fgd_02;
                for (ffV ffV3 : fgd_04) {
                    fes_2 fes_23;
                    if (ffV3.dOg().dpq() != ffV2.dOg().dpq()) continue;
                    short s = fgd_02.e(ffV3);
                    fhs_2 fhs_22 = fey_22.getElementMap();
                    fcv_1 fcv_12 = (fcv_1)fhs_22.uH("EquipRC" + s);
                    if (fcv_12 == null || (fes_23 = (fes_2)fcv_12.getInnerElementMap().uH("Equip" + s)) == null) continue;
                    string2 = bl2 ? "itemSetSelectedBackground" : bEf.b(ffV3, fhs_22.getId());
                    fes_23.setStyle(string2);
                }
            }
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

