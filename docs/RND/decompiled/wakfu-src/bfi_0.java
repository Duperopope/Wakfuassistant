/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.text.DateFormat;
import java.util.Locale;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bfi
 */
public class bfi_0
implements aeh_2 {
    public static final String hQQ = "isRunning";
    public static final String hQR = "ownerNation";
    public static final String hQS = "territoryName";
    public static final String hQT = "endTerritoryName";
    public static final String hQU = "battlegroundType";
    public static final String hQV = "levelRange";
    public static final String hQW = "beginHour";
    public static final String hQX = "date";
    public static final String hQY = "attackTeam";
    public static final String hQZ = "defenseTeam";
    public static final String hRa = "stateIcon";
    public static final String hRb = "stateText";
    public static final String hRc = "beginHourText";
    public static final String hRd = "isFinished";
    public static final String hRe = "explanationWinText";
    public static final String hRf = "scoreStampIcon";
    public static final String hRg = "scoreStampText";
    public static final String hRh = "battlegroundRemainingTime";
    public static final String hRi = "linkedZoneView";
    public static final String hRj = "rewardXp";
    public static final String hRk = "rewardXpAmount";
    public static final String hRl = "rewardItem";
    public static final String hRm = "rewardMerit";
    public static final String hRn = "rewardGlory";
    public static final String hRo = "getRewardButtonText";
    public static final String hRp = "hasReward";
    public static final String hRq = "getRewardLocationText";
    public static final String hRr = "winnerIcon";
    public static final String[] hRs = new String[]{"isRunning", "ownerNation", "territoryName", "battlegroundType", "levelRange", "beginHour", "attackTeam", "defenseTeam", "stateIcon", "stateText", "beginHourText", "isFinished", "rewardXp", "rewardXpAmount", "rewardItem", "rewardMerit", "rewardGlory", "linkedZoneView"};
    private ffT hRt;
    private int hRu;
    private ffT hRv;
    private ffT hRw;
    private ffT hRx;
    private String hRy;
    private final bfe_0 hRz;
    private final bfe_0 hRA;
    private final bfh_0 hRB;
    private final fpv hRC;
    private fpc_0 hRD;
    private bml_2 hRE;
    private boolean hRF = true;
    private long drM;
    private long aDh;

    public bfi_0(fpv fpv2) {
        this.hRC = fpv2;
        this.hRz = new bfe_0(fpv2, false);
        this.hRA = new bfe_0(fpv2, true);
        this.hRA.fw(true);
        this.hRB = new bfh_0(this.hRC.dfF());
    }

    @Override
    public String[] bxk() {
        return hRs;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(hQQ)) {
            return this.hRC.ggI().g(ue_0.bjV().bjc()) && this.hRC.atC() <= 0;
        }
        if (string.equals(hRd)) {
            return this.bVp();
        }
        if (string.equals(hQR)) {
            return bss_2.lgz.Jt(this.hRC.atD());
        }
        if (string.equals(hQS)) {
            Optional<fpt> optional = fpu.sOH.FP(this.hRC.att());
            if (optional.isEmpty()) {
                return null;
            }
            fpt fpt2 = optional.get();
            return aum_0.cWf().a(66, (long)fpt2.clk(), new Object[0]);
        }
        if (string.equals(hQT)) {
            Optional<fpt> optional = fpu.sOH.FP(this.hRC.att());
            if (optional.isEmpty()) {
                return null;
            }
            fpt fpt3 = optional.get();
            int n = aue_0.cVJ().cVK().Xt();
            boolean bl = this.hRA.BJ(n) && this.hRA.BJ(this.hRC.atC());
            boolean bl2 = this.hRz.BJ(n) && this.hRz.BJ(this.hRC.atC());
            boolean bl3 = bl2 || bl;
            String string2 = aum_0.cWf().a(66, (long)fpt3.clk(), new Object[0]);
            return aum_0.cWf().c("battleground.end.title", bl3 ? 1 : 0, string2);
        }
        if (string.equals(hQU)) {
            return this.hRB;
        }
        if (string.equals(hQV)) {
            fpz_0 fpz_02 = this.hRC.ggH();
            return aum_0.cWf().c("stasis.dungeon.level.range", fpz_02.ggS(), fpz_02.ggT());
        }
        if (string.equals(hQW)) {
            Locale locale = aum_0.cWf().aUXX().aUJ();
            DateFormat dateFormat = DateFormat.getTimeInstance(3, locale);
            dateFormat.setTimeZone(uw_0.bvG);
            return dateFormat.format(this.hRC.ggI().bjC());
        }
        if (string.equals(hQX)) {
            Locale locale = aum_0.cWf().aUXX().aUJ();
            DateFormat dateFormat = DateFormat.getDateInstance(3, locale);
            dateFormat.setTimeZone(uw_0.bvG);
            return dateFormat.format(this.hRC.ggI().bjC());
        }
        if (string.equals(hQY)) {
            return this.hRz;
        }
        if (string.equals(hQZ)) {
            return this.hRA;
        }
        if (string.equals(hRa)) {
            if (this.bVp()) {
                return auc_0.cVq().kz(String.valueOf(2));
            }
            ux_0 ux_02 = ue_0.bjV().bjc();
            return auc_0.cVq().kz(String.valueOf(this.hRC.ggI().i(ux_02) ? 0 : 1));
        }
        if (string.equals(hRb)) {
            ux_0 ux_03 = ue_0.bjV().bjc();
            if (this.hRC.ggI().i(ux_03)) {
                return aum_0.cWf().c("battleground.state.1", new Object[0]);
            }
            return aum_0.cWf().c("battleground.state." + (this.bVp() ? 3 : 2), new Object[0]);
        }
        if (string.equals(hRc)) {
            Locale locale = aum_0.cWf().aUXX().aUJ();
            DateFormat dateFormat = DateFormat.getTimeInstance(3, locale);
            dateFormat.setTimeZone(uw_0.bvG);
            String string3 = dateFormat.format(this.hRC.ggI().bjC());
            return aum_0.cWf().c("battleground.enter.begin", string3);
        }
        if (string.equals(hRj)) {
            return this.hRt;
        }
        if (string.equals(hRk)) {
            return this.hRu > 0 ? Integer.valueOf(this.hRu) : null;
        }
        if (string.equals(hRl)) {
            return this.hRv;
        }
        if (string.equals(hRm)) {
            return this.hRw;
        }
        if (string.equals(hRn)) {
            return this.hRx;
        }
        if (string.equals(hRr)) {
            return this.dfH();
        }
        if (string.equals(hRe)) {
            int n = this.hRC.atC();
            String string4 = aum_0.cWf().c("nation.short." + n, new Object[0]);
            return aum_0.cWf().c("battleground.end.win.explanation", this.hRA.BJ(n) ? 1 : 0, string4);
        }
        if (string.equals(hRf)) {
            return this.hRD != null ? "stamp" + this.hRD.ggX() : "stampD";
        }
        if (string.equals(hRg)) {
            return this.hRD != null ? aum_0.cWf().c("battleground.end.stamp" + this.hRD.ggX(), new Object[0]) : aum_0.cWf().c("battleground.end.stamp", new Object[0]) + "D";
        }
        if (string.equals(hRh)) {
            long l;
            this.drM = ue_0.bjV().bjg();
            if (this.hRF) {
                this.hRF = false;
                return "-";
            }
            if (this.hRC.ggJ() != null && this.hRC.ggJ().bjB() > 0L && (l = this.hRC.ggJ().bjB() + fpv.sOL - this.drM) > 0L) {
                uz_0 uz_02 = uz_0.fp(l);
                return uc_0.k(uz_02);
            }
            l = this.hRC.ggI().bjB() + fpv.sOK - this.drM;
            if (l < 0L) {
                return "-";
            }
            uz_0 uz_03 = uz_0.fp(l);
            return uc_0.k(uz_03);
        }
        if (hRi.equals(string)) {
            return this.hRE;
        }
        if (hRo.equals(string)) {
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            String string5 = fcL.rUh.aw(bgt_02.Xi(), this.aDh) != null ? "battleground.end.rewards.button.available" : "battleground.end.rewards.button.unavailable";
            return aum_0.cWf().c(string5, new Object[0]);
        }
        if (hRp.equals(string)) {
            return this.dfG() && this.aEu();
        }
        if (hRq.equals(string)) {
            Object object = aum_0.cWf().c("battleground.end.rewards.location", new Object[0]);
            amc_1 amc_12 = aUm.cUI().fb("rewards");
            if (amc_12 != null) {
                object = (String)object + " (" + new aUl(amc_12).cUy() + ")";
            }
            return object;
        }
        return null;
    }

    public boolean aEu() {
        return this.hRt != null || this.hRv != null || this.hRw != null || this.hRx != null;
    }

    public boolean dfG() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        return bgt_02 != null && fcL.rUh.aw(bgt_02.Xi(), this.aDh) != null;
    }

    public String dfH() {
        int n = this.hRC.atC();
        return auc_0.cVq().zG(n == 0 ? -1 : n);
    }

    public boolean bVp() {
        return this.hRC.atC() > 0;
    }

    public fpv dfI() {
        return this.hRC;
    }

    public void a(ffT ffT2) {
        this.hRt = ffT2;
    }

    public void BK(int n) {
        this.hRu = n;
    }

    public void b(ffT ffT2) {
        this.hRv = ffT2;
    }

    public void c(ffT ffT2) {
        this.hRw = ffT2;
    }

    public void d(ffT ffT2) {
        this.hRx = ffT2;
    }

    public String dfJ() {
        return this.hRy;
    }

    public void lu(String string) {
        this.hRy = string;
    }

    public void jm(long l) {
        this.hRD = fpc_0.uw(l);
    }

    public void a(bml_2 bml_22) {
        this.hRE = bml_22;
    }

    public bml_2 dfK() {
        return this.hRE;
    }

    public bfe_0 dfL() {
        return this.hRz;
    }

    public bfe_0 dfM() {
        return this.hRA;
    }

    public void dfN() {
        fse_1.gFu().a((aef_2)this.hRz, "score", "placeText");
        fse_1.gFu().a((aef_2)this.hRA, "score", "placeText");
    }

    public void db(long l) {
        this.aDh = l;
    }

    public long KU() {
        return this.aDh;
    }
}

