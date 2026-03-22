/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public class bvk
implements aeh_2 {
    private static final bvk jsj = new bvk();
    private final ezy_1 jsk = new bvl(this);
    ezu_1 iod;
    public static final String jsl = "name";
    public static final String jsm = "blazon";
    public static final String jsn = "numMembers";
    public static final String jso = "membersLevelAverage";
    public static final String jsp = "guildLevelText";
    public static final String jsq = "currentGuildPoints";
    public static final String jsr = "totalGuildPoints";
    public static final String jss = "conquestPoints";
    public static final String jst = "membersList";
    public static final String jsu = "displayDisconnectedMembers";
    public static final String jsv = "canInvite";
    public static final String jsw = "iAmLeader";
    public static final String jsx = "guildDescription";
    public static final String jsy = "guildMessage";
    public static final String jsz = "hasRightToEditGuildDescription";
    public static final String jsA = "hasRightToEditGuildMessage";
    public static final String jsB = "hasRightToEditRanks";
    public static final String jsC = "hasRightToCreateRanks";
    public static final String jsD = "hasRightToBuyBonus";
    public static final String jsE = "hasHavenWorld";
    public static final String jsF = "havenWorldPageWarning";
    public static final String jsG = "localPlayer";
    public static final String jsH = "ranks";
    public static final String jsI = "smileys";
    public static final String jsJ = "quests";
    public static final String jsK = "level";
    public static final String jsL = "nextLevel";
    public static final String jsM = "nextLevelCost";
    public static final String jsN = "nextLevelDuration";
    public static final String jsO = "canLevelUp";
    public static final String jsP = "availableBonuses";
    public static final String jsQ = "loadingBonuses";
    public static final String jsR = "permanentBonuses";
    public static final String jsS = "temporaryBonuses";
    public static final String jsT = "simultaneousBonusesText";
    public static final String jsU = "currentWeekGuildPoints";
    public static final String jsV = "guildMembersThreshold";
    public static final String jsW = "mustRename";
    public static final String[] jsX = new String[]{"name", "blazon", "numMembers", "membersLevelAverage", "guildLevelText", "currentGuildPoints", "totalGuildPoints", "membersList", "displayDisconnectedMembers", "canInvite", "iAmLeader", "guildDescription", "guildMessage", "hasRightToEditGuildDescription", "hasRightToEditGuildMessage", "hasRightToEditRanks", "hasRightToCreateRanks", "hasRightToBuyBonus", "havenWorldPageWarning", "localPlayer", "ranks", "quests", "level", "nextLevel", "nextLevelCost", "availableBonuses", "loadingBonuses", "temporaryBonuses", "permanentBonuses", "simultaneousBonusesText", "conquestPoints", "currentWeekGuildPoints", "guildMembersThreshold", "mustRename"};
    private boolean jsY = true;
    final ArrayList<bvj> jsZ = new ArrayList();
    final ArrayList<bve> jta = new ArrayList();
    private Comparator<bvj> jtb = bvw.jtp;
    private boolean jtc;
    private int jtd;
    private final ArrayList<bue_0> jte = new ArrayList();

    public static bvk dJZ() {
        return jsj;
    }

    public void bkZ() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        this.iod = ((bjo_1)bgt_02.dpI()).drl();
        this.dKa();
        this.dKc();
        this.ha(false);
        this.jtb = bvw.jtp;
        this.jtc = true;
        this.jtd = 0;
        this.jte.clear();
        for (VI vI : VI.values()) {
            if (vI.d() > 14) break;
            this.jte.add(bue_0.a(bgt_02.aWP(), bgt_02.aWO(), vI.d()));
        }
        this.hb(false);
        fse_1.gFu().a((aef_2)this, jsX);
    }

    private void dKa() {
        this.iod.J((TObjectProcedure<ezv_1>)((TObjectProcedure)ezv_12 -> {
            this.c((ezv_1)ezv_12);
            return true;
        }));
    }

    void c(ezv_1 ezv_12) {
        if (!buQ.b(ezq.prB.Pe(ezv_12.tJ()))) {
            return;
        }
        buT buT2 = bvf.jrC.FD(ezv_12.tJ());
        if (buT2 == null) {
            return;
        }
        buT2.dJK();
    }

    public void dKb() {
        bvi bvi2 = this.kI(this.iod.drj()).dJT();
        fse_1.gFu().f("selectedGuildRank", bvi2);
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("guildManagementDialog");
        if (fhs_22 == null) {
            return;
        }
        fdu_1 fdu_12 = (fdu_1)fhs_22.uH("guildName");
        fdu_12.setText(((bve)bvi2).getName());
    }

    public void dKc() {
        this.iod.a(this.jsk);
    }

    public bue_0 bP(byte by) {
        for (bue_0 bue_02 : this.jte) {
            if (bue_02.dJk() != by) continue;
            return bue_02;
        }
        return null;
    }

    public ArrayList<bve> dKd() {
        return this.jta;
    }

    public bve kI(long l) {
        for (bve bve2 : this.jta) {
            if (bve2.Sn() != l) continue;
            return bve2;
        }
        return null;
    }

    public ezz_1 jP(long l) {
        return this.iod.jP(l);
    }

    public boolean bgF() {
        return this.iod != null;
    }

    public ezu_1 drl() {
        return this.iod;
    }

    public void dKe() {
        String string = aum_0.cWf().c("guild.newRank", new Object[0]);
        long l = eyh_2.aN(new ArrayList<eyh_2>());
        cwR cwR2 = new cwR(string, l);
        int n = this.iod.fPV();
        if (n >= 15) {
            return;
        }
        fab fab2 = this.iod.jR(this.iod.dKs());
        if (fab2 == null) {
            return;
        }
        if (string.length() > 16) {
            return;
        }
        ezz_1 ezz_12 = this.iod.jP(aue_0.cVJ().cVK().Sn());
        if (!this.iod.jR(ezz_12.Xm()).b(eyh_2.rKH, fab2.bfE())) {
            return;
        }
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(cwR2);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }

    public void kJ(long l) {
        this.dKb();
        cws_0 cws_02 = new cws_0(l);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(cws_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }

    public void j(long l, short s) {
        cww_0 cww_02 = new cww_0(l, s);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(cww_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }

    public void a(bve bve2) {
        cwu_0 cwu_02 = new cwu_0(bve2.Sn(), bve2.dJQ(), bve2.getName());
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(cwu_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }

    public void mt(String string) {
        cwO cwO2 = new cwO(string);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(cwO2);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }

    public void mu(String string) {
        cwQ cwQ2 = new cwQ(string);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(cwQ2);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }

    public void mv(String string) {
        cwx_0 cwx_02 = new cwx_0(string);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(cwx_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }

    public void bQ(byte by) {
        cwz_0 cwz_02 = new cwz_0(by);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(cwz_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }

    public int aVo() {
        return this.jsZ.size();
    }

    public void dKf() {
        if (this.iod == null || this.iod.getMessage() == null || this.iod.getMessage().isEmpty()) {
            return;
        }
        api_0 api_02 = new api_0(aPl.exw.czD(), this.iod.getMessage());
        api_02.m(aPl.exw);
        if (!aPb.cyU()) {
            aPb.c(api_02);
        } else {
            aPh.czg().d(api_02);
        }
    }

    public void FE(int n) {
        fby_0 fby_02 = fbo_0.eD((short)n);
        fbk_0 fbk_02 = fbo_0.d(fby_02);
        String string = aum_0.cWf().a(126, (long)fbk_02.aIi(), new Object[0]);
        String string2 = aum_0.cWf().c("notification.havenWorldBuildingAddedText", string);
        cwy_2.nUc.y(string2, 8);
        aPd.f("guild.chatBuildingAdded", string);
    }

    public void FF(int n) {
        fby_0 fby_02 = fbo_0.eD((short)n);
        fbk_0 fbk_02 = fbo_0.d(fby_02);
        String string = aum_0.cWf().a(126, (long)fbk_02.aIi(), new Object[0]);
        String string2 = aum_0.cWf().c("notification.havenWorldBuildingRemovedText", string);
        cwy_2.nUc.y(string2, 8);
        aPd.f("guild.chatBuildingRemoved", string);
    }

    public void dC(int n, int n2) {
        fby_0 fby_02 = fbo_0.eD((short)n2);
        fbk_0 fbk_02 = fbo_0.d(fby_02);
        if (fbk_02.aIi() != n2) {
            this.FE(fbk_02.aIi());
            return;
        }
        String string = aum_0.cWf().a(126, (long)n, new Object[0]);
        String string2 = aum_0.cWf().a(126, (long)n2, new Object[0]);
        String string3 = aum_0.cWf().c("notification.havenWorldBuildingEvolvedText", string, string2);
        cwy_2.nUc.y(string3, 8);
        aPd.f("guild.chatBuildingEvolved", string, string2);
    }

    public void FG(int n) {
        if (this.jtd == n) {
            this.jtc = !this.jtc;
        } else {
            this.jtc = true;
            this.jtd = n;
        }
        Comparator<bvj> comparator = null;
        switch (this.jtd) {
            case 0: {
                if (this.jtc) {
                    comparator = bvw.jtp;
                    break;
                }
                comparator = bvw.jtq;
                break;
            }
            case 1: {
                if (this.jtc) {
                    comparator = bvv.jtn;
                    break;
                }
                comparator = bvv.jto;
                break;
            }
            case 2: {
                if (this.jtc) {
                    comparator = bvu.jtl;
                    break;
                }
                comparator = bvu.jtm;
                break;
            }
            case 3: {
                if (this.jtc) {
                    comparator = bvu.jtl;
                    break;
                }
                comparator = bvu.jtm;
                break;
            }
            case 5: {
                comparator = this.jtc ? bvx.jtr : bvx.jts;
            }
        }
        this.jtb = comparator;
        this.hc(true);
    }

    @Override
    public String[] bxk() {
        return jsX;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(jsl)) {
            if (this.iod == null) {
                return null;
            }
            return this.iod.getName();
        }
        if (string.equals(jsm)) {
            if (this.iod == null) {
                return null;
            }
            ezb ezb2 = new ezb(this.iod.Yc());
            if (ezb2 == null) {
                return null;
            }
            buJ buJ2 = new buJ(ezb2.fmd(), ezb2.fmf(), buH.dJn().Fz(ezb2.fmg()), buH.dJn().Fz(ezb2.fme()));
            awk_1 awk_12 = buK.dJw().a(buJ2);
            buJ2.bmX();
            return awk_12;
        }
        if (string.equals(jsn)) {
            if (this.iod == null) {
                return 0;
            }
            return this.gZ(false).size() + " / " + this.iod.fPU();
        }
        if (string.equals(jso)) {
            if (this.iod == null) {
                return 0;
            }
            long l = 0L;
            for (bvj bvj2 : this.jsZ) {
                l += (long)bvj2.cmL();
            }
            return Math.round((float)l / (float)this.iod.fPU());
        }
        if (string.equals(jsq)) {
            return this.iod.Yh();
        }
        if (string.equals(jss)) {
            return 0;
        }
        if (string.equals(jsr)) {
            return this.iod.Yj();
        }
        if (string.equals(jsG)) {
            ArrayList<bvj> arrayList = new ArrayList<bvj>();
            arrayList.add(this.dKn());
            return arrayList;
        }
        if (string.equals(jst)) {
            return this.gZ(this.jsY);
        }
        if (string.equals(jsv)) {
            return this.a(eyh_2.rKE);
        }
        if (string.equals(jsu)) {
            return this.jsY;
        }
        if (string.equals(jsB)) {
            return this.a(eyh_2.rKH);
        }
        if (string.equals(jsC)) {
            return this.a(eyh_2.rKH, this.iod.jR(this.dKs()).bfE());
        }
        if (string.equals(jsz)) {
            return this.a(eyh_2.rKJ);
        }
        if (string.equals(jsA)) {
            return this.a(eyh_2.rKK);
        }
        if (string.equals(jsD)) {
            return this.dKg() && this.a(eyh_2.rKN);
        }
        if (string.equals(jsE)) {
            if (this.iod == null) {
                return null;
            }
            return fse_1.gFu().vY("havenWorld") != null;
        }
        if (string.equals(jsF)) {
            boolean bl;
            if (this.iod == null) {
                return null;
            }
            Object object = fse_1.gFu().vY("havenWorld");
            int n = ewo_0.oBF.i(ewr_0.oEF);
            boolean bl2 = bl = this.iod.cmL() < n;
            if (bl || object == null) {
                return aum_0.cWf().c("guild.havenWorldPageWarning", n);
            }
            return null;
        }
        if (string.equals(jsx)) {
            if (this.iod == null) {
                return null;
            }
            return this.iod.getDescription();
        }
        if (string.equals(jsy)) {
            if (this.iod == null) {
                return null;
            }
            return this.iod.getMessage();
        }
        if (string.equals(jsH)) {
            this.jta.sort(new bvn(this));
            return this.jta;
        }
        if (string.equals(jsw)) {
            return this.dKm();
        }
        if (string.equals(jsI)) {
            return this.jte;
        }
        if (string.equals(jsJ)) {
            return this.dKt();
        }
        if (string.equals(jsK)) {
            return this.dKj();
        }
        if (string.equals(jsL)) {
            if (this.iod.cmL() == 10) {
                return null;
            }
            return this.dKj() + 1;
        }
        if (string.equals(jsM)) {
            if (this.iod.cmL() == 10) {
                return null;
            }
            return ezu.prJ.Ph(this.dKj() + 1);
        }
        if (string.equals(jsN)) {
            if (this.iod.cmL() == 10) {
                return null;
            }
            ezn ezn2 = ezr.Pf(this.dKj() + 1);
            eyr_2 eyr_22 = ezn2.fmw();
            return uc_0.k(eyr_22.fQp());
        }
        if (string.equals(jsO)) {
            if (this.iod.cmL() == 10) {
                return false;
            }
            int n = ezu.prJ.Ph(this.dKj() + 1);
            if (n > this.iod.Yh()) {
                return false;
            }
            ezn ezn3 = ezr.Pf(this.dKj() + 1);
            eyr_2 eyr_23 = ezn3.fmw();
            ezv_1 ezv_12 = this.iod.Tu(eyr_23.d());
            return ezv_12 == null || !buQ.a(ezv_12, eyr_23, this.iod);
        }
        if (string.equals(jsP)) {
            return this.dKh();
        }
        if (string.equals(jsQ)) {
            return this.dKi();
        }
        if (string.equals(jsS)) {
            return this.gY(false);
        }
        if (string.equals(jsT)) {
            if (this.dKg()) {
                return null;
            }
            int n = this.iod.fPX().fQG();
            return aum_0.cWf().c("guildBonus.maxSimultaneous", n);
        }
        if (string.equals(jsU)) {
            int n = ue_0.bjV().get(3);
            int n2 = this.iod.Yp() != n ? 0 : this.iod.fPY();
            return n2 + "/" + this.iod.Yl();
        }
        if (string.equals(jsR)) {
            ArrayList<String> arrayList = new ArrayList<String>();
            ArrayList<enk_0> arrayList2 = new ArrayList<enk_0>();
            for (buT buT2 : this.gY(true)) {
                eyv_2 eyv_22 = buT2.dJB();
                if (eyv_22.fQt() == eyu_2.rLG) {
                    eyy_1 eyy_12 = (eyy_1)eyv_22;
                    int n = eyy_12.aZH();
                    enk_0 enk_02 = bat_2.cZD().RN(n);
                    if (biR.i(enk_02)) {
                        arrayList2.add(enk_02);
                        continue;
                    }
                }
                arrayList.add(buT2.dJA());
            }
            biR biR2 = new biR(aum_0.cWf(), arrayList2, 0, true);
            arrayList.addAll(biR2.dqX());
            return arrayList;
        }
        if (string.equals(jsV)) {
            return 200 + this.iod.fQf();
        }
        if (string.equals(jsW)) {
            return ezo_1.rML.matcher(this.iod.getName()).find();
        }
        return null;
    }

    private boolean dKg() {
        int n = this.iod.fPX().fQG();
        return this.dKi().size() < n;
    }

    public ArrayList<buS> dKh() {
        TIntObjectHashMap tIntObjectHashMap = new TIntObjectHashMap();
        for (ezn ezn2 : ezn.values()) {
            buT buT2;
            if (ezr.a(ezn2)) continue;
            eyr_2 eyr_22 = ezn2.fmw();
            int n = eyr_22.d();
            ezv_1 ezv_12 = this.iod.Tu(n);
            int n2 = ezu.prJ.Pj(n);
            if (!tIntObjectHashMap.containsKey(n2)) {
                tIntObjectHashMap.put(n2, new ArrayList());
            }
            ArrayList arrayList = (ArrayList)tIntObjectHashMap.get(n2);
            if (ezv_12 != null || (buT2 = bvf.jrC.FD(n)) == null) continue;
            arrayList.add(buT2);
        }
        ArrayList arrayList = new ArrayList(tIntObjectHashMap.size());
        buS buS2 = null;
        TIntObjectIterator tIntObjectIterator = tIntObjectHashMap.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            buS2 = new buS(tIntObjectIterator.key(), (ArrayList)tIntObjectIterator.value());
            arrayList.add(buS2);
        }
        arrayList.sort(new bvo(this));
        return arrayList;
    }

    public ArrayList<buT> dKi() {
        ArrayList<buT> arrayList = new ArrayList<buT>();
        this.iod.J(new bvp(this, arrayList));
        return arrayList;
    }

    public ArrayList<buT> gY(boolean bl) {
        ArrayList<buT> arrayList = new ArrayList<buT>();
        for (ezn ezn2 : ezn.values()) {
            buT buT2;
            eyr_2 eyr_22;
            ezv_1 ezv_12;
            if (ezr.a(ezn2) || (ezv_12 = this.iod.Tu((eyr_22 = ezn2.fmw()).d())) == null || !eyr_22.Ty() ^ bl || buQ.a(ezv_12, eyr_22, this.iod) || (buT2 = bvf.jrC.FD(eyr_22.d())) == null) continue;
            arrayList.add(buT2);
        }
        return arrayList;
    }

    public ArrayList<bvj> gZ(boolean bl) {
        ArrayList<bvj> arrayList = new ArrayList<bvj>();
        for (bvj bvj2 : this.jsZ) {
            if (!bl && !bvj2.bSr()) continue;
            arrayList.add(bvj2);
        }
        return arrayList;
    }

    public short dKj() {
        return this.iod.cmL();
    }

    public boolean a(eyh_2 eyh_22) {
        return this.a(eyh_22, (short)-1);
    }

    public boolean a(eyh_2 eyh_22, short s) {
        if (this.iod == null) {
            return false;
        }
        long l = this.dKk();
        if (l == -1L) {
            return false;
        }
        fab fab2 = this.iod.jR(l);
        if (fab2 == null) {
            return false;
        }
        return fab2.b(eyh_22, s);
    }

    public long dKk() {
        bvj bvj2 = this.dKn();
        if (bvj2 == null) {
            return -1L;
        }
        return bvj2.Xm();
    }

    public fab dKl() {
        if (this.iod == null) {
            return null;
        }
        return this.iod.jR(this.dKk());
    }

    public boolean dKm() {
        if (this.iod == null) {
            return false;
        }
        bvj bvj2 = this.dKn();
        if (bvj2 == null) {
            return false;
        }
        return this.iod.drj() == bvj2.Xm();
    }

    public bvj dKn() {
        return this.kK(aue_0.cVJ().cVK().Sn());
    }

    public bvj kK(long l) {
        for (bvj bvj2 : this.jsZ) {
            if (bvj2.Sn() != l) continue;
            return bvj2;
        }
        return null;
    }

    public List<bvj> dKo() {
        return this.jsZ;
    }

    public void ha(boolean bl) {
        this.jta.clear();
        this.iod.g(new bvq(this));
        this.hc(bl);
        this.dKp();
        if (bl) {
            fse_1.gFu().a((aef_2)this, jsH, jsz, jsA, jsB, jsC, jsD);
        }
    }

    private void dKp() {
        this.jta.sort(new bvr(this));
    }

    void a(ezz_1 ezz_12) {
        for (bvj bvj2 : this.jsZ) {
            if (bvj2.Sn() != ezz_12.Sn()) continue;
            fse_1.gFu().a((aef_2)bvj2, bvj.jsi);
        }
        fse_1.gFu().a((aef_2)this, jsz, jsA, jsB, jsC, jsD);
    }

    private void a(fab fab2) {
        for (bve bve2 : this.jta) {
            if (bve2.Sn() != fab2.Sn()) continue;
            fse_1.gFu().a((aef_2)bve2, bve.jrz);
        }
    }

    public void hb(boolean bl) {
        this.jsZ.clear();
        this.iod.I(new bvs(this));
        this.hc(bl);
        if (bl) {
            fse_1.gFu().a((aef_2)this, jsn, jso, jsn, jst, jsG, jsB, jsC, jsz, jsA, jsD);
        }
    }

    private void hc(boolean bl) {
        this.jsZ.sort(this.jtb);
        if (bl) {
            fse_1.gFu().a((aef_2)this, jsw, jsv, jso, jsG, jst);
        }
    }

    public boolean dKq() {
        return this.jsY;
    }

    public void hd(boolean bl) {
        if (this.jsY == bl) {
            return;
        }
        this.jsY = bl;
        this.hb(true);
    }

    public void u(long l, long l2) {
        cwP cwP2 = new cwP(l, l2);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(cwP2);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }

    public void kL(long l) {
        cwy_0 cwy_02 = new cwy_0(l);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(cwy_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }

    public boolean ai(@Nullable bhJ bhJ2) {
        boolean bl = this.iod != null && this.a(eyh_2.rKE) && !this.iod.isFull();
        return bl && (bhJ2 == null || bhJ2.Ya() <= 0L);
    }

    public void mw(String string) {
        if (aPd.a(string, ejn_0.qzk)) {
            return;
        }
        aPd.f("guild.inviting.character", string);
        cwN cwN2 = new cwN(string);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(cwN2);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }

    public void dKr() {
        cwt_0 cwt_02 = new cwt_0();
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(cwt_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }

    public long drj() {
        if (this.iod == null) {
            return -1L;
        }
        return this.iod.drj();
    }

    public long dKs() {
        if (this.iod == null) {
            return -1L;
        }
        return this.iod.dKs();
    }

    private ArrayList<bci_1> dKt() {
        ArrayList<bci_1> arrayList = new ArrayList<bci_1>();
        ezl.ppq.c(new bvt(this, arrayList));
        return arrayList;
    }

    public void clean() {
        if (this.iod != null) {
            this.iod.b(this.jsk);
        }
        this.iod = null;
        this.jsZ.clear();
        this.jta.clear();
        this.jte.clear();
    }
}

