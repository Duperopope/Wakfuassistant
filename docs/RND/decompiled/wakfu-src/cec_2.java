/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from cEC
 */
@fyf_0
public class cec_2 {
    public static final String PACKAGE = "wakfu.exchange";
    private static final Logger mVb = Logger.getLogger(cec_2.class);
    private static aao_2 mUy;

    public static void setReadyForExchange(flp_2 flp_22, Long l) {
        long l2;
        fdd_2 fdd_22 = (fdd_2)flp_22.gBE();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bso_0 bso_02 = bsl_0.jfZ.dFt();
        fdu_1 fdu_12 = (fdu_1)((fhv_1)flp_22.gBE()).getElementMap().uH("exchangeKamasEditor");
        String string = fdu_12.getText();
        bsp_0 bsp_02 = (bsp_0)bso_02.dP(bgt_02.Sn());
        long l3 = l2 = string.length() == 0 ? 0L : aum_0.cWf().cQ(string);
        if (bsp_02.beL() != l2) {
            return;
        }
        if (bso_02.dFE() == ett_0.rqv) {
            dbi_0 dbi_02 = new dbi_0();
            dbi_02.setExchangeId(l);
            aaw_1.bUq().h(dbi_02);
        } else {
            cec_2.showErrorMessage(bso_02);
            fdd_22.setSelected(false);
        }
    }

    public static void dragItem(flu_1 flu_12, Long l) {
        Object object;
        if (fyw_0.gqw().to("splitStackDialog")) {
            fyw_0.gqw().tl("splitStackDialog");
        }
        if ((object = flu_12.getValue()) != null && object instanceof ffV) {
            ffV ffV2 = (ffV)object;
            bso_0 bso_02 = bsl_0.jfZ.dFt();
            if (bso_02 != null) {
                bso_02.kl(ffV2.LV());
            }
        }
    }

    public static void transferAllItems(flp_2 flp_22, Long l) {
        if (cup_1.eRM().dnj()) {
            return;
        }
        fiq_2.gCw().d(fik_2.b(string -> {
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            ArrayList<ffs_0> arrayList = bgt_02.dno().dRA();
            cec_2.transferBagContent(l, arrayList);
        }).l("exchange.confirm.transfer.all.inventory", new Object[0]).vG(ccp_2.mRE.byf()).abQ(2).pd(true));
    }

    public static void transferBagContent(long l, List<ffs_0> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        dbg_0 dbg_02 = new dbg_0();
        dbg_02.lK(19601);
        dbg_02.setExchangeId(l);
        for (ffs_0 ffs_02 : list) {
            for (ffV ffV2 : ffs_02) {
                if (!ffV2.fWi().fZt() || ffV2.dXg() || ffs_02.fVb().a(ffV2)) continue;
                dbg_02.bf(ffV2);
            }
        }
        if (dbg_02.exR().isEmpty()) {
            return;
        }
        cup_1.eRM().fY(true);
        aaw_1.bUq().h(dbg_02);
    }

    public static void removeExchangeContent(fiq_1 fiq_12, Long l) {
        if (cup_1.eRM().dnj()) {
            return;
        }
        fiq_2.gCw().d(fik_2.b(string -> {
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            bso_0 bso_02 = bsl_0.jfZ.dFt();
            bsp_0 bsp_02 = (bsp_0)bso_02.dP(bgt_02.Sn());
            if (bsp_02 == null || bsp_02.beK() == null) {
                return;
            }
            dbg_0 dbg_02 = new dbg_0();
            dbg_02.lK(18792);
            dbg_02.setExchangeId(l);
            for (ffV ffV2 : bsp_02.beW()) {
                dbg_02.bf(ffV2);
            }
            if (dbg_02.exR().isEmpty()) {
                return;
            }
            cup_1.eRM().fY(true);
            aaw_1.bUq().h(dbg_02);
        }).l("exchange.confirm.remove.exchange.content", new Object[0]).vG(ccp_2.mRE.byf()).abQ(2).pd(true));
    }

