/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bmF
 */
public class bmf_2
extends bms_1 {
    public static final String iCt = "level";
    public static final String iCu = "levelText";
    public static final String iCv = "nameAndlevelText";
    public static final String iCw = "levelTextColor";
    public static final String iCx = "currentXpPercentage";
    public static final String iCy = "nextXpPercentage";
    public static final String iCz = "nextXpPercentageInit";
    public static final String iCA = "xpRatio";
    public static final String iCB = "recipes";
    public static final String iCC = "harvests";
    public static final String iCD = "currentRecipesPage";
    public static final String iCE = "currentHarvestsPage";
    public static final String iCF = "hasHarvest";
    public static final String iCG = "hasSeed";
    public static final String iCH = "hasGrossResource";
    public static final String iCI = "hasEndResource";
    public static final String iCJ = "hasRecipe";
    public static final String iCK = "seedIconTitle";
    public static final String iCL = "grossResourceIconTitle";
    public static final String iCM = "endResourceIconTitle";
    public static final String iCN = "seedCount";
    public static final String iCO = "grossResourceCount";
    public static final String iCP = "endResourceCount";
    public static final String iCQ = "harvestBonusValue";
    public static final String iCR = "recipeCount";
    public static final String iCS = "currentPageText";
    public static final String iCT = "currentPage";
    public static final String iCU = "maxNumPages";
    public static final String iCV = "numPerPage";
    public static final String iCW = "isOkFiltered";
    public static final String iCX = "isUpgradeFiltered";
    public static final String iCY = "isXpFiltered";
    public static final String iCZ = "isAbcSorted";
    public static final String iDa = "isLevelSorted";
    public static final String iDb = "isAbcSortActivated";
    public static final String iDc = "isLevelSortActivated";
    public static final String iDd = "craftBigIcon";
    public static final String iDe = "craftIcon";
    public static final String iDf = "isCraft";
    public static final String iDg = "freeMode";
    public static final String iDh = "isSecureCraft";
    public static final String iDi = "artisan";
    public static final String iDj = "isArtisanRegistered";
    public static final String iDk = "isCurrentTypeCraft";
    public static final String[] iDl = new String[]{"level", "levelText", "currentXpPercentage", "nextXpPercentage", "recipes", "isOkFiltered", "isAbcSorted", "isLevelSorted", "isAbcSortActivated", "isLevelSortActivated", "isSecureCraft", "isArtisanRegistered", "nameAndlevelText", "craftIcon", "craftBigIcon"};
    private static final String iDm = "CraftIcon%d";
    private static final String iDn = "CraftBigIcon%d";
    private final bDs iDo;
    private ArrayList<bmv_1> iDp;
    private ArrayList<bmq_1> iDq;
    private final List<bmq_1> iDr;
    private boolean iDs = false;
    private boolean iDt = false;
    private boolean iDu = false;
    private String hVA = "";
    private long iDv = -1L;
    private boolean iDw = false;
    private int hQx;
    private bme_2 iDx;
    private bmu_1 iDy;
    public static final int iDz = 7;
    private static final int iDA = 100;
    private short hQm = (short)-1;
    private short hQn = Short.MAX_VALUE;
    private final long iDB;

    public bmf_2(int n, long l, eki_0 eki_02, bDs bDs2) {
        super(n, eki_02);
        this.iDr = bmo_2.iEv.dv(this.iBx, 200);
        this.iDB = l;
        this.iDo = bDs2;
        this.dwP();
        this.dwN();
    }

    public bmf_2(int n, long l, eki_0 eki_02) {
        this(n, l, eki_02, null);
    }

    public void a(bmu_1 bmu_12) {
        this.iDy = bmu_12;
    }

    @Override
    public boolean dwo() {
        return this.iDp != null && !this.iDp.isEmpty();
    }

    @Override
    public boolean dwp() {
        return this.iDq != null && !this.iDq.isEmpty();
    }

    @Override
    public boolean dwq() {
        return aue_0.cVJ().cVO().xl() != this.iDB;
    }

    public void gA(boolean bl) {
        this.iDw = bl;
        fse_1.gFu().a((aef_2)this, iDg);
    }

    @Override
    public int dwk() {
        return this.iBx;
    }

    @Override
    public short cmL() {
        return this.cZr().PG(this.iBx);
    }

    @Override
    public String[] bxk() {
        return iDl;
    }

    @Override
    public Object eu(String string) {
        switch (string) {
            case "level": {
                return this.cmL();
            }
            case "levelText": {
                return aum_0.cWf().c("levelShort.custom", this.cmL());
            }
            case "levelTextColor": {
                String string2 = new ahv_2().ceC().ih(bmf_2.getColor().bQk()).aN(this.cmL()).ceD().ceL();
                return aum_0.cWf().c("levelShort.custom", string2);
            }
            case "xpRatio": {
                eki_0 eki_02 = this.cZr();
                long l = eki_02.QI(this.iBx);
                long l2 = eKX.dV(eki_02.PG(this.iBx));
                long l3 = eKX.dV((short)(eki_02.PG(this.iBx) + 1));
                String string3 = aum_0.cWf().cQ(l - l2);
                String string4 = aum_0.cWf().cQ(l3 - l2);
                return new ahv_2().c(string3).c("/").c(string4).ceL();
            }
            case "currentXpPercentage": {
                return Math.min(1.0, this.cZr().QG(this.iBx));
            }
            case "nextXpPercentage": 
            case "nextXpPercentageInit": {
                if (this.iDv == -1L) {
                    return this.cZr().QG(this.iBx);
                }
                if (eKX.qi(this.iDv) > this.cmL()) {
                    return Float.valueOf(1.0f);
                }
                return this.cZr().F(this.iBx, this.iDv);
            }
            case "craftBigIcon": {
                return this.dwJ();
            }
            case "craftIcon": {
                return this.dwI();
            }
            case "hasRecipe": {
                return this.dwO();
            }
            case "hasHarvest": {
                return this.dwL();
            }
            case "hasSeed": {
                Optional<bmq_1> optional = this.dwM();
                if (optional.isEmpty()) {
                    return false;
                }
                switch (optional.get().dwc()) {
                    case qyJ: 
                    case qyI: 
                    case qyH: 
                    case qyF: {
                        return true;
                    }
                }
                return false;
            }
            case "hasGrossResource": {
                Optional<bmq_1> optional = this.dwM();
                if (optional.isEmpty()) {
                    return false;
                }
                switch (optional.get().dwc()) {
                    case qyG: 
                    case qyK: {
                        return false;
                    }
                }
                return true;
            }
            case "hasEndResource": {
                Optional<bmq_1> optional = this.dwM();
                if (optional.isEmpty()) {
                    return false;
                }
                switch (optional.get().dwc()) {
                    case qyJ: 
                    case qyI: 
                    case qyH: 
                    case qyF: 
                    case qyG: 
                    case qyK: {
                        return true;
                    }
                }
                return false;
            }
            case "endResourceIconTitle": {
                return this.dwG();
            }
            case "seedIconTitle": {
                return this.dwF();
            }
            case "grossResourceIconTitle": {
                return this.dwH();
            }
            case "harvests": {
                return this.dwN();
            }
            case "recipes": {
                return this.dwP();
            }
            case "isOkFiltered": {
                return this.iDs;
            }
            case "isUpgradeFiltered": {
                return this.iDt;
            }
            case "isXpFiltered": {
                return this.iDu;
            }
            case "isCraft": {
                return this.dwK();
            }
            case "seedCount": {
                int n = this.cZr().QJ(this.iBx);
                return new ahv_2().c(": ").yx(n).ceL();
            }
            case "endResourceCount": {
                int n = this.cZr().QL(this.iBx);
                return new ahv_2().c(": ").yx(n).ceL();
            }
            case "harvestBonusValue": {
                int n = this.dxe().dmn().a(eje_0.qyy, this.iBx, 3);
                return new ahv_2().c(": ").yx(n).c(" %").ceL();
            }
            case "grossResourceCount": {
                int n = this.cZr().QK(this.iBx);
                return new ahv_2().c(": ").yx(n).ceL();
            }
            case "recipeCount": {
                int n = this.cZr().QM(this.iBx);
                return new ahv_2().c(": ").yx(n).ceL();
            }
            case "freeMode": {
                return this.iDw;
            }
            case "currentPage": {
                if (this.iDy != null) {
                    return this.iDy.dfz();
                }
                return 0;
            }
            case "currentPageText": {
                if (this.iDx != bme_2.iCp && this.iDy != null) {
                    return this.iDy.dfB();
                }
                return this.hQx + 1 + "/" + this.dxd();
            }
            case "numPerPage": {
                if (this.iDy == null) break;
                return this.iDy.dxh();
            }
            case "maxNumPages": {
                return this.dxd() - 1;
            }
            case "currentRecipesPage": {
                if (this.iDy != null) {
                    return this.iDy.dxi();
                }
                return null;
            }
            case "currentHarvestsPage": {
                int n = this.hQx * 7;
                int n2 = Math.min(this.iDq.size(), n + 7);
                ArrayList<bmq_1> arrayList = new ArrayList<bmq_1>();
                for (int i = n; i < n2; ++i) {
                    arrayList.add(this.iDq.get(i));
                }
                return arrayList;
            }
            case "isSecureCraft": {
                return this.dwq();
            }
            case "artisan": {
                return this.dxe();
            }
            case "nameAndlevelText": {
                return this.getName() + " - " + aum_0.cWf().c("levelShort.custom", this.cmL());
            }
            case "isCurrentTypeCraft": {
                return this.iDx == bme_2.iCo;
            }
            case "isArtisanRegistered": {
                return this.dwE();
            }
        }
        return super.eu(string);
    }

    private boolean dwE() {
        if (fse_1.gFu().getProperty(iDj) == null) {
            return false;
        }
        return fse_1.gFu().dp(iDj);
    }

    private String dwF() {
        Optional<bmq_1> optional = this.dwM();
        if (optional.isEmpty()) {
            return null;
        }
        return aum_0.cWf().a(100, (long)optional.get().dwc().fxb(), new Object[0]);
    }

    private String dwG() {
        Optional<bmq_1> optional = this.dwM();
        if (optional.isEmpty()) {
            return null;
        }
        return aum_0.cWf().a(109, (long)optional.get().dwc().fxb(), new Object[0]);
    }

    private String dwH() {
        Optional<bmq_1> optional = this.dwM();
        if (optional.isEmpty()) {
            return null;
        }
        return aum_0.cWf().a(108, (long)optional.get().dwc().fxb(), new Object[0]);
    }

    @NotNull
    private String dwI() {
        return String.format(iDm, this.iBx);
    }

    @NotNull
    private String dwJ() {
        return String.format(iDn, this.iBx);
    }

    private boolean dwK() {
        eki_0 eki_02 = this.cZr();
        if (eki_02.QJ(this.iBx) > 0) {
            return false;
        }
        if (eki_02.QK(this.iBx) > 0) {
            return false;
        }
        return eki_02.QL(this.iBx) <= 0;
    }

    private static axb_2 getColor() {
        return aid_0.dVg;
    }

    public boolean dwL() {
        return !this.iDr.isEmpty();
    }

    public Optional<bmq_1> dwM() {
        if (this.iDr.isEmpty()) {
            return Optional.empty();
        }
        return Optional.ofNullable(this.iDr.get(0));
    }

    public ArrayList<bmq_1> dwN() {
        if (this.iDq != null) {
            return this.iDq;
        }
        String string = BH.aT(this.hVA);
        this.iDq = new ArrayList();
        eki_0 eki_02 = this.cZr();
        short s = eki_02.PG(this.iBx);
        this.iDr.stream().filter(bmq_12 -> !this.iDs || bmq_12.dwb() <= s).filter(bmq_12 -> bmq_12.dwb() >= this.hQm).filter(bmq_12 -> bmq_12.dwb() <= this.hQn).filter(bmq_12 -> !this.iDu || this.b((bmq_1)bmq_12) && eki_02.PG(bmq_12.cms()) >= bmq_12.dwb()).filter(bmq_12 -> this.hVA.isEmpty() || bmq_12.dwa().contains(string)).sorted(Comparator.comparingInt(bmq_1::dwb).thenComparing((bmq_12, bmq_13) -> fgj.fWT().compare(bmq_12.dwg(), bmq_13.dwg())).thenComparingInt(bmq_1::azv)).forEach(bmq_12 -> this.iDq.add((bmq_1)bmq_12));
        return this.iDq;
    }

    private boolean dwO() {
        return eKQ.qEb.QV(this.iBx).fzh() > 0;
    }

    public ArrayList<bmv_1> dwP() {
        if (this.iDp != null) {
            return this.iDp;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        eKW eKW2 = eKQ.qEb.QV(this.iBx);
        this.iDp = new ArrayList(eKW2.fzh());
        List<eKR> list = bmr_1.iEC.Eo(this.iBx);
        eki_0 eki_02 = this.cZr();
        bhJ bhJ2 = this.dxe();
        String string = BH.aT(this.hVA);
        for (eKR eKR2 : list) {
            Object object;
            boolean bl;
            if (eKR2.dxy() > 200 || eKR2.b(eki_02) || !eKR2.av(bhJ2)) continue;
            boolean bl2 = bl = bgt_02.b(eKR2) && this.e(eKR2);
            if (this.iDs && !bl || this.iDt && eKR2.dxG()) continue;
            long l = eKR2.a(eki_02.PG(this.iBx), bgt_02);
            double d2 = eKR2.dU(eki_02.PG(this.iBx));
            if (this.iDu && (l <= 0L || d2 <= 0.0) || eKR2.dxy() < this.hQm || eKR2.dxy() > this.hQn || !string.isEmpty() && !((String)(object = bgv_2.Dn(eKR2.fyZ().azv()))).contains(string) || this.iDo != null && !this.iDo.i(eKR2.d(), eKR2.aFW())) continue;
            object = new bmv_1(eKR2, this);
            ((bmv_1)object).gD(bl);
            this.iDp.add((bmv_1)object);
        }
        return this.iDp;
    }

    public long a(bmq_1 bmq_12, int n) {
        int n2 = bmq_12.cms();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        eKW eKW2 = eKQ.qEb.QV(n2);
        short s = this.cZr().PG(n2);
        short s2 = (short)bmq_12.dwb();
        long l = eKX.a(s, s2, eKW2, bgt_02);
        long l2 = (long)((float)l * bmq_12.cmu());
        int n3 = bgt_02.dmn().a(eje_0.qyu, n2, n);
        float f2 = (float)(100 + n3) / 100.0f;
        float f3 = f2 * (float)l2;
        return GC.g(f3 *= bgt_02.dpL().fdP());
    }

    public long a(bmq_1 bmq_12) {
        int n = bmq_12.cms();
        bhJ bhJ2 = this.dxe();
        eKW eKW2 = eKQ.qEb.QV(n);
        float f2 = bmq_12.cmu() * 0.6666667f;
        long l = eKX.a((short)bmq_12.dwb(), (short)bmq_12.dwb(), eKW2, bhJ2);
        return (long)((float)l * f2);
    }

    private boolean b(bmq_1 bmq_12) {
        int n = bmq_12.cms();
        bhJ bhJ2 = this.dxe();
        eKW eKW2 = eKQ.qEb.QV(n);
        return eKX.a(this.cZr().PG(n), (short)bmq_12.dwb(), eKW2, bhJ2) != 0L;
    }

    public int d(eKR eKR2) {
        if (!this.dwq()) {
            return 0;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bnv_2 bnv_22 = bgt_02.dnw();
        if (bnv_22 == null) {
            return 0;
        }
        bhJ bhJ2 = bnv_22.dyS();
        if (bhJ2 == null) {
            return 0;
        }
        eKV eKV2 = eKR2.fyZ();
        if (eKV2 == eKV.qEF) {
            return 0;
        }
        bgv_2 bgv_22 = (bgv_2)fgD.fXh().Vd(eKV2.azv());
        if (bgv_22 == null) {
            return 0;
        }
        boolean bl = ((exP)bhJ2).Ya() > 0L && ((exP)bhJ2).Ya() == bgt_02.Ya();
        eki_0 eki_02 = this.cZr();
        return eki_02.a(eKR2, bl);
    }

    public boolean e(eKR eKR2) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        int n = this.d(eKR2);
        return (long)n <= bgt_02.dmi();
    }

    private void dwQ() {
        this.iDp.sort((bmv_12, bmv_13) -> {
            if (bmv_12.dxy() != bmv_13.dxy()) {
                return bmv_12.dxy() - bmv_13.dxy();
            }
            if (bmv_12.dxF() != bmv_13.dxF()) {
                byte by = bmv_12.dxF() != null ? bmv_12.dxF().fWK() : fgj.siA.fWK();
                byte by2 = bmv_13.dxF() != null ? bmv_13.dxF().fWK() : fgj.siA.fWK();
                return by < by2 ? -1 : 1;
            }
            if (bmv_12.dxG() != bmv_13.dxG()) {
                return bmv_12.dxG() ? 1 : -1;
            }
            String string = bmv_12.getName();
            String string2 = bmv_13.getName();
            return BH.i(string, string2);
        });
    }

    public bDs dwR() {
        return this.iDo;
    }

    public void md(String string) {
        this.hVA = string;
        this.dxa();
    }

    public String dwS() {
        return this.hVA;
    }

    public void kc(long l) {
        this.iDv = l;
        fse_1.gFu().a((aef_2)this, iCy);
    }

    public void dwT() {
        this.iDs = !this.iDs;
        this.dxa();
        fse_1.gFu().a((aef_2)this, iCW);
    }

    public void dwU() {
        this.iDt = !this.iDt;
        this.dxa();
        fse_1.gFu().a((aef_2)this, iCX);
    }

    public void dwV() {
        this.iDu = !this.iDu;
        this.dxa();
        fse_1.gFu().a((aef_2)this, iCY);
    }

    public void dwW() {
        if (this.iDp == null) {
            return;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        boolean bl = false;
        for (int i = this.iDp.size() - 1; i >= 0; --i) {
            boolean bl2;
            bmv_1 bmv_12 = this.iDp.get(i);
            boolean bl3 = bl2 = bgt_02.b(bmv_12.dxA()) && this.e(bmv_12.dxA());
            if (!this.iDs || bl2) continue;
            this.iDp.remove(i);
            bl = true;
        }
        if (bl) {
            fse_1.gFu().a((aef_2)this, iCB);
        }
    }

    public void dwX() {
        this.dxa();
    }

    public void dwY() {
        fse_1.gFu().a((aef_2)this, iCx);
    }

    public void dwZ() {
        this.dxa();
        fse_1.gFu().a((aef_2)this, iCt, iCw, iCu, iCz, iCx);
    }

    public void dxa() {
        this.iDp = null;
        this.iDq = null;
        this.dwP();
        this.dwN();
        this.dxb();
        String string = this.iDx == bme_2.iCp ? iCE : iCD;
        fse_1.gFu().a((aef_2)this, iCB, iCC, iCU, iCT, iCS, iCV, string);
    }

    private void dxb() {
        int n = this.dxd();
        if (this.hQx >= n) {
            this.BH(n);
        } else if (this.hQx < 0) {
            this.BH(1);
        }
    }

    @Override
    public boolean dwn() {
        return false;
    }

    public void a(bme_2 bme_22) {
        this.iDx = bme_22;
        this.hQx = 0;
        if (this.iDy != null) {
            this.iDy.BH(this.hQx);
        }
        fse_1.gFu().a((aef_2)this, iCU, iCT, iCS, iCV, iCE, iCD, iDk);
    }

    public bme_2 dxc() {
        return this.iDx;
    }

    public int dxd() {
        if (this.iDx == bme_2.iCp) {
            return (int)Math.ceil((float)this.iDq.size() / 7.0f);
        }
        if (this.iDy != null) {
            return this.iDy.dfC();
        }
        return 0;
    }

    public void BH(int n) {
        int n2 = this.dxd();
        if (n >= n2) {
            n = n2 - 1;
        }
        if (n < 0) {
            n = 0;
        }
        this.hQx = n;
        if (this.iDy != null) {
            this.iDy.BH(n);
        }
        fse_1.gFu().a((aef_2)this, iCT, iCS, iCV, iCE, iCD);
    }

    public bhJ dxe() {
        return (bhJ)bgg_0.dlO().jv(this.iDB);
    }

    public int dfz() {
        return this.iDy == null ? 0 : this.iDy.dfz();
    }

    public short dfu() {
        return this.hQm;
    }

    public void bn(short s) {
        this.hQm = s;
        this.dxa();
    }

    public short dfv() {
        return this.hQn;
    }

    public void bo(short s) {
        this.hQn = s;
        this.dxa();
    }

    public void dxf() {
        fse_1.gFu().a((aef_2)this, iCD);
        if (this.iDy != null) {
            for (bmv_1 bmv_12 : this.iDy.dxi()) {
                bmv_12.dxx();
            }
        }
    }

    public void dxg() {
        this.hQm = 0;
        this.hQn = (short)200;
        this.hVA = "";
        this.iDs = false;
        this.iDt = false;
        this.iDu = false;
        this.dxa();
        fse_1.gFu().a((aef_2)this, iCW, iCX, iCY);
    }

    public void a(bmf_2 bmf_22) {
        this.hQm = bmf_22.hQm;
        this.hQn = bmf_22.hQn;
        this.hVA = bmf_22.hVA;
        this.iDs = bmf_22.iDs;
        this.iDt = bmf_22.iDt;
        this.iDu = bmf_22.iDu;
    }
}

