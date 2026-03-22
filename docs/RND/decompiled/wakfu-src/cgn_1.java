/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cGN
 */
@fyf_0
public class cgn_1 {
    public static final String PACKAGE = "wakfu.popupInfos";

    public static void showPopup(fiq_1 fiq_12, frx_1 frx_12) {
        cgn_1.showPopup(fiq_12, frx_12, null);
    }

    public static void showPopup(fiq_1 fiq_12, frx_1 frx_12, fes_2 fes_22) {
        Object object;
        if (fiq_12 instanceof flg_2 && (object = ((flg_2)fiq_12).getItemValue()) instanceof aef_2) {
            cgn_1.showPopup(fiq_12, (aef_2)object, frx_12, fes_22);
            return;
        }
        cgn_1.showPopup(fiq_12, null, frx_12, fes_22);
    }

    public static void showPopup(fiq_1 fiq_12, aef_2 aef_22, frx_1 frx_12) {
        cgn_1.showPopup(fiq_12, aef_22, frx_12, null);
    }

    public static void showPopup(fiq_1 fiq_12, aef_2 aef_22, frx_1 frx_12, fes_2 fes_22) {
        if (aef_22 instanceof blb_2) {
            cgn_1.e((blb_2)aef_22);
        } else if (aef_22 instanceof bmb_1) {
            fse_1.gFu().f("osamodasSymbiot.describedCreature", aef_22);
        } else if (aef_22 instanceof bEq || aef_22 instanceof ffV || aef_22 instanceof bgv_2 || aef_22 instanceof btx) {
            fse_1.gFu().f("itemPopupDetail", aef_22);
        } else if (aef_22 instanceof beg_1) {
            fhc_0 fhc_02 = ((beg_1)aef_22).dOg();
            fse_1.gFu().f("itemPopupDetail", fhc_02);
        } else if (aef_22 instanceof bei_1) {
            bei_1 bei_12 = (bei_1)aef_22;
            if (bei_12.dRY() instanceof ffV) {
                fse_1.gFu().f("itemPopupDetail", bei_12.dRY());
            }
        } else if (aef_22 instanceof bMn) {
            fse_1.gFu().a("describedRunningEffect", (Object)aef_22, ((fhv_1)fiq_12.gBE()).getElementMap());
        } else if (aef_22 instanceof bgj) {
            bgj bgj2 = (bgj)aef_22;
            fse_1.gFu().a("displayedAchievement", (Object)bgj2, ((fhv_1)fiq_12.gBE()).getElementMap());
        } else if (aef_22 instanceof bkk_0) {
            bkk_0 bkk_02 = (bkk_0)aef_22;
            fse_1.gFu().a("displayedAchievement", (Object)bgk.hZN.Cx(bkk_02.clS()), ((fhv_1)fiq_12.gBE()).getElementMap());
        } else if (aef_22 instanceof bkl_0) {
            fse_1.gFu().f("climateDetail", aef_22);
        } else if (aef_22 instanceof bmv_1) {
            fse_1.gFu().f("overRecipe", aef_22);
        } else if (frx_12.getId().equals("itemDetailPopup")) {
            fse_1.gFu().f("itemPopupDetail", aef_22);
        }
        if (fes_22 == null) {
            fyd_0.popup(fiq_12, frx_12);
        } else {
            fyd_0.popup(fiq_12, frx_12, fes_22);
        }
    }

    public static void closePopup(fiq_1 fiq_12) {
        fbj_1.getInstance().getPopupContainer().eKH();
        fse_1.gFu().vX("describedSpell");
        fse_1.gFu().vX("describedSpellRealLevel");
        fse_1.gFu().vX("currentDescribedContainer");
        fse_1.gFu().vX("handsOfWeapon");
        fse_1.gFu().vX("itemPopupDetail");
        fse_1.gFu().vX("isFromEquipedShortcut");
        fse_1.gFu().vX("isFromShortcut");
        fse_1.gFu().vX("currentDescribedChallenge");
        fbj_1.getInstance().getPopupContainer().eKH();
    }

