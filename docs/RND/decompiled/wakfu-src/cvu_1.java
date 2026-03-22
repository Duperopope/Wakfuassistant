/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.set.hash.TIntHashSet;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cVU
 */
public class cvu_1
implements adi_1 {
    protected static final Logger nRb = Logger.getLogger(cvu_1.class);
    private static final cvu_1 nRc = new cvu_1();
    public static final int nRd = 30;
    final ArrayList<String> nRe = new ArrayList();
    String nRf;
    @Nullable
    private Bu<Integer, Boolean> nRg;
    private alx_2 ikv;

    public static cvu_1 eUX() {
        return nRc;
    }

    private void clean() {
        for (String string : this.nRe) {
            fyw_0.gqw().tl(string);
        }
        this.nRe.clear();
    }

    @Override
    public boolean b(aam_2 aam_22) {
        if (aue_0.cVJ().cVO().zV(aam_22.d())) {
            return false;
        }
        switch (aam_22.d()) {
            case 16776: {
                ama_1 ama_12 = (ama_1)aam_22;
                int n = ama_12.bCo();
                if (new Bu<Integer, Boolean>(n, false).equals(this.nRg) && fyw_0.gqw().to("craftLinkedRecipeDialog")) {
                    fyw_0.gqw().tl("craftLinkedRecipeDialog");
                    this.nRg = null;
                    return false;
                }
                eki_0 eki_02 = baj_2.hzf.cZr();
                ArrayList<Integer> arrayList = new ArrayList<Integer>(bmi_2.iDE.a(n, eki_02));
                arrayList.sort(Integer::compareTo);
                if (arrayList.isEmpty()) {
                    return false;
                }
                this.nRg = new Bu<Integer, Boolean>(n, false);
                cte_2.eQC().MJ(n);
                return false;
            }
            case 19505: {
                ama_1 ama_13 = (ama_1)aam_22;
                ArrayList<bmk_2> arrayList = new ArrayList<bmk_2>();
                int n = ama_13.bCo();
                if (new Bu<Integer, Boolean>(n, true).equals(this.nRg) && fyw_0.gqw().to("craftLinkedRecipeDialog")) {
                    fyw_0.gqw().tl("craftLinkedRecipeDialog");
                    this.nRg = null;
                    return false;
                }
                eKQ.qEb.q(eKW2 -> {
                    bmk_2 bmk_22 = new bmk_2(eKW2.d(), n);
                    if (bmk_22.dwo()) {
                        bmk_22.Ek(n);
                        bmk_22.gB(true);
                    }
                    if (bmk_22.dxk()) {
                        arrayList.add(bmk_22);
                    }
                });
                if (arrayList.isEmpty()) {
                    String string = aum_0.cWf().c("unknown.recipe", new Object[0]);
                    byj_1.epo().a(byc_1.c(byh_1.lAG, string));
                    return false;
                }
                this.nRg = new Bu<Integer, Boolean>(n, true);
                cte_2.eQC().b(n, arrayList);
                return false;
            }
            case 19644: {
                dbm_0 dbm_02 = (dbm_0)aam_22;
                bEq bEq2 = (bEq)dbm_02.dRY();
                String string = dbm_02.eZJ();
                if (bEq2 == null) {
                    if (string == null) {
                        return false;
                    }
                    fyw_0.gqw().tl(string);
                    if (this.nRe.isEmpty()) {
                        aue_0.cVJ().b(this);
                    }
                    return false;
                }
                String string2 = "setDetailDialog";
                String string3 = "setDetailDialog_" + bEq2.aIi();
                this.a(dbm_02, bEq2, string, "setDetailDialog", string3, dbm_02.faR());
                return false;
            }
            case 18746: 
            case 19685: 
            case 19865: {
                dbo_0 dbo_02 = (dbo_0)aam_22;
                bjg_0 bjg_02 = (bjg_0)dbo_02.dRY();
                if (bjg_02 == null) {
                    nRb.error((Object)"Impossible de r\u00e9cup\u00e9rer le familier \u00e0 d\u00e9crire");
                    return false;
                }
                String string = dbo_02.eZJ();
                if (aam_22.d() == 19685) {
                    this.a(dbo_02, bjg_02, string, "itemDetailDialogLocal", this.a(bjg_02.eae(), true, dbo_02.faR()), dbo_02.faR());
                } else if (aam_22.d() == 18746) {
                    this.b(dbo_02, bjg_02, string, "itemDetailDialog", this.a(bjg_02.eae(), false, dbo_02.faR()), dbo_02.faR());
                } else {
                    cvu_1.qO(this.a(bjg_02.eae(), false, dbo_02.faR()));
                    cvu_1.qO(this.a(bjg_02.eae(), true, dbo_02.faR()));
                }
                return false;
            }
            case 17329: {
                dbG dbG2 = (dbG)aam_22;
                bmv_1 bmv_12 = (bmv_1)dbG2.dRY();
                String string = dbG2.eZJ();
                if (bmv_12 == null) {
                    if (string == null) {
                        return false;
                    }
                    fyw_0.gqw().tl(string);
                    if (this.nRe.isEmpty()) {
                        aue_0.cVJ().b(this);
                    }
                    return false;
                }
                bgv_2 bgv_22 = bmv_12.dxB();
                int n = bgv_22 != null ? bgv_22.d() : -1;
                String string4 = "craftItemDetailDialog";
                String string5 = "craftItemDetailDialog_" + n;
                this.a(dbG2, bmv_12, string, "craftItemDetailDialog", string5, dbG2.faR());
                return false;
            }
            case 16264: 
            case 16369: 
            case 19714: {
                boolean bl;
                dbk_0 dbk_02 = (dbk_0)aam_22;
                ffV ffV2 = (ffV)dbk_02.dRY();
                String string = dbk_02.eZJ();
                if (ffV2 == null) {
                    if (string == null) {
                        return false;
                    }
                    fyw_0.gqw().tl(string);
                    if (this.nRe.isEmpty()) {
                        aue_0.cVJ().b(this);
                    }
                    return false;
                }
                bha_2 bha_22 = null;
                if (ffV2.pe()) {
                    ffV2 = ffV2.fVU();
                    bha_22 = new bha_2(ffV2);
                }
                String string6 = "itemDetailDialog_" + ffV2.LV() + String.valueOf(dbk_02.faR() ? Character.valueOf('h') : "");
                String string7 = "itemDetailDialogLocal_" + ffV2.LV() + String.valueOf(dbk_02.faR() ? Character.valueOf('h') : "");
                if (aam_22.d() == 16264) {
                    bl = this.a(dbk_02, ffV2, string, "itemDetailDialogLocal", string7, dbk_02.faR());
                } else if (aam_22.d() == 16369) {
                    this.b(dbk_02, ffV2, string, "itemDetailDialog", string6, dbk_02.faR());
                    bl = true;
                } else {
                    cvu_1.qO(string6);
                    cvu_1.qO(string7);
                    bl = false;
                }
                if (bl && bha_22 != null) {
                    fse_1.gFu().a("itemLevelController", (Object)bha_22, fyw_0.gqw().gqC().uR(string6), true);
                }
                return false;
            }
            case 16135: {
                bgt_0 bgt_02 = cvo_2.daL();
                if (bgt_02.djU()) {
                    return false;
                }
                if (fug_0.fP(bgt_02.fhv())) {
                    nRb.warn((Object)("Cannot move items between heroes with occupation " + String.valueOf(bgt_02.dps())));
                    return false;
                }
                dbl_0 dbl_02 = (dbl_0)aam_22;
                bgl_0 bgl_02 = dbl_02.getDestinationCharacter();
                long l = dbl_02.getDestinationUniqueId();
                if (bgl_02 == null) {
                    bgl_02 = bwa_0.jwi.aj((bhJ)fcI.ab(aue_0.cVJ().cVK().Xi(), l));
                }
                bgl_0 bgl_03 = dbl_02.getSourceCharacter();
                bgt_0 bgt_03 = (bgt_0)fcL.rUh.sw(bgl_03.dcP().Sn());
                ffV ffV3 = dbl_02.getItem();
                short s = dbl_02.getDestinationPosition();
                if (bgl_02 != null && bgl_03 != null && !bgl_03.equals(bgl_02)) {
                    long l2 = ffV3.LV();
                    if (!bgl_02.aXd() && !bgl_03.aXd()) {
                        ffV ffV4;
                        if (!cvu_1.b(bgt_03, ffV3)) {
                            aPd.e("item.error.badBind", new Object[0]);
                            return false;
                        }
                        bgy bgy2 = bgl_02.dcP();
                        fft_0 fft_02 = bgy2.dod();
                        ffs_0 ffs_02 = fft_02.sY(l);
                        if (ffs_02 != null && (ffV4 = ffs_02.eQ(s)) != null && bgl_03.Sn() != bgl_02.Sn() && !cvu_1.b(bgy2, ffV4)) {
                            aPd.e("item.error.badBind", new Object[0]);
                            return false;
                        }
                        bgt_03.a(ffV3, dbl_02.bfd(), s, dbl_02.getSourceUniqueId(), l);
                    }
                } else {
                    bgt_03.a(ffV3, dbl_02.bfd(), s, dbl_02.getSourceUniqueId(), l);
                }
                if (fyw_0.gqw().to("splitStackDialog")) {
                    fyw_0.gqw().tl("splitStackDialog");
                }
                fse_1.gFu().a((aef_2)aue_0.cVJ().cVK(), "actorEquipment");
                return false;
            }
            case 19521: {
                dbl_0 dbl_03 = (dbl_0)aam_22;
                clt_0 clt_02 = new clt_0(dbl_03.getItem().avr(), dbl_03.getDestinationCharacter().dcP().Sn());
                ayf_2 ayf_22 = aue_0.cVJ().etu();
                if (ayf_22 != null) {
                    ayf_22.d(clt_02);
                }
                return false;
            }
            case 16935: {
                dbl_0 dbl_04 = (dbl_0)aam_22;
                bgl_0 bgl_04 = dbl_04.getDestinationCharacter();
                ffV ffV5 = dbl_04.getItem();
                cvu_1.a(bgl_04, ffV5);
                return false;
            }
            case 17805: {
                dcu dcu2 = (dcu)aam_22;
                bgt_0 bgt_04 = cvo_2.daL();
                bgt_0 bgt_05 = bvz_0.dLl();
                if (bgt_05 != null && bgt_05.doP()) {
                    aPd.e("action.error.cantWhileDead", new Object[0]);
                    return false;
                }
                ffV ffV6 = dcu2.getItem();
                if (ffV6 == null || !ffV6.fAu()) {
                    return false;
                }
                if (aue_0.cVJ().c(czj_2.eYW()) && czj_2.eYW().getItem() == ffV6) {
                    aue_0.cVJ().b(czj_2.eYW());
                    return false;
                }
                fhc_0 fhc_02 = ffV6.dOg();
                switch (((bgv_2)fhc_02).dUu()) {
                    case jOD: {
                        this.a(bgt_04, ffV6, fhc_02);
                        break;
                    }
                    case jOF: 
                    case jOE: {
                        czj_2.eYW().y(ffV6);
                        czj_2.eYW().bW(bgt_04);
                        aue_0.cVJ().a(czj_2.eYW());
                        break;
                    }
                }
                return false;
            }
            case 17503: {
                ama_1 ama_14 = (ama_1)aam_22;
                long l = ama_14.bCp();
                bgt_0 bgt_06 = (bgt_0)fcI.ac(aue_0.cVJ().cVK().Xi(), l);
                bkb_0 bkb_02 = bgt_06.dps();
                if (bkb_02 != null && bkb_02.dsm() == 24) {
                    return false;
                }
                ffV ffV7 = bgt_06.dno().tb(l);
                if (ffV7 == null) {
                    return false;
                }
                short s = ffV7.dOg().dpq();
                bEq bEq3 = bEr.dSi().bW(s);
                if (bEq3 == null) {
                    nRb.warn((Object)"On essaye de merger un itemSet inexistant");
                    return false;
                }
                if (!fgn_0.d(bEq3)) {
                    nRb.warn((Object)("Le set d'id=" + s + " n'est pas mergeable."));
                    return false;
                }
                boolean bl = fgn_0.a((exP)bgt_06, (ffa_0<? extends fhc_0>)bEq3, true);
                if (bl) {
                    clr_0 clr_02 = new clr_0();
                    clr_02.cC(s);
                    clr_02.db(bgt_06.Sn());
                    aue_0.cVJ().etu().d(clr_02);
                }
                return false;
            }
            case 19350: {
                dae_0 dae_02 = (dae_0)aam_22;
                clw_0 clw_02 = new clw_0();
                clw_02.mZ(dae_02.bCp());
                aue_0.cVJ().etu().d(clw_02);
                return false;
            }
        }
        return true;
    }

    private static void a(bgl_0 bgl_02, ffV ffV2) {
        bgt_0 bgt_02 = (bgt_0)fcL.rUh.sw(bgl_02.dcP().Sn());
        if (bgt_02.dkZ() != null || bsl_0.jfZ.dFs()) {
            return;
        }
        if (bgt_02.a(ezj_0.ptO)) {
            ape_0.a(ezj_0.ptO);
            return;
        }
        if (ffV2 != null && ffV2.dOg().a(ffj_0.sgf) != null && ffV2.dOg().a(ffj_0.sgj) != null && !ffV2.dOg().a(ffj_0.sgf).b(bgt_02, bgt_02.aZw(), ffV2, bgt_02.fgg()) && !ffV2.dOg().a(ffj_0.sgj).b(bgt_02, bgt_02.aZw(), ffV2, bgt_02.fgg())) {
            bgz_2.bd(ffV2);
            return;
        }
        if (bdq_0.dRC().ab(ffV2)) {
            String string2 = aum_0.cWf().c("inventory.delete.locked.item", new Object[0]);
            byj_1.epo().a(byc_1.c(byh_1.lAA, string2));
            return;
        }
        fiq_2.gCw().d(new fik_2().l("question.deleteItem", ffV2.getName()).vG(ccp_2.mRF.byf()).a(fil_2.gCo()).a(fil_2.gCn().c(string -> {
            clk_0 clk_02 = new clk_0();
            clk_02.nb(ffV2.LV());
            aue_0.cVJ().etu().d(clk_02);
            fse_1.gFu().b("itemDetail", (Object)null, "inventoryDialog");
            fse_1.gFu().b("itemDetail", (Object)null, "heroBuildDialog");
            fse_1.gFu().b("pet", null, (Object)"inventoryDialog");
        })));
    }

    private void a(bgt_0 bgt_02, ffV ffV2, fhc_0 fhc_02) {
        if (fhc_02.fUZ() == null && ffV2.iterator().hasNext()) {
            int n = ffV2.avr();
            boolean bl = this.Nm(n);
            if (bl) {
                this.b(ffV2, bgt_02);
            } else {
                this.bJ(ffV2);
            }
        }
        if (!cvu_1.a(bgt_02, ffV2, bgt_02.eap())) {
            return;
        }
        bfc_1 bfc_12 = (bfc_1)ffV2.dOg().fUZ();
        if (bfc_12 instanceof bfn_1) {
            return;
        }
        aPd.f("chat.item.selfUse", aPe.a(ffV2));
    }

    public static boolean b(bgy bgy2, ffV ffV2) {
        if (ffV2.fWm() && ffV2.fUY().fXu().fXx()) {
            return false;
        }
        ang_2 ang_22 = ffV2.dOg().a(ffj_0.sgg);
        return ang_22 == null || ang_22.b(bgy2, fcI.sk(bgy2.Xi()), ffV2, bgy2.fgg());
    }

    private boolean Nm(int n) {
        cvy_1[] cvy_1Array = cvy_1.values();
        for (int i = 0; i < cvy_1Array.length; ++i) {
            cvy_1 cvy_12 = cvy_1Array[i];
            if (n != cvy_12.nRq) continue;
            return true;
        }
        return false;
    }

    private void b(ffV ffV2, bgt_0 bgt_02) {
        String string2;
        int n = ffV2.avr();
        boolean bl = false;
        TIntHashSet tIntHashSet = new TIntHashSet();
        cvy_1 cvy_12 = cvy_1.Nn(n);
        if (cvy_12 == null) {
            this.bJ(ffV2);
            return;
        }
        int[] nArray = cvy_12.nRr;
        for (int i = 0; i < nArray.length; ++i) {
            int n2 = nArray[i];
            if (!bgt_02.kW(n2)) continue;
            bl = true;
            tIntHashSet.add(n2);
        }
        if (!bl || tIntHashSet.isEmpty()) {
            this.bJ(ffV2);
            return;
        }
        if (tIntHashSet.size() == 1) {
            String string3 = aum_0.cWf().a(8, (long)tIntHashSet.toArray()[0], new Object[0]);
            string2 = aum_0.cWf().c("question.willUnapplyState", string3);
        } else {
            String string4 = aum_0.cWf().a(8, (long)tIntHashSet.toArray()[0], new Object[0]);
            String string5 = aum_0.cWf().a(8, (long)tIntHashSet.toArray()[1], new Object[0]);
            string2 = aum_0.cWf().c("question.willUnapplyState.2", string4, string5);
        }
        fiq_2.gCw().d(fik_2.a(string -> this.bJ(ffV2)).vE(string2).vG(ccp_2.mRE.byf()).abQ(1));
    }

    private void bJ(ffV ffV2) {
        cja_0 cja_02 = new cja_0();
        cja_02.mZ(ffV2.LV());
        aue_0.cVJ().etu().d(cja_02);
    }

    public static boolean a(bgy bgy2, ffV ffV2, acd_1 acd_12) {
        bfc_1 bfc_12 = (bfc_1)ffV2.dOg().fUZ();
        if (bfc_12 != null && !bgy2.djT()) {
            bqm_0.jbp.b(new brw(ffV2.dOg()));
            bfc_12.U(acd_12);
            return bfc_12.aR(ffV2) && bfc_12.aQ(ffV2);
        }
        return false;
    }

    private boolean a(dbE dbE2, Object object, String string, String string2, String string3, boolean bl) {
        if (!fyw_0.gqw().to(string3) && this.nRe.size() < 30) {
            this.b(dbE2, object, string, string2, string3, bl);
            return true;
        }
        cvu_1.qO(string3);
        return false;
    }

    private static void qO(String string) {
        if (fyw_0.gqw().to(string)) {
            fyw_0.gqw().tl(string);
        }
    }

    private void b(dbE dbE2, Object object, String string, String string2, String string3, boolean bl) {
        fey_2 fey_22;
        if (fyw_0.gqw().to(string3) || this.nRe.size() >= 30) {
            return;
        }
        fto_2 fto_22 = new fto_2();
        fto_22.wl(string3).wk(ccj_2.pe(string2));
        if (string == null) {
            fey_22 = (fey_2)fyw_0.gqw().a(fto_22.gGY());
            fey_22.a(new cvv_1(this, fey_22, dbE2));
        } else {
            fto_22.wm(this.nRf == null ? string : this.nRf).wn(string).wo(string2);
            fey_22 = (fey_2)fyw_0.gqw().a(fto_22.gGY());
        }
        this.nRf = string3;
        if (bl) {
            fse_1.gFu().f("itemPopupDetail", object);
        } else {
            fse_1.gFu().a("itemDetail", object, fey_22.getElementMap(), true);
        }
        this.nRe.add(string3);
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.ikv = new cvw_1(this);
            fyw_0.gqw().a(this.ikv);
            fyw_0.gqw().d("wakfu.itemDetails", cfg_2.class);
            cdv_0.euj().d(this);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.nRf = null;
            this.nRe.clear();
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tc("wakfu.itemDetails");
            this.clean();
            cdv_0.euj().e(this);
        }
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    public String a(long l, boolean bl, boolean bl2) {
        if (bl) {
            return "itemDetailDialogLocal_" + l + (bl2 ? "h" : "");
        }
        return "itemDetailDialog_" + l + (bl2 ? "h" : "");
    }
}

