/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public abstract class bSZ
implements aeh_2,
fpn<bjw_0> {
    public static final String llE = "animation";
    public static final String llF = "animName";
    public static final String llG = "currentProtector";
    public static final String llH = "challengeInventory";
    public static final String llI = "climateInventory";
    public static final String llJ = "challengeObjInventory";
    public static final String llK = "climateObjInventory";
    public static final String llL = "tax";
    public static final String llM = "walletHandler";
    public static final String llN = "zoology";
    public static final String llO = "hasMoneyBaseChallenges";
    public static final String llP = "baseChallenges";
    public static final String llQ = "availableChallenges";
    public static final String llR = "boughtChallenges";
    public static final String llS = "numBoughtChallenges";
    public static final String llT = "numAvailableChallenges";
    public static final String llU = "boughtClimates";
    public static final String llV = "buffList";
    public static final String llW = "buffTooltip";
    public static final String llX = "buffTitle";
    public static final String llY = "unsatisfiedRegionalState";
    public static final String llZ = "halfSatisfiedRegionalState";
    public static final String lma = "satisfiedRegionalState";
    public static final String lmb = "unsatisfiedGlobalState";
    public static final String lmc = "halfSatisfiedGlobalState";
    public static final String lmd = "satisfiedGlobalState";
    public static final String lme = "unsatisfiedStateIcon";
    public static final String lmf = "halfSatisfiedStateIcon";
    public static final String lmg = "satisfiedStateIcon";
    public static final String lmh = "globalStateIcon";
    public static final String lmi = "nation";
    public static final String lmj = "isStatic";
    public static final String lmk = "name";
    public static final String lml = "description";
    public static final String lmm = "job";
    public static final String lmn = "sex";
    public static final String lmo = "height";
    public static final String lmp = "weight";
    public static final String lmq = "customDescription";
    public static final String lmr = "secrets";
    public static final String lms = "numSecrets";
    public static final String lmt = "unlockedSecrets";
    public static final String lmu = "territoryName";
    public static final String lmv = "territoryRecommendedLevel";
    public static final String lmw = "illustrationUrl";
    public static final String lmx = "havenBagCharacterPortrait";
    public static final String[] lmy = new String[]{"boughtClimates", "boughtChallenges", "currentProtector", "animation", "challengeInventory", "climateInventory", "walletHandler", "challengeObjInventory", "climateObjInventory", "nation", "isStatic", "job", "sex", "height", "weight", "customDescription", "secrets", "buffList", "illustrationUrl", "territoryRecommendedLevel"};
    public static final byte lmz = 2;
    static final String lmA = "npc4399";
    static final String lmB = "npc2069";

    public void aPg() {
        fpm.sNJ.a(this);
    }

    @Override
    public void a(bjw_0 bjw_02) {
    }

    @Override
    public String[] bxk() {
        return lmy;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(lmj)) {
            return this.enj();
        }
        if (string.equals(lmk)) {
            return aum_0.cWf().a(48, (long)this.ctn(), new Object[0]);
        }
        if (string.equals(lmw)) {
            return auc_0.cVq().kC(emh_0.qMT.qq(this.ctn()));
        }
        if (string.equals(lmx)) {
            if (fse_1.gFu().dp("isInOwnHavenWorld")) {
                return auc_0.cVq().kC(lmB);
            }
            if (fse_1.gFu().dp("isInOwnDimensionalBag")) {
                return auc_0.cVq().kC(lmA);
            }
            return null;
        }
        return null;
    }

    public abstract int ctn();

    public abstract boolean enj();

    protected void enk() {
        fse_1.gFu().a((aef_2)this, lmy);
    }

    @Nullable
    public ZC enl() {
        return this.a(this.ctn(), bkr_0.kny);
    }

    @Nullable
    public abstract ZC a(int var1, bkr_0 var2);

    @Nullable
    public abstract bJK eaX();
}