    private static void e(blb_2 blb_22) {
        RT rT;
        bgt_0 bgt_02;
        bgy bgy2 = bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02.djT() && bgt_02.dkZ() != null) {
            if (bgt_02.dkZ().dGQ().bhE() && bgt_02.dkZ().dGQ().dIA().Sn() == bgt_02.Sn()) {
                bgy2 = bgt_02.dkZ().dGQ().dIA();
            }
            if (bgy2 == null) {
                bgy2 = bgt_02;
            }
        }
        if (blb_22.gih() == fqu_0.sTq) {
            rT = ((bgy)bgy2).jr(blb_22.LV());
            fse_1.gFu().f("describedSpell", rT);
            fse_1.gFu().f("describedSpellRealLevel", ((fqE)rT).cmL());
        }
        if (blb_22.gih() == fqu_0.sTt) {
            if (!fbj_1.getInstance().isDragging()) {
                if (blb_22.avr() == 2145) {
                    rT = new ffV(-1L);
                    Object r = fgD.fXh().Vd(2145);
                    ((ffV)rT).l((fhc_0)r);
                    ((ffV)rT).ak((short)1);
                } else {
                    rT = (ffV)bgt_02.doC().dN(blb_22.LV());
                    if (rT == null) {
                        rT = ((exP)bgt_02).dod().tb(blb_22.LV());
                    }
                }
                fse_1.gFu().f("handsOfWeapon", "twoHands");
                fse_1.gFu().f("itemPopupDetail", rT);
                fse_1.gFu().f("isFromEquipedShortcut", true);
            } else {
                fse_1.gFu().f("itemPopupDetail", (Object)null);
                fse_1.gFu().f("isFromEquipedShortcut", false);
                fse_1.gFu().f("isFromShortcut", false);
                fse_1.gFu().f("handsOfWeapon", "none");
            }
        }
        if (blb_22.gih() == fqu_0.sTs) {
            rT = (ffV)aue_0.cVJ().cVK().doC().pc(blb_22.avr());
            if (rT != null) {
                short s = aue_0.cVJ().cVK().doC().dK(((ffV)rT).LV());
                if (s == 15 || s == 16) {
                    if (!fbj_1.getInstance().isDragging()) {
                        if (s == 15) {
                            if (((ffV)rT).dOg().fYp()) {
                                fse_1.gFu().f("handsOfWeapon", "twoHands");
                            } else {
                                fse_1.gFu().f("handsOfWeapon", "rightHand");
                            }
                        } else if (s == 16) {
                            fse_1.gFu().f("handsOfWeapon", "leftHand");
                        }
                        fse_1.gFu().f("itemPopupDetail", rT);
                        fse_1.gFu().f("isFromEquipedShortcut", true);
                    } else {
                        fse_1.gFu().f("itemPopupDetail", (Object)null);
                        fse_1.gFu().f("isFromEquipedShortcut", false);
                        fse_1.gFu().f("isFromShortcut", false);
                        fse_1.gFu().f("handsOfWeapon", "none");
                    }
                } else {
                    fse_1.gFu().f("isFromShortcut", false);
                    if (((ffV)rT).isUsable()) {
                        fse_1.gFu().f("isFromEquipedShortcut", true);
                    } else {
                        fse_1.gFu().f("isFromEquipedShortcut", false);
                    }
                    fse_1.gFu().f("itemPopupDetail", rT);
                }
            } else {
                rT = aue_0.cVJ().cVK().dno().UK(blb_22.avr());
                if (rT != null) {
                    if (!fbj_1.getInstance().isDragging()) {
                        fse_1.gFu().f("itemPopupDetail", rT);
                        fse_1.gFu().f("isFromShortcut", true);
                    } else {
                        fse_1.gFu().f("itemPopupDetail", (Object)null);
                        fse_1.gFu().f("isFromShortcut", false);
                        fse_1.gFu().f("isFromEquipedShortcut", false);
                    }
                }
            }
        }
    }

    public static void showPopup(fiq_1 fiq_12, aef_2 aef_22, String string) {
        cgn_1.showPopup(aef_22, Integer.parseInt(string));
    }

    public static void showPopup(aef_2 aef_22, int n) {
        dco_0 dco_02 = new dco_0(aef_22);
        dco_02.sY(n);
        dco_02.lK(16470);
        aaw_1.bUq().h(dco_02);
    }

    public static void hidePopup(flg_2 flg_22) {
        Object object = flg_22.getItemValue();
        if (object instanceof aef_2) {
            cgn_1.hidePopup(flg_22, (aef_2)object);
        }
    }

    public static void hidePopup(fiq_1 fiq_12, aef_2 aef_22) {
        dco_0 dco_02 = new dco_0(aef_22);
        dco_02.lK(17603);
        aaw_1.bUq().h(dco_02);
    }
}

