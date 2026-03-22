/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bsZ
 */
public class bsz_0
implements bvg_0,
cpv_2 {
    private static final Logger jkd = Logger.getLogger(bsz_0.class);
    public static final float jke = 1.4f;
    public static final float jkf = 1.1f;
    public static final String jkg = "extraTurnScorePercentage";
    public static final String jkh = "extraTurnScorePercentageNext";
    public static final String jki = "extraTurnScoreDescription";
    public static final String jkj = "extraTurnScoreValue";
    public static final String jkk = "team";
    public static final String jkl = "timelineIllustrationUrl";
    public static final String jkm = "timelineSmallIllustrationUrl";
    public static final String jkn = "turnIllustrationUrl";
    public static final String jko = "isMonster";
    public static final String jkp = "selectedBonus";
    public static final String jkq = "actorStandardScale";
    public static final String jkr = "actorSmallScale";
    public static final String jks = "timelineIndex";
    public static final String jkt = "colorPoint";
    public static final String jku = "hpPercentage";
    private final bgy jkv;
    private bua jkw;
    private boolean jkx;
    private float jky;
    private btZ jkz;
    private long jkA = -1L;
    final String jkB = "#777777";
    final String[] jkC = new String[]{"#fc0097", "#ff0000", "#ff7f00", "#fec700", "#e2fc00", "#6fff00", "#00ff88", "#00e3fc", "#006cef", "#0008fe", "#7b00ff", "#b300ff", "#ed00fe", "#400000", "#cfcfcf", "#fefefe", "#777777"};

    public bsz_0(bgy bgy2, bua bua2) {
        this.jkv = bgy2;
        this.jkw = bua2;
        if (this.jkv.aWP() == 3251) {
            bgy bgy3 = this.jkv.djY();
            this.jkA = bgy3.Sn();
        } else if (!(this.jkv.doV() instanceof bjz_1) || !bdh_1.BC(this.jkv.aVt()) || bjv_2.aM(this.jkv)) {
            this.jkA = this.jkv.Sn();
        }
        if (this.jkA != -1L) {
            bve_0.dKK().a(this.jkA, this);
        }
    }

    public void bmX() {
        if (this.jkA != -1L) {
            bve_0.dKK().b(this.jkA, this);
        }
    }

    public bgy dHq() {
        return this.jkv;
    }

    public bua dGQ() {
        return this.jkw;
    }

    public void a(bua bua2) {
        this.jkw = bua2;
    }

    private float dHr() {
        int n = this.jkw.dIB();
        float f2 = this.jkw.kE(this.jkv.Sn()) % n;
        return f2 / (float)n;
    }

    private float dHs() {
        exf_2 exf_22 = this.jkv.e(exx_2.rGi);
        int n = exf_22.aYD();
        int n2 = exf_22.aYB();
        return (float)n2 / (float)n;
    }

    private float dHt() {
        int n = this.jkw.dIB();
        float f2 = this.jkw.kE(this.jkv.Sn()) % n;
        f2 = Math.min((float)n, f2 + 100.0f + (float)this.jkv.c((pt_0)exx_2.rGI));
        return f2 / (float)n;
    }

    public String[] bxk() {
        return null;
    }

    @Override
    public void a(awk_1 awk_12, String string) {
        if (awk_12 != null) {
            fse_1.gFu().a((aef_2)this.jkv, jkm);
        } else {
            jkd.warn((Object)string);
        }
    }

    public Object eu(String string) {
        if (string.equals("timelineElementType")) {
            return 1;
        }
        if (string.equals(jki)) {
            int n = this.jkw.dIB();
            int n2 = this.jkw.kE(this.jkv.Sn()) % n;
            return aum_0.cWf().c("fight.extraTurn.score", n - n2, n2, n);
        }
        if (string.equals(jkg)) {
            return Float.valueOf(this.dHr());
        }
        if (string.equals(jkh)) {
            return Float.valueOf(this.dHt());
        }
        if (string.equals(jkj)) {
            int n = this.jkw.dIB();
            return this.jkw.kE(this.jkv.Sn()) % n;
        }
        if (string.equals(jkq)) {
            bdj_2 bdj_22 = this.jkv.ddI();
            short s = bdj_22.aKu();
            float f2 = bdj_22.bqd().getScale();
            return Float.valueOf(bsz_0.c(s, f2));
        }
        if (string.equals(jkr)) {
            bdj_2 bdj_23 = this.jkv.ddI();
            short s = bdj_23.aKu();
            float f3 = bdj_23.bqd().getScale();
            return Float.valueOf(bsz_0.bL(s) * 1.1f * f3);
        }
        if (string.equals(jkk)) {
            return (byte)(!this.dHw() ? 1 : 0);
        }
        if (string.equals(jkl)) {
            return this.dHu();
        }
        if (string.equals(jkm)) {
            if (this.jkA != -1L) {
                return bve_0.dKK().kM(this.jkA);
            }
            return this.dHu();
        }
        if (string.equals(jkn)) {
            return this.dHv();
        }
        if (string.equals(jko)) {
            return this.jkv.aWP() != 3251 && this.jkv.doV() instanceof bjz_1 && bdh_1.BC(this.jkv.aVt()) && !bjv_2.aM(this.jkv);
        }
        if (string.equals(jkp)) {
            return this.jkz;
        }
        if (string.equals(jks)) {
            return this.jkw.eB(this.jkv.Sn()) + 1;
        }
        if (string.equals(jkt)) {
            int n = this.jkw.eB(this.jkv.Sn());
            if (n >= this.jkC.length) {
                return "#777777";
            }
            return this.jkC[n];
        }
        if (string.equals(jku)) {
            return Float.valueOf(this.dHs());
        }
        return null;
    }

    public static float c(short s, float f2) {
        return bsz_0.bL(s) * 1.4f * f2;
    }

    public static float bL(short s) {
        return 6.0f / (float)Math.max(s, 6);
    }

    public String dHu() {
        if (this.jkv.aWP() == 3251) {
            bgy bgy2 = this.jkv.djY();
            try {
                return String.format(auc_0.cVq().bS("breedContactListIllustrationPath"), bgy2.aWP(), bgy2.aWO());
            }
            catch (fu_0 fu_02) {
                jkd.error((Object)"PropertyException during getTimelineIllustrationUrl for SRAM_DOUBLE_BREED_ID", (Throwable)fu_02);
            }
        } else if (this.jkv instanceof bhJ) {
            try {
                return String.format(auc_0.cVq().bS("breedContactListIllustrationPath"), this.jkv.aWP(), this.jkv.aWO());
            }
            catch (fu_0 fu_03) {
                jkd.error((Object)"PropertyException during getTimelineIllustrationUrl for PlayerCharacter", (Throwable)fu_03);
            }
        } else if (this.jkv.aFW() == 5) {
            int n;
            bjz_1 bjz_12 = (bjz_1)this.jkv.doV();
            int n2 = n = bjz_12.csk() == -1 ? this.jkv.aVt() : bjz_12.csk();
            if (bdh_1.BC(n)) {
                return auc_0.cVq().zv(n);
            }
            try {
                return String.format(auc_0.cVq().bS("companionCharacterSheetIllustrationPath"), bjz_12.aWP());
            }
            catch (fu_0 fu_04) {
                jkd.error((Object)"PropertyException during getTimelineIllustrationUrl for Companion", (Throwable)fu_04);
            }
        } else if (this.jkv.doV() instanceof bjz_1) {
            int n;
            bjz_1 bjz_13 = (bjz_1)this.jkv.doV();
            int n3 = n = bjz_13.csk() == -1 ? this.jkv.aVt() : bjz_13.csk();
            if (bdh_1.BC(n) || blt_1.Ic(n)) {
                return auc_0.cVq().zv(n);
            }
            try {
                return String.format(auc_0.cVq().bS("breedContactListIllustrationPath"), bdh_1.BB(n), bdh_1.BA(n));
            }
            catch (fu_0 fu_05) {
                jkd.error((Object)"PropertyException during getTimelineIllustrationUrl for Monster", (Throwable)fu_05);
            }
        }
        return null;
    }

    private String dHv() {
        if (this.jkv.aFW() == 0) {
            try {
                return String.format(auc_0.cVq().bS("breedCharacterTurnIllustrationPath"), this.jkv.aWP(), this.jkv.aWO());
            }
            catch (fu_0 fu_02) {
                jkd.error((Object)"PropertyException during getTurnIllustrationUrl for PlayerCharacter", (Throwable)fu_02);
            }
        } else if (this.jkv.aFW() == 5) {
            int n;
            bjz_1 bjz_12 = (bjz_1)this.jkv.doV();
            int n2 = n = bjz_12.csk() == -1 ? this.jkv.aVt() : bjz_12.csk();
            if (bdh_1.BC(n)) {
                try {
                    return String.format(auc_0.cVq().bS("companionTurnIllustrationPath"), bjz_12.aWP());
                }
                catch (fu_0 fu_03) {
                    jkd.error((Object)"PropertyException during getTurnIllustrationUrl for Companion", (Throwable)fu_03);
                }
            }
        } else if (this.jkv.aWP() == 3251 || this.jkv.aWP() == 2382) {
            bgy bgy2 = this.jkv.djY();
            try {
                return String.format(auc_0.cVq().bS("breedCharacterTurnIllustrationPath"), bgy2.aWP(), bgy2.aWO());
            }
            catch (fu_0 fu_04) {
                jkd.error((Object)"PropertyException during getTurnIllustrationUrl for Sram or Zobal double", (Throwable)fu_04);
            }
        }
        return null;
    }

    @Override
    public boolean dHw() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        boolean bl = this.jkv.bqo() == bgt_02.dmW() ? this.jkv.bcP() == 0 : this.jkv.bcP() == -1;
        return bl;
    }

    public void dHx() {
        this.dHy();
    }

    public void dHy() {
        int n = this.jkw.dIB();
        float f2 = this.jkw.kE(this.jkv.Sn()) % n;
        if (f2 < this.jky) {
            this.a(new btZ(true));
        } else if (f2 > this.jky && this.jkz != null) {
            this.a((btZ)null);
        }
        this.jky = f2;
        if (this.jkv.bvY()) {
            fse_1.gFu().a((aef_2)this.jkv, jki, jkg, jkj);
            cya_1.eYj().ND((int)f2 + 1);
        }
    }

    public void a(btZ btZ2) {
        this.jkz = btZ2;
        fse_1.gFu().a((aef_2)this.jkv, jkp);
    }

    public void gl(boolean bl) {
        bdj_2 bdj_22 = this.jkv.ddI();
        if (!bdj_22.isVisible()) {
            bl = false;
        }
        if (!this.jkv.dlB()) {
            bl = false;
        }
        if (this.jkx == bl) {
            return;
        }
        this.jkx = bl;
        if (this.jkx) {
            bdj_22.dcS();
            bdj_22.ddd();
            fse_1.gFu().f("highlightedFighterId", this.jkv.Sn());
        } else {
            if (((Long)fse_1.gFu().getProperty("highlightedFighterId").getValue()).longValue() == this.jkv.Sn()) {
                fse_1.gFu().f("highlightedFighterId", 0L);
            }
            bdj_22.dcT();
            bdj_22.ddg();
        }
    }

    @Override
    public int dHz() {
        int n = this.jkw.dIB();
        return this.jkw.kE(this.jkv.Sn()) % (n == 0 ? 1 : n);
    }

    @Override
    public int dHA() {
        int n = this.jkw.dIB();
        return this.jkw.kE(this.jkv.Sn()) / (n == 0 ? 1 : n);
    }

    public void dHB() {
        fse_1.gFu().a((aef_2)this.jkv, jkk);
    }

    @Override
    public /* synthetic */ cpu_2 dHC() {
        return this.dHq();
    }
}

