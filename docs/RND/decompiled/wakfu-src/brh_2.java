/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.HashSet;
import java.util.Optional;

/*
 * Renamed from bRH
 */
public final class brh_2
implements aeh_2,
brg_2 {
    public static final String lbx = "nationId";
    public static final String lby = "hasVoted";
    public static final String lbz = "isCandidate";
    public static final String lbA = "candidateInfo";
    public static final String lbB = "nationRankDescription";
    public static final String lbC = "nativeNationCitizenScore";
    public static final String lbD = "currentNationCitizenScore";
    public static final String lbE = "isPassportActive";
    public static final String lbF = "passportStampIconUrl";
    public static final String lbG = "nationColor";
    public static final String lbH = "nationName";
    public static final String lbI = "canApplyForGovernorConcerningCrimes";
    public static final String lbJ = "canVoteConcerningCrimes";
    public static final String lbK = "candidateRegistrationWarningInfo";
    public static final String lbL = "pvpStateStyle";
    public static final String lbM = "pvpStatePercent";
    public static final String lbN = "pvpStateTitle";
    public static final String lbO = "pvpStateDescription";
    public static final String lbP = "pvpMoney";
    private final bri_2 lbQ;
    private brd_2 lbR;
    private final TIntObjectHashMap<brf_2> lbS = new TIntObjectHashMap();

    public brh_2(bri_2 bri_22) {
        this.lbQ = bri_22;
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    public Object eu(String string) {
        if (this.lbQ == null) {
            return null;
        }
        if (string.equals(lby)) {
            return this.lbQ.elm();
        }
        if (string.equals(lbx)) {
            return this.lbQ.Xt();
        }
        if (string.equals(lbz)) {
            return this.lbQ.els();
        }
        if (string.equals(lbA)) {
            return this.lbR;
        }
        if (string.equals(lbC)) {
            int n = this.lbQ.Xt();
            brf_2 brf_22 = Optional.ofNullable((brf_2)this.lbS.get(n)).orElse(new brf_2(n));
            brf_22.Jm(this.lbQ.WA(n));
            return brf_22;
        }
        if (string.equals(lbD)) {
            fjm fjm2 = this.lbQ.elp();
            if (!(fjm2 instanceof exP)) {
                return null;
            }
            int n = ((exP)fjm2).ffM();
            if (n <= 0) {
                n = this.as((bhJ)fjm2);
            }
            brf_2 brf_23 = Optional.ofNullable((brf_2)this.lbS.get(n)).orElse(new brf_2(n));
            brf_23.Jm(this.lbQ.WA(n));
            return brf_23;
        }
        if (string.equals(lbB)) {
            ahv_2 ahv_22 = new ahv_2();
            ahv_22.ceC().ih(this.getColor().bQk());
            fkL fkL2 = this.lbQ.emF();
            ahv_22.c(fkL2 != null ? aum_0.cWf().a(57, (long)((int)fkL2.Sn()), new Object[0]) : aum_0.cWf().c("nation.citizen.noRank", new Object[0]));
            if (!this.lbQ.gba().isEmpty()) {
                for (fkK fkK2 : this.lbQ.gba()) {
                    ahv_22.ceH();
                    ahv_22.c(aum_0.cWf().c(fkK2.name(), new Object[0]));
                }
            }
            ahv_22.ceD();
            return ahv_22.ceL();
        }
        if (string.equals(lbG)) {
            return this.getColor();
        }
        if (string.equals(lbE)) {
            return this.lbQ.gaY();
        }
        if (string.equals(lbF)) {
            return auc_0.cVq().a("passportStampIconsPath", "defaultIconPath", this.lbQ.Xt());
        }
        if (string.equals(lbH)) {
            return aum_0.cWf().a(39, (long)this.lbQ.Xt(), new Object[0]);
        }
        if (string.equals(lbI)) {
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            return bgt_02.a(evv_1.oxb) && !this.lbQ.els() && bre_2.elb().a(this.lbQ);
        }
        if (string.equals(lbJ)) {
            bgt_0 bgt_03 = aue_0.cVJ().cVK();
            return bgt_03.a(evv_1.oxb) && bre_2.elb().b(this.lbQ);
        }
        if (string.equals(lbK)) {
            ahv_2 ahv_23 = new ahv_2();
            bgt_0 bgt_04 = aue_0.cVJ().cVK();
            if (bgt_04.a(evv_1.oxb)) {
                boolean bl = true;
                if (!bre_2.elb().a(this.lbQ)) {
                    ahv_23.c(aum_0.cWf().c("nation.rank.unauthorized.for.registration", new Object[0]));
                    bl = false;
                }
                if (bgt_04.dmi() < brx_1.elI().emh()) {
                    if (!bl) {
                        ahv_23.ceH();
                    }
                    ahv_23.c(aum_0.cWf().c("nation.not.enough.kamas.for.registration", this.lbQ.ems().emh()));
                    bl = false;
                }
                if (bgt_04.ffF().els()) {
                    if (!bl) {
                        ahv_23.ceH();
                    }
                    ahv_23.c(aum_0.cWf().c("nation.vote.candidateRegistration.alreadyCandidate", new Object[0]));
                }
            } else {
                ahv_23.c(aum_0.cWf().c("error.playerNotSubscribed", new Object[0]));
            }
            return ahv_23.ceL();
        }
        if (string.equals(lbL)) {
            bgt_0 bgt_05 = aue_0.cVJ().cVK();
            bzq_2 bzq_22 = bzp_2.eqt().mA(bgt_05.aqZ());
            int n = bzq_22 != null && bzq_22.eqw() ? 3 : 0;
            return "pvpState" + n;
        }
        if (string.equals(lbN)) {
            bgt_0 bgt_06 = aue_0.cVJ().cVK();
            bzq_2 bzq_23 = bzp_2.eqt().mA(bgt_06.aqZ());
            return aum_0.cWf().c("pvp.stateTitle." + (bzq_23 != null && bzq_23.eqw()), new Object[0]);
        }
        if (string.equals(lbO)) {
            bgt_0 bgt_07 = aue_0.cVJ().cVK();
            bzq_2 bzq_24 = bzp_2.eqt().mA(bgt_07.aqZ());
            return aum_0.cWf().c("pvp.stateDescription." + (bzq_24 != null && bzq_24.eqw()), new Object[0]);
        }
        if (string.equals(lbM)) {
            bgt_0 bgt_08 = aue_0.cVJ().cVK();
            bzq_2 bzq_25 = bzp_2.eqt().mA(bgt_08.aqZ());
            return Float.valueOf(bzq_25 != null && bzq_25.eqw() ? 1.0f : 0.0f);
        }
        if (lbP.equals(string)) {
            return this.lbQ.gbc();
        }
        return null;
    }

    private axb_2 getColor() {
        return aid_0.dVg;
    }

    @Override
    public void elh() {
        this.lbR = brx_1.elI().mq(this.lbQ.gaS());
        fse_1.gFu().a((aef_2)this, lbA, lby, lbz, lbJ, lbI);
    }

    @Override
    public void elj() {
        fse_1.gFu().a((aef_2)this, lbM, lbO);
    }

    @Override
    public void elk() {
        this.djo();
        fse_1.gFu().a((aef_2)this, lbM, lbO, lbL);
    }

    @Override
    public void djo() {
        bhJ bhJ2 = (bhJ)this.lbQ.elp();
        bhJ2.djo();
    }

    private void n(int n, int n2, boolean bl) {
        int n3 = n;
        bhJ bhJ2 = (bhJ)this.lbQ.elp();
        if (n3 != bhJ2.ffM() && (n3 = this.as(bhJ2)) <= 0) {
            return;
        }
        int n4 = this.lbQ.WA(n3);
        fkd_0 fkd_02 = fkf_0.gcc().WJ(n4);
        brf_2 brf_22 = (brf_2)this.lbS.get(n3);
        if (brf_22 == null) {
            brf_22 = new brf_2(n3);
            this.lbS.put(n3, (Object)brf_22);
        }
        brf_22.Jm(n4);
        fse_1.gFu().a((aef_2)this, lbC, lbD);
        if (bhJ2.bvY() && !fcK.rUe.as(bhJ2.Xi(), bhJ2.Sn())) {
            this.a(n3, fkd_02, n2, n4, bhJ2);
        }
        if (bl) {
            this.djo();
        }
    }

    private int as(bhJ bhJ2) {
        for (int n : fjt.syH.gbS()) {
            fjo_0 fjo_02 = fjt.syH.WG(n);
            if ((long)fjo_02.gbp() != bhJ2.aqZ()) continue;
            return fjo_02.Xt();
        }
        return 0;
    }

    private void a(int n, fkd_0 fkd_02, int n2, int n3, bhJ bhJ2) {
        boolean bl;
        int n4 = n3 - n2;
        if (n4 == 0) {
            return;
        }
        fkd_0 fkd_03 = fkf_0.gcc().WJ(n2);
        boolean bl2 = bl = fkd_03 != fkd_02;
        if (bl && !fkd_03.b(fkj_0.sAM) && fkd_02.b(fkj_0.sAM)) {
            String string = aum_0.cWf().a(39, (long)n, new Object[0]);
            String string2 = aum_0.cWf().c(fkd_02.clY(), new Object[0]);
            String string3 = aum_0.cWf().c("nation.playerCriminal", string, string2);
            aPh.czg().jb(string3);
            String string4 = aum_0.cWf().c("notification.outlawTitle", new Object[0]);
            String string5 = cfh_2.createLink(aum_0.cWf().c("notification.outlawText", aum_0.cWf().a(39, (long)n, new Object[0])), biu_1.kiy, String.valueOf(n));
            dcd dcd2 = new dcd(string4, string5, biu_1.kiy);
            aaw_1.bUq().h(dcd2);
        }
        if (bhJ2.bXs) {
            brh_2.d(bhJ2, n4);
        }
    }

    private static void d(bhJ bhJ2, int n) {
        String string = auc_0.cVq().a("lawFlyingImagePath", "defaultIconPath", n > 0 ? "1" : "2");
        awk_1 awk_12 = awm_1.bPn().b((art_1)aru_2.cVG.bIv(), (long)arn_2.fX(string), string, false);
        bdj_2 bdj_22 = bhJ2.ddI();
        xp_0 xp_02 = new xp_0();
        xo_0 xo_02 = new xo_0(awk_12, 48, 48, (xu_0)xp_02, 3000);
        xo_02.a(bdj_22);
        HashSet<xa_0> hashSet = xd_0.bnv().b(bdj_22);
        xy_0 xy_02 = new xy_0(0, 20);
        awh_2 awh_22 = fyw_0.gqw().gqB().uG("fontDefault10BoldBordered").getFont();
        xv_0 xv_02 = new xv_0(awh_22, (n > 0 ? "+" : "") + n, xy_02, 3000);
        xv_02.c(1.0f, 1.0f, 1.0f, 1.0f);
        xv_02.a(bdj_22);
        int n2 = 0;
        if (hashSet != null) {
            n2 = hashSet.size() * 600;
            xo_02.qC(n2);
            xv_02.qC(n2);
        }
        xd_0.bnv().a(xo_02);
        xd_0.bnv().a(xv_02);
        cAY.eHc().a(n > 0 ? 600139L : 600140L, false, n2);
    }

    @Override
    public void g(fjo_0 fjo_02) {
        if (this.lbQ.elp() == aue_0.cVJ().cVK()) {
            bkt_2.a(this.lbQ.elp(), true);
        }
        this.lbS.put(fjo_02.Xt(), (Object)new brf_2(fjo_02.Xt()));
        this.n(fjo_02.Xt(), this.lbQ.WA(fjo_02.Xt()), false);
    }

    @Override
    public void elg() {
        fse_1.gFu().a((aef_2)this, lby);
    }

    @Override
    public void Jn(int n) {
        this.n(this.lbQ.gde(), n, false);
    }

    @Override
    public void dW(int n, int n2) {
        this.n(n, n2, true);
    }

    @Override
    public void eli() {
        fse_1.gFu().a((aef_2)this, lbE);
    }
}

