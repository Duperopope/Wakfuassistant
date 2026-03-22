/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bnY
 */
public class bny_0
implements aeh_2,
ejl_0 {
    public static final String iLu = "name";
    public static final String iLv = "levelRange";
    public static final String iLw = "location";
    public static final String iLx = "isLocked";
    public static final String iLy = "lockDesc";
    public static final String iLz = "isDifficultyAvailable";
    public static final String iLA = "bestDifficulty";
    public static final String iLB = "bossIllustrationUrl";
    public static final String iLC = "crownStyle";
    public static final String iLD = "crownDesc";
    public static final String iLE = "recordBorder";
    public static final String iLF = "shards";
    public static final String iLG = "borderEasy";
    public static final String iLH = "borderNormal";
    public static final String iLI = "borderHard";
    public static final String iLJ = "borderExpert";
    public static final String iLK = "borderMaster";
    public static final String iLL = "laurelBronze";
    public static final String iLM = "laurelSilver";
    public static final String iLN = "laurelGold";
    public static final String iLO = "isOgrest";
    public static final String iLP = "ladderType";
    public static final String iLQ = "hasRewards";
    public static final String iLR = "mysteryBoxEasy";
    public static final String iLS = "mysteryBoxNormal";
    public static final String iLT = "mysteryBoxHard";
    public static final String iLU = "mysteryBoxExpert";
    public static final String iLV = "mysteryBoxMaster";
    public static final String iLW = "mysteryBoxEasyAmount";
    public static final String iLX = "mysteryBoxNormalAmount";
    public static final String iLY = "mysteryBoxHardAmount";
    public static final String iLZ = "mysteryBoxExpertAmount";
    public static final String iMa = "mysteryBoxMasterAmount";
    public static final String iMb = "gameplayIcon";
    public static final String iMc = "gameplayDescription";
    public static final String iMd = "canFindOnMap";
    public static final String iMe = "hasStele";
    public static final String iMf = "hasBeenDoneThisMonth";
    public static final String iMg = "laurels";
    protected static final byte iMh = 0;
    protected static final byte iMi = 1;
    protected static final byte iMj = 2;
    private final int iMk;
    private final int iMl;

    public bny_0(int n) {
        this.iMk = n;
        this.iMl = fig_0.ssF.VZ(n);
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(iLu)) {
            return this.getName() + (String)(fse_1.gFu().dp("isAdmin") ? " (" + this.iMk + ")" : "");
        }
        if (string.equals(iLv)) {
            ahv_2 ahv_22 = new ahv_2();
            ahv_22.aN(this.aVf());
            return aum_0.cWf().c("levelShort.custom", ahv_22.ceL());
        }
        if (string.equals(iLw)) {
            return this.dAl();
        }
        if (string.equals(iLx)) {
            return this.bfb();
        }
        if (string.equals(iLy)) {
            String string2 = boe.a(aue_0.cVJ().cVK(), this.iMl);
            if (string2.length() == 0) {
                return null;
            }
            ahv_2 ahv_23 = new ahv_2();
            ahv_23.ceu().c(string2).cev();
            return ahv_23.ceL();
        }
        if (string.equals(iLz)) {
            return this.cmT();
        }
        if (string.equals(iLA)) {
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            return bgt_02.dpV().RE(this.iMk);
        }
        if (string.equals(iLB)) {
            return this.dAo();
        }
        if (string.equals(iLC)) {
            return this.dAd();
        }
        if (string.equals(iLD)) {
            return this.dAe();
        }
        if (string.equals(iLE)) {
            return this.dAf();
        }
        if (string.equals(iLF)) {
            Object r = fgD.fXh().Vd(27083);
            return new beg_1((fhc_0)r);
        }
        if (string.equals(iLL)) {
            return bnz_0.iMm.getStyle();
        }
        if (string.equals(iLM)) {
            return bnz_0.iMn.getStyle();
        }
        if (string.equals(iLN)) {
            return bnz_0.iMo.getStyle();
        }
        if (string.equals(iLO)) {
            return this.dAp();
        }
        if (string.equals(iLQ)) {
            return this.aBk();
        }
        if (string.equals(iLP)) {
            return this.dAg();
        }
        if (string.equals(iMb)) {
            return this.dAh();
        }
        if (string.equals(iMc)) {
            return this.dAi();
        }
        if (string.equals(iMd)) {
            return big_2.l(this.dAk(), false) != null;
        }
        if (string.equals(iMe)) {
            return this.dAc();
        }
        if (string.equals(iMf)) {
            return this.dAb();
        }
        return null;
    }

    public boolean dAb() {
        return bob_0.dAs().A(aue_0.cVJ().cVK().Sn(), this.iMk);
    }

    protected boolean dAc() {
        return this.ayQ() > 0;
    }

    public int ayQ() {
        eIb eIb2 = eId.quO.PM(this.iMk);
        if (eIb2 == null) {
            return -1;
        }
        return eIb2.ayQ();
    }

    protected boolean cmT() {
        eIb eIb2 = eId.quO.PM(this.iMk);
        return eIb2 != null && eIb2.cmT();
    }

    protected String dAd() {
        eIb eIb2 = eId.quO.PM(this.iMk);
        if (!eIb2.cmT() || this.dAq()) {
            return "DungeonLadderNoCrown";
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        int n = bgt_02.dpV().RE(this.iMk);
        return bof.EL(n);
    }

    @NotNull
    protected String dAe() {
        eIb eIb2 = eId.quO.PM(this.iMk);
        if (!eIb2.cmT() || this.dAq()) {
            return aum_0.cWf().c("dungeon.ladder.crown.desc.no", new Object[0]);
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        int n = bgt_02.dpV().RE(this.iMk);
        eMU eMU2 = eMU.RH(n);
        int n2 = eMU2.fAO() + 1;
        if (n2 > eMU.qOk.fAO()) {
            return aum_0.cWf().c("dungeon.ladder.crown.desc.complete", new Object[0]);
        }
        String string = aum_0.cWf().c("stasis.dungeon.difficulty" + n2, new Object[0]);
        return aum_0.cWf().c("dungeon.ladder.crown.desc", string);
    }

    protected String dAf() {
        eIb eIb2 = eId.quO.PM(this.iMk);
        if (!eIb2.cmT() || this.dAq()) {
            return auc_0.cVq().ky("0");
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        int n = bgt_02.dpV().RE(this.iMk);
        return bof.EK(n);
    }

    protected int dAg() {
        if (this.dAq()) {
            return 1;
        }
        return 0;
    }

    @Nullable
    protected String dAh() {
        eIb eIb2 = eId.quO.PM(this.iMk);
        if (eIb2 == null || eIb2.dzH() == null) {
            return null;
        }
        return bof.b(eIb2.dzH());
    }

    @Nullable
    protected String dAi() {
        eIb eIb2 = eId.quO.PM(this.iMk);
        if (eIb2 == null || eIb2.dzH() == null) {
            return null;
        }
        return aum_0.cWf().c("dungeon.gameplay." + eIb2.dzH().aIi(), new Object[0]);
    }

    protected eIc dAj() {
        eIb eIb2 = eId.quO.PM(this.iMk);
        if (eIb2 == null) {
            return null;
        }
        return eIb2.dzH();
    }

    public boolean aBk() {
        eIb eIb2 = eId.quO.PM(this.iMk);
        return eIb2 != null && eIb2.cmT();
    }

    public int d() {
        return this.iMk;
    }

    public String getName() {
        return bny_0.Dm(this.iMk);
    }

    public static String Dm(int n) {
        return aum_0.cWf().a(137, (long)n, new Object[0]);
    }

    public String dah() {
        return bny_0.Dn(this.iMk);
    }

    public static String Dn(int n) {
        return aum_0.cWf().b(137, (long)n, new Object[0]);
    }

    public short aVf() {
        eIb eIb2 = eId.quO.PM(this.iMk);
        return eIb2 != null ? eIb2.aVf() : (short)0;
    }

    public beg_1 EH(int n2) {
        return eMO.qNB.y(this.iMk, (short)n2).map(Bu::getFirst).map(n -> (bgv_2)fgD.fXh().Vd((int)n)).map(beg_1::new).orElse(null);
    }

    public int a(bom bom2) {
        return this.EI(bom2.cnb());
    }

    public int EI(int n) {
        return eMO.qNB.y(this.iMk, (short)n).map(Bu::aHI).orElse(0);
    }

    public long aqZ() {
        eIb eIb2 = eId.quO.PM(this.iMk);
        return eIb2 != null ? eIb2.aqZ() : 0L;
    }

    public long dAk() {
        return this.aqZ();
    }

    protected String dAl() {
        eIb eIb2 = eId.quO.PM(this.iMk);
        if (eIb2 == null) {
            return "";
        }
        return aum_0.cWf().a(77, eIb2.aqZ(), new Object[0]);
    }

    public boolean dAm() {
        short s = aue_0.cVJ().cVK().cmL();
        return s >= this.aVf();
    }

    public boolean bfb() {
        return this.dAn().Qh(this.iMl);
    }

    private fia_0 dAn() {
        return aue_0.cVJ().cVK().dmD();
    }

    public String dAo() {
        return auc_0.cVq().zw(this.iMk);
    }

    public boolean dAp() {
        return bny_0.EJ(this.iMk);
    }

    public static boolean EJ(int n) {
        return n == eMQ.qNH.d() || n == eMQ.qNI.d();
    }

    public boolean dAq() {
        return eMQ.RD(this.iMk);
    }

    public static boolean e(int n, @NotNull String string) {
        if (bny_0.Dn(n).contains(string)) {
            return true;
        }
        eIb eIb2 = eId.quO.PM(n);
        if (eIb2 == null) {
            return false;
        }
        for (int n2 : ((bns_0)eIb2).cna()) {
            if (!bjz_1.Dn(n2).contains(string)) continue;
            return true;
        }
        return false;
    }

    @Override
    @Nullable
    public ejm_0 drG() {
        return ejm_0.qyZ;
    }

    @Override
    @Nullable
    public Object drH() {
        return this.iMk;
    }

    @Override
    public String drI() {
        return this.getName();
    }
}

