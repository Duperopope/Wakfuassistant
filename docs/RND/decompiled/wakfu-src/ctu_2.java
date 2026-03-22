/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TLongObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TLongObjectProcedure;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.log4j.Logger;

/*
 * Renamed from cTu
 */
public class ctu_2
implements Sp,
adi_1,
bpo_2,
eJR,
eJT,
eyu_1 {
    public static final ctu_2 nJd = new ctu_2();
    protected static final Logger nJe = Logger.getLogger(ctu_2.class);
    private static final String nJf = "heroesPartyManagementInnerContainer";
    private static final String nJg = "companionsManagementInnerContainer";
    private static final String nJh = "companionsManagementDialog";
    private blu_0 nJi;
    private final TIntObjectHashMap<blp_0> nJj = new TIntObjectHashMap();
    private TLongObjectHashMap<bgl_0> nJk;
    private alx_2 ikv;

    private ctu_2() {
    }

    @Override
    public boolean b(aam_2 aam_22) {
        int n = aam_22.d();
        if (n == 17013) {
            return false;
        }
        if (n == 19032) {
            cus_2.a((dbj)aam_22, -1L, 150, aue_0.cVJ().cVK());
            return false;
        }
        if (n == 12229) {
            this.ePR();
            return false;
        }
        return true;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        if (!fcI.fSN() && !fcI.fSN()) {
            return;
        }
        this.ikv = string -> {
            if (string.equals(nJh)) {
                aue_0.cVJ().b(nJd);
            }
        };
        this.nJi = new blu_0();
        bsn_1 bsn_12 = bsn_1.ljU;
        bsg_1 bsg_12 = (bsg_1)aie_0.cfn().bmH();
        String string2 = bsg_12.f(bsn_12);
        this.nJi.lV(string2);
        boolean bl2 = fcI.fSM();
        int n = !bl2 || bsg_12.a(bsn_1.ljX) ? 0 : 1;
        fse_1.gFu().f("companionsListSavedSearch", this.nJi);
        if (bl2) {
            bsg_12.a((afe)bsn_1.ljX, false);
        }
        eJN.qAF.b(this);
        this.ePP();
        this.ePS();
        fyw_0.gqw().a(this.ikv);
        ccj_2.g(nJh, 32768L);
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(nJh);
        fes_2 fes_22 = (fes_2)fhs_22.uH(nJf);
        fes_22.a(this::ePN);
        fes_2 fes_23 = (fes_2)fhs_22.uH(nJg);
        fes_23.a(this::ePR);
        fse_1.gFu().f("overHero", (Object)null);
        fse_1.gFu().f("heroesDisplayer", bly_0.ivl);
        fse_1.gFu().f("companionManagementPage", 0);
        fse_1.gFu().b("mainCharacterSheet", false, nJh);
        fse_1.gFu().f("companionCurrentPageIndex", n);
        bvi_0 bvi_02 = aue_0.cVJ().cVK().dnQ();
        if (bvi_02.dfG()) {
            bvi_02.dKL().a(this);
        }
        fyw_0.gqw().d("wakfu.companionsManagement", cdx_1.class);
        fyw_0.gqw().d("wakfu.companionsEmbedded", cdu_1.class);
        if (!fyw_0.gqw().tb("wakfu.exchangeMachine")) {
            fyw_0.gqw().d("wakfu.exchangeMachine", cee_1.class);
        }
        bly_0.ivl.clean();
    }

    public void ePN() {
        this.nJk = new TLongObjectHashMap();
        ArrayList arrayList = new ArrayList();
        fcL.rUh.a(aue_0.cVJ().cVO().xl(), exP2 -> {
            bgy bgy2 = (bgy)exP2;
            bgl_0 bgl_02 = new bgl_0(bgy2, null);
            if (fcK.rUe.aU(bgy2)) {
                return true;
            }
            this.nJk.put(bgl_02.dcP().Sn(), (Object)bgl_02);
            arrayList.add(bgl_02);
            return true;
        });
        this.nJj.forEachValue(blp_02 -> {
            if (!blp_02.dtA() && !blp_02.dtz()) {
                return true;
            }
            this.nJk.put((long)(-blp_02.dcP().aWP()), blp_02);
            arrayList.add(blp_02);
            return true;
        });
        arrayList.sort((bgl_02, bgl_03) -> {
            if (!bgl_02.aXd() && !bgl_03.aXd()) {
                return Short.compare(bgl_02.bEr(), bgl_03.bEr());
            }
            if (!bgl_02.aXd() && bgl_03.aXd()) {
                return -1;
            }
            if (bgl_02.aXd() && !bgl_03.aXd()) {
                return 1;
            }
            blp_0 blp_02 = (blp_0)bgl_02;
            blp_0 blp_03 = (blp_0)bgl_03;
            String string = blp_02.getName();
            String string2 = blp_03.getName();
            if (string == null || string2 == null) {
                return 0;
            }
            return string.compareTo(string2);
        });
        fse_1.gFu().f("heroesList", arrayList);
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 != null && bgt_02.dnQ().dfG()) {
            bgt_02.dnQ().dKL().b(this);
        }
        this.ePO();
        eJN.qAF.a(this);
        bsn_1 bsn_12 = bsn_1.ljU;
        ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_12, this.nJi.dtK());
        fyw_0.gqw().b(this.ikv);
        fyw_0.gqw().tl(nJh);
        fyw_0.gqw().tl("companyRewardsDialog");
        fyw_0.gqw().tc("wakfu.companionsManagement");
        if (!aue_0.cVJ().c(cus_2.eRQ()) && !fyw_0.gqw().to("ladderRewardsDialog")) {
            fyw_0.gqw().tc("wakfu.exchangeMachine");
        }
        fse_1.gFu().vX("companionsList");
    }

    public void b(TLongObjectProcedure<bgl_0> tLongObjectProcedure) {
        this.nJk.forEachEntry(tLongObjectProcedure);
    }

    public bgl_0 om(long l) {
        return (bgl_0)this.nJk.get(l);
    }

    private void ePO() {
        long l = aue_0.cVJ().cVO().xl();
        for (eJS eJS2 : eJN.qAF.pP(l)) {
            eJS2.a(this);
        }
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    public void ePP() {
        this.ePO();
        for (short s : bmo_2.iEv.dxt()) {
            int[] nArray;
            bjz_1 bjz_12 = bja_1.drJ().bC(s);
            if (bjz_12 == null || !ewo_0.oBF.k(ewr_0.oDg) && Arrays.stream(nArray = bjz_12.fhO()).noneMatch(n -> n == ezj_0.ptI.aJr())) continue;
            this.MD(s);
        }
    }

    public blu_0 ePQ() {
        return this.nJi;
    }

    public void ePR() {
        Object object;
        Object object2;
        this.ePS();
        blp_0 blp_04 = (blp_0)fse_1.gFu().aW("characterSheet", nJh);
        ArrayList<Object> arrayList = new ArrayList<Object>();
        long l = aue_0.cVJ().cVO().xl();
        byte by = 0;
        Object object3 = null;
        TIntObjectIterator tIntObjectIterator = this.nJj.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            object2 = (blp_0)tIntObjectIterator.value();
            short s = ((blp_0)object2).dcP().aWP();
            object = eJN.qAF.T(l, s);
            if (object == null || !((eJS)object).efO()) {
                if (this.nJi.dtH() == blv_0.iuK) {
                    continue;
                }
            } else {
                by = (byte)(by + 1);
                if (this.nJi.dtH() == blv_0.iuL) continue;
            }
            arrayList.add(object2);
            if (blp_04 == null || blp_04.dcP().aWP() != s) continue;
            object3 = object2;
        }
        if (this.nJi.dtI()) {
            arrayList.sort((blp_02, blp_03) -> {
                String string = blp_02.getName();
                String string2 = blp_03.getName();
                if (string == null || string2 == null) {
                    return 0;
                }
                return string.compareTo(string2);
            });
        }
        if (this.nJi.dtJ()) {
            arrayList.sort((blp_02, blp_03) -> blp_03.cmL() - blp_02.cmL());
        }
        int n = -1;
        for (blp_0 blp_05 : arrayList) {
            if (!blp_05.dtA()) continue;
            n = arrayList.indexOf(blp_05);
            break;
        }
        if (n != -1) {
            object2 = (blp_0)arrayList.remove(n);
            arrayList.add(0, object2);
        }
        fse_1.gFu().f("companionsList", arrayList);
        if (!arrayList.isEmpty()) {
            fse_1.gFu().b("characterSheet", object3 == null ? (Object)arrayList.get(0) : object3, nJh);
        }
        object2 = new ahv_2();
        ((ahv_2)object2).ceu().e(new awx_2(0.01f, 0.51f, 0.81f, 1.0f)).aO(by).cev();
        ahv_2 ahv_22 = new ahv_2();
        ahv_22.ceu().yx(this.nJj.size()).cev();
        object = aum_0.cWf().c("companionsOwnedCount", ((ahv_2)object2).ceL(), ahv_22.ceL());
        fse_1.gFu().f("companionsOwnedCount", object);
    }

    @Override
    public void eiQ() {
        this.ePS();
    }

    private void ePS() {
        this.c(this.nJj);
    }

    private void c(TIntObjectHashMap<blp_0> tIntObjectHashMap) {
        bOU.a((bot_0)new ctv_2(this, tIntObjectHashMap), (Object)450, 1, 50);
    }

    @Override
    public void a(eJS eJS2, long l) {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(nJh);
        fse_1.gFu().b("characterSheet", "xpRatio", fhs_22);
        fse_1.gFu().b("characterSheet", "currentLevelPercentage", fhs_22);
        fse_1.gFu().b("characterSheet", "currentLevelPercentageInText", fhs_22);
    }

    @Override
    public void d(eJS eJS2) {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(nJh);
        blp_0 blp_02 = (blp_0)fse_1.gFu().i("characterSheet", fhs_22);
        bli_1 bli_12 = blp_02.dmf();
        bli_12.setName(eJS2.getName());
        fse_1.gFu().a((aef_2)bli_12, "name");
        this.ePN();
    }

    @Override
    public void e(eJS eJS2) {
    }

    @Override
    public void f(eJS eJS2) {
    }

    @Override
    public void g(eJS eJS2) {
    }

    @Override
    public void h(eJS eJS2) {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(nJh);
        blp_0 blp_02 = (blp_0)fse_1.gFu().i("characterSheet", fhs_22);
        fse_1.gFu().a((aef_2)blp_02, "isOwned");
    }

    public int ePT() {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(nJh);
        blp_0 blp_02 = (blp_0)fse_1.gFu().aW("characterSheet", nJh);
        if (blp_02 == null) {
            return 0;
        }
        fbz_2 fbz_22 = (fbz_2)fhs_22.uH("companionsList");
        return fbz_22.getItemIndex(blp_02);
    }

    @Override
    public void a(eyt_1 eyt_12, exz_1 exz_12) {
        if (!exz_12.aXd() || exz_12.aZj() != aue_0.cVJ().cVO().xl()) {
            return;
        }
        this.ePR();
        cts_1.ePH();
    }

    @Override
    public void a(eyt_1 eyt_12, exz_1 exz_12, boolean bl) {
        if (!exz_12.aXd() && !exz_12.dmc() || exz_12.aZj() != aue_0.cVJ().cVO().xl()) {
            return;
        }
        if (exz_12.dmc()) {
            fcL.rUh.av(exz_12.aZj(), exz_12.KU());
        } else {
            this.ePR();
            cts_1.MA(exz_12.aWP());
            cts_1.ePH();
        }
    }

    @Override
    public void a(eyt_1 eyt_12, long l, long l2) {
    }

    @Override
    public void b(eJS eJS2) {
    }

    @Override
    public void c(eJS eJS2) {
        this.MD(eJS2.aWP());
    }

    private void MD(int n) {
        long l = aue_0.cVJ().cVO().xl();
        eJS eJS2 = eJN.qAF.T(l, n);
        if (eJS2 == null) {
            eJS2 = new eJS((short)n);
        } else {
            eJS2.b(this);
            eJS2.dme().a(this);
        }
        bhx_0 bhx_02 = cts_1.a(eJS2, false);
        this.nJj.put(n, (Object)new blp_0(bhx_02, new blt_0(eJS2), eJS2));
    }

    @Override
    public void b(Sl sl) {
        TIntObjectIterator tIntObjectIterator = this.nJj.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            blp_0 blp_02 = (blp_0)tIntObjectIterator.value();
            if (!blp_02.dme().f((ffV)((Sn)sl).bfD())) continue;
            fse_1.gFu().a((aef_2)blp_02, "removeDisabledText");
            bgy bgy2 = blp_02.dcP();
            if (bgy2 == null) continue;
            this.a(sl, bgy2);
        }
    }

    public void p(eJS eJS2) {
        blp_0 blp_02 = (blp_0)this.nJj.get((int)eJS2.aWP());
        if (blp_02 == null) {
            return;
        }
        bgy bgy2 = blp_02.dcP();
        if (bgy2 == null) {
            return;
        }
        bgy2.dll();
    }

    public void a(Sl sl, bgy bgy2) {
        ffV ffV2;
        if ((sl.bfB() == Sm.bob || sl.bfB() == Sm.boc) && (ffV2 = (ffV)((Sn)sl).bfD()) != null) {
            if (ffV2.dOg().dpq() != 0) {
                bEq bEq2 = bEr.dSi().bW(ffV2.dOg().dpq());
                bgy2.a(ffV2, bEq2);
            } else {
                bgy2.bX(ffV2);
            }
        }
        bgy2.dll();
    }
}

