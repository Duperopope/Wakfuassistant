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
 * Renamed from cDb
 */
@fyf_0
public class cdb_2 {
    public static final String PACKAGE = "wakfu.accountChest";
    private static final Logger mSE = Logger.getLogger(cdb_2.class);
    public static final String mSF = "compartmentName";
    public static final String mSG = "compartmentColor";
    private static final String mSH = "itemSelectedBackground";
    private static final String mSI = "itemSetSelectedBackground";
    private static final int mSJ = 6;
    private static long mSK = -1L;

    public static void changeItemBackgroundEnter(flp_2 flp_22, ffV ffV2, frx_1 frx_12) {
        if (ffV2 == null) {
            return;
        }
        fes_2 fes_22 = (fes_2)flp_22.gBE();
        fes_22.setStyle(ffV2.dOg().dpq() == 0 ? mSH : mSI);
        if (frx_12 != null) {
            cgn_1.showPopup(flp_22, ffV2, frx_12, fes_22);
        }
    }

    public static void changeItemBackgroundExit(flp_2 flp_22, ffV ffV2, frx_1 frx_12) {
        fes_2 fes_22 = (fes_2)flp_22.gBE();
        fes_22.setStyle(beh_1.jNH.getStyle());
        cgn_1.closePopup(flp_22);
    }

    public static void dragItem(flu_1 flu_12) {
        if (csb_1.nEA.dnj()) {
            return;
        }
        ffV ffV2 = (ffV)flu_12.getValue();
        mSK = ffV2.LV();
    }

    public static void dropItemOnCompartment(fla_2 fla_22, bkz_1 bkz_12) {
        Object object = fla_22.getValue();
        if (!(object instanceof ffV)) {
            return;
        }
        ffV ffV2 = (ffV)object;
        if (bkz_12 == null || bkz_12.dtk()) {
            return;
        }
        if (bdq_0.dRC().ab(ffV2)) {
            return;
        }
        cfe_1.onDropItem();
        if (csb_1.nEA.dnj()) {
            return;
        }
        long l = aue_0.cVJ().cVK().Xi();
        boolean bl = csb_1.nEA.eNG().jW(ffV2.LV());
        if (!bl && fcI.aj(l, ffV2.LV()) == null) {
            return;
        }
        cdb_2.a(fla_22, ffV2, (short)-1, bkz_12.getId(), ffV2.bfd());
    }

    public static void dropItem(fla_2 fla_22) {
        boolean bl;
        Object object = fla_22.getValue();
        if (!(object instanceof ffV)) {
            return;
        }
        ffV ffV2 = (ffV)object;
        if (bdq_0.dRC().ab(ffV2)) {
            return;
        }
        cfe_1.onDropItem();
        if (csb_1.nEA.dnj()) {
            return;
        }
        object = csb_1.nEA.eNG();
        if (object == null || ((bky_1)object).dtg()) {
            return;
        }
        boolean bl2 = ((bky_1)object).jW(ffV2.LV());
        long l = aue_0.cVJ().cVK().Xi();
        boolean bl3 = bl = fcI.aj(l, ffV2.LV()) != null;
        if (!bl && !bl2) {
            return;
        }
        fcv_1 fcv_12 = fla_22.gDI().getRenderableParent();
        short s = (short)fcv_12.getCollection().getTableIndex(fcv_12);
        Optional<bgx_1> optional = cfe_1.getSelectionContainingItem(fla_22, ffV2);
        if (optional.isPresent()) {
            dae_0 dae_02 = new dae_0(19013);
            dae_02.D(optional.get());
            dae_02.az(s);
            dae_02.fa(csb_1.nEA.eNG().getId());
            aaw_1.bUq().h(dae_02);
            return;
        }
        short s2 = cdb_2.a(fcv_12.getItemValue(), ffV2);
        cdb_2.a(fla_22, ffV2, s, csb_1.nEA.eNG().getId(), s2);
    }

    public static void stackItemsFromInventoryToAccountChest(flp_2 flp_22) {
        if (csb_1.nEA.dnj()) {
            return;
        }
        bky_1 bky_12 = csb_1.nEA.eNG();
        if (bky_12 == null || bky_12.dtg()) {
            return;
        }
        List<ffV> list = cvo_2.daL().dno().dRy();
        dbp_0 dbp_02 = new dbp_0();
        dbp_02.aE(list);
        dbp_02.rc(bky_12.getId());
        dbp_02.lK(16385);
        aaw_1.bUq().h(dbp_02);
    }

