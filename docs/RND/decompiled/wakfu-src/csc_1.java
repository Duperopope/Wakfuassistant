/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cSc
 */
public class csc_1
implements adi_1 {
    protected static final Logger nEF = Logger.getLogger(csc_1.class);
    private static final byte nEG = 0;
    private static final byte nEH = 1;
    protected static final int nEI = 10000;
    static final csc_1 nEJ = new csc_1();
    private bcu_2 nEK;
    private bcd_1 nEL;
    private final Map<Long, Set<Integer>> nEM = new HashMap<Long, Set<Integer>>();
    private final bca_1 nEN = new bca_1();
    private final bca_1 nEO = new bca_1();
    private long aDh;
    protected final ArrayList<bci_1> nEP = new ArrayList(3);
    private String nEQ;
    int nER = -1;
    private static final String nES = ",";

    public boolean eNI() {
        if (this.nEK == null) {
            return false;
        }
        return this.nEK.dbh();
    }

    public static csc_1 eNJ() {
        return nEJ;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 16276: {
                dag dag2 = (dag)aam_22;
                bcy_1 bcy_13 = dag2.eZC();
                csc_1.b(null);
                if (bcy_13 == null || bcy_13 instanceof bck_2) {
                    bcy_13 = this.nEK.dbm();
                }
                this.nEK.a(bcy_13);
                return false;
            }
            case 19755: {
                bde_2 bde_22 = (bde_2)((Object)((dae_0)aam_22).bCv());
                bca_1 bca_12 = this.eNK();
                bca_12.a(bde_22);
                this.nEK.a(bca_12);
                return false;
            }
            case 19202: {
                dae_0 dae_02 = (dae_0)aam_22;
                bug_0 bug_02 = (bug_0)dae_02.bCv();
                bca_1 bca_13 = this.eNK();
                bca_13.a(bug_02);
                this.nEK.a(bca_13);
                return false;
            }
            case 17909: {
                dah_0 dah_02 = (dah_0)aam_22;
                bci_1 bci_12 = dah_02.eoY();
                if (dah_02.bCt() != null) {
                    this.a(bci_12, dah_02.bCt());
                } else {
                    this.l(bci_12);
                }
                return false;
            }
            case 19663: {
                Object object;
                ama_1 ama_12 = (ama_1)aam_22;
                this.aDh = ama_12.bCp();
                this.eNQ();
                bcy_1 bcy_14 = this.nEK.dbo();
                int n2 = fse_1.gFu().getProperty("logbookViewTab").bGI();
                if (n2 == 0) {
                    this.nEK = bcm_1.hIK.jk(this.aDh);
                } else if (n2 == 1) {
                    this.nEK = bcm_1.hIK.jl(this.aDh);
                }
                this.nEK.a(this.nEK.Bl(bcy_14.d()));
                this.nEK.a(this.eNK());
                fse_1.gFu().f("achievementsManager", this.nEK);
                fse_1.gFu().f("questsView", bcm_1.hIK.jk(this.aDh));
                fse_1.gFu().f("achievementsView", bcm_1.hIK.jl(this.aDh));
                fse_1.gFu().a((aef_2)this.nEK, "categories", "allFilteredQuests");
                bci_1 bci_13 = (bci_1)fse_1.gFu().vY("selectedAchievement");
                if (bci_13 != null) {
                    object = bcm_1.hIK.t(this.aDh, bci_13.d());
                    this.l((bci_1)object);
                }
                if ((object = fse_1.gFu().getProperty("selectedAchievementCategoryView")) == null) {
                    return false;
                }
                Object object2 = ((fsf_1)object).getValue();
                if (!(object2 instanceof bcy_1)) {
                    fse_1.gFu().f("selectedAchievementCategoryView", (Object)null);
                    return false;
                }
                bcy_1 bcy_15 = (bcy_1)object2;
                bcy_1 bcy_16 = bcm_1.hIK.u(this.aDh, bcy_15.d());
                fse_1.gFu().f("selectedAchievementCategoryView", bcy_16);
                return false;
            }
            case 17386: {
                ama_1 ama_13 = (ama_1)aam_22;
                bci_1 bci_14 = (bci_1)ama_13.bCv();
                boolean bl = ama_13.bCu();
                if (bl) {
                    this.Mp(bci_14.d());
                } else {
                    this.Mq(bci_14.d());
                }
                this.nEK.a(this.eNK());
                fse_1.gFu().a((aef_2)bci_14, "isHidden");
                fse_1.gFu().a("selectedAchievement", fse_1.gFu().vY("selectedAchievement"), true);
                return false;
            }
            case 18839: {
                ama_1 ama_14 = (ama_1)aam_22;
                int n3 = ama_14.bCo();
                boolean bl = ama_14.bCu();
                csc_1.G(n3, bl);
                return false;
            }
            case 16242: {
                ama_1 ama_15 = (ama_1)aam_22;
                int n4 = ama_15.bCo();
                bgt_0 bgt_02 = aue_0.cVJ().cVK();
                if (!bgt_02.dnQ().dfG()) {
                    aPd.f("chat.notify.questSharedWithNobody", new Object[0]);
                } else {
                    cji_0 cji_02 = new cji_0(n4);
                    aue_0.cVJ().etu().d(cji_02);
                }
                return false;
            }
            case 16333: {
                ama_1 ama_16 = (ama_1)aam_22;
                int n5 = ama_16.bCo();
                aue_0.cVJ().cVK().dpy().Ba(n5);
                return false;
            }
            case 16040: {
                ama_1 ama_17 = (ama_1)aam_22;
                bcy_1 bcy_17 = (bcy_1)ama_17.bCv();
                bcy_17.dLG();
                return false;
            }
            case 17517: {
                ama_1 ama_18 = (ama_1)aam_22;
                boolean bl = ama_18.bCu();
                if (this.nEK.dbh()) {
                    this.nEK.dbo().dbH().forEach((n, bch_22) -> bch_22.fm(bl));
                } else {
                    this.nEK.dbn().forEach(bcy_12 -> bcy_12.fm(bl));
                    this.nEK.dbo().dbH().forEach((n, bch_22) -> bch_22.fm(bl));
                }
                return false;
            }
            case 17055: {
                ama_1 ama_19 = (ama_1)aam_22;
                bci_1 bci_15 = (bci_1)ama_19.bCv();
                bci_15.dLG();
                return false;
            }
            case 18924: {
                dae_0 dae_03 = (dae_0)aam_22;
                byte by = dae_03.bCn();
                this.dZ(by);
                return false;
            }
            case 17221: {
                dae_0 dae_04 = (dae_0)aam_22;
                bcy_1 bcy_18 = (bcy_1)dae_04.bCv();
                fse_1.gFu().f("selectedAchievementCategoryView", bcy_18);
                fse_1.gFu().a((aef_2)bcy_18, "achievements");
                return false;
            }
        }
        return true;
    }

    public bca_1 eNK() {
        if (this.nEK == null) {
            return null;
        }
        return this.nEK.dbh() ? this.nEN : this.nEO;
    }

    public static Optional<eAa> eNL() {
        return bbs_2.a(eva_1.owF);
    }

    public static void G(int n, boolean bl) {
        bcd_2 bcd_22 = aue_0.cVJ().cVL().dpy();
        boolean bl2 = bcd_22.a(n, bl);
        if (bl2) {
            csc_1.H(n, bl);
        } else {
            fse_1.gFu().a((aef_2)bci_2.hDG, "regularQuests");
        }
    }

    public static void H(int n, boolean bl) {
        cjh_0 cjh_02 = new cjh_0(n, bl);
        aue_0.cVJ().etu().d(cjh_02);
    }

    private boolean l(bci_1 bci_12) {
        if (bci_12 == null) {
            bci_12 = this.nEK.dbj();
            this.nEK.a(this.nEK.dbm());
        }
        if (bci_12 == null) {
            return true;
        }
        csc_1.b(bci_12);
        fse_1.gFu().f("overQuickAchievement", bci_12);
        fse_1.gFu().a((aef_2)this.nEK.dbo(), "achievementsQuickList");
        return false;
    }

    public static boolean eNM() {
        boolean bl = !fkj_2.gCW().vS("followedAchievementsDialog") || fkj_2.gCW().vT("followedAchievementsDialog");
        String string = bl ? "verticalFollowedAchievementsDialog" : "followedAchievementsDialog";
        return fyw_0.gqw().to(string);
    }

    public void jY(boolean bl) {
        String string;
        boolean bl2 = !fkj_2.gCW().vS("followedAchievementsDialog") || fkj_2.gCW().vT("followedAchievementsDialog");
        String string2 = string = bl2 ? "verticalFollowedAchievementsDialog" : "followedAchievementsDialog";
        if (bl) {
            czm_2.eZa();
            long l = 57360L;
            fey_2 fey_22 = (fey_2)ccj_2.g(string, 57360L);
            fkj_2.gCW().a(fey_22, false);
            fey_22.setHorizontalDialog("followedAchievementsDialog");
            fey_22.setVerticalDialog("verticalFollowedAchievementsDialog");
            this.bC(fey_22);
            fyw_0.gqw().d("wakfu.followedAchievements", cek_2.class);
        } else {
            fyw_0.gqw().J(string, true);
            fyw_0.gqw().tc("wakfu.followedAchievements");
        }
    }

    public void bC(@NotNull fey_2 fey_22) {
        fey_22.setEnableResizeEvents(true);
        fey_22.setEnablePositionEvents(true);
        fey_22.a(fzq_0.tKi, fiq_12 -> {
            this.nER = fey_22.getY() + fey_22.getHeight();
            return false;
        }, false);
        fey_22.a(fzq_0.tKh, new csd_1(this, fey_22), true);
    }

    private void dZ(byte by) {
        fse_1.gFu().f("logbookViewTab", by);
        if (by == 0) {
            this.nEK = bcm_1.hIK.jk(this.aDh);
        } else if (by == 1) {
            this.nEK = bcm_1.hIK.jl(this.aDh);
        }
        bca_1 bca_12 = this.eNK();
        fse_1.gFu().f("achievementFilters", bca_12);
        this.nEK.a(bca_12);
        fse_1.gFu().f("achievementsManager", this.nEK);
        fse_1.gFu().a((aef_2)this.nEK, "categories", "allFilteredQuests");
    }

    private void a(bci_1 bci_12, String string) {
        String string2 = "achievementDescriptionDialog" + bci_12.d();
        if (!fyw_0.gqw().to(string2)) {
            fyw_0.gqw().a(string2, ccj_2.pe("achievementDescriptionDialog"), this.nEQ == null ? string : this.nEQ, string, "achievementDescriptionDialog");
            this.nEQ = string2;
            fse_1.gFu().b("editableDescribedAchievement", bci_12, string2);
        } else {
            fyw_0.gqw().tl(string2);
        }
    }

    public static void Mo(int n) {
        abg_2.bUP().a((Runnable)new cse_2(n), 500L, 1);
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
        if (bl) {
            return;
        }
        this.aDh = aue_0.cVJ().cVK().Sn();
        this.eNQ();
        cdv_0.euj().d(this);
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        this.bmX();
        cdv_0.euj().e(this);
    }

    public void jZ(boolean bl) {
        if (fyw_0.gqw().to("logBookDialog")) {
            if (bl) {
                if (fse_1.gFu().dq("logbookViewTab") == 0) {
                    csc_1.eNN();
                } else {
                    this.dZ((byte)0);
                }
            } else if (fse_1.gFu().dq("logbookViewTab") == 1) {
                csc_1.eNN();
            } else {
                this.dZ((byte)1);
            }
        } else {
            this.a(bl, null);
        }
    }

    private void bmX() {
        this.nEK = null;
        this.nEL = null;
        this.nEN.clear();
        this.nEO.clear();
        fse_1.gFu().vX("achievementsManager");
        fse_1.gFu().vX("questsView");
        fse_1.gFu().vX("achievementsView");
        fse_1.gFu().vX("selectedAchievement");
        fse_1.gFu().vX("overQuickAchievement");
        fse_1.gFu().vX("selectedAchievementCategoryView");
        fyw_0.gqw().tc("wakfu.achievements");
    }

    private static void eNN() {
        fyw_0.gqw().tl("logBookDialog");
        cAY.eHc().nP(600046L);
    }

    public void a(boolean bl, @Nullable bci_1 bci_12) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        this.aDh = bgt_02.Sn();
        this.eNQ();
        this.ecF();
        this.dZ(bl ? (byte)0 : 1);
        if (bl) {
            this.m(bci_12);
        } else {
            this.n(bci_12);
        }
        fse_1.gFu().f("achievementsManager", this.nEK);
        fse_1.gFu().f("questsView", bcm_1.hIK.jk(this.aDh));
        fse_1.gFu().f("achievementsView", bcm_1.hIK.jl(this.aDh));
        ccj_2.g("logBookDialog", 32768L);
        bgl_0 bgl_02 = bwa_0.jwi.aj(bgt_02);
        fse_1.gFu().b("characterSheet", bgl_02, "logBookDialog");
        fyw_0.gqw().d("wakfu.achievements", cdc_2.class);
        cAY.eHc().nP(600045L);
    }

    private void m(@Nullable bci_1 bci_12) {
        Object object;
        Object object2;
        if (bci_12 == null) {
            Object object3;
            object2 = fse_1.gFu().getProperty("selectedAchievement");
            object = object2 != null && ((fsf_1)object2).getValue() != null ? (((bci_1)(object3 = (bci_1)((fsf_1)object2).getValue())).dax() ? object3 : null) : null;
        } else {
            bci_1 bci_13 = object = bci_12.dax() ? bci_12 : null;
        }
        if (object != null) {
            this.nEK.a(bcm_1.hIK.u(this.aDh, ((bci_1)object).dce()));
            object2 = this.nEK.dbo();
            ((bcy_1)object2).dbH().forEach((arg_0, arg_1) -> csc_1.a((bci_1)object, arg_0, arg_1));
            if (object2 instanceof bch_2) {
                for (bch_2 bch_22 : ((bch_2)object2).dcb()) {
                    if (((bci_1)object).daS().dat().d() != bch_22.d()) continue;
                    fse_1.gFu().f("selectedQuestCategoryView", bch_22);
                    break;
                }
            }
        }
        fse_1.gFu().f("selectedAchievement", object);
        fse_1.gFu().b("displayedAchievement", object, "logBookDialog");
    }

    private void n(@Nullable bci_1 bci_12) {
        bcy_1 bcy_12;
        if (bci_12 == null) {
            fsf_1 fsf_12 = fse_1.gFu().getProperty("selectedAchievementCategoryView");
            bcy_12 = fsf_12 != null && fsf_12.getValue() != null ? (bcy_1)fsf_12.getValue() : null;
        } else {
            bcy_12 = bci_12.dax() ? null : bcm_1.hIK.a(this.aDh, bci_12);
            bci_12.fm(false);
        }
        if (bcy_12 != null) {
            this.nEK.a(bcy_12);
        }
        fse_1.gFu().f("selectedAchievementCategoryView", bcy_12);
    }

    private void ecF() {
        if (!this.nEO.d(buh_0.joy)) {
            this.nEO.a(new bcr_1(csf_1.nEX));
        }
        if (!this.nEN.d(buh_0.joy)) {
            this.nEN.a(new bcr_1(csf_1.nEY));
        }
    }

    public void a(bcx_2 bcx_22) {
        mp_1 mp_12;
        boolean bl = false;
        if (!fyw_0.gqw().to("questDescriptionDialog")) {
            ccj_2.pd("questDescriptionDialog");
            bl = true;
        }
        int n = bcx_22.d();
        mp_1 mp_13 = mp_12 = bcx_22.aeV() == 1 ? mq_1.aXr.nN(n) : null;
        if (mp_12 == null) {
            if (this.nEL != null) {
                this.nEL = null;
                bl = true;
            }
        } else {
            if (this.nEL == null) {
                this.nEL = new bcd_1();
                bl = true;
            }
            this.nEL.b(mp_12);
        }
        if (bl) {
            fse_1.gFu().b("questListBar", this.nEL, "questDescriptionDialog");
        }
        fse_1.gFu().b("displayedAchievement", bcx_22, "questDescriptionDialog");
    }

    public void b(bcx_2 bcx_22) {
        int n = bcx_22.d();
        mp_1 mp_12 = mq_1.aXr.nN(n);
        if (mp_12 == null) {
            nEF.warn((Object)("On essaye de charger une description de liste de qu$ete pour une qu\u00eate qui n'est pas dans une suite, id=" + n));
            return;
        }
        boolean bl = false;
        if (!fyw_0.gqw().to("questListBarDialog")) {
            ccj_2.g("questListBarDialog", 8192L);
            bl = true;
        }
        if (this.nEL == null) {
            this.nEL = new bcd_1();
            bl = true;
        }
        this.nEL.b(mp_12);
        this.nEL.Bn(n);
        if (bl) {
            fse_1.gFu().b("questListBar", this.nEL, "questListBarDialog");
        }
        fse_1.gFu().b("displayedAchievement", bcx_22, "questListBarDialog");
    }

    public void eNO() {
        fyw_0.gqw().tl("questListBarDialog");
        this.nEL = null;
    }

    public void j(bbu_2 bbu_22) {
        bci_1 bci_12 = bcm_1.hIK.t(this.aDh, bbu_22.d());
        if (bci_12 == null) {
            return;
        }
        bcy_1 bcy_13 = bcm_1.hIK.u(this.aDh, bbu_22.dat().d());
        if (bcy_13 != null) {
            fse_1.gFu().a((aef_2)bcy_13, bcy_13.bxk());
        }
        bcn_1.Bw(bbu_22.d()).map(n -> bcm_1.hIK.u(this.aDh, (int)n)).ifPresent(bcy_12 -> fse_1.gFu().a((aef_2)bcy_12, bcy_12.bxk()));
        if (this.nEK != null) {
            this.nEK.a(this.eNK());
            fse_1.gFu().a((aef_2)this.nEK, "categories", "allFilteredQuests");
        }
    }

    public static void b(bci_1 bci_12) {
        fse_1.gFu().f("selectedAchievement", bci_12);
        if (bci_12 != null && fyw_0.gqw().to("logBookDialog")) {
            fse_1.gFu().b("displayedAchievement", bci_12, "logBookDialog");
        }
    }

    @Nullable
    public bcu_2 eNP() {
        return this.nEK;
    }

    public csf_1 dbp() {
        return this.nEK.dbp();
    }

    public long KU() {
        return this.aDh;
    }

    public boolean J(long l, int n) {
        if (!this.nEM.containsKey(l)) {
            return false;
        }
        return this.nEM.get(l).contains(n);
    }

    private void Mp(int n) {
        boolean bl = this.nEM.computeIfAbsent(this.aDh, l -> new HashSet()).add(n);
        if (bl) {
            this.eNR();
        }
    }

    private void Mq(int n) {
        boolean bl;
        if (this.nEM.containsKey(this.aDh) && (bl = this.nEM.get(this.aDh).remove(n))) {
            this.eNR();
        }
    }

    private void eNQ() {
        if (this.nEM.containsKey(this.aDh)) {
            return;
        }
        bsz_2 bsz_22 = ((bsg_1)aie_0.cfn().bmH()).mr(this.aDh);
        HashSet<Integer> hashSet = new HashSet<Integer>();
        boolean bl = false;
        if (bsz_22 != null) {
            String string = bsz_22.bS(bsn_1.lkU.getKey());
            for (String string2 : string.split(nES)) {
                if (string2.isBlank()) continue;
                try {
                    int n = Integer.parseInt(string2);
                    bci_1 bci_12 = bcm_1.hIK.t(this.aDh, n);
                    if (bci_12 != null && !bci_12.app()) {
                        hashSet.add(n);
                        continue;
                    }
                    bl = true;
                }
                catch (NumberFormatException numberFormatException) {
                    nEF.error((Object)("Cannot format \"" + string2 + "\" as integer"), (Throwable)numberFormatException);
                }
            }
        }
        this.nEM.put(this.aDh, hashSet);
        if (bl) {
            this.eNR();
        }
    }

    private void eNR() {
        if (!this.nEM.containsKey(this.aDh)) {
            return;
        }
        String string = this.nEM.get(this.aDh).stream().map(String::valueOf).collect(Collectors.joining(nES));
        bsz_2 bsz_22 = ((bsg_1)aie_0.cfn().bmH()).mr(this.aDh);
        if (bsz_22 != null) {
            bsz_22.m(bsn_1.lkU.getKey(), string);
        }
    }

    private static /* synthetic */ void a(bci_1 bci_12, Integer n, bch_2 bch_22) {
        if (bci_12.daS().dat().AQ(n)) {
            bch_22.fm(false);
        }
    }
}

