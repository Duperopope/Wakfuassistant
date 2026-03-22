/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cZc
 */
public class czc_2
extends crk_2
implements faf_0 {
    private static final boolean oab = false;
    static final Logger oac = Logger.getLogger(czc_2.class);
    private static final czc_2 oad = new czc_2();
    private cie_1 nae;
    private bQP oae;
    private final fsm_0 oaf = new fsm_0(new cak_2());
    private int oag;
    private cpc_1 ndh;
    private alx_2 ikv;
    private long oah;

    public static czc_2 eYH() {
        return oad;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 18156: {
                dby dby2 = (dby)aam_22;
                bRf bRf2 = dby2.faM();
                switch (bRf2.ekB()) {
                    case kXL: {
                        this.nae.setTool(new cin_1((fcb_0)bRf2.ekD()));
                        break;
                    }
                    case kXM: {
                        this.nae.setTool(new cil_1((fby_0)bRf2.ekD()));
                    }
                }
                fse_1.gFu().f("havenWorldSelectedCatalogEntry", bRf2);
                this.eYR();
                return false;
            }
            case 17941: {
                dbc_0 dbc_02 = (dbc_0)aam_22;
                bQE bQE2 = dbc_02.faP();
                ciy_1 ciy_12 = bQE2.ejH();
                if (ciy_12 == null) {
                    return false;
                }
                ArrayList<fsX> arrayList = this.c(ciy_12);
                if (!arrayList.isEmpty()) {
                    this.a(arrayList, ciy_12);
                    return false;
                }
                ciy_12.c(this.nae);
                this.oae.b(bQE2);
                this.eYK();
                bRf bRf3 = bQE2.ejG();
                fse_1.gFu().a((aef_2)bRf3, bRf3.bxk());
                fse_1.gFu().f("havenWorldSelectedCatalogEntry", (Object)null);
                if (this.oae.ekc() == 0) {
                    fse_1.gFu().f("havenWorldCatalogQuotationMode", false);
                }
                return false;
            }
            case 17806: {
                dae_0 dae_02 = (dae_0)aam_22;
                this.oae.cI(dae_02.bCn());
                this.nae.setCurrentLayer(this.oae.eke());
                fse_1.gFu().f("havenWorldCatalogQuotationMode", false);
                this.eYR();
                return false;
            }
            case 16635: {
                fiq_2.gCw().d(fik_2.a(string -> this.eYI()).l("question.havenWorldModificationConfirm", new Object[0]).vG(ccp_2.mRM.byf()));
                this.eYR();
                return false;
            }
            case 19106: {
                dbb_0 dbb_02 = (dbb_0)aam_22;
                this.a(dbb_02);
                return false;
            }
            case 17205: {
                return false;
            }
            case 19827: {
                return false;
            }
            case 18028: {
                dbA dbA2 = (dbA)aam_22;
                ciy_1 ciy_13 = dbA2.ejH();
                ciy_13.g(this.nae);
                this.b(dbA2.faO(), ciy_13);
                return false;
            }
        }
        return true;
    }

    private ArrayList<fsX> c(ciy_1 ciy_12) {
        Object t = ciy_12.eLi();
        if (t instanceof fsf_0) {
            fsS fsS2 = new fsS(this.nae.getWorkingHavenWorld());
            fsf_0 fsf_02 = (fsf_0)t;
            fsS2.gB(fsf_02.glm(), fsf_02.gln());
            return fsS2.glx();
        }
        if (ciy_12 instanceof civ_1) {
            fsP fsP2 = new fsP(this.nae.getWorkingHavenWorld(), cah_1.lFD);
            civ_1 civ_12 = (civ_1)ciy_12;
            fsG fsG2 = (fsG)civ_12.eLi();
            fsP2.b(civ_12.eLf(), fsG2.glm(), fsG2.gln());
            return fsP2.glx();
        }
        if (t instanceof fsb_0) {
            return this.a((fsd_0)t, ciy_12.eLe().eLk());
        }
        throw new UnsupportedOperationException("modification non prise en compte " + String.valueOf(t));
    }

    private void eYI() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        ckz_0 ckz_02 = new ckz_0(bgt_02.Sn());
        for (bQE bQE2 : this.oae.ekd()) {
            faZ faZ2 = this.c(bQE2);
            if (faZ2 == null) continue;
            ckz_02.a(faZ2);
        }
        aue_0.cVJ().etu().d(ckz_02);
        this.oag = this.oae.ekc();
        fse_1.gFu().f("havenWorldCatalogQuotationMode", false);
        this.oae.eki();
    }

    private faZ c(bQE bQE2) {
        faZ faZ2 = null;
        ciy_1 ciy_12 = bQE2.ejH();
        acc_1 acc_12 = ciy_12.eLj();
        bRf bRf2 = bQE2.ejG();
        switch (bRf2.ekB()) {
            case kXP: {
                faZ2 = new fbr(fsq_0.ZR(acc_12.bWx()), fsq_0.ZS(acc_12.bWy()));
                break;
            }
            case kXM: {
                switch (ciy_12.eLe()) {
                    case ndW: {
                        int n = ((bRd)bRf2).ekC();
                        faZ2 = new faU((short)n, (short)acc_12.bWx(), (short)acc_12.bWy());
                        this.oae.ekg();
                        break;
                    }
                    case ndX: {
                        faZ2 = new faV(ciy_12.eLi().Lx());
                        this.oae.ekg();
                        break;
                    }
                    case ndY: {
                        faZ2 = new faY(ciy_12.eLi().Lx(), (short)acc_12.bWx(), (short)acc_12.bWy());
                    }
                }
                break;
            }
            case kXL: {
                civ_1 civ_12 = (civ_1)ciy_12;
                short s = (short)fsu.aae(acc_12.bWx());
                short s2 = (short)fsu.aaf(acc_12.bWy());
                short s3 = ((fcb_0)bRf2.ekD()).fRN();
                short s4 = civ_12.eLf();
                faZ2 = new fbs(s, s2, s3, s4);
                break;
            }
        }
        return faZ2;
    }

    public void eYJ() {
        fhn_1.gzT().bYz();
        fib_2.gBU().eKH();
    }

    private void a(ArrayList<fsX> arrayList, ciy_1 ciy_12) {
        ahv_2 ahv_22 = new ahv_2();
        String string = bRa.a(ciy_12.eLi());
        if (ciy_12.eLe() == ciz_1.ndW || ciy_12.eLe() == ciz_1.ndX) {
            ahv_22.c(aum_0.cWf().c("havenWorldBoardConflictOnRevertMessage", string)).ceH();
            this.a(arrayList, ahv_22);
        } else {
            ahv_22.c(aum_0.cWf().c("havenWorldBoardConflictMessage", string)).ceH();
        }
        fse_1.gFu().f("havenWorldConflictList", ahv_22.ceL());
    }

    private void b(ArrayList<fsX> arrayList, ciy_1 ciy_12) {
        ahv_2 ahv_22 = new ahv_2();
        String string = bRa.a(ciy_12.eLi());
        ahv_22.c(aum_0.cWf().c("havenWorldBoardConflictMessage", string)).ceH();
        this.a(arrayList, ahv_22);
        fse_1.gFu().f("havenWorldConflictList", ahv_22.ceL());
    }

    private void a(ArrayList<fsX> arrayList, ahv_2 ahv_22) {
        for (int i = 0; i < arrayList.size(); ++i) {
            fsX fsX2 = arrayList.get(i);
            oac.error((Object)fsX2);
            czc_2.a(ahv_22, fsX2);
            this.nae.f(fsX2.eLi());
            if (fsX2 instanceof ftc_0 || fsX2 instanceof fsW) continue;
            oac.error((Object)("Erreur non g\u00e9r\u00e9e = " + fsX2.toString()));
        }
    }

    private static void a(ahv_2 ahv_22, fsX fsX2) {
        acc_1 acc_12 = fsX2.gli();
        String string = bRa.a(fsX2.eLi());
        ahv_22.ceH().ceC();
        ahv_22.ij(acc_12.bWx() + ";" + acc_12.bWy());
        ahv_22.ceu().ceA().c(string).ceB().cev();
        ahv_22.c(" ").c(aum_0.cWf().c(fsX2.glC().name(), new Object[0]));
        ahv_22.ceD();
    }

    private void a(ahv_2 ahv_22, long l, bRf bRf2) {
        ahv_22.ceu().ceA();
        ahv_22.ij(String.valueOf(l));
        ahv_22.c(bRf2.getName());
        ahv_22.ceB().cev();
    }

    private void a(dbb_0 dbb_02) {
        ciy_1 ciy_12 = dbb_02.ejH();
        switch (ciy_12.eLe()) {
            case ndW: {
                fbz_0 fbz_02 = ciy_12.ekD();
                if (fbz_02 instanceof fby_0) {
                    this.e(ciy_12);
                    break;
                }
                if (fbz_02 instanceof fcb_0) {
                    this.a(ciy_12, (fcb_0)fbz_02);
                    break;
                }
                this.d(ciy_12);
                break;
            }
            case ndX: {
                cdw_2.createDeleteMessageBox((n, string) -> {
                    if (n == 400) {
                        cdw_2.deleteBuilding(ciy_12.eLi().Lx());
                    } else {
                        ciy_12.g(this.nae);
                    }
                });
                break;
            }
            case ndY: {
                fiq_2.gCw().d(fik_2.gBY().l("question.havenWorldMoveBuilding", new Object[0]).vG(ccp_2.mRM.byf()).a((int n, String string) -> {
                    if (n == 400) {
                        bgt_0 bgt_02 = aue_0.cVJ().cVK();
                        faY faY2 = new faY(ciy_12.eLi().Lx(), (short)ciy_12.eLj().bWx(), (short)ciy_12.eLj().bWy());
                        ckz_0 ckz_02 = new ckz_0(bgt_02.Sn());
                        ckz_02.a(faY2);
                        aue_0.cVJ().etu().d(ckz_02);
                    } else {
                        ciy_12.g(this.nae);
                    }
                }));
                break;
            }
            case ndZ: {
                bQE bQE2 = this.oae.b(ciy_12);
                if (bQE2 == null) {
                    oac.warn((Object)"\u00c9l\u00e9m\u00e9nt n'appartenant pas au devis, todo design");
                    return;
                }
                fse_1.gFu().f("havenWorldCatalogQuotationMode", true);
                fse_1.gFu().f("havenWorldSelectedCatalogEntry", bQE2);
                break;
            }
            default: {
                return;
            }
        }
    }

    private void d(ciy_1 ciy_12) {
        if (!this.oaf.aah(this.mgp.fRp())) {
            ciy_12.c(this.nae);
            this.eYN();
        } else {
            cAY.eHc().nP(600182L);
            this.f(ciy_12);
        }
    }

    private void a(ciy_1 ciy_12, fcb_0 fcb_02) {
        if (!this.oaf.aah(fcb_02.cmP())) {
            ciy_12.c(this.nae);
            this.eYN();
            return;
        }
        int n = bQF.kWe.IZ(fcb_02.fSs());
        if (n != -1) {
            cAY.eHc().nP(n);
        }
        this.f(ciy_12);
    }

    private void e(ciy_1 ciy_12) {
        fsb_0 fsb_02 = (fsb_0)ciy_12.eLi();
        fbk_0 fbk_02 = fsb_02.glj().erN();
        if (fbk_02 == null) {
            ciy_12.c(this.nae);
            return;
        }
        fsJ fsJ2 = new fsJ(this.oaf);
        fsJ2.k(fsb_02.glj());
        if (fsJ2.b(fsY.teN)) {
            this.eYO();
        }
        if (fsJ2.b(fsY.teL)) {
            this.eYN();
        }
        if (fsJ2.b(fsY.teP)) {
            oac.error((Object)"Manque des batiement ");
        }
        if (fsJ2.b(fsY.teQ)) {
            this.eYM();
        }
        if (fsJ2.gly()) {
            ciy_12.c(this.nae);
            return;
        }
        int n = bQF.kWe.IY(fsb_02.fRh().fSr());
        if (n != -1) {
            cAY.eHc().nP(n);
        }
        this.f(ciy_12);
    }

    private void f(ciy_1 ciy_12) {
        bRf bRf2 = bRb.kYS.b(ciy_12.ekD());
        bQE bQE2 = bQE.a(bRf2);
        bQE2.a(ciy_12);
        this.d(bQE2);
        fse_1.gFu().a((aef_2)bRf2, bRf2.bxk());
    }

    private ArrayList<fsX> a(fsd_0 fsd_02, ciz_1 ciz_12) {
        fsm_0 fsm_02 = new fsm_0(this.oaf);
        this.a(fsm_02, fsd_02, ciz_12);
        fst_0 fst_02 = new fst_0(fsm_02);
        fst_02.glB();
        return fst_02.glx();
    }

    private boolean g(ciy_1 ciy_12) {
        ArrayList<fsX> arrayList = this.a((fsd_0)ciy_12.eLi(), ciy_12.eLe());
        if (arrayList.isEmpty()) {
            return true;
        }
        aaw_1.bUq().h(new dbA(ciy_12, arrayList));
        return false;
    }

    private void d(bQE bQE2) {
        if (!this.oae.a(bQE2)) {
            chb_2.cancelAction();
            bQE2.ejH().c(this.nae);
            fiq_2.gCw().d(fik_2.gBZ().l("havenWorldErrorTooMuchActions", new Object[0]).vG(ccp_2.mRF.byf()).abQ(1));
        }
        this.eYK();
        if (!this.oae.b(bQE2.ejG())) {
            chb_2.cancelAction();
            this.nae.setSelectTool();
        }
    }

    public void eYK() {
        this.oaf.a(this.oah, this.mgp);
        for (bQE bQE2 : this.oae.ekd()) {
            ciy_1 ciy_12 = bQE2.ejH();
            this.a(this.oaf, (fsd_0)ciy_12.eLi(), ciy_12.eLe());
        }
        this.oae.a(this.oaf);
        this.oae.ekg();
    }

    private void a(fsm_0 fsm_02, fsd_0 fsd_02, ciz_1 ciz_12) {
        Object t = fsd_02.ekD();
        if (t instanceof fby_0) {
            fsb_0 fsb_02 = (fsb_0)fsd_02;
            if (ciz_12 == ciz_1.ndW) {
                fsm_02.q(fsb_02.glj());
            }
            if (ciz_12 == ciz_1.ndX) {
                fsm_02.r(fsb_02.glj());
            }
            return;
        }
        if (t instanceof fca_0) {
            fca_0 fca_02 = (fca_0)t;
            fsm_02.b(fca_02);
            return;
        }
        if (t instanceof fcb_0) {
            fcb_0 fcb_02 = (fcb_0)t;
            fsm_02.d(fcb_02);
            return;
        }
    }

    public bQE a(fsb_0 fsb_02) {
        return this.oae.a(fsb_02.Lx(), fsc_0.tdW);
    }

    public fas_0 oM(long l) {
        return this.mgp.oM(l);
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            if (this.mgp == null) {
                return;
            }
            this.ikv = new czd_1(this);
            fyw_0.gqw().a(this.ikv);
            this.ndh = cal_1.lFY;
            fyw_0.gqw().d("wakfu.worldEditor", chb_2.class);
            fhv_1 fhv_12 = ccj_2.g("worldEditorDialog", 256L);
            this.eYL();
            this.nae = (cie_1)fhv_12.getElementMap().uH("worldEditor");
            this.nae.a(caf_2.lFq.eqP(), this.ndh);
            this.nae.setTool(new cip_1());
            czf_1 czf_12 = new czf_1();
            this.mgp.O(czf_12);
            acc_1 acc_12 = czf_12.eLj();
            if (acc_12 != null) {
                this.nae.ev(acc_12.bWx(), acc_12.bWy());
            }
            aue_0.cVJ().cVK().ddI().a(this);
            fse_1.gFu().f("havenWorldConflictList", (Object)null);
            fse_1.gFu().f("havenWorldCatalogPlacingMode", false);
            cAY.eHc().nP(600012L);
            cAY.eHc().f(0.2f, 1000);
            cAY.eHc().e(0.2f, 1000);
        }
        super.a(aye_22, bl);
    }

    @Override
    public fas_0 eMN() {
        Object object = fse_1.gFu().vY("selectedBuilding");
        if (object == null) {
            return null;
        }
        long l = ((bQW)object).LV();
        return this.mgp.oM(l);
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            chb_2.stopScroll(null);
            this.eYJ();
            this.mgp = null;
            fyw_0.gqw().b(this.ikv);
            crh_2.eML().bCj();
            this.ndh = null;
            this.oag = 0;
            if (this.oae != null) {
                this.oae.clear();
            }
            this.oae = null;
            fse_1.gFu().vX("havenWorldCatalog");
            fse_1.gFu().vX("havenWorldConflictList");
            if (this.nae != null) {
                this.nae.getHavenWorldImages().erg();
            }
            fyw_0.gqw().tl("worldEditorDialog");
            fyw_0.gqw().tc("wakfu.worldEditor");
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            if (bgt_02 != null) {
                bgt_02.dnY();
                bgt_02.ddI().b(this);
            }
            cAY.eHc().nP(600013L);
            cAY.eHc().f(1.0f, 1000);
            cAY.eHc().e(1.0f, 1000);
        }
        this.nae = null;
        super.b(aye_22, bl);
    }

    private void eYL() {
        this.oae = new bQP(this.oaf);
        this.eYK();
        fse_1.gFu().f("havenWorldCatalog", this.oae);
        fse_1.gFu().f("havenWorldCatalogQuotationMode", false);
        fse_1.gFu().f("havenWorldSelectedCatalogEntry", (Object)null);
    }

    private void eYM() {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("worldEditorDialog");
        fes_2 fes_22 = (fes_2)fhs_22.uH("resourceCostContainer");
        this.g(fes_22);
    }

    public void eYN() {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("worldEditorDialog");
        fes_2 fes_22 = (fes_2)fhs_22.uH("moneyCostContainer");
        this.g(fes_22);
    }

    public void eYO() {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("worldEditorDialog");
        fes_2 fes_22 = (fes_2)fhs_22.uH("sidoaCostContainer");
        this.g(fes_22);
    }

    private void g(fes_2 fes_22) {
        axb_2 axb_22 = fes_22.getAppearance().getModulationColor() == null ? awx_2.dnF : fes_22.getAppearance().getModulationColor();
        axb_2 axb_23 = awx_2.dnC;
        fsa_2 fsa_22 = new fsa_2(axb_22, axb_23, fes_22.getAppearance(), 0, 250, 4, true, abn.cdr);
        fes_22.getAppearance().a(fsa_22);
    }

    public void eYP() {
        if (this.oag <= 0) {
            return;
        }
        alz_2 alz_22 = crh_2.eML().bCi();
        alz_22.sX(1);
        --this.oag;
        if (this.oag <= 0) {
            fse_1.gFu().a((aef_2)this.oae, bQP.kXA);
            crh_2.eML().bCj();
        }
    }

    public fsm_0 ekh() {
        return this.oaf;
    }

    public bQP eYQ() {
        return this.oae;
    }

    private void a(short s, int n, short s2, short s3, long l, long l2) {
        new czg_2(this.mgp).b(s, n, s2, s3, l, l2);
        fas_0 fas_02 = this.mgp.oM(l);
        fsb_0 fsb_02 = new fsb_0(new caj_2(fas_02));
        cit_1 cit_12 = new cit_1(fsb_02);
        cit_12.d(this.nae);
        this.mgp.eqJ().TO(this.mgp.eqJ().eAn() - fas_02.erN().fSe());
        this.c(this.mgp);
        this.eYK();
    }

    private void d(long l, short s, short s2) {
        fas_0 fas_02 = this.mgp.oM(l);
        this.oN(l);
        this.a(fas_02.erN().aIi(), fas_02.fRk(), s, s2, l, fas_02.fRi());
    }

    private void L(long l, long l2) {
        fas_0 fas_02 = this.mgp.oM(l);
        fbu_0 fbu_02 = fbw_0.rSQ.eF(fas_02.erN().aIi());
        short s = fbu_02.fSk();
        this.oN(l);
        this.a(s, fas_02.fRk(), fas_02.bsM(), fas_02.bsN(), l, l2);
        this.mgp.eqJ().TO(this.mgp.eqJ().eAn() - fas_02.erN().fSe());
        this.c(this.mgp);
        this.eYK();
    }

    private void oN(long l) {
        fas_0 fas_02 = this.mgp.oM(l);
        fsb_0 fsb_02 = new fsb_0(new caj_2(fas_02));
        ciw_1 ciw_12 = new ciw_1(fsb_02);
        new czg_2(this.mgp).oN(l);
        ciw_12.d(this.nae);
        this.eYK();
    }

    public void b(faZ faZ2) {
        ciy_1 ciy_12 = this.c(faZ2);
        if (ciy_12 != null) {
            ciy_12.d(this.nae);
        }
        if (faZ2.fRz() == fbb.rQn) {
            faU faU2 = (faU)faZ2;
            this.a(faU2.fRA(), 0, faU2.bsM(), faU2.bsN(), faU2.ZC(), faU2.fRi());
            return;
        }
        if (faZ2.fRz() == fbb.rQu) {
            faY faY2 = (faY)faZ2;
            this.d(faY2.ZC(), faY2.bsM(), faY2.bsN());
            return;
        }
        if (faZ2.fRz() == fbb.rQo) {
            faV faV2 = (faV)faZ2;
            this.oN(faV2.ZC());
            return;
        }
        if (faZ2.fRz() == fbb.rQp) {
            faX faX2 = (faX)faZ2;
            this.L(faX2.ZC(), faX2.fRi());
            return;
        }
    }

    public void a(faZ faZ2, fbn fbn2) {
        ciy_1 ciy_12 = this.c(faZ2);
        if (ciy_12 != null) {
            ciy_12.f(this.nae);
        }
    }

    @Nullable
    private ciy_1 c(faZ faZ2) {
        if (faZ2.fRz() == fbb.rQn) {
            faU faU2 = (faU)faZ2;
            return new cit_1(new fsb_0(new caj_2(faU2.ZC(), faU2.fRA(), 0, faU2.bsM(), faU2.bsN())));
        }
        if (faZ2.fRz() == fbb.rQo) {
            faV faV2 = (faV)faZ2;
            fas_0 fas_02 = this.mgp.oM(faV2.ZC());
            return new ciw_1(new fsb_0(new caj_2(fas_02)));
        }
        if (faZ2.fRz() == fbb.rQm) {
            fbs fbs2 = (fbs)faZ2;
            fcb_0 fcb_02 = fbw_0.rSQ.eH(fbs2.fRN());
            return new civ_1(new fsG(fcb_02, fbs2.fRL(), fbs2.fRM()), fbs2.eLf());
        }
        if (faZ2.fRz() == fbb.rQu) {
            faY faY2 = (faY)faZ2;
            fas_0 fas_03 = this.mgp.oM(faY2.ZC());
            return new cia_1(new fsb_0(new caj_2(fas_03)), fas_03.bsM(), fas_03.bsN());
        }
        return null;
    }

    @Override
    public void c(faz_0 faz_02) {
        super.c(faz_02);
        this.oaf.g(faz_02);
        faz_02.a(this);
    }

    @Override
    public void pathStarted(ads_0 ads_02, anp_2 anp_22) {
        aue_0.cVJ().b(this);
    }

    public void eYR() {
        fse_1.gFu().f("havenWorldConflictList", (Object)null);
        this.nae.eLb();
        this.nae.deS();
    }

    public long eYS() {
        return this.oah;
    }

    public void oO(long l) {
        this.oah = l;
        String string = aum_0.cWf().cQ(l);
        fse_1.gFu().f("guildMoney", string);
    }

    @Override
    public void Jb(int n) {
        this.eYK();
        if (this.oae != null) {
            this.oae.Jb(n);
        }
    }

    public int cU(short s) {
        fcf_0 fcf_02 = new fcf_0(s);
        this.oaf.O(fcf_02);
        return fcf_02.eEl();
    }
}

