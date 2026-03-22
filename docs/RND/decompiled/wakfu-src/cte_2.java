/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cTE
 */
public class cte_2
implements adi_1,
ekz_0 {
    protected static final Logger nJP = Logger.getLogger(cte_2.class);
    private static final cte_2 nJQ = new cte_2();
    public static final int nJR = 25;
    private final alx_2 nJS = string -> {
        if (string.equals("craftDialog")) {
            aue_0.cVJ().b(nJQ);
        }
    };
    private final alx_2 nJT = string -> {
        if (string.equals("craftLinkedRecipeDialog")) {
            if (cte_2.eQE()) {
                fyw_0.gqw().tc("wakfu.crafts");
            }
            fse_1.gFu().vX("linkedRecipes");
            fse_1.gFu().vX("linkedRecipesItemName");
            fyw_0.gqw().b(this.nJT);
        }
    };
    private static final alx_2 nJU = string -> {
        if (string.equals("harvestZoneLinkedDialog")) {
            if (cte_2.eQE()) {
                fyw_0.gqw().tc("wakfu.crafts");
            }
            fyw_0.gqw().b(nJU);
        }
    };
    private final Map<Integer, Boolean> nJV = new HashMap<Integer, Boolean>();
    private final Map<Integer, Integer> nJW = new HashMap<Integer, Integer>();
    private final Map<Integer, Integer> nJX = new HashMap<Integer, Integer>();
    @Nullable
    private Integer nJY;

    public static cte_2 eQC() {
        return nJQ;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02.dnZ().aJG()) {
            aue_0.cVJ().b(this);
            return;
        }
        if (fse_1.gFu().getProperty("isArtisanRegistered") == null) {
            eki_0 eki_02 = bgt_02.dpK();
            fse_1.gFu().f("isArtisanRegistered", eki_02.fym());
        }
        fyw_0.gqw().a(this.nJS);
        bgt_02.dpK().a(this);
        this.eQF();
        ccj_2.g("craftDialog", 32768L);
        this.eQD();
        cAY.eHc().nP(600057L);
        if (!fyw_0.gqw().tb("wakfu.crafts")) {
            fyw_0.gqw().d("wakfu.crafts", ceh_2.class);
        }
        this.nJY = null;
    }

    public void eQD() {
        int n = ((bsg_1)aie_0.cfn().bmH()).d(bsn_1.ljF);
        this.MI(n);
    }

    public void MI(int n) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        eki_0 eki_02 = bgt_02.dpK();
        bmf_2 bmf_22 = n == -1 || !eki_02.tX(n) ? bgt_02.dnZ().dwy() : bgt_02.dnZ().Ei(n);
        bme_2 bme_22 = bmf_22.dwp() ? bme_2.iCp : bme_2.iCo;
        bmf_22.a(bme_22);
        fse_1.gFu().f("craftDisplayType", bme_22.aJr());
        fse_1.gFu().b("craft", bmf_22, "craftDialog");
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bgt_02.dpK().b(this);
        bmf_2 bmf_22 = (bmf_2)fse_1.gFu().aW("craft", "craftDialog");
        if (bmf_22 != null) {
            bmf_22.dxg();
        }
        fse_1.gFu().vX("isArtisanRegistered");
        fyw_0.gqw().tl("craftDialog");
        fyw_0.gqw().b(this.nJS);
        if (cte_2.eQE()) {
            fyw_0.gqw().tc("wakfu.crafts");
        }
        cAY.eHc().nP(600013L);
    }

    public static boolean eQE() {
        return !aue_0.cVJ().c(csk_1.nFj) && !aue_0.cVJ().c(nJQ) && !aue_0.cVJ().c(ctg_1.eQG()) && !fyw_0.gqw().to("recipeViewDialog") && !fyw_0.gqw().to("craftLinkedRecipeDialog") && !fyw_0.gqw().to("harvestZoneLinkedDialog");
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 17051: {
                ama_1 ama_12 = (ama_1)aam_22;
                int n = ama_12.bCo();
                this.MI(n);
                return false;
            }
            case 18534: {
                bmf_2 bmf_22 = ((dal_0)aam_22).fag();
                bme_2 bme_22 = bme_2.bt((byte)fse_1.gFu().dq("craftDisplayType"));
                switch (bme_22) {
                    case iCp: {
                        if (bmf_22.dwp()) break;
                        bme_22 = bme_2.iCo;
                        break;
                    }
                    case iCo: {
                        if (bmf_22.dwo()) break;
                        bme_22 = bme_2.iCp;
                    }
                }
                fse_1.gFu().f("craftDisplayType", bme_22.aJr());
                bmf_2 bmf_23 = (bmf_2)fse_1.gFu().aW("craft", "craftDialog");
                bmf_22.a(bmf_23);
                bmf_22.dxa();
                fse_1.gFu().b("craft", bmf_22, "craftDialog");
                bmf_22.a(bme_22);
                ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_1.ljF, bmf_22.dwk());
                return false;
            }
            case 18466: {
                bmw_1 bmw_12 = aue_0.cVJ().cVK().dnZ();
                bsn_1 bsn_12 = bsn_1.ljZ;
                boolean bl = ((bsg_1)aie_0.cfn().bmH()).a(bsn_12);
                ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_12, !bl);
                fse_1.gFu().a((aef_2)bmw_12, "allByPreferences", "isCraftSorted");
                return false;
            }
            case 19760: {
                bmf_2 bmf_24 = (bmf_2)((ama_1)aam_22).bCv();
                if (bmf_24 == null) {
                    return false;
                }
                if (this.nJV.remove(bmf_24.dwk()) == null) {
                    this.nJV.put(bmf_24.dwk(), !bmf_24.dwl());
                }
                this.eQF();
                return false;
            }
            case 19888: {
                bmf_2 bmf_25 = (bmf_2)((ama_1)aam_22).bCv();
                int n = ((ama_1)aam_22).bCo();
                if (bmf_25 == null) {
                    return false;
                }
                eki_0 eki_02 = bmf_25.cZr();
                short s = eki_02.PG(bmf_25.dwk());
                if (n > s) {
                    n = s;
                }
                if (!this.nJX.containsKey(bmf_25.dwk())) {
                    this.nJX.put(bmf_25.dwk(), bmf_25.dwm());
                }
                this.nJW.put(bmf_25.dwk(), n);
                this.eQF();
                return false;
            }
            case 17795: {
                bgt_0 bgt_02 = aue_0.cVJ().cVK();
                cjp_0 cjp_02 = new cjp_0(bgt_02.Sn());
                this.nJV.forEach(cjp_02::E);
                this.nJW.forEach(cjp_02::et);
                this.ag(bgt_02);
                aue_0.cVJ().etu().d(cjp_02);
                this.eQF();
                return false;
            }
            case 18745: {
                this.nJW.clear();
                this.nJV.clear();
                this.eQF();
                return false;
            }
            case 18458: {
                bgt_0 bgt_03 = aue_0.cVJ().cVK();
                this.d(bgt_03, ((ama_1)aam_22).bCu());
                this.eQF();
                return false;
            }
        }
        return true;
    }

    private void d(bgt_0 bgt_02, boolean bl) {
        cjo_0 cjo_02 = new cjo_0(bgt_02.Sn(), bl);
        aue_0.cVJ().etu().d(cjo_02);
        this.nJW.clear();
        this.nJV.clear();
        eki_0 eki_02 = bgt_02.dpK();
        eki_02.lF(bl);
        fse_1.gFu().f("isArtisanRegistered", bl);
    }

    private void ag(bgt_0 bgt_02) {
        eki_0 eki_02 = bgt_02.dpK();
        this.nJV.forEach(eki_02::Z);
        this.nJW.forEach(eki_02::fu);
        this.nJW.clear();
        this.nJV.clear();
        fse_1.gFu().a((aef_2)bgt_02.dnZ(), "allByPreferences");
    }

    private void eQF() {
        boolean bl = this.nJV.isEmpty() && this.nJW.isEmpty();
        fse_1.gFu().f("artisansBookHasChanges", !bl);
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    public void MJ(int n) {
        ArrayList<bmk_2> arrayList = new ArrayList<bmk_2>();
        int[] nArray = new int[]{0};
        eKQ.qEb.q(eKW2 -> {
            bmk_2 bmk_22 = new bmk_2(eKW2.d(), n);
            if (bmk_22.dwo()) {
                bmk_22.Ej(n);
                bmk_22.gB(true);
            }
            if (bmk_22.dxk()) {
                arrayList.add(bmk_22);
                nArray[0] = nArray[0] + bmk_22.dwP().size();
            }
        });
        if (nArray[0] > 25) {
            for (bmk_2 bmk_22 : arrayList) {
                bmk_22.gB(false);
            }
        }
        this.b(n, arrayList);
    }

    public void b(int n, Collection<bmk_2> collection) {
        boolean bl = aue_0.cVJ().c(this);
        fse_1.gFu().f("linkedRecipes", collection);
        fse_1.gFu().f("linkedRecipesItemName", aum_0.cWf().a(15, (long)n, new Object[0]));
        if (fyw_0.gqw().to("craftLinkedRecipeDialog")) {
            fhv_1 fhv_12 = fyw_0.gqw().th("craftLinkedRecipeDialog");
            if (fhv_12 instanceof fey_2) {
                ((fey_2)fhv_12).gvm();
            }
        } else {
            fyw_0.gqw().a(this.nJT);
            if (bl) {
                fyw_0.gqw().a("craftLinkedRecipeDialog", ccj_2.pe("craftLinkedRecipeDialog"), "craftDialog", "craftDialog", "craftLinkedRecipeDialog");
            } else {
                ccj_2.g("craftLinkedRecipeDialog", 32768L);
                fyw_0.gqw().d("wakfu.crafts", ceh_2.class);
            }
        }
    }

    public void MK(int n) {
        bmq_1 bmq_12;
        if (Objects.equals(this.nJY, n) && fyw_0.gqw().to("harvestZoneLinkedDialog")) {
            fyw_0.gqw().tl("harvestZoneLinkedDialog");
        }
        if ((bmq_12 = bmo_2.iEv.En(n)) == null) {
            return;
        }
        this.a(bmq_12.ccu(), bmq_12.dwe());
        this.nJY = n;
    }

    public void a(int n, bmr_2 bmr_22) {
        Object object;
        boolean bl = bmr_22 == bmr_2.iBj;
        ArrayList<Integer> arrayList = bl ? bzt_2.lEV.JQ(n) : bzt_2.lEV.JR(n);
        HashMap<Long, bmm_2> hashMap = new HashMap<Long, bmm_2>();
        for (Integer object22 : arrayList) {
            bmm_2 bmm_22;
            String string;
            object = fpk.sNF.Yn(object22);
            if (object == null) continue;
            long l = ((foM)object).aqZ();
            if (!hashMap.containsKey(l)) {
                string = aum_0.cWf().a(77, l, new Object[0]);
                bmm_22 = new bmm_2(string);
                hashMap.put(l, bmm_22);
            } else {
                bmm_22 = (bmm_2)hashMap.get(l);
            }
            string = aum_0.cWf().a(66, (long)object22.intValue(), new Object[0]);
            bmm_22.b(new bml_2(object22, ((foM)object).aqZ(), string));
        }
        ArrayList arrayList2 = new ArrayList(hashMap.values());
        cte_2.aw(arrayList2);
        fse_1.gFu().f("linkedZones", arrayList2);
        String string = aum_0.cWf().a(bl ? 12 : 38, (long)n, new Object[0]);
        fse_1.gFu().f("linkedZonesItemName", string);
        if (fyw_0.gqw().to("harvestZoneLinkedDialog")) {
            object = (fey_2)fyw_0.gqw().th("harvestZoneLinkedDialog");
            ((fey_2)object).gvm();
        } else {
            fyw_0.gqw().a(nJU);
            if (aue_0.cVJ().c(nJQ)) {
                fyw_0.gqw().a("harvestZoneLinkedDialog", ccj_2.pe("harvestZoneLinkedDialog"), "craftDialog", "craftDialog", "harvestZoneLinkedDialog");
            } else {
                ccj_2.g("harvestZoneLinkedDialog", 32768L);
                fyw_0.gqw().d("wakfu.crafts", ceh_2.class);
            }
        }
    }

    private static void aw(List<bmm_2> list) {
        list.sort((bmm_22, bmm_23) -> {
            String string = bmm_22.getName();
            String string2 = bmm_23.getName();
            return BH.i(string, string2);
        });
        for (bmm_2 bmm_24 : list) {
            bmm_24.dxs();
        }
    }

    @Override
    public void d(@NotNull eKW eKW2) {
        fse_1.gFu().a((aef_2)aue_0.cVJ().cVK().dnZ(), "craftsByLevel");
    }

    @Override
    public void t(int n, long l) {
        fse_1.gFu().a((aef_2)aue_0.cVJ().cVK().dnZ(), "craftsByLevel");
    }

    @Override
    public void Ef(int n) {
        bms_1 bms_12 = (bms_1)fse_1.gFu().aW("craft", "craftDialog");
        if (bms_12 != null && n == bms_12.dwk()) {
            fse_1.gFu().a((aef_2)bms_12, "grossResourceCount", "endResourceCount", "seedCount", "recipeCount", "currentXpPercentage", "level", "levelText");
        }
    }

    @Override
    public void du(int n, int n2) {
    }

    public void f(flp_2 flp_22) {
        boolean bl;
        Optional<fsf_1> optional = Optional.ofNullable(fse_1.gFu().getProperty("craftDisplayType"));
        boolean bl2 = bl = !optional.isPresent() || ((Byte)optional.get().getValue()).byteValue() == bme_2.iCq.aJr();
        if (bl) {
            return;
        }
        int n = flp_22.gEo();
        boolean bl3 = n < 0;
        bmw_1 bmw_12 = aue_0.cVJ().cVK().dnZ();
        List<bms_1> list = bmw_12.dwA();
        if (list.isEmpty()) {
            return;
        }
        bms_1 bms_12 = (bms_1)fse_1.gFu().aW("craft", "craftDialog");
        if (bms_12 == null) {
            return;
        }
        int n2 = -1;
        for (int i = 0; i < list.size(); ++i) {
            bms_1 bms_13 = list.get(i);
            if (bms_13.dwk() != bms_12.dwk()) continue;
            n2 = i;
            break;
        }
        if (n2 == -1) {
            return;
        }
        if (bl3 && n2 == 0) {
            return;
        }
        if (!bl3 && n2 >= list.size() - 1) {
            return;
        }
        bms_1 bms_14 = list.get(n2 + (bl3 ? -1 : 1));
        if (bms_14 == null || bms_14.dwn()) {
            return;
        }
        this.MI(bms_14.dwk());
    }

    public void g(flp_2 flp_22) {
        boolean bl;
        int n = fse_1.gFu().dq("craftDisplayType");
        boolean bl2 = bl = (byte)n == bme_2.iCq.aJr();
        if (bl) {
            return;
        }
        int n2 = flp_22.gEo();
        if (n2 == 0) {
            return;
        }
        boolean bl3 = n2 < 0;
        bmf_2 bmf_22 = (bmf_2)fse_1.gFu().aW("craft", "craftDialog");
        if (bmf_22 == null) {
            return;
        }
        int n3 = bmf_22.dxd();
        int n4 = bmf_22.dfz();
        if (bl3) {
            if (n4 > 0) {
                bmf_22.BH(n4 - 1);
            }
            return;
        }
        if (n4 >= n3 - 1) {
            return;
        }
        bmf_22.BH(n4 + 1);
    }
}

