/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.Optional;

/*
 * Renamed from cFg
 */
@fyf_0
public class cfg_2 {
    public static final String PACKAGE = "wakfu.itemDetails";
    private static final long mVC = 500L;
    private static long mVD = -1L;

    public static void mount(fiq_1 fiq_12, Object object) {
        if (!(object instanceof ffV)) {
            return;
        }
        if (mVD != -1L && System.currentTimeMillis() - mVD < 500L) {
            return;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (!cdO.eug().au(bgt_02)) {
            return;
        }
        mVD = System.currentTimeMillis();
        bgt_0 bgt_03 = (bgt_0)fcI.ag(bgt_02.Xi(), ((ffV)object).LV());
        if (bgt_03 == null || bgt_03.Sn() != bgt_02.Sn()) {
            return;
        }
        cmk_0 cmk_02 = new cmk_0();
        aue_0.cVJ().etu().d(cmk_02);
    }

    public static void mergeSet(fiq_1 fiq_12, Object object) {
        if (object instanceof ffV) {
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            bkb_0 bkb_02 = bgt_02.dps();
            if (bkb_02 != null && bkb_02.dsm() == 24) {
                aPd.e("error.impossibleDuringExchange", new Object[0]);
                return;
            }
            fiq_0 fiq_02 = (fiq_0)object;
            dae_0 dae_02 = new dae_0();
            dae_02.lK(17503);
            dae_02.gj(fiq_02.LV());
            aaw_1.bUq().h(dae_02);
            fad_1 fad_12 = (fad_1)fiq_12.gBE();
            fym_0 fym_02 = fad_12.getAppearance();
            fym_02.gqS();
        }
    }

    public static void toggleCollapseBag(fiq_1 fiq_12, Object object, bgt_0 bgt_02) {
        if (!(object instanceof bdz_0)) {
            return;
        }
        ((bdz_0)object).dLG();
    }

    public static void inventoryMoveToExchange(fiq_1 fiq_12, Object object, bgt_0 bgt_02) {
        if (cup_1.eRM().dnj()) {
            return;
        }
        if (!(object instanceof bdh_0)) {
            return;
        }
        bso_0 bso_02 = bsl_0.jfZ.dFt();
        if (bso_02 == null) {
            return;
        }
        bdh_0 bdh_02 = (bdh_0)object;
        bde_0 bde_02 = bdh_02.dNO();
        if (bde_02 == null) {
            return;
        }
        long l = bso_02.Sn();
        bkb_0 bkb_02 = bgt_02.dps();
        if (bkb_02 == null || bkb_02.dsm() != 24) {
            return;
        }
        fiq_2.gCw().d(fik_2.b(string -> cec_2.transferBagContent(l, Collections.singletonList(bde_02))).l("exchange.confirm.transfer.bag.content", new Object[0]).abQ(2).vG(ccp_2.mRE.byf()).pd(true));
    }

    public static void openSetDetailWindow(fiq_1 fiq_12, fhv_1 fhv_12, Object object) {
        if (fiq_12.gBy() == fzq_0.tJU) {
            bEq bEq2;
            if (object instanceof ffV) {
                bEq2 = bEr.dSi().bW(((ffV)object).dOg().dpq());
            } else if (object instanceof bgv_2) {
                bEq2 = bEr.dSi().bW(((bgv_2)object).dpq());
            } else if (object instanceof bmv_1) {
                bEq2 = bEr.dSi().bW(((bmv_1)object).dxB().dpq());
            } else {
                return;
            }
            dbm_0 dbm_02 = new dbm_0();
            dbm_02.rb(fhv_12.getElementMap().getId());
            dbm_02.c(bEq2);
            aaw_1.bUq().h(dbm_02);
        }
    }

    public static void openItemDetailWindow(flg_2 flg_22) {
        Object object = flg_22.getItemValue();
        if (!(object instanceof ffV)) {
            return;
        }
        ffV ffV2 = (ffV)object;
        if (ffV2 == null) {
            return;
        }
        if (flg_22.gEm()) {
            dbk_0 dbk_02 = new dbk_0();
            dbk_02.lK(16264);
            dbk_02.rb(((fhv_1)flg_22.gBD()).getElementMap().getId());
            dbk_02.c(ffV2);
            aaw_1.bUq().h(dbk_02);
        }
    }

    public static void openChoseElementsDialog(fiq_1 fiq_12, ffV ffV2) {
        if (ffV2.dOg().fYA()) {
            ctj_2.b(ffV2, null);
        }
    }

    public static void openStuffPreviewWindow(fiq_1 fiq_12, Object object) {
        if (object instanceof bmv_1) {
            ((bmv_1)object).dxB().dUv();
            return;
        }
        ffV ffV2 = object instanceof bjm_0 ? ((bjm_0)object).eai() : (ffV)object;
        if ("inventoryDialog".equals(((fhv_1)fiq_12.gBE()).getElementMap().getId())) {
            ctd_2.eQA().a(ffV2, cvo_2.daL());
        } else {
            ctd_2.eQA().bB(ffV2);
        }
    }

    public static void openInEncyclopedia(fiq_1 fiq_12, ffV ffV2) {
        cuj_2.eRB().a((bgv_2)ffV2.dOg());
    }

    public static void openInEncyclopedia(fiq_1 fiq_12, bjm_0 bjm_02) {
        cuj_2.eRB().a((bgv_2)bjm_02.eai().dOg());
    }

    public static void processText(fiq_1 fiq_12, fes_2 fes_22, frx_1 frx_12) {
        cgz_2.processText(fiq_12, fes_22, frx_12);
    }

    public static void onSublimationHover(fiq_1 fiq_12, ffV ffV2, frx_1 frx_12, fes_2 fes_22) {
        if (!ffV2.dXg()) {
            return;
        }
        int n = ffV2.eAZ().ahy();
        if (n <= 0) {
            return;
        }
        cfg_2.displaySublimationPopup(n, frx_12, fes_22);
    }

    public static void onSpecialSublimationHover(fiq_1 fiq_12, ffV ffV2, frx_1 frx_12, fes_2 fes_22) {
        if (!ffV2.dXg()) {
            return;
        }
        int n = ffV2.eAZ().ahA();
        if (n <= 0) {
            return;
        }
        cfg_2.displaySublimationPopup(n, frx_12, fes_22);
    }

    public static void displaySublimationPopup(int n, frx_1 frx_12, fes_2 fes_22) {
        Optional<bmq_0> optional = cfg_2.getState(n);
        if (optional.isEmpty()) {
            return;
        }
        fse_1.gFu().f("describedState", optional.get());
        fyd_0.popup(frx_12, fes_22);
        fes_22.a(fzq_0.tJY, new cfh_1(fes_22), true);
    }

    public static void onSublimationClick(fiq_1 fiq_12, ffV ffV2) {
        if (!ffV2.dXg()) {
            return;
        }
        int n = ffV2.eAZ().ahy();
        if (n <= 0) {
            return;
        }
        cfg_2.toggleSublimationDialog(n, (fes_2)fiq_12.gBE());
    }

    public static void onSpecialSublimationClick(fiq_1 fiq_12, ffV ffV2) {
        if (!ffV2.dXg()) {
            return;
        }
        int n = ffV2.eAZ().ahA();
        if (n <= 0) {
            return;
        }
        cfg_2.toggleSublimationDialog(n, (fes_2)fiq_12.gBE());
    }

    public static void toggleSublimationDialog(int n, fes_2 fes_22) {
        Optional<bmq_0> optional = cfg_2.getState(n);
        if (optional.isEmpty()) {
            return;
        }
        dbo dbo2 = new dbo();
        dbo2.b(optional.get());
        dbo2.fa(fes_22.getElementMap().getId());
        aaw_1.bUq().h(dbo2);
    }

    public static Optional<bmq_0> getState(int n) {
        bgv_2 bgv_22 = (bgv_2)fgD.fXh().Vd(n);
        if (bgv_22.bcx().aVo() == 0) {
            return Optional.empty();
        }
        enk_0 enk_02 = bgv_22.bcx().vK(0);
        int n2 = (int)enk_02.Rz(0);
        short s = (short)enk_02.Rz(1);
        bmq_0 bmq_02 = (bmq_0)fqX.gjM().Zr(n2);
        if (bmq_02 == null) {
            return Optional.empty();
        }
        if (bmq_02.cmL() != s) {
            bmq_02 = bmq_02.cl(s);
        }
        return Optional.of(bmq_02);
    }

    public static void openLinkedCraft(fiq_1 fiq_12, Object object) {
        if (fiq_12.gBy() == fzq_0.tJU) {
            bgv_2 bgv_22;
            if (object instanceof ffV) {
                bgv_22 = (bgv_2)((ffV)object).dOg();
            } else if (object instanceof bgv_2) {
                bgv_22 = (bgv_2)object;
            } else if (object instanceof bmv_1) {
                bgv_22 = ((bmv_1)object).dxB();
            } else {
                return;
            }
            dae_0 dae_02 = new dae_0();
            dae_02.lK(16776);
            dae_02.sY(bgv_22.d());
            aaw_1.bUq().h(dae_02);
        }
    }

    public static void openItemRecipes(fiq_1 fiq_12, Object object) {
        if (fiq_12.gBy() == fzq_0.tJU) {
            fhc_0 fhc_02;
            if (object instanceof ffV) {
                fhc_02 = ((ffV)object).dOg();
            } else if (object instanceof fhc_0) {
                fhc_02 = (fhc_0)object;
            } else if (object instanceof bmv_1) {
                fhc_02 = ((bmv_1)object).dxB();
            } else {
                return;
            }
            if (fhc_02 == null) {
                return;
            }
            dae_0 dae_02 = new dae_0();
            dae_02.lK(19505);
            dae_02.sY(fhc_02.d());
            aaw_1.bUq().h(dae_02);
        }
    }

    public static void closeWindow(fiq_1 fiq_12, fhv_1 fhv_12) {
        if (fiq_12.gBy() == fzq_0.tJU) {
            dbk_0 dbk_02 = new dbk_0();
            dbk_02.lK(16264);
            dbk_02.rb(fhv_12.getElementMap().getId());
            aaw_1.bUq().h(dbk_02);
        }
    }

    public static void setItemLevel(flw_2 flw_22) {
        fhs_2 fhs_22 = ((fhv_1)flw_22.gBE()).getElementMap();
        if (fhs_22 == null) {
            return;
        }
        Object object = fse_1.gFu().aW("itemDetail", fhs_22.getId());
        if (object == null) {
            return;
        }
        if (object instanceof bgv_2) {
            return;
        }
        if (object instanceof bjm_0) {
            return;
        }
        ffV ffV2 = (ffV)object;
        if (!ffV2.pe()) {
            return;
        }
        fij_0 fij_02 = ffV2.fVV();
        short s = (short)flw_22.getValue();
        if (s > fij_02.dnH().aVe()) {
            s = fij_02.dnH().aVe();
        }
        cfg_2.a(s, fhs_22);
    }

    public static void keyType(fiq_1 fiq_12, fdz_1 fdz_12) {
        fhs_2 fhs_22 = ((fhv_1)fiq_12.gBE()).getElementMap();
        if (fhs_22 == null) {
            return;
        }
        ffV ffV2 = (ffV)fse_1.gFu().aW("itemDetail", fhs_22.getId());
        if (ffV2 == null) {
            return;
        }
        if (!ffV2.pe()) {
            return;
        }
        fij_0 fij_02 = ffV2.fVV();
        if (fdz_12.getText().length() == 0) {
            return;
        }
        short s = Bw.r(fdz_12.getText());
        if (s > fij_02.dnH().aVe()) {
            s = fij_02.dnH().aVe();
        }
        cfg_2.a(s, fhs_22);
    }

    public static void restore(fiq_1 fiq_12) {
        fhs_2 fhs_22 = ((fhv_1)fiq_12.gBE()).getElementMap();
        if (fhs_22 == null) {
            return;
        }
        bha_2 bha_22 = (bha_2)fse_1.gFu().aW("itemLevelController", fhs_22.getId());
        bha_22.dUJ();
    }

    private static void a(short s, fhs_2 fhs_22) {
        bha_2 bha_22 = (bha_2)fse_1.gFu().aW("itemLevelController", fhs_22.getId());
        bha_22.bw(s);
    }

    public static void openEnchantmentFrame(flg_2 flg_22, Object object) {
        if (!(object instanceof ffV)) {
            return;
        }
        cui_1.eRw().bC((ffV)object);
    }

    public static void changeItemBackground(flp_2 flp_22, ffV ffV2) {
        cfg_2.changeItemBackground(flp_22, ffV2, null);
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
                string = "itemBackground";
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

    public static void showItemDetails(flg_2 flg_22, faw_2 faw_22) {
        ffT ffT2 = (ffT)flg_22.getItemValue();
        frx_1 frx_12 = (frx_1)faw_22.getElementMap().uH("itemDetailPopup");
        if (flg_22.gBy() == fzq_0.tJE && !fbj_1.getInstance().isDragging()) {
            fse_1.gFu().f("itemPopupDetail", ffT2);
            fse_1.gFu().f("isFromShortcut", false);
            fyd_0.popup(frx_12, (fes_2)flg_22.gBE());
        } else if (flg_22.gBy() == fzq_0.tJD) {
            fse_1.gFu().f("itemPopupDetail", (Object)null);
            fse_1.gFu().f("isFromShortcut", false);
            fse_1.gFu().f("isFromEquipedShortcut", false);
            fyd_0.closePopup(flg_22, frx_12);
        }
    }

    public static void deleteItem(fiq_1 fiq_12, ffV ffV2) {
        cfe_1.deleteItem(ffV2);
    }

    public static void useItem(fiq_1 fiq_12) {
        cfe_1.useItem(fiq_12);
    }

    public static void mimiSymbicUnmake(fiq_1 fiq_12) {
        cfe_1.mimiSymbicUnmake(fiq_12);
    }

    public static void regenWith(fiq_1 fiq_12) {
        cfe_1.regenWith(fiq_12);
    }
}

