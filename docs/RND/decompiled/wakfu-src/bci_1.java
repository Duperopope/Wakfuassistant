/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongIterator
 *  gnu.trove.set.hash.TLongHashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TLongIterator;
import gnu.trove.set.hash.TLongHashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bcI
 */
public class bci_1
extends bcx_2
implements bdz_0,
ffc_2 {
    public static final String hGR = "name";
    public static final String hGS = "achievementId";
    public static final String hGT = "rootCategoryName";
    public static final String hGU = "achievementTypeName";
    public static final String hGV = "iconUrl";
    public static final String hGW = "isCompleted";
    public static final String hGX = "isFollowable";
    public static final String hGY = "isActivated";
    public static final String hGZ = "isFollowed";
    public static final String hHa = "isHidden";
    public static final String hHb = "isVisibleForPlayer";
    public static final String hHc = "isLocalPlayer";
    public static final String hHd = "progressionText";
    public static final String hHe = "progressionValue";
    public static final String hHf = "goals";
    public static final String hHg = "firstGoal";
    public static final String hHh = "remainingGoals";
    public static final String hHi = "hasBaseRewards";
    public static final String hHj = "rewards";
    public static final String hHk = "xpReward";
    public static final String hHl = "aptitudeReward";
    public static final String hHm = "textRewards";
    public static final String hHn = "visualRewards";
    public static final String hHo = "visualBoosterRewards";
    public static final String hHp = "stateColor";
    public static final String hHq = "isQuest";
    public static final String hHr = "isShareable";
    public static final String hHs = "duration";
    public static final String hHt = "recommandedLevel";
    public static final String hHu = "recommandedPlayers";
    public static final String hHv = "remainingTime";
    public static final String hHw = "cooldown";
    public static final String hHx = "isRunning";
    public static final String hHy = "canReset";
    public static final String hHz = "rank";
    public static final String hHA = "activable";
    public static final String hHB = "activationCriterionDescription";
    public static final String hHC = "mercenariesStateColor";
    public static final String hHD = "concernedCharacters";
    public static final String hHE = "heroesPartyExists";
    public static final String hHF = "freeSubscriptionLevel";
    public static final String hHG = "kamaReward";
    public static final String hHH = "hasTextRewards";
    public static final String hHI = "startDateField";
    public static final String hHJ = "endDateField";
    public static final String hHK = "illustration";
    public static final String hHL = "questType";
    public static final String hHM = "questTypeName";
    public static final String hHN = "tabbedContainerSize";
    public static final String hHO = "isCollapsed";
    public static final String hHP = "tagColor";
    public static final String hHQ = "hasBrightBackground";
    public static final String hHR = "gradientColor";
    public static final String hHS = "followedQuestTitleColor";
    public static final String hHT = "heightDisplayed";
    public static final String hHU = "isMainQuest";
    public static final String hHV = "justActivated";
    public static final String hHW = "justCompleted";
    public static final String[] hHX = new String[]{"name", "iconUrl", "isCompleted", "isFollowed", "isHidden", "isVisibleForPlayer", "isActivated", "progressionText", "progressionValue", "backgroundText", "goals", "firstGoal", "rewards", "textRewards", "stateColor", "remainingGoals", "isQuest", "freeSubscriptionLevel", "kamaReward", "visualBoosterRewards", "hasTextRewards", "rootCategoryName", "tabbedContainerSize", "justActivated", "justCompleted"};
    private static final awx_2 hHY = new awx_2(0.3f, 0.9f, 0.2f, 1.0f);
    private static final awx_2 hHZ = new awx_2(255, 222, 108, 255);
    protected final int hIa;
    private final int hIb;
    private final int hIc;
    private final int hId;
    private final String hIe;
    private final long hIf;
    private boolean hFE = true;
    private bce_2 hIg;
    private bce_2 hIh;
    private bce_2 hIi;
    private boolean hIj = false;
    private final Collection<bce_2> hIk = new ArrayList<bce_2>();
    private final Collection<bce_2> hIl = new ArrayList<bce_2>();
    private final Collection<bce_2> hIm = new ArrayList<bce_2>();
    private final Collection<bce_2> hIn = new ArrayList<bce_2>();
    private final Logger hIo = Logger.getLogger(bci_1.class);
    protected final bhJ hIp;
    protected final bcd_2 hIq;
    private boolean hIr = false;
    private boolean hIs = false;
    private static final int hIt = 36;
    private final byte hIu = (byte)24;
    private final byte hIv = (byte)62;
    private final byte hIw = (byte)4;
    private final int hIx = 309;
    private final int hIy = 36;
    private final int hIz = 254;
    private static final int hIA = 330;
    private static final int hIB = 0;
    private static final String hIC = "fontDefault14";
    private static final int hID = 90;
    public static final ua_0 hIE = new uz_0(10, 0, 0, 0);

    public bci_1(long l, int n, int n2, int n3, String string, int n4) {
        this.hIf = l;
        this.hIp = (bhJ)fcL.rUh.sw(l);
        this.hIq = bbw_2.hCq.je(l);
        this.hIa = n;
        this.hIc = n2;
        this.hId = n3;
        this.hIe = string;
        this.hIb = n4;
        this.dcf();
    }

    private void dcf() {
        bbu_2 bbu_22 = this.daS();
        this.hIg = null;
        this.hIh = null;
        this.hIi = null;
        this.hIj = false;
        this.hIk.clear();
        this.hIl.clear();
        this.hIm.clear();
        this.hIn.clear();
        for (bcl_1 bcl_12 : bbu_22.aFV()) {
            bce_2 bce_22 = new bce_2(bcl_12, this);
            if (bcl_12.dbb() == bby_2.hCA) {
                this.hIh = bce_22;
            } else if (bcl_12.dbb() == bby_2.hCE) {
                this.hIi = bce_22;
            } else if (bcl_12.dbb().brO() && bcl_12.dbb().day() && bcl_12.dbb() != bby_2.hCz && bcl_12.dbb() != bby_2.hCG && bcl_12.dbb() != bby_2.hCA && bcl_12.dbb() != bby_2.hCK) {
                this.hIj = true;
                if (!bce_22.bqp()) {
                    this.hIk.add(bce_22);
                }
            } else if (bcl_12.dbb().brO() && !bcl_12.dbb().day()) {
                if (!bce_22.bqp()) {
                    this.hIl.add(bce_22);
                }
                if (!bce_22.bqp() && bce_22.dbW()) {
                    this.hIm.add(bce_22);
                }
            }
            if (bce_22.bqp()) continue;
            this.hIn.add(bce_22);
        }
        this.hIg = this.dcg();
        fse_1.gFu().a((aef_2)this, hHl, hHk, hHm, hHn, hHo, hHj, hHi);
    }

    public long KU() {
        return this.hIf;
    }

    @Override
    public String[] bxk() {
        return hHX;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(hGW)) {
            return this.app();
        }
        if (string.equals(hGY)) {
            return this.apo();
        }
        if (string.equals(hGS)) {
            return this.hIa;
        }
        if (string.equals(hGT)) {
            return this.hIe;
        }
        if (string.equals(hGZ)) {
            return this.dcc();
        }
        if (string.equals(hHa)) {
            return this.bqp();
        }
        if (string.equals(hHb)) {
            return this.isVisible();
        }
        if (string.equals(hHc)) {
            return this.hIp.Sn() == aue_0.cVJ().cVL().Sn();
        }
        if (string.equals(hHd)) {
            return this.dcl() + "/" + this.dck();
        }
        if (string.equals(hHe)) {
            return Float.valueOf((float)this.dcl() / (float)this.dck());
        }
        if (string.equals(hHh)) {
            ArrayList<bcc_2> arrayList = new ArrayList<bcc_2>();
            bbu_2 bbu_22 = this.daS();
            for (bcj_1 bcj_12 : bbu_22.dau()) {
                if (!this.d(bcj_12) || bcj_12.daJ()) continue;
                bcc_2 bcc_22 = bcm_1.hIK.s(this.hIf, bcj_12.d());
                arrayList.add(bcc_22);
            }
            return arrayList;
        }
        if (string.equals(hHl)) {
            if (!this.hIh.bqp()) {
                return this.hIh;
            }
            return null;
        }
        if (string.equals(hHk)) {
            if (this.hIg != null && !this.hIg.bqp()) {
                return this.hIg;
            }
            return null;
        }
        if (string.equals(hHG)) {
            return this.hIi;
        }
        if (string.equals(hHm)) {
            return this.hIk;
        }
        if (string.equals(hHn)) {
            return this.hIl;
        }
        if (string.equals(hHo)) {
            return this.hIm;
        }
        if (string.equals(hHj)) {
            return this.hIn;
        }
        if (string.equals(hHi)) {
            return this.hIj;
        }
        if (string.equals(hHp)) {
            bcd_2 bcd_22 = this.hIq;
            if (bcd_22.oe(this.hIa)) {
                return hHY;
            }
            if (bcd_22.od(this.hIa)) {
                return awx_2.dnF;
            }
            return awx_2.dnJ;
        }
        if (string.equals(hHq)) {
            return this.dax();
        }
        if (string.equals(hHs)) {
            bbu_2 bbu_23 = this.daS();
            if (bbu_23.getDuration() <= 0) {
                return null;
            }
            uz_0 uz_02 = uz_0.fo(bbu_23.getDuration() / 1000);
            return aum_0.cWf().c(hHs, new Object[0]) + uc_0.l(uz_02);
        }
        if (string.equals(hHr)) {
            bbu_2 bbu_24 = this.daS();
            boolean bl = PK.a(bbu_24, ue_0.bjV().bjc());
            return bbu_24.cjj() && bl && !bbu_24.app();
        }
        if (string.equals(hHu)) {
            bbu_2 bbu_25 = this.daS();
            return bbu_25.cjm();
        }
        if (string.equals(hHt)) {
            bbu_2 bbu_26 = this.daS();
            return aum_0.cWf().c("levelShort.custom", bbu_26.cjl());
        }
        if (string.equals(hHg)) {
            ArrayList<bcw_1> arrayList = this.dbs();
            return arrayList.isEmpty() ? null : arrayList.getFirst();
        }
        if (string.equals(hGX)) {
            bbu_2 bbu_27 = this.daS();
            return bbu_27.cjn();
        }
        if (string.equals(hHy)) {
            return this.hIq.om(this.hIa);
        }
        if (string.equals(hHx)) {
            return this.hIq.oh(this.hIa);
        }
        if (string.equals(hHz)) {
            bbu_2 bbu_28 = this.daS();
            return bbu_28.aYr();
        }
        if (string.equals(hHB)) {
            bbu_2 bbu_29 = this.daS();
            ahv_2 ahv_22 = new ahv_2();
            ang_2 ang_22 = bbu_29.daw();
            if (ang_22 == null) {
                return "";
            }
            String string2 = eLP.b(ang_22);
            ahv_22.ceC().e(this.hIq.a(this.hIa, this.hIp) ? awx_2.dnF : awx_2.dnJ);
            ahv_22.c(string2);
            return ahv_22.ceL();
        }
        if (string.equals(hHC)) {
            if (this.app()) {
                return hHY;
            }
            if (this.hIq.od(this.hIa)) {
                return hHZ;
            }
            if (this.hIq.a(this.hIa, this.hIp)) {
                return awx_2.dnF;
            }
            return awx_2.dnJ;
        }
        if (string.equals(hHA)) {
            return this.dch();
        }
        if (string.equals(hHD)) {
            return this.dci();
        }
        if (string.equals(hHE)) {
            return fcL.rUh.sA(this.hIp.Xi()) > 1;
        }
        if (string.equals(hHw)) {
            bbu_2 bbu_210 = this.daS();
            if (!bbu_210.app()) {
                return null;
            }
            ua_0 ua_02 = bbu_210.aYn() != 0L && bbu_210.aYu() != 0L ? PK.g(bbu_210, ue_0.bjV().bjc()) : (bbu_210.aYp() != null ? PK.a((PJ)bbu_210, ue_0.bjV().bjc()) : ua_0.bwa);
            if (!ua_02.aYI()) {
                return null;
            }
            return uc_0.k(ua_02);
        }
        if (string.equals(hHH)) {
            bbu_2 bbu_211 = this.daS();
            for (bcl_1 bcl_12 : bbu_211.aFV()) {
                if (!bcl_12.dbb().brO() || !bcl_12.dbb().day()) continue;
                return true;
            }
            return false;
        }
        if (string.equals(hHI)) {
            return this.ji(this.hIq.AZ(this.hIa).atA());
        }
        if (string.equals(hHJ)) {
            return this.ji(this.hIq.AZ(this.hIa).aYu());
        }
        if (string.equals(hHL)) {
            return this.daS().dav().d();
        }
        if (string.equals(hHM)) {
            return this.daS().dav().aXB();
        }
        if (string.equals(hHK)) {
            String string3 = this.daS().cjv();
            return BH.aU(string3) ? null : auc_0.cVq().kB(string3);
        }
        if (string.equals(hHN)) {
            ArrayList<bcl_1> arrayList = this.daS().aFV();
            int n = 36;
            int n2 = 0;
            for (bcl_1 bcl_13 : arrayList) {
                if (bcl_13.dbb() == bby_2.hCz || bcl_13.dbb() == bby_2.hCG || bcl_13.dbb() == bby_2.hCK || bcl_13.dbb() == bby_2.hCE) {
                    n += 24;
                    continue;
                }
                ++n2;
            }
            if (n2 > 0) {
                n += 62;
                if (n2 > 4) {
                    n += 62;
                }
            }
            ArrayList<bcj_1> arrayList2 = this.daS().dau();
            int n3 = 0;
            int n4 = 0;
            if (arrayList2 != null) {
                awx_1 awx_12 = fyw_0.gqw().gqB().uG(hIC);
                Iterator iterator = arrayList2.iterator();
                while (iterator.hasNext()) {
                    bcj_1 bcj_13 = (bcj_1)iterator.next();
                    if (!this.d(bcj_13)) continue;
                    int n5 = (awx_12.gj(aum_0.cWf().a(64, (long)bcj_13.d(), new Object[0])) + 36) / 254 + 1;
                    n3 += n5;
                    if (n5 <= 1) continue;
                    n4 -= n5 * 4;
                }
            }
            return new fsm_1(309, GC.a(Math.max(n4 += 36 + n3 * 24, n), 0, 330));
        }
        if (string.equals(hGU)) {
            return aum_0.cWf().c("achievement.quest.type." + this.daS().dav().d(), new Object[0]);
        }
        if (string.equals(hHT)) {
            HashMap<Integer, Integer> hashMap = bcm_1.hIK.dcu();
            Integer n = hashMap.get(this.daS().d());
            if (n != null) {
                return new fsm_1(100.0f, (int)n);
            }
            return new fsm_1(100.0f, 90);
        }
        if (string.equals(hHU)) {
            return this.daS().dav() == bbz_2.hCU;
        }
        if (string.equals(hHO)) {
            return this.hFE;
        }
        if (string.equals(hHP)) {
            switch (this.daS().dav()) {
                case hCS: {
                    return null;
                }
                case hCT: {
                    return "labelItemRarityLegendary";
                }
                case hCU: {
                    return "labelItemRarityMythic";
                }
                case hCV: {
                    return "labelItemRarityRare";
                }
                case hCW: {
                    return "labelItemRarityMemory";
                }
                case hCX: {
                    return "labelItemRarityEpic";
                }
            }
            this.hIo.warn((Object)("Unexpected value in tag color: " + String.valueOf(this.daS().dav())));
            return null;
        }
        if (string.equals(hHQ)) {
            return this.daS().dav() == bbz_2.hCT;
        }
        if (string.equals(hHR)) {
            switch (this.daS().dav()) {
                case hCS: {
                    return awx_2.dnF;
                }
                case hCT: {
                    return beo_0.d(fgj.siE);
                }
                case hCU: {
                    return beo_0.d(fgj.siD);
                }
                case hCV: {
                    return beo_0.d(fgj.siC);
                }
                case hCW: {
                    return beo_0.d(fgj.siG);
                }
                case hCX: {
                    return beo_0.d(fgj.siH);
                }
            }
            this.hIo.warn((Object)("Unexpected value in gradient color : " + String.valueOf(this.daS().dav())));
            return null;
        }
        if (string.equals(hHS)) {
            switch (this.daS().dav()) {
                case hCS: {
                    return awx_2.dnF;
                }
                case hCT: {
                    return fhm_2.uwB.a(ett_1.omb);
                }
                case hCU: {
                    return fhm_2.uwB.a(ett_1.oma);
                }
                case hCV: {
                    return fhm_2.uwB.a(ett_1.ome);
                }
                case hCW: {
                    return fhm_2.uwB.a(ett_1.omd);
                }
                case hCX: {
                    return fhm_2.uwB.a(ett_1.omc);
                }
            }
            this.hIo.warn((Object)("Unexpected value in gradient color : " + String.valueOf(this.daS().dav())));
            return null;
        }
        if (hHV.equals(string)) {
            return this.hIr && !this.app();
        }
        if (hHW.equals(string)) {
            return this.hIs;
        }
        return super.eu(string);
    }

    @Nullable
    public bce_2 dcg() {
        bbu_2 bbu_22 = this.daS();
        for (bcl_1 bcl_12 : bbu_22.aFV()) {
            bce_2 bce_22;
            if (bcl_12.dbb() != bby_2.hCz && bcl_12.dbb() != bby_2.hCG && bcl_12.dbb() != bby_2.hCK || (bce_22 = new bce_2(bcl_12, this)).bqp()) continue;
            return bce_22;
        }
        return null;
    }

    public bbu_2 daS() {
        return this.hIq.AZ(this.hIa);
    }

    public boolean dax() {
        return bcm_1.hIK.w(this.hIf, this.hIa);
    }

    public int aYs() {
        bbu_2 bbu_22 = this.daS();
        return bbu_22.aYs();
    }

    private boolean dch() {
        TLongHashSet tLongHashSet = fcL.rUh.sx(this.hIp.Xi());
        for (long l : tLongHashSet) {
            bcd_2 bcd_22 = bbw_2.hCq.je(l);
            if (!bcd_22.om(this.hIa) || !bcd_22.a(this.hIa, (PO)fcL.rUh.sw(l))) continue;
            return true;
        }
        return false;
    }

    private String ji(long l) {
        if (l == 0L) {
            return "-";
        }
        return aum_0.cWf().i(new Date(l));
    }

    private String dci() {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        StringBuilder stringBuilder3 = new StringBuilder();
        TLongHashSet tLongHashSet = fcL.rUh.sx(this.hIp.Xi());
        TLongIterator tLongIterator = tLongHashSet.iterator();
        boolean bl = true;
        boolean bl2 = true;
        boolean bl3 = true;
        while (tLongIterator.hasNext()) {
            boolean bl4;
            long l = tLongIterator.next();
            bcd_2 bcd_22 = bbw_2.hCq.je(l);
            bhJ bhJ2 = (bhJ)fcL.rUh.sw(l);
            boolean bl5 = bcd_22.om(this.hIa) && bcd_22.a(this.hIa, bhJ2);
            boolean bl6 = bcd_22.od(this.hIa) && !bcd_22.oe(this.hIa);
            boolean bl7 = bl4 = bcd_22.od(this.hIa) && bcd_22.oe(this.hIa);
            if (bl4 && bl) {
                stringBuilder3.append(bhJ2.getName());
                bl = false;
                continue;
            }
            if (bl4) {
                stringBuilder3.append(", ").append(bhJ2.getName());
                continue;
            }
            if (bl5 && bl3) {
                stringBuilder.append(bhJ2.getName());
                bl3 = false;
                continue;
            }
            if (bl5) {
                stringBuilder.append(", ").append(bhJ2.getName());
                continue;
            }
            if (bl6 && bl2) {
                stringBuilder2.append(bhJ2.getName());
                bl2 = false;
                continue;
            }
            if (!bl6) continue;
            stringBuilder2.append(", ").append(bhJ2.getName());
        }
        ahv_2 ahv_22 = new ahv_2();
        if (!stringBuilder.toString().isEmpty()) {
            ahv_22.ceu().c(aum_0.cWf().c("available", new Object[0]) + " " + aum_0.cWf().c("colon", new Object[0])).cev().c(stringBuilder);
        }
        if (!stringBuilder2.toString().isEmpty()) {
            if (!ahv_22.toString().isEmpty()) {
                ahv_22.ceH();
            }
            ahv_22.ceu().c(aum_0.cWf().c("inProgress", new Object[0]) + " " + aum_0.cWf().c("colon", new Object[0])).cev().c(stringBuilder2);
        }
        if (!stringBuilder3.toString().isEmpty()) {
            if (!ahv_22.toString().isEmpty()) {
                ahv_22.k('\n');
            }
            ahv_22.ceu().c(aum_0.cWf().c("terminated", new Object[0]) + " " + aum_0.cWf().c("colon", new Object[0])).cev().c(stringBuilder3);
        }
        return ahv_22.toString();
    }

    @Override
    protected String dbq() {
        bbu_2 bbu_22 = this.daS();
        StringBuilder stringBuilder = new StringBuilder();
        if (aum_0.cWf().e(63, this.hIa)) {
            stringBuilder.append(aum_0.cWf().a(63, (long)this.hIa, new Object[0]));
        }
        ArrayList<bcj_1> arrayList = bbu_22.dau();
        for (bcj_1 bcj_12 : arrayList) {
            String string;
            ang_2 ang_22 = bcj_12.daY();
            if (ang_22 == null || !ang_22.b(this.hIp, this.hIp, null, this.hIq) || !aum_0.cWf().e(149, bcj_12.d()) || (string = aum_0.cWf().a(149, (long)bcj_12.d(), new Object[0])).isEmpty()) continue;
            stringBuilder.append('\n');
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    @Override
    public String getName() {
        if (!aum_0.cWf().e(62, this.hIa)) {
            return null;
        }
        return aum_0.cWf().a(62, (long)this.hIa, new Object[0]);
    }

    public String dah() {
        if (!aum_0.cWf().e(62, this.hIa)) {
            return null;
        }
        return aum_0.cWf().b(62, (long)this.hIa, new Object[0]);
    }

    @Override
    protected String byf() {
        return auc_0.cVq().zN(this.hIb);
    }

    @Override
    public int aeV() {
        return 1;
    }

    @Override
    protected String dbr() {
        bbu_2 bbu_22 = this.daS();
        if (!bbu_22.apo() || !bbu_22.apv()) {
            return null;
        }
        ua_0 ua_02 = bbu_22.getDuration() != 0 ? PK.h(bbu_22, ue_0.bjV().bjc()) : (bbu_22.aYp() != null ? PK.i(bbu_22, ue_0.bjV().bjc()) : ua_0.bwa);
        if (!ua_02.aYI()) {
            return null;
        }
        return uc_0.k(ua_02);
    }

    @Override
    public ArrayList<bcw_1> dbs() {
        ArrayList<bcw_1> arrayList = new ArrayList<bcw_1>();
        bbu_2 bbu_22 = this.daS();
        for (bcj_1 bcj_12 : bbu_22.dau()) {
            if (!this.d(bcj_12)) continue;
            bcc_2 bcc_22 = bcm_1.hIK.s(this.hIf, bcj_12.d());
            arrayList.add(bcc_22);
        }
        return arrayList;
    }

    @Override
    protected String dbt() {
        return null;
    }

    @Override
    protected String getStyle() {
        return null;
    }

    public ArrayList<bcj_1> dau() {
        return this.daS().dau();
    }

    public boolean dcc() {
        return this.hIq.ol(this.hIa);
    }

    public boolean dcj() {
        return this.daS().isVisible();
    }

    public boolean isVisible() {
        Object t = fcL.rUh.sw(this.hIf);
        return t != null && this.hIq.b(this.hIa, (PO)t);
    }

    public boolean apo() {
        return this.hIq.od(this.hIa);
    }

    public boolean app() {
        return this.hIq.oe(this.hIa);
    }

    private int dck() {
        ArrayList<bcj_1> arrayList = this.daS().dau();
        int n = 0;
        for (bcj_1 bcj_12 : arrayList) {
            if (!this.d(bcj_12)) continue;
            ++n;
        }
        return n;
    }

    private int dcl() {
        int n = 0;
        bcd_2 bcd_22 = this.hIq;
        for (bcj_1 bcj_12 : bcd_22.AZ(this.hIa).dau()) {
            if (!this.d(bcj_12) || bcd_22.ob(bcj_12.d()) && !bcd_22.oc(bcj_12.d())) continue;
            ++n;
        }
        return n;
    }

    private boolean d(bcj_1 bcj_12) {
        return bbv_2.a(bcj_12, this.hIp);
    }

    @Override
    public int d() {
        return this.hIa;
    }

    public int dce() {
        return this.hIc;
    }

    public boolean equals(Object object) {
        if (!(object instanceof bci_1)) {
            return false;
        }
        return this.hIa == ((bci_1)object).hIa;
    }

    public void dcm() {
        fse_1.gFu().a((aef_2)this, hGZ);
    }

    public void dcn() {
        fse_1.gFu().a((aef_2)this, hHd, hHe, hHh);
    }

    public void dco() {
        fse_1.gFu().a((aef_2)this, hHC, hHA, hHB, hGY, hGW, hHb, hHx, hHy, hHV, hHW);
    }

    public void dcp() {
        ua_0 ua_02;
        bbu_2 bbu_22 = this.daS();
        if (!this.app() && bbu_22.apo() && bbu_22.aYp() != null && (ua_02 = PK.i(bbu_22, ue_0.bjV().bjc())).e(hIE)) {
            this.hIq.s(bbu_22.d(), false);
            if (this.hIq.ol(bbu_22.d())) {
                cjh_0 cjh_02 = new cjh_0(bbu_22.d(), false);
                aue_0.cVJ().etu().d(cjh_02);
            }
        }
        fse_1.gFu().a((aef_2)this, hHv, hHw);
    }

    public boolean dcq() {
        return this.hIr;
    }

    public void fn(boolean bl) {
        if (this.hIr == bl) {
            return;
        }
        this.hIr = bl;
        this.dcs();
    }

    public boolean dcr() {
        return this.hIs;
    }

    public void fo(boolean bl) {
        if (this.hIs == bl) {
            return;
        }
        this.hIs = bl;
        this.dcs();
    }

    private void dcs() {
        bcy_1 bcy_12 = bcm_1.hIK.u(this.hIf, this.hId);
        if (bcy_12 != null) {
            fse_1.gFu().a((aef_2)bcy_12, "hasBulletPoint");
        }
    }

    public String toString() {
        return "AchievementView{m_achievementId=" + this.hIa + ", m_gfxId=" + this.hIb + ", m_rootCategoryId=" + this.hIc + "}";
    }

    @Override
    public String cUG() {
        return this.dah();
    }

    @Override
    public boolean dbK() {
        return this.hFE;
    }

    @Override
    public void fm(boolean bl) {
        if (bl == this.hFE) {
            return;
        }
        this.hFE = bl;
        fse_1.gFu().a((aef_2)this, hHO);
    }

    public boolean bqp() {
        return csc_1.eNJ().J(this.hIf, this.hIa);
    }
}

