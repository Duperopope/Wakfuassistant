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

@fyF
public final class cFp {
    private static final Logger mVU = Logger.getLogger(cFp.class);
    public static final String PACKAGE = "wakfu.market";
    private static final String mVV = "entryNameSearch";
    private static final String mVW = "offerNameSearch";
    private static final bHk mVX = new bHk();

    private cFp() {
    }

    private static long h(@Nullable String string, long l) {
        if (string == null || string.isBlank()) {
            return l;
        }
        try {
            return aUM.cWf().cQ(string);
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
            aUM.cWf().cQ(string);
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
        if (object instanceof fgf) {
            return Optional.ofNullable(((fgf)object).getItem());
        }
        if (object instanceof bEK) {
            bGV bGV2 = ((bEK)object).duo();
            return Optional.ofNullable(ffV.a(bGV2.d(), bGV2));
        }
        return Optional.empty();
    }

    private static boolean a(fIq fIq2, fDD fDD2) {
        boolean bl;
        if (fIq2 instanceof fLV) {
            bl = ((fLV)fIq2).bqr();
        } else {
            bl = !fDD2.getSelected();
            fDD2.setSelected(bl);
        }
        return bl;
    }

    public static void changeMarketView(fLV fLV2) {
        if (!fLV2.bqr()) {
            return;
        }
        fCu fCu2 = (fCu)fLV2.gBE();
        try {
            byte by = Byte.parseByte(fCu2.getValue());
            dae dae2 = new dae(19720);
            dae2.ay(by);
            aAW.bUq().h(dae2);
        }
        catch (NumberFormatException numberFormatException) {
            mVU.error((Object)("Invalid tab value : " + fCu2.getValue()));
        }
    }

    public static void setSellItemMode(fIq fIq2, String string) {
        boolean bl = Boolean.parseBoolean(string);
        dae dae2 = new dae(17125);
        dae2.cC(bl);
        aAW.bUq().h(dae2);
    }

    static void a(fLP fLP2, @Nullable Object object) {
        if (!aUE.cVJ().c(cWl.eVl())) {
            return;
        }
        if (!fLP2.gEk()) {
            return;
        }
        cFp.aE(object).ifPresent(ffV2 -> {
            if (fyw.gqw().to("marketFulfillOfferDialog")) {
                cFp.bx(ffV2);
            } else if (cWl.eVx()) {
                fDv fDv2 = (fDv)fyw.gqw().th("marketDialog").getElementMap().uH(cWl.eVE() ? mVV : mVW);
                if (fDv2 == null) {
                    return;
                }
                cFp.a(ffV2, fDv2);
            } else if (cWl.eVG()) {
                cFp.bh(ffV2);
            } else if (cWl.eVH()) {
                cFp.a(true, (bGV)ffV2.dOg());
            }
        });
    }

    public static void changeSearchSubTab(fLV fLV2) {
        cFp.a((short)19728, fLV2);
    }

    public static void changeMyOffersSubTab(fLV fLV2) {
        cFp.a((short)19470, fLV2);
    }

    private static void a(short s, fLV fLV2) {
        if (!fLV2.bqr() || !(fLV2.gBE() instanceof fCu)) {
            return;
        }
        fCu fCu2 = (fCu)fLV2.gBE();
        try {
            int n = Integer.parseInt(fCu2.getValue()) - 1;
            dae dae2 = new dae(s);
            dae2.sY(n);
            aAW.bUq().h(dae2);
        }
        catch (NumberFormatException numberFormatException) {
            mVU.error((Object)("Invalid sub tab value : " + fCu2.getValue()));
        }
    }

    public static void updateOnSaleEntriesNameSearch(fIq fIq2, fDv fDv2) {
        dae dae2 = new dae(18783);
        dae2.fa(fDv2.getText());
        aAW.bUq().h(dae2);
    }

    public static void searchOnSaleEntriesFromClickOnItemList(fLK fLK2, fDv fDv2) {
        if (!fLK2.bqr() || !(fLK2.getValue() instanceof fhC)) {
            return;
        }
        fhC fhC2 = (fhC)fLK2.getValue();
        fDv2.setText(fhC2.getName());
        cFp.updateOnSaleEntriesNameSearch(null, fDv2);
    }

    public static void onSaleEntriesPreviousPage(fIq fIq2) {
        aAW.bUq().h(new dae(19616));
    }

    public static void onSaleEntriesNextPage(fIq fIq2) {
        aAW.bUq().h(new dae(18307));
    }

    public static void scrollOnSaleSearch(fLP fLP2) {
        if (fLP2.gEo() > 0) {
            cFp.onSaleEntriesNextPage(fLP2);
        } else {
            cFp.onSaleEntriesPreviousPage(fLP2);
        }
    }

    public static void retrieveOnSaleItem(fIq fIq2, bHU bHU2) {
        dae dae2 = new dae(17500);
        dae2.D(bHU2);
        aAW.bUq().h(dae2);
    }

    public static void fetchKamas(fIq fIq2) {
        aAW.bUq().h(new dae(17734));
    }

    public static void toggleSoldItemsDetailWindow(fIq fIq2) {
        aAW.bUq().h(new dae(17931));
    }

    public static void soldItemsPreviousPage(fIq fIq2) {
        aAW.bUq().h(new dae(19875));
    }

    public static void soldItemsNextPage(fIq fIq2) {
        aAW.bUq().h(new dae(18762));
    }

    public static void scrollSoldItemsSearch(fLP fLP2) {
        if (fLP2.gEo() > 0) {
            cFp.soldItemsNextPage(fLP2);
        } else {
            cFp.soldItemsPreviousPage(fLP2);
        }
    }

    public static void retrieveExpireEntry(fIq fIq2, bHU bHU2) {
        dae dae2 = new dae(19215);
        dae2.D(bHU2);
        aAW.bUq().h(dae2);
    }

    public static void retrieveAllExpiredEntries(fIq fIq2) {
        aAW.bUq().h(new dae(16042));
    }

    public static void toggleExpireEntriesDetailWindow(fIq fIq2) {
        aAW.bUq().h(new dae(17666));
    }

    public static void expiredEntriesPreviousPage(fIq fIq2) {
        aAW.bUq().h(new dae(17570));
    }

    public static void expiredEntriesNextPage(fIq fIq2) {
        aAW.bUq().h(new dae(18198));
    }

    public static void scrollExpiredEntriesSearch(fLP fLP2) {
        if (fLP2.gEo() > 0) {
            cFp.expiredEntriesNextPage(fLP2);
        } else {
            cFp.expiredEntriesPreviousPage(fLP2);
        }
    }

    public static void dropItemToSell(fLA fLA2) {
        cFe.onDropItem();
        cFp.aE(fLA2.getValue()).ifPresent(cFp::bh);
    }

    public static void dropItemToSell(fLA fLA2, fDu fDu2) {
        cFe.onDropItem();
        cFp.aE(fLA2.getValue()).ifPresent(ffV2 -> cFp.a(ffV2, fDu2));
    }

    public static void selectItemToSellFromList(fLP fLP2, ffV ffV2, fDu fDu2) {
        if (!fIU.uCW.fd("marketSellViewLock")) {
            return;
        }
        if (!fLP2.gEk()) {
            return;
        }
        cFp.a(ffV2, fDu2);
    }

    private static void bh(ffV ffV2) {
        fHv fHv3 = fyw.gqw().th("marketDialog");
        fDu fDu2 = fHv3 == null ? null : (fDu)fHv3.getElementRecursively("priceSellItemTE", fHv2 -> !fHv2.isATemplate());
        cFp.a(ffV2, fDu2);
    }

    private static void a(ffV ffV2, @Nullable fDu fDu2) {
        if (fcI.ag(aUE.cVJ().cVK().Xi(), ffV2.LV()) == null) {
            mVU.error((Object)"This item does not belong to the player");
            return;
        }
        dbS dbS2 = new dbS();
        dbS2.az(ffV2.bfd());
        dbS2.setItem(ffV2);
        dbS2.i(fDu2);
        aAW.bUq().h(dbS2);
    }

    public static void filterInventoryItems(fIq fIq2, fDv fDv2) {
        String string = fDv2.getText();
        bHz.dWn().mO(string);
    }

    public static void sortInventoryItems(fLV fLV2, String string) {
        if (!fLV2.bqr()) {
            return;
        }
        Optional<bIn> optional = bIn.dh(string);
        if (optional.isEmpty()) {
            return;
        }
        dae dae2 = new dae(18837);
        dae2.D((Object)optional.get());
        aAW.bUq().h(dae2);
    }

    public static void showItemToSellPopup(fIq fIq2, fRX fRX2, fEs fEs2) {
        ffV ffV2 = bHz.dWn().dWI().getItem();
        if (ffV2 == null) {
            return;
        }
        cGN.showPopup(null, ffV2, fRX2, fEs2);
    }

    public static void refreshSaleData(fLE fLE2) {
        if (!fLE2.gDO()) {
            bHz.dWn().dWI().dVC();
        }
    }

    public static void priceChanged(fLI fLI2, fDu fDu2) {
        if (fLI2.bCC() == 10) {
            cFp.eKu();
            return;
        }
        long l = cFp.h(fDu2.getText(), 0L);
        if (l != bHz.dWn().dWI().akd()) {
            bHz.dWn().dWI().k(l, l > 999999999999L);
        }
    }

    public static void quantityChanged(fLI fLI2, fDu fDu2) {
        if (fLI2.bCC() == 10) {
            cFp.eKu();
            return;
        }
        int n = (int)cFp.h(fDu2.getText(), 0L);
        if (bHz.dWn().dWI().oP() != n) {
            cFp.F(n, n > bHz.dWn().dWI().dVs());
        }
    }

    public static void setQuantityToOne(fIq fIq2) {
        cFp.F(1, true);
    }

    public static void removeOneFromQuantity(fIq fIq2, bHs bHs2) {
        cFp.F(bHs2.oP() - 1, true);
    }

    public static void setQuantityToHalf(fIq fIq2, bHs bHs2) {
        cFp.F(bHs2.dVs() / 2, true);
    }

    public static void addOneToQuantity(fIq fIq2, bHs bHs2) {
        cFp.F(bHs2.oP() + 1, true);
    }

    public static void setQuantityToMax(fIq fIq2, bHs bHs2) {
        cFp.F(bHs2.dVs(), true);
    }

    private static void F(int n, boolean bl) {
        bHz.dWn().dWI().z(n, bl);
    }

    public static void sellDurationChanged(fLK fLK2) {
        if (!(fLK2.getValue() instanceof bIg)) {
            mVU.error((Object)("[MARKET] Not a sell duration: " + String.valueOf(fLK2.getValue())));
            return;
        }
        bIg bIg2 = (bIg)fLK2.getValue();
        aAW.bUq().h(new dbT(bIg2));
    }

    public static void cancelItemToSell(fIq fIq2) {
        dae dae2 = new dae(17607);
        aAW.bUq().h(dae2);
    }

    public static void sellItem(fLP fLP2) {
        cFp.eKu();
    }

    private static void eKu() {
        dae dae2 = new dae(18709);
        aAW.bUq().h(dae2);
    }

    public static void previousPage(fIq fIq2) {
        aAW.bUq().h(new dae(18915));
    }

    public static void nextPage(fIq fIq2) {
        aAW.bUq().h(new dae(16195));
    }

    public static void scrollMainSearch(fLP fLP2) {
        if (fLP2.gEo() > 0) {
            cFp.nextPage(fLP2);
        } else {
            cFp.previousPage(fLP2);
        }
    }

    public static void enterMainSearchRow(fLG fLG2) {
        if (fLG2.getItemValue() instanceof bHY) {
            bHz.dWn().a((bHY)fLG2.getItemValue());
        }
    }

    public static void exitMainSearchRow(fLG fLG2) {
        bHz.dWn().a((bHY)null);
    }

    public static void createOfferFromEntry(fIq fIq2, bHU bHU2, fCu fCu2) {
        fCu2.getAppearance().grr();
        cFp.a(true, (bGV)bHU2.getItem().dOg());
    }

    public static void openStuffPreviewWindow(fIq fIq2, bHU bHU2) {
        cTD.eQA().bB(bHU2.getItem());
    }

    public static void purchaseEntry(fIq fIq2, fEy fEy2, bHU bHU2) {
        fSe.gFu().f("marketItemPurchase", new bHr(bHU2));
        cCJ.g("marketConfirmPurchaseDialog", 256L);
    }

    public static void showPurchaseItemPopup(fIq fIq2, bHr bHr2, fRX fRX2, fEs fEs2) {
        cGN.showPopup(null, bHr2.getItem(), fRX2, fEs2);
    }

    public static void setItemPurchaseQuantityToOne(fIq fIq2, bHr bHr2) {
        bHr2.Fq(1);
    }

    public static void removeOneToItemPurchaseQuantity(fIq fIq2, bHr bHr2) {
        bHr2.Fq(bHr2.oP() - 1);
    }

    public static void setItemPurchaseQuantityToHalf(fIq fIq2, bHr bHr2) {
        bHr2.Fq(bHr2.dVz() / 2);
    }

    public static void addOneToItemPurchaseQuantity(fIq fIq2, bHr bHr2) {
        bHr2.Fq(bHr2.oP() + 1);
    }

    public static void setItemPurchaseQuantityToMax(fIq fIq2, bHr bHr2) {
        bHr2.Fq(bHr2.dVz());
    }

    public static void updateItemPurchaseQuantity(fLI fLI2, bHr bHr2, fDu fDu2) {
        if (fLI2.bCC() == 10) {
            cFp.confirmPurchase(fLI2, bHr2);
            return;
        }
        int n = (int)cFp.h(fDu2.getText(), 0L);
        if (bHr2.oP() != n) {
            bHr2.z(n, n >= bHr2.dVz());
        }
    }

    public static void updateItemPurchaseQuantityWithMouseWheel(fLP fLP2, bHr bHr2) {
        int n = fLP2.gDT() ? 10 : 1;
        bHr2.Fq(bHr2.oP() - fLP2.gEo() * n);
    }

    public static void confirmPurchase(fIq fIq2, bHr bHr2) {
        if (!bHr2.dVA()) {
            return;
        }
        dae dae2 = new dae(16464);
        dae2.sY(bHr2.oP());
        dae2.D(bHr2.dVB());
        aAW.bUq().h(dae2);
        cFp.eKv();
    }

    public static void cancelPurchase(fIq fIq2) {
        cFp.eKv();
    }

    private static void eKv() {
        fSe.gFu().f("marketItemPurchase", (Object)null);
        fyw.gqw().J("marketConfirmPurchaseDialog", false);
    }

    public static void similarEntriesSearchPreviousPage(fIq fIq2) {
        aAW.bUq().h(new dae(17161));
    }

    public static void similarEntriesSearchNextPage(fIq fIq2) {
        aAW.bUq().h(new dae(18696));
    }

    public static void scrollSimilarEntriesSearch(fLP fLP2) {
        if (fLP2.gEo() > 0) {
            cFp.similarEntriesSearchNextPage(fLP2);
        } else if (fLP2.gEo() < 0) {
            cFp.similarEntriesSearchPreviousPage(fLP2);
        }
    }

    public static void similarOffersSearchPreviousPage(fIq fIq2) {
        aAW.bUq().h(new dae(16728));
    }

    public static void similarOffersSearchNextPage(fIq fIq2) {
        aAW.bUq().h(new dae(19632));
    }

    public static void scrollSimilarOffersSearch(fLP fLP2) {
        if (fLP2.gEo() > 0) {
            cFp.similarOffersSearchNextPage(fLP2);
        } else if (fLP2.gEo() < 0) {
            cFp.similarOffersSearchPreviousPage(fLP2);
        }
    }

    public static void showItemDetails(fLG fLG2) {
        if (!fLG2.gEm()) {
            return;
        }
        cFp.aE(fLG2.getItemValue()).ifPresent(ffV2 -> {
            fEs fEs2 = (fEs)fLG2.gBE();
            if (aPe.a(fLG2)) {
                aPe.ag(ffV2.dOg());
            } else {
                cDd.sendOpenCloseItemDetailMessage(ffV2, fHz.gAS().getX(), fLG2.getScreenY() + fEs2.getHeight());
            }
        });
    }

    public static void toggleAdvancedFiltersWindow(fIq fIq2) {
        aAW.bUq().h(new dae(19554));
    }

    public static void removeFilter(fIq fIq2, bHI bHI2) {
        aAW.bUq().h(new dbW(bHI2));
    }

    public static void removeAllFilters(fIq fIq2) {
        aAW.bUq().h(new dae(16505));
    }

    private static long pC(@Nullable String string) {
        return cFp.h(string, -1L);
    }

    public static void collapseType(fIq fIq2, bEO bEO2) {
        aAW.bUq().h(new dbV(bEO2));
    }

    public static void collapseInventoryType(fIq fIq2, bIe bIe2) {
        aAW.bUq().h(new dbV(bIe2));
    }

    public static void toggleType(fLV fLV2, bEO bEO3) {
        boolean bl = fLV2.bqr();
        if (bEO3.bqr() == bl) {
            return;
        }
        bEO3.hD(bl);
        ArrayList<bHI> arrayList = new ArrayList<bHI>();
        bEO3.k(bEO2 -> arrayList.add(new bHJ((bEO)bEO2, () -> bEO2.hD(false))));
        aAW.bUq().h(new dbZ(arrayList));
    }

    public static void dropItemOnSearch(fLA fLA2, fDv fDv2) {
        cFp.aE(fLA2.getValue()).ifPresent(ffV2 -> cFp.a(ffV2, fDv2));
    }

    public static void searchFromEntry(fIq fIq2, fDv fDv2, bHY bHY2) {
        cFp.a(bHY2.getItem(), fDv2);
    }

    public static void searchFromClickOnItemList(fLK fLK2, fDv fDv2) {
        if (!fLK2.bqr() || !(fLK2.getValue() instanceof fhC)) {
            return;
        }
        ffV ffV2 = ffV.k((fhC)fLK2.getValue());
        cFp.a(ffV2, fDv2);
    }

    private static void a(ffV ffV2, fDv fDv2) {
        bHl bHl2 = bHz.dWn().dWo();
        boolean bl = cFp.a(ffV2, bHl2);
        String string = ffV2.getName();
        fDv2.setText(string);
        cFp.a(new bHL(string, ffV2.avr(), bHl2), bl, bHl2);
    }

    private static boolean a(ffV ffV2, bHl bHl2) {
        Collection collection;
        ArrayList<bHI> arrayList = new ArrayList<bHI>();
        bHK bHK2 = (bHK)bHl2.b(bHH.kcq);
        if (bHK2 != null && !bHK2.lu(ffV2.dOg().cmL())) {
            arrayList.add(bHK2);
        }
        if ((collection = bHl2.c(bHH.kcr)) != null && !collection.isEmpty() && collection.stream().noneMatch(bHR2 -> bHR2.dwg() == ffV2.dwg())) {
            arrayList.addAll(collection);
        }
        if (ffV2.dOg().cpA() == 0) {
            arrayList.addAll(bHl2.c(bHH.kcx));
            arrayList.addAll(bHl2.c(bHH.kcy));
        }
        if (ffV2.dOg().bcx().aVo() == 0) {
            arrayList.addAll(bHl2.c(bHH.kcz));
        }
        if (!arrayList.isEmpty()) {
            aAW.bUq().h(new dbW(false, arrayList));
        }
        return !arrayList.isEmpty();
    }

    public static void updateNameSearch(fIq fIq2, fDv fDv2) {
        bHl bHl2 = bHz.dWn().dWo();
        mVX.a(bHH.kcp, () -> cFp.a(new bHL(fDv2.getText(), bHl2), false, bHl2));
    }

    private static void a(bHL bHL2, boolean bl, bHl bHl2) {
        if (!bl && bHL2.equals(bHl2.b(bHH.kcp))) {
            return;
        }
        aAW.bUq().h(new dbZ(bHL2));
    }

    public static void setLevelSearchToCurrent(fIq fIq2, fDu fDu2, fDu fDu3) {
        bgT bgT2 = aUE.cVJ().cVK();
        if (bgT2 != null) {
            boolean bl;
            Bu<Short, Short> bu = eIi.dD(bgT2.cmL());
            boolean bl2 = bl = fDu2.getText().equals(bu.getFirst().toString()) && fDu3.getText().equals(bu.aHI().toString());
            if (bl) {
                fDu2.clear();
                fDu3.clear();
                cFp.a(fDu2, fDu3, (short)-1, (short)-1);
            } else {
                fDu2.setText(bu.getFirst());
                fDu3.setText(bu.aHI());
                cFp.a(fDu2, fDu3, bu.getFirst(), bu.aHI());
            }
        }
    }

    public static void updateLevelSearch(fIq fIq2, fDu fDu2, fDu fDu3) {
        short s = (short)cFp.pC(fDu2.getText());
        short s2 = (short)cFp.pC(fDu3.getText());
        cFp.a(fDu2, fDu3, s, s2);
    }

    private static void a(fDu fDu2, fDu fDu3, short s, short s2) {
        bHK bHK2 = new bHK(s, s2, bHz.dWn().dWo());
        cFp.a(fDu2, fDu3, bHK2, s, s2);
        mVX.a(bHH.kcq, () -> aAW.bUq().h(new dbZ(bHK2)));
    }

    private static void a(fDu fDu2, fDu fDu3, bHI bHI2, long l, long l2) {
        if (bHI2.isValid() || l == -1L && l2 == -1L) {
            fDu2.guN();
            fDu3.guN();
        } else {
            fDu2.getTextBuilder().C(new fHl(etT.omi));
            fDu3.getTextBuilder().C(new fHl(etT.omi));
        }
    }

    public static void resetRaritySearch(fIq fIq2) {
        aAW.bUq().h(new dbX(bHH.kcr));
    }

    public static void toggleRarity(fLV fLV2, bIl bIl2) {
        aAW.bUq().h(new dbY(bIl2, fLV2.bqr()));
    }

    public static void toggleOnlyCheapest(fIq fIq2, fDD fDD2) {
        cFp.a(fIq2, fDD2, "market.filter.only.cheapest");
    }

    public static void toggleOnlyMostExpensive(fIq fIq2, fDD fDD2) {
        cFp.a(fIq2, fDD2, "market.filter.only.most.expensive");
    }

    private static void a(fIq fIq2, fDD fDD2, String string) {
        boolean bl = cFp.a(fIq2, fDD2);
        bHM bHM2 = new bHM(bl, string, bHz.dWn().dWo());
        aAW.bUq().h(new dbZ(bHM2));
    }

    public static void toggleOnlyCanAfford(fLV fLV2) {
        bHN bHN2 = new bHN(fLV2.bqr(), "market.filter.i.can.buy", bHz.dWn().dWo());
        aAW.bUq().h(new dbZ(bHN2));
    }

    public static void toggleOnlyCanFulfill(fLV fLV2) {
        bHN bHN2 = new bHN(fLV2.bqr(), "market.filter.i.can.fulfill", bHz.dWn().dWo());
        aAW.bUq().h(new dbZ(bHN2));
    }

    public static void resetPriceSearch(fIq fIq2, fDu fDu2, fDu fDu3) {
        fDu2.guN();
        fDu3.guN();
        bHz.dWn().dWo().dVf();
        aAW.bUq().h(new dbX(bHH.kcu));
    }

    public static void updatePriceSearch(fIq fIq2, fDu fDu2, fDu fDu3) {
        long l = cFp.pC(fDu2.getText());
        long l2 = cFp.pC(fDu3.getText());
        bHO bHO2 = new bHO(l, l2, bHz.dWn().dWo());
        cFp.a(fDu2, fDu3, bHO2, l, l2);
        mVX.a(bHH.kcu, () -> aAW.bUq().h(new dbZ(bHO2)));
    }

    public static void resetQuantitySearch(fIq fIq2, fDu fDu2, fDu fDu3) {
        fDu2.guN();
        fDu3.guN();
        bHz.dWn().dWo().dVg();
        aAW.bUq().h(new dbX(bHH.kcw));
    }

    public static void updateQuantitySearch(fIq fIq2, fDu fDu2, fDu fDu3) {
        long l = cFp.pC(fDu2.getText());
        long l2 = cFp.pC(fDu3.getText());
        bHP bHP2 = new bHP(l, l2, bHz.dWn().dWo());
        cFp.a(fDu2, fDu3, bHP2, l, l2);
        mVX.a(bHH.kcw, () -> aAW.bUq().h(new dbZ(bHP2)));
    }

    public static void resetPackSizeSearch(fIq fIq2) {
        aAW.bUq().h(new dbX(bHH.kcv));
    }

    public static void resetSlotAndSublimationSearch(fIq fIq2) {
        aAW.bUq().h(new dbX(bHH.kcx, bHH.kcy));
    }

    public static void toggleSlotsFixedOrder(fIq fIq2, fDD fDD2) {
        boolean bl = cFp.a(fIq2, fDD2);
        cFp.jM(bl);
    }

    public static void changeSlotColor(fLK fLK2, bIi bIi2, fDD fDD2) {
        if (!fLK2.bqr() || !(fLK2.getValue() instanceof bIh)) {
            return;
        }
        bIi2.b((bIh)fLK2.getValue());
        cFp.jM(fDD2.getSelected());
    }

    private static void jM(boolean bl) {
        dae dae2 = new dae(17270);
        dae2.cC(bl);
        aAW.bUq().h(dae2);
    }

    public static void resetSlotSearch(fIq fIq2) {
        aAW.bUq().h(new dae(16049));
    }

    public static void onHoverSublimation(fLG fLG2, fRX fRX2, fEs fEs2) {
        if (!(fLG2.getItemValue() instanceof bIj)) {
            return;
        }
        int n = ((bIj)fLG2.getItemValue()).AK();
        cFg.displaySublimationPopup(n, fRX2, fEs2);
    }

    public static void selectBasicSublimation(fLK fLK2, fDv fDv2) {
        cFp.a(fLK2, false, fDv2);
    }

    public static void selectSpecialSublimation(fLK fLK2, fDv fDv2) {
        cFp.a(fLK2, true, fDv2);
    }

    private static void a(fLK fLK2, boolean bl, fDv fDv2) {
        if (!fLK2.bqr() || !(fLK2.getValue() instanceof bIj)) {
            return;
        }
        bIj bIj2 = (bIj)fLK2.getValue();
        cFp.a(bIj2, bl, fDv2);
    }

    private static void a(bIj bIj2, boolean bl, fDv fDv2) {
        bHT bHT2 = new bHT(bIj2, bl, bHz.dWn().dWo());
        fDv2.setText(bIj2.getName());
        aAW.bUq().h(new dbZ(bHT2));
    }

    public static void updateSublimationSearch(fIq fIq2, fDv fDv2) {
        bIj bIj2;
        String string = fDv2.getText();
        if (string == null || string.isBlank()) {
            cFp.clearBasicSublimationSearch(null);
        }
        if ((bIj2 = bHz.dWn().dWo().C(string, false)) != null) {
            cFp.a(bIj2, false, fDv2);
        } else {
            cFp.clearBasicSublimationSearch(null);
        }
        bHz.dWn().dWo().dVa().mL(string);
    }

    public static void clearBasicSublimationSearch(@Nullable fLq fLq2) {
        Object t = bHz.dWn().dWo().a(bHH.kcy, 0);
        if (t != null) {
            aAW.bUq().h(new dbW((bHI)t));
        }
        bHz.dWn().dWo().dVa().mL(null);
    }

    public static void updateSpecialSublimationSearch(fIq fIq2, fDv fDv2) {
        String string = fDv2.getText();
        if (string == null || string.isBlank()) {
            cFp.clearSpecialSublimationSearch(null);
            return;
        }
        bIj bIj2 = bHz.dWn().dWo().C(string, true);
        if (bIj2 != null) {
            cFp.a(bIj2, true, fDv2);
        } else {
            cFp.clearSpecialSublimationSearch(null);
        }
        bHz.dWn().dWo().dVa().mM(string);
    }

    public static void clearSpecialSublimationSearch(@Nullable fLq fLq2) {
        Object t = bHz.dWn().dWo().a(bHH.kcy, 1);
        if (t != null) {
            aAW.bUq().h(new dbW((bHI)t));
        }
        bHz.dWn().dWo().dVa().mM(null);
    }

    public static void toggleRandomElements(fLV fLV2) {
        dae dae2 = new dae(19352);
        dae2.cC(fLV2.bqr());
        aAW.bUq().h(dae2);
    }

    public static void resetCharacteristicsSearch(fIq fIq2) {
        aAW.bUq().h(new dbX(bHH.kcz));
    }

    public static void updateCharacteristicsSearch(fIq fIq2, bHC bHC2, fDu fDu2) {
        boolean bl = cFp.pB(fDu2.getText());
        Integer n = bl ? Integer.valueOf((int)cFp.pC(fDu2.getText())) : null;
        bHC2.ai(n);
        bHG bHG2 = new bHG(bHC2.dWK(), n, () -> {
            bHC2.ai(null);
            fSe.gFu().a((aEF)bHC2, "minValue");
        });
        mVX.a(bHH.kcz, ((bHI)bHG2).dWT(), () -> aAW.bUq().h(new dbZ(bHG2)));
    }

    public static void marketHistoryPreviousPage(fIq fIq2) {
        aAW.bUq().h(new dae(18797));
    }

    public static void marketHistoryNextPage(fIq fIq2) {
        aAW.bUq().h(new dae(19314));
    }

    public static void scrollMarketHistorySearch(fLP fLP2) {
        if (fLP2.gEo() > 0) {
            cFp.marketHistoryNextPage(fLP2);
        } else {
            cFp.marketHistoryPreviousPage(fLP2);
        }
    }

    public static void searchHistoryFromClickOnItemList(fLK fLK2, fDv fDv2) {
        if (!fLK2.bqr() || !(fLK2.getValue() instanceof fhC)) {
            return;
        }
        fhC fhC2 = (fhC)fLK2.getValue();
        fDv2.setText(fhC2.getName());
        cFp.a(fhC2.getName(), fDv2);
    }

    public static void updateHistoryNameSearch(fIq fIq2, fDv fDv2) {
        mVX.a(bHH.kcp, () -> cFp.a(fDv2.getText(), fDv2));
    }

    private static void a(String string, fDv fDv2) {
        fiQ fiQ2;
        String string2;
        String string3 = BH.aT(string);
        if (string3.equals(string2 = (fiQ2 = cWl.eVl().eVK()).getName())) {
            return;
        }
        bDC.dRc().dRe();
        fiQ2.sM(string3.isBlank() ? null : string3).D(aUM.cWf().aUXX());
        aAW.bUq().h(new dae(18170));
    }

    public static void updateHistoryPriceSearch(fIq fIq2, fDu fDu2, fDu fDu3) {
        long l = cFp.pC(fDu2.getText());
        long l2 = cFp.pC(fDu3.getText());
        bHO bHO2 = new bHO(l, l2);
        cFp.a(fDu2, fDu3, bHO2, l, l2);
        mVX.a(bHH.kcu, () -> {
            fiQ fiQ2 = cWl.eVl().eVK();
            long l3 = fiQ2.gah();
            long l4 = fiQ2.gai();
            if (l == l3 && l2 == l4) {
                return;
            }
            fiQ2.tI(l).tJ(l2);
            aAW.bUq().h(new dae(18170));
        });
    }

    public static void selectHistoryElementType(fLK fLK2) {
        fiQ fiQ2;
        if (!(fLK2.getValue() instanceof bHV)) {
            mVU.error((Object)("[MARKET] Not a history element type: " + String.valueOf(fLK2.getValue())));
            return;
        }
        @Nullable fjb fjb2 = ((bHV)fLK2.getValue()).dXd();
        if (fjb2 == (fiQ2 = cWl.eVl().eVK()).dXd()) {
            return;
        }
        fiQ2.a(fjb2);
        fSe.gFu().a((aEF)bHz.dWn(), "selectedTimespan");
        aAW.bUq().h(new dae(18170));
    }

    public static void selectHistoryTimespan(fLK fLK2) {
        fiQ fiQ2;
        if (!(fLK2.getValue() instanceof bIk)) {
            mVU.error((Object)("[MARKET] Not a timespan: " + String.valueOf(fLK2.getValue())));
            return;
        }
        fjh fjh2 = ((bIk)fLK2.getValue()).dXD();
        if (fjh2 == (fiQ2 = cWl.eVl().eVK()).dXD()) {
            return;
        }
        fiQ2.a(fjh2);
        fSe.gFu().a((aEF)bHz.dWn(), "selectedTimespan");
        aAW.bUq().h(new dae(18170));
    }

    public static void openOfferItemChoiceDialog(fIq fIq2) {
        aAW.bUq().h(new dae(16253));
    }

    public static void updateOfferItemChoiceSearch(fIq fIq2, fDv fDv2) {
        dae dae2 = new dae(19592);
        dae2.fa(fDv2.getText());
        aAW.bUq().h(dae2);
    }

    public static void selectOfferItem(fLK fLK2) {
        if (!fLK2.bqr() || !(fLK2.getValue() instanceof bGV)) {
            return;
        }
        cFp.a(true, (bGV)fLK2.getValue());
    }

    public static void dropItemToCreateOffer(fLA fLA2) {
        if (!(fLA2.getValue() instanceof ffV)) {
            return;
        }
        cFe.onDropItem();
        cFp.a(true, (bGV)((ffV)fLA2.getValue()).dOg());
    }

    public static void showOfferItemPopup(fIq fIq2, fRX fRX2, fEs fEs2) {
        bGV bGV2 = bHz.dWn().dWJ().duo();
        if (bGV2 == null) {
            return;
        }
        cGN.showPopup(null, ffV.k(bGV2), fRX2, fEs2);
    }

    public static void disableCreateOfferMode(fIq fIq2) {
        cFp.a(false, null);
    }

    private static void a(boolean bl, bGV bGV2) {
        dae dae2 = new dae(19182);
        dae2.cC(bl);
        dae2.D(bGV2);
        aAW.bUq().h(dae2);
    }

    public static void sendCreateOfferMessage() {
        aAW.bUq().h(new dae(16917));
    }

    public static void refreshCreateOfferData(fLE fLE2) {
        if (!fLE2.gDO()) {
            bHz.dWn().dWJ().dUP();
        }
    }

    public static void offerUnitPriceChanged(fLI fLI2, fDu fDu2) {
        if (fLI2.bCC() == 10) {
            cFp.sendCreateOfferMessage();
            return;
        }
        long l = cFp.h(fDu2.getText(), 0L);
        if (l != bHz.dWn().dWJ().akd()) {
            bHz.dWn().dWJ().k(l, l > 999999999999L);
        }
    }

    public static void offerQuantityChanged(fLI fLI2, fDu fDu2) {
        if (fLI2.bCC() == 10) {
            cFp.sendCreateOfferMessage();
            return;
        }
        cFp.G(fDu2.getText(), false);
    }

    public static void setOfferQuantityTo(fIq fIq2, String string) {
        cFp.G(string, true);
    }

    private static void G(String string, boolean bl) {
        int n = (int)cFp.h(string, 0L);
        if (n != bHz.dWn().dWJ().oP()) {
            bHz.dWn().dWJ().z(n, bl || n > 999999);
        }
    }

    public static void offerSellDurationChanged(fLK fLK2) {
        if (!(fLK2.getValue() instanceof bIg)) {
            mVU.error((Object)("[MARKET] Not a sell duration: " + String.valueOf(fLK2.getValue())));
            return;
        }
        bIg bIg2 = (bIg)fLK2.getValue();
        if (bIg2 != bHz.dWn().dWJ().dUX()) {
            bHz.dWn().dWJ().a(bIg2);
        }
    }

    public static void offerItemLevelChanged(fLI fLI2, fDu fDu2) {
        if (fLI2.bCC() == 10) {
            cFp.sendCreateOfferMessage();
            return;
        }
        short s = (short)cFp.pC(fDu2.getText());
        if (s != bHz.dWn().dWJ().dUY()) {
            bHz.dWn().dWJ().bY(s);
        }
    }

    public static void toggleOfferSlotsFixedOrder(fIq fIq2, fDD fDD2) {
        boolean bl = cFp.a(fIq2, fDD2);
        bHz.dWn().dWJ().hI(bl);
        cFp.n(bl, bl);
    }

    public static void changeOfferSlotColor(fLK fLK2, bIi bIi2, fDD fDD2) {
        if (!fLK2.bqr() || !(fLK2.getValue() instanceof bIh)) {
            return;
        }
        bIh bIh2 = (bIh)fLK2.getValue();
        boolean bl = bIh2.dXy() != bIi2.dXA().dXy();
        bIi2.b(bIh2);
        cFp.n(fDD2.getSelected(), bl);
    }

    private static void n(boolean bl, boolean bl2) {
        dae dae2 = new dae(18452);
        dae2.cC(bl);
        dae2.sY(bl2 ? 1 : 0);
        aAW.bUq().h(dae2);
    }

    public static void resetOfferSlots(fIq fIq2) {
        aAW.bUq().h(new dae(17480));
    }

    public static void selectOfferBasicSublimation(fLK fLK2) {
        if (!fLK2.bqr() || !(fLK2.getValue() instanceof bIj)) {
            return;
        }
        bIj bIj2 = (bIj)fLK2.getValue();
        cFp.c(bIj2);
    }

    private static void c(@Nullable bIj bIj2) {
        if (bIj2 != bHz.dWn().dWJ().dVa().dVW()) {
            bHz.dWn().dWJ().a(bIj2);
        }
    }

    public static void updateOfferBasicSublimation(fIq fIq2, fDv fDv2) {
        String string = fDv2.getText();
        bHz.dWn().dWJ().dVa().mL(string);
        if (string == null || string.isBlank()) {
            cFp.clearOfferBasicSublimation(null);
        }
        bIj bIj2 = bHz.dWn().dWJ().C(string, false);
        cFp.c(bIj2);
    }

    public static void selectOfferSpecialSublimation(fLK fLK2) {
        if (!fLK2.bqr() || !(fLK2.getValue() instanceof bIj)) {
            return;
        }
        bIj bIj2 = (bIj)fLK2.getValue();
        cFp.d(bIj2);
    }

    private static void d(@Nullable bIj bIj2) {
        if (bIj2 != bHz.dWn().dWJ().dVa().dVX()) {
            bHz.dWn().dWJ().b(bIj2);
        }
    }

    public static void updateOfferSpecialSublimation(fIq fIq2, fDv fDv2) {
        String string = fDv2.getText();
        bHz.dWn().dWJ().dVa().mM(string);
        if (string == null || string.isBlank()) {
            cFp.clearOfferSpecialSublimation(null);
        }
        bIj bIj2 = bHz.dWn().dWJ().C(string, false);
        cFp.d(bIj2);
    }

    public static void clearOfferBasicSublimation(@Nullable fIq fIq2) {
        bHz.dWn().dWJ().dVa().mL(null);
        bHz.dWn().dWJ().a((bIj)null);
    }

    public static void clearOfferSpecialSublimation(@Nullable fIq fIq2) {
        bHz.dWn().dWJ().dVa().mM(null);
        bHz.dWn().dWJ().b(null);
    }

    public static void createOffer(fIq fIq2) {
        cFp.sendCreateOfferMessage();
    }

    public static void fulfillOffer(fIq fIq2, fEy fEy2, bHZ bHZ2) {
        dae dae2 = new dae(16803);
        dae2.D(bHZ2);
        aAW.bUq().h(dae2);
    }

    public static void cancelFulfillment(fIq fIq2) {
        cFp.closeOfferFulfillWindow();
    }

    public static void closeOfferFulfillWindow() {
        fSe.gFu().f("marketOfferFulfillment", (Object)null);
        fyw.gqw().J("marketFulfillOfferDialog", false);
    }

    public static void dropItemToFulfillOffer(fLA fLA2) {
        if (!(fLA2.getValue() instanceof ffV)) {
            return;
        }
        cFe.onDropItem();
        cFp.bx((ffV)fLA2.getValue());
    }

    private static void bx(ffV ffV2) {
        if (!fIU.uCW.fd("marketFulfillOfferLock")) {
            return;
        }
        dae dae2 = new dae(19753);
        dae2.D(ffV2);
        aAW.bUq().h(dae2);
    }

    public static void removeItemFulfillingOffer(fIq fIq2, bHp bHp2) {
        dae dae2 = new dae(17858);
        dae2.D(bHp2.getItem());
        aAW.bUq().h(dae2);
    }

    public static void autoFulfillOffer(fIq fIq2) {
        aAW.bUq().h(new dae(19706));
    }

    public static void updateOfferFulfillmentItemQuantity(fLI fLI2, fDu fDu2, bHo bHo2, bHp bHp2) {
        if (fLI2.bCC() == 10) {
            cFp.confirmOfferFulfillment(null);
            return;
        }
        int n = (int)cFp.h(fDu2.getText(), 0L);
        if (n != bHp2.oP()) {
            bHo2.a(bHp2, n);
        }
    }

    public static void setOfferFulfillmentItemQuantityToMax(fIq fIq2, bHo bHo2, bHp bHp2) {
        bHo2.a(bHp2, bHp2.dVs());
    }

    public static void confirmOfferFulfillment(fIq fIq2) {
        aAW.bUq().h(new dae(17565));
    }

    public static void updateCurrentOffersNameSearch(fIq fIq2, fDv fDv2) {
        dae dae2 = new dae(16643);
        dae2.fa(fDv2.getText());
        aAW.bUq().h(dae2);
    }

    public static void searchCurrentOffersFromClickOnItemList(fLK fLK2, fDv fDv2) {
        if (!fLK2.bqr() || !(fLK2.getValue() instanceof fhC)) {
            return;
        }
        fhC fhC2 = (fhC)fLK2.getValue();
        fDv2.setText(fhC2.getName());
        cFp.updateOnSaleEntriesNameSearch(null, fDv2);
    }

    public static void currentOffersPreviousPage(fIq fIq2) {
        aAW.bUq().h(new dae(16441));
    }

    public static void currentOffersNextPage(fIq fIq2) {
        aAW.bUq().h(new dae(18727));
    }

    public static void scrollOnCurrentOffers(fLP fLP2) {
        if (fLP2.gEo() > 0) {
            cFp.currentOffersNextPage(fLP2);
        } else {
            cFp.currentOffersPreviousPage(fLP2);
        }
    }

    public static void cancelCurrentOffer(fIq fIq2, bHZ bHZ2) {
        dae dae2 = new dae(17150);
        dae2.D(bHZ2);
        aAW.bUq().h(dae2);
    }

    public static void toggleExpiredOffersDetailWindow(fIq fIq2) {
        aAW.bUq().h(new dae(18675));
    }

    public static void expiredOffersPreviousPage(fIq fIq2) {
        aAW.bUq().h(new dae(18871));
    }

    public static void expiredOffersNextPage(fIq fIq2) {
        aAW.bUq().h(new dae(16026));
    }

    public static void scrollExpiredOffersSearch(fLP fLP2) {
        if (fLP2.gEo() > 0) {
            cFp.expiredOffersNextPage(fLP2);
        } else {
            cFp.expiredOffersPreviousPage(fLP2);
        }
    }

    public static void retrieveAllExpiredOffersKamas(fIq fIq2) {
        aAW.bUq().h(new dae(19850));
    }

    public static void togglePurchasedItemsDetailWindow(fIq fIq2) {
        aAW.bUq().h(new dae(16486));
    }

    public static void purchasedItemsPreviousPage(fIq fIq2) {
        aAW.bUq().h(new dae(19721));
    }

    public static void purchasedItemsNextPage(fIq fIq2) {
        aAW.bUq().h(new dae(18870));
    }

    public static void scrollPurchasedItemsSearch(fLP fLP2) {
        if (fLP2.gEo() > 0) {
            cFp.purchasedItemsNextPage(fLP2);
        } else {
            cFp.purchasedItemsPreviousPage(fLP2);
        }
    }

    public static void retrieveOnePurchasedItem(fIq fIq2, bIa bIa2) {
        dae dae2 = new dae(18794);
        dae2.D(bIa2);
        aAW.bUq().h(dae2);
    }

    public static void retrieveAllOfferPurchasedItems(fIq fIq2) {
        aAW.bUq().h(new dae(16517));
    }

    public static void openOptionsTab(fIq fIq2) {
        dae dae2 = new dae(19720);
        dae2.ay((byte)99);
        aAW.bUq().h(dae2);
    }

    private static void a(bSN bSN2, fLV fLV2) {
        boolean bl = fLV2.bqr();
        ((bSG)aIe.cfn().bmH()).a((afe)bSN2, bl);
    }

    private static void a(bSN bSN2, fLK fLK2) {
        if (!fLK2.bqr()) {
            return;
        }
        Object object = fLK2.getValue();
        if (!(object instanceof bIc)) {
            return;
        }
        ((bSG)aIe.cfn().bmH()).a((afe)bSN2, ((bIc)object).d());
    }

    public static void changeOpenInventory(fLV fLV2) {
        cFp.a(bSN.lkJ, fLV2);
    }

    public static void changeKeepLastSearch(fLV fLV2) {
        cFp.a(bSN.lkK, fLV2);
    }

    public static void changeIncludeOtherRarities(fLV fLV2) {
        cFp.a(bSN.lkL, fLV2);
        dae dae2 = new dae(16037);
        dae2.D((Object)bHH.kcp);
        aAW.bUq().h(dae2);
    }

    public static void changeSellItemPriceFieldKeepMode(fLK fLK2) {
        cFp.a(bSN.lkM, fLK2);
    }

    public static void changeSellItemQuantityFieldKeepMode(fLK fLK2) {
        cFp.a(bSN.lkN, fLK2);
    }

    public static void changeSellItemKeepSellDuration(fLV fLV2) {
        cFp.a(bSN.lkO, fLV2);
    }

    public static void changeCreateOfferPriceFieldKeepMode(fLK fLK2) {
        cFp.a(bSN.lkP, fLK2);
    }

    public static void changeCreateOfferQuantityFieldKeepMode(fLK fLK2) {
        cFp.a(bSN.lkQ, fLK2);
    }

    public static void changeCreateOfferKeepSellDuration(fLV fLV2) {
        cFp.a(bSN.lkR, fLV2);
    }

    public static void changeCreateOfferKeepSlotsAndSublimations(fLV fLV2) {
        cFp.a(bSN.lkS, fLV2);
    }

    public static void changeCreateOfferKeepItemLevel(fLV fLV2) {
        cFp.a(bSN.lkT, fLV2);
    }
}
