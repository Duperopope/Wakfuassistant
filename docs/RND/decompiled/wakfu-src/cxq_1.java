/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TLongObjectProcedure
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import com.ankamagames.wakfu.client.console.command.display.ShowNameAndHighlightElementsCommand;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TLongObjectProcedure;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from cXq
 */
public class cxq_1
implements WT,
adi_1,
aeh_2,
bgh_0 {
    private static final Logger nVj = Logger.getLogger(cxq_1.class);
    private static final cxq_1 nVk = new cxq_1();
    public static final String nVl = "pvpRankIconUrl";
    public static final String nVm = "pvpRankEnabled";
    public static final String nVn = "overHeadInfos";
    public static final String nVo = "breedIconUrl";
    public static final String nVp = "breedIconColor";
    public static final String nVq = "title";
    public static final String nVr = "breed";
    public static final String nVs = "monsters";
    public static final String nVt = "hooded";
    public static final String nVu = "resource";
    public static final String nVv = "attackerOverHeadInfos";
    public static final String nVw = "defenderOverHeadInfos";
    public static final String nVx = "attackerTeamTotalLevel";
    public static final String nVy = "defenderTeamTotalLevel";
    public static final String nVz = "fightStatus";
    public static final String nVA = "fightInfos";
    public static final String nVB = "isAttackerPlayerCharacter";
    public static final String nVC = "isDefenderPlayerCharacter";
    public static final String nVD = "isFightSwordElement";
    public static final String nVE = "ownerStatus";
    public static final String nVF = "displayResistances";
    public static final String[] nVG = new String[]{"pvpRankEnabled", "pvpRankIconUrl", "overHeadInfos", "attackerOverHeadInfos", "defenderOverHeadInfos", "breedIconUrl", "breedIconColor", "attackerTeamTotalLevel", "defenderTeamTotalLevel", "isAttackerPlayerCharacter", "isDefenderPlayerCharacter", "fightStatus", "fightInfos", "title", "isFightSwordElement", "ownerStatus", "displayResistances"};
    private static final int nVH = 88;
    private feq_1 nVI;
    private feq_1 nVJ;
    private List<dcj_0> nVK = new ArrayList<dcj_0>();
    private WP nVL;
    private dci_0 nVM;
    private String nVN;
    private String nVO;
    private String cxT;
    private boolean nVP;
    private boolean nVQ;
    private String nVR;
    private String nVS;
    private String nVT;
    private String nVU;
    private long nVV;
    private boolean nVW;
    private List<dcj_0> nVX = new ArrayList<dcj_0>();
    private List<dcj_0> nVY = new ArrayList<dcj_0>();
    final TLongObjectHashMap<cxr_1> nVZ = new TLongObjectHashMap();

    public static cxq_1 eWO() {
        return nVk;
    }

    public WP eWP() {
        return this.nVL;
    }

    public void a(WP wP) {
        if (wP != null) {
            wP.b(this);
        }
        if (wP != this.nVL) {
            return;
        }
        this.nVL = null;
        if (this.nVI != null) {
            this.nVI.setVisible(false);
        }
        if (this.nVJ != null) {
            this.nVJ.setVisible(false);
        }
        if (bsd_1.emW() == bsd_1.lhC) {
            akj_0.ciY().cjb();
        }
        abb_2.bUA().b(this);
        if (this.nVL instanceof aJI) {
            abb_2.bUA().hk(this.nVV);
        }
    }

    public void oD(long l) {
        if (!(this.nVL instanceof bdj_2)) {
            return;
        }
        bgy bgy2 = ((bdj_2)this.nVL).dcP();
        if (!(bgy2 instanceof bhJ)) {
            return;
        }
        if (bgy2.Ya() != l) {
            return;
        }
        this.nVM.fbw().clear();
        bdn_2.a(bgy2, this.nVM);
        this.nVK = this.nVM.fbw();
        fse_1.gFu().a((aef_2)this, nVG);
    }

    @Override
    public boolean b(aam_2 aam_22) {
        if (aam_22 instanceof aba_2) {
            aba_2 aba_22 = (aba_2)aam_22;
            if (aba_22.bUx() == this.nVV) {
                this.eWQ();
            } else {
                this.eWS();
            }
            return false;
        }
        if (aam_22.d() == 17109) {
            dch_0 dch_02 = (dch_0)aam_22;
            this.a(dch_02.fbv());
            return false;
        }
        return true;
    }

    private void eWQ() {
        aJI aJI2 = (aJI)this.nVL;
        bsi_0 bsi_02 = aJI2.chZ();
        aJC.b(this.nVM, bsi_02);
        this.nVU = this.nVM.fbG();
        fse_1.gFu().a((aef_2)this, nVA);
    }

    public void eWR() {
        this.nVL = this.nVM.fbv();
        this.nVL.a(this);
    }

    public void a(dci_0 dci_02) {
        abb_2.bUA().b(this);
        this.nVM = dci_02;
        long l = this.nVM.fbD() ? (long)this.nVM.dND() : (aue_0.cVJ().cVK().dkZ() != null ? 0L : (long)(((bsg_1)aie_0.cfn().bmH()).c(bsn_1.lju) * 1000.0f));
        this.eWR();
        if (l == 0L) {
            this.eWS();
        } else {
            abb_2.bUA().a(this, l, 0, 1L);
        }
    }

    private void eWS() {
        Object object;
        if (this.nVI == null) {
            return;
        }
        this.nVI.setVisible(false);
        this.nVJ.setVisible(false);
        WP wP = this.nVM.fbv();
        feq_1 feq_12 = this.nVI;
        if (wP instanceof bdj_2) {
            object = (bdj_2)wP;
            if (((bdj_2)object).dcP().aFW() == 0) {
                feq_12 = this.nVJ;
            }
            if (bsd_1.emW() == bsd_1.lhC && ((bdj_2)object).bqo() != -1 && !aue_0.cVJ().c(cuk_2.eSS())) {
                akj_0.ciY().ig(((bdj_2)object).Sn());
            }
        }
        fyw_0.gqw().a("overheadDialog", wP);
        fyw_0.gqw().a("overheadPlayerDialog", wP);
        feq_12.getAppearance().setModulationColor(new awx_2(awx_2.dnF.aTn()));
        this.nVK = this.nVM.fbw();
        this.nVN = this.nVM.fbB();
        this.nVO = this.nVM.fbC().toString();
        this.nVX = this.nVM.fbx();
        this.nVY = this.nVM.fby();
        this.nVR = this.nVM.fbE();
        this.nVS = this.nVM.fbF();
        this.nVP = this.nVM.fbz();
        this.nVQ = this.nVM.fbA();
        this.nVT = this.nVM.fbH();
        this.nVU = this.nVM.fbG();
        if (this.nVL instanceof aJI) {
            this.nVV = abb_2.bUA().a(this, 1000L, 0, -1L);
        }
        this.cxT = this.nVM.bAD();
        fse_1.gFu().a((aef_2)this, nVG);
        object = new awx_2(wP.bnf());
        ((awx_2)object).setAlpha(0.9f);
        this.nVI.getAppearance().setModulationColor((axb_2)object);
        if (!this.nVK.isEmpty()) {
            feq_12.setVisible(true);
        }
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.nVI = (feq_1)ccj_2.g("overheadDialog", 139264L);
            this.nVI.setVisible(false);
            this.nVJ = (feq_1)ccj_2.g("overheadPlayerDialog", 139264L);
            this.nVJ.setVisible(false);
            fse_1.gFu().f("overHead", this);
            bgg_0.dlO().a(this);
            cdv_0.euj().d(this);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.nVZ.clear();
            fyw_0.gqw().tl("overheadDialog");
            this.nVI = null;
            fyw_0.gqw().tl("overheadPlayerDialog");
            this.nVJ = null;
            abb_2.bUA().b(this);
            fse_1.gFu().vX("overHead");
            bgg_0.dlO().c(this);
            cdv_0.euj().e(this);
        }
    }

    @Override
    public long Sn() {
        return 88L;
    }

    @Override
    public void dC(long l) {
    }

    @Override
    public String[] bxk() {
        return nVG;
    }

    @Override
    public Object eu(String string) {
        Object object;
        if (string == null) {
            return null;
        }
        switch (string) {
            case "overHeadInfos": {
                return this.nVK;
            }
            case "attackerOverHeadInfos": {
                return this.nVX;
            }
            case "defenderOverHeadInfos": {
                return this.nVY;
            }
            case "defenderTeamTotalLevel": {
                return this.nVS;
            }
            case "attackerTeamTotalLevel": {
                return this.nVR;
            }
            case "fightStatus": {
                return this.nVT;
            }
            case "fightInfos": {
                return this.nVU;
            }
            case "breedIconUrl": {
                return this.nVN;
            }
            case "breedIconColor": {
                return this.nVO;
            }
            case "isAttackerPlayerCharacter": {
                return this.nVP;
            }
            case "isDefenderPlayerCharacter": {
                return this.nVQ;
            }
            case "title": {
                return this.cxT;
            }
            case "isFightSwordElement": {
                return this.nVL instanceof aJI;
            }
            case "ownerStatus": {
                if (!(this.nVL instanceof bzj_0)) {
                    return false;
                }
                bzj_0 bzj_02 = (bzj_0)this.nVL;
                return bzj_02.dOw();
            }
            case "displayResistances": {
                return this.nVW;
            }
        }
        if (string.equals(nVl)) {
            if (this.nVL instanceof bdj_2 && ((exP)(object = ((bdj_2)this.nVL).dcP())).aFW() == 0) {
                int n = ((exP)object).ffF().Xt();
                fpp_0 fpp_02 = ((exP)object).ffF().gbb();
                return auc_0.cVq().a("pvpRankIconsPath", "defaultIconPath", n, fpp_02.aJr());
            }
            return null;
        }
        if (string.equals(nVm)) {
            if (!(this.nVL instanceof bdj_2)) {
                return false;
            }
            object = ((bdj_2)this.nVL).dcP();
            if (((exP)object).aFW() != 0) {
                return false;
            }
            return !fjo_0.a(fjo_0.sys, ((exP)object).ffF().ems());
        }
        return null;
    }

    @Override
    public void b(boolean bl, WU wU) {
        if (!bl) {
            this.a(this.nVL);
        }
    }

    boolean c(bgy bgy2, bgt_0 bgt_02) {
        if (!bgt_02.dnQ().dfG()) {
            return false;
        }
        eyp_1 eyp_12 = bgt_02.dnQ().dKL();
        switch (bgy2.aFW()) {
            case 0: {
                return eyp_12.rw(bgy2.Sn()) != null;
            }
            case 5: {
                bgy bgy3 = bgy2.djY();
                if (bgy3 == null || bgy3.aFW() == 5) {
                    return false;
                }
                return this.c(bgy3, bgt_02);
            }
        }
        return false;
    }

    boolean cf(bgy bgy2) {
        if (!(bgy2 instanceof bhJ)) {
            return false;
        }
        return apd_0.cAO().cAQ().d(apd_0.cAO().jk(bgy2.getName())) != null;
    }

    public void eWT() {
        bgg_0.dlO().n((TObjectProcedure<bgy>)((TObjectProcedure)bgy2 -> {
            if (bgy2.i(ezj_0.pss)) {
                return true;
            }
            Bz.e(bgy2.aWO());
            this.cg((bgy)bgy2);
            return true;
        }));
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        Bz.e(bgt_02 == null ? (byte)0 : bgt_02.aWO());
        cxq_1.eWU();
    }

    private static void eWU() {
        aUQ aUQ2 = aue_0.cVJ().cVO();
        if (aUQ2 == null || !evm_2.b(aUQ2.cWq(), evn_2.ovj)) {
            return;
        }
        afh_0.bxU().d((TObjectProcedure<? super afk_0>)((TObjectProcedure)afk_02 -> {
            if (afk_02 instanceof bzj_0) {
                ((bzj_0)afk_02).dQl();
            }
            return true;
        }));
    }

    public void eWV() {
        this.nVZ.forEachValue(cxr_12 -> {
            cxr_12.clean();
            return true;
        });
        this.eWW();
    }

    private void eWW() {
        aUQ aUQ2 = aue_0.cVJ().cVO();
        if (aUQ2 == null || !evm_2.b(aUQ2.cWq(), evn_2.ovj)) {
            return;
        }
        afh_0.bxU().d((TObjectProcedure<? super afk_0>)((TObjectProcedure)afk_02 -> {
            if (afk_02 instanceof bzj_0) {
                this.a((WP)afk_02);
            }
            return true;
        }));
    }

    public void cg(bgy bgy2) {
        cxr_1 cxr_12 = (cxr_1)this.nVZ.remove(bgy2.Sn());
        if (cxr_12 != null) {
            cxr_12.clean();
        }
        cxr_1 cxr_13 = new cxr_1(this, bgy2);
        this.nVZ.put(bgy2.Sn(), (Object)cxr_13);
    }

    public void eWX() {
        this.nVW = !this.nVW;
        this.eWY();
    }

    public void eWY() {
        if (this.nVW) {
            cxq_1.eWZ();
        } else {
            cxq_1.eXa();
        }
    }

    public void kN(boolean bl) {
        this.nVW = bl;
        this.eWY();
    }

    private static void eWZ() {
        bgg_0.dlO().a((TLongObjectProcedure<bgy>)((TLongObjectProcedure)(l, bgy2) -> {
            cxq_1.ch(bgy2);
            return true;
        }));
        fse_1.gFu().a((aef_2)nVk, nVF);
    }

    private static void ch(bgy bgy2) {
        if (bgy2.djB() && !bgy2.dlw() && !bgy2.dkj()) {
            bgy2.fT(true);
        } else {
            bgy2.fT(false);
        }
    }

    private static void eXa() {
        bgg_0.dlO().a((TLongObjectProcedure<bgy>)((TLongObjectProcedure)(l, bgy2) -> {
            bgy2.fT(false);
            return true;
        }));
        fse_1.gFu().a((aef_2)nVk, nVF);
    }

    public void ci(bgy bgy2) {
        if (this.nVW) {
            cxq_1.ch(bgy2);
        }
    }

    public static void cj(bgy bgy2) {
        bgy2.fT(false);
    }

    @Override
    public void ap(bgy bgy2) {
        if (ShowNameAndHighlightElementsCommand.apo() && (bgy2.aFW() == 5 || bgy2.aFW() == 0)) {
            this.cg(bgy2);
        }
        if (this.nVW) {
            cxq_1.ch(bgy2);
        }
    }
}

