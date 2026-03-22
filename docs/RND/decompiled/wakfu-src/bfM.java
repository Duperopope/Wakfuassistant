/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.regex.Matcher;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.log4j.Logger;

public abstract class bfM
extends bcx_2 {
    private static final Logger hVN = Logger.getLogger(bfM.class);
    public static final String hVO = "score";
    public static final String hVP = "firstRankReward";
    public static final String hVQ = "secondRankReward";
    public static final String hVR = "thirdRankReward";
    public static final String hVS = "finalReward";
    public static final String hVT = "hasRewards";
    public static final String hVU = "hasMoreThanOneReward";
    public static final String hVV = "resultDescriptionIconUrl";
    private static final String hVW = "challengeColor";
    private long cJM;
    private bgg hVX = null;

    @Override
    public Object eu(String string) {
        if (string.equals(hVO)) {
            return this.cJM;
        }
        if (string.equals(hVV)) {
            bfU bfU2 = bgd.diV().Cs(this.clS());
            bfT bfT2 = this.dhu();
            if (bfU2 == null || !bfU2.dii().djb()) {
                return auc_0.cVq().a("challengeResultQualityIconsPath", "defaultIconPath", eIs.qwp.aJr());
            }
            short s = bfT2.dit();
            if (s <= 0) {
                return auc_0.cVq().a("challengeResultQualityIconsPath", "defaultIconPath", eIs.qws.aJr());
            }
            if (s == 1) {
                return auc_0.cVq().a("challengeResultQualityIconsPath", "defaultIconPath", eIs.qwp.aJr());
            }
            float f2 = (float)(s - 3) / (float)(bfT2.diy() - 3);
            if (s == 2 || s == 3) {
                return auc_0.cVq().a("challengeResultQualityIconsPath", "defaultIconPath", eIs.qwq.aJr());
            }
            if ((double)f2 <= 0.5) {
                return auc_0.cVq().a("challengeResultQualityIconsPath", "defaultIconPath", eIs.qwr.aJr());
            }
            return auc_0.cVq().a("challengeResultQualityIconsPath", "defaultIconPath", eIs.qws.aJr());
        }
        if (string.equals(hVP)) {
            if (bfM.Cf(this.clS())) {
                return new bgo();
            }
            bfT bfT3 = this.dhu();
            if (bfT3 == null) {
                bfU bfU3 = bgd.diV().Cs(this.clS());
                ArrayList<bgh> arrayList = bfU3.aFV();
                if (arrayList == null || arrayList.size() < 1) {
                    return null;
                }
                bgh bgh2 = arrayList.get(0);
                return bgk.hZN.a(bgh2.d(), bgh2);
            }
            return bfT3.Cl(0);
        }
        if (string.equals(hVQ)) {
            bfT bfT4 = this.dhu();
            if (bfT4 == null) {
                bfU bfU4 = bgd.diV().Cs(this.clS());
                ArrayList<bgh> arrayList = bfU4.aFV();
                if (arrayList == null || arrayList.size() < 2) {
                    return null;
                }
                bgh bgh3 = arrayList.get(1);
                return bgk.hZN.a(bgh3.d(), bgh3);
            }
            return bfT4.Cl(1);
        }
        if (string.equals(hVR)) {
            bfT bfT5 = this.dhu();
            if (bfT5 == null) {
                bfU bfU5 = bgd.diV().Cs(this.clS());
                ArrayList<bgh> arrayList = bfU5.aFV();
                if (arrayList == null || arrayList.size() < 3) {
                    return null;
                }
                bgh bgh4 = arrayList.get(2);
                return bgk.hZN.a(bgh4.d(), bgh4);
            }
            return bfT5.Cl(2);
        }
        if (string.equals(hVS)) {
            if (bfM.Cf(this.clS())) {
                return new bgo();
            }
            bfT bfT6 = this.dhu();
            return bfT6.diu();
        }
        if (string.equals(hVT)) {
            bfU bfU6 = bgd.diV().Cs(this.clS());
            return !bfU6.aFV().isEmpty();
        }
        if (string.equals(hVU)) {
            bfU bfU7 = bgd.diV().Cs(this.clS());
            return bfU7.aFV().size() > 1;
        }
        if (string.equals(hVW)) {
            return null;
        }
        return super.eu(string);
    }

    public void dhq() {
        bgb bgb2 = this.Ce(this.clS());
        if (bgb2 != null) {
            String string;
            Matcher matcher;
            if (bgb2.aGm() != null && bgb2.aGm().length() > 0) {
                this.cJM = this.dhu().lB(bgb2.aGm());
            }
            if ((matcher = bgc.hZa.matcher(string = bgb2.diS())).find()) {
                this.cJM = this.dhu().lB(matcher.group().substring(1, matcher.group().length() - 1));
            }
        }
    }

    @Override
    public String getName() {
        bfU bfU2 = bgd.diV().Cs(this.clS());
        return bfU2.diA();
    }

    @Override
    protected String byf() {
        bfU bfU2 = bgd.diV().Cs(this.clS());
        try {
            return String.format(auc_0.cVq().bS("challengeCategoryIconsPath"), bfU2.dih().aJr());
        }
        catch (fu_0 fu_02) {
            hVN.warn((Object)fu_02.getMessage());
            return null;
        }
    }

    @Override
    public int d() {
        return this.clS();
    }

    @Override
    public int aeV() {
        return 2;
    }

    @Override
    protected String dbr() {
        bfT bfT2 = this.dhu();
        if (bfT2 == null) {
            return null;
        }
        short s = bfT2.dhG();
        return s > 0 ? bfM.br(s) : null;
    }

    @Override
    protected ArrayList<bcw_1> dbs() {
        int n = this.clS();
        bgb bgb2 = this.Ce(n);
        ArrayList<bcw_1> arrayList = new ArrayList<bcw_1>();
        if (bgb2 != null) {
            bgc bgc2 = bgk.hZN.dk(n, bgb2.d());
            arrayList.add(bgc2);
        } else {
            arrayList.add(new bga(n));
        }
        return arrayList;
    }

    private bgb Ce(int n) {
        bgb bgb2 = bgd.diV().Ct(n);
        if (bgb2 == null) {
            bgb2 = bgd.diV().Cu(n);
        }
        return bgb2;
    }

    @Override
    protected String getStyle() {
        bfU bfU2 = bgd.diV().Cs(this.clS());
        return "challengeCategory" + bfU2.dii().aJr();
    }

    @Override
    protected String dbt() {
        bfU bfU2 = bgd.diV().Cs(this.clS());
        if (bfU2 == null || !bfU2.dii().djb()) {
            return null;
        }
        bfT bfT2 = this.dhu();
        if (bfT2 == null) {
            return null;
        }
        short s = bfT2.dit();
        if (s == -2) {
            return aum_0.cWf().c("challenge.ranking.loser", new Object[0]);
        }
        if (s == -1) {
            return aum_0.cWf().c("challenge.ranking.unknown", new Object[0]);
        }
        ahv_2 ahv_22 = new ahv_2();
        ahv_22.aN(s).c("/").yx(bfT2.diy());
        return ahv_22.ceL();
    }

    private static String br(short s) {
        int n = s / 60;
        int n2 = s - 60 * n;
        return String.format("%d:%s", n, n2 > 9 ? Integer.valueOf(n2) : "0" + n2);
    }

    public void cAN() {
        this.dbB();
        this.dbC();
        this.dbA();
    }

    public void dhr() {
    }

    public void dhs() {
    }

    public void dht() {
    }

    protected abstract bfT dhu();

    public abstract int clS();

    @Override
    protected String dbq() {
        bfU bfU2 = bgd.diV().Cs(this.clS());
        return bfU2.diD();
    }

    private static boolean Cf(int n) {
        return ArrayUtils.contains((int[])ewb_0.oIf, (int)n);
    }
}

