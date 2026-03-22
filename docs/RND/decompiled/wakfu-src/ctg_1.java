/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cTG
 */
public class ctg_1
implements adi_1,
adp_0,
ekz_0 {
    protected static final Logger nKa = Logger.getLogger(ctg_1.class);
    private static final ctg_1 nKb = new ctg_1();
    private alx_2 ikv;
    private TIntObjectHashMap<bmj_2> nKc;
    private bmf_2 nKd;
    private fhs_2 nKe;
    private int nKf;
    fce_2 kqa;
    private fdd_2 nKg;
    private boolean nkK;
    private final Runnable nKh = new cti_1(this);

    public static ctg_1 eQG() {
        return nKb;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            aue_0.cVJ().b(czi_2.eYU());
            aue_0.cVJ().b(cup_1.eRM());
            this.ikv = new cth_2(this);
            fyw_0.gqw().a(this.ikv);
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            if (!ctg_1.eQR()) {
                bgt_02.dpK().a(this);
            }
            bgt_02.ddI().a(this);
            String string = this.nkK ? "craftTableFreeDialog" : "craftTableDialog";
            this.nKe = ccj_2.pd(string).getElementMap();
            fse_1.gFu().b("craft", this.nKd, string);
            this.nKf = 0;
            fse_1.gFu().f("currentCraftNb", this.nKf);
            fse_1.gFu().f("selectedRecipe", (Object)null);
            fse_1.gFu().f("craftRunning", false);
            fse_1.gFu().f("recipeIngredientStack", (Object)null);
            cAY.eHc().nP(600012L);
            if (!fyw_0.gqw().tb("wakfu.craftTable")) {
                fyw_0.gqw().d("wakfu.craftTable", cei_2.class);
            }
            if (!fyw_0.gqw().tb("wakfu.crafts")) {
                fyw_0.gqw().d("wakfu.crafts", ceh_2.class);
            }
            if (!fyw_0.gqw().tb("wakfu.inventory")) {
                fyw_0.gqw().d("wakfu.inventory", cfe_1.class);
            }
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            if (fse_1.gFu().dp("craftRunning") && bgt_02.dps() != null) {
                this.eQN();
            }
            bgt_02.i(false, true);
            bgt_02.ddI().b(this);
            if (!ctg_1.eQR()) {
                bgt_02.dpK().b(this);
            }
            this.eQH();
            this.nKc = null;
            this.nKe = null;
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tl("craftTableDialog");
            fyw_0.gqw().tl("craftTableFreeDialog");
            fyw_0.gqw().tl("splitStackDialog");
            fse_1.gFu().vX("currentCraftNb");
            this.kqa = null;
            this.nKg = null;
            fse_1.gFu().vX("selectedRecipe");
            fse_1.gFu().vX("craftRunning");
            fse_1.gFu().vX("recipeIngredientStack");
            fse_1.gFu().vX("craftTableName");
            cAY.eHc().nP(600013L);
            if (!aue_0.cVJ().c(csk_1.nFj)) {
                fyw_0.gqw().tc("wakfu.craftTable");
            }
            if (cte_2.eQE()) {
                fyw_0.gqw().tc("wakfu.crafts");
            }
            if (!aue_0.cVJ().c(cvo_2.eUK())) {
                fyw_0.gqw().tc("wakfu.inventory");
            }
            aue_0.cVJ().a(czi_2.eYU());
        }
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 16902: {
                return false;
            }
            case 17994: {
                ama_1 ama_12 = (ama_1)aam_22;
                boolean bl = ama_12.bCu();
                this.nKd.gA(bl);
                this.nKc.clear();
                this.eQK();
                this.eQI();
                for (ffV ffV2 : aue_0.cVJ().cVK().dno().dRx()) {
                    fse_1.gFu().a((aef_2)ffV2, "usedInCurrentRecipe", "movable", "deletable");
                }
                return false;
            }
            case 19903: {
                daj_0 daj_02 = (daj_0)aam_22;
                int n = daj_02.acs();
                bmj_2 bmj_22 = (bmj_2)this.nKc.get(n);
                if (bmj_22 != null) {
                    this.nKc.remove(n);
                    this.eQK();
                    this.eQI();
                    ctg_1.ML(n);
                }
                this.ki(true);
                return false;
            }
            case 16046: {
                if (fse_1.gFu().dp("craftRunning")) {
                    return false;
                }
                dak_0 dak_02 = (dak_0)aam_22;
                bmj_2 bmj_23 = dak_02.faf();
                int n = bmj_23.duo().d();
                short s = dak_02.bCq();
                if (s == -1 || bmj_23.bfd() == 1) {
                    this.nKc.remove(n);
                } else {
                    this.nKc.put(n, (Object)new bmj_2((short)(bmj_23.bfd() - 1), bmj_23.duo()));
                }
                this.eQI();
                this.eQK();
                ctg_1.ML(n);
                return false;
            }
            case 16019: {
                dbl_0 dbl_02 = (dbl_0)aam_22;
                ffV ffV3 = dbl_02.getItem();
                if (!ffV3.dOg().dUt() || fse_1.gFu().dp("craftRunning")) {
                    return false;
                }
                int n = ffV3.avr();
                bmj_2 bmj_24 = (bmj_2)this.nKc.get(n);
                short s = dbl_02.bfd();
                if (bmj_24 != null) {
                    if (s != 1) {
                        nKa.error((Object)"on a encore un item de m\u00eame type dans la liste des ingr\u00e9dients !");
                        return false;
                    }
                    int n2 = bmj_24.bfd() + 1;
                    if (aue_0.cVJ().cVK().dno().UN(n) < n2) {
                        return false;
                    }
                    s = (short)n2;
                }
                this.nKc.put(n, (Object)new bmj_2(s == -1 ? ffV3.bfd() : s, (bgv_2)ffV3.dOg()));
                this.ki(false);
                this.eQI();
                this.eQK();
                ctg_1.ML(n);
                return false;
            }
            case 19073: {
                if (fse_1.gFu().dp("craftRunning")) {
                    return false;
                }
                dam_0 dam_02 = (dam_0)aam_22;
                bmv_1 bmv_12 = dam_02.fah();
                if (!bmv_12.dxA().at(this.nKd.dxe())) {
                    return false;
                }
                bmv_12.gD(aue_0.cVJ().cVK().b(bmv_12.dxA()) && this.nKd.e(bmv_12.dxA()));
                bmv_1 bmv_13 = (bmv_1)fse_1.gFu().vY("selectedRecipe");
                this.eQH();
                for (bmj_2 bmj_25 : bmv_12.dxz()) {
                    int n = bmj_25.duo().d();
                    this.nKc.put(n, (Object)bmj_25);
                    ctg_1.ML(n);
                }
                this.eQK();
                if (bmv_12 == bmv_13) {
                    bmv_12 = null;
                }
                fse_1.gFu().f("selectedRecipe", bmv_12);
                this.nKf = 1;
                fse_1.gFu().f("currentCraftNb", this.nKf);
                fse_1.gFu().a((aef_2)bmv_12, "totalCraftFee");
                return false;
            }
            case 16482: {
                dan_0 dan_02 = (dan_0)aam_22;
                if (fse_1.gFu().dp("craftRunning")) {
                    return false;
                }
                if (!this.eQM()) {
                    dan_02.faj().setSelected(false);
                    fiq_2.gCw().d(fik_2.gBZ().l("craft.error.inventoryFull", new Object[0]));
                } else {
                    this.kqa = dan_02.fai();
                    this.kqa.setValue(0.0f);
                    this.nKg = dan_02.faj();
                    this.MN(this.nKf);
                }
                return false;
            }
            case 19114: {
                if (!fse_1.gFu().dp("craftRunning")) {
                    return false;
                }
                this.eQN();
                return false;
            }
            case 18508: {
                fse_1.gFu().f("currentCraftNb", (Object)null);
                ama_1 ama_13 = (ama_1)aam_22;
                this.nKf = ama_13.bCo();
                bmv_1 bmv_14 = (bmv_1)fse_1.gFu().vY("selectedRecipe");
                if (bmv_14 != null) {
                    long l;
                    long l2;
                    long l3;
                    int n = aue_0.cVJ().cVK().c(bmv_14.dxA());
                    if (this.nKf > n) {
                        this.nKf = n;
                    }
                    if ((l3 = bmv_14.dxE()) > 0L && (l2 = (long)this.nKf * l3) > (l = aue_0.cVJ().cVK().dmi())) {
                        this.nKf = GC.cw(l / l3);
                    }
                }
                if (this.nKf == 0) {
                    this.nKf = 1;
                }
                fse_1.gFu().f("currentCraftNb", this.nKf);
                fse_1.gFu().a((aef_2)bmv_14, "totalCraftFee");
                return false;
            }
            case 19236: {
                this.eQJ();
                return false;
            }
        }
        return true;
    }

    private void eQH() {
        int[] nArray = this.nKc.keys();
        this.nKc.clear();
        for (int n : nArray) {
            ctg_1.ML(n);
        }
    }

    private static void ML(int n) {
        for (ffV ffV2 : aue_0.cVJ().cVK().dno().pd(n)) {
            fse_1.gFu().a((aef_2)ffV2, "usedInCurrentRecipe", "movable", "deletable");
        }
    }

    private void eQI() {
        fse_1.gFu().f("selectedRecipe", this.eQL());
    }

    private void eQJ() {
        bmv_1 bmv_12;
        fse_1.gFu().f("currentCraftNb", (Object)null);
        Object object = fse_1.gFu().vY("selectedRecipe");
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bdl_0 bdl_02 = bgt_02.dno();
        if (object != null) {
            long l;
            long l2;
            bmv_12 = (bmv_1)object;
            this.nKf = Math.max(1, bgt_02.c(bmv_12.dxA()));
            long l3 = bmv_12.dxE();
            if (l3 > 0L && (l2 = (long)this.nKf * l3) > (l = aue_0.cVJ().cVK().dmi())) {
                this.nKf = GC.cw(l / l3);
            }
        } else if (this.nKc.isEmpty()) {
            this.nKf = 0;
        } else {
            int n = Integer.MAX_VALUE;
            TIntObjectIterator tIntObjectIterator = this.nKc.iterator();
            while (tIntObjectIterator.hasNext()) {
                tIntObjectIterator.advance();
                int n2 = bdl_02.Gn(tIntObjectIterator.key()) / ((bmj_2)tIntObjectIterator.value()).bfd();
                if (n2 >= n) continue;
                n = n2;
            }
            this.nKf = n;
        }
        fse_1.gFu().f("currentCraftNb", this.nKf);
        if (object != null) {
            bmv_12 = (bmv_1)object;
            fse_1.gFu().a((aef_2)bmv_12, "totalCraftFee");
        }
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    public void a(bDs bDs2, boolean bl) {
        bhJ bhJ2;
        fse_1.gFu().f("craftTableName", bDs2.getName());
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (ctg_1.eQR()) {
            bnv_2 bnv_22 = aue_0.cVJ().cVK().dnw();
            bhJ2 = (bhJ)bgg_0.dlO().ju(bnv_22.Xi());
            if (bhJ2 == null) {
                nKa.warn((Object)"Cannot open secured crafting interface : the craftsman if offline");
                aPd.e("craft.secured.craftsman.absent", new Object[0]);
                return;
            }
        } else {
            bhJ2 = bgt_02;
        }
        this.nKd = new bmf_2(bDs2.cms(), bhJ2.Xi(), bhJ2.dpK(), bDs2);
        this.nKd.a(new bmh_2(this.nKd, 7));
        this.nKc = new TIntObjectHashMap();
        this.eQK();
        this.nkK = bl;
        aue_0.cVJ().a(this);
    }

    private void eQK() {
        fse_1.gFu().f("recipeIngredientStack", this.nKc.isEmpty() ? null : this.nKc.values());
    }

    public boolean MM(int n) {
        return this.nKc.containsKey(n);
    }

    public void ki(boolean bl) {
        fja_2 fja_22 = (fja_2)((Object)this.nKe.uH("ingredientList"));
        for (fcv_1 fcv_12 : fja_22.getRenderables()) {
            fes_2 fes_22 = (fes_2)fcv_12.getInnerElementMap().uH("ingredientBackgroundContainer");
            fes_22.setStyle(bl ? "itemSelectedBackground" : "itemBackground");
        }
    }

    private bmv_1 eQL() {
        for (bmv_1 bmv_12 : this.nKd.dwP()) {
            if (this.nKc.size() != bmv_12.dxz().size()) continue;
            boolean bl = true;
            for (bmj_2 bmj_22 : bmv_12.dxz()) {
                bmj_2 bmj_23 = (bmj_2)this.nKc.get(bmj_22.duo().d());
                if (bmj_23 != null && bmj_23.bfd() == bmj_22.bfd()) continue;
                bl = false;
                break;
            }
            if (!bl) continue;
            fse_1.gFu().f("currentCraftNb", 1);
            fse_1.gFu().a((aef_2)bmv_12, "totalCraftFee");
            return bmv_12;
        }
        if (!this.nKc.isEmpty()) {
            fse_1.gFu().f("currentCraftNb", 1);
            bmv_1 bmv_13 = (bmv_1)fse_1.gFu().vY("selectedRecipe");
            if (bmv_13 != null) {
                fse_1.gFu().a((aef_2)bmv_13, "totalCraftFee");
            }
        }
        return null;
    }

    public void oo(long l) {
        if (this.kqa != null) {
            this.kqa.setTweenDuration(l);
            abg_2.bUP().a(this.nKh, 100L, 1);
        }
        this.nKd.dwR().ac((short)2);
        this.nKd.dwR().aVQ();
        bmv_1 bmv_12 = (bmv_1)fse_1.gFu().vY("selectedRecipe");
        if (bmv_12 != null) {
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            eki_0 eki_02 = bgt_02.dpK();
            short s = eki_02.PG(this.nKd.dwk());
            long l2 = eki_02.QI(this.nKd.dwk());
            long l3 = bmv_12.dxA().a(s, bgt_02);
            int n = bgt_02.dmn().a(eje_0.qyu, this.nKd.dwk(), 8);
            float f2 = (float)(100 + n) / 100.0f;
            this.nKd.kc(l2 + (long)Math.round((float)l3 * f2));
        }
    }

    public void cS(short s) {
        boolean bl;
        Object object;
        Object object2;
        bmv_1 bmv_12;
        if (this.kqa != null) {
            this.kqa.setValue(0.0f);
        }
        if ((bmv_12 = (bmv_1)fse_1.gFu().vY("selectedRecipe")) != null) {
            fse_1.gFu().a((aef_2)bmv_12, bmv_12.bxk());
            eKR eKR2 = bmv_12.dxA();
            object2 = this.nKd.dwP();
            object = object2.iterator();
            while (object.hasNext()) {
                bmv_1 bmv_13 = (bmv_1)object.next();
                if (bmv_13.dxA().d() != eKR2.d()) continue;
                bmv_12 = bmv_13;
                fse_1.gFu().f("selectedRecipe", bmv_13);
            }
        }
        this.nKf -= s;
        this.nKd.dwW();
        boolean bl2 = bl = this.nKf > 0 && this.eQM();
        if (bl) {
            if (bmv_12 != null) {
                bmv_12.gD(true);
            }
            this.MN(this.nKf);
        } else {
            int n;
            fse_1.gFu().f("craftRunning", false);
            object2 = aue_0.cVJ().cVK().dno();
            object = new ArrayList();
            boolean bl3 = true;
            Object object3 = this.nKc.iterator();
            while (object3.hasNext()) {
                object3.advance();
                n = object3.key();
                short s2 = ((bmj_2)object3.value()).bfd();
                if (((bdl_0)object2).Gn(n) >= s2) continue;
                object.add(n);
                bl3 = false;
            }
            if (bmv_12 != null) {
                bmv_12.gD(bl3 && this.nKd.e(bmv_12.dxA()));
            }
            object3 = object.iterator();
            while (object3.hasNext()) {
                n = (Integer)object3.next();
                this.nKc.remove(n);
                ctg_1.ML(n);
            }
            this.eQK();
            this.nKf = bl3 && !this.nKc.isEmpty() ? 1 : 0;
            this.nKd.dwR().ac((short)1);
            this.nKd.dwR().aVQ();
        }
        fse_1.gFu().f("currentCraftNb", this.nKf);
        if (bmv_12 != null) {
            fse_1.gFu().a((aef_2)bmv_12, "totalCraftFee");
        }
    }

    private boolean eQM() {
        bmv_1 bmv_12 = (bmv_1)fse_1.gFu().vY("selectedRecipe");
        eKR eKR2 = bmv_12 != null ? bmv_12.dxA() : null;
        bdl_0 bdl_02 = aue_0.cVJ().cVK().dno();
        if (bdl_02.fVd() != 0) {
            return true;
        }
        boolean bl = eKR2 != null && eKR2.c(eKS.qEw);
        eKV eKV2 = eKR2 != null ? eKR2.fyZ() : eKV.qEF;
        Object r = fgD.fXh().Vd(eKV2.azv());
        if (r == null) {
            return bl;
        }
        ffV ffV2 = new ffV();
        ffV2.l((fhc_0)r);
        ffV2.ak(eKV2.bfd());
        ArrayList<Long> arrayList = bdl_02.cz(ffV2);
        for (Long l : arrayList) {
            ffs_0 ffs_02 = bdl_02.sY(l);
            if (ffs_02.fVd() <= 0) continue;
            return true;
        }
        ffs_0 ffs_03 = bdl_02.cx(ffV2);
        return ffs_03 != null;
    }

    public void eQN() {
        bkb_0 bkb_02 = aue_0.cVJ().cVK().dps();
        if (bkb_02 != null) {
            ((bkk_1)bkb_02).dst();
        } else {
            nKa.error((Object)"On tente d'annuler le craft alors que le joueur n'a pas d'occupation !");
        }
        this.eQP();
    }

    public static void eQO() {
        aue_0.cVJ().cVK().i(false, false);
        ctg_1.nKb.nKd.kc(-1L);
        ctg_1.nKb.nKf = 0;
        nKb.eQP();
    }

    public void eQP() {
        if (this.kqa != null) {
            this.kqa.setValue(0.0f);
        }
        abg_2.bUP().h(this.nKh);
        fse_1.gFu().f("craftRunning", false);
        this.nKd.dwR().ac((short)1);
        this.nKd.dwR().aVQ();
    }

    private nv_0 a(bmv_1 bmv_12, int n) {
        if (this.nKd.dwq()) {
            if (this.a(bmv_12)) {
                return new cjn_0(this.nKd.dwR().Sn(), bmv_12.dxA().d(), bmv_12.dxE(), n);
            }
            return new cjn_0(this.nKd.dwR().Sn(), bmv_12.dxA().d(), bmv_12.dxE(), 1);
        }
        if (this.a(bmv_12)) {
            return new cjl_0(this.nKd.dwR().Sn(), bmv_12.dxA().d(), n);
        }
        return new cjl_0(this.nKd.dwR().Sn(), bmv_12.dxA().d(), 1);
    }

    private void MN(int n) {
        bmv_1 bmv_12 = (bmv_1)fse_1.gFu().vY("selectedRecipe");
        if (bmv_12 != null) {
            nv_0 nv_02 = this.a(bmv_12, n);
            aue_0.cVJ().etu().d(nv_02);
        } else {
            int n2;
            byte by;
            eKR eKR2 = this.eQQ();
            if (eKR2 == null) {
                by = -1;
                n2 = 0;
            } else if (!this.nKd.dwR().Gb(eKR2.d())) {
                by = -2;
                n2 = eKR2.d();
            } else {
                by = 0;
                n2 = eKR2.d();
            }
            cjm_0 cjm_02 = new cjm_0(this.nKd.dwR().Sn(), n2, by);
            if (by == -1) {
                TIntObjectIterator tIntObjectIterator = this.nKc.iterator();
                while (tIntObjectIterator.hasNext()) {
                    tIntObjectIterator.advance();
                    cjm_02.j(tIntObjectIterator.key(), ((bmj_2)tIntObjectIterator.value()).bfd());
                }
            }
            aue_0.cVJ().etu().d(cjm_02);
        }
        fse_1.gFu().f("craftRunning", true);
    }

    private boolean a(bmv_1 bmv_12) {
        return bmv_12.dxy() <= this.nKd.cmL() && !bmv_12.dxG() && this.nKf > 1 && ewo_0.oBF.k(ewr_0.oGe);
    }

    public eKR eQQ() {
        TIntObjectIterator<eKR> tIntObjectIterator = eKQ.qEb.QV(this.nKd.dwk()).fze();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            eKR eKR2 = (eKR)tIntObjectIterator.value();
            if (!eKR2.c(eKS.qEv)) continue;
            boolean bl = true;
            Iterator<Map.Entry<Integer, Bu<Short, Short>>> iterator = eKR2.fza();
            while (iterator.hasNext()) {
                Map.Entry<Integer, Bu<Short, Short>> entry = iterator.next();
                bmj_2 bmj_22 = (bmj_2)this.nKc.get(entry.getKey().intValue());
                if (bmj_22 != null && bmj_22.bfd() == entry.getValue().getFirst().shortValue()) continue;
                bl = false;
                break;
            }
            if (!bl) continue;
            return eKR2;
        }
        return null;
    }

    @Override
    public void d(@NotNull eKW eKW2) {
        throw new UnsupportedOperationException("aucune raison de notifier la crafttableFrame d'un m\u00e9tier appris");
    }

    @Override
    public void t(int n, long l) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        eki_0 eki_02 = bgt_02.dpK();
        long l2 = eki_02.QI(n);
        long l3 = l2 - l;
        if (eKX.qi(l2) != eKX.qi(l3)) {
            bgt_02.dmY();
            this.nKd.dwZ();
        }
        fse_1.gFu().a((aef_2)this.nKd, "currentXpPercentage", "level", "levelText");
    }

    @Override
    public void Ef(int n) {
    }

    @Override
    public void du(int n, int n2) {
    }

    public void qt(String string) {
        if (this.nKg == null) {
            return;
        }
        fzs fzs2 = this.nKg.getAppearance();
        if (fzs2 == null) {
            return;
        }
        fka_1 fka_12 = new fka_1();
        fka_12.aVI();
        fka_12.setAlignment(faa_2.tLO);
        fka_12.setLevel(1);
        fka_12.setFile(string);
        fka_12.setUseParentScissor(true);
        fka_12.setRemovable(false);
        fzs2.d(fka_12);
    }

    public int cms() {
        return this.nKd.dwk();
    }

    public void cT(short s) {
        if (!ctg_1.eQR()) {
            baj_2.hzf.cZr().t(nKb.cms(), s);
        }
        this.qt("6001038.xps");
        this.cS(s);
    }

    public void a(bDs bDs2) {
        if (bDs2 == this.nKd.dwR()) {
            aue_0.cVJ().b(this);
        }
    }

    private static boolean eQR() {
        bnv_2 bnv_22 = aue_0.cVJ().cVK().dnw();
        return bnv_22 != null && bnv_22.Xi() != aue_0.cVJ().cVK().Sn();
    }

    public void dxf() {
        this.nKd.dxf();
    }

    @Override
    public void pathStarted(ads_0 ads_02, anp_2 anp_22) {
        aue_0.cVJ().b(nKb);
    }
}