    public static void dropItem(fla_2 fla_22, Long l) {
        fhn_1.gzT().bYz();
        Object object = fla_22.getValue();
        if (object instanceof ffV) {
            ffV ffV2 = (ffV)object;
            if (bdq_0.dRC().ab(ffV2)) {
                return;
            }
            bso_0 bso_02 = bsl_0.jfZ.dFt();
            if (bso_02.dFv() == ffV2.LV()) {
                return;
            }
            Optional<bgx_1> optional = cfe_1.getSelectionContainingItem(fla_22, ffV2);
            if (optional.isPresent()) {
                dbg_0 dbg_02 = new dbg_0();
                dbg_02.lK(19601);
                dbg_02.setExchangeId(l);
                optional.get().dUG().forEach(dbg_02::bf);
                aaw_1.bUq().h(dbg_02);
                return;
            }
            boolean bl = fla_22.gDT();
            boolean bl2 = ((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljt);
            if (!cup_1.eRM().bE(ffV2)) {
                aPd.e("exchange.itemUnexchangeable", new Object[0]);
                return;
            }
            if (ffV2.bfd() > 1 && bl ^ bl2) {
                che_1.setMaxQuantity(ffV2.bfd());
                che_1.setItem(ffV2);
                che_1.setExchangeId(l);
                che_1.setMessageType((short)17012);
                dbl_0 dbl_02 = new dbl_0();
                dbl_02.setItem(ffV2);
                dbl_02.cY((short)fla_22.getScreenX());
                dbl_02.cZ((short)fla_22.getScreenY());
                dbl_02.lK(16021);
                aaw_1.bUq().h(dbl_02);
            } else {
                dbf_0 dbf_02 = new dbf_0();
                dbf_02.lK(17012);
                dbf_02.setExchangeId(l);
                dbf_02.setItem((ffV)object);
                dbf_02.NN(ffV2.bfd());
                aaw_1.bUq().h(dbf_02);
            }
        }
    }

    public static void dropOut(fiq_1 fiq_12, Long l) {
        flc_2 flc_22;
        Object object;
        if (fiq_12 instanceof flc_2 && (object = (flc_22 = (flc_2)fiq_12).getValue()) != null && object instanceof ffV) {
            ffV ffV2 = (ffV)object;
            bso_0 bso_02 = bsl_0.jfZ.dFt();
            if (bso_02 != null) {
                bso_02.kl(-1L);
            }
            boolean bl = flc_22.gDT();
            boolean bl2 = ((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljt);
            if (ffV2.bfd() > 1 && bl ^ bl2) {
                che_1.setMaxQuantity(ffV2.bfd());
                che_1.setItem(ffV2);
                che_1.setExchangeId(l);
                che_1.setMessageType((short)19598);
                dbl_0 dbl_02 = new dbl_0();
                dbl_02.setItem(ffV2);
                dbl_02.cY((short)flc_22.getScreenX());
                dbl_02.cZ((short)flc_22.getScreenY());
                dbl_02.lK(16021);
                aaw_1.bUq().h(dbl_02);
            } else {
                dbf_0 dbf_02 = new dbf_0();
                dbf_02.lK(19598);
                dbf_02.setExchangeId(l);
                dbf_02.setItem(ffV2);
                dbf_02.NN(ffV2.bfd());
                aaw_1.bUq().h(dbf_02);
            }
        }
    }

    public static void removeItem(flg_2 flg_22, Long l) {
        Object object = flg_22.getItemValue();
        if (object != null && object instanceof ffV) {
            ffV ffV2 = (ffV)object;
            dbf_0 dbf_02 = new dbf_0();
            dbf_02.lK(19598);
            dbf_02.setExchangeId(l);
            dbf_02.setItem(ffV2);
            dbf_02.NN(ffV2.bfd());
            aaw_1.bUq().h(dbf_02);
            bso_0 bso_02 = bsl_0.jfZ.dFt();
            if (bso_02 != null) {
                bso_02.kl(-1L);
            }
        }
    }

    public static void exchangeMoney(fiq_1 fiq_12, Long l) {
        if (fiq_12 instanceof fli_2 && ((fli_2)fiq_12).bCC() != 10) {
            return;
        }
        cec_2.exchangeMoney(l);
    }

    public static void valueChanged(fli_2 fli_22, Long l) {
        if (fli_22.gDQ()) {
            return;
        }
        dae_0 dae_02 = new dae_0(19004);
        dae_02.gj(aum_0.cWf().cQ(((fdu_1)fli_22.gBD()).getText()));
        aaw_1.bUq().h(dae_02);
    }

    public static void exchangeMoney(Long l) {
        dbh_0 dbh_02 = new dbh_0();
        dbh_02.setExchangeId(l);
        dbh_02.lK(19012);
        aaw_1.bUq().h(dbh_02);
    }

    public static void openItemDetailWindow(flg_2 flg_22, fey_2 fey_22) {
        if (flg_22.gEm()) {
            Object object = flg_22.getItemValue();
            if (object instanceof ffV) {
                cdd_2.sendOpenCloseItemDetailMessage(fey_22.getElementMap().getId(), (ffV)object);
            } else if (object instanceof bgv_2) {
                cdd_2.sendOpenCloseItemDetailMessage(fey_22.getElementMap().getId(), (bgv_2)object);
            }
        }
    }

    public static void showErrorMessage(bso_0 bso_02) {
        String string;
        Object object;
        if (bso_02.dFE() == ett_0.rqv) {
            mVb.error((Object)"On veut afficher un message d'erreur pour un \u00e9change valide");
            return;
        }
        if (bso_02.dFE() == ett_0.rqw) {
            object = bso_02.bfm();
            string = "inventoryFull";
        } else if (bso_02.dFE() == ett_0.rqx) {
            object = bso_02.bfn();
            string = "inventoryFull";
        } else if (bso_02.dFE() == ett_0.rqz) {
            object = bso_02.bfm();
            string = "objectDoesntExist";
        } else if (bso_02.dFE() == ett_0.rqA) {
            object = bso_02.dFG();
            string = "tooMuchKamas";
        } else {
            object = bso_02.bfn();
            string = "objectDoesntExist";
        }
        fiq_2.gCw().d(fik_2.gBZ().l("exchange.error." + string, object.getName()).abQ(1).vG(ccp_2.mRF.byf()));
    }

    public static void closeExchangeDialog(fiq_1 fiq_12, Long l) {
        Object object;
        boolean bl = false;
        switch (fiq_12.gBy()) {
            case tJF: 
            case tJH: {
                break;
            }
            case tJG: {
                object = (fli_2)fiq_12;
                bl = ((fli_2)object).bCC() == 27;
                break;
            }
            case tJU: {
                bl = true;
            }
        }
        if (bl) {
            object = new dae_0();
            ((ama_1)object).lK(19944);
            ((ama_1)object).gj(l);
            aaw_1.bUq().h((aam_2)object);
            cup_1.eRM().fY(false);
        }
    }

    public static void onMouseOverExhange(fiq_1 fiq_12) {
        fcv_1 fcv_12;
        fhv_1 fhv_12;
        if (fbj_1.getInstance().isDragging() && (fhv_12 = fbj_1.getInstance().getDragged().getParent()) instanceof fcv_1 && (fcv_12 = (fcv_1)fhv_12).getItemValue() instanceof ffV) {
            ffV ffV2 = (ffV)fcv_12.getItemValue();
            if (!cup_1.eRM().bE(ffV2)) {
                fhn_1.gzT().a(fzo_0.tHs, true);
            }
        }
    }

    public static void showItemDetailPopup(flg_2 flg_22, fey_2 fey_22) {
        Object object = flg_22.getItemValue();
        if (!(object instanceof ffV)) {
            return;
        }
        if (flg_22.gBy() == fzq_0.tJE) {
            frx_1 frx_12 = (frx_1)fey_22.getElementMap().uH("itemDetailPopup");
            fse_1.gFu().f("itemPopupDetail", flg_22.getItemValue());
            fyd_0.popup(flg_22, frx_12);
        } else if (flg_22.gBy() == fzq_0.tJD) {
            fyd_0.closePopup(flg_22);
        }
    }
}

