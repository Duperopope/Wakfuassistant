/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cFp
 */
@fyf_0
public final class cfp_1 {
    private static final Logger mVU = Logger.getLogger(cfp_1.class);
    public static final String PACKAGE = "wakfu.market";
    private static final String mVV = "entryNameSearch";
    private static final String mVW = "offerNameSearch";
    private static final bhk_2 mVX = new bhk_2();

    private cfp_1() {
    }

    private static long h(@Nullable String string, long l) {
        if (string == null || string.isBlank()) {
            return l;
        }
        try {
            return aum_0.cWf().cQ(string);
        }
        catch (ParseException parseException) {
            return l;
        }
    }

    private static boolean pB(@Nullable String string) {
        if (string == null || string.isBlank()) {
            return false;
        }
        try {
            aum_0.cWf().cQ(string);
            return true;
        }
        catch (ParseException parseException) {
            return false;
        }
    }

    private static Optional<ffV> aE(Object object) {
        if (object instanceof ffV) {
            return Optional.of((ffV)object);
        }
        if (object instanceof fgf_0) {
            return Optional.ofNullable(((fgf_0)object).getItem());
        }
        if (object instanceof bek_0) {
            bgv_2 bgv_22 = ((bek_0)object).duo();
            return Optional.ofNullable(ffV.a(bgv_22.d(), bgv_22));
        }
        return Optional.empty();
    }

    private static boolean a(fiq_1 fiq_12, fdd_2 fdd_22) {
        boolean bl;
        if (fiq_12 instanceof flv_2) {
            bl = ((flv_2)fiq_12).bqr();
        } else {
            bl = !fdd_22.getSelected();
            fdd_22.setSelected(bl);
        }
        return bl;
    }

    public static void changeMarketView(flv_2 flv_22) {
        if (!flv_22.bqr()) {
            return;
        }
        fcu_1 fcu_12 = (fcu_1)flv_22.gBE();
        try {
            byte by = Byte.parseByte(fcu_12.getValue());
            dae_0 dae_02 = new dae_0(19720);
            dae_02.ay(by);
            aaw_1.bUq().h(dae_02);
        }
        catch (NumberFormatException numberFormatException) {
            mVU.error((Object)("Invalid tab value : " + fcu_12.getValue()));
        }
    }

    public static void setSellItemMode(fiq_1 fiq_12, String string) {
        boolean bl = Boolean.parseBoolean(string);
        dae_0 dae_02 = new dae_0(17125);
        dae_02.cC(bl);
        aaw_1.bUq().h(dae_02);
    }

    static void a(flp_2 flp_22, @Nullable Object object) {
        if (!aue_0.cVJ().c(cwl_1.eVl())) {
            return;
        }
        if (!flp_22.gEk()) {
            return;
        }
        cfp_1.aE(object).ifPresent(ffV2 -> {
            if (fyw_0.gqw().to("marketFulfillOfferDialog")) {
                cfp_1.bx(ffV2);
            } else if (cwl_1.eVx()) {
                fdv_1 fdv_12 = (fdv_1)fyw_0.gqw().th("marketDialog").getElementMap().uH(cwl_1.eVE() ? mVV : mVW);
                if (fdv_12 == null) {
                    return;
                }
                cfp_1.a(ffV2, fdv_12);
            } else if (cwl_1.eVG()) {
                cfp_1.bh(ffV2);
            } else if (cwl_1.eVH()) {
                cfp_1.a(true, (bgv_2)ffV2.dOg());
            }
        });
    }

    public static void changeSearchSubTab(flv_2 flv_22) {
        cfp_1.a((short)19728, flv_22);
    }

    public static void changeMyOffersSubTab(flv_2 flv_22) {
        cfp_1.a((short)19470, flv_22);
    }

    private static void a(short s, flv_2 flv_22) {
        if (!flv_22.bqr() || !(flv_22.gBE() instanceof fcu_1)) {
            return;
        }
        fcu_1 fcu_12 = (fcu_1)flv_22.gBE();
        try {
            int n = Integer.parseInt(fcu_12.getValue()) - 1;
            dae_0 dae_02 = new dae_0(s);
            dae_02.sY(n);
            aaw_1.bUq().h(dae_02);
        }
        catch (NumberFormatException numberFormatException) {
            mVU.error((Object)("Invalid sub tab value : " + fcu_12.getValue()));
        }
    }

    public static void updateOnSaleEntriesNameSearch(fiq_1 fiq_12, fdv_1 fdv_12) {
        dae_0 dae_02 = new dae_0(18783);
        dae_02.fa(fdv_12.getText());
        aaw_1.bUq().h(dae_02);
    }

    public static void searchOnSaleEntriesFromClickOnItemList(flk_2 flk_22, fdv_1 fdv_12) {
        if (!flk_22.bqr() || !(flk_22.getValue() instanceof fhc_0)) {
            return;
        }
        fhc_0 fhc_02 = (fhc_0)flk_22.getValue();
        fdv_12.setText(fhc_02.getName());
        cfp_1.updateOnSaleEntriesNameSearch(null, fdv_12);
    }

