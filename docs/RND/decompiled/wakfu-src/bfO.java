/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Date;

public class bfO
extends bfW
implements aeh_2 {
    public static final String hVZ = "isChaos";
    public static final String hWa = "isCurrentChallengeRunning";
    public static final String hWb = "isCompleted";
    public static final String hWc = "isSuccess";
    public static final String hWd = "currentGoalText";
    public static final String hWe = "currentGoalProgression";
    public static final String hWf = "currentGoalProgressionRatio";
    public static final String hWg = "score";
    public static final String hWh = "titleText";
    public static final String hWi = "timeStateText";
    public static final String hWj = "buttonStyle";
    public static final String hWk = "timerBackgroundColor";
    public static final String hWl = "detailAvailable";
    public static final String hWm = "entityCount";
    public static final String hWn = "ranking";
    public static final String hWo = "finalReward";
    public static final String hWp = "firstRankReward";
    public static final String hWq = "secondRankReward";
    public static final String hWr = "thirdRankReward";
    public static final String hWs = "winnerName";
    public static final String hWt = "winnerScore";
    public static final String hWu = "resultDescriptionIconUrl";
    public static final String hWv = "challengeTypeIconUrl";
    public static final String hWw = "challengeTypeName";
    public static final String hWx = "amIFirst";
    public static final String hWy = "joinButtonPopup";
    public static final String hWz = "isEmpty";
    public static final String hWA = "endReason";
    public static final String[] hWB = new String[]{"isChaos", "isCompleted", "isSuccess", "currentGoalText", "currentGoalProgression", "currentGoalProgressionRatio", "score", "titleText", "timeStateText", "buttonStyle", "timerBackgroundColor", "detailAvailable", "entityCount", "ranking", "finalReward", "firstRankReward", "secondRankReward", "thirdRankReward", "winnerName", "winnerScore", "resultDescriptionIconUrl", "challengeTypeIconUrl", "challengeTypeName", "amIFirst", "joinButtonPopup", "isEmpty", "endReason"};
    public static final String[] hWC = new String[hWB.length + bfW.hYK.length];
    private Date hWD;
    private long hWE = 0L;
    private boolean hWF = false;
    private boolean asG = false;
    private boolean hWG = false;
    private boolean hWH = false;
    private int epK;
    private int hWI = 0;
    private long cJM;
    private long hWJ;

    public bfO(bfW bfW2, int n) {
        super(bfW2);
        this.epK = n;
        this.hWJ = this.dhO();
    }

    @Override
    public String[] bxk() {
        return hWC;
    }

    public boolean dhx() {
        return this.hWF;
    }

    public boolean aGv() {
        return this.asG;
    }

    public boolean dhy() {
        return this.hWG;
    }

    private String dhz() {
        short s = this.hYM.dit();
        if (s == -2) {
            return aum_0.cWf().c("challenge.ranking.loser", new Object[0]);
        }
        if (s == -1) {
            return aum_0.cWf().c("challenge.ranking.unknown", new Object[0]);
        }
        ahv_2 ahv_22 = new ahv_2();
        ahv_22.ceC().yu(14).aN(s).ceD().ceC().yu(10).c("/").yx(this.hWI).ceD();
        return ahv_22.ceL();
    }

    @Override
    public Object eu(String string) {
        if (string.equals(hVZ)) {
            return this.aGd();
        }
        if (string.equals("remainingTime")) {
            short s = this.dhF();
            if (s > 0) {
                return bfO.br(s);
            }
        } else {
            if (string.equals("meetsRequirements")) {
                fjn_0 fjn_02 = aue_0.cVJ().cVK().ffF();
                int n = fjn_02.WA(fjn_02.Xt());
                boolean bl = fkf_0.gcc().WJ(n).b(fkj_0.sAR);
                return bl && this.diN() && (this.hXW.aGf() <= 0 || this.hXW.aGf() > this.hWI);
            }
            if (string.equals(hWe)) {
                if (this.aGv() || this.dhy()) {
                    return -1;
                }
                bgb bgb2 = this.dhC();
                if (bgb2 != null && bgb2.aGm() != null && bgb2.aGm().length() > 0) {
                    long l = this.dhu().lB(bgb2.aGm());
                    float f2 = 0.0f;
                    try {
                        f2 = bgb2.diU() ? (float)((long)bgb2.aGl() - l) / (float)bgb2.aGl() : (float)l / (float)bgb2.aGl();
                    }
                    catch (Exception exception) {
                        hYu.error((Object)("Une erreure est survenue dans le calcul de la progression du challenge d'id : " + this.d() + " value/maxValue:" + l + "/" + bgb2.aGl()));
                    }
                    if (f2 < 0.0f) {
                        return 0;
                    }
                    if (f2 > 1.0f) {
                        return 1;
                    }
                    return Float.valueOf(f2);
                }
                return -1;
            }
            if (!string.equals(hWa)) {
                if (string.equals(hWb)) {
                    return this.asG || this.hWG;
                }
                if (string.equals(hWc)) {
                    return this.asG;
                }
                if (string.equals(hWf)) {
                    bgb bgb3 = this.dhC();
                    if (bgb3 != null && bgb3.aGm() != null && bgb3.aGm().length() > 0) {
                        long l = this.dhu().lB(bgb3.aGm());
                        if (bgb3.diU()) {
                            return (long)bgb3.aGl() - l + "/" + bgb3.aGl();
                        }
                        return l + "/" + bgb3.aGl();
                    }
                    return null;
                }
                if (!string.equals(hWi)) {
                    if (string.equals(hWh)) {
                        return this.dhI();
                    }
                    if (!string.equals(hWj) && !string.equals(hWk)) {
                        if (string.equals(hWl)) {
                            return this.dik() || this.dil() || this.aGv();
                        }
                        if (string.equals(hWm)) {
                            return this.hWI;
                        }
                        if (string.equals(hWo)) {
                            return this.hYM.diu();
                        }
                        if (string.equals(hWp)) {
                            return this.hYM.Cl(0);
                        }
                        if (string.equals(hWq)) {
                            return this.hYM.Cl(1);
                        }
                        if (string.equals(hWr)) {
                            return this.hYM.Cl(2);
                        }
                        if (string.equals(hWs)) {
                            String string2 = this.hYM.div();
                            return string2 != null && string2.length() > 0 ? string2 : null;
                        }
                        if (string.equals(hWt)) {
                            return this.hYM.diw();
                        }
                        if (string.equals(hWu)) {
                            short s = this.hYM.dit();
                            if (s <= 0) {
                                return auc_0.cVq().a("challengeResultQualityIconsPath", "defaultIconPath", eIs.qws.aJr());
                            }
                            if (s == 1) {
                                return auc_0.cVq().a("challengeResultQualityIconsPath", "defaultIconPath", eIs.qwp.aJr());
                            }
                            float f3 = (float)(s - 3) / (float)(this.hWI - 3);
                            if (s == 2 || s == 3) {
                                return auc_0.cVq().a("challengeResultQualityIconsPath", "defaultIconPath", eIs.qwq.aJr());
                            }
                            if ((double)f3 <= 0.5) {
                                return auc_0.cVq().a("challengeResultQualityIconsPath", "defaultIconPath", eIs.qwr.aJr());
                            }
                            return auc_0.cVq().a("challengeResultQualityIconsPath", "defaultIconPath", eIs.qws.aJr());
                        }
                        if (string.equals(hWv)) {
                            return this.dhN();
                        }
                        if (string.equals(hWw)) {
                            return this.dii().diY();
                        }
                        if (string.equals(hWx)) {
                            return this.hYM.dit() == 1;
                        }
                        if (string.equals(hWn)) {
                            return this.dhz();
                        }
                        if (string.equals(hWy)) {
                            ahv_2 ahv_22 = new ahv_2();
                            bgt_0 bgt_02 = aue_0.cVJ().cVK();
                            if (!evg_1.osQ.a(new eve_2[]{bgt_02})) {
                                ahv_22.ceu().ih(awx_2.dnJ.bQk()).c(aum_0.cWf().c("error.playerNotSubscribed", new Object[0])).cev();
                                return ahv_22.ceL();
                            }
                            fjn_0 fjn_03 = bgt_02.ffF();
                            int n = fjn_03.WA(fjn_03.Xt());
                            boolean bl = fkf_0.gcc().WJ(n).b(fkj_0.sAR);
                            if (!bl) {
                                ahv_22.ceu().ih(awx_2.dnJ.bQk()).c(aum_0.cWf().c("nation.rank.unauthorized.for.challenges", new Object[0])).cev();
                                return ahv_22.ceL();
                            }
                            String string3 = this.hXW.diE();
                            if (!this.diN() && string3 != null && string3.length() != 0) {
                                ahv_22.ceu().ih(awx_2.dnJ.bQk()).c(aum_0.cWf().c("requirements", new Object[0])).c(" :").cev().ceH();
                                ahv_22.ceC().ih(awx_2.dnJ.bQk()).c(string3).ceD();
                                return ahv_22.ceL();
                            }
                            if (this.hXW.aGf() > 0 && this.hWI >= this.hXW.aGf()) {
                                ahv_22.ceu().ih(awx_2.dnJ.bQk()).c(aum_0.cWf().c("challenge.maxUsersLimit", new Object[0])).cev();
                                return ahv_22.ceL();
                            }
                            return aum_0.cWf().c("challenge.accept", new Object[0]);
                        }
                        if (string.equals(hWz)) {
                            return false;
                        }
                        if (string.equals(hWA)) {
                            int n = this.hYM.dix();
                            if (n == 5) {
                                return aum_0.cWf().c("challenge.notEnoughPlayers", new Object[0]);
                            }
                            return null;
                        }
                    }
                }
            }
        }
        return super.eu(string);
    }

    public boolean aGd() {
        return this.hYM.dig().aGd();
    }

    private bgb dhA() {
        ArrayList<bgb> arrayList = this.hXW.dbs();
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            bgb bgb2 = arrayList.get(i);
            if (this.dhu().a(bgb2) != 1) continue;
            return bgb2;
        }
        return null;
    }

    private bgb dhB() {
        ArrayList<bgb> arrayList = this.hXW.dbs();
        int n = arrayList.size();
        for (int i = n - 1; i >= 0; --i) {
            bgb bgb2 = arrayList.get(i);
            if (this.dhu().a(bgb2) != 2) continue;
            return bgb2;
        }
        return null;
    }

    private bgb dhC() {
        bgb bgb2 = this.dhA();
        if (bgb2 == null) {
            bgb2 = this.dhB();
        }
        if (bgb2 == null) {
            hYu.warn((Object)("Challenge : aucun objectif charg\u00e9 ou termin\u00e9, \u00e9trange : challengeId = " + this.dhu().d()));
        }
        return bgb2;
    }

    @Override
    public boolean dhD() {
        return true;
    }

    @Override
    public void dhE() {
        super.dhE();
        short s = this.dhF();
        short s2 = this.dhG();
        if (!this.aOY() && this.dhx()) {
            if (s < 6 && s > 0) {
                cAY.eHc().nP(600128L);
            } else if (s == 0) {
                cAY.eHc().nP(600129L);
            }
        }
        if ((this.dik() || !this.aOY() && this.dhx()) && s == 0) {
            this.fG(false);
            this.az(true);
            if (!this.dil()) {
                this.dhH();
            }
            fse_1.gFu().a((aef_2)this, "isProposed", "isActivated", hWa);
            this.cAN();
        } else {
            if (this.dhx() && this.aOY() && !this.dig().aGd()) {
                if (s2 < 6 && s2 > 0) {
                    cAY.eHc().nP(600128L);
                } else if (!this.bVp() && s2 == 0) {
                    cAY.eHc().nP(600138L);
                }
            }
            if (s2 == 0 && s == 0 && !this.dig().aGd()) {
                this.fI(true);
            }
        }
        if (s > -1 || fyw_0.gqw().to(this.diO())) {
            fse_1.gFu().a((aef_2)this, "remainingTime");
        }
        fse_1.gFu().a((aef_2)this, hWi, "remainingTime");
    }

    public void k(Date date) {
        this.hWD = date;
    }

    public short dhF() {
        if (this.hWD == null) {
            return -1;
        }
        long l = System.currentTimeMillis();
        short s = (short)((this.hWD.getTime() - l) / 1000L);
        return s > 0 ? s : (short)0;
    }

    public void o(long l, long l2) {
    }

    public short dhG() {
        if (this.hXW.aFT() == 0) {
            return 0;
        }
        if (this.dhu().dis() == null) {
            return -1;
        }
        return 0;
    }

    @Override
    public void dhH() {
        super.dhH();
    }

    @Override
    public void cAN() {
        fse_1.gFu().a((aef_2)this, bfV.hYr);
        fse_1.gFu().a((aef_2)this, hWC);
    }

    public String dhI() {
        return "";
    }

    private String ae(String string, String string2) {
        ahv_2 ahv_22 = new ahv_2();
        ahv_22.ceC().ih(string2).c(string).ceD();
        return ahv_22.ceL();
    }

    public void fC(boolean bl) {
        this.hWF = bl;
    }

    public void fD(boolean bl) {
        this.hWG = bl;
    }

    public void ak(boolean bl) {
        this.asG = bl;
    }

    public boolean dhJ() {
        return this.hWH;
    }

    public void fE(boolean bl) {
        this.hWH = bl;
    }

    public int ctn() {
        return this.epK;
    }

    public void Cg(int n) {
        this.hWI = n;
    }

    @Override
    public void dbC() {
        fse_1.gFu().a((aef_2)this, hWn, hWx);
    }

    @Override
    public void dhr() {
        fse_1.gFu().a((aef_2)this, hWo);
    }

    @Override
    public void dhK() {
        fse_1.gFu().a((aef_2)this, hWp);
    }

    @Override
    public void dhL() {
        fse_1.gFu().a((aef_2)this, hWq);
    }

    @Override
    public void dhM() {
        fse_1.gFu().a((aef_2)this, hWr);
    }

    @Override
    public void dhs() {
        fse_1.gFu().a((aef_2)this, hWs);
    }

    @Override
    public void dht() {
        fse_1.gFu().a((aef_2)this, hWt);
    }

    public awk_1 dhN() {
        awk_1 awk_12 = awm_1.bPn().gB(this.hWJ);
        if (awk_12 != null) {
            return awk_12;
        }
        String[] stringArray = new String[2];
        try {
            stringArray[0] = String.format(auc_0.cVq().bS("challengeCategoryIconsPath"), this.dih().aJr());
            stringArray[1] = String.format(auc_0.cVq().bS("challengeUserTypeIconsPath"), this.dii().aJr());
        }
        catch (fu_0 fu_02) {
            hYu.info((Object)fu_02.getMessage());
        }
        axc_2 axc_22 = new axc_2();
        axc_22.p(stringArray);
        axc_22.bQw();
        awk_1 awk_13 = awm_1.bPn().b((art_1)aru_2.cVG.bIv(), this.hWJ, axc_22, true);
        axc_22.bsI();
        return awk_13;
    }

    private long dhO() {
        return arn_2.fX("generatedChallengeTypeTexture-" + this.dih().aJr() + "-" + this.dii().aJr());
    }

    static {
        System.arraycopy(hWB, 0, hWC, 0, hWB.length);
        System.arraycopy(bfW.hYK, 0, hWC, hWB.length, bfW.hYK.length);
    }
}

