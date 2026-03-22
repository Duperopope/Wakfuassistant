/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  gnu.trove.set.hash.TLongHashSet
 *  lombok.Generated
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.procedure.TObjectProcedure;
import gnu.trove.set.hash.TLongHashSet;
import java.awt.Point;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Generated;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class cWl
extends cRW {
    private static final Logger nRU = Logger.getLogger(cWl.class);
    public static final String nRV = "marketWindow";
    public static final String nRW = "sellItemView";
    private static final String nRX = "createOfferView";
    private static final String nRY = "offerItemChoiceSearch";
    public static final String nRZ = "priceSellItemTE";
    private static final String nSa = "offerUnitPriceTE";
    private static final int nSb = 832;
    private static final int nSc = 470;
    public static final byte nSd = 0;
    public static final byte nSe = 1;
    public static final byte nSf = 2;
    public static final byte nSg = 99;
    public static final int nSh = 0;
    public static final int nSi = 1;
    private static final cWl nSj = new cWl();
    private static final Map<Long, fiX> nSk = new HashMap<Long, fiX>();
    private final fiU nSl = new fiP();
    private final fiU nSm = new fiS();
    private final fiU nSn = new fiP();
    private final fiT nSo = new fiT();
    private final fiT nSp = new fiT();
    private final fiU nSq = new fiS();
    private final fiT nSr = new fiT();
    private final fiT nSs = new fiT();
    private final fiQ nSt = new fiQ();
    private final bHn nSu = new bHn();
    private boolean nSv = true;
    private final alX nSw = string -> {
        if ("marketDialog".equals(string)) {
            aUE.cVJ().b(nSj);
        }
        if ("marketFulfillOfferDialog".equals(string)) {
            fSe.gFu().f("marketOfferFulfillment", (Object)null);
            cWl.eVv();
            nSk.clear();
        }
        if ("marketOfferItemChoiceDialog".equals(string)) {
            bDC.dRc().dRe();
        }
    };

    private cWl() {
    }

    public static cWl eVl() {
        return nSj;
    }

    @Override
    public boolean b(aAM aAM2) {
        switch (aAM2.d()) {
            case 19720: {
                dae dae2 = (dae)aAM2;
                byte by = dae2.bCn();
                fSe.gFu().f("marketViewTab", by);
                switch (by) {
                    case 1: {
                        this.eVr();
                        cWl.eVs();
                        fSe.gFu().f("marketSellItemMode", false);
                        fSe.gFu().f("marketCreateOfferMode", false);
                        break;
                    }
                    case 0: {
                        this.Np(this.eVt().eEQ());
                        break;
                    }
                    case 2: {
                        this.Ny(this.nSt.eEQ());
                        break;
                    }
                }
                return false;
            }
            case 19728: {
                int n;
                String string2;
                String string3;
                dae dae3 = (dae)aAM2;
                int n2 = dae3.bCo();
                fSe.gFu().f("marketViewSearchSubTab", n2);
                if (n2 == 0) {
                    string3 = "marketAdvancedOfferFiltersDialog";
                    string2 = "marketAdvancedFiltersDialog";
                    n = -362;
                } else if (n2 == 1) {
                    string3 = "marketAdvancedFiltersDialog";
                    string2 = "marketAdvancedOfferFiltersDialog";
                    n = 362;
                } else {
                    return false;
                }
                if (fyw.gqw().to(string3)) {
                    Point point = ((fEy)fyw.gqw().th(string3)).getPosition();
                    fyw.gqw().tl(string3);
                    fEy fEy2 = (fEy)cCJ.g(string2, 163840L);
                    fEy2.setPosition(point.x, point.y + n);
                }
                return false;
            }
            case 19470: {
                dae dae4 = (dae)aAM2;
                fSe.gFu().f("marketViewMyOffersSubTab", dae4.bCo());
                this.nSu.reset();
                this.eVr();
                return false;
            }
            case 18915: {
                this.Np(bHz.dWn().dWp().dXt());
                return false;
            }
            case 16195: {
                this.Np(bHz.dWn().dWp().dXu());
                return false;
            }
            case 16464: {
                dae dae5 = (dae)aAM2;
                bHU bHU2 = (bHU)dae5.bCv();
                int n = dae5.bCo();
                cmu cmu2 = new cmu();
                cmu2.e(bHU2.dXb());
                cmu2.Fq(n);
                aUE.cVJ().etu().d(cmu2);
                return false;
            }
            case 16905: {
                dbU dbU2 = (dbU)aAM2;
                fiU fiU2 = this.eVt();
                cWl.a(fiU2, dbU2.fbg());
                this.Np(fiU2.eEQ());
                return false;
            }
            case 19554: {
                String string4;
                if (cWl.eVE()) {
                    string4 = "marketAdvancedFiltersDialog";
                } else if (cWl.eVF()) {
                    string4 = "marketAdvancedOfferFiltersDialog";
                } else {
                    return false;
                }
                if (fyw.gqw().to(string4)) {
                    fyw.gqw().tl(string4);
                } else {
                    cCJ.g(string4, 163840L);
                }
                return false;
            }
            case 18008: {
                dbZ dbZ2 = (dbZ)aAM2;
                List<bHI> list = dbZ2.dbN();
                bHl bHl2 = bHz.dWn().dWo();
                list.forEach(bHI2 -> {
                    bHl2.b((bHI)bHI2);
                    bHI2.b(this.eVt());
                });
                this.Np(0);
                return false;
            }
            case 18386: {
                dbW dbW2 = (dbW)aAM2;
                bHl bHl3 = bHz.dWn().dWo();
                for (bHI bHI3 : dbW2.dbN()) {
                    bHl3.c(bHI3);
                    bHI3.d(this.eVt());
                }
                if (dbW2.fbi()) {
                    this.Np(0);
                }
                return false;
            }
            case 18510: {
                dbX dbX2 = (dbX)aAM2;
                bHl bHl4 = bHz.dWn().dWo();
                boolean bl = false;
                for (bHH bHH2 : dbX2.fbj()) {
                    Collection<bHI> collection = bHl4.c(bHH2);
                    if (collection.isEmpty()) continue;
                    bl = true;
                    collection.forEach(bHI2 -> {
                        bHl4.c((bHI)bHI2);
                        bHI2.d(this.eVt());
                    });
                }
                if (bl) {
                    this.Np(0);
                }
                return false;
            }
            case 16505: {
                bHz.dWn().dWo().a(this.eVt());
                this.Np(0);
                return false;
            }
            case 18726: {
                bDZ bDZ2 = ((dbV)aAM2).fbh();
                bDZ2.dLG();
                return false;
            }
            case 16684: {
                dbY dbY2 = (dbY)aAM2;
                bIl bIl2 = dbY2.fbk();
                if (bIl2.bqr() == dbY2.bqr()) {
                    return false;
                }
                bIl2.setSelected(dbY2.bqr());
                bHl bHl5 = bHz.dWn().dWo();
                bHR bHR2 = new bHR(bIl2, () -> {
                    if (bIl2.bqr()) {
                        bIl2.setSelected(false);
                        bHl5.dVj();
                    }
                });
                if (bIl2.bqr()) {
                    bHl5.a(bHR2);
                    bHR2.b(this.eVt());
                } else {
                    bHl5.c(bHR2);
                    bHR2.d(this.eVt());
                }
                bHl5.dVj();
                this.Np(0);
                return false;
            }
            case 17270: {
                boolean bl = ((ama)aAM2).bCu();
                bHl bHl6 = bHz.dWn().dWo();
                bHS bHS2 = (bHS)bHl6.b(bHH.kcx);
                bHl6.dUQ();
                bHl6.hK(bl);
                bHS bHS3 = bHl6.hL(bl);
                bHS3.b(this.eVt());
                if (!bHS3.equals(bHS2)) {
                    this.Np(0);
                }
                return false;
            }
            case 16049: {
                bHz.dWn().dWo().dVl();
                bHS.dWX().d(this.eVt());
                this.Np(0);
                return false;
            }
            case 19352: {
                bHz.dWn().dWo().hN(((dae)aAM2).bCu());
                bHz.dWn().dWo().c(bHH.kcz).forEach(bHI2 -> bHI2.b(this.eVt()));
                this.Nq(0);
                return false;
            }
            case 16037: {
                bHH bHH3 = (bHH)((Object)((dae)aAM2).bCv());
                bHz.dWn().dWu().c(bHH3).forEach(bHI2 -> bHI2.b(this.nSl));
                bHz.dWn().dWv().c(bHH3).forEach(bHI2 -> bHI2.b(this.nSm));
                return false;
            }
            case 17125: {
                dae dae6 = (dae)aAM2;
                this.p(dae6.bCu(), true);
                return false;
            }
            case 18837: {
                dae dae7 = (dae)aAM2;
                bIn bIn2 = (bIn)((Object)dae7.bCv());
                bHz.dWn().a(bIn2);
                return false;
            }
            case 18834: {
                dbS dbS2 = (dbS)aAM2;
                ffV ffV2 = dbS2.getItem();
                if (cWl.bK(ffV2)) {
                    Object t = fcI.ad(bbS.xl(), ffV2.LV());
                    if (t != null) {
                        nRU.warn((Object)"Cannot put equipment up for sale");
                        aPd.e("market.cannot.add.equipment", new Object[0]);
                    } else {
                        nRU.warn((Object)("Cannot put up item " + ffV2.avr() + " for sale"));
                        aPd.e("market.addItem.unauthorized", new Object[0]);
                    }
                    return false;
                }
                this.p(true, false);
                bHz.dWn().bh(ffV2);
                cWl.f(dbS2.fbe());
                return false;
            }
            case 17607: {
                bHz.dWn().bh(null);
                return false;
            }
            case 18709: {
                if (!bHz.dWn().dVD()) {
                    return false;
                }
                cWl.eVm();
                return false;
            }
            case 18354: {
                bIg bIg2 = ((dbT)aAM2).fbf();
                bHz.dWn().dWI().a(bIg2);
                return false;
            }
            case 17161: {
                bHz.dWn().dWF().dVZ();
                return false;
            }
            case 18696: {
                bHz.dWn().dWF().dWb();
                return false;
            }
            case 19972: {
                dbU dbU3 = (dbU)aAM2;
                bHz.dWn().dWF().a(dbU3.fbg());
                return false;
            }
            case 16728: {
                bHz.dWn().dWF().dWa();
                return false;
            }
            case 19632: {
                bHz.dWn().dWF().dWc();
                return false;
            }
            case 18492: {
                dbU dbU4 = (dbU)aAM2;
                bHz.dWn().dWF().b(dbU4.fbg());
                return false;
            }
            case 18783: {
                String string5 = ((dae)aAM2).bCt();
                this.nSn.sN(string5.isBlank() ? null : string5).E(cWl.eVJ());
                this.Ns(bHz.dWn().dWy().dXw());
                return false;
            }
            case 19616: {
                this.Ns(bHz.dWn().dWy().dXt());
                return false;
            }
            case 18307: {
                this.Ns(bHz.dWn().dWy().dXu());
                return false;
            }
            case 17883: {
                dbU dbU5 = (dbU)aAM2;
                cWl.a(this.nSn, dbU5.fbg());
                this.Ns(this.nSn.eEQ());
                return false;
            }
            case 17500: {
                bHU bHU3 = (bHU)((dae)aAM2).bCv();
                fIQ.gCw().d(fIK.a(string -> {
                    fIU.uCW.N("marketRetrieveLock", false);
                    cmB cmB2 = new cmB(bHU3.dXb());
                    aUE.cVJ().etu().d(cmB2);
                }).l("market.removeItemConfirmation", new Object[0]).vG(cCP.mRE.byf()));
                return false;
            }
            case 17195: {
                dbU dbU6 = (dbU)aAM2;
                cWl.a(this.nSo, dbU6.fbg());
                this.Nt(this.nSo.eEQ());
                return false;
            }
            case 17734: {
                fIU.uCW.N("marketRetrieveLock", false);
                aUE.cVJ().etu().d(new cma());
                return false;
            }
            case 17931: {
                cWl.a("marketSoldItemsDetailDialog", () -> this.Nt(0));
                return false;
            }
            case 19875: {
                this.Nt(bHz.dWn().dWz().dXt());
                return false;
            }
            case 18762: {
                this.Nt(bHz.dWn().dWz().dXu());
                return false;
            }
            case 17280: {
                dbU dbU7 = (dbU)aAM2;
                cWl.a(this.nSp, dbU7.fbg());
                this.Nu(this.nSp.eEQ());
                return false;
            }
            case 19215: {
                fIU.uCW.N("marketRetrieveLock", false);
                bHU bHU4 = (bHU)((dae)aAM2).bCv();
                aUE.cVJ().etu().d(new cmz(bHU4.dXb()));
                return false;
            }
            case 16042: {
                fIU.uCW.N("marketRetrieveLock", false);
                aUE.cVJ().etu().d(new cmz());
                return false;
            }
            case 17666: {
                cWl.a("marketExpiredEntriesDetailDialog", () -> this.Nu(0));
                return false;
            }
            case 17570: {
                this.Nu(bHz.dWn().dWA().dXt());
                return false;
            }
            case 18198: {
                this.Nu(bHz.dWn().dWA().dXu());
                return false;
            }
            case 16253: {
                if (fyw.gqw().to("marketOfferItemChoiceDialog")) {
                    return false;
                }
                bHz.dWn().dWJ().mK("");
                cCJ.g("marketOfferItemChoiceDialog", 256L);
                return false;
            }
            case 19592: {
                dae dae8 = (dae)aAM2;
                bHz.dWn().dWJ().mK(dae8.bCt());
                return false;
            }
            case 19182: {
                dae dae9 = (dae)aAM2;
                boolean bl = dae9.bCu();
                this.kB(bl);
                if (bl) {
                    bHz.dWn().dWJ().o((bGV)dae9.bCv());
                    fHv fHv2 = fyw.gqw().gqC().uR("marketDialog").uH("createOfferModeMainInnerContainer");
                    fHv2.a(new cWm(this, fHv2));
                    bDC.dRc().dRe();
                } else {
                    this.eVq();
                }
                if (fyw.gqw().to("marketOfferItemChoiceDialog")) {
                    fyw.gqw().tl("marketOfferItemChoiceDialog");
                }
                return false;
            }
            case 18452: {
                dae dae10 = (dae)aAM2;
                boolean bl = dae10.bCu();
                boolean bl2 = dae10.bCo() == 1;
                bHz.dWn().dWJ().dUQ();
                bHz.dWn().dWJ().hK(bl);
                if (bl2) {
                    bHz.dWn().dWJ().dVa().mL(null);
                    bHz.dWn().dWJ().a((bIj)null);
                }
                return false;
            }
            case 17480: {
                bHz.dWn().dWJ().hJ(false);
                return false;
            }
            case 16917: {
                if (!bHz.dWn().dUR()) {
                    return false;
                }
                cWl.eVn();
                return false;
            }
            case 19753: {
                ffV ffV3 = (ffV)((dae)aAM2).bCv();
                bHo bHo2 = cWl.eVu();
                if (bHo2 == null) {
                    return false;
                }
                if (cWl.bK(ffV3)) {
                    return false;
                }
                bHo2.bf(ffV3);
                return false;
            }
            case 17858: {
                ffV ffV4 = (ffV)((dae)aAM2).bCv();
                bHo bHo3 = cWl.eVu();
                if (bHo3 == null) {
                    return false;
                }
                bHo3.bg(ffV4);
                return false;
            }
            case 16803: {
                bHZ bHZ2 = (bHZ)((dae)aAM2).bCv();
                fSe.gFu().f("marketOfferFulfillment", new bHo(bHZ2));
                fEy fEy3 = (fEy)cCJ.g("marketFulfillOfferDialog", 131072L);
                fGo fGo2 = new fGo();
                fGo2.a("level", new fGq(bHo.jYZ));
                fGo2.a("shards", new fGq(bHo.jZa));
                fGo2.a("quantity", new fGq(bHo.jYY));
                fGo2.gxw();
                fDq fDq2 = (fDq)fEy3.getElementMap().uH("selectedItemsTable");
                fDq2.setTableModel(fGo2);
                nSk.clear();
                cWl.eVv();
                return false;
            }
            case 17565: {
                bHo bHo4 = cWl.eVu();
                if (bHo4 == null || !bHo4.dVp()) {
                    return false;
                }
                cmc cmc2 = new cmc();
                cmc2.nu(bHo4.dVr().dXk().Lx());
                bHo4.n(bHp2 -> cmc2.b(bHp2.dVu(), bHp2.getItem().LV(), bHp2.oP()));
                aUE.cVJ().etu().d(cmc2);
                fIU.uCW.N("marketFulfillOfferLock", false);
                return false;
            }
            case 19706: {
                bHo bHo5 = cWl.eVu();
                if (bHo5 == null) {
                    return false;
                }
                bHo5.dVo();
                return false;
            }
            case 16643: {
                String string6 = ((dae)aAM2).bCt();
                this.nSq.sN(string6.isBlank() ? null : string6).E(cWl.eVJ());
                this.Nv(bHz.dWn().dWB().dXw());
                return false;
            }
            case 16441: {
                this.Nv(bHz.dWn().dWB().dXt());
                return false;
            }
            case 18727: {
                this.Nv(bHz.dWn().dWB().dXu());
                return false;
            }
            case 18907: {
                dbU dbU8 = (dbU)aAM2;
                cWl.a(this.nSq, dbU8.fbg());
                this.Nv(this.nSq.eEQ());
                return false;
            }
            case 17150: {
                bHZ bHZ3 = (bHZ)((dae)aAM2).bCv();
                fIQ.gCw().d(fIK.a(string -> {
                    fIU.uCW.N("marketRetrieveLock", false);
                    clS clS2 = new clS(bHZ3.dXk().Lx());
                    aUE.cVJ().etu().d(clS2);
                }).l("market.cancel.offer.confirmation", new Object[0]).vG(cCP.mRE.byf()));
                return false;
            }
            case 18675: {
                cWl.a("marketExpiredOffersDetailDialog", () -> this.Nw(0));
                return false;
            }
            case 18871: {
                this.Nw(bHz.dWn().dWC().dXt());
                return false;
            }
            case 16026: {
                this.Nw(bHz.dWn().dWC().dXu());
                return false;
            }
            case 18081: {
                dbU dbU9 = (dbU)aAM2;
                cWl.a(this.nSr, dbU9.fbg());
                this.Nw(this.nSr.eEQ());
                return false;
            }
            case 19850: {
                fIU.uCW.N("marketRetrieveLock", false);
                aUE.cVJ().etu().d(new cmw());
                return false;
            }
            case 16486: {
                cWl.a("marketPurchasedItemsDetailDialog", () -> this.Nx(0));
                return false;
            }
            case 19721: {
                this.Nx(bHz.dWn().dWD().dXt());
                return false;
            }
            case 18870: {
                this.Nx(bHz.dWn().dWD().dXu());
                return false;
            }
            case 16696: {
                dbU dbU10 = (dbU)aAM2;
                cWl.a(this.nSs, dbU10.fbg());
                this.Nx(this.nSs.eEQ());
                return false;
            }
            case 18794: {
                fIU.uCW.N("marketRetrieveLock", false);
                bIa bIa2 = (bIa)((dae)aAM2).bCv();
                cmD cmD2 = new cmD(bIa2.dXm());
                aUE.cVJ().etu().d(cmD2);
                return false;
            }
            case 16517: {
                fIU.uCW.N("marketRetrieveLock", false);
                aUE.cVJ().etu().d(new cmD());
                return false;
            }
            case 18797: {
                this.Ny(bHz.dWn().dWE().dXt());
                return false;
            }
            case 19314: {
                this.Ny(bHz.dWn().dWE().dXu());
                return false;
            }
            case 19585: {
                dbU dbU11 = (dbU)aAM2;
                cWl.a(this.nSt, dbU11.fbg());
                this.Ny(this.nSt.eEQ());
                return false;
            }
            case 18170: {
                this.Ny(bHz.dWn().dWE().GW(0));
                return false;
            }
        }
        return true;
    }

    @Override
    public void a(ayE ayE2, boolean bl) {
        super.a(ayE2, bl);
        if (bl) {
            return;
        }
        aUE.cVJ().b(cZi.eYU());
        aIe.cfn().bmE().a(bHm.jYL, true);
        fSe.gFu().f("marketViewTab", (byte)0);
        fSe.gFu().f("marketView", bHz.dWn());
        fSe.gFu().f("marketTableModels", bHx.dWf());
        fSe.gFu().f("marketEntryFilters", bHz.dWn().dWu());
        fSe.gFu().f("marketOfferFilters", bHz.dWn().dWv());
        fSe.gFu().f("marketViewSearchSubTab", 0);
        fSe.gFu().f("marketViewMyOffersSubTab", 0);
        fSe.gFu().f("marketSellItemMode", false);
        fSe.gFu().f("marketCreateOfferMode", false);
        fSe.gFu().f("marketSimilarSearches", bHz.dWn().dWF());
        fSe.gFu().f("marketOfferCreationData", bHz.dWn().dWJ());
        fSe.gFu().f("marketOfferFulfillment", (Object)null);
        fSe.gFu().f("marketOptions", new bId());
        fIU.uCW.vN("marketSearchesLock");
        fIU.uCW.vN("marketSellViewLock");
        fIU.uCW.vN("marketFulfillOfferLock");
        fIU.uCW.vN("marketRetrieveLock");
        fyw.gqw().a(this.nSw);
        fEy fEy2 = (fEy)cCJ.g("marketDialog", 32768L);
        cWl.bE(fEy2);
        fyw.gqw().d("wakfu.market", cFp.class);
        cAY.eHc().nP(600012L);
        boolean bl2 = bId.b(bSN.lkK);
        bHz.dWn().hO(bl2);
        bHz.dWn().bh(null);
        bHz.dWn().mO("");
        if (this.nSv || !bl2) {
            this.nSl.reset();
            this.nSt.reset();
            this.nSm.reset();
            cWl.a(bHz.dWn().dWu(), this.nSl, true);
            cWl.a(bHz.dWn().dWv(), this.nSm, false);
            this.eVo();
        }
        this.nSn.reset();
        this.nSq.reset();
        this.Nq(0);
        this.Nr(0);
        this.nSv = false;
    }

    @Override
    protected boolean eNu() {
        return bId.b(bSN.lkJ);
    }

    @Override
    public void b(ayE ayE2, boolean bl) {
        super.b(ayE2, bl);
        if (bl) {
            return;
        }
        bgT bgT2 = aUE.cVJ().cVK();
        if (bgT2 != null) {
            bgT2.dnY();
        }
        bHz.dWn().hO(bId.b(bSN.lkK));
        this.eRy();
        aUE.cVJ().a(cZi.eYU());
        aIe.cfn().bmE().a(bHm.jYL);
        cAY.eHc().nP(600013L);
        fIU.uCW.vO("marketSearchesLock");
        fIU.uCW.vO("marketSellViewLock");
        fIU.uCW.vO("marketFulfillOfferLock");
        fIU.uCW.vO("marketRetrieveLock");
        nSk.clear();
    }

    private void eRy() {
        fyw.gqw().b(this.nSw);
        fyw.gqw().tl("marketDialog");
        fyw.gqw().tl("marketAdvancedFiltersDialog");
        fyw.gqw().tl("marketAdvancedOfferFiltersDialog");
        fyw.gqw().tl("marketConfirmPurchaseDialog");
        fyw.gqw().tl("marketSoldItemsDetailDialog");
        fyw.gqw().tl("marketExpiredEntriesDetailDialog");
        fyw.gqw().tl("marketOfferItemChoiceDialog");
        fyw.gqw().tl("marketFulfillOfferDialog");
        fyw.gqw().tl("marketPurchasedItemsDetailDialog");
        fyw.gqw().tl("marketExpiredOffersDetailDialog");
        fyw.gqw().tc("wakfu.market");
    }

    private static void bE(fEy fEy2) {
        fHs fHs2 = fyw.gqw().gqC().uR("inventoryDialog");
        if (fHs2 == null) {
            return;
        }
        fEy fEy3 = (fEy)fHs2.uH("equipInventWindow");
        if (fEy3 == null) {
            return;
        }
        fEy2.a(new cWn(fEy2, fEy3));
    }

    private static void a(String string, Runnable runnable) {
        if (fyw.gqw().to(string)) {
            fyw.gqw().tl(string);
        } else {
            cCJ.g(string, 32768L);
            runnable.run();
        }
    }

    private static void eVm() {
        bHs bHs2 = bHz.dWn().dWI();
        String string2 = aUM.cWf().c("market.sell.confirmation", bHs2.oP(), bHs2.getItem().getName(), bHs2.akd(), bHs2.akd() * (long)bHs2.oP(), bHs2.dWh());
        fIQ.gCw().d(fIK.a(string -> {
            if (!bHz.dWn().dVD()) {
                return;
            }
            fIU.uCW.N("marketSellViewLock", false);
            clQ clQ2 = new clQ();
            clQ2.ns(bHs2.dVE().dXE().LV());
            clQ2.Ld(bHs2.oP());
            clQ2.nt(bHs2.akd());
            clQ2.a(bHs2.dUX().dXx());
            aUE.cVJ().etu().d(clQ2);
        }).vE(string2).vG(cCP.mRE.byf()));
    }

    private static void eVn() {
        bHi bHi2 = bHz.dWn().dWJ();
        String string2 = aUM.cWf().c("market.create.offer.confirmation", bHi2.oP(), bHi2.duo().getName(), bHi2.akd(), bHi2.akd() * (long)bHi2.oP(), bHi2.dWh(), bHi2.akd() * (long)bHi2.oP() + bHi2.dWh());
        fIQ.gCw().d(fIK.a(string -> {
            if (!bHz.dWn().dUR()) {
                return;
            }
            fIU.uCW.N("marketSellViewLock", false);
            clY clY2 = new clY();
            clY2.a(bHi2.dUV());
            aUE.cVJ().etu().d(clY2);
        }).vE(string2).vG(cCP.mRE.byf()));
    }

    private static void a(bHl bHl2, fiU fiU2, boolean bl) {
        bHM bHM2 = new bHM(true, bl ? "market.filter.only.cheapest" : "market.filter.only.most.expensive", bHl2);
        bHl2.a(bHM2);
        bHM2.b(fiU2);
        fSe.gFu().a((aEF)bHl2, "onlyExtremePrice");
        if (eIA.pH(bbS.xl())) {
            bHK bHK2 = new bHK(0, 50, bHl2);
            bHl2.a(bHK2);
            bHK2.b(fiU2);
            fSe.gFu().a((aEF)bHl2, "minLevel", "maxLevel");
        }
    }

    private void eVo() {
        this.nSt.c(fje.swU);
        this.nSt.nx(false);
        this.nSt.a(bHz.kbM.dXd());
        fSe.gFu().a((aEF)bHz.dWn(), "selectedHistoryElementType");
        this.nSt.a(bHz.kbO.dXD());
        fSe.gFu().a((aEF)bHz.dWn(), "selectedTimespan");
    }

    private void p(boolean bl, boolean bl2) {
        fSe.gFu().f("marketSellItemMode", bl);
        if (bl) {
            bHz.dWn().dWt();
            if (bl2) {
                bHz.dWn().bh(bHz.dWn().dWI().getItem());
            }
        } else {
            this.eVp();
        }
    }

    private static void f(@Nullable fDu fDu2) {
        if (fDu2 != null) {
            cWl.g(fDu2);
        } else {
            aBg.bUP().a(() -> {
                fDu fDu2;
                fHv fHv3 = fyw.gqw().th("marketDialog");
                fDu fDu3 = fDu2 = fHv3 == null ? null : (fDu)fHv3.getElementRecursively(nRZ, fHv2 -> !fHv2.isATemplate());
                if (fDu2 != null) {
                    cWl.g(fDu2);
                }
            }, 50L, 1);
        }
    }

    private static void g(@NotNull fDu fDu2) {
        fDu2.setFocused(true);
        if (!BH.aU(fDu2.getText())) {
            fDu2.setEnabled(false);
            aBg.bUP().a(() -> {
                fDu2.setEnabled(true);
                fDu2.dUA();
            }, 100L, 1);
        }
    }

    private void kB(boolean bl) {
        fSe.gFu().f("marketCreateOfferMode", bl);
        if (!bl) {
            this.eVq();
        }
    }

    public void eVp() {
        this.Ns(bHz.dWn().dWy().dXw());
        cWl.eVs();
    }

    public void eVq() {
        this.Nv(bHz.dWn().dWB().dXw());
        cWl.eVs();
    }

    public void Np(int n) {
        if (cWl.eVE()) {
            this.Nq(n);
        } else if (cWl.eVF()) {
            this.Nr(n);
        }
    }

    public void Nq(int n) {
        this.L(n, false);
    }

    public void L(int n, boolean bl) {
        this.nSl.Wj(n);
        if (!this.nSu.as(this.nSl) && !bl) {
            return;
        }
        fIU.uCW.N("marketSearchesLock", false);
        clW clW2 = new clW(fjc.swu);
        clW2.e(this.nSl);
        aUE.cVJ().etu().d(clW2);
    }

    public void Nr(int n) {
        this.M(n, false);
    }

    public void M(int n, boolean bl) {
        this.nSm.Wj(n);
        if (!this.nSu.as(this.nSm) && !bl) {
            return;
        }
        fIU.uCW.N("marketSearchesLock", false);
        clV clV2 = new clV(fjc.sww);
        clV2.e(this.nSm);
        aUE.cVJ().etu().d(clV2);
    }

    private void eVr() {
        if (cWl.eVG()) {
            this.Ns(0);
        } else if (cWl.eVH()) {
            this.Nv(0);
        }
    }

    public void Ns(int n) {
        this.N(n, false);
    }

    public void N(int n, boolean bl) {
        this.nSn.Wj(n);
        if (!this.nSu.as(this.nSn) && !bl) {
            return;
        }
        fIU.uCW.N("marketSearchesLock", false);
        cml cml2 = new cml(this.nSn);
        aUE.cVJ().etu().d(cml2);
    }

    public static void eVs() {
        aUE.cVJ().etu().d(new cmp());
    }

    public void Nt(int n) {
        this.O(n, false);
    }

    public void O(int n, boolean bl) {
        this.nSo.Wj(n);
        if (!this.nSu.as(this.nSo) && !bl) {
            return;
        }
        fIU.uCW.N("marketSearchesLock", false);
        cmr cmr2 = new cmr(this.nSo);
        aUE.cVJ().etu().d(cmr2);
    }

    public void Nu(int n) {
        this.P(n, false);
    }

    public void P(int n, boolean bl) {
        this.nSp.Wj(n);
        if (!this.nSu.as(this.nSp) && !bl) {
            return;
        }
        fIU.uCW.N("marketSearchesLock", false);
        cmg cmg2 = new cmg(this.nSp);
        aUE.cVJ().etu().d(cmg2);
    }

    public void Nv(int n) {
        this.Q(n, false);
    }

    public void Q(int n, boolean bl) {
        this.nSq.Wj(n);
        if (!this.nSu.as(this.nSq) && !bl) {
            return;
        }
        fIU.uCW.N("marketSearchesLock", false);
        cme cme2 = new cme(this.nSq);
        aUE.cVJ().etu().d(cme2);
    }

    public void Nw(int n) {
        this.R(n, false);
    }

    public void R(int n, boolean bl) {
        this.nSr.Wj(n);
        if (!this.nSu.as(this.nSr) && !bl) {
            return;
        }
        fIU.uCW.N("marketSearchesLock", false);
        cmi cmi2 = new cmi(this.nSr);
        aUE.cVJ().etu().d(cmi2);
    }

    public void Nx(int n) {
        this.S(n, false);
    }

    public void S(int n, boolean bl) {
        this.nSs.Wj(n);
        if (!this.nSu.as(this.nSs) && !bl) {
            return;
        }
        fIU.uCW.N("marketSearchesLock", false);
        cmn cmn2 = new cmn(this.nSs);
        aUE.cVJ().etu().d(cmn2);
    }

    private void Ny(int n) {
        this.nSt.Wj(n);
        if (!this.nSu.as(this.nSt)) {
            return;
        }
        fIU.uCW.N("marketSearchesLock", false);
        cmF cmF2 = new cmF();
        cmF2.a(this.nSt);
        aUE.cVJ().etu().d(cmF2);
    }

    public static boolean bK(ffV ffV2) {
        bgT bgT2 = (bgT)fcI.ac(bbS.xl(), ffV2.LV());
        if (bgT2 == null) {
            return true;
        }
        return cWl.c(ffV2, bgT2);
    }

    public static boolean c(ffV ffV2, @NotNull exP exP2) {
        if (ffV2.adZ() && ffV2.fUY().fXu().bKa() || ffV2.fWm()) {
            return true;
        }
        if (ffV2.dwg() == fgj.siI) {
            return true;
        }
        return ffV2.dOg().a(ffJ.sgg) != null && !ffV2.dOg().a(ffJ.sgg).b(exP2, exP2.aZw(), ffV2, exP2.fgg());
    }

    public static void a(fiT fiT2, fje fje2) {
        fje fje3 = fiT2.fbg();
        if (fje2 == fje3) {
            fiT2.nx(!fiT2.gan());
        } else {
            fiT2.c(fje2);
            fiT2.nx(true);
            if (fje2 == fje.swQ) {
                fiT2.gK(cWl.eVJ().aJr());
            } else {
                fiT2.gK((byte)-1);
            }
        }
    }

    private fiU eVt() {
        if (cWl.eVE()) {
            return this.nSl;
        }
        if (cWl.eVF()) {
            return this.nSm;
        }
        throw new IllegalArgumentException("Invalid sub tab: " + fSe.gFu().dq("marketViewSearchSubTab"));
    }

    @Nullable
    private static bHo eVu() {
        return (bHo)fSe.gFu().vY("marketOfferFulfillment");
    }

    public static boolean bL(ffV ffV2) {
        if (!fyw.gqw().to("marketFulfillOfferDialog")) {
            return false;
        }
        bHo bHo2 = (bHo)fSe.gFu().vY("marketOfferFulfillment");
        if (bHo2 == null) {
            return false;
        }
        return bHo2.jW(ffV2.LV()) || cWl.a(ffV2, bHo2.dVr().dXk()) != fiX.sup;
    }

    public static fiX a(ffV ffV2, mE mE2) {
        fiX fiX2 = nSk.get(ffV2.LV());
        if (fiX2 != null) {
            return fiX2;
        }
        fiX fiX3 = fiV.a(ffV2, mE2);
        nSk.put(ffV2.LV(), fiX3);
        return fiX3;
    }

    private static void eVv() {
        TLongHashSet tLongHashSet = fcL.rUh.sx(bbS.xl());
        for (long l : tLongHashSet.toArray()) {
            Object t = fcL.rUh.sw(l);
            ((exP)t).dod().M((TObjectProcedure<ffV>)((TObjectProcedure)ffV2 -> {
                fSe.gFu().a((aEF)ffV2, "movable");
                return true;
            }));
        }
    }

    public static void eVw() {
        if (cWl.eVz()) {
            fSe.gFu().a((aEF)bHz.dWn().dWI(), bHz.dWn().dWI().bxk());
        } else if (cWl.eVB()) {
            fSe.gFu().a((aEF)bHz.dWn().dWJ(), bHz.dWn().dWJ().bxk());
        }
    }

    public static boolean eVx() {
        return fSe.gFu().dq("marketViewTab") == 0;
    }

    public static boolean eVy() {
        return fSe.gFu().dq("marketViewTab") == 1;
    }

    public static boolean eVz() {
        return cWl.eVy() && fSe.gFu().dp("marketSellItemMode");
    }

    public static boolean eVA() {
        return cWl.eVy() && !fSe.gFu().dp("marketSellItemMode");
    }

    public static boolean eVB() {
        return cWl.eVy() && fSe.gFu().dp("marketCreateOfferMode");
    }

    public static boolean eVC() {
        return cWl.eVy() && !fSe.gFu().dp("marketCreateOfferMode");
    }

    public static boolean eVD() {
        return fSe.gFu().dq("marketViewTab") == 2;
    }

    public static boolean eVE() {
        return cWl.eVx() && fSe.gFu().dq("marketViewSearchSubTab") == 0;
    }

    public static boolean eVF() {
        return cWl.eVx() && fSe.gFu().dq("marketViewSearchSubTab") == 1;
    }

    public static boolean eVG() {
        return cWl.eVy() && fSe.gFu().dq("marketViewMyOffersSubTab") == 0;
    }

    public static boolean eVH() {
        return cWl.eVy() && fSe.gFu().dq("marketViewMyOffersSubTab") == 1;
    }

    public static boolean eVI() {
        return fSe.gFu().dq("marketViewTab") == 99;
    }

    public static Mv eVJ() {
        Mv mv = aUM.cWf().aUXX();
        return mv.aUN() ? mv : Mv.aVy;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    @Generated
    public fiQ eVK() {
        return this.nSt;
    }
}
