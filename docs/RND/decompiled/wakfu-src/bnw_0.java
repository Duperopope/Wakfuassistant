/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSortedMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.collect.ImmutableSortedMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bnW
 */
public class bnw_0
implements aeh_2 {
    public static final String iKD = "currentFilter";
    public static final String iKE = "currentDungeon";
    public static final String iKF = "filters";
    public static final String iKG = "dungeons";
    public static final String iKH = "rankedPlayers";
    public static final String iKI = "hero";
    public static final String iKJ = "heroesPartyExists";
    public static final String iKK = "pageDescription";
    public static final String iKL = "canGoForward";
    public static final String iKM = "canGoBack";
    public static final String iKN = "ladderType";
    public static final String iKO = "filterType";
    public static final String iKP = "isAvailableRewardsMode";
    public static final String iKQ = "hasRewards";
    public static final String iKR = "rewards";
    public static final String iKS = "displayRewardsInfo";
    public static final String iKT = "progrestBarCurrentPercent";
    public static final String iKU = "progrestBarCap";
    public static final String iKV = "progrestBarCurrentValue";
    public static final String iKW = "progrestBarRatioText";
    public static final String iKX = "rewardType";
    public static final String iKY = "dungeonGameplayList";
    public static final String iKZ = "shardsRewardBronze";
    public static final String iLa = "shardsRewardSilver";
    public static final String iLb = "shardsRewardGold";
    private final ArrayList<bnu_0> iLc = new ArrayList();
    final TIntObjectHashMap<bny_0> iLd = new TIntObjectHashMap();
    private final ArrayList<ArrayList<bok>> iLe = new ArrayList();
    private final HashMap<Long, bok> iLf = new HashMap();
    private int iLg;
    private bnu_0 iLh;
    private final ArrayList<bny_0> iLi = new ArrayList();
    private int iLj = -1;
    private int hQx;
    private int iLk;
    private int iLl;
    private long iLm = 0L;
    private eMR iLn = eMR.qNU;
    private eMN iLo = eMN.qNx;
    @NotNull
    private String hVA = "";
    private short hQm = (short)-1;
    private short hQn = Short.MAX_VALUE;
    private Boolean iLp;
    private eIc iLq;
    private boolean iLr;

    public bnw_0() {
        this.dzI();
        this.dzJ();
        this.dzW();
    }

    private void dzI() {
        for (bnt_0 bnt_02 : bnt_0.values()) {
            this.iLc.add(new bnu_0(bnt_02));
        }
        this.iLh = this.iLc.get(0);
    }

    private void dzJ() {
        List<Integer> list = this.dzK();
        eId.quO.D(new bnx_0(this, list));
        bwz_0.jAA.dMZ().forEach((n, bxa_02) -> this.iLd.put(n.intValue(), (Object)new bod((int)n, (bxa_0)bxa_02)));
    }

    private List<Integer> dzK() {
        if (ewo_0.oBF.k(ewr_0.oCX)) {
            return czy_1.eZm();
        }
        return czy_1.eZl();
    }

    public void d(ht_1 ht_12) {
        this.dzL();
        Map<Integer, hy_1> map = ht_12.Iv();
        for (Map.Entry<Integer, hy_1> entry : map.entrySet()) {
            hy_1 hy_12 = entry.getValue();
            bom bom2 = new bom(hy_12, entry.getKey());
            for (Map.Entry<Long, hm_1> entry2 : hy_12.Jc().Hx().entrySet()) {
                Long l = entry2.getKey();
                hm_1 hm_12 = entry2.getValue();
                bok bok2 = new bok(l, hm_12, bom2);
                bom2.a(bok2);
                Object t = fcL.rUh.sw(l);
                if (t == null || ((exP)t).Xi() != aue_0.cVJ().cVK().Xi() || !hm_12.HN()) continue;
                this.iLf.put(l, bok2);
            }
        }
        fcL.rUh.b(aue_0.cVJ().cVK().Xi(), exP2 -> {
            if (!this.iLf.containsKey(exP2.Sn())) {
                bok bok2 = new bok((bhJ)exP2);
                this.iLf.put(exP2.Sn(), bok2);
            }
            return true;
        });
        fse_1.gFu().a((aef_2)this, iKI);
        fse_1.gFu().a((aef_2)this, iKX);
    }

    public void dzL() {
        for (Map.Entry<Long, bok> entry : this.iLf.entrySet()) {
            bom bom2 = entry.getValue().dAF();
            if (bom2 == null) continue;
            bom2.clear();
        }
        this.iLf.clear();
    }

    public void a(ht_1 ht_12, long l) {
        this.aVJ();
        this.iLl = ht_12.In();
        this.iLk = ht_12.Ip();
        this.hQx = 0;
        Map<Integer, hy_1> map = ht_12.Iv();
        ImmutableSortedMap immutableSortedMap = ImmutableSortedMap.copyOf(map);
        int n = ht_12.Ir();
        int n2 = 0;
        long l2 = aue_0.cVJ().cVK().dpI().Yc();
        for (Map.Entry entry : immutableSortedMap.entrySet()) {
            hy_1 hy_12 = (hy_1)entry.getValue();
            bom bom2 = new bom(hy_12, (Integer)entry.getKey());
            Map<Long, hm_1> map2 = hy_12.Jc().Hx();
            ImmutableSortedMap immutableSortedMap2 = ImmutableSortedMap.copyOf(map2);
            for (Map.Entry entry2 : immutableSortedMap2.entrySet()) {
                Long l3 = (Long)entry2.getKey();
                hm_1 hm_12 = (hm_1)entry2.getValue();
                bok bok2 = new bok(l3, hm_12, bom2);
                bom2.a(bok2);
                if (!hm_12.HN()) continue;
                if (n2 < n) {
                    ++n2;
                    continue;
                }
                if (this.iLo == eMN.qNy && hm_12.HP() != l2 || l > 0L && l3 != l) continue;
                if (this.iLe.isEmpty()) {
                    this.iLe.add(new ArrayList());
                }
                int n3 = this.iLe.size() - 1;
                ArrayList<bok> arrayList = this.iLe.get(n3);
                arrayList.add(bok2);
            }
        }
        fse_1.gFu().a((aef_2)this, iKH, iKK, iKM, iKL, iKN, iKO);
    }

    public void aVJ() {
        for (ArrayList<bok> arrayList : this.iLe) {
            for (bok bok2 : arrayList) {
                bom bom2 = bok2.dAF();
                if (bom2 == null) continue;
                bom2.clear();
            }
            arrayList.clear();
        }
        this.iLe.clear();
    }

    public void e(ht_1 ht_12) {
        this.a(ht_12, 0L);
    }

    public void dzM() {
        this.iLl -= 12;
    }

    public void dzN() {
        this.iLl += 12;
    }

    public int dzO() {
        return this.iLg;
    }

    public int dzP() {
        return this.iLj;
    }

    public eMR dzQ() {
        return this.iLn;
    }

    public eMN dzR() {
        return this.iLo;
    }

    public void EC(int n) {
        this.iLj = n;
        fse_1.gFu().a((aef_2)this, iKE);
        fse_1.gFu().a((aef_2)this, iKX);
    }

    public ArrayList<bny_0> dzS() {
        return this.iLi;
    }

    public Boolean dzT() {
        return this.iLp;
    }

    public void d(Boolean bl) {
        this.iLp = bl;
        this.dzW();
    }

    public void bx(byte by) {
        int n = this.iLc.size();
        for (int i = 0; i < n; ++i) {
            bnu_0 bnu_02 = this.iLc.get(i);
            if (bnu_02.dzF().aJr() != by) continue;
            this.a(bnu_02);
            return;
        }
    }

    public void a(bnu_0 bnu_02) {
        if (this.iLh == bnu_02) {
            return;
        }
        this.iLh = bnu_02;
        this.dzW();
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(iKE)) {
            return this.dzV();
        }
        if (string.equals(iKG)) {
            return this.iLi;
        }
        if (string.equals(iKF)) {
            return this.iLc;
        }
        if (string.equals(iKD)) {
            return this.iLh;
        }
        if (string.equals(iKH)) {
            if (this.iLe.isEmpty()) {
                return null;
            }
            return this.iLe.get(this.hQx);
        }
        if (string.equals(iKI)) {
            return this.dzU();
        }
        if (string.equals(iKJ)) {
            return fcL.rUh.sA(aue_0.cVJ().cVK().Xi()) > 1;
        }
        if (string.equals(iKK)) {
            return this.dfB();
        }
        if (string.equals(iKM)) {
            return this.dzY();
        }
        if (string.equals(iKL)) {
            return this.dzZ();
        }
        if (string.equals(iKN)) {
            return (int)this.iLn.aZv();
        }
        if (string.equals(iKO)) {
            return this.iLo.d();
        }
        if (string.equals(iKP)) {
            return this.iLr;
        }
        if (string.equals(iKQ)) {
            an_0 an_02 = aue_0.cVJ().cVO().aCz();
            return an_02 != null && !an_02.aAR().isEmpty();
        }
        if (string.equals(iKS)) {
            return this.dzV() != null && this.dzV().aBk();
        }
        if (string.equals(iKR)) {
            an_0 an_03 = aue_0.cVJ().cVO().aCz();
            if (an_03 == null) {
                return null;
            }
            ArrayList<bsu_0> arrayList = new ArrayList<bsu_0>(5);
            for (AS aS : an_03.aAR()) {
                for (aj_0 aj_02 : aS.aFe()) {
                    Ab ab = aj_02.aEv();
                    int n = (int)ab.aBF();
                    arrayList.add(new bsu_0(new bmj_2(n, (fhc_0)fgD.fXh().Vd(aj_02.acs()), aS, ab)));
                }
                for (Ab ab : aS.aFh()) {
                    arrayList.add(new bsu_0(new bmj_2(1, (fhc_0)fgD.fXh().Vd(8050), aS, ab)));
                }
            }
            for (int i = arrayList.size(); i < 5; ++i) {
                arrayList.add(null);
            }
            return arrayList;
        }
        if (string.equals(iKT)) {
            int n = ewo_0.oBF.i(ewr_0.oEp);
            if ((long)n < this.iLm) {
                return 1.0;
            }
            return Float.valueOf((float)this.iLm / (float)n);
        }
        if (string.equals(iKU)) {
            return ewo_0.oBF.i(ewr_0.oEp);
        }
        if (string.equals(iKV)) {
            return this.iLm;
        }
        if (string.equals(iKX)) {
            bny_0 bny_02 = this.dzV();
            if (bny_02 == null) {
                return "";
            }
            if (!bny_02.aBk()) {
                return aum_0.cWf().c("dungeon.ladder.reward.not.competitive", new Object[0]);
            }
            bok bok2 = this.dzU();
            if (bok2 == null) {
                return "";
            }
            bom bom2 = bok2.dAF();
            return bom2 == null ? aum_0.cWf().c("dungeon.ladder.reward.participate.to.dungeon", new Object[0]) : aum_0.cWf().c("dungeon.ladder.reward.gain", new Object[0]);
        }
        if (string.equals(iKW)) {
            StringBuilder stringBuilder = new StringBuilder();
            int n = ewo_0.oBF.i(ewr_0.oEp);
            stringBuilder.append(aum_0.cWf().c("xpRatio", aum_0.cWf().cQ(this.iLm), aum_0.cWf().cQ(n)));
            return stringBuilder.toString();
        }
        if (string.equals(iKY)) {
            return bnv_0.dzG();
        }
        if (string.equals(iKZ)) {
            return this.ED(13);
        }
        if (string.equals(iLa)) {
            return this.ED(7);
        }
        if (string.equals(iLb)) {
            return this.ED(1);
        }
        return null;
    }

    @NotNull
    private String ED(int n) {
        short s = eIi.dB(this.dzV().aVf());
        int n2 = eMP.fz(s, n - 1);
        return "x " + n2;
    }

    @Nullable
    public bok dzU() {
        List list = (List)fse_1.gFu().vY("heroesParty");
        bgt_0 bgt_02 = (bgt_0)list.get(this.iLg);
        return bgt_02 == null ? this.iLf.get(aue_0.cVJ().cVK().Sn()) : this.iLf.get(bgt_02.Sn());
    }

    public bny_0 dzV() {
        return (bny_0)this.iLd.get(this.iLj);
    }

    private void dzW() {
        this.iLi.clear();
        String string = BH.aT(this.hVA);
        this.iLd.forEachValue(bny_02 -> {
            if (this.iLh.dzF().a((bny_0)bny_02)) {
                if (bny_02.aVf() < this.hQm) {
                    return true;
                }
                if (bny_02.aVf() > this.hQn) {
                    return true;
                }
                if (!this.hVA.isEmpty() && !bny_0.e(bny_02.d(), string)) {
                    return true;
                }
                if (this.iLq != null && this.iLq != bny_02.dAj()) {
                    return true;
                }
                if (this.iLp != null && this.iLp.booleanValue() != bny_02.dAb()) {
                    return true;
                }
                this.iLi.add((bny_0)bny_02);
            } else if (this.iLj == bny_02.d()) {
                this.iLj = -1;
                fse_1.gFu().a((aef_2)this, iKE);
            }
            return true;
        });
        this.iLi.sort(boa_0.iMr);
        if (this.iLj == -1 && !this.iLi.isEmpty()) {
            this.iLj = this.iLi.get(0).d();
        }
        fse_1.gFu().a((aef_2)this, iKG, iKE);
    }

    public void md(@NotNull String string) {
        this.hVA = string;
        this.dzW();
    }

    public void bn(short s) {
        this.hQm = s;
        this.dzW();
    }

    public void bo(short s) {
        this.hQn = s;
        this.dzW();
    }

    public void F(short s, short s2) {
        this.hQm = s;
        this.hQn = s2;
        this.dzW();
    }

    public void a(eIc eIc2) {
        this.iLq = eIc2;
        this.dzW();
    }

    public String dwS() {
        return this.hVA;
    }

    public short dfu() {
        return this.hQm;
    }

    public short dfv() {
        return this.hQn;
    }

    public eIc dzX() {
        return this.iLq;
    }

    public void EE(int n) {
        this.iLg = n;
    }

    private String dfB() {
        int n = Math.max(0, this.EF(this.iLl));
        return n + this.hQx + 1 + "/" + (this.EF(this.iLk - 1) + 1);
    }

    private int EF(int n) {
        return n / 12;
    }

    public boolean dzY() {
        return this.EF(this.iLl) + this.hQx > 0;
    }

    public boolean dzZ() {
        return this.EF(this.iLl) + this.hQx < this.EF(this.iLk - 1);
    }

    public boolean EG(int n) {
        int n2;
        int n3 = this.EF(this.iLl);
        int n4 = n3 + (n2 = this.iLe.size()) - 1;
        if (n > n4 || n < n3) {
            return false;
        }
        this.hQx = n - n3;
        fse_1.gFu().a((aef_2)this, iKH, iKK, iKM, iKL);
        return true;
    }

    public void a(eMR eMR2) {
        this.iLn = eMR2;
    }

    public int dAa() {
        return this.EF(this.iLk - 1);
    }

    public int dfz() {
        return this.EF(this.iLl) + this.hQx;
    }

    public void a(eMN eMN2) {
        this.iLo = eMN2;
    }

    public void gJ(boolean bl) {
        this.iLr = bl;
        fse_1.gFu().a((aef_2)this, iKP);
    }

    public void kg(long l) {
        this.iLm = l;
        fse_1.gFu().a((aef_2)this, iKT, iKV);
    }
}