    private static void a(fla_2 fla_22, ffV ffV2, short s, String string, short s2) {
        short s3;
        boolean bl = fla_22.gDT() ^ ((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljt);
        boolean bl2 = ffV2.LV() == mSK;
        short s4 = s3 = bl2 ? (short)19868 : 19259;
        if (!bl2 && ffV2.bfd() > 1 && bl) {
            che_1.setItem(ffV2);
            che_1.setMaxQuantity(s2);
            che_1.setMessageType(s3);
            che_1.setDestinationPosition(s);
            che_1.setTargetCompartmentId(string);
            dbl_0 dbl_02 = new dbl_0();
            dbl_02.setItem(ffV2);
            dbl_02.ak(s2);
            dbl_02.cY((short)fla_22.getScreenX());
            dbl_02.cZ((short)fla_22.getScreenY());
            dbl_02.lK(16021);
            aaw_1.bUq().h(dbl_02);
        } else {
            dbl_0 dbl_03 = new dbl_0();
            dbl_03.setItem(ffV2);
            dbl_03.ak(s2);
            dbl_03.setDestinationPosition(s);
            dbl_03.fa(string);
            dbl_03.lK(s3);
            aaw_1.bUq().h(dbl_03);
        }
    }

    private static short a(Object object, ffV ffV2) {
        if (!(object instanceof ffV)) {
            return ffV2.bfd();
        }
        ffV ffV3 = (ffV)object;
        if (!ffV2.n(ffV3)) {
            return ffV2.bfd();
        }
        int n = ffV3.bfe() - ffV3.bfd();
        return (short)Math.min(ffV2.bfd(), n);
    }

    public static void selectCompartment(flp_2 flp_22, bkz_1 bkz_12) {
        if (!flp_22.gEk()) {
            return;
        }
        if (csb_1.nEA.dnj()) {
            return;
        }
        if (flp_22.gBE() instanceof fad_1) {
            return;
        }
        dae_0 dae_02 = new dae_0(18687);
        dae_02.fa(bkz_12.getId());
        aaw_1.bUq().h(dae_02);
    }

    public static void buyCompartment(flp_2 flp_22) {
        if (!flp_22.gEk()) {
            return;
        }
        cyr_2.eYA().qU("wakfu_stockage");
    }

    public static boolean openCompartmentModification(flp_2 flp_22, bkz_1 bkz_12) {
        if (!flp_22.gEk()) {
            return false;
        }
        fse_1.gFu().f("accountChestCompartmentModification", true);
        fse_1.gFu().f("accountChestModifiedCompartment", bkz_12);
        dae_0 dae_02 = new dae_0(19550);
        dae_02.D(bkz_12);
        aaw_1.bUq().h(dae_02);
        return true;
    }

    public static void validateCompartmentModification(flp_2 flp_22, fdu_1 fdu_12, fdu_1 fdu_13) {
        if (!flp_22.gEk()) {
            return;
        }
        String string = fdu_12.getText();
        String string2 = fdu_13.getText();
        bkz_1 bkz_12 = (bkz_1)fse_1.gFu().vY("accountChestModifiedCompartment");
        daf_0 daf_02 = new daf_0(bkz_12.getId(), string, string2);
        aaw_1.bUq().h(daf_02);
        fyw_0.gqw().tl("accountChestModificationsDialog");
        fse_1.gFu().f("accountChestCompartmentModification", false);
        fse_1.gFu().vX("accountChestModifiedCompartment");
    }

    public static void cancelCompartmentModification(flp_2 flp_22) {
        if (!flp_22.gEk()) {
            return;
        }
        fse_1.gFu().f("accountChestCompartmentModification", false);
        fse_1.gFu().vX("accountChestModifiedCompartment");
    }

    public static void copyCompartmentId(flp_2 flp_22, bkz_1 bkz_12) {
        bh_0.aI(bkz_12.getId());
        String string = String.format("Compartment %s id=%s copied to clipboard", bkz_12.getName(), bkz_12.getId());
        aPh.czg().iZ(string);
    }

    public static void pickCompartmentColor(flz_2 flz_22, fdu_1 fdu_12) {
        axb_2 axb_22 = (axb_2)flz_22.getValue();
        if (axb_22 == null) {
            return;
        }
        fdu_12.setText(axb_22.bQk().toUpperCase());
        fse_1.gFu().b("compartmentColorPreview", axb_22, "accountChestModificationsDialog");
    }

    public static void onColorType(fiq_1 fiq_12, fdu_1 fdu_12) {
        awx_2 awx_22;
        String string = fdu_12.getText();
        if (string.length() < 6) {
            return;
        }
        try {
            awx_22 = awx_2.gD(string);
        }
        catch (RuntimeException runtimeException) {
            mSE.error((Object)("Error when creating color from hex " + string), (Throwable)runtimeException);
            return;
        }
        fse_1.gFu().b("compartmentColorPickerValue", awx_22, "accountChestModificationsDialog");
        fse_1.gFu().b("compartmentColorPreview", awx_22, "accountChestModificationsDialog");
    }

    public static void resetColor(flp_2 flp_22, fdu_1 fdu_12) {
        awx_2 awx_22 = csb_1.nEB;
        fdu_12.setText(awx_22.bQk().toUpperCase());
        fse_1.gFu().b("compartmentColorPreview", awx_22, "accountChestModificationsDialog");
    }

    public static void showCompartmentOption(flp_2 flp_22, bkz_1 bkz_12) {
        bkz_12.gk(true);
        fse_1.gFu().a((aef_2)bkz_12, "hovered");
    }

    public static void hideCompartmentOption(flp_2 flp_22, bkz_1 bkz_12) {
        bkz_12.gk(false);
        fse_1.gFu().a((aef_2)bkz_12, "hovered");
    }

    public static boolean moveCompartmentUp(flp_2 flp_22, bkz_1 bkz_12) {
        if (csb_1.nEA.dnj()) {
            return false;
        }
        dae_0 dae_02 = new dae_0(19109);
        dae_02.D(bkz_12);
        aaw_1.bUq().h(dae_02);
        return true;
    }

    public static boolean moveCompartmentDown(flp_2 flp_22, bkz_1 bkz_12) {
        if (csb_1.nEA.dnj()) {
            return false;
        }
        dae_0 dae_02 = new dae_0(17110);
        dae_02.D(bkz_12);
        aaw_1.bUq().h(dae_02);
        return true;
    }

    public static void onItemDoubleClick(flg_2 flg_22) {
        if (csb_1.nEA.dnj()) {
            return;
        }
        ffV ffV2 = (ffV)flg_22.getItemValue();
        bgt_0 bgt_02 = cvo_2.daL();
        bgl_0 bgl_02 = bwa_0.jwi.aj(bgt_02);
        ArrayList<Long> arrayList = bgt_02.dno().cz(ffV2);
        if (arrayList.isEmpty()) {
            return;
        }
        dbl_0 dbl_02 = new dbl_0();
        dbl_02.gj(ffV2.LV());
        dbl_02.setItem(ffV2);
        dbl_02.ak(ffV2.bfd());
        dbl_02.setDestinationPosition((short)-1);
        dbl_02.setDestinationUniqueId(-1L);
        dbl_02.setDestinationCharacter(bgl_02);
        dbl_02.lK(16514);
        aaw_1.bUq().h(dbl_02);
    }

    public static void showItemDetails(flg_2 flg_22) {
        if (!flg_22.gEm()) {
            if (!(flg_22.getItemValue() instanceof ffV)) {
                return;
            }
            ffV ffV2 = (ffV)flg_22.getItemValue();
            fse_1.gFu().b("itemDetail", ffV2, "inventoryDialog");
            bjm_0 bjm_02 = ffV2.adO() ? new bjm_0(ffV2) : null;
            fse_1.gFu().b("pet", bjm_02, "inventoryDialog");
            return;
        }
        cdd_2.sendOpenCloseItemDetailMessage("accountChestDialog", (ffV)flg_22.getItemValue());
    }

    public static void compartmentFilter(fiq_1 fiq_12, fdv_1 fdv_12) {
        bkx_1 bkx_12 = (bkx_1)fse_1.gFu().vY("accountChestCompartments");
        String string = fdv_12.getText();
        if (!string.equals(bkx_12.dte())) {
            dae_0 dae_02 = new dae_0(19386);
            dae_02.fa(string);
            aaw_1.bUq().h(dae_02);
        }
    }

    public static void resetCompartmentFilter(fiq_1 fiq_12, fdv_1 fdv_12) {
        dae_0 dae_02 = new dae_0(19386);
        dae_02.fa("");
        aaw_1.bUq().h(dae_02);
    }

    public static void itemFilter(fiq_1 fiq_12, fdv_1 fdv_12) {
        String string = fdv_12.getText();
        dae_0 dae_02 = new dae_0(18111);
        dae_02.fa(string);
        aaw_1.bUq().h(dae_02);
    }

    public static void resetItemFilter(fiq_1 fiq_12, fdv_1 fdv_12) {
        dae_0 dae_02 = new dae_0(18111);
        dae_02.fa("");
        aaw_1.bUq().h(dae_02);
    }

    public static long getDraggedItemId() {
        return mSK;
    }

    public static void setDraggedItemId(long l) {
        mSK = l;
    }
}

