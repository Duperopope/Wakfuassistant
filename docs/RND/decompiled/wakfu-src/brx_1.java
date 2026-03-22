/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntByteIterator
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.iterator.TShortObjectIterator
 *  gnu.trove.map.hash.TIntByteHashMap
 *  gnu.trove.map.hash.TIntIntHashMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  gnu.trove.set.hash.TLongHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntByteIterator;
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.iterator.TShortObjectIterator;
import gnu.trove.map.hash.TIntByteHashMap;
import gnu.trove.map.hash.TIntIntHashMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.map.hash.TShortObjectHashMap;
import gnu.trove.set.hash.TLongHashSet;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from bRX
 */
public class brx_1
implements aeh_2 {
    private static final brx_1 ldG = new brx_1();
    private static final Logger ldH = Logger.getLogger(brx_1.class);
    public static final String ldI = "name";
    public static final String ldJ = "candidates";
    public static final String ldK = "government";
    public static final String ldL = "governor";
    public static final String ldM = "marshal";
    public static final String ldN = "general";
    public static final String ldO = "governorHistory";
    public static final String ldP = "isVoteRunning";
    public static final String ldQ = "candidateRegistrationFee";
    public static final String ldR = "nationColor";
    public static final String ldS = "flagIconUrl";
    public static final String ldT = "electionClosureDescription";
    public static final String ldU = "electionTotalVotes";
    public static final String ldV = "electionTotalCandidates";
    public static final String ldW = "governorIsLocalPlayer";
    public static final String ldX = "canEditGovernorSpeech";
    public static final String ldY = "canEditMarshalSpeech";
    public static final String ldZ = "canEditGeneralSpeech";
    public static final String lea = "governorTitles";
    public static final String leb = "timeBeforeMandateEnd";
    public static final String lec = "timeBeforeMandateEndPerc";
    public static final String led = "mandateStartDate";
    public static final String lee = "mandateEndDate";
    public static final String lef = "localPlayerHasRankToChangeTaxes";
    public static final String leg = "localPlayerHasRankToBuyChallenges";
    public static final String leh = "localPlayerHasRankToBuyClimateBonuses";
    public static final String lei = "localPlayerHasRankToBuyZoology";
    public static final String lej = "localPlayerHasRankToChangeLaws";
    public static final String lek = "localPlayerHasRankToChangeDiplomacy";
    public static final String lel = "protectorList";
    public static final String lem = "protectorTotalWillsSize";
    public static final String len = "protectorSatisfiedWillsSize";
    public static final String leo = "economy";
    public static final String lep = "laws";
    public static final String leq = "otherNationsLaws";
    public static final String ler = "nationDiplomacyList";
    public static final String les = "sortedNationTerritoriesList";
    public static final String let = "currentGovernorOpinionId";
    public static final String leu = "currentGovernorOpinionText";
    public static final String lev = "currentGovernorOpinionValue";
    public static final String lew = "opinionBadConsequency";
    public static final String lex = "opinionGoodConsequency";
    public static final String ley = "currentGovernorPopularityScoreText";
    public static final String lez = "opinionDirty";
    public static final String leA = "cantGiveOpinionReason";
    public static final String[] leB = new String[]{"name", "candidates", "government", "governor", "marshal", "general", "governorHistory", "isVoteRunning", "candidateRegistrationFee", "nationColor", "flagIconUrl", "electionClosureDescription", "electionTotalVotes", "electionTotalCandidates", "governorIsLocalPlayer", "canEditGovernorSpeech", "canEditMarshalSpeech", "canEditGeneralSpeech", "governorTitles", "timeBeforeMandateEnd", "timeBeforeMandateEndPerc", "mandateStartDate", "mandateEndDate", "localPlayerHasRankToChangeTaxes", "localPlayerHasRankToBuyChallenges", "localPlayerHasRankToBuyClimateBonuses", "localPlayerHasRankToBuyZoology", "localPlayerHasRankToChangeLaws", "localPlayerHasRankToChangeDiplomacy", "protectorList", "protectorTotalWillsSize", "protectorSatisfiedWillsSize", "economy", "laws", "nationDiplomacyList", "sortedNationTerritoriesList", "otherNationsLaws", "currentGovernorOpinionId", "currentGovernorOpinionText", "currentGovernorOpinionValue", "opinionDirty", "cantGiveOpinionReason"};
    public static final String leC = "fca33a";
    private fjo_0 laU;
    private final fnk_0 leD = new fnk_0();
    private final TIntObjectHashMap<ArrayList<brd_2>> leE = new TIntObjectHashMap();
    private brr_2 leF;
    private brn_2 leG;
    private brn_2 leH;
    private brd_2 leI;
    private final TShortObjectHashMap<brq_2> leJ = new TShortObjectHashMap();
    private ArrayList<brq_2> leK;
    private final TLongObjectHashMap<bsp_2> leL = new TLongObjectHashMap();
    private ArrayList<bsp_2> leM;
    private String leN;
    ArrayList<bst_2> leO;
    bsm_2 leP;
    bsn_2 leQ;
    private ArrayList<brv_1> leR;
    private ArrayList<bsr_2> leS;
    private final TIntObjectHashMap<String> leT = new TIntObjectHashMap();
    private final TIntIntHashMap leU = new TIntIntHashMap();
    private ArrayList<bsn_2> leV;
    private byte leW;
    final fko_0 leX = new bry_1(this);
    final fko_0 leY = new bse_2(this);
    final fko_0 leZ = new bsf_2(this);
    final fko_0 lfa = new bsg_2(this);
    final fko_0 lfb = new bsh_2(this);
    final fko_0 lfc = new bsi_2(this);
    final fko_0 lfd = new bsj_2(this);
    private TIntByteHashMap lfe;
    private TIntByteHashMap lff;
    final fko_0 lfg = new bsk_2(this);
    final fko_0 lfh = new bsl_2(this);

    public static brx_1 elI() {
        return ldG;
    }

    private brx_1() {
        for (fkL enum_ : fkL.values()) {
            if (enum_ == fkL.sCr || enum_ == fkL.sCy || enum_ == fkL.sCz) continue;
            this.leL.put(enum_.Sn(), (Object)new bsp_2(enum_));
        }
        for (Enum enum_ : brp_2.values()) {
            this.leJ.put(((brp_2)enum_).aIi(), (Object)new brq_2((brp_2)enum_));
        }
        this.leJ.put((short)-1, (Object)new brq_2(null));
    }

    void elJ() {
        dcd dcd2;
        String string;
        String string2;
        String string3;
        int n;
        String string4;
        String string5;
        fkc_0 fkc_02;
        TIntByteIterator tIntByteIterator;
        TIntByteHashMap tIntByteHashMap;
        boolean bl;
        if (this.laU == null || this.laU == fjo_0.sys) {
            return;
        }
        this.emr();
        boolean bl2 = false;
        boolean bl3 = this.elO();
        int n2 = fse_1.gFu().dq("nationCurrentPageIndex");
        boolean bl4 = n2 == 3;
        boolean bl5 = bl = fyw_0.gqw().to("nationDialog") && bl4;
        if (bl3 && !bl4) {
            tIntByteHashMap = this.iA(bl3);
            tIntByteIterator = tIntByteHashMap.iterator();
            while (tIntByteIterator.hasNext()) {
                tIntByteIterator.advance();
                bl2 = true;
                fkc_02 = fkc_0.gT(tIntByteIterator.value());
                string5 = null;
                string4 = null;
                switch (fkc_02) {
                    case sAp: {
                        string5 = "nation.suggestAllianceChat";
                        string4 = "notification.diplomacySuggestAllianceText";
                    }
                }
                if (string5 != null) {
                    n = fjt.syH.WG(tIntByteIterator.key()).Xt();
                    string3 = aum_0.cWf().a(39, (long)n, new Object[0]);
                    string2 = aum_0.cWf().c(string5, string3);
                    aPh.czg().jb(string2);
                }
                if (string4 == null) continue;
                n = fjt.syH.WG(tIntByteIterator.key()).Xt();
                string3 = aum_0.cWf().a(39, (long)n, new Object[0]);
                string2 = aum_0.cWf().c("notification.diplomacyTitle", new Object[0]);
                string = cfh_2.createLink(aum_0.cWf().c(string4, string3), biu_1.kiz, "3");
                dcd2 = new dcd(string2, string, biu_1.kiz, 600132);
                aaw_1.bUq().h(dcd2);
            }
        }
        tIntByteHashMap = this.iA(false);
        if (this.lfe != null) {
            tIntByteIterator = tIntByteHashMap.iterator();
            while (tIntByteIterator.hasNext()) {
                tIntByteIterator.advance();
                if (tIntByteIterator.value() == this.lfe.get(tIntByteIterator.key())) continue;
                bl2 = true;
                fkc_02 = fkc_0.gT(tIntByteIterator.value());
                string5 = null;
                string4 = null;
                switch (fkc_02) {
                    case sAp: {
                        string5 = "nation.allianceChat";
                        string4 = "notification.diplomacyAllianceText";
                        break;
                    }
                    case sAo: {
                        string5 = "nation.declareWarChat";
                        string4 = "notification.diplomacyWarText";
                    }
                }
                if (string5 != null) {
                    n = fjt.syH.WG(tIntByteIterator.key()).Xt();
                    string3 = aum_0.cWf().a(39, (long)n, new Object[0]);
                    string2 = aum_0.cWf().c(string5, string3);
                    aPh.czg().jb(string2);
                }
                if (string4 == null) break;
                n = fjt.syH.WG(tIntByteIterator.key()).Xt();
                string3 = aum_0.cWf().a(39, (long)n, new Object[0]);
                string2 = aum_0.cWf().c("notification.diplomacyTitle", new Object[0]);
                string = cfh_2.createLink(aum_0.cWf().c(string4, string3), biu_1.kiz, "3");
                dcd2 = new dcd(string2, string, biu_1.kiz, 600132);
                aaw_1.bUq().h(dcd2);
                break;
            }
        }
        this.lfe = tIntByteHashMap;
        fse_1.gFu().a((aef_2)this, ler, les);
        if (!bl && bl2) {
            cty_1.ePV().ePZ();
        }
        cwo_2.eWo().kK(true);
    }

    private TIntByteHashMap iA(boolean bl) {
        TIntByteHashMap tIntByteHashMap = new TIntByteHashMap();
        for (brv_1 brv_12 : this.elP()) {
            if (brv_12.emE()) continue;
            int n = brv_12.Xt();
            if (bl) {
                if (!brv_12.elG()) continue;
                tIntByteHashMap.put(n, fkc_0.sAp.aJr());
                continue;
            }
            tIntByteHashMap.put(n, brv_12.elH().aJr());
        }
        return tIntByteHashMap;
    }

    public void h(fjo_0 fjo_02) {
        fjo_0 fjo_03;
        TIntObjectIterator<fjo_0> tIntObjectIterator;
        if (this.laU != null) {
            this.laU.a(fkq_0.sBw).b(this.leX);
            this.laU.a(fkq_0.sBx).b(this.leY);
            this.laU.a(fkq_0.sBA).b(this.leZ);
            this.laU.a(fkq_0.sBC).b(this.lfa);
            this.laU.a(fkq_0.sBv).b(this.lfb);
            this.laU.a(fkq_0.sBD).b(this.lfd);
            tIntObjectIterator = fjt.syH.eCu();
            while (tIntObjectIterator.hasNext()) {
                tIntObjectIterator.advance();
                fjo_03 = (fjo_0)tIntObjectIterator.value();
                fjo_03.a(fkq_0.sBy).b(this.lfg);
                fjo_03.a(fkq_0.sBy).b(this.lfh);
                fjo_03.a(fkq_0.sBv).b(this.lfc);
            }
        }
        this.laU = fjo_02;
        fse_1.gFu().f("nation", this);
        this.laU.a(fkq_0.sBw).a(this.leX);
        this.laU.a(fkq_0.sBx).a(this.leY);
        this.laU.a(fkq_0.sBA).a(this.leZ);
        this.laU.a(fkq_0.sBC).a(this.lfa);
        this.laU.a(fkq_0.sBv).a(this.lfb);
        this.laU.a(fkq_0.sBD).a(this.lfd);
        tIntObjectIterator = fjt.syH.eCu();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            fjo_03 = (fjo_0)tIntObjectIterator.value();
            fjo_03.a(fkq_0.sBy).a(this.lfh);
            fjo_03.a(fkq_0.sBv).a(this.lfc);
        }
        this.dhh();
    }

    public String getName() {
        if (this.laU != null) {
            return aum_0.cWf().a(39, (long)this.laU.Xt(), new Object[0]);
        }
        return null;
    }

    public bsp_2 mp(long l) {
        return (bsp_2)this.leL.get(l);
    }

    @Override
    public String[] bxk() {
        return leB;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(ldI)) {
            return this.getName();
        }
        if (string.equals(ldJ)) {
            int n = cyk_2.eYu().eYx();
            if (this.leE.isEmpty() || !this.leE.containsKey(n)) {
                return null;
            }
            return this.leE.get(n);
        }
        if (string.equals(ldP)) {
            return this.laU.gbx();
        }
        if (string.equals(ldQ)) {
            return this.emh();
        }
        if (string.equals(ldK)) {
            if (this.leM == null) {
                this.leM = new ArrayList();
                TLongObjectIterator tLongObjectIterator = this.leL.iterator();
                while (tLongObjectIterator.hasNext()) {
                    tLongObjectIterator.advance();
                    this.leM.add((bsp_2)tLongObjectIterator.value());
                }
                this.leM.sort(new brz_2(this));
            }
            return this.leM;
        }
        if (string.equals(ldO)) {
            return this.leI;
        }
        if (string.equals(ldL)) {
            return this.elL();
        }
        if (string.equals(ldM)) {
            return this.elM();
        }
        if (string.equals(ldN)) {
            return this.elN();
        }
        if (string.equals(ldS)) {
            int n = this.laU.Xt();
            return auc_0.cVq().zG(n == 0 ? -1 : n);
        }
        if (string.equals(ldT)) {
            return aum_0.cWf().c("election.closureDescription", leC, this.emg());
        }
        if (string.equals(ldV)) {
            int n = this.laU.gbx() ? this.laU.ekU() : this.laU.gbA().ekU();
            return aum_0.cWf().c("election.totalCandidates", leC, n);
        }
        if (string.equals(ldU)) {
            int n = this.laU.gbx() ? this.laU.ekZ() : this.laU.gbA().ekZ();
            return aum_0.cWf().c("election.totalVotes", leC, n);
        }
        if (string.equals(ldW)) {
            if (this.leF == null) {
                return false;
            }
            return this.leF.ela().Sn() == aue_0.cVJ().cVK().Sn();
        }
        if (string.equals(ldX)) {
            if (brx_1.elK()) {
                return true;
            }
            if (this.leF == null) {
                return false;
            }
            return this.leF.ela().Sn() == aue_0.cVJ().cVK().Sn();
        }
        if (string.equals(ldY)) {
            if (brx_1.elK()) {
                return true;
            }
            if (this.leH == null) {
                return false;
            }
            return this.leH.ela().Sn() == aue_0.cVJ().cVK().Sn();
        }
        if (string.equals(ldZ)) {
            if (brx_1.elK()) {
                return true;
            }
            if (this.leG == null) {
                return false;
            }
            return this.leG.ela().Sn() == aue_0.cVJ().cVK().Sn();
        }
        if (string.equals(lea)) {
            if (this.leK == null) {
                this.leK = new ArrayList();
                TShortObjectIterator tShortObjectIterator = this.leJ.iterator();
                while (tShortObjectIterator.hasNext()) {
                    tShortObjectIterator.advance();
                    this.leK.add((brq_2)tShortObjectIterator.value());
                }
                this.leK.sort(new bsa_2(this));
            }
            return this.leK;
        }
        if (string.equals(ldR)) {
            return this.getColor();
        }
        if (string.equals(led)) {
            uw_0 uw_02 = this.emf();
            return DateFormat.getDateTimeInstance(2, 2, aum_0.cWf().aUXX().aUJ()).format(uw_02.bjC());
        }
        if (string.equals(lee)) {
            uw_0 uw_03 = this.eme();
            return DateFormat.getDateTimeInstance(2, 2, aum_0.cWf().aUXX().aUJ()).format(uw_03.bjC());
        }
        if (string.equals(lec)) {
            return new ftc_1(this.emd() * 100.0f);
        }
        if (string.equals(lef)) {
            fkL fkL2 = aue_0.cVJ().cVK().ffF().emF();
            return fkL2 != null && fkM.i(fkL2);
        }
        if (string.equals(leh)) {
            fkL fkL3 = aue_0.cVJ().cVK().ffF().emF();
            return fkL3 != null && fkM.k(fkL3);
        }
        if (string.equals(lei)) {
            fkL fkL4 = aue_0.cVJ().cVK().ffF().emF();
            return fkL4 != null && fkM.h(fkL4);
        }
        if (string.equals(lej)) {
            return this.elR();
        }
        if (string.equals(leg)) {
            fkL fkL5 = aue_0.cVJ().cVK().ffF().emF();
            return fkL5 != null && fkM.g(fkL5);
        }
        if (string.equals(lek)) {
            return this.elO();
        }
        if (string.equals(lem)) {
            int n = 0;
            ArrayList<bst_2> arrayList = this.elU();
            for (bst_2 bst_22 : arrayList) {
                n += bst_22.emM();
            }
            return n;
        }
        if (string.equals(len)) {
            int n = 0;
            for (bst_2 bst_23 : this.elU()) {
                n += bst_23.emO();
            }
            return n;
        }
        if (string.equals(lel)) {
            return this.elU();
        }
        if (string.equals(leb)) {
            return Float.valueOf(this.emd());
        }
        if (string.equals(leq)) {
            if (this.leV == null) {
                this.leV = new ArrayList();
                TIntObjectIterator<fjo_0> tIntObjectIterator = fjt.syH.b(this.laU.Xt());
                while (tIntObjectIterator.hasNext()) {
                    tIntObjectIterator.advance();
                    fjo_0 fjo_02 = (fjo_0)tIntObjectIterator.value();
                    this.leV.add(new bsn_2(this, fjo_02));
                }
            }
            return this.leV;
        }
        if (string.equals(lep)) {
            return this.elS();
        }
        if (string.equals(leo)) {
            if (this.leP == null) {
                this.leP = new bsm_2(this.laU.gbC().gdR());
            }
            return this.leP;
        }
        if (string.equals(ler)) {
            return this.elP();
        }
        if (string.equals(les)) {
            return this.elQ();
        }
        if (string.equals(lew)) {
            DecimalFormat decimalFormat = new DecimalFormat("#0.##");
            String string2 = decimalFormat.format(-50.0) + "%";
            return aum_0.cWf().c("nation.opinionBadConsequency", string2);
        }
        if (string.equals(lex)) {
            DecimalFormat decimalFormat = new DecimalFormat("#0.##");
            String string3 = decimalFormat.format(50.0) + "%";
            return aum_0.cWf().c("nation.opinionGoodConsequency", string3);
        }
        if (string.equals(ley)) {
            fni_0 fni_02 = this.laU.gbE();
            DecimalFormat decimalFormat = new DecimalFormat("#0.##");
            ahv_2 ahv_22 = new ahv_2();
            ahv_22.ceu().c(aum_0.cWf().c("nation.opinionScore", new Object[0])).c(" : ");
            ahv_22.c(decimalFormat.format(fni_02.gdX() * 100.0f)).k('%');
            return ahv_22.ceL();
        }
        if (string.equals(leu)) {
            fni_0 fni_03 = this.laU.gbE();
            int n = fni_03.b(fng_0.sHY);
            int n2 = fni_03.b(fng_0.sHX);
            int n3 = fni_03.b(fng_0.sHW);
            DecimalFormat decimalFormat = new DecimalFormat("#0.##");
            ahv_2 ahv_23 = new ahv_2();
            ahv_23.ceu().c(aum_0.cWf().c("nation.opinionScore", new Object[0])).c(" : ");
            ahv_23.c(decimalFormat.format(fni_03.gdX() * 100.0f)).c("%");
            ahv_23.cev().ceH();
            ahv_23.ceC().ih(awx_2.dnL.bQk());
            ahv_23.c(aum_0.cWf().c("nation.opinionGood", new Object[0])).c(" : ");
            ahv_23.yx(n);
            ahv_23.ceD().ceH();
            ahv_23.ceC().ih(awx_2.dnY.bQk());
            ahv_23.c(aum_0.cWf().c("nation.opinionNeutral", new Object[0])).c(" : ");
            ahv_23.yx(n2);
            ahv_23.ceD().ceH();
            ahv_23.ceC().ih(awx_2.dnJ.bQk());
            ahv_23.c(aum_0.cWf().c("nation.opinionBad", new Object[0])).c(" : ");
            ahv_23.yx(n3);
            ahv_23.ceD();
            return ahv_23.ceL();
        }
        if (string.equals(lev)) {
            fni_0 fni_04 = this.laU.gbE();
            return new ftc_1((fni_04.gdW() > 0 ? fni_04.gdX() + 1.0f : 1.0f) / 2.0f * 100.0f);
        }
        if (string.equals(lez)) {
            return this.leW != aue_0.cVJ().cVK().ffF().gaZ().sHZ;
        }
        if (string.equals(leA)) {
            fni_0 fni_05 = this.laU.gbE();
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            if (!bgt_02.a(evv_1.oxk)) {
                return aum_0.cWf().c("error.playerNotSubscriptionRight", new Object[0]);
            }
            if (!evg_1.osP.a(new eve_2[]{bgt_02})) {
                return aum_0.cWf().c("error.playerNotSubscribed", new Object[0]);
            }
            int n = fni_05.l(bgt_02);
            if (n == 0) {
                return null;
            }
            switch (n) {
                case 2: {
                    return aum_0.cWf().c("opinionReason.didntVote", new Object[0]);
                }
                case 1: {
                    return aum_0.cWf().c("opinionReason.voteRunning", new Object[0]);
                }
                case 3: {
                    return aum_0.cWf().c("opinionReason.noGovernor", new Object[0]);
                }
            }
            return null;
        }
        if (string.equals(let)) {
            return this.leW;
        }
        return null;
    }

    private static boolean elK() {
        return evm_2.b(aue_0.cVJ().cVO().cWq(), evn_2.ovq);
    }

    private Object elL() {
        fkH fkH2;
        if (this.leF == null && (fkH2 = this.laU.gbB().gcw()) != null) {
            this.leF = new brr_2(fkH2);
        }
        return this.leF;
    }

    private Object elM() {
        fkH fkH2;
        if (this.leH == null && (fkH2 = this.laU.gbB().e(fkL.sCt)) != null) {
            this.leH = new brn_2(fkH2);
        }
        return this.leH;
    }

    private Object elN() {
        fkH fkH2;
        if (this.leG == null && (fkH2 = this.laU.gbB().e(fkL.sCu)) != null) {
            this.leG = new brn_2(fkH2);
        }
        return this.leG;
    }

    private boolean elO() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return false;
        }
        fkL fkL2 = bgt_02.ffF().emF();
        return fkL2 != null && fkM.m(fkL2);
    }

    public void g(int n, String string) {
        this.leT.put(n, (Object)string);
    }

    public String Jp(int n) {
        return (String)this.leT.get(n);
    }

    private ArrayList<brv_1> elP() {
        if (this.leR == null) {
            this.leR = new ArrayList();
            TIntObjectIterator<fjo_0> tIntObjectIterator = fjt.syH.b(new Integer[0]);
            while (tIntObjectIterator.hasNext()) {
                tIntObjectIterator.advance();
                int n = tIntObjectIterator.key();
                this.leR.add(new brv_1(n));
            }
        }
        return this.leR;
    }

    private ArrayList<bsr_2> elQ() {
        if (this.leS == null) {
            this.leS = new ArrayList();
            TIntObjectIterator<fjo_0> tIntObjectIterator = fjt.syH.eCu();
            while (tIntObjectIterator.hasNext()) {
                tIntObjectIterator.advance();
                int n = tIntObjectIterator.key();
                if (this.Jq(n) <= 0) continue;
                this.leS.add(new bsr_2(n));
            }
            this.leS.sort(new bsb_2(this));
            int n = 0;
            for (bsr_2 bsr_22 : this.leS) {
                bsr_22.Js(n += bsr_22.emI());
            }
            this.leS.sort(new bsc_2(this));
        }
        return this.leS;
    }

    boolean elR() {
        fkL fkL2 = aue_0.cVJ().cVK().ffF().emF();
        return fkL2 != null && fkM.l(fkL2);
    }

    private bsn_2 elS() {
        if (this.leQ == null) {
            this.leQ = new bsn_2(this, this.laU);
        }
        return this.leQ;
    }

    public int elT() {
        return this.leQ.elT();
    }

    private ArrayList<bst_2> elU() {
        if (this.leO == null) {
            this.leO = new ArrayList();
            TIntObjectIterator<fnd_0> tIntObjectIterator = this.laU.gbC().bgC();
            while (tIntObjectIterator.hasNext()) {
                tIntObjectIterator.advance();
                this.leO.add(new bst_2((fnd_0)tIntObjectIterator.value()));
            }
        }
        return this.leO;
    }

    public void elV() {
        fse_1.gFu().a((aef_2)this.leQ, "currentLawPoints");
    }

    public int elW() {
        int n = 0;
        TIntObjectIterator<fjo_0> tIntObjectIterator = fjt.syH.eCu();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            n += this.Jq(tIntObjectIterator.key());
        }
        return n;
    }

    public int Jq(int n) {
        return this.leU.get(n);
    }

    public void dY(int n, int n2) {
        this.leU.put(n, n2);
    }

    public void j(fjo_0 fjo_02) {
        fjo_02.a(fkq_0.sBv).a(this.lfc);
    }

    public void k(fjo_0 fjo_02) {
        fjo_02.a(fkq_0.sBv).b(this.lfc);
    }

    public void cO(byte by) {
        this.leW = by;
        fse_1.gFu().a((aef_2)this, let, lev, lez);
    }

    public byte elX() {
        return this.leW;
    }

    public void elY() {
        if (this.leH == null) {
            return;
        }
        fse_1.gFu().a((aef_2)this.leH, this.leH.bxk());
    }

    public void elZ() {
        if (this.leG == null) {
            return;
        }
        fse_1.gFu().a((aef_2)this.leG, this.leG.bxk());
    }

    public void a(brn_2 brn_22) {
        fse_1.gFu().a((aef_2)brn_22, brn_22.bxk());
    }

    public void clean() {
        this.ema();
        this.emq();
    }

    public void ema() {
        this.emr();
        this.emA();
        this.emn();
        this.emo();
        this.emp();
        this.emm();
        this.iB(false);
        this.nx(null);
    }

    public void iB(boolean bl) {
        if (bl) {
            TIntObjectIterator<fjo_0> tIntObjectIterator = fjt.syH.eCu();
            while (tIntObjectIterator.hasNext()) {
                tIntObjectIterator.advance();
                fjo_0 fjo_02 = (fjo_0)tIntObjectIterator.value();
                fjo_02.a(fkq_0.sBy).b(this.lfh);
                fjo_02.a(fkq_0.sBy).a(this.lfg);
            }
        } else {
            TIntObjectIterator<fjo_0> tIntObjectIterator = fjt.syH.eCu();
            while (tIntObjectIterator.hasNext()) {
                tIntObjectIterator.advance();
                fjo_0 fjo_03 = (fjo_0)tIntObjectIterator.value();
                fjo_03.a(fkq_0.sBy).b(this.lfg);
                fjo_03.a(fkq_0.sBy).a(this.lfh);
            }
        }
    }

    public void emb() {
        this.clean();
        this.elN();
        this.elL();
        this.elM();
        fse_1.gFu().a((aef_2)this, leB);
    }

    public void emc() {
        this.leO = null;
        fse_1.gFu().a((aef_2)this, lel);
    }

    private float emd() {
        ux_0 ux_02 = ue_0.bjV().bjc();
        uw_0 uw_02 = this.emf();
        uz_0 uz_02 = uw_02.l(ux_02);
        uz_0 uz_03 = new uz_0(this.laU.gby());
        uz_03.g(this.laU.eCS());
        return (float)uz_02.bjS() / (float)uz_03.bjS();
    }

    private uw_0 eme() {
        uw_0 uw_02 = new uw_0(this.laU.eCK());
        uw_02.a(this.laU.eCS());
        return uw_02;
    }

    private uw_0 emf() {
        uw_0 uw_02 = new uw_0(this.laU.eCK());
        uw_02.a(this.laU.eCS());
        uw_02.b(this.laU.gby());
        return uw_02;
    }

    private String emg() {
        uw_0 uw_02 = uw_0.fn(System.currentTimeMillis());
        ux_0 ux_02 = this.laU.eCK();
        uz_0 uz_02 = new uz_0(this.laU.eCS().bjS() - ux_02.l(uw_02).bjS());
        if (!uz_02.aYI()) {
            return "-";
        }
        return aum_0.cWf().c("remainingDuration", 0, 0, uz_02.bjR(), uz_02.bjE(), uz_02.bjF(), uz_02.bjH());
    }

    public long emh() {
        return this.laU.emh();
    }

    private axb_2 getColor() {
        return aid_0.dVg;
    }

    private void emi() {
        if (this.laU == null) {
            return;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return;
        }
        fkJ fkJ2 = this.laU.gbB();
        fkH fkH2 = fkJ2.uc(bgt_02.Sn());
        TLongObjectIterator tLongObjectIterator = this.leL.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            bsp_2 bsp_22 = (bsp_2)tLongObjectIterator.value();
            fkL fkL2 = bsp_22.emF();
            fkH fkH3 = fkJ2.e(fkL2);
            bsp_22.ny(fkH3 == null ? null : fkH3.getName());
        }
    }

    private void emj() {
        int n;
        if (this.laU == null) {
            return;
        }
        int n2 = n = this.laU.gbx() ? cyk_2.eYu().eYx() : 0;
        while (n != -1) {
            ArrayList arrayList = (ArrayList)this.leE.get(n);
            if (arrayList != null && !this.laU.gbx()) {
                n = this.Jr(n + 1);
                continue;
            }
            ArrayList<brd_2> arrayList2 = new ArrayList<brd_2>();
            ArrayList<fkw> arrayList3 = new ArrayList<fkw>();
            if (this.laU.gbx()) {
                this.laU.d(0, 3, arrayList3);
            } else if (arrayList2.isEmpty()) {
                this.laU.gbA().d(n * 3, 3, arrayList3);
            }
            if (arrayList3.isEmpty()) {
                n = -1;
                continue;
            }
            boolean bl = true;
            for (fkw fkw2 : arrayList3) {
                if (n == 0 && bl && !this.laU.gbx() && !fkw2.gcp()) {
                    arrayList2.add(new bro_2(fkw2));
                } else {
                    arrayList2.add(new brd_2(fkw2));
                }
                bl = false;
            }
            this.leE.put(n, arrayList2);
            n = this.laU.gbx() ? -1 : this.Jr(n + 1);
        }
    }

    private int Jr(int n) {
        for (int i = n; i < this.leE.size(); ++i) {
            ArrayList arrayList = (ArrayList)this.leE.get(i);
            if (arrayList == null) {
                return -1;
            }
            if (arrayList.size() >= 3) continue;
            return i;
        }
        return n;
    }

    public void emk() {
        TIntObjectIterator tIntObjectIterator = this.leE.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            ArrayList arrayList = (ArrayList)tIntObjectIterator.value();
            int n = arrayList.size();
            for (int i = 0; i < n; ++i) {
                ((brd_2)arrayList.get(i)).clear();
            }
        }
        this.leE.clear();
        this.laU.ekY();
    }

    public void eml() {
        this.leQ = null;
    }

    public void emm() {
        this.leV = null;
    }

    public void emn() {
        this.leF = null;
    }

    public void emo() {
        this.leH = null;
    }

    public void emp() {
        this.leG = null;
    }

    public void emq() {
        this.lfe = null;
    }

    public void emr() {
        this.leR = null;
        this.leS = null;
    }

    public void dhh() {
        this.emj();
        this.emi();
        this.emy();
        this.elZ();
        this.elY();
        this.elV();
        fse_1.gFu().a((aef_2)this, leB);
    }

    public brd_2 mq(long l) {
        TIntObjectIterator tIntObjectIterator = this.leE.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            for (brd_2 brd_22 : (ArrayList)tIntObjectIterator.value()) {
                if (brd_22.ela().Sn() != l) continue;
                return brd_22;
            }
        }
        return null;
    }

    public fjo_0 ems() {
        return this.laU;
    }

    public brq_2 cv(short s) {
        return (brq_2)this.leJ.get(s);
    }

    public void nx(String string) {
        this.leN = string;
    }

    public String emt() {
        return this.leN;
    }

    public brr_2 emu() {
        return this.leF;
    }

    public brn_2 emv() {
        return this.leH;
    }

    public brn_2 emw() {
        return this.leG;
    }

    public boolean emx() {
        uw_0 uw_02 = uw_0.fn(System.currentTimeMillis());
        uw_0 uw_03 = new uw_0(this.laU.eCK());
        return uw_02.g(uw_03);
    }

    public void emy() {
        if (this.leF == null) {
            return;
        }
        fse_1.gFu().a((aef_2)this.leF, this.leF.bxk());
    }

    public TLongHashSet emz() {
        TLongHashSet tLongHashSet = new TLongHashSet();
        if (this.leQ == null) {
            return tLongHashSet;
        }
        for (brs_2 brs_22 : this.leQ.lfD) {
            if (!brs_22.elE()) continue;
            tLongHashSet.add(brs_22.elD().Sn());
        }
        for (brs_2 brs_22 : this.leQ.lfE) {
            if (!brs_22.elE()) continue;
            tLongHashSet.add(brs_22.elD().Sn());
        }
        return tLongHashSet;
    }

    public void emA() {
        if (this.leQ == null) {
            return;
        }
        for (brs_2 brs_22 : this.leQ.lfD) {
            brs_22.clean();
        }
    }
}

