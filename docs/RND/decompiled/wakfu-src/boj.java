/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TLongHashSet
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.set.hash.TLongHashSet;
import org.jetbrains.annotations.Nullable;

public class boj
implements aeh_2 {
    public static final String iMV = "currentDifficulty";
    public static final String iMW = "isAutoDownscaled";
    public static final String iMX = "instanceName";
    public static final String iMY = "readOnly";
    public static final String iMZ = "levelRange";
    public static final String iNa = "bossIllustrationUrl";
    public static final String iNb = "maxDifficulty";
    public static final String iNc = "canChangeDifficulty";
    public static final String iNd = "difficultyBonus";
    public static final String iNe = "bestDifficulty";
    public static final String iNf = "competitiveModeText";
    public static final String iNg = "maxDifficultyNormalMode";
    public static final String iNh = "canEnterDungeon";
    public static final String iNi = "isDifficultyAvailable";
    public static final String iNj = "isForcedDownscaled";
    public static final String iNk = "gameplayIcon";
    public static final String iNl = "helpTooltipText";
    public static final String iNm = "minAllowedStasis";
    public static final String iNn = "maxAllowedStasis";
    private int iNo;
    private final int iNp;
    private boolean iNq;
    private boolean iNr;
    private final boolean iNs;
    private final int iNt;
    private final eIb iNu;
    private int iNv = Integer.MIN_VALUE;
    private int iNw = Integer.MAX_VALUE;
    public static final String[] iNx = new String[]{"currentDifficulty", "isAutoDownscaled", "instanceName", "readOnly", "levelRange", "bossIllustrationUrl", "maxDifficulty", "canChangeDifficulty", "difficultyBonus", "bestDifficulty", "competitiveModeText", "maxDifficultyNormalMode", "canEnterDungeon", "isForcedDownscaled", "gameplayIcon", "helpTooltipText", "isDifficultyAvailable", "minAllowedStasis", "maxAllowedStasis"};

    public boj(eIb eIb2, int n, boolean bl, boolean bl2, int n2) {
        this.iNu = eIb2;
        this.EP(n);
        this.iNq = eIb2.cmU() || bl;
        this.iNs = bl2;
        this.iNp = n;
        this.iNt = n2;
    }

    @Override
    public String[] bxk() {
        return iNx;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(iMV)) {
            return this.iNo;
        }
        if (string.equals(iMW)) {
            return this.iNq;
        }
        if (string.equals(iMX)) {
            return this.getName();
        }
        if (string.equals(iMY)) {
            return this.iNr;
        }
        if (string.equals(iMZ)) {
            return this.dAC();
        }
        if (string.equals(iNa)) {
            return this.dAo();
        }
        if (string.equals(iNb)) {
            if (!this.iNs) {
                return this.iNp;
            }
            return (short)(this.iNq || eMV.RJ(this.iNu.d()) ? 10 : 10);
        }
        if (string.equals(iNc)) {
            return this.iNu.cmT() && !this.dAq() && (!fse_1.gFu().dp("isInFight") || fse_1.gFu().dp("isInFightPlacement"));
        }
        if (string.equals(iNd)) {
            return aum_0.cWf().c(this.iNu.cmY(), this.iNo, this.iNu.dzH().aIi(), this.iNt, this.iNq ? 1 : 0);
        }
        if (string.equals(iNl)) {
            return aum_0.cWf().c("stasis.dungeon.help.difficulty", this.iNo, this.iNu.dzH().aIi(), this.iNt, this.iNq ? 1 : 0);
        }
        if (string.equals(iNe)) {
            return this.iNt;
        }
        if (string.equals(iNf)) {
            short s = this.iNu.aVf();
            short s2 = eIi.dB(s);
            return aum_0.cWf().c("stasis.dungeon.competitive", s2);
        }
        if (string.equals(iNg)) {
            return 10;
        }
        if (string.equals(iNh)) {
            if (!this.iNq) {
                return true;
            }
            if (!fse_1.gFu().dp("hideDownscaling")) {
                return true;
            }
            short s = eIi.dB(this.iNu.aVf());
            long l = aue_0.cVJ().cVO().xl();
            TLongHashSet tLongHashSet = fcL.rUh.sx(l);
            for (long l2 : tLongHashSet) {
                Object t = fcL.rUh.sw(l2);
                if (((exP)t).dnG() <= s) continue;
                return false;
            }
            return true;
        }
        if (string.equals(iNi)) {
            return this.iNu.cmT() && !this.dAq();
        }
        if (iNj.equals(string)) {
            return this.dAE();
        }
        if (iNk.equals(string)) {
            return bof.b(this.iNu.dzH());
        }
        if (iNm.equals(string)) {
            return this.iNv;
        }
        if (iNn.equals(string)) {
            return this.iNw;
        }
        return null;
    }

    public void EN(int n) {
        this.iNv = n;
    }

    public void EO(int n) {
        this.iNw = n;
    }

    private boolean dAq() {
        return eMQ.RD(this.iNu.d());
    }

    public final void EP(int n) {
        this.iNo = GC.a(n, 1, 10);
    }

    public void gK(boolean bl) {
        this.iNq = this.iNu.cmU() || bl;
    }

    public boolean dAA() {
        return this.iNq;
    }

    public int dAB() {
        return this.iNo;
    }

    public void setReadOnly(boolean bl) {
        this.iNr = bl;
    }

    public boolean dtg() {
        return this.iNr;
    }

    private String getName() {
        return aum_0.cWf().a(137, (long)this.iNu.d(), new Object[0]);
    }

    private String dAC() {
        short s = this.iNu.aVf();
        short s2 = eIi.dB(this.iNu.aVf());
        return aum_0.cWf().c("stasis.dungeon.level.range", s, s2);
    }

    private String dAo() {
        return auc_0.cVq().zw(this.iNu.d());
    }

    public eIb dAD() {
        return this.iNu;
    }

    public boolean dAE() {
        return this.iNu.cmU() || this.dAq();
    }
}

