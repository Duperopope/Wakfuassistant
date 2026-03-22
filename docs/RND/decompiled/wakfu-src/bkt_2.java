/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bKt
 */
public class bkt_2
implements aeh_2 {
    public static final String knG = "animatedElement";
    public static final String knH = "animName";
    public static final String knI = "name";
    public static final String knJ = "score";
    public static final String knK = "ranking";
    public static final String knL = "rank";
    public static final String knM = "smiley";
    public static final String knN = "guildName";
    public static final String knO = "level";
    public static final String knP = "currentStreakDescription";
    public static final String knQ = "maxStreakDescription";
    public static final String knR = "totalMatches";
    public static final String knS = "1v1Matches";
    public static final String knT = "2v2Matches";
    public static final String knU = "3v3Matches";
    public static final String knV = "4v4Matches";
    public static final String knW = "5v5Matches";
    public static final String knX = "6v6Matches";
    public static final String knY = "allMatches";
    public static final String knZ = "pvpRankIconUrl";
    public static final String koa = "pvpRankPassportIconUrl";
    public static final String kob = "nationId";
    private static final String[] koc = new String[]{"animatedElement", "name", "score", "ranking", "rank", "smiley", "guildName", "level", "currentStreakDescription", "maxStreakDescription", "totalMatches", "1v1Matches", "2v2Matches", "3v3Matches", "4v4Matches", "5v5Matches", "6v6Matches", "allMatches", "nationId", "pvpRankIconUrl", "pvpRankPassportIconUrl"};
    private fpq_0 kod;
    private bue_0 koe;
    private final ArrayList<bkx_2> kof = new ArrayList();
    private bdj_2 hKX;
    private static final TLongObjectHashMap<bkt_2> kog = new TLongObjectHashMap();
    private static final azs_2<Long, bkt_2> koh = new azs_2(50);

    public static void clear() {
        koh.clear();
        kog.clear();
    }

    public static bkt_2 a(fjm fjm2, boolean bl) {
        fpq_0 fpq_02 = new fpq_0(fjm2.Sn(), fjm2.ffF().Xt());
        eic_0 eic_02 = new eic_0(fjm2.Sn());
        fpq_02.b(eic_02);
        eic_02.nL(fjm2.Xi());
        eic_02.dm(fjm2.getName());
        eic_02.aT(fjm2.aWP());
        eic_02.aQ(fjm2.aWO());
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        boolean bl2 = bgt_02.Sn() == fpq_02.Sn();
        bkt_2 bkt_22 = bkt_2.a(fpq_02);
        if (bkt_22 == null) {
            bkt_2 bkt_23 = bl2 ? bkt_2.a(fpq_02, bgt_02.ddI()) : bkt_2.b(fpq_02);
            bkt_23.ebq();
            return bkt_23;
        }
        if (bl) {
            bkt_22.ebq();
        }
        return bkt_22;
    }

    public static bkt_2 a(fpq_0 fpq_02, boolean bl) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        boolean bl2 = bgt_02.Sn() == fpq_02.Sn();
        bkt_2 bkt_22 = bkt_2.a(fpq_02);
        if (bkt_22 == null) {
            return bl2 ? bkt_2.a(fpq_02, bgt_02.ddI()) : bkt_2.b(fpq_02);
        }
        if (bl) {
            bkt_22.d(fpq_02);
            return bkt_22;
        }
        bkt_22.c(fpq_02);
        return bkt_22;
    }

    private static bkt_2 a(fpq_0 fpq_02) {
        bkt_2 bkt_22 = (bkt_2)kog.get(fpq_02.Sn());
        return bkt_22 == null ? koh.O(fpq_02.Sn()) : bkt_22;
    }

    private static bkt_2 b(fpq_0 fpq_02) {
        bkt_2 bkt_22 = new bkt_2(fpq_02);
        koh.f(fpq_02.Sn(), bkt_22);
        return bkt_22;
    }

    private static bkt_2 a(fpq_0 fpq_02, bdj_2 bdj_22) {
        bkt_2 bkt_22 = new bkt_2(fpq_02);
        bkt_22.hKX = bdj_22;
        kog.put(fpq_02.Sn(), (Object)bkt_22);
        return bkt_22;
    }

    private bkt_2(fpq_0 fpq_02) {
        this.kod = fpq_02;
        this.koe = bue_0.a(fpq_02.aWP(), fpq_02.aWO(), VI.bJF.d());
        if (this.kod.fwD() != null) {
            this.hKX = bdh_1.a(this.kod);
        }
        for (fpo_0 fpo_02 : fpo_0.values()) {
            this.kof.add(new bkx_2(fpo_02, fpq_02));
        }
    }

    private void c(fpq_0 fpq_02) {
        this.kod = fpq_02;
        this.koe = bue_0.a(fpq_02.aWP(), fpq_02.aWO(), VI.bJF.d());
        if (this.kod.fwD() != null) {
            this.hKX = bdh_1.a(this.kod);
        }
        fse_1.gFu().a((aef_2)this, koc);
        for (fpo_0 fpo_02 : fpo_0.values()) {
            this.kof.get(fpo_02.aJr()).c(fpq_02);
        }
    }

    private void d(fpq_0 fpq_02) {
        this.kod = fpq_02;
        this.koe = bue_0.a(fpq_02.aWP(), fpq_02.aWO(), VI.bJF.d());
        if (this.kod.fwD() != null) {
            this.hKX = bdh_1.a(this.kod);
        }
        for (fpo_0 fpo_02 : fpo_0.values()) {
            this.kof.get(fpo_02.aJr()).c(fpq_02);
        }
    }

    public fpq_0 ebp() {
        return this.kod;
    }

    @Override
    public String[] bxk() {
        return koc;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(knZ)) {
            int n = this.kod.Xt();
            fpp_0 fpp_02 = this.kod.eDH();
            return auc_0.cVq().a("pvpRankIconsPath", "defaultIconPath", n, fpp_02.aJr());
        }
        if (string.equals(koa)) {
            int n = this.kod.Xt();
            fpp_0 fpp_03 = this.kod.eDH();
            return auc_0.cVq().a("pvpRankPassportIconsPath", "defaultIconPath", n, fpp_03.aJr());
        }
        if (string.equals(kob)) {
            return this.kod.Xt();
        }
        if (string.equals(knG)) {
            return this.hKX;
        }
        if (string.equals(knH)) {
            return "AnimEmote-Victoire";
        }
        if (string.equals(knI)) {
            return this.kod.getName();
        }
        if (string.equals(knJ)) {
            return this.kod.ggt();
        }
        if (string.equals(knK)) {
            int n = this.kod.ggu();
            return n == -1 ? "-" : Integer.valueOf(n + 1);
        }
        if (string.equals(knL)) {
            return aum_0.cWf().c("nation.pvpRank." + String.valueOf(this.kod.ggx()), new Object[0]);
        }
        if (string.equals(knM)) {
            return this.koe;
        }
        if (string.equals(knO)) {
            return this.kod.cmL();
        }
        if (string.equals(knR)) {
            return this.kof.get(fpo_0.sNM.aJr());
        }
        if (string.equals(knS)) {
            return this.kof.get(fpo_0.sNN.aJr());
        }
        if (string.equals(knT)) {
            return this.kof.get(fpo_0.sNO.aJr());
        }
        if (string.equals(knU)) {
            return this.kof.get(fpo_0.sNP.aJr());
        }
        if (string.equals(knV)) {
            return this.kof.get(fpo_0.sNQ.aJr());
        }
        if (string.equals(knW)) {
            return this.kof.get(fpo_0.sNR.aJr());
        }
        if (string.equals(knX)) {
            return this.kof.get(fpo_0.sNS.aJr());
        }
        if (string.equals(knY)) {
            return this.kof;
        }
        if (string.equals(knP)) {
            return "x" + this.kod.ggz();
        }
        if (string.equals(knQ)) {
            return "x" + this.kod.ggA();
        }
        return null;
    }

    public void ebq() {
        cxu_0 cxu_02 = new cxu_0(this.kod.Sn());
        aue_0.cVJ().etu().d(cxu_02);
    }

    public String toString() {
        return "PvpLadderEntryView{m_entry=" + String.valueOf(this.kod) + ", m_smiley=" + String.valueOf(this.koe) + "}";
    }
}

