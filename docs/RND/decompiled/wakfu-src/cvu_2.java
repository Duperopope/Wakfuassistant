/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import lombok.Generated;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cVu
 */
public class cvu_2
extends cts_1
implements bex_0,
blj_2,
bis {
    private static final Logger nPk = Logger.getLogger(cvu_2.class);
    private static final String nPl = "buildNameTE";
    private static final cvu_2 nPm = new cvu_2();
    public static final String nPn = "heroBuildWindow";
    public static final String nPo = "sheetsTabContainer";
    public static final int nPp = 0;
    public static final int nPq = 1;
    public static final int nPr = 2;
    private static final Map<Integer, String> nPs = Map.of(0, "equipments", 1, "spells", 2, "aptitudes");
    private final fig_2 nPt = string -> {
        if ("heroBuildDialog".equals(string)) {
            this.C(() -> aue_0.cVJ().b(this));
            return fif_2.uAy;
        }
        return fif_2.uAv;
    };
    private final alx_2 nPu = string -> {
        if ("heroBuildDialog".equals(string)) {
            aue_0.cVJ().b(this);
        }
    };
    private bwi jxy;
    private int nPv;
    private fhe nPw;
    private int nPx;
    private final bwr nPy = new bwr();
    private bwd nPz;
    @Nullable
    private bwz nPA;
    private int nPB = 0;
    private boolean nPC = false;
    private boolean nPD = true;

    public static cvu_2 eTO() {
        return nPm;
    }

    private cvu_2() {
    }

    @Override
    public String ePj() {
        return "heroBuildDialog";
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 18258: {
                this.C(() -> aue_0.cVJ().b(this));
                return false;
            }
            case 17591: {
                this.nPy.dMg();
                return false;
            }
            case 16143: {
                long l = ((dae_0)aam_22).bCp();
                if (l == this.jxy.Sn()) {
                    return false;
                }
                this.a(() -> {
                    if (this.jxy.dmc() && this.nPx != this.jxy.dLD().dnK().wM()) {
                        this.eTY();
                    }
                    this.os(l);
                }, () -> fse_1.gFu().b("characterSheet", nIU.get(this.jxy.Sn()), this.ePj()));
                return false;
            }
            case 19430: {
                int n = ((dae_0)aam_22).bCo();
                if ((long)n == this.jxy.Sn()) {
                    return false;
                }
                this.C(() -> {
                    if (this.jxy.dmc() && this.nPx != this.jxy.dLD().dnK().wM()) {
                        this.eTY();
                    }
                    this.Ng(n);
                });
                return false;
            }
            case 16357: {
                if (!this.jxy.dmc()) {
                    return false;
                }
                bfF bfF2 = (bfF)((dae_0)aam_22).bCv();
                if (bfF2.wp() == this.eTX()) {
                    return false;
                }
                if (this.nPA != null && this.nPA.dLQ()) {
                    this.nPD = false;
                }
                this.J(bfF2.wp(), false);
                return false;
            }
            case 19870: {
                if (this.nPy.dLX()) {
                    return false;
                }
                if (!this.jxy.dmc()) {
                    return false;
                }
                bfF bfF3 = (bfF)((dae_0)aam_22).bCv();
                if (bfF3 == null) {
                    bfF3 = this.nPy.dLW();
                }
                if (bfF3 == null) {
                    return false;
                }
                this.M(this.jxy.Sn(), bfF3.wp());
                return false;
            }
            case 17905: {
                if (!this.jxy.dmc()) {
                    return false;
                }
                dak dak2 = (dak)aam_22;
                if (this.nPy.dLX()) {
                    return false;
                }
                this.a(dak2);
                return false;
            }
            case 18741: {
                if (!this.jxy.dmc()) {
                    return false;
                }
                if (this.nPy.dLX()) {
                    return false;
                }
                if (this.nPA == null || !this.nPA.dMC()) {
                    this.eUd();
                    return false;
                }
                fiq_2.gCw().d(fik_2.a((String string) -> this.eUd()).l("sheet.remove.confirmation", new Object[0]).abQ(1).vG(ccp_2.mRE.byf()));
                return false;
            }
            case 19957: {
                int n = ((dae_0)aam_22).bCo();
                if (n != this.nPB) {
                    bqm_0.jbp.b(new brp_1("heroBuildDialog-" + nPs.get(n)));
                }
                this.nPB = n;
                return false;
            }
            case 16496: {
                if (this.nPy.dLX()) {
                    return false;
                }
                if (!fiu_1.uCW.fd("heroBuildLock")) {
                    return false;
                }
                if (this.nPA != null) {
                    Optional<Integer> optional = this.nPA.dMD();
                    this.nPA.dMy();
                    this.eTQ();
                    optional.ifPresent(czt_2::NI);
                }
                return false;
            }
            case 16982: {
                if (!this.jxy.dmc()) {
                    return false;
                }
                String string2 = ((dae_0)aam_22).bCt();
                this.nPy.dMh().ly(string2);
                return false;
            }
            case 16291: {
                boolean bl = ((dae_0)aam_22).bCu();
                this.nPy.dMh().fB(bl);
                return false;
            }
            case 16002: {
                if (!this.jxy.dmc()) {
                    return false;
                }
                @NotNull bwh bwh2 = (bwh)((Object)((dae_0)aam_22).bCv());
                this.nPy.dMh().a(bwh2);
                return false;
            }
            case 16926: {
                if (!this.jxy.dmc()) {
                    return false;
                }
                dam dam2 = (dam)aam_22;
                this.nPy.dMh().a(dam2.eZG(), dam2.eZH());
                return false;
            }
            case 17399: {
                if (this.nPy.dLX()) {
                    return false;
                }
                if (this.nPA == null || !this.nPA.dMF()) {
                    return false;
                }
                this.ks(false);
                return false;
            }
            case 19288: {
                if (this.nPy.dLX()) {
                    return false;
                }
                this.eUb();
                return false;
            }
            case 18953: {
                if (this.nPy.dLX()) {
                    return false;
                }
                if (!this.jxy.dmc()) {
                    return false;
                }
                this.C(() -> cvu_2.a(new bwt(this.jxy.dLD())));
                return false;
            }
            case 18814: {
                if (this.nPy.dLX()) {
                    return false;
                }
                if (!this.jxy.dmc()) {
                    return false;
                }
                cvu_2.a(new bwu(this.jxy.dLD(), this.nPy.dLW()));
                return false;
            }
            case 19824: {
                if (this.nPy.dLX()) {
                    return false;
                }
                if (!this.jxy.dmc()) {
                    return false;
                }
                dak dak3 = (dak)aam_22;
                this.b(dak3.eZF(), dak3.ewW(), dak3.ewX());
                return false;
            }
            case 16963: {
                if (this.nPy.dLX()) {
                    return false;
                }
                if (!this.jxy.dmc()) {
                    return false;
                }
                cvu_2.a(new bwv(this.jxy.dLD(), this.nPy.dLW()));
                return false;
            }
            case 18646: {
                if (this.nPy.dLX()) {
                    return false;
                }
                if (this.nPA == null) {
                    return false;
                }
                if (!this.nPA.dLQ()) {
                    return false;
                }
                if (!this.jxy.dmc()) {
                    return false;
                }
                if (this.nPA.dMH()) {
                    return false;
                }
                dak dak4 = (dak)aam_22;
                this.b(dak4);
                return false;
            }
            case 17996: {
                if (this.nPy.dLX()) {
                    return false;
                }
                if (!this.jxy.dmc()) {
                    return false;
                }
                if (fyw_0.gqw().to("heroBuildCopyBuildDialog")) {
                    fyw_0.gqw().tl("heroBuildCopyBuildDialog");
                    fse_1.gFu().f("heroBuildCopyBuildView", (Object)null);
                    this.nPz = null;
                } else {
                    boolean bl = ((dae_0)aam_22).bCu();
                    this.nPz = new bwd(this.nPy.dMh(), bl);
                    fse_1.gFu().f("heroBuildCopyBuildView", this.nPz);
                    this.nPz.dLp();
                }
                return false;
            }
            case 17218: {
                if (this.nPy.dLX()) {
                    return false;
                }
                if (!this.jxy.dmc()) {
                    return false;
                }
                dal dal2 = (dal)aam_22;
                this.nPz.hf(dal2.dLz());
                this.nPz.hg(dal2.dLA());
                this.nPz.hh(dal2.dLB());
                return false;
            }
            case 16295: {
                if (this.nPy.dLX()) {
                    return false;
                }
                if (!this.jxy.dmc()) {
                    return false;
                }
                String string3 = ((dae_0)aam_22).bCt();
                this.nPz.mC(string3);
                return false;
            }
            case 16541: {
                if (this.nPy.dLX()) {
                    return false;
                }
                if (!this.jxy.dmc()) {
                    return false;
                }
                dae_0 dae_02 = (dae_0)aam_22;
                boolean bl = dae_02.bCu();
                if (bl) {
                    this.nPz.U(this.nPy.dLW().dhd().tL());
                } else {
                    this.nPz.U(null);
                }
                return false;
            }
            case 17672: {
                if (this.nPy.dLX()) {
                    return false;
                }
                if (!this.jxy.dmc()) {
                    return false;
                }
                dae_0 dae_03 = (dae_0)aam_22;
                this.nPz.he(dae_03.bCu());
                return false;
            }
            case 16537: {
                if (this.nPy.dLX()) {
                    return false;
                }
                if (!this.jxy.dmc()) {
                    return false;
                }
                bfF bfF4 = (bfF)((dae_0)aam_22).bCv();
                this.nPz.f(bfF4);
                return false;
            }
            case 17257: {
                if (this.nPy.dLX()) {
                    return false;
                }
                if (!this.jxy.dmc()) {
                    return false;
                }
                if (this.nPz == null || !this.nPz.dLq()) {
                    return false;
                }
                if (this.nPA != null && this.nPA.dLQ()) {
                    return false;
                }
                bfF bfF5 = this.nPz.dLt();
                bfF bfF6 = this.nPy.dLW();
                if (this.nPz.dLr() == bwf_0.jwz) {
                    this.a(bfF5, bfF6, this.nPz.dLu(), this.nPz.dLs());
                } else {
                    this.a(bfF6, bfF5, this.nPz.dLu(), this.nPz.dLs());
                }
                return false;
            }
            case 17135: {
                dae_0 dae_04 = (dae_0)aam_22;
                this.nPy.dMi().a((bgp_1)dae_04.bCv());
                return false;
            }
            case 16562: {
                bug_0 bug_02 = (bug_0)((dae_0)aam_22).bCv();
                this.nPy.dMi().d(bug_02);
                return false;
            }
            case 18567: {
                boolean bl = ((dae_0)aam_22).bCu();
                this.kt(bl);
                return false;
            }
            case 18183: {
                bil_1 bil_12 = (bil_1)((dae_0)aam_22).bCv();
                Optional<bEp> optional = this.nPy.dMi().b(buh_0.jov);
                Set set = optional.map(bEp2 -> new HashSet<fgj>(bEp2.dCk())).orElse(new HashSet());
                if (bil_12.bqr()) {
                    set.add(bil_12.dxF());
                } else {
                    set.remove(bil_12.dxF());
                }
                this.nPy.dMi().d(new bEp(set));
                return false;
            }
            case 17723: {
                fhw_0 fhw_02 = (fhw_0)((Object)((dae_0)aam_22).bCv());
                this.nPy.dMi().b(fhw_02);
                return false;
            }
            case 19181: {
                dae_0 dae_05 = (dae_0)aam_22;
                this.nPy.dMi().hi(dae_05.bCu());
                return false;
            }
            case 16523: {
                dae_0 dae_06 = (dae_0)aam_22;
                this.nPy.dMi().hj(dae_06.bCu());
                return false;
            }
            case 16113: {
                dae_0 dae_07 = (dae_0)aam_22;
                bwl bwl2 = (bwl)dae_07.bCv();
                bwl2.dLG();
                return false;
            }
            case 19636: {
                if (this.nPy.dLX()) {
                    return false;
                }
                daj daj2 = (daj)aam_22;
                ffV ffV2 = daj2.getItem();
                ffS ffS2 = daj2.dSL();
                this.d(ffV2, ffS2);
                return false;
            }
            case 17213: {
                if (this.nPy.dLX()) {
                    return false;
                }
                bgp_1 bgp_12 = (bgp_1)((ama_1)aam_22).bCv();
                if (bgp_12 == null || bgp_12.getItem() == null) {
                    return false;
                }
                this.b(bgp_12);
                return false;
            }
            case 19306: {
                Object object;
                ffS ffS3;
                if (this.nPy.dLX()) {
                    return false;
                }
                if (this.nPA == null || this.nPA.dLQ()) {
                    return false;
                }
                ffV ffV3 = (ffV)((dae_0)aam_22).bCv();
                if (this.jxy.aXd() && (ffS3 = ffS.gj((byte)((RM)(object = this.jxy.dLE().dme())).dK(ffV3.LV()))) != null) {
                    this.n(ffS3);
                    return false;
                }
                object = (bgt_0)fcI.af(this.jxy.Xi(), ffV3.LV());
                if (object == null) {
                    return false;
                }
                aue_0.cVJ().etu().d(new cjp(((exP)object).Sn(), ffV3.LV()));
                return false;
            }
            case 16240: {
                if (eIp.an(aue_0.cVJ().cVK())) {
                    return false;
                }
                ffV ffV4 = (ffV)((dae_0)aam_22).bCv();
                bgt_0 bgt_02 = (bgt_0)fcI.ac(this.jxy.Xi(), ffV4.LV());
                Optional<ffs_0> optional = bgt_02.dno().te(ffV4.LV());
                if (optional.isEmpty()) {
                    return false;
                }
                long l = optional.get().Lx();
                short s = optional.get().beO();
                long l2 = l;
                if (s < 0) {
                    Optional<Bu<ffs_0, Short>> optional2 = bgt_02.dno().cy(ffV4);
                    if (optional2.isEmpty()) {
                        byi_1.a(byh_1.lAv, "build.split.item.error", new Object[0]);
                        return false;
                    }
                    s = optional2.get().aHI();
                    l2 = optional2.get().getFirst().Lx();
                }
                bgt_02.a(ffV4, (short)1, s, l, l2);
                this.dCb();
                return false;
            }
            case 18186: {
                if (this.nPy.dLX()) {
                    return false;
                }
                if (!this.jxy.dmc()) {
                    return false;
                }
                dcA dcA2 = (dcA)aam_22;
                this.b(dcA2.eeW(), dcA2.fbZ());
                return false;
            }
            case 18116: {
                if (this.nPy.dLX()) {
                    return false;
                }
                if (!this.jxy.dmc()) {
                    return false;
                }
                bmd_0 bmd_02 = (bmd_0)((dae_0)aam_22).bCv();
                this.b(bmd_02);
                return false;
            }
            case 16556: {
                if (this.nPy.dLX()) {
                    return false;
                }
                if (!this.jxy.dmc()) {
                    return false;
                }
                String string4 = ((dae_0)aam_22).bCt();
                frd frd2 = frc.sV(string4);
                if (frd2 == null) {
                    byi_1.a(byh_1.lAv, "build.error.spell.invalid.code", new Object[0]);
                    return false;
                }
                this.e(frd2);
                return false;
            }
            case 18754: {
                if (this.nPy.dLX()) {
                    return false;
                }
                if (!this.jxy.dmc()) {
                    return false;
                }
                dai_0 dai_02 = (dai_0)aam_22;
                this.b(dai_02.eZD(), dai_02.eZE());
                return false;
            }
            case 16416: {
                if (this.nPy.dLX()) {
                    return false;
                }
                if (!this.jxy.dmc()) {
                    return false;
                }
                String string5 = ((dae_0)aam_22).bCt();
                ehy_0 ehy_02 = ben_2.ls(string5);
                this.d(ehy_02);
                return false;
            }
            case 17851: {
                if (this.nPy.dLX()) {
                    return false;
                }
                if (!this.jxy.dmc()) {
                    return false;
                }
                this.d(new ehy_0());
                return false;
            }
        }
        return true;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        ccg_2.eJI().a(this.nPt);
        fyw_0.gqw().a(this.nPu);
        fyw_0.gqw().d("wakfu.heroBuild", cfa_1.class);
        aie_0.cfn().bmE().a(bwo.jxJ, true);
        fiu_1.uCW.vN("heroBuildLock");
        this.nPC = false;
        this.nPD = true;
        this.nPy.dMf();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        this.al(bgt_02);
        bey_0.dTc().a(this);
        super.a(aye_22, false);
        fey_2 fey_22 = (fey_2)fyw_0.gqw().th(this.ePj());
        fhm_1.bJ(fey_22);
        this.nPy.dLT();
        this.b(new bwz(this.jxy, this.nPy.dLW(), false));
        fse_1.gFu().f("heroBuildView", this.nPy);
        this.nPy.dMi().a((bgp_1)null);
        this.nPx = bgt_02.dnK().wM();
        int n = ((bsg_1)aie_0.cfn().bmH()).d(bsn_1.lkG);
        if (n != 0) {
            this.kt(n == 1);
        }
        cAY.eHc().nP(600012L);
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        super.b(aye_22, false);
        this.eUa();
        this.eRy();
        bey_0.dTc().b(this);
        this.eTW();
        this.jxy = null;
        this.nPw = null;
        this.b((bwz)null);
        cAY.eHc().nP(600013L);
    }

    private void eRy() {
        ccg_2.eJI().b(this.nPt);
        fyw_0.gqw().b(this.nPu);
        fyw_0.gqw().tl("heroBuildDialog");
        fyw_0.gqw().tl("createBuildDialog");
        fyw_0.gqw().tl("heroBuildCopyBuildDialog");
        fyw_0.gqw().tc("wakfu.heroBuild");
        aie_0.cfn().bmE().a(bwo.jxJ);
        fiu_1.uCW.vO("heroBuildLock");
    }

    private void os(long l) {
        this.al((bgt_0)fcL.rUh.sw(l));
        this.b((bwz)null);
        this.J(this.jxy.dLD().dnK().wM(), true);
    }

    public void al(@NotNull bgt_0 bgt_02) {
        this.eTP();
        this.jxy = bwi.z(bgt_02);
        this.nPy.a(this.jxy);
        this.nPy.dMi().v(cvu_2.ePJ().valueCollection());
        this.nPv = bgt_02.EY();
        bgt_02.dpg().a(this);
        fse_1.gFu().b("characterSheet", nIU.get(this.jxy.Sn()), this.ePj());
        this.nPw = bgr_1.jVu.tu(this.jxy.Sn());
        bgr_1.jVu.b(this.jxy.Sn(), bgx_2.a(this.nPw));
    }

    private void Ng(int n) {
        if (!fiu_1.uCW.fd("heroBuildLock")) {
            return;
        }
        eJS eJS2 = eJN.qAF.T(bbs_2.xl(), n);
        if (eJS2 == null) {
            return;
        }
        this.q(eJS2);
    }

    private void q(eJS eJS2) {
        this.eTP();
        this.jxy = bwi.k(eJS2);
        this.nPy.a(this.jxy);
        this.nPy.dMi().v(cvu_2.ePJ().valueCollection());
        this.b(new bwz(this.jxy, this.nPy.dLW(), false));
        if (this.nPB == 2) {
            czt_2.NI(0);
        }
    }

    private void eTP() {
        if (this.nPw != null && this.jxy != null && this.nPw.KU() == this.jxy.Sn()) {
            bgr_1.jVu.b(this.jxy.Sn(), this.nPw);
            this.nPw = null;
        }
        if (this.jxy != null && this.jxy.dmc()) {
            this.jxy.dLD().dpg().b(this);
        }
    }

    private void b(bwz bwz2) {
        this.nPA = bwz2;
        this.eTQ();
    }

    private void eTQ() {
        fse_1.gFu().a((aef_2)this.nPy, "hasUnsavedChanges", "isCurrentBuildNew");
        fse_1.gFu().a((aef_2)this.nPy.dLW(), "hasInvalidSheet");
        this.nPy.dMi().dLR();
        this.nPy.dMj().dLR();
        this.nPy.dMk().dLR();
    }

    public void eTR() {
        if (this.nPA != null && this.nPA.dLQ()) {
            fiq_2.gCw().d(new fik_2().l("build.unsaved.changes.fight.start", new Object[0]).vG(ccp_2.mRL.byf()).pb(false).a(new fil_2(400).m("save", new Object[0]).vI("primaryMedium").pf(true).c((String string) -> {
                if (this.nPA.dMF()) {
                    this.ks(false);
                }
            })).a(new fil_2(200).m("build.continue.modifications", new Object[0])));
        }
    }

    public void eTS() {
        this.eUa();
        this.eTV();
    }

    public void dHP() {
        this.eTV();
        this.b(new bwz(this.jxy, this.nPy.dLW(), false));
        if (this.jxy.dmc()) {
            bgr_1.jVu.b(this.jxy.Sn(), bgx_2.a(this.nPw));
        }
    }

    public void eTT() {
        if (!this.dLQ()) {
            this.J(this.eTX(), false);
        }
    }

    public void eTU() {
        this.eTV();
        if (this.nPA == null && !this.jxy.bbj()) {
            this.b(new bwz(this.jxy, this.nPy.dLW(), false));
        }
    }

    public void eTV() {
        fse_1.gFu().a((aef_2)this.nPy, "canEditBuild", "cantEditMessage");
    }

    @Override
    public void y(long l, int n) {
        if (this.jxy != null && this.jxy.Sn() == l) {
            this.nPv += n;
        }
    }

    private void eTW() {
        fcL.rUh.sz(this.jxy.Xi()).forEach(exP2 -> ((bhJ)exP2).dpg().b(this));
    }

    public void ot(long l) {
        if (!cvu_2.eQx()) {
            return;
        }
        if (this.jxy.dmc() && this.jxy.Sn() == l || this.jxy.aXd() && this.jxy.Sn() == -l) {
            this.eUc();
            this.os(aue_0.cVJ().cVK().Sn());
        }
    }

    public void aA(List<eJS> list) {
        if (!this.jxy.aXd()) {
            return;
        }
        for (eJS eJS2 : list) {
            if (eJS2.Sn() != this.jxy.Sn()) continue;
            this.q(eJS2);
            return;
        }
    }

    private int eTX() {
        return this.nPy.dLV();
    }

    public static String Nh(int n) {
        String string = n < 0 ? aum_0.cWf().c("aptitude.real.level", new Object[0]) : aum_0.cWf().c("levelShort.custom", n);
        return aum_0.cWf().c("build.default.name", string);
    }

    public void L(long l, int n) {
        if (eIp.pF(bbs_2.xl())) {
            return;
        }
        if (aue_0.cVJ().cVK().djU()) {
            return;
        }
        if (!new eIn().P(l, n)) {
            return;
        }
        this.M(l, n);
    }

    private void M(long l, int n) {
        if (!cvu_2.eQx() || this.jxy != null && this.jxy.Sn() != l) {
            new eIn().O(l, n);
            cvu_2.c(l, (byte)n);
            return;
        }
        if (this.nPA != null && this.nPA.dLQ()) {
            if (this.nPA.dMF()) {
                this.nPC = true;
                this.ks(false);
            }
            return;
        }
        this.J(n, true);
    }

    private void J(int n, boolean bl) {
        if (!fiu_1.uCW.fd("heroBuildLock")) {
            return;
        }
        this.a(() -> {
            eIn eIn2 = new eIn();
            if (eIn2.Q(this.jxy.Sn(), n) && !eIn2.P(this.jxy.Sn(), n)) {
                this.nPy.FU(n);
                this.b((bwz)null);
                return;
            }
            if (!eIn2.O(this.jxy.Sn(), n)) {
                fse_1.gFu().a((aef_2)this.nPy.dMh(), "currentBuildSheet");
                return;
            }
            if (bl) {
                this.nPx = n;
            }
            this.nPy.FT(n);
            this.b(new bwz(this.jxy, this.nPy.dLW(), false));
            if (bl) {
                cvu_2.c(this.jxy.Sn(), (byte)n);
            }
            this.eUe();
            this.eTZ();
            this.jxy.dLD().OC(this.nPv);
            if (bl) {
                this.nPv = this.jxy.dLD().EY();
            }
        }, () -> {
            this.nPD = true;
            fse_1.gFu().a((aef_2)this.nPy.dMh(), "currentBuildSheet");
        });
    }

    private void eTY() {
        this.C(() -> {
            eIn eIn2 = new eIn();
            eIn2.O(this.jxy.Sn(), this.nPx);
            this.jxy.dLD().OC(this.nPv);
        });
    }

    private void eTZ() {
        this.jxy.dLD().fhn();
        try {
            this.jxy.dLD().e(this.jxy.dLD().dmQ());
            eIj eIj2 = this.jxy.dLD().dnK().fwt();
            this.jxy.dLD().dmE().d(eIj2);
            this.jxy.dLD().dmE().i(eIj2);
            this.jxy.dLD().dmE().j(eIj2);
        }
        finally {
            this.jxy.dLD().fho();
        }
    }

    private static void c(long l, byte by) {
        if (fse_1.gFu().dp("hideDownscaling")) {
            return;
        }
        cjm cjm2 = new cjm();
        cjm2.db(l);
        cjm2.dj(by);
        aue_0.cVJ().etu().d(cjm2);
        if (ctb_2.eQx()) {
            ctb_2.eQy();
        }
    }

    public void C(Runnable runnable) {
        this.a(runnable, () -> {});
    }

    public void a(Runnable runnable, Runnable runnable2) {
        boolean bl;
        if (!cvu_2.eQx() || this.nPA == null || !this.nPA.dLQ()) {
            runnable.run();
            return;
        }
        boolean bl2 = bl = !this.nPy.dLX();
        if (bl && this.nPA.dMF()) {
            this.ks(false);
            runnable.run();
        } else {
            String string2 = bl ? "build.unsaved.cannot.save.invalid" : "build.unsaved.cannot.save.occupation";
            fiq_2.gCw().d(new fik_2().l(string2, this.nPy.dMh().dgT().getName()).vG(ccp_2.mRE.byf()).a(fil_2.gCq().c((String string) -> runnable2.run())).a(new fil_2(400).m("messageBox.continue", new Object[0]).vI("negativeMedium").c((String string) -> {
                this.nPA.hl(true);
                runnable.run();
            })));
        }
    }

    private void a(dak dak2) {
        int n = new eIn().a(this.jxy.Sn(), dak2.eZF(), dak2.ewW(), dak2.ewX(), false);
        if (n == -1) {
            return;
        }
        this.J(n, false);
        this.b(new bwz(this.jxy, this.nPy.dLW(), true));
    }

    public void b(@NotNull String string, short s, int n) {
        boolean bl;
        boolean bl2 = bl = this.nPA == null || this.nPA.a(string, s, n);
        if (!bl) {
            byi_1.a(byh_1.lAv, "build.error.edit.invalid.level", new Object[0]);
            return;
        }
        this.eTQ();
        this.eUe();
        this.nPy.dMb();
        this.nPy.hk(false);
        this.nPy.dMk().deR();
        fse_1.gFu().a((aef_2)this.nPy.dMh(), "currentBuildSheet");
        fse_1.gFu().a((aef_2)this.nPy.dMh().dgT(), bfF.hVj);
    }

    private void b(dak dak2) {
        int n = new eIn().a(this.jxy.Sn(), dak2.eZF(), dak2.ewW(), dak2.ewX(), false);
        if (n == -1) {
            return;
        }
        int n2 = this.nPy.dLV();
        eIj eIj2 = this.jxy.dLD().dnK().PR(n);
        fhk fhk2 = this.jxy.dLD().CL(n2);
        fhk fhk3 = this.jxy.dLD().CL(n);
        frd frd2 = this.jxy.dLD().dnJ().Zx(n2);
        frd frd3 = this.jxy.dLD().dnJ().Zx(n);
        Object t = this.jxy.dLD().dnN().PI(n2);
        Object t2 = this.jxy.dLD().dnN().PI(n);
        if (eIj2 == null || fhk2 == null || fhk3 == null || frd2 == null || frd3 == null || t == null || t2 == null) {
            nPk.error((Object)String.format("[Builds] Error while saving build as, some sheets are null, this should not happen: %s, %s, %s, %s, %s, %s", fhk2, fhk3, frd2, frd3, t, t2));
            this.Ni(n);
            return;
        }
        fhk3.i(fhk2);
        frd3.i(frd2);
        ((ehy_0)t2).m((ehy_0)t);
        bwz bwz2 = new bwz(this.jxy, eIj2, true);
        if (this.nPA != null) {
            bwz2.a(this.nPA);
            this.nPA.hl(false);
        }
        this.J(n, false);
        this.b(bwz2);
        this.ks(true);
    }

    private void ks(boolean bl) {
        if (this.dLQ() && fiu_1.uCW.fd("heroBuildLock")) {
            fiu_1.uCW.N("heroBuildLock", false);
            try {
                aue_0.cVJ().etu().d(this.nPA.hn(bl));
            }
            catch (Exception exception) {
                fiu_1.uCW.N("heroBuildLock", true);
                nPk.error((Object)"[Builds] An unexpected error happened while send save build message", (Throwable)exception);
            }
        }
    }

    public void eUa() {
        if (this.jxy.bbj()) {
            return;
        }
        if (this.nPA != null && this.nPA.dLQ()) {
            this.nPA.hl(false);
        }
        this.b((bwz)null);
        if (this.jxy.dmc()) {
            if (this.nPx != this.jxy.dLD().dnK().wM()) {
                this.eTY();
            }
            if (this.nPw != null && this.jxy != null) {
                bgr_1.jVu.b(this.jxy.Sn(), this.nPw);
            }
        }
    }

    private void eUb() {
        if (!this.dLQ()) {
            return;
        }
        fiq_2.gCw().d(fik_2.a((String string) -> this.eUc()).l("build.discard.confirmation", new Object[0]).vG(ccp_2.mRE.byf()));
    }

    private void eUc() {
        if (this.nPA != null) {
            this.nPA.hl(true);
        }
        this.eTQ();
    }

    public void eUd() {
        int n = this.eTX();
        if (this.nPA != null && this.nPA.dMH()) {
            this.Ni(n);
        } else {
            if (!this.Nj(n)) {
                byi_1.a(byh_1.lAv, "build.error.delete.build.ui", new Object[0]);
                return;
            }
            if (!fiu_1.uCW.fd("heroBuildLock")) {
                return;
            }
            fiu_1.uCW.N("heroBuildLock", false);
            cjn cjn2 = new cjn(this.jxy.Sn(), (byte)n);
            aue_0.cVJ().etu().d(cjn2);
        }
    }

    private void Ni(int n) {
        this.b((bwz)null);
        new eIn().R(this.jxy.Sn(), n);
        this.J(n == this.nPx ? 0 : this.nPx, false);
    }

    public void d(long l2, byte by) {
        Object t = fcL.rUh.sw(l2);
        ArrayList<Long> arrayList = new ArrayList<Long>(t != null ? ((exP)t).CL(by).fUd().values() : List.of());
        new eIn().R(l2, by);
        if (cvu_2.eQx()) {
            if (t != null) {
                fhe fhe2 = ((exP)t).dnP();
                arrayList.forEach(l -> fhe2.B((Long)l).ifPresent(ffV::bYg));
            }
            if (this.jxy.Sn() == l2 && this.nPy.dLW().wp() == by) {
                this.b((bwz)null);
                this.J(by == this.nPx ? 0 : this.nPx, true);
            }
        }
    }

    public void b(long l, int n, @NotNull eIj eIj2, @Nullable fhk fhk2, @Nullable frd frd2, @Nullable ehy_0 ehy_02) {
        boolean bl;
        bhJ bhJ2 = (bhJ)fcL.rUh.sw(l);
        if (bhJ2 == null) {
            return;
        }
        bhJ2.dnK().a(n, eIj2);
        if (fhk2 != null) {
            bhJ2.dnO().a(n, fhk2);
        }
        if (frd2 != null) {
            bhJ2.dnJ().b(n, frd2);
        }
        if (ehy_02 != null) {
            bhJ2.dnN().a(n, ehy_02);
        }
        bhJ2.dlG().a(fqu_0.sTv, n, eIj2.ws());
        cvu_2.eUf();
        boolean bl2 = bl = cvu_2.eQx() && this.jxy != null;
        if (bl) {
            if (this.jxy.Sn() == bhJ2.Sn()) {
                if (this.nPD) {
                    this.b((bwz)null);
                    this.J(n, this.nPC);
                    this.nPC = false;
                }
                this.nPy.dMi().v(cvu_2.ePJ().valueCollection());
            } else if (this.jxy.dmc() && this.nPA == null) {
                this.J(this.jxy.dLD().dnK().wM(), true);
            }
        }
        this.nPD = true;
    }

    public void ou(long l) {
        if (!cvu_2.eQx()) {
            return;
        }
        if (this.jxy != null && this.jxy.aXd() && this.jxy.Sn() == l) {
            this.b((bwz)null);
            eJS eJS2 = eJN.qAF.pR(l);
            if (eJS2 != null) {
                this.q(eJS2);
            } else {
                this.os(aue_0.cVJ().cVK().Sn());
            }
        }
    }

    public boolean dLQ() {
        return this.nPA != null && this.nPA.dLQ();
    }

    public boolean FV(int n) {
        return this.nPA != null && this.nPA.FV(n);
    }

    public boolean FW(int n) {
        return this.nPA == null || this.nPA.FW(n);
    }

    private void a(bfF bfF2, bfF bfF3, bwg bwg2, boolean bl) {
        bwz bwz2;
        this.nPA = bwz2 = new bwz(this.jxy, bfF3, false);
        fhk fhk2 = this.jxy.dLD().CL(bfF2.wp());
        if (bwg2.dLz() && fhk2 != null) {
            if (bl) {
                fhk2 = cvu_2.a(fhk2, this.jxy.dLD().dnP(), bfF3.dhd().am(this.jxy.dLD()));
            }
            bwz2.a(fhk2);
        }
        frd frd2 = this.jxy.dLD().dnJ().Zx(bfF2.wp());
        if (bwg2.dLA() && frd2 != null) {
            frd2 = cvu_2.a(frd2, bfF3.dhd().am(this.jxy.dLD()), bl);
            bwz2.a(frd2);
        }
        Object object = this.jxy.dLD().dnN().PI(bfF2.wp());
        if (bwg2.dLB() && object != null) {
            if (bl) {
                object = cvu_2.a(object, bfF3.dhd().am(this.jxy.dLD()));
            }
            bwz2.b((ehy_0)object);
        }
        this.nPA = null;
        this.J(bfF3.wp(), false);
        this.b(bwz2);
        fyw_0.gqw().tl("heroBuildCopyBuildDialog");
    }

    public void ov(long l) {
        if (this.jxy.Sn() != l) {
            return;
        }
        this.nPy.dMh().aPg();
        fse_1.gFu().a((aef_2)this.nPy.dMh(), bfE.hUJ);
    }

    public void ow(long l) {
        if (this.jxy.Sn() != l) {
            return;
        }
        if (!this.jxy.dmc()) {
            return;
        }
        this.nPx = this.jxy.dLD().dnK().wM();
        this.nPy.dMh().e((Integer n, bfF bfF2) -> fse_1.gFu().a((aef_2)bfF2, "isActive"));
        if (this.nPA == null || !this.nPA.dLQ()) {
            this.J(this.nPx, false);
        }
    }

    private void eUe() {
        Object object;
        Optional optional = this.nPy.dMi().b(buh_0.jou);
        if (optional.isPresent() && !((bww)(object = this.ku(((bww)optional.get()).dMw()))).equals(optional.get())) {
            this.nPy.dMi().d((bug_0<ffV>)object);
        }
        if ((object = fse_1.gFu().aW("editableDescribedSpell", "heroBuildDialog")) instanceof bmx_0) {
            ((bmx_0)object).cj(this.jxy.cmL());
        }
        fse_1.gFu().b("describedSpellRealLevel", this.jxy.cmL(), "heroBuildDialog");
    }

    public void d(ffV ffV2, @Nullable ffS ffS2) {
        if (ffV2.adZ() && !ffV2.fWm() && !ffV2.fUY().fXu().fXw()) {
            fiq_2.gCw().d(fik_2.a((String string) -> this.e(ffV2, ffS2)).l("item.bound.onEquipQuestion", new Object[0]).vG(ccp_2.mRE.byf()));
        } else {
            this.e(ffV2, ffS2);
        }
    }

    private void e(ffV ffV2, @Nullable ffS ffS2) {
        Set<ffS> set;
        ffS ffS3;
        if (this.jxy.dmc()) {
            bgw_1 bgw_12 = (bgw_1)this.eUj();
            ffS3 = ffS2 == null ? fgt.a(bgw_12.dTV(), ffV2) : ffS2;
            set = fgt.e(this.jxy.dLD(), bgw_12.dTV(), ffV2, ffS3);
        } else {
            ffS3 = ffS2 == null ? fgt.a(this.jxy.dLE().dme(), ffV2) : ffS2;
            set = fgt.b(this.jxy.dLE().dme(), ffV2, ffS3);
        }
        this.a(ffV2, ffS3, set, this.nPy.dMi().dLO());
    }

    private void a(@NotNull ffV ffV2, @NotNull ffS ffS2, Set<ffS> set, bgq_1 bgq_12) {
        if (!fiu_1.uCW.fd("heroBuildLock")) {
            return;
        }
        if (this.nPA == null) {
            return;
        }
        Optional<ffS> optional = this.nPA.c(ffV2, ffS2);
        if (optional.isEmpty()) {
            return;
        }
        bgp_1 bgp_12 = bgq_12.g(optional.get());
        cvu_2.a(bgq_12, set);
        cvu_2.a(bgq_12, ffV2);
        bgp_12.setItem(ffV2);
        this.nPy.dMi().dLM();
        this.nPy.dMi().b(ffV2, ffS2);
        this.eTQ();
        fse_1.gFu().a((aef_2)bgp_12, bgp_1.jVn);
        fse_1.gFu().a((aef_2)this.nPy, "equipments");
        fse_1.gFu().a((aef_2)this.ePD(), "actorEquipment");
        fse_1.gFu().a((aef_2)this.nPy.dMi(), "actorDescriptorLibrary", "actorAnimationName", "actorScale");
    }

    public void n(@NotNull ffS ffS2) {
        bgq_1 bgq_12 = this.nPy.dMi().dLO();
        this.b(bgq_12.g(ffS2));
    }

    private void b(@NotNull bgp_1 bgp_12) {
        if (!fiu_1.uCW.fd("heroBuildLock")) {
            return;
        }
        if (this.nPA == null) {
            return;
        }
        Optional<ffS> optional = this.nPA.f(bgp_12.dTQ());
        if (optional.isEmpty()) {
            return;
        }
        this.c(bgp_12);
    }

    public void o(@NotNull ffS ffS2) {
        this.c(this.eUj().g(ffS2));
    }

    private void c(@Nullable bgp_1 bgp_12) {
        if (bgp_12 == null) {
            return;
        }
        bgq_1 bgq_12 = this.eUj();
        if (bgp_12.getItem().dOg().fYp() && bgp_12.dTQ() == ffS.sgR) {
            bgp_1 bgp_13 = bgq_12.g(ffS.sgQ);
            bgp_13.setItem(null);
            fse_1.gFu().a((aef_2)bgp_13, "item", "backgroundImageStyle");
        } else {
            cvu_2.a(bgq_12, List.of(bgp_12.getItem().fWi().fZs()));
        }
        bgp_12.setItem(null);
        this.nPy.dMi().dLM();
        this.nPy.dMi().e(bgp_12.dTQ());
        this.eTQ();
        fse_1.gFu().a((aef_2)bgp_12, bgp_1.jVn);
        fse_1.gFu().a((aef_2)this.nPy, "equipments");
        fse_1.gFu().a((aef_2)this.nPy.dMi(), "actorDescriptorLibrary", "actorAnimationName", "actorScale");
    }

    private static void a(bgq_1 bgq_12, Collection<ffS> collection) {
        for (ffS ffS2 : collection) {
            bgp_1 bgp_12 = bgq_12.g(ffS2);
            bgp_12.setItem(null);
            fse_1.gFu().a((aef_2)bgp_12, bgp_1.jVn);
        }
    }

    private static void a(bgq_1 bgq_12, ffV ffV2) {
        ffV ffV3 = ffV2.to(ffV2.LV());
        ffV2.cE(ffV3);
        for (ffS ffS2 : ffV2.fWi().fZs()) {
            bgp_1 bgp_12 = bgq_12.g(ffS2);
            bgp_12.setItem(ffV3);
            fse_1.gFu().a((aef_2)bgp_12, bgp_1.jVn);
        }
    }

    public void bF(ffV ffV2) {
        if (this.eUj().jW(ffV2.LV())) {
            cvu_2.a(this.eUj(), ffV2);
            if (this.jxy.dmc()) {
                this.jxy.dLD().dlk();
            }
        }
    }

    public void ox(long l) {
        if (cvu_2.eQx() && this.jxy != null && this.jxy.Sn() == l && this.nPw != null) {
            this.nPw.b(this.jxy.dLD().dnP());
        }
    }

    public void J(long l, long l2) {
        if (cvu_2.eQx() && this.jxy != null && this.jxy.Sn() == l && this.nPw != null) {
            this.nPw.A(l2);
        }
    }

    private static fhk a(@NotNull fhk fhk2, @NotNull fhe fhe2, int n) {
        fhk fhk3 = fhk2.fXJ();
        fhk3.fUd().values().removeIf(l -> {
            Optional<ffV> optional = fhe2.B((Long)l);
            return optional.isEmpty() || optional.get().cmL() > n;
        });
        return fhk3;
    }

    public void oy(long l) {
        if (this.jxy.Sn() != l) {
            return;
        }
        this.b(new bwz(this.jxy, this.nPy.dLW(), false));
        this.nPy.dMh().aPg();
        this.nPy.dMa();
    }

    public static void eUf() {
        Object object = fse_1.gFu().aW("itemDetail", "heroBuildDialog");
        if (!(object instanceof ffV)) {
            return;
        }
        ffV ffV2 = (ffV)object;
        ffV ffV3 = fcI.an(bbs_2.xl(), ffV2.LV());
        if (ffV3 != null) {
            fse_1.gFu().b("itemDetail", ffV3, "heroBuildDialog");
        }
    }

    private void kt(boolean bl) {
        bww bww2 = this.ku(bl);
        this.nPy.dMi().d(bww2);
    }

    public void dCb() {
        this.nPy.dMi().v(cvu_2.ePJ().valueCollection());
    }

    public void bG(@NotNull ffV ffV2) {
        if (this.nPA != null && this.nPA.dMG().contains(ffV2.LV())) {
            this.nPA.X(ffV2);
            this.eTQ();
        }
    }

    @Override
    public void d(@Nullable Sl sl) {
        RT rT;
        boolean bl = true;
        if (sl instanceof Sn && (rT = ((Sn)sl).bfD()) instanceof ffV && !((ffV)rT).dOg().fbT()) {
            bl = false;
        }
        if (bl) {
            this.dCb();
        }
    }

    @NotNull
    private bww ku(boolean bl) {
        long l;
        long l2;
        if (this.jxy.dmc()) {
            bfF bfF2 = this.nPy.dMh().dgT();
            int n = bfF2.dhd().am(this.jxy.dLD());
            Bu<Short, Short> bu = eIi.dD((short)n);
            l2 = bl ? (long)bu.getFirst().shortValue() : 0L;
            l = Math.min(this.jxy.dLD().dnG(), bu.aHI().shortValue());
        } else {
            short s = eJW.A(this.jxy.dLE());
            Bu<Short, Short> bu = eIi.dD(s);
            l2 = bl ? (long)bu.getFirst().shortValue() : 0L;
            l = s;
        }
        return new bww(l2, l, bl);
    }

    public void onDragItem(ffV ffV2) {
        this.nPy.dMi().onDragItem(ffV2);
    }

    public void dLN() {
        this.nPy.dMi().dLN();
    }

    @Nullable
    public ffV kT(long l) {
        return this.nPA == null ? null : this.nPA.kT(l);
    }

    public void b(@NotNull bmx_0 bmx_02, @Nullable bmd_0 bmd_02) {
        if (!fiu_1.uCW.fd("heroBuildLock")) {
            return;
        }
        if (this.nPA == null) {
            return;
        }
        bmd_0 bmd_03 = bmd_02;
        if (bmd_03 == null) {
            bmd_03 = this.dgZ().i(bmx_02);
        }
        if (bmd_03 == null || bmd_03.h(bmx_02)) {
            return;
        }
        if (bmd_03.eeY() != ((bmt_0)bmx_02.giP()).eeY()) {
            return;
        }
        boolean bl = this.nPA.a(bmx_02, bmd_03);
        if (!bl) {
            return;
        }
        bmd_03.g(bmx_02);
        this.eTQ();
        fse_1.gFu().a((aef_2)bmd_03, bmd_0.kyV);
        this.nPy.hk(false);
    }

    public void b(@NotNull bmd_0 bmd_02) {
        if (!fiu_1.uCW.fd("heroBuildLock")) {
            return;
        }
        if (this.nPA == null) {
            return;
        }
        boolean bl = this.nPA.a(bmd_02);
        if (!bl) {
            return;
        }
        bmd_02.g(null);
        this.eTQ();
        fse_1.gFu().a((aef_2)bmd_02, bmd_0.kyV);
        this.nPy.hk(false);
    }

    public void eUg() {
        Object object;
        Bu<Integer, Integer> bu2;
        bMW bMW2 = this.nPy.dMh().dgZ();
        List<Bu<Integer, Integer>> list = eIp.b(this.jxy.dLD(), bMW2.efh());
        for (Bu<Integer, Integer> bu2 : list) {
            object = bMW2.cr(bu2.aHI().byteValue());
            if (((bmd_0)object).eeW().axA() != ((Integer)bu2.getFirst()).intValue()) continue;
            this.b((bmd_0)object);
        }
        List<Bu<Integer, Integer>> list2 = eIp.c(this.jxy.dLD(), bMW2.efh());
        bu2 = list2.iterator();
        while (bu2.hasNext()) {
            object = (Bu)bu2.next();
            bmd_0 bmd_02 = bMW2.cs(((Integer)((Bu)object).aHI()).byteValue());
            if (bmd_02.eeW().axA() != ((Integer)((Bu)object).getFirst()).intValue()) continue;
            this.b(bmd_02);
        }
    }

    public void e(@NotNull frd frd2) {
        if (!fiu_1.uCW.fd("heroBuildLock")) {
            return;
        }
        if (this.nPA == null) {
            return;
        }
        frb frb2 = new frb();
        boolean bl = eIp.a((exP)this.jxy.dLD(), frd2).isEmpty();
        frd frd3 = bl ? frd2 : frb2.d(this.jxy.Sn(), frd2);
        if (frd3 == null) {
            return;
        }
        boolean bl2 = this.nPA.a(frd3);
        if (!bl2) {
            return;
        }
        if (!bl) {
            byi_1.c(byh_1.lAv, "error.spellDeck.clean", new Object[0]);
        }
        this.eTQ();
        this.nPy.hk(false);
    }

    public void eeK() {
        if (!this.jxy.dmc()) {
            return;
        }
        this.jxy.dLD().dkB().gje().forEach((l, bmx_02) -> {
            if (bmx_02 != null) {
                fse_1.gFu().a((aef_2)bmx_02, "isInCurrentDeck", "unlockLevel", "isUnlockedSpell");
            }
        });
    }

    public void eUh() {
        this.dgZ().efe();
        this.nPy.hk(false);
    }

    private static frd a(@NotNull frd frd2, int n, boolean bl) {
        Object object;
        frd frd3 = frd2.gjQ();
        ArrayList<Integer> arrayList = frd3.eEu();
        for (int i = 0; i < arrayList.size(); ++i) {
            Integer n2 = arrayList.get(i);
            if (n2 == 0 || (object = fqF.giR().Ig(n2)) != null && fra.sXn[i] <= n && (!bl || ((fqD)object).cvo() <= n)) continue;
            frd3.gp(0, i);
        }
        ArrayList<Integer> arrayList2 = frd3.eEv();
        for (int i = 0; i < arrayList2.size(); ++i) {
            Object Spell;
            object = arrayList2.get(i);
            if ((Integer)object == 0 || (Spell = fqF.giR().Ig((Integer)object)) != null && fra.sXo[i] <= n && (!bl || ((fqD)Spell).cvo() <= n)) continue;
            frd3.gq(0, i);
        }
        return frd3;
    }

    private beo_2 dha() {
        return this.nPy.dMh().dha();
    }

    public void b(@NotNull bes_2 bes_22, int n) {
        if (!fiu_1.uCW.fd("heroBuildLock")) {
            return;
        }
        if (this.nPA == null) {
            return;
        }
        int n2 = n > 0 ? Math.min(n, bes_22.bl(this.jxy.dLD().dnG())) : Math.max(n, -bes_22.cmL());
        this.nPA.b(bes_22, n2);
        bes_22.dfe().deW();
        this.nPy.dMk().deS();
        this.eTQ();
        this.jxy.dLD().b(this.jxy.dLD().dmQ(), true);
    }

    public void d(@NotNull ehy_0 ehy_02) {
        if (!fiu_1.uCW.fd("heroBuildLock")) {
            return;
        }
        if (this.nPA == null) {
            return;
        }
        this.nPA.b(ehy_02);
        this.eUi();
        this.eTQ();
        this.jxy.dLD().b(this.jxy.dLD().dmQ(), true);
    }

    public void eUi() {
        this.nPy.dMk().deR();
        this.nPy.dMk().deS();
    }

    private static ehy_0 a(@NotNull ehy_0 ehy_02, int n2) {
        ehy_0 ehy_03 = ehy_02.fwd();
        eHL eHL2 = eHK.qsX.du((short)n2);
        block0: for (int n3 : eHK.qsX.fvW()) {
            int n4 = ehy_03.PH(n3) - eHL2.PE(n3);
            if (n4 <= 0) continue;
            List<Integer> list = eHK.qsX.PD(n3).stream().sorted(Comparator.comparingInt(n -> {
                Object t = eHJ.qsV.Py((int)n);
                return t == null || ((ehw_0)t).bWc() <= 0 ? 0 : 1;
            })).toList();
            for (Integer n5 : list) {
                short s = ehy_03.PG(n5);
                if (s > 0) {
                    int n6 = Math.max(0, s - n4);
                    ehy_03.p(n5, (short)n6);
                    n4 -= s - n6;
                }
                if (n4 > 0) continue;
                continue block0;
            }
        }
        return ehy_03;
    }

    @Contract(pure=true)
    public static boolean eQx() {
        return aue_0.cVJ().c(nPm);
    }

    private bgq_1 eUj() {
        return this.nPy.dMi().dLO();
    }

    private bMW dgZ() {
        return this.nPy.dMh().dgZ();
    }

    public Optional<bmd_0> l(bmx_0 bmx_02) {
        if (bmx_02 == null) {
            return Optional.empty();
        }
        return this.dgZ().Ii(bmx_02.axA());
    }

    public boolean eUk() {
        return this.nPA != null && this.nPA.dMH();
    }

    public boolean eUl() {
        return this.nPy.dLX();
    }

    @Nullable
    public static bgt_0 eUm() {
        if (cvu_2.nPm.jxy == null) {
            return null;
        }
        return cvu_2.nPm.jxy.dLD();
    }

    @Nullable
    public static eJS eUn() {
        if (cvu_2.nPm.jxy == null) {
            return null;
        }
        return cvu_2.nPm.jxy.dLE();
    }

    @Nullable
    public static bhx_0 eUo() {
        if (cvu_2.nPm.jxy == null) {
            return null;
        }
        if (!cvu_2.nPm.jxy.aXd()) {
            return null;
        }
        return (bhx_0)cvu_2.nPm.jxy.dcP();
    }

    public static short eUp() {
        if (cvu_2.nPm.jxy == null) {
            return 0;
        }
        return cvu_2.nPm.jxy.cmL();
    }

    public static long cCv() {
        if (cvu_2.nPm.jxy == null) {
            return 0L;
        }
        return cvu_2.nPm.jxy.Sn();
    }

    public static short eUq() {
        if (cvu_2.nPm.jxy == null) {
            return aue_0.cVJ().cVK().dnG();
        }
        if (cvu_2.nPm.jxy.aXd()) {
            return nPm.eUr().dLE().cmL();
        }
        return cvu_2.nPm.jxy.dLD().dnG();
    }

    public boolean Nj(int n) {
        if (!this.jxy.dmc()) {
            return false;
        }
        return !eIp.an(this.jxy.dLD()) && eIn.c(this.jxy.dLD(), n);
    }

    private static void a(bws bws2) {
        if (fyw_0.gqw().to("createBuildDialog")) {
            fyw_0.gqw().tl("createBuildDialog");
            fse_1.gFu().f("heroBuildBuildCreationView", (Object)null);
        } else {
            fse_1.gFu().f("heroBuildBuildCreationView", bws2);
            fey_2 fey_22 = (fey_2)ccj_2.g("createBuildDialog", 33024L);
            fhv_1 fhv_12 = fey_22.getElementMap().uH(nPl);
            if (fhv_12 instanceof fdv_1) {
                ((fdv_1)fhv_12).setFocused(true);
            }
        }
    }

    public static void a(@NotNull ffV ffV2, @NotNull bhJ bhJ2) {
        if (cvu_2.eQx()) {
            cvu_2.eTO().bF(ffV2);
        } else if (bhJ2.dmL().fa(ffV2.LV())) {
            bhJ2.dlk();
        }
    }

    public static boolean a(long l, @NotNull bhJ bhJ2) {
        if (cvu_2.eQx()) {
            return cvu_2.eTO().eUj().jW(l);
        }
        return bhJ2.dmL().fa(l);
    }

    @Override
    public void c(fqt_0 fqt_02) {
    }

    @Override
    protected boolean ePM() {
        return false;
    }

    @Generated
    public bwi eUr() {
        return this.jxy;
    }

    @Generated
    public int eUs() {
        return this.nPx;
    }
}

