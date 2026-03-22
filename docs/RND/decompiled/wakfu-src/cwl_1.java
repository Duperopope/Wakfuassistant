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

/*
 * Renamed from cWl
 */
public class cwl_1
extends crw_2 {
    private static final Logger nRU = Logger.getLogger(cwl_1.class);
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
    private static final cwl_1 nSj = new cwl_1();
    private static final Map<Long, fix_0> nSk = new HashMap<Long, fix_0>();
    private final fiu_0 nSl = new fiP();
    private final fiu_0 nSm = new fiS();
    private final fiu_0 nSn = new fiP();
    private final fiT nSo = new fiT();
    private final fiT nSp = new fiT();
    private final fiu_0 nSq = new fiS();
    private final fiT nSr = new fiT();
    private final fiT nSs = new fiT();
    private final fiQ nSt = new fiQ();
    private final bhn_2 nSu = new bhn_2();
    private boolean nSv = true;
    private final alx_2 nSw = string -> {
        if ("marketDialog".equals(string)) {
            aue_0.cVJ().b(nSj);
        }
        if ("marketFulfillOfferDialog".equals(string)) {
            fse_1.gFu().f("marketOfferFulfillment", (Object)null);
            cwl_1.eVv();
            nSk.clear();
        }
        if ("marketOfferItemChoiceDialog".equals(string)) {
            bdc_0.dRc().dRe();
        }
    };

    private cwl_1() {
    }

    public static cwl_1 eVl() {
        return nSj;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 19720: {
                dae_0 dae_02 = (dae_0)aam_22;
                byte by = dae_02.bCn();
                fse_1.gFu().f("marketViewTab", by);
                switch (by) {
                    case 1: {
                        this.eVr();
                        cwl_1.eVs();
                        fse_1.gFu().f("marketSellItemMode", false);
                        fse_1.gFu().f("marketCreateOfferMode", false);
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
                dae_0 dae_03 = (dae_0)aam_22;
                int n2 = dae_03.bCo();
                fse_1.gFu().f("marketViewSearchSubTab", n2);
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
                if (fyw_0.gqw().to(string3)) {
                    Point point = ((fey_2)fyw_0.gqw().th(string3)).getPosition();
                    fyw_0.gqw().tl(string3);
                    fey_2 fey_22 = (fey_2)ccj_2.g(string2, 163840L);
                    fey_22.setPosition(point.x, point.y + n);
                }
                return false;
            }
            case 19470: {
                dae_0 dae_04 = (dae_0)aam_22;
                fse_1.gFu().f("marketViewMyOffersSubTab", dae_04.bCo());
                this.nSu.reset();
                this.eVr();
                return false;
            }
            case 18915: {
                this.Np(bhz_2.dWn().dWp().dXt());
                return false;
            }
            case 16195: {
                this.Np(bhz_2.dWn().dWp().dXu());
                return false;
            }
            case 16464: {
                dae_0 dae_05 = (dae_0)aam_22;
                bhu_1 bhu_12 = (bhu_1)dae_05.bCv();
                int n = dae_05.bCo();
                cmu_0 cmu_02 = new cmu_0();
                cmu_02.e(bhu_12.dXb());
                cmu_02.Fq(n);
                aue_0.cVJ().etu().d(cmu_02);
                return false;
            }
            case 16905: {
                dbu_0 dbu_02 = (dbu_0)aam_22;
                fiu_0 fiu_02 = this.eVt();
                cwl_1.a(fiu_02, dbu_02.fbg());
                this.Np(fiu_02.eEQ());
                return false;
            }
            case 19554: {
                String string4;
                if (cwl_1.eVE()) {
                    string4 = "marketAdvancedFiltersDialog";
                } else if (cwl_1.eVF()) {
                    string4 = "marketAdvancedOfferFiltersDialog";
                } else {
                    return false;
                }
                if (fyw_0.gqw().to(string4)) {
                    fyw_0.gqw().tl(string4);
                } else {
                    ccj_2.g(string4, 163840L);
                }
                return false;
            }
            case 18008: {
                dbz_0 dbz_02 = (dbz_0)aam_22;
                List<bhi_1> list = dbz_02.dbN();
                bhl_1 bhl_12 = bhz_2.dWn().dWo();
                list.forEach(bhi_12 -> {
                    bhl_12.b((bhi_1)bhi_12);
                    bhi_12.b(this.eVt());
                });
                this.Np(0);
                return false;
            }
            case 18386: {
                dbw_0 dbw_02 = (dbw_0)aam_22;
                bhl_1 bhl_13 = bhz_2.dWn().dWo();
                for (bhi_1 bhi_13 : dbw_02.dbN()) {
                    bhl_13.c(bhi_13);
                    bhi_13.d(this.eVt());
                }
                if (dbw_02.fbi()) {
                    this.Np(0);
                }
                return false;
            }
            case 18510: {
                dbx_0 dbx_02 = (dbx_0)aam_22;
                bhl_1 bhl_14 = bhz_2.dWn().dWo();
                boolean bl = false;
                for (bhh_1 bhh_12 : dbx_02.fbj()) {
                    Collection<bhi_1> collection = bhl_14.c(bhh_12);
                    if (collection.isEmpty()) continue;
                    bl = true;
                    collection.forEach(bhi_12 -> {
                        bhl_14.c((bhi_1)bhi_12);
                        bhi_12.d(this.eVt());
                    });
                }
                if (bl) {
                    this.Np(0);
                }
                return false;
            }
            case 16505: {
                bhz_2.dWn().dWo().a(this.eVt());
                this.Np(0);
                return false;
            }
            case 18726: {
                bdz_0 bdz_02 = ((dbv_0)aam_22).fbh();
                bdz_02.dLG();
                return false;
            }
            case 16684: {
                dby_0 dby_02 = (dby_0)aam_22;
                bil_1 bil_12 = dby_02.fbk();
                if (bil_12.bqr() == dby_02.bqr()) {
                    return false;
                }
                bil_12.setSelected(dby_02.bqr());
                bhl_1 bhl_15 = bhz_2.dWn().dWo();
                bhr_2 bhr_22 = new bhr_2(bil_12, () -> {
                    if (bil_12.bqr()) {
                        bil_12.setSelected(false);
                        bhl_15.dVj();
                    }
                });
                if (bil_12.bqr()) {
                    bhl_15.a(bhr_22);
                    bhr_22.b(this.eVt());
                } else {
                    bhl_15.c(bhr_22);
                    bhr_22.d(this.eVt());
                }
                bhl_15.dVj();
                this.Np(0);
                return false;
            }
            case 17270: {
                boolean bl = ((ama_1)aam_22).bCu();
                bhl_1 bhl_16 = bhz_2.dWn().dWo();
                bhs_2 bhs_22 = (bhs_2)bhl_16.b(bhh_1.kcx);
                bhl_16.dUQ();
                bhl_16.hK(bl);
                bhs_2 bhs_23 = bhl_16.hL(bl);
                bhs_23.b(this.eVt());
                if (!bhs_23.equals(bhs_22)) {
                    this.Np(0);
                }
                return false;
            }
            case 16049: {
                bhz_2.dWn().dWo().dVl();
                bhs_2.dWX().d(this.eVt());
                this.Np(0);
                return false;
            }
            case 19352: {
                bhz_2.dWn().dWo().hN(((dae_0)aam_22).bCu());
                bhz_2.dWn().dWo().c(bhh_1.kcz).forEach(bhi_12 -> bhi_12.b(this.eVt()));
                this.Nq(0);
                return false;
            }
            case 16037: {
                bhh_1 bhh_13 = (bhh_1)((Object)((dae_0)aam_22).bCv());
                bhz_2.dWn().dWu().c(bhh_13).forEach(bhi_12 -> bhi_12.b(this.nSl));
                bhz_2.dWn().dWv().c(bhh_13).forEach(bhi_12 -> bhi_12.b(this.nSm));
                return false;
            }
            case 17125: {
                dae_0 dae_06 = (dae_0)aam_22;
                this.p(dae_06.bCu(), true);
                return false;
            }
            case 18837: {
                dae_0 dae_07 = (dae_0)aam_22;
                bin_1 bin_12 = (bin_1)((Object)dae_07.bCv());
                bhz_2.dWn().a(bin_12);
                return false;
            }
            case 18834: {
                dbs_0 dbs_02 = (dbs_0)aam_22;
                ffV ffV2 = dbs_02.getItem();
                if (cwl_1.bK(ffV2)) {
                    Object t = fcI.ad(bbs_2.xl(), ffV2.LV());
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
                bhz_2.dWn().bh(ffV2);
                cwl_1.f(dbs_02.fbe());
                return false;
            }
            case 17607: {
                bhz_2.dWn().bh(null);
                return false;
            }
            case 18709: {
                if (!bhz_2.dWn().dVD()) {
                    return false;
                }
                cwl_1.eVm();
                return false;
            }
            case 18354: {
                big_1 big_12 = ((dbt_0)aam_22).fbf();
                bhz_2.dWn().dWI().a(big_12);
                return false;
            }
            case 17161: {
                bhz_2.dWn().dWF().dVZ();
                return false;
            }
            case 18696: {
                bhz_2.dWn().dWF().dWb();
                return false;
            }
            case 19972: {
                dbu_0 dbu_03 = (dbu_0)aam_22;
                bhz_2.dWn().dWF().a(dbu_03.fbg());
                return false;
            }
            case 16728: {
                bhz_2.dWn().dWF().dWa();
                return false;
            }
            case 19632: {
                bhz_2.dWn().dWF().dWc();
                return false;
            }
            case 18492: {
                dbu_0 dbu_04 = (dbu_0)aam_22;
                bhz_2.dWn().dWF().b(dbu_04.fbg());
                return false;
            }
            case 18783: {
                String string5 = ((dae_0)aam_22).bCt();
                this.nSn.sN(string5.isBlank() ? null : string5).E(cwl_1.eVJ());
                this.Ns(bhz_2.dWn().dWy().dXw());
                return false;
            }
            case 19616: {
                this.Ns(bhz_2.dWn().dWy().dXt());
                return false;
            }
            case 18307: {
                this.Ns(bhz_2.dWn().dWy().dXu());
                return false;
            }
            case 17883: {
                dbu_0 dbu_05 = (dbu_0)aam_22;
                cwl_1.a(this.nSn, dbu_05.fbg());
                this.Ns(this.nSn.eEQ());
                return false;
            }
            case 17500: {
                bhu_1 bhu_13 = (bhu_1)((dae_0)aam_22).bCv();
                fiq_2.gCw().d(fik_2.a(string -> {
                    fiu_1.uCW.N("marketRetrieveLock", false);
                    cmB cmB2 = new cmB(bhu_13.dXb());
                    aue_0.cVJ().etu().d(cmB2);
                }).l("market.removeItemConfirmation", new Object[0]).vG(ccp_2.mRE.byf()));
                return false;
            }
            case 17195: {
                dbu_0 dbu_06 = (dbu_0)aam_22;
                cwl_1.a(this.nSo, dbu_06.fbg());
                this.Nt(this.nSo.eEQ());
                return false;
            }
            case 17734: {
                fiu_1.uCW.N("marketRetrieveLock", false);
                aue_0.cVJ().etu().d(new cma());
                return false;
            }
            case 17931: {
                cwl_1.a("marketSoldItemsDetailDialog", () -> this.Nt(0));
                return false;
            }
            case 19875: {
                this.Nt(bhz_2.dWn().dWz().dXt());
                return false;
            }
            case 18762: {
                this.Nt(bhz_2.dWn().dWz().dXu());
                return false;
            }
            case 17280: {
                dbu_0 dbu_07 = (dbu_0)aam_22;
                cwl_1.a(this.nSp, dbu_07.fbg());
                this.Nu(this.nSp.eEQ());
                return false;
            }
            case 19215: {
                fiu_1.uCW.N("marketRetrieveLock", false);
                bhu_1 bhu_14 = (bhu_1)((dae_0)aam_22).bCv();
                aue_0.cVJ().etu().d(new cmz_0(bhu_14.dXb()));
                return false;
            }
            case 16042: {
                fiu_1.uCW.N("marketRetrieveLock", false);
                aue_0.cVJ().etu().d(new cmz_0());
                return false;
            }
            case 17666: {
                cwl_1.a("marketExpiredEntriesDetailDialog", () -> this.Nu(0));
                return false;
            }
            case 17570: {
                this.Nu(bhz_2.dWn().dWA().dXt());
                return false;
            }
            case 18198: {
                this.Nu(bhz_2.dWn().dWA().dXu());
                return false;
            }
            case 16253: {
                if (fyw_0.gqw().to("marketOfferItemChoiceDialog")) {
                    return false;
                }
                bhz_2.dWn().dWJ().mK("");
                ccj_2.g("marketOfferItemChoiceDialog", 256L);
                return false;
            }
            case 19592: {
                dae_0 dae_08 = (dae_0)aam_22;
                bhz_2.dWn().dWJ().mK(dae_08.bCt());
                return false;
            }
            case 19182: {
                dae_0 dae_09 = (dae_0)aam_22;
                boolean bl = dae_09.bCu();
                this.kB(bl);
                if (bl) {
                    bhz_2.dWn().dWJ().o((bgv_2)dae_09.bCv());
                    fhv_1 fhv_12 = fyw_0.gqw().gqC().uR("marketDialog").uH("createOfferModeMainInnerContainer");
                    fhv_12.a(new cwm_2(this, fhv_12));
                    bdc_0.dRc().dRe();
                } else {
                    this.eVq();
                }
                if (fyw_0.gqw().to("marketOfferItemChoiceDialog")) {
                    fyw_0.gqw().tl("marketOfferItemChoiceDialog");
                }
                return false;
            }
            case 18452: {
                dae_0 dae_010 = (dae_0)aam_22;
                boolean bl = dae_010.bCu();
                boolean bl2 = dae_010.bCo() == 1;
                bhz_2.dWn().dWJ().dUQ();
                bhz_2.dWn().dWJ().hK(bl);
                if (bl2) {
                    bhz_2.dWn().dWJ().dVa().mL(null);
                    bhz_2.dWn().dWJ().a((bij_1)null);
                }
                return false;
            }
            case 17480: {
                bhz_2.dWn().dWJ().hJ(false);
                return false;
            }
            case 16917: {
                if (!bhz_2.dWn().dUR()) {
                    return false;
                }
                cwl_1.eVn();
                return false;
            }
            case 19753: {
                ffV ffV3 = (ffV)((dae_0)aam_22).bCv();
                bho_2 bho_22 = cwl_1.eVu();
                if (bho_22 == null) {
                    return false;
                }
                if (cwl_1.bK(ffV3)) {
                    return false;
                }
                bho_22.bf(ffV3);
                return false;
            }
            case 17858: {
                ffV ffV4 = (ffV)((dae_0)aam_22).bCv();
                bho_2 bho_23 = cwl_1.eVu();
                if (bho_23 == null) {
                    return false;
                }
                bho_23.bg(ffV4);
                return false;
            }
            case 16803: {
                bhz_1 bhz_12 = (bhz_1)((dae_0)aam_22).bCv();
                fse_1.gFu().f("marketOfferFulfillment", new bho_2(bhz_12));
                fey_2 fey_23 = (fey_2)ccj_2.g("marketFulfillOfferDialog", 131072L);
                fgo_2 fgo_22 = new fgo_2();
                fgo_22.a("level", new fgq_2(bho_2.jYZ));
                fgo_22.a("shards", new fgq_2(bho_2.jZa));
                fgo_22.a("quantity", new fgq_2(bho_2.jYY));
                fgo_22.gxw();
                fdq_1 fdq_12 = (fdq_1)fey_23.getElementMap().uH("selectedItemsTable");
                fdq_12.setTableModel(fgo_22);
                nSk.clear();
                cwl_1.eVv();
                return false;
            }
            case 17565: {
                bho_2 bho_24 = cwl_1.eVu();
                if (bho_24 == null || !bho_24.dVp()) {
                    return false;
                }
                cmc cmc2 = new cmc();
                cmc2.nu(bho_24.dVr().dXk().Lx());
                bho_24.n(bhp_22 -> cmc2.b(bhp_22.dVu(), bhp_22.getItem().LV(), bhp_22.oP()));
                aue_0.cVJ().etu().d(cmc2);
                fiu_1.uCW.N("marketFulfillOfferLock", false);
                return false;
            }
            case 19706: {
                bho_2 bho_25 = cwl_1.eVu();
                if (bho_25 == null) {
                    return false;
                }
                bho_25.dVo();
                return false;
            }
            case 16643: {
                String string6 = ((dae_0)aam_22).bCt();
                this.nSq.sN(string6.isBlank() ? null : string6).E(cwl_1.eVJ());
                this.Nv(bhz_2.dWn().dWB().dXw());
                return false;
            }
            case 16441: {
                this.Nv(bhz_2.dWn().dWB().dXt());
                return false;
            }
            case 18727: {
                this.Nv(bhz_2.dWn().dWB().dXu());
                return false;
            }
            case 18907: {
                dbu_0 dbu_08 = (dbu_0)aam_22;
                cwl_1.a(this.nSq, dbu_08.fbg());
                this.Nv(this.nSq.eEQ());
                return false;
            }
            case 17150: {
                bhz_1 bhz_13 = (bhz_1)((dae_0)aam_22).bCv();
                fiq_2.gCw().d(fik_2.a(string -> {
                    fiu_1.uCW.N("marketRetrieveLock", false);
                    clS clS2 = new clS(bhz_13.dXk().Lx());
                    aue_0.cVJ().etu().d(clS2);
                }).l("market.cancel.offer.confirmation", new Object[0]).vG(ccp_2.mRE.byf()));
                return false;
            }
            case 18675: {
                cwl_1.a("marketExpiredOffersDetailDialog", () -> this.Nw(0));
                return false;
            }
            case 18871: {
                this.Nw(bhz_2.dWn().dWC().dXt());
                return false;
            }
            case 16026: {
                this.Nw(bhz_2.dWn().dWC().dXu());
                return false;
            }
            case 18081: {
                dbu_0 dbu_09 = (dbu_0)aam_22;
                cwl_1.a(this.nSr, dbu_09.fbg());
                this.Nw(this.nSr.eEQ());
                return false;
            }
            case 19850: {
                fiu_1.uCW.N("marketRetrieveLock", false);
                aue_0.cVJ().etu().d(new cmw_0());
                return false;
            }
            case 16486: {
                cwl_1.a("marketPurchasedItemsDetailDialog", () -> this.Nx(0));
                return false;
            }
            case 19721: {
                this.Nx(bhz_2.dWn().dWD().dXt());
                return false;
            }
            case 18870: {
                this.Nx(bhz_2.dWn().dWD().dXu());
                return false;
            }
            case 16696: {
                dbu_0 dbu_010 = (dbu_0)aam_22;
                cwl_1.a(this.nSs, dbu_010.fbg());
                this.Nx(this.nSs.eEQ());
                return false;
            }
            case 18794: {
                fiu_1.uCW.N("marketRetrieveLock", false);
                bia_1 bia_12 = (bia_1)((dae_0)aam_22).bCv();
                cmd_0 cmd_02 = new cmd_0(bia_12.dXm());
                aue_0.cVJ().etu().d(cmd_02);
                return false;
            }
            case 16517: {
                fiu_1.uCW.N("marketRetrieveLock", false);
                aue_0.cVJ().etu().d(new cmd_0());
                return false;
            }
            case 18797: {
                this.Ny(bhz_2.dWn().dWE().dXt());
                return false;
            }
            case 19314: {
                this.Ny(bhz_2.dWn().dWE().dXu());
                return false;
            }
            case 19585: {
                dbu_0 dbu_011 = (dbu_0)aam_22;
                cwl_1.a(this.nSt, dbu_011.fbg());
                this.Ny(this.nSt.eEQ());
                return false;
            }
            case 18170: {
                this.Ny(bhz_2.dWn().dWE().GW(0));
                return false;
            }
        }
        return true;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        super.a(aye_22, bl);
        if (bl) {
            return;
        }
        aue_0.cVJ().b(czi_2.eYU());
        aie_0.cfn().bmE().a(bhm_1.jYL, true);
        fse_1.gFu().f("marketViewTab", (byte)0);
        fse_1.gFu().f("marketView", bhz_2.dWn());
        fse_1.gFu().f("marketTableModels", bhx_2.dWf());
        fse_1.gFu().f("marketEntryFilters", bhz_2.dWn().dWu());
        fse_1.gFu().f("marketOfferFilters", bhz_2.dWn().dWv());
        fse_1.gFu().f("marketViewSearchSubTab", 0);
        fse_1.gFu().f("marketViewMyOffersSubTab", 0);
        fse_1.gFu().f("marketSellItemMode", false);
        fse_1.gFu().f("marketCreateOfferMode", false);
        fse_1.gFu().f("marketSimilarSearches", bhz_2.dWn().dWF());
        fse_1.gFu().f("marketOfferCreationData", bhz_2.dWn().dWJ());
        fse_1.gFu().f("marketOfferFulfillment", (Object)null);
        fse_1.gFu().f("marketOptions", new bid_1());
        fiu_1.uCW.vN("marketSearchesLock");
        fiu_1.uCW.vN("marketSellViewLock");
        fiu_1.uCW.vN("marketFulfillOfferLock");
        fiu_1.uCW.vN("marketRetrieveLock");
        fyw_0.gqw().a(this.nSw);
        fey_2 fey_22 = (fey_2)ccj_2.g("marketDialog", 32768L);
        cwl_1.bE(fey_22);
        fyw_0.gqw().d("wakfu.market", cfp_1.class);
        cAY.eHc().nP(600012L);
        boolean bl2 = bid_1.b(bsn_1.lkK);
        bhz_2.dWn().hO(bl2);
        bhz_2.dWn().bh(null);
        bhz_2.dWn().mO("");
        if (this.nSv || !bl2) {
            this.nSl.reset();
            this.nSt.reset();
            this.nSm.reset();
            cwl_1.a(bhz_2.dWn().dWu(), this.nSl, true);
            cwl_1.a(bhz_2.dWn().dWv(), this.nSm, false);
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
        return bid_1.b(bsn_1.lkJ);
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        super.b(aye_22, bl);
        if (bl) {
            return;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 != null) {
            bgt_02.dnY();
        }
        bhz_2.dWn().hO(bid_1.b(bsn_1.lkK));
        this.eRy();
        aue_0.cVJ().a(czi_2.eYU());
        aie_0.cfn().bmE().a(bhm_1.jYL);
        cAY.eHc().nP(600013L);
        fiu_1.uCW.vO("marketSearchesLock");
        fiu_1.uCW.vO("marketSellViewLock");
        fiu_1.uCW.vO("marketFulfillOfferLock");
        fiu_1.uCW.vO("marketRetrieveLock");
        nSk.clear();
    }

    private void eRy() {
        fyw_0.gqw().b(this.nSw);
        fyw_0.gqw().tl("marketDialog");
        fyw_0.gqw().tl("marketAdvancedFiltersDialog");
        fyw_0.gqw().tl("marketAdvancedOfferFiltersDialog");
        fyw_0.gqw().tl("marketConfirmPurchaseDialog");
        fyw_0.gqw().tl("marketSoldItemsDetailDialog");
        fyw_0.gqw().tl("marketExpiredEntriesDetailDialog");
        fyw_0.gqw().tl("marketOfferItemChoiceDialog");
        fyw_0.gqw().tl("marketFulfillOfferDialog");
        fyw_0.gqw().tl("marketPurchasedItemsDetailDialog");
        fyw_0.gqw().tl("marketExpiredOffersDetailDialog");
        fyw_0.gqw().tc("wakfu.market");
    }

    private static void bE(fey_2 fey_22) {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("inventoryDialog");
        if (fhs_22 == null) {
            return;
        }
        fey_2 fey_23 = (fey_2)fhs_22.uH("equipInventWindow");
        if (fey_23 == null) {
            return;
        }
        fey_22.a(new cwn_1(fey_22, fey_23));
    }

    private static void a(String string, Runnable runnable) {
        if (fyw_0.gqw().to(string)) {
            fyw_0.gqw().tl(string);
        } else {
            ccj_2.g(string, 32768L);
            runnable.run();
        }
    }

    private static void eVm() {
        bhs_1 bhs_12 = bhz_2.dWn().dWI();
        String string2 = aum_0.cWf().c("market.sell.confirmation", bhs_12.oP(), bhs_12.getItem().getName(), bhs_12.akd(), bhs_12.akd() * (long)bhs_12.oP(), bhs_12.dWh());
        fiq_2.gCw().d(fik_2.a(string -> {
            if (!bhz_2.dWn().dVD()) {
                return;
            }
            fiu_1.uCW.N("marketSellViewLock", false);
            clQ clQ2 = new clQ();
            clQ2.ns(bhs_12.dVE().dXE().LV());
            clQ2.Ld(bhs_12.oP());
            clQ2.nt(bhs_12.akd());
            clQ2.a(bhs_12.dUX().dXx());
            aue_0.cVJ().etu().d(clQ2);
        }).vE(string2).vG(ccp_2.mRE.byf()));
    }

    private static void eVn() {
        bhi_2 bhi_22 = bhz_2.dWn().dWJ();
        String string2 = aum_0.cWf().c("market.create.offer.confirmation", bhi_22.oP(), bhi_22.duo().getName(), bhi_22.akd(), bhi_22.akd() * (long)bhi_22.oP(), bhi_22.dWh(), bhi_22.akd() * (long)bhi_22.oP() + bhi_22.dWh());
        fiq_2.gCw().d(fik_2.a(string -> {
            if (!bhz_2.dWn().dUR()) {
                return;
            }
            fiu_1.uCW.N("marketSellViewLock", false);
            clY clY2 = new clY();
            clY2.a(bhi_22.dUV());
            aue_0.cVJ().etu().d(clY2);
        }).vE(string2).vG(ccp_2.mRE.byf()));
    }

    private static void a(bhl_1 bhl_12, fiu_0 fiu_02, boolean bl) {
        bhm_2 bhm_22 = new bhm_2(true, bl ? "market.filter.only.cheapest" : "market.filter.only.most.expensive", bhl_12);
        bhl_12.a(bhm_22);
        bhm_22.b(fiu_02);
        fse_1.gFu().a((aef_2)bhl_12, "onlyExtremePrice");
        if (eIA.pH(bbs_2.xl())) {
            bhk_1 bhk_12 = new bhk_1(0, 50, bhl_12);
            bhl_12.a(bhk_12);
            bhk_12.b(fiu_02);
            fse_1.gFu().a((aef_2)bhl_12, "minLevel", "maxLevel");
        }
    }

    private void eVo() {
        this.nSt.c(fje.swU);
        this.nSt.nx(false);
        this.nSt.a(bhz_2.kbM.dXd());
        fse_1.gFu().a((aef_2)bhz_2.dWn(), "selectedHistoryElementType");
        this.nSt.a(bhz_2.kbO.dXD());
        fse_1.gFu().a((aef_2)bhz_2.dWn(), "selectedTimespan");
    }

    private void p(boolean bl, boolean bl2) {
        fse_1.gFu().f("marketSellItemMode", bl);
        if (bl) {
            bhz_2.dWn().dWt();
            if (bl2) {
                bhz_2.dWn().bh(bhz_2.dWn().dWI().getItem());
            }
        } else {
            this.eVp();
        }
    }

    private static void f(@Nullable fdu_1 fdu_12) {
        if (fdu_12 != null) {
            cwl_1.g(fdu_12);
        } else {
            abg_2.bUP().a(() -> {
                fdu_1 fdu_12;
                fhv_1 fhv_13 = fyw_0.gqw().th("marketDialog");
                fdu_1 fdu_13 = fdu_12 = fhv_13 == null ? null : (fdu_1)fhv_13.getElementRecursively(nRZ, fhv_12 -> !fhv_12.isATemplate());
                if (fdu_12 != null) {
                    cwl_1.g(fdu_12);
                }
            }, 50L, 1);
        }
    }

    private static void g(@NotNull fdu_1 fdu_12) {
        fdu_12.setFocused(true);
        if (!BH.aU(fdu_12.getText())) {
            fdu_12.setEnabled(false);
            abg_2.bUP().a(() -> {
                fdu_12.setEnabled(true);
                fdu_12.dUA();
            }, 100L, 1);
        }
    }

    private void kB(boolean bl) {
        fse_1.gFu().f("marketCreateOfferMode", bl);
        if (!bl) {
            this.eVq();
        }
    }

    public void eVp() {
        this.Ns(bhz_2.dWn().dWy().dXw());
        cwl_1.eVs();
    }

    public void eVq() {
        this.Nv(bhz_2.dWn().dWB().dXw());
        cwl_1.eVs();
    }

    public void Np(int n) {
        if (cwl_1.eVE()) {
            this.Nq(n);
        } else if (cwl_1.eVF()) {
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
        fiu_1.uCW.N("marketSearchesLock", false);
        clW clW2 = new clW(fjc.swu);
        clW2.e(this.nSl);
        aue_0.cVJ().etu().d(clW2);
    }

    public void Nr(int n) {
        this.M(n, false);
    }

    public void M(int n, boolean bl) {
        this.nSm.Wj(n);
        if (!this.nSu.as(this.nSm) && !bl) {
            return;
        }
        fiu_1.uCW.N("marketSearchesLock", false);
        clV clV2 = new clV(fjc.sww);
        clV2.e(this.nSm);
        aue_0.cVJ().etu().d(clV2);
    }

    private void eVr() {
        if (cwl_1.eVG()) {
            this.Ns(0);
        } else if (cwl_1.eVH()) {
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
        fiu_1.uCW.N("marketSearchesLock", false);
        cml cml2 = new cml(this.nSn);
        aue_0.cVJ().etu().d(cml2);
    }

    public static void eVs() {
        aue_0.cVJ().etu().d(new cmp());
    }

    public void Nt(int n) {
        this.O(n, false);
    }

    public void O(int n, boolean bl) {
        this.nSo.Wj(n);
        if (!this.nSu.as(this.nSo) && !bl) {
            return;
        }
        fiu_1.uCW.N("marketSearchesLock", false);
        cmr cmr2 = new cmr(this.nSo);
        aue_0.cVJ().etu().d(cmr2);
    }

    public void Nu(int n) {
        this.P(n, false);
    }

    public void P(int n, boolean bl) {
        this.nSp.Wj(n);
        if (!this.nSu.as(this.nSp) && !bl) {
            return;
        }
        fiu_1.uCW.N("marketSearchesLock", false);
        cmg cmg2 = new cmg(this.nSp);
        aue_0.cVJ().etu().d(cmg2);
    }

    public void Nv(int n) {
        this.Q(n, false);
    }

    public void Q(int n, boolean bl) {
        this.nSq.Wj(n);
        if (!this.nSu.as(this.nSq) && !bl) {
            return;
        }
        fiu_1.uCW.N("marketSearchesLock", false);
        cme_0 cme_02 = new cme_0(this.nSq);
        aue_0.cVJ().etu().d(cme_02);
    }

    public void Nw(int n) {
        this.R(n, false);
    }

    public void R(int n, boolean bl) {
        this.nSr.Wj(n);
        if (!this.nSu.as(this.nSr) && !bl) {
            return;
        }
        fiu_1.uCW.N("marketSearchesLock", false);
        cmi cmi2 = new cmi(this.nSr);
        aue_0.cVJ().etu().d(cmi2);
    }

    public void Nx(int n) {
        this.S(n, false);
    }

    public void S(int n, boolean bl) {
        this.nSs.Wj(n);
        if (!this.nSu.as(this.nSs) && !bl) {
            return;
        }
        fiu_1.uCW.N("marketSearchesLock", false);
        cmn cmn2 = new cmn(this.nSs);
        aue_0.cVJ().etu().d(cmn2);
    }

    private void Ny(int n) {
        this.nSt.Wj(n);
        if (!this.nSu.as(this.nSt)) {
            return;
        }
        fiu_1.uCW.N("marketSearchesLock", false);
        cmf_0 cmf_02 = new cmf_0();
        cmf_02.a(this.nSt);
        aue_0.cVJ().etu().d(cmf_02);
    }

    public static boolean bK(ffV ffV2) {
        bgt_0 bgt_02 = (bgt_0)fcI.ac(bbs_2.xl(), ffV2.LV());
        if (bgt_02 == null) {
            return true;
        }
        return cwl_1.c(ffV2, bgt_02);
    }

    public static boolean c(ffV ffV2, @NotNull exP exP2) {
        if (ffV2.adZ() && ffV2.fUY().fXu().bKa() || ffV2.fWm()) {
            return true;
        }
        if (ffV2.dwg() == fgj.siI) {
            return true;
        }
        return ffV2.dOg().a(ffj_0.sgg) != null && !ffV2.dOg().a(ffj_0.sgg).b(exP2, exP2.aZw(), ffV2, exP2.fgg());
    }

    public static void a(fiT fiT2, fje fje2) {
        fje fje3 = fiT2.fbg();
        if (fje2 == fje3) {
            fiT2.nx(!fiT2.gan());
        } else {
            fiT2.c(fje2);
            fiT2.nx(true);
            if (fje2 == fje.swQ) {
                fiT2.gK(cwl_1.eVJ().aJr());
            } else {
                fiT2.gK((byte)-1);
            }
        }
    }

    private fiu_0 eVt() {
        if (cwl_1.eVE()) {
            return this.nSl;
        }
        if (cwl_1.eVF()) {
            return this.nSm;
        }
        throw new IllegalArgumentException("Invalid sub tab: " + fse_1.gFu().dq("marketViewSearchSubTab"));
    }

    @Nullable
    private static bho_2 eVu() {
        return (bho_2)fse_1.gFu().vY("marketOfferFulfillment");
    }

    public static boolean bL(ffV ffV2) {
        if (!fyw_0.gqw().to("marketFulfillOfferDialog")) {
            return false;
        }
        bho_2 bho_22 = (bho_2)fse_1.gFu().vY("marketOfferFulfillment");
        if (bho_22 == null) {
            return false;
        }
        return bho_22.jW(ffV2.LV()) || cwl_1.a(ffV2, bho_22.dVr().dXk()) != fix_0.sup;
    }

    public static fix_0 a(ffV ffV2, mE mE2) {
        fix_0 fix_02 = nSk.get(ffV2.LV());
        if (fix_02 != null) {
            return fix_02;
        }
        fix_0 fix_03 = fiv_0.a(ffV2, mE2);
        nSk.put(ffV2.LV(), fix_03);
        return fix_03;
    }

    private static void eVv() {
        TLongHashSet tLongHashSet = fcL.rUh.sx(bbs_2.xl());
        for (long l : tLongHashSet.toArray()) {
            Object t = fcL.rUh.sw(l);
            ((exP)t).dod().M((TObjectProcedure<ffV>)((TObjectProcedure)ffV2 -> {
                fse_1.gFu().a((aef_2)ffV2, "movable");
                return true;
            }));
        }
    }

    public static void eVw() {
        if (cwl_1.eVz()) {
            fse_1.gFu().a((aef_2)bhz_2.dWn().dWI(), bhz_2.dWn().dWI().bxk());
        } else if (cwl_1.eVB()) {
            fse_1.gFu().a((aef_2)bhz_2.dWn().dWJ(), bhz_2.dWn().dWJ().bxk());
        }
    }

    public static boolean eVx() {
        return fse_1.gFu().dq("marketViewTab") == 0;
    }

    public static boolean eVy() {
        return fse_1.gFu().dq("marketViewTab") == 1;
    }

    public static boolean eVz() {
        return cwl_1.eVy() && fse_1.gFu().dp("marketSellItemMode");
    }

    public static boolean eVA() {
        return cwl_1.eVy() && !fse_1.gFu().dp("marketSellItemMode");
    }

    public static boolean eVB() {
        return cwl_1.eVy() && fse_1.gFu().dp("marketCreateOfferMode");
    }

    public static boolean eVC() {
        return cwl_1.eVy() && !fse_1.gFu().dp("marketCreateOfferMode");
    }

    public static boolean eVD() {
        return fse_1.gFu().dq("marketViewTab") == 2;
    }

    public static boolean eVE() {
        return cwl_1.eVx() && fse_1.gFu().dq("marketViewSearchSubTab") == 0;
    }

    public static boolean eVF() {
        return cwl_1.eVx() && fse_1.gFu().dq("marketViewSearchSubTab") == 1;
    }

    public static boolean eVG() {
        return cwl_1.eVy() && fse_1.gFu().dq("marketViewMyOffersSubTab") == 0;
    }

    public static boolean eVH() {
        return cwl_1.eVy() && fse_1.gFu().dq("marketViewMyOffersSubTab") == 1;
    }

    public static boolean eVI() {
        return fse_1.gFu().dq("marketViewTab") == 99;
    }

    public static Mv eVJ() {
        Mv mv = aum_0.cWf().aUXX();
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