    public static void onSaleEntriesPreviousPage(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(19616));
    }

    public static void onSaleEntriesNextPage(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(18307));
    }

    public static void scrollOnSaleSearch(flp_2 flp_22) {
        if (flp_22.gEo() > 0) {
            cfp_1.onSaleEntriesNextPage(flp_22);
        } else {
            cfp_1.onSaleEntriesPreviousPage(flp_22);
        }
    }

    public static void retrieveOnSaleItem(fiq_1 fiq_12, bhu_1 bhu_12) {
        dae_0 dae_02 = new dae_0(17500);
        dae_02.D(bhu_12);
        aaw_1.bUq().h(dae_02);
    }

    public static void fetchKamas(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(17734));
    }

    public static void toggleSoldItemsDetailWindow(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(17931));
    }

    public static void soldItemsPreviousPage(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(19875));
    }

    public static void soldItemsNextPage(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(18762));
    }

    public static void scrollSoldItemsSearch(flp_2 flp_22) {
        if (flp_22.gEo() > 0) {
            cfp_1.soldItemsNextPage(flp_22);
        } else {
            cfp_1.soldItemsPreviousPage(flp_22);
        }
    }

    public static void retrieveExpireEntry(fiq_1 fiq_12, bhu_1 bhu_12) {
        dae_0 dae_02 = new dae_0(19215);
        dae_02.D(bhu_12);
        aaw_1.bUq().h(dae_02);
    }

    public static void retrieveAllExpiredEntries(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(16042));
    }

    public static void toggleExpireEntriesDetailWindow(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(17666));
    }

    public static void expiredEntriesPreviousPage(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(17570));
    }

    public static void expiredEntriesNextPage(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(18198));
    }

    public static void scrollExpiredEntriesSearch(flp_2 flp_22) {
        if (flp_22.gEo() > 0) {
            cfp_1.expiredEntriesNextPage(flp_22);
        } else {
            cfp_1.expiredEntriesPreviousPage(flp_22);
        }
    }

    public static void dropItemToSell(fla_2 fla_22) {
        cfe_1.onDropItem();
        cfp_1.aE(fla_22.getValue()).ifPresent(cfp_1::bh);
    }

    public static void dropItemToSell(fla_2 fla_22, fdu_1 fdu_12) {
        cfe_1.onDropItem();
        cfp_1.aE(fla_22.getValue()).ifPresent(ffV2 -> cfp_1.a(ffV2, fdu_12));
    }

    public static void selectItemToSellFromList(flp_2 flp_22, ffV ffV2, fdu_1 fdu_12) {
        if (!fiu_1.uCW.fd("marketSellViewLock")) {
            return;
        }
        if (!flp_22.gEk()) {
            return;
        }
        cfp_1.a(ffV2, fdu_12);
    }

    private static void bh(ffV ffV2) {
        fhv_1 fhv_13 = fyw_0.gqw().th("marketDialog");
        fdu_1 fdu_12 = fhv_13 == null ? null : (fdu_1)fhv_13.getElementRecursively("priceSellItemTE", fhv_12 -> !fhv_12.isATemplate());
        cfp_1.a(ffV2, fdu_12);
    }

    private static void a(ffV ffV2, @Nullable fdu_1 fdu_12) {
        if (fcI.ag(aue_0.cVJ().cVK().Xi(), ffV2.LV()) == null) {
            mVU.error((Object)"This item does not belong to the player");
            return;
        }
        dbs_0 dbs_02 = new dbs_0();
        dbs_02.az(ffV2.bfd());
        dbs_02.setItem(ffV2);
        dbs_02.i(fdu_12);
        aaw_1.bUq().h(dbs_02);
    }

    public static void filterInventoryItems(fiq_1 fiq_12, fdv_1 fdv_12) {
        String string = fdv_12.getText();
        bhz_2.dWn().mO(string);
    }

    public static void sortInventoryItems(flv_2 flv_22, String string) {
        if (!flv_22.bqr()) {
            return;
        }
        Optional<bin_1> optional = bin_1.dh(string);
        if (optional.isEmpty()) {
            return;
        }
        dae_0 dae_02 = new dae_0(18837);
        dae_02.D((Object)optional.get());
        aaw_1.bUq().h(dae_02);
    }

    public static void showItemToSellPopup(fiq_1 fiq_12, frx_1 frx_12, fes_2 fes_22) {
        ffV ffV2 = bhz_2.dWn().dWI().getItem();
        if (ffV2 == null) {
            return;
        }
        cgn_1.showPopup(null, ffV2, frx_12, fes_22);
    }

    public static void refreshSaleData(fle_2 fle_22) {
        if (!fle_22.gDO()) {
            bhz_2.dWn().dWI().dVC();
        }
    }

    public static void priceChanged(fli_2 fli_22, fdu_1 fdu_12) {
        if (fli_22.bCC() == 10) {
            cfp_1.eKu();
            return;
        }
        long l = cfp_1.h(fdu_12.getText(), 0L);
        if (l != bhz_2.dWn().dWI().akd()) {
            bhz_2.dWn().dWI().k(l, l > 999999999999L);
        }
    }

    public static void quantityChanged(fli_2 fli_22, fdu_1 fdu_12) {
        if (fli_22.bCC() == 10) {
            cfp_1.eKu();
            return;
        }
        int n = (int)cfp_1.h(fdu_12.getText(), 0L);
        if (bhz_2.dWn().dWI().oP() != n) {
            cfp_1.F(n, n > bhz_2.dWn().dWI().dVs());
        }
    }

    public static void setQuantityToOne(fiq_1 fiq_12) {
        cfp_1.F(1, true);
    }

    public static void removeOneFromQuantity(fiq_1 fiq_12, bhs_1 bhs_12) {
        cfp_1.F(bhs_12.oP() - 1, true);
    }

    public static void setQuantityToHalf(fiq_1 fiq_12, bhs_1 bhs_12) {
        cfp_1.F(bhs_12.dVs() / 2, true);
    }

    public static void addOneToQuantity(fiq_1 fiq_12, bhs_1 bhs_12) {
        cfp_1.F(bhs_12.oP() + 1, true);
    }

    public static void setQuantityToMax(fiq_1 fiq_12, bhs_1 bhs_12) {
        cfp_1.F(bhs_12.dVs(), true);
    }

    private static void F(int n, boolean bl) {
        bhz_2.dWn().dWI().z(n, bl);
    }

    public static void sellDurationChanged(flk_2 flk_22) {
        if (!(flk_22.getValue() instanceof big_1)) {
            mVU.error((Object)("[MARKET] Not a sell duration: " + String.valueOf(flk_22.getValue())));
            return;
        }
        big_1 big_12 = (big_1)flk_22.getValue();
        aaw_1.bUq().h(new dbt_0(big_12));
    }

    public static void cancelItemToSell(fiq_1 fiq_12) {
        dae_0 dae_02 = new dae_0(17607);
        aaw_1.bUq().h(dae_02);
    }

    public static void sellItem(flp_2 flp_22) {
        cfp_1.eKu();
    }

    private static void eKu() {
        dae_0 dae_02 = new dae_0(18709);
        aaw_1.bUq().h(dae_02);
    }

    public static void previousPage(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(18915));
    }

    public static void nextPage(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(16195));
    }

    public static void scrollMainSearch(flp_2 flp_22) {
        if (flp_22.gEo() > 0) {
            cfp_1.nextPage(flp_22);
        } else {
            cfp_1.previousPage(flp_22);
        }
    }

    public static void enterMainSearchRow(flg_2 flg_22) {
        if (flg_22.getItemValue() instanceof bhy_2) {
            bhz_2.dWn().a((bhy_2)flg_22.getItemValue());
        }
    }

    public static void exitMainSearchRow(flg_2 flg_22) {
        bhz_2.dWn().a((bhy_2)null);
    }

    public static void createOfferFromEntry(fiq_1 fiq_12, bhu_1 bhu_12, fcu_1 fcu_12) {
        fcu_12.getAppearance().grr();
        cfp_1.a(true, (bgv_2)bhu_12.getItem().dOg());
    }

    public static void openStuffPreviewWindow(fiq_1 fiq_12, bhu_1 bhu_12) {
        ctd_2.eQA().bB(bhu_12.getItem());
    }

    public static void purchaseEntry(fiq_1 fiq_12, fey_2 fey_22, bhu_1 bhu_12) {
        fse_1.gFu().f("marketItemPurchase", new bhr_1(bhu_12));
        ccj_2.g("marketConfirmPurchaseDialog", 256L);
    }

    public static void showPurchaseItemPopup(fiq_1 fiq_12, bhr_1 bhr_12, frx_1 frx_12, fes_2 fes_22) {
        cgn_1.showPopup(null, bhr_12.getItem(), frx_12, fes_22);
    }

    public static void setItemPurchaseQuantityToOne(fiq_1 fiq_12, bhr_1 bhr_12) {
        bhr_12.Fq(1);
    }

    public static void removeOneToItemPurchaseQuantity(fiq_1 fiq_12, bhr_1 bhr_12) {
        bhr_12.Fq(bhr_12.oP() - 1);
    }

    public static void setItemPurchaseQuantityToHalf(fiq_1 fiq_12, bhr_1 bhr_12) {
        bhr_12.Fq(bhr_12.dVz() / 2);
    }

    public static void addOneToItemPurchaseQuantity(fiq_1 fiq_12, bhr_1 bhr_12) {
        bhr_12.Fq(bhr_12.oP() + 1);
    }

    public static void setItemPurchaseQuantityToMax(fiq_1 fiq_12, bhr_1 bhr_12) {
        bhr_12.Fq(bhr_12.dVz());
    }

    public static void updateItemPurchaseQuantity(fli_2 fli_22, bhr_1 bhr_12, fdu_1 fdu_12) {
        if (fli_22.bCC() == 10) {
            cfp_1.confirmPurchase(fli_22, bhr_12);
            return;
        }
        int n = (int)cfp_1.h(fdu_12.getText(), 0L);
        if (bhr_12.oP() != n) {
            bhr_12.z(n, n >= bhr_12.dVz());
        }
    }

    public static void updateItemPurchaseQuantityWithMouseWheel(flp_2 flp_22, bhr_1 bhr_12) {
        int n = flp_22.gDT() ? 10 : 1;
        bhr_12.Fq(bhr_12.oP() - flp_22.gEo() * n);
    }

    public static void confirmPurchase(fiq_1 fiq_12, bhr_1 bhr_12) {
        if (!bhr_12.dVA()) {
            return;
        }
        dae_0 dae_02 = new dae_0(16464);
        dae_02.sY(bhr_12.oP());
        dae_02.D(bhr_12.dVB());
        aaw_1.bUq().h(dae_02);
        cfp_1.eKv();
    }

    public static void cancelPurchase(fiq_1 fiq_12) {
        cfp_1.eKv();
    }

    private static void eKv() {
        fse_1.gFu().f("marketItemPurchase", (Object)null);
        fyw_0.gqw().J("marketConfirmPurchaseDialog", false);
    }

    public static void similarEntriesSearchPreviousPage(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(17161));
    }

    public static void similarEntriesSearchNextPage(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(18696));
    }

    public static void scrollSimilarEntriesSearch(flp_2 flp_22) {
        if (flp_22.gEo() > 0) {
            cfp_1.similarEntriesSearchNextPage(flp_22);
        } else if (flp_22.gEo() < 0) {
            cfp_1.similarEntriesSearchPreviousPage(flp_22);
        }
    }

    public static void similarOffersSearchPreviousPage(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(16728));
    }

    public static void similarOffersSearchNextPage(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(19632));
    }

    public static void scrollSimilarOffersSearch(flp_2 flp_22) {
        if (flp_22.gEo() > 0) {
            cfp_1.similarOffersSearchNextPage(flp_22);
        } else if (flp_22.gEo() < 0) {
            cfp_1.similarOffersSearchPreviousPage(flp_22);
        }
    }

    public static void showItemDetails(flg_2 flg_22) {
        if (!flg_22.gEm()) {
            return;
        }
        cfp_1.aE(flg_22.getItemValue()).ifPresent(ffV2 -> {
            fes_2 fes_22 = (fes_2)flg_22.gBE();
            if (aPe.a(flg_22)) {
                aPe.ag(ffV2.dOg());
            } else {
                cdd_2.sendOpenCloseItemDetailMessage(ffV2, fhz_2.gAS().getX(), flg_22.getScreenY() + fes_22.getHeight());
            }
        });
    }

    public static void toggleAdvancedFiltersWindow(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(19554));
    }

    public static void removeFilter(fiq_1 fiq_12, bhi_1 bhi_12) {
        aaw_1.bUq().h(new dbw_0(bhi_12));
    }

    public static void removeAllFilters(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(16505));
    }

    private static long pC(@Nullable String string) {
        return cfp_1.h(string, -1L);
    }

    public static void collapseType(fiq_1 fiq_12, bEO bEO2) {
        aaw_1.bUq().h(new dbv_0(bEO2));
    }

    public static void collapseInventoryType(fiq_1 fiq_12, bie_1 bie_12) {
        aaw_1.bUq().h(new dbv_0(bie_12));
    }

    public static void toggleType(flv_2 flv_22, bEO bEO3) {
        boolean bl = flv_22.bqr();
        if (bEO3.bqr() == bl) {
            return;
        }
        bEO3.hD(bl);
        ArrayList<bhi_1> arrayList = new ArrayList<bhi_1>();
        bEO3.k(bEO2 -> arrayList.add(new bhj_2((bEO)bEO2, () -> bEO2.hD(false))));
        aaw_1.bUq().h(new dbz_0(arrayList));
    }

    public static void dropItemOnSearch(fla_2 fla_22, fdv_1 fdv_12) {
        cfp_1.aE(fla_22.getValue()).ifPresent(ffV2 -> cfp_1.a(ffV2, fdv_12));
    }

    public static void searchFromEntry(fiq_1 fiq_12, fdv_1 fdv_12, bhy_2 bhy_22) {
        cfp_1.a(bhy_22.getItem(), fdv_12);
    }

    public static void searchFromClickOnItemList(flk_2 flk_22, fdv_1 fdv_12) {
        if (!flk_22.bqr() || !(flk_22.getValue() instanceof fhc_0)) {
            return;
        }
        ffV ffV2 = ffV.k((fhc_0)flk_22.getValue());
        cfp_1.a(ffV2, fdv_12);
    }

    private static void a(ffV ffV2, fdv_1 fdv_12) {
        bhl_1 bhl_12 = bhz_2.dWn().dWo();
        boolean bl = cfp_1.a(ffV2, bhl_12);
        String string = ffV2.getName();
        fdv_12.setText(string);
        cfp_1.a(new bhl_2(string, ffV2.avr(), bhl_12), bl, bhl_12);
    }

    private static boolean a(ffV ffV2, bhl_1 bhl_12) {
        Collection collection;
        ArrayList<bhi_1> arrayList = new ArrayList<bhi_1>();
        bhk_1 bhk_12 = (bhk_1)bhl_12.b(bhh_1.kcq);
        if (bhk_12 != null && !bhk_12.lu(ffV2.dOg().cmL())) {
            arrayList.add(bhk_12);
        }
        if ((collection = bhl_12.c(bhh_1.kcr)) != null && !collection.isEmpty() && collection.stream().noneMatch(bhr_22 -> bhr_22.dwg() == ffV2.dwg())) {
            arrayList.addAll(collection);
        }
        if (ffV2.dOg().cpA() == 0) {
            arrayList.addAll(bhl_12.c(bhh_1.kcx));
            arrayList.addAll(bhl_12.c(bhh_1.kcy));
        }
        if (ffV2.dOg().bcx().aVo() == 0) {
            arrayList.addAll(bhl_12.c(bhh_1.kcz));
        }
        if (!arrayList.isEmpty()) {
            aaw_1.bUq().h(new dbw_0(false, arrayList));
        }
        return !arrayList.isEmpty();
    }

    public static void updateNameSearch(fiq_1 fiq_12, fdv_1 fdv_12) {
        bhl_1 bhl_12 = bhz_2.dWn().dWo();
        mVX.a(bhh_1.kcp, () -> cfp_1.a(new bhl_2(fdv_12.getText(), bhl_12), false, bhl_12));
    }

    private static void a(bhl_2 bhl_22, boolean bl, bhl_1 bhl_12) {
        if (!bl && bhl_22.equals(bhl_12.b(bhh_1.kcp))) {
            return;
        }
        aaw_1.bUq().h(new dbz_0(bhl_22));
    }

    public static void setLevelSearchToCurrent(fiq_1 fiq_12, fdu_1 fdu_12, fdu_1 fdu_13) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 != null) {
            boolean bl;
            Bu<Short, Short> bu = eIi.dD(bgt_02.cmL());
            boolean bl2 = bl = fdu_12.getText().equals(bu.getFirst().toString()) && fdu_13.getText().equals(bu.aHI().toString());
            if (bl) {
                fdu_12.clear();
                fdu_13.clear();
                cfp_1.a(fdu_12, fdu_13, (short)-1, (short)-1);
            } else {
                fdu_12.setText(bu.getFirst());
                fdu_13.setText(bu.aHI());
                cfp_1.a(fdu_12, fdu_13, bu.getFirst(), bu.aHI());
            }
        }
    }

    public static void updateLevelSearch(fiq_1 fiq_12, fdu_1 fdu_12, fdu_1 fdu_13) {
        short s = (short)cfp_1.pC(fdu_12.getText());
        short s2 = (short)cfp_1.pC(fdu_13.getText());
        cfp_1.a(fdu_12, fdu_13, s, s2);
    }

    private static void a(fdu_1 fdu_12, fdu_1 fdu_13, short s, short s2) {
        bhk_1 bhk_12 = new bhk_1(s, s2, bhz_2.dWn().dWo());
        cfp_1.a(fdu_12, fdu_13, bhk_12, s, s2);
        mVX.a(bhh_1.kcq, () -> aaw_1.bUq().h(new dbz_0(bhk_12)));
    }

    private static void a(fdu_1 fdu_12, fdu_1 fdu_13, bhi_1 bhi_12, long l, long l2) {
        if (bhi_12.isValid() || l == -1L && l2 == -1L) {
            fdu_12.guN();
            fdu_13.guN();
        } else {
            fdu_12.getTextBuilder().C(new fhl_2(ett_1.omi));
            fdu_13.getTextBuilder().C(new fhl_2(ett_1.omi));
        }
    }

    public static void resetRaritySearch(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dbx_0(bhh_1.kcr));
    }

    public static void toggleRarity(flv_2 flv_22, bil_1 bil_12) {
        aaw_1.bUq().h(new dby_0(bil_12, flv_22.bqr()));
    }

    public static void toggleOnlyCheapest(fiq_1 fiq_12, fdd_2 fdd_22) {
        cfp_1.a(fiq_12, fdd_22, "market.filter.only.cheapest");
    }

    public static void toggleOnlyMostExpensive(fiq_1 fiq_12, fdd_2 fdd_22) {
        cfp_1.a(fiq_12, fdd_22, "market.filter.only.most.expensive");
    }

    private static void a(fiq_1 fiq_12, fdd_2 fdd_22, String string) {
        boolean bl = cfp_1.a(fiq_12, fdd_22);
        bhm_2 bhm_22 = new bhm_2(bl, string, bhz_2.dWn().dWo());
        aaw_1.bUq().h(new dbz_0(bhm_22));
    }

    public static void toggleOnlyCanAfford(flv_2 flv_22) {
        bhn_1 bhn_12 = new bhn_1(flv_22.bqr(), "market.filter.i.can.buy", bhz_2.dWn().dWo());
        aaw_1.bUq().h(new dbz_0(bhn_12));
    }

    public static void toggleOnlyCanFulfill(flv_2 flv_22) {
        bhn_1 bhn_12 = new bhn_1(flv_22.bqr(), "market.filter.i.can.fulfill", bhz_2.dWn().dWo());
        aaw_1.bUq().h(new dbz_0(bhn_12));
    }

    public static void resetPriceSearch(fiq_1 fiq_12, fdu_1 fdu_12, fdu_1 fdu_13) {
        fdu_12.guN();
        fdu_13.guN();
        bhz_2.dWn().dWo().dVf();
        aaw_1.bUq().h(new dbx_0(bhh_1.kcu));
    }

    public static void updatePriceSearch(fiq_1 fiq_12, fdu_1 fdu_12, fdu_1 fdu_13) {
        long l = cfp_1.pC(fdu_12.getText());
        long l2 = cfp_1.pC(fdu_13.getText());
        bho_1 bho_12 = new bho_1(l, l2, bhz_2.dWn().dWo());
        cfp_1.a(fdu_12, fdu_13, bho_12, l, l2);
        mVX.a(bhh_1.kcu, () -> aaw_1.bUq().h(new dbz_0(bho_12)));
    }

    public static void resetQuantitySearch(fiq_1 fiq_12, fdu_1 fdu_12, fdu_1 fdu_13) {
        fdu_12.guN();
        fdu_13.guN();
        bhz_2.dWn().dWo().dVg();
        aaw_1.bUq().h(new dbx_0(bhh_1.kcw));
    }

    public static void updateQuantitySearch(fiq_1 fiq_12, fdu_1 fdu_12, fdu_1 fdu_13) {
        long l = cfp_1.pC(fdu_12.getText());
        long l2 = cfp_1.pC(fdu_13.getText());
        bhp_1 bhp_12 = new bhp_1(l, l2, bhz_2.dWn().dWo());
        cfp_1.a(fdu_12, fdu_13, bhp_12, l, l2);
        mVX.a(bhh_1.kcw, () -> aaw_1.bUq().h(new dbz_0(bhp_12)));
    }

    public static void resetPackSizeSearch(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dbx_0(bhh_1.kcv));
    }

    public static void resetSlotAndSublimationSearch(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dbx_0(bhh_1.kcx, bhh_1.kcy));
    }

    public static void toggleSlotsFixedOrder(fiq_1 fiq_12, fdd_2 fdd_22) {
        boolean bl = cfp_1.a(fiq_12, fdd_22);
        cfp_1.jM(bl);
    }

    public static void changeSlotColor(flk_2 flk_22, bii_1 bii_12, fdd_2 fdd_22) {
        if (!flk_22.bqr() || !(flk_22.getValue() instanceof bih_1)) {
            return;
        }
        bii_12.b((bih_1)flk_22.getValue());
        cfp_1.jM(fdd_22.getSelected());
    }

    private static void jM(boolean bl) {
        dae_0 dae_02 = new dae_0(17270);
        dae_02.cC(bl);
        aaw_1.bUq().h(dae_02);
    }

    public static void resetSlotSearch(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(16049));
    }

    public static void onHoverSublimation(flg_2 flg_22, frx_1 frx_12, fes_2 fes_22) {
        if (!(flg_22.getItemValue() instanceof bij_1)) {
            return;
        }
        int n = ((bij_1)flg_22.getItemValue()).AK();
        cfg_2.displaySublimationPopup(n, frx_12, fes_22);
    }

    public static void selectBasicSublimation(flk_2 flk_22, fdv_1 fdv_12) {
        cfp_1.a(flk_22, false, fdv_12);
    }

    public static void selectSpecialSublimation(flk_2 flk_22, fdv_1 fdv_12) {
        cfp_1.a(flk_22, true, fdv_12);
    }

    private static void a(flk_2 flk_22, boolean bl, fdv_1 fdv_12) {
        if (!flk_22.bqr() || !(flk_22.getValue() instanceof bij_1)) {
            return;
        }
        bij_1 bij_12 = (bij_1)flk_22.getValue();
        cfp_1.a(bij_12, bl, fdv_12);
    }

    private static void a(bij_1 bij_12, boolean bl, fdv_1 fdv_12) {
        bht_2 bht_22 = new bht_2(bij_12, bl, bhz_2.dWn().dWo());
        fdv_12.setText(bij_12.getName());
        aaw_1.bUq().h(new dbz_0(bht_22));
    }

    public static void updateSublimationSearch(fiq_1 fiq_12, fdv_1 fdv_12) {
        bij_1 bij_12;
        String string = fdv_12.getText();
        if (string == null || string.isBlank()) {
            cfp_1.clearBasicSublimationSearch(null);
        }
        if ((bij_12 = bhz_2.dWn().dWo().C(string, false)) != null) {
            cfp_1.a(bij_12, false, fdv_12);
        } else {
            cfp_1.clearBasicSublimationSearch(null);
        }
        bhz_2.dWn().dWo().dVa().mL(string);
    }

    public static void clearBasicSublimationSearch(@Nullable flq_2 flq_22) {
        Object t = bhz_2.dWn().dWo().a(bhh_1.kcy, 0);
        if (t != null) {
            aaw_1.bUq().h(new dbw_0((bhi_1)t));
        }
        bhz_2.dWn().dWo().dVa().mL(null);
    }

    public static void updateSpecialSublimationSearch(fiq_1 fiq_12, fdv_1 fdv_12) {
        String string = fdv_12.getText();
        if (string == null || string.isBlank()) {
            cfp_1.clearSpecialSublimationSearch(null);
            return;
        }
        bij_1 bij_12 = bhz_2.dWn().dWo().C(string, true);
        if (bij_12 != null) {
            cfp_1.a(bij_12, true, fdv_12);
        } else {
            cfp_1.clearSpecialSublimationSearch(null);
        }
        bhz_2.dWn().dWo().dVa().mM(string);
    }

    public static void clearSpecialSublimationSearch(@Nullable flq_2 flq_22) {
        Object t = bhz_2.dWn().dWo().a(bhh_1.kcy, 1);
        if (t != null) {
            aaw_1.bUq().h(new dbw_0((bhi_1)t));
        }
        bhz_2.dWn().dWo().dVa().mM(null);
    }

    public static void toggleRandomElements(flv_2 flv_22) {
        dae_0 dae_02 = new dae_0(19352);
        dae_02.cC(flv_22.bqr());
        aaw_1.bUq().h(dae_02);
    }

    public static void resetCharacteristicsSearch(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dbx_0(bhh_1.kcz));
    }

    public static void updateCharacteristicsSearch(fiq_1 fiq_12, bhc_1 bhc_12, fdu_1 fdu_12) {
        boolean bl = cfp_1.pB(fdu_12.getText());
        Integer n = bl ? Integer.valueOf((int)cfp_1.pC(fdu_12.getText())) : null;
        bhc_12.ai(n);
        bhg_1 bhg_12 = new bhg_1(bhc_12.dWK(), n, () -> {
            bhc_12.ai(null);
            fse_1.gFu().a((aef_2)bhc_12, "minValue");
        });
        mVX.a(bhh_1.kcz, ((bhi_1)bhg_12).dWT(), () -> aaw_1.bUq().h(new dbz_0(bhg_12)));
    }

    public static void marketHistoryPreviousPage(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(18797));
    }

    public static void marketHistoryNextPage(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(19314));
    }

    public static void scrollMarketHistorySearch(flp_2 flp_22) {
        if (flp_22.gEo() > 0) {
            cfp_1.marketHistoryNextPage(flp_22);
        } else {
            cfp_1.marketHistoryPreviousPage(flp_22);
        }
    }

    public static void searchHistoryFromClickOnItemList(flk_2 flk_22, fdv_1 fdv_12) {
        if (!flk_22.bqr() || !(flk_22.getValue() instanceof fhc_0)) {
            return;
        }
        fhc_0 fhc_02 = (fhc_0)flk_22.getValue();
        fdv_12.setText(fhc_02.getName());
        cfp_1.a(fhc_02.getName(), fdv_12);
    }

    public static void updateHistoryNameSearch(fiq_1 fiq_12, fdv_1 fdv_12) {
        mVX.a(bhh_1.kcp, () -> cfp_1.a(fdv_12.getText(), fdv_12));
    }

    private static void a(String string, fdv_1 fdv_12) {
        fiQ fiQ2;
        String string2;
        String string3 = BH.aT(string);
        if (string3.equals(string2 = (fiQ2 = cwl_1.eVl().eVK()).getName())) {
            return;
        }
        bdc_0.dRc().dRe();
        fiQ2.sM(string3.isBlank() ? null : string3).D(aum_0.cWf().aUXX());
        aaw_1.bUq().h(new dae_0(18170));
    }

    public static void updateHistoryPriceSearch(fiq_1 fiq_12, fdu_1 fdu_12, fdu_1 fdu_13) {
        long l = cfp_1.pC(fdu_12.getText());
        long l2 = cfp_1.pC(fdu_13.getText());
        bho_1 bho_12 = new bho_1(l, l2);
        cfp_1.a(fdu_12, fdu_13, bho_12, l, l2);
        mVX.a(bhh_1.kcu, () -> {
            fiQ fiQ2 = cwl_1.eVl().eVK();
            long l3 = fiQ2.gah();
            long l4 = fiQ2.gai();
            if (l == l3 && l2 == l4) {
                return;
            }
            fiQ2.tI(l).tJ(l2);
            aaw_1.bUq().h(new dae_0(18170));
        });
    }

    public static void selectHistoryElementType(flk_2 flk_22) {
        fiQ fiQ2;
        if (!(flk_22.getValue() instanceof bhv_2)) {
            mVU.error((Object)("[MARKET] Not a history element type: " + String.valueOf(flk_22.getValue())));
            return;
        }
        @Nullable fjb fjb2 = ((bhv_2)flk_22.getValue()).dXd();
        if (fjb2 == (fiQ2 = cwl_1.eVl().eVK()).dXd()) {
            return;
        }
        fiQ2.a(fjb2);
        fse_1.gFu().a((aef_2)bhz_2.dWn(), "selectedTimespan");
        aaw_1.bUq().h(new dae_0(18170));
    }

    public static void selectHistoryTimespan(flk_2 flk_22) {
        fiQ fiQ2;
        if (!(flk_22.getValue() instanceof bik_1)) {
            mVU.error((Object)("[MARKET] Not a timespan: " + String.valueOf(flk_22.getValue())));
            return;
        }
        fjh fjh2 = ((bik_1)flk_22.getValue()).dXD();
        if (fjh2 == (fiQ2 = cwl_1.eVl().eVK()).dXD()) {
            return;
        }
        fiQ2.a(fjh2);
        fse_1.gFu().a((aef_2)bhz_2.dWn(), "selectedTimespan");
        aaw_1.bUq().h(new dae_0(18170));
    }

    public static void openOfferItemChoiceDialog(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(16253));
    }

    public static void updateOfferItemChoiceSearch(fiq_1 fiq_12, fdv_1 fdv_12) {
        dae_0 dae_02 = new dae_0(19592);
        dae_02.fa(fdv_12.getText());
        aaw_1.bUq().h(dae_02);
    }

    public static void selectOfferItem(flk_2 flk_22) {
        if (!flk_22.bqr() || !(flk_22.getValue() instanceof bgv_2)) {
            return;
        }
        cfp_1.a(true, (bgv_2)flk_22.getValue());
    }

    public static void dropItemToCreateOffer(fla_2 fla_22) {
        if (!(fla_22.getValue() instanceof ffV)) {
            return;
        }
        cfe_1.onDropItem();
        cfp_1.a(true, (bgv_2)((ffV)fla_22.getValue()).dOg());
    }

    public static void showOfferItemPopup(fiq_1 fiq_12, frx_1 frx_12, fes_2 fes_22) {
        bgv_2 bgv_22 = bhz_2.dWn().dWJ().duo();
        if (bgv_22 == null) {
            return;
        }
        cgn_1.showPopup(null, ffV.k(bgv_22), frx_12, fes_22);
    }

    public static void disableCreateOfferMode(fiq_1 fiq_12) {
        cfp_1.a(false, null);
    }

    private static void a(boolean bl, bgv_2 bgv_22) {
        dae_0 dae_02 = new dae_0(19182);
        dae_02.cC(bl);
        dae_02.D(bgv_22);
        aaw_1.bUq().h(dae_02);
    }

    public static void sendCreateOfferMessage() {
        aaw_1.bUq().h(new dae_0(16917));
    }

    public static void refreshCreateOfferData(fle_2 fle_22) {
        if (!fle_22.gDO()) {
            bhz_2.dWn().dWJ().dUP();
        }
    }

    public static void offerUnitPriceChanged(fli_2 fli_22, fdu_1 fdu_12) {
        if (fli_22.bCC() == 10) {
            cfp_1.sendCreateOfferMessage();
            return;
        }
        long l = cfp_1.h(fdu_12.getText(), 0L);
        if (l != bhz_2.dWn().dWJ().akd()) {
            bhz_2.dWn().dWJ().k(l, l > 999999999999L);
        }
    }

    public static void offerQuantityChanged(fli_2 fli_22, fdu_1 fdu_12) {
        if (fli_22.bCC() == 10) {
            cfp_1.sendCreateOfferMessage();
            return;
        }
        cfp_1.G(fdu_12.getText(), false);
    }

    public static void setOfferQuantityTo(fiq_1 fiq_12, String string) {
        cfp_1.G(string, true);
    }

    private static void G(String string, boolean bl) {
        int n = (int)cfp_1.h(string, 0L);
        if (n != bhz_2.dWn().dWJ().oP()) {
            bhz_2.dWn().dWJ().z(n, bl || n > 999999);
        }
    }

    public static void offerSellDurationChanged(flk_2 flk_22) {
        if (!(flk_22.getValue() instanceof big_1)) {
            mVU.error((Object)("[MARKET] Not a sell duration: " + String.valueOf(flk_22.getValue())));
            return;
        }
        big_1 big_12 = (big_1)flk_22.getValue();
        if (big_12 != bhz_2.dWn().dWJ().dUX()) {
            bhz_2.dWn().dWJ().a(big_12);
        }
    }

    public static void offerItemLevelChanged(fli_2 fli_22, fdu_1 fdu_12) {
        if (fli_22.bCC() == 10) {
            cfp_1.sendCreateOfferMessage();
            return;
        }
        short s = (short)cfp_1.pC(fdu_12.getText());
        if (s != bhz_2.dWn().dWJ().dUY()) {
            bhz_2.dWn().dWJ().bY(s);
        }
    }

    public static void toggleOfferSlotsFixedOrder(fiq_1 fiq_12, fdd_2 fdd_22) {
        boolean bl = cfp_1.a(fiq_12, fdd_22);
        bhz_2.dWn().dWJ().hI(bl);
        cfp_1.n(bl, bl);
    }

    public static void changeOfferSlotColor(flk_2 flk_22, bii_1 bii_12, fdd_2 fdd_22) {
        if (!flk_22.bqr() || !(flk_22.getValue() instanceof bih_1)) {
            return;
        }
        bih_1 bih_12 = (bih_1)flk_22.getValue();
        boolean bl = bih_12.dXy() != bii_12.dXA().dXy();
        bii_12.b(bih_12);
        cfp_1.n(fdd_22.getSelected(), bl);
    }

    private static void n(boolean bl, boolean bl2) {
        dae_0 dae_02 = new dae_0(18452);
        dae_02.cC(bl);
        dae_02.sY(bl2 ? 1 : 0);
        aaw_1.bUq().h(dae_02);
    }

    public static void resetOfferSlots(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(17480));
    }

    public static void selectOfferBasicSublimation(flk_2 flk_22) {
        if (!flk_22.bqr() || !(flk_22.getValue() instanceof bij_1)) {
            return;
        }
        bij_1 bij_12 = (bij_1)flk_22.getValue();
        cfp_1.c(bij_12);
    }

    private static void c(@Nullable bij_1 bij_12) {
        if (bij_12 != bhz_2.dWn().dWJ().dVa().dVW()) {
            bhz_2.dWn().dWJ().a(bij_12);
        }
    }

    public static void updateOfferBasicSublimation(fiq_1 fiq_12, fdv_1 fdv_12) {
        String string = fdv_12.getText();
        bhz_2.dWn().dWJ().dVa().mL(string);
        if (string == null || string.isBlank()) {
            cfp_1.clearOfferBasicSublimation(null);
        }
        bij_1 bij_12 = bhz_2.dWn().dWJ().C(string, false);
        cfp_1.c(bij_12);
    }

    public static void selectOfferSpecialSublimation(flk_2 flk_22) {
        if (!flk_22.bqr() || !(flk_22.getValue() instanceof bij_1)) {
            return;
        }
        bij_1 bij_12 = (bij_1)flk_22.getValue();
        cfp_1.d(bij_12);
    }

    private static void d(@Nullable bij_1 bij_12) {
        if (bij_12 != bhz_2.dWn().dWJ().dVa().dVX()) {
            bhz_2.dWn().dWJ().b(bij_12);
        }
    }

    public static void updateOfferSpecialSublimation(fiq_1 fiq_12, fdv_1 fdv_12) {
        String string = fdv_12.getText();
        bhz_2.dWn().dWJ().dVa().mM(string);
        if (string == null || string.isBlank()) {
            cfp_1.clearOfferSpecialSublimation(null);
        }
        bij_1 bij_12 = bhz_2.dWn().dWJ().C(string, false);
        cfp_1.d(bij_12);
    }

    public static void clearOfferBasicSublimation(@Nullable fiq_1 fiq_12) {
        bhz_2.dWn().dWJ().dVa().mL(null);
        bhz_2.dWn().dWJ().a((bij_1)null);
    }

    public static void clearOfferSpecialSublimation(@Nullable fiq_1 fiq_12) {
        bhz_2.dWn().dWJ().dVa().mM(null);
        bhz_2.dWn().dWJ().b(null);
    }

    public static void createOffer(fiq_1 fiq_12) {
        cfp_1.sendCreateOfferMessage();
    }

    public static void fulfillOffer(fiq_1 fiq_12, fey_2 fey_22, bhz_1 bhz_12) {
        dae_0 dae_02 = new dae_0(16803);
        dae_02.D(bhz_12);
        aaw_1.bUq().h(dae_02);
    }

    public static void cancelFulfillment(fiq_1 fiq_12) {
        cfp_1.closeOfferFulfillWindow();
    }

    public static void closeOfferFulfillWindow() {
        fse_1.gFu().f("marketOfferFulfillment", (Object)null);
        fyw_0.gqw().J("marketFulfillOfferDialog", false);
    }

    public static void dropItemToFulfillOffer(fla_2 fla_22) {
        if (!(fla_22.getValue() instanceof ffV)) {
            return;
        }
        cfe_1.onDropItem();
        cfp_1.bx((ffV)fla_22.getValue());
    }

    private static void bx(ffV ffV2) {
        if (!fiu_1.uCW.fd("marketFulfillOfferLock")) {
            return;
        }
        dae_0 dae_02 = new dae_0(19753);
        dae_02.D(ffV2);
        aaw_1.bUq().h(dae_02);
    }

    public static void removeItemFulfillingOffer(fiq_1 fiq_12, bhp_2 bhp_22) {
        dae_0 dae_02 = new dae_0(17858);
        dae_02.D(bhp_22.getItem());
        aaw_1.bUq().h(dae_02);
    }

    public static void autoFulfillOffer(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(19706));
    }

    public static void updateOfferFulfillmentItemQuantity(fli_2 fli_22, fdu_1 fdu_12, bho_2 bho_22, bhp_2 bhp_22) {
        if (fli_22.bCC() == 10) {
            cfp_1.confirmOfferFulfillment(null);
            return;
        }
        int n = (int)cfp_1.h(fdu_12.getText(), 0L);
        if (n != bhp_22.oP()) {
            bho_22.a(bhp_22, n);
        }
    }

    public static void setOfferFulfillmentItemQuantityToMax(fiq_1 fiq_12, bho_2 bho_22, bhp_2 bhp_22) {
        bho_22.a(bhp_22, bhp_22.dVs());
    }

    public static void confirmOfferFulfillment(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(17565));
    }

    public static void updateCurrentOffersNameSearch(fiq_1 fiq_12, fdv_1 fdv_12) {
        dae_0 dae_02 = new dae_0(16643);
        dae_02.fa(fdv_12.getText());
        aaw_1.bUq().h(dae_02);
    }

    public static void searchCurrentOffersFromClickOnItemList(flk_2 flk_22, fdv_1 fdv_12) {
        if (!flk_22.bqr() || !(flk_22.getValue() instanceof fhc_0)) {
            return;
        }
        fhc_0 fhc_02 = (fhc_0)flk_22.getValue();
        fdv_12.setText(fhc_02.getName());
        cfp_1.updateOnSaleEntriesNameSearch(null, fdv_12);
    }

    public static void currentOffersPreviousPage(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(16441));
    }

    public static void currentOffersNextPage(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(18727));
    }

    public static void scrollOnCurrentOffers(flp_2 flp_22) {
        if (flp_22.gEo() > 0) {
            cfp_1.currentOffersNextPage(flp_22);
        } else {
            cfp_1.currentOffersPreviousPage(flp_22);
        }
    }

    public static void cancelCurrentOffer(fiq_1 fiq_12, bhz_1 bhz_12) {
        dae_0 dae_02 = new dae_0(17150);
        dae_02.D(bhz_12);
        aaw_1.bUq().h(dae_02);
    }

    public static void toggleExpiredOffersDetailWindow(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(18675));
    }

    public static void expiredOffersPreviousPage(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(18871));
    }

    public static void expiredOffersNextPage(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(16026));
    }

    public static void scrollExpiredOffersSearch(flp_2 flp_22) {
        if (flp_22.gEo() > 0) {
            cfp_1.expiredOffersNextPage(flp_22);
        } else {
            cfp_1.expiredOffersPreviousPage(flp_22);
        }
    }

    public static void retrieveAllExpiredOffersKamas(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(19850));
    }

    public static void togglePurchasedItemsDetailWindow(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(16486));
    }

    public static void purchasedItemsPreviousPage(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(19721));
    }

    public static void purchasedItemsNextPage(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(18870));
    }

    public static void scrollPurchasedItemsSearch(flp_2 flp_22) {
        if (flp_22.gEo() > 0) {
            cfp_1.purchasedItemsNextPage(flp_22);
        } else {
            cfp_1.purchasedItemsPreviousPage(flp_22);
        }
    }

    public static void retrieveOnePurchasedItem(fiq_1 fiq_12, bia_1 bia_12) {
        dae_0 dae_02 = new dae_0(18794);
        dae_02.D(bia_12);
        aaw_1.bUq().h(dae_02);
    }

    public static void retrieveAllOfferPurchasedItems(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(16517));
    }

    public static void openOptionsTab(fiq_1 fiq_12) {
        dae_0 dae_02 = new dae_0(19720);
        dae_02.ay((byte)99);
        aaw_1.bUq().h(dae_02);
    }

    private static void a(bsn_1 bsn_12, flv_2 flv_22) {
        boolean bl = flv_22.bqr();
        ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_12, bl);
    }

    private static void a(bsn_1 bsn_12, flk_2 flk_22) {
        if (!flk_22.bqr()) {
            return;
        }
        Object object = flk_22.getValue();
        if (!(object instanceof bic_1)) {
            return;
        }
        ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_12, ((bic_1)object).d());
    }

    public static void changeOpenInventory(flv_2 flv_22) {
        cfp_1.a(bsn_1.lkJ, flv_22);
    }

    public static void changeKeepLastSearch(flv_2 flv_22) {
        cfp_1.a(bsn_1.lkK, flv_22);
    }

    public static void changeIncludeOtherRarities(flv_2 flv_22) {
        cfp_1.a(bsn_1.lkL, flv_22);
        dae_0 dae_02 = new dae_0(16037);
        dae_02.D((Object)bhh_1.kcp);
        aaw_1.bUq().h(dae_02);
    }

    public static void changeSellItemPriceFieldKeepMode(flk_2 flk_22) {
        cfp_1.a(bsn_1.lkM, flk_22);
    }

    public static void changeSellItemQuantityFieldKeepMode(flk_2 flk_22) {
        cfp_1.a(bsn_1.lkN, flk_22);
    }

    public static void changeSellItemKeepSellDuration(flv_2 flv_22) {
        cfp_1.a(bsn_1.lkO, flv_22);
    }

    public static void changeCreateOfferPriceFieldKeepMode(flk_2 flk_22) {
        cfp_1.a(bsn_1.lkP, flk_22);
    }

    public static void changeCreateOfferQuantityFieldKeepMode(flk_2 flk_22) {
        cfp_1.a(bsn_1.lkQ, flk_22);
    }

    public static void changeCreateOfferKeepSellDuration(flv_2 flv_22) {
        cfp_1.a(bsn_1.lkR, flv_22);
    }

    public static void changeCreateOfferKeepSlotsAndSublimations(flv_2 flv_22) {
        cfp_1.a(bsn_1.lkS, flv_22);
    }

    public static void changeCreateOfferKeepItemLevel(flv_2 flv_22) {
        cfp_1.a(bsn_1.lkT, flv_22);
    }
}

