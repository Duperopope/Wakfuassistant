/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

public class bHz
implements aEH {
    private final bHl kaS = new bHl("entries");
    private final bHl kaT = new bHl("offers");
    private final bIf kaU = new bIf(9);
    private final bIf kaV = new bIf(9);
    private final bIf kaW = new bIf(8);
    private final bIf kaX = new bIf(10);
    private final bIf kaY = new bIf(10);
    private final bIf kaZ = new bIf(8);
    private final bIf kba = new bIf(10);
    private final bIf kbb = new bIf(10);
    private final bIf kbc = new bIf(11);
    private final bHw kbd = new bHw();
    private bHY kbe = null;
    private final bHu kbf = new bHu();
    private final bHq kbg = new bHq();
    private final bHs kbh = new bHs();
    private final bHi kbi = new bHi();
    private final List<bIe> kbj = new ArrayList<bIe>();
    private String kbk = "";
    public static final String kbl = "marketSearch";
    public static final String kbm = "marketOfferSearch";
    public static final String kbn = "onSaleEntriesSearch";
    public static final String kbo = "expiredEntriesSearch";
    public static final String kbp = "soldItemsSearch";
    public static final String kbq = "currentOffersSearch";
    public static final String kbr = "expiredOffersSearch";
    public static final String kbs = "purchasedItemsSearch";
    public static final String kbt = "marketHistorySearch";
    public static final String kbu = "mainSearchSelectedObject";
    public static final String kbv = "canSellItem";
    public static final String kbw = "sellItemBtnText";
    public static final String kbx = "canCreateOffer";
    public static final String kby = "createOfferBtnText";
    public static final String kbz = "sellDurationList";
    public static final String kbA = "sellData";
    public static final String kbB = "itemToSell";
    public static final String kbC = "inventoryTypes";
    public static final String kbD = "allHistoryElementTypes";
    public static final String kbE = "selectedHistoryElementType";
    public static final String kbF = "allTimespans";
    public static final String kbG = "selectedTimespan";
    public static final String kbH = "createOfferData";
    public static final String[] kbI = new String[]{"marketSearch", "onSaleEntriesSearch", "expiredEntriesSearch", "expiredEntriesCount", "expiredEntriesCountText", "claimExpiredEntriesText", "kamasCount", "soldItemsCount", "soldItemsCountText", "claimKamasText", "itemToSell", "sellDurationList", "sellData", "inventoryTypes", "soldItemsSearch", "sellItemBtnText", "canSellItem", "mainSearchSelectedObject", "marketHistorySearch", "allHistoryElementTypes", "selectedHistoryElementType", "allTimespans", "selectedTimespan", "createOfferData", "canCreateOffer", "createOfferBtnText", "currentOffersSearch", "expiredOffersSearch", "purchasedItemsSearch"};
    public static final @Unmodifiable List<bIg> kbJ = Arrays.stream(fjg.values()).sorted(Comparator.comparing(fjg::Tz)).map(bIg::new).toList();
    public static final bIg kbK = kbJ.get(fjg.sxj.aJr());
    private static final List<bHV> kbL = new ArrayList<bHV>();
    public static final bHV kbM = new bHV(null);
    private static final @Unmodifiable List<bIk> kbN;
    public static final bIk kbO;
    private static final bHz kbP;

    public static bHz dWn() {
        return kbP;
    }

    private bHz() {
    }

    @Override
    public String[] bxk() {
        return kbI;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "marketSearch": {
                return this.kaU;
            }
            case "marketOfferSearch": {
                return this.kaV;
            }
            case "onSaleEntriesSearch": {
                return this.kaW;
            }
            case "soldItemsSearch": {
                return this.kaX;
            }
            case "expiredEntriesSearch": {
                return this.kaY;
            }
            case "currentOffersSearch": {
                return this.kaZ;
            }
            case "expiredOffersSearch": {
                return this.kba;
            }
            case "purchasedItemsSearch": {
                return this.kbb;
            }
            case "marketHistorySearch": {
                return this.kbc;
            }
            case "mainSearchSelectedObject": {
                return this.kbe;
            }
            case "soldItemsCount": 
            case "kamasCount": 
            case "soldItemsCountText": 
            case "claimKamasText": 
            case "expiredEntriesCount": 
            case "expiredEntriesCountText": 
            case "claimExpiredEntriesText": {
                return this.kbf.eu(string);
            }
            case "purchasedItemsCount": 
            case "purchasedItemsCountText": 
            case "retrievePurchasedItemsText": 
            case "expiredOffersCount": 
            case "expiredOffersCountText": 
            case "claimExpiredOffersText": {
                return this.kbg.eu(string);
            }
            case "canSellItem": {
                return this.dWq();
            }
            case "sellItemBtnText": {
                return aUM.cWf().c("market.offers.create.offer", this.kbf.dVG(), 400);
            }
            case "canCreateOffer": {
                return this.dWs();
            }
            case "createOfferBtnText": {
                return aUM.cWf().c("market.offers.create.purchase.offer", this.kbg.dVw(), 400);
            }
            case "sellData": {
                return this.kbh;
            }
            case "itemToSell": {
                return this.kbh.getItem();
            }
            case "sellDurationList": {
                return kbJ;
            }
            case "inventoryTypes": {
                return this.kbj;
            }
            case "allHistoryElementTypes": {
                return kbL;
            }
            case "selectedHistoryElementType": {
                fjb fjb2 = cWl.eVl().eVK().dXd();
                return fjb2 == null ? kbM : kbN.get(fjb2.aJr());
            }
            case "allTimespans": {
                return kbN;
            }
            case "selectedTimespan": {
                fjh fjh2 = cWl.eVl().eVK().dXD();
                return fjh2 == null ? kbO : kbN.get(fjh2.aJr());
            }
            case "createOfferData": {
                return this.kbi;
            }
        }
        return null;
    }

    @NotNull
    public bHl dWo() {
        if (cWl.eVE()) {
            return this.kaS;
        }
        if (cWl.eVF()) {
            return this.kaT;
        }
        throw new IllegalArgumentException("Invalid sub tab: " + fSe.gFu().dq("marketViewSearchSubTab"));
    }

    @NotNull
    public bIf dWp() {
        if (cWl.eVE()) {
            return this.kaU;
        }
        if (cWl.eVF()) {
            return this.kaV;
        }
        throw new IllegalArgumentException("Invalid sub tab: " + fSe.gFu().dq("marketViewSearchSubTab"));
    }

    public void a(bHY bHY2) {
        this.kbe = bHY2;
        fSe.gFu().a((aEF)this, kbu);
    }

    public void bh(ffV ffV2) {
        this.kbh.setItem(ffV2);
        fSe.gFu().a((aEF)this, kbB);
        if (ffV2 != null) {
            fSe.gFu().a((aEF)this, kbA);
        }
    }

    public void e(mg mg2) {
        this.kaU.a(mg2.akE(), mg2.Ve().stream().map(mc2 -> new bHU((mc)mc2, mg2.akH())).toList());
        fSe.gFu().a((aEF)this, kbl);
    }

    public void e(mI mI2) {
        this.kaV.a(mI2.akE(), mI2.anv().stream().map(mE2 -> new bHZ((mE)mE2, mI2.akH())).toList());
        fSe.gFu().a((aEF)this, kbm);
    }

    public void f(mg mg2) {
        this.kaW.a(mg2.akE(), mg2.Ve().stream().map(mc2 -> new bHU((mc)mc2, mg2.akH())).toList());
        this.kbf.GP(this.kaW.ala());
        fSe.gFu().a((aEF)this, kbn, kbv, kbw);
    }

    public void d(na na2) {
        this.kaX.a(na2.akE(), na2.Ve().stream().map(bIb::new).toList());
        fSe.gFu().a((aEF)this, kbp);
    }

    public void g(mg mg2) {
        this.kaY.a(mg2.akE(), mg2.Ve().stream().map(mc2 -> new bHU((mc)mc2, mg2.akH())).toList());
        fSe.gFu().a((aEF)this, kbo);
    }

    public void f(mI mI2) {
        this.kaZ.a(mI2.akE(), mI2.anv().stream().map(mE2 -> new bHZ((mE)mE2, mI2.akH())).toList());
        this.kbg.GM(this.kaZ.ala());
        fSe.gFu().a((aEF)this, kbq, kbv, kby);
    }

    public void g(mI mI2) {
        this.kba.a(mI2.akE(), mI2.anv().stream().map(mE2 -> new bHZ((mE)mE2, mI2.akH())).toList());
        fSe.gFu().a((aEF)this, kbr);
    }

    public void d(mR mR2) {
        this.kbb.a(mR2.akE(), mR2.aon().stream().map(bIa::new).toList());
        fSe.gFu().a((aEF)this, kbs);
    }

    public void d(mz mz2) {
        this.kbc.a(mz2.akE(), mz2.amf().stream().map(mt2 -> new bHW((mt)mt2, mz2.akH())).toList());
        fSe.gFu().a((aEF)this, kbt);
    }

    public boolean dWq() {
        return this.kbf.dVG() < 400 && this.dWr() < 800;
    }

    public boolean dVD() {
        return this.kbh.dVD() && fIU.uCW.fd("marketSellViewLock");
    }

    private int dWr() {
        return this.kaW.ala() + this.kbf.dVF() + this.kbf.dVH() + this.kaZ.ala() + this.kbg.aop() + this.kbg.dVx();
    }

    public boolean dWs() {
        return this.kbg.dVw() < 400 && this.dWr() < 800;
    }

    public boolean dUR() {
        return this.kbi.dUR() && fIU.uCW.fd("marketSellViewLock");
    }

    public void hO(boolean bl) {
        this.kaU.reset();
        this.kaV.reset();
        this.kaW.reset();
        this.kaX.reset();
        this.kaY.reset();
        this.kaZ.reset();
        this.kba.reset();
        this.kbb.reset();
        this.kbc.reset();
        this.kbd.reset();
        this.kaS.hM(bl);
        this.kaT.hM(bl);
        this.dVk();
    }

    private void dVk() {
        this.kbj.clear();
        for (fhY fhY2 : bEw.dSk().fZi()) {
            if (!fhY2.cpZ()) continue;
            this.kbj.add(new bIe(fhY2));
        }
        this.kbj.add(new bIe(null));
        this.kbj.sort(bIe.kej);
    }

    public void dWt() {
        HashMap hashMap = new HashMap();
        this.kbj.forEach(bIe2 -> {
            hashMap.put(bIe2.dGh(), bIe2);
            bIe2.dXp();
        });
        fcI.a(aUE.cVJ().cVK().Xi(), (exP2, ffV2) -> {
            if (cWl.c(ffV2, exP2)) {
                return true;
            }
            fhY fhY2 = ffV2.dOg().dGh();
            while (fhY2.fZm() != null) {
                fhY2 = fhY2.fZm();
            }
            bIe bIe2 = (bIe)hashMap.get(fhY2);
            if (bIe2 != null) {
                bIe2.bf((ffV)ffV2);
            } else {
                ((bIe)hashMap.get(null)).bf((ffV)ffV2);
            }
            return true;
        });
        this.kbj.forEach(bIe2 -> bIe2.mF(this.kbk));
        fSe.gFu().a((aEF)this, kbC);
    }

    public Optional<bIm> bi(@NotNull ffV ffV2) {
        for (bIe bIe2 : this.kbj) {
            Optional<bIm> optional = bIe2.bi(ffV2);
            if (!optional.isPresent()) continue;
            return optional;
        }
        return Optional.empty();
    }

    public void mO(String string) {
        String string2 = BH.aT(string);
        if (string2.equals(this.kbk)) {
            return;
        }
        this.kbk = string2;
        this.kbj.forEach(bIe2 -> bIe2.mF(this.kbk));
        fSe.gFu().a((aEF)this, kbC);
    }

    public void a(bIn bIn2) {
        this.kbj.forEach(bIe2 -> bIe2.b(bIn2));
        fSe.gFu().a((aEF)this, kbC);
    }

    @Generated
    public bHl dWu() {
        return this.kaS;
    }

    @Generated
    public bHl dWv() {
        return this.kaT;
    }

    @Generated
    public bIf dWw() {
        return this.kaU;
    }

    @Generated
    public bIf dWx() {
        return this.kaV;
    }

    @Generated
    public bIf dWy() {
        return this.kaW;
    }

    @Generated
    public bIf dWz() {
        return this.kaX;
    }

    @Generated
    public bIf dWA() {
        return this.kaY;
    }

    @Generated
    public bIf dWB() {
        return this.kaZ;
    }

    @Generated
    public bIf dWC() {
        return this.kba;
    }

    @Generated
    public bIf dWD() {
        return this.kbb;
    }

    @Generated
    public bIf dWE() {
        return this.kbc;
    }

    @Generated
    public bHw dWF() {
        return this.kbd;
    }

    @Generated
    public bHu dWG() {
        return this.kbf;
    }

    @Generated
    public bHq dWH() {
        return this.kbg;
    }

    @Generated
    public bHs dWI() {
        return this.kbh;
    }

    @Generated
    public bHi dWJ() {
        return this.kbi;
    }

    static {
        kbL.add(kbM);
        for (fjb fjb2 : fjb.values()) {
            kbL.add(new bHV(fjb2));
        }
        kbN = Arrays.stream(fjh.values()).sorted(Comparator.comparing(fjh::gaO)).map(bIk::new).toList();
        kbO = kbN.get(fjh.sxx.aJr());
        kbP = new bHz();
    }
}
