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

/*
 * Renamed from bHz
 */
public class bhz_2
implements aeh_2 {
    private final bhl_1 kaS = new bhl_1("entries");
    private final bhl_1 kaT = new bhl_1("offers");
    private final bif_1 kaU = new bif_1(9);
    private final bif_1 kaV = new bif_1(9);
    private final bif_1 kaW = new bif_1(8);
    private final bif_1 kaX = new bif_1(10);
    private final bif_1 kaY = new bif_1(10);
    private final bif_1 kaZ = new bif_1(8);
    private final bif_1 kba = new bif_1(10);
    private final bif_1 kbb = new bif_1(10);
    private final bif_1 kbc = new bif_1(11);
    private final bhw_1 kbd = new bhw_1();
    private bhy_2 kbe = null;
    private final bhu_2 kbf = new bhu_2();
    private final bhq_1 kbg = new bhq_1();
    private final bhs_1 kbh = new bhs_1();
    private final bhi_2 kbi = new bhi_2();
    private final List<bie_1> kbj = new ArrayList<bie_1>();
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
    public static final @Unmodifiable List<big_1> kbJ = Arrays.stream(fjg.values()).sorted(Comparator.comparing(fjg::Tz)).map(big_1::new).toList();
    public static final big_1 kbK = kbJ.get(fjg.sxj.aJr());
    private static final List<bhv_2> kbL = new ArrayList<bhv_2>();
    public static final bhv_2 kbM = new bhv_2(null);
    private static final @Unmodifiable List<bik_1> kbN;
    public static final bik_1 kbO;
    private static final bhz_2 kbP;

    public static bhz_2 dWn() {
        return kbP;
    }

    private bhz_2() {
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
                return aum_0.cWf().c("market.offers.create.offer", this.kbf.dVG(), 400);
            }
            case "canCreateOffer": {
                return this.dWs();
            }
            case "createOfferBtnText": {
                return aum_0.cWf().c("market.offers.create.purchase.offer", this.kbg.dVw(), 400);
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
                fjb fjb2 = cwl_1.eVl().eVK().dXd();
                return fjb2 == null ? kbM : kbN.get(fjb2.aJr());
            }
            case "allTimespans": {
                return kbN;
            }
            case "selectedTimespan": {
                fjh fjh2 = cwl_1.eVl().eVK().dXD();
                return fjh2 == null ? kbO : kbN.get(fjh2.aJr());
            }
            case "createOfferData": {
                return this.kbi;
            }
        }
        return null;
    }

    @NotNull
    public bhl_1 dWo() {
        if (cwl_1.eVE()) {
            return this.kaS;
        }
        if (cwl_1.eVF()) {
            return this.kaT;
        }
        throw new IllegalArgumentException("Invalid sub tab: " + fse_1.gFu().dq("marketViewSearchSubTab"));
    }

    @NotNull
    public bif_1 dWp() {
        if (cwl_1.eVE()) {
            return this.kaU;
        }
        if (cwl_1.eVF()) {
            return this.kaV;
        }
        throw new IllegalArgumentException("Invalid sub tab: " + fse_1.gFu().dq("marketViewSearchSubTab"));
    }

    public void a(bhy_2 bhy_22) {
        this.kbe = bhy_22;
        fse_1.gFu().a((aef_2)this, kbu);
    }

    public void bh(ffV ffV2) {
        this.kbh.setItem(ffV2);
        fse_1.gFu().a((aef_2)this, kbB);
        if (ffV2 != null) {
            fse_1.gFu().a((aef_2)this, kbA);
        }
    }

    public void e(mg mg2) {
        this.kaU.a(mg2.akE(), mg2.Ve().stream().map(mc2 -> new bhu_1((mc)mc2, mg2.akH())).toList());
        fse_1.gFu().a((aef_2)this, kbl);
    }

    public void e(mi_0 mi_02) {
        this.kaV.a(mi_02.akE(), mi_02.anv().stream().map(mE2 -> new bhz_1((mE)mE2, mi_02.akH())).toList());
        fse_1.gFu().a((aef_2)this, kbm);
    }

    public void f(mg mg2) {
        this.kaW.a(mg2.akE(), mg2.Ve().stream().map(mc2 -> new bhu_1((mc)mc2, mg2.akH())).toList());
        this.kbf.GP(this.kaW.ala());
        fse_1.gFu().a((aef_2)this, kbn, kbv, kbw);
    }

    public void d(na na2) {
        this.kaX.a(na2.akE(), na2.Ve().stream().map(bib_1::new).toList());
        fse_1.gFu().a((aef_2)this, kbp);
    }

    public void g(mg mg2) {
        this.kaY.a(mg2.akE(), mg2.Ve().stream().map(mc2 -> new bhu_1((mc)mc2, mg2.akH())).toList());
        fse_1.gFu().a((aef_2)this, kbo);
    }

    public void f(mi_0 mi_02) {
        this.kaZ.a(mi_02.akE(), mi_02.anv().stream().map(mE2 -> new bhz_1((mE)mE2, mi_02.akH())).toList());
        this.kbg.GM(this.kaZ.ala());
        fse_1.gFu().a((aef_2)this, kbq, kbv, kby);
    }

    public void g(mi_0 mi_02) {
        this.kba.a(mi_02.akE(), mi_02.anv().stream().map(mE2 -> new bhz_1((mE)mE2, mi_02.akH())).toList());
        fse_1.gFu().a((aef_2)this, kbr);
    }

    public void d(mR mR2) {
        this.kbb.a(mR2.akE(), mR2.aon().stream().map(bia_1::new).toList());
        fse_1.gFu().a((aef_2)this, kbs);
    }

    public void d(mz_0 mz_02) {
        this.kbc.a(mz_02.akE(), mz_02.amf().stream().map(mt_12 -> new bhw_2((mt_1)mt_12, mz_02.akH())).toList());
        fse_1.gFu().a((aef_2)this, kbt);
    }

    public boolean dWq() {
        return this.kbf.dVG() < 400 && this.dWr() < 800;
    }

    public boolean dVD() {
        return this.kbh.dVD() && fiu_1.uCW.fd("marketSellViewLock");
    }

    private int dWr() {
        return this.kaW.ala() + this.kbf.dVF() + this.kbf.dVH() + this.kaZ.ala() + this.kbg.aop() + this.kbg.dVx();
    }

    public boolean dWs() {
        return this.kbg.dVw() < 400 && this.dWr() < 800;
    }

    public boolean dUR() {
        return this.kbi.dUR() && fiu_1.uCW.fd("marketSellViewLock");
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
        for (fhy_0 fhy_02 : bew_1.dSk().fZi()) {
            if (!fhy_02.cpZ()) continue;
            this.kbj.add(new bie_1(fhy_02));
        }
        this.kbj.add(new bie_1(null));
        this.kbj.sort(bie_1.kej);
    }

    public void dWt() {
        HashMap hashMap = new HashMap();
        this.kbj.forEach(bie_12 -> {
            hashMap.put(bie_12.dGh(), bie_12);
            bie_12.dXp();
        });
        fcI.a(aue_0.cVJ().cVK().Xi(), (exP2, ffV2) -> {
            if (cwl_1.c(ffV2, exP2)) {
                return true;
            }
            fhy_0 fhy_02 = ffV2.dOg().dGh();
            while (fhy_02.fZm() != null) {
                fhy_02 = fhy_02.fZm();
            }
            bie_1 bie_12 = (bie_1)hashMap.get(fhy_02);
            if (bie_12 != null) {
                bie_12.bf((ffV)ffV2);
            } else {
                ((bie_1)hashMap.get(null)).bf((ffV)ffV2);
            }
            return true;
        });
        this.kbj.forEach(bie_12 -> bie_12.mF(this.kbk));
        fse_1.gFu().a((aef_2)this, kbC);
    }

    public Optional<bim_1> bi(@NotNull ffV ffV2) {
        for (bie_1 bie_12 : this.kbj) {
            Optional<bim_1> optional = bie_12.bi(ffV2);
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
        this.kbj.forEach(bie_12 -> bie_12.mF(this.kbk));
        fse_1.gFu().a((aef_2)this, kbC);
    }

    public void a(bin_1 bin_12) {
        this.kbj.forEach(bie_12 -> bie_12.b(bin_12));
        fse_1.gFu().a((aef_2)this, kbC);
    }

    @Generated
    public bhl_1 dWu() {
        return this.kaS;
    }

    @Generated
    public bhl_1 dWv() {
        return this.kaT;
    }

    @Generated
    public bif_1 dWw() {
        return this.kaU;
    }

    @Generated
    public bif_1 dWx() {
        return this.kaV;
    }

    @Generated
    public bif_1 dWy() {
        return this.kaW;
    }

    @Generated
    public bif_1 dWz() {
        return this.kaX;
    }

    @Generated
    public bif_1 dWA() {
        return this.kaY;
    }

    @Generated
    public bif_1 dWB() {
        return this.kaZ;
    }

    @Generated
    public bif_1 dWC() {
        return this.kba;
    }

    @Generated
    public bif_1 dWD() {
        return this.kbb;
    }

    @Generated
    public bif_1 dWE() {
        return this.kbc;
    }

    @Generated
    public bhw_1 dWF() {
        return this.kbd;
    }

    @Generated
    public bhu_2 dWG() {
        return this.kbf;
    }

    @Generated
    public bhq_1 dWH() {
        return this.kbg;
    }

    @Generated
    public bhs_1 dWI() {
        return this.kbh;
    }

    @Generated
    public bhi_2 dWJ() {
        return this.kbi;
    }

    static {
        kbL.add(kbM);
        for (fjb fjb2 : fjb.values()) {
            kbL.add(new bhv_2(fjb2));
        }
        kbN = Arrays.stream(fjh.values()).sorted(Comparator.comparing(fjh::gaO)).map(bik_1::new).toList();
        kbO = kbN.get(fjh.sxx.aJr());
        kbP = new bhz_2();
    }
}

