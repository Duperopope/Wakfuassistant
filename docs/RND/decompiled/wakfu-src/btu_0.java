/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from btU
 */
public class btu_0
implements aeh_2 {
    private static final Logger jnk = Logger.getLogger(btu_0.class);
    public static final String jnl = "isWinner";
    public static final String jnm = "localTeamPlayers";
    public static final String jnn = "localTeamMonsters";
    public static final String jno = "localTeamHasMonsters";
    public static final String jnp = "otherTeamPlayers";
    public static final String jnq = "otherTeamHasPlayers";
    public static final String jnr = "otherTeamMonsters";
    public static final String jns = "otherTeamHasMonsters";
    public static final String jnt = "challenges";
    public static final String jnu = "dungeonStasisIconUrl";
    public static final String jnv = "dungeonStasisLevel";
    public static final String jnw = "battlegroundInfo";
    public static final String jnx = "battlegroundLevelRange";
    public static final String jny = "compact";
    public static final String jnz = "onlyLocal";
    public static final String jnA = "isPvp";
    public static final String jnB = "isSavagePvp";
    public static final String jnC = "isPvm";
    public static final String jnD = "durationAndTurns";
    public static final String jnE = "initiatorId";
    public static final String jnF = "waveCount";
    public static final String jnG = "waveMonsterCount";
    public static final String jnH = "waveCountPopup";
    public static final String jnI = "waveMonsterCountPopup";
    public static final String jnJ = "realWaveCount";
    public static final String jnK = "realWaveMonsterCount";
    private final jh_1 jnL;
    private boolean jnh;
    private final List<btt_1> jnM = new ArrayList<btt_1>();
    private final List<btt_1> jnN = new ArrayList<btt_1>();
    private final List<btt_1> jnO = new ArrayList<btt_1>();
    private final List<btt_1> jnP = new ArrayList<btt_1>();
    private final Collection<bcv_1> jnQ;
    private final Map<Long, btt_1> jnR = new HashMap<Long, btt_1>();
    private final Map<Long, btt_1> jnS = new HashMap<Long, btt_1>();
    private final Map<Long, fpg_0> jnT = new HashMap<Long, fpg_0>();
    private final Map<Long, js_1> jnU = new HashMap<Long, js_1>();
    private boolean jnV;
    private boolean jnW;

    public btu_0(jh_1 jh_12) {
        this.jnL = jh_12;
        this.jnQ = bue.jop.dIM();
        this.jnV = ((bsg_1)aie_0.cfn().bmH()).a(bsn_1.lka);
        this.jnW = ((bsg_1)aie_0.cfn().bmH()).a(bsn_1.lkb);
        this.dIs();
    }

    private void dIs() {
        jl_1 jl_12;
        jl_1 jl_13 = this.jnL.TF();
        jl_1 jl_14 = this.jnL.TI();
        int n = this.jnL.TD();
        int n2 = jl_13.UB();
        jl_1 jl_15 = n2 == n ? jl_13 : jl_14;
        jl_1 jl_16 = jl_12 = n2 == n ? jl_14 : jl_13;
        this.jnh = btu_0.a(jl_15, jl_12) ? btu_0.h(jl_15) : !jl_15.UC().isEmpty();
        this.jnR.clear();
        this.jnS.clear();
        if (this.jnh) {
            this.a(this.jnM, jl_15, true);
            this.b(this.jnN, jl_15, true);
            jl_1 jl_17 = n == n2 ? jl_14 : jl_13;
            this.a(this.jnO, jl_17, false);
            this.b(this.jnP, jl_17, false);
        } else {
            jl_1 jl_18 = n == n2 ? jl_14 : jl_13;
            this.a(this.jnM, jl_18, false);
            this.b(this.jnN, jl_18, false);
            this.a(this.jnO, jl_15, true);
            this.b(this.jnP, jl_15, true);
        }
    }

    private static boolean a(jl_1 jl_12, jl_1 jl_13) {
        long l = aue_0.cVJ().cVO().xl();
        for (jd_1 jd_12 : jl_12.UC()) {
            if (jd_12.xl() != l) continue;
            return true;
        }
        for (jd_1 jd_12 : jl_13.UC()) {
            if (jd_12.xl() != l) continue;
            return true;
        }
        return false;
    }

    private static boolean h(jl_1 jl_12) {
        long l = aue_0.cVJ().cVO().xl();
        for (jd_1 jd_12 : jl_12.UC()) {
            if (jd_12.xl() != l) continue;
            return true;
        }
        return false;
    }

    private void a(List<btt_1> list, jl_1 jl_12, boolean bl) {
        list.clear();
        long l = aue_0.cVJ().cVO().xl();
        for (jd_1 generatedMessageV3 : jl_12.UC()) {
            if (this.jnV && generatedMessageV3.xl() != l) continue;
            btt_1 btt_12 = new btt_1(generatedMessageV3, bl);
            list.add(btt_12);
            this.jnR.put(btt_12.Sn(), btt_12);
            if (!generatedMessageV3.SW()) {
                this.jnS.put(btt_12.Xi(), btt_12);
            }
            if (this.jnT.containsKey(btt_12.Sn())) {
                btt_12.a(this.jnT.get(btt_12.Sn()));
            }
            if (generatedMessageV3.SW() || !this.jnU.containsKey(btt_12.Xi())) continue;
            btt_12.e(this.jnU.get(btt_12.Xi()));
        }
        for (iz_2 iz_22 : jl_12.UF()) {
            if (this.jnV && iz_22.Sp() != l || !bmo_2.iEv.bE((short)iz_22.xT())) continue;
            list.add(new btt_1(iz_22, bl));
        }
        list.sort(Comparator.naturalOrder());
    }

    private void b(List<btt_1> list, jl_1 jl_12, boolean bl) {
        list.clear();
        if (this.jnV) {
            return;
        }
        for (iz_2 iz_22 : jl_12.UF()) {
            if (bmo_2.iEv.bE((short)iz_22.xT())) continue;
            list.add(new btt_1(iz_22, bl));
        }
    }

    public void dIt() {
        this.jnV = !this.jnV;
        this.dIs();
        ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_1.lka, this.jnV);
        fse_1.gFu().a((aef_2)this, this.bxk());
    }

    public void dIu() {
        this.jnW = !this.jnW;
        ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_1.lkb, this.jnW);
        fse_1.gFu().a((aef_2)this, jnz);
    }

    public void a(long l, fpg_0 fpg_02) {
        btt_1 btt_12 = this.jnR.get(l);
        this.jnT.put(l, fpg_02);
        if (btt_12 == null) {
            jnk.error((Object)("Received pvp info for an unknown player of report : " + l));
            return;
        }
        btt_12.a(fpg_02);
        fse_1.gFu().a((aef_2)btt_12, btt_12.bxk());
    }

    public void f(js_1 js_12) {
        this.jnU.put(js_12.xl(), js_12);
        if (!this.jnS.containsKey(js_12.xl())) {
            return;
        }
        btt_1 btt_12 = this.jnS.get(js_12.xl());
        btt_12.e(js_12);
        fse_1.gFu().a((aef_2)btt_12, btt_12.bxk());
    }

    public long Tx() {
        return this.jnL.Tx();
    }

    @Override
    public String[] bxk() {
        return new String[]{jnl, jnm, jno, jnn, jnq, jnp, jns, jnr, jnt, jnu, jnv, jny, jnz};
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (jnl.equals(string)) {
            return this.jnh;
        }
        if (jnm.equals(string)) {
            return this.jnM;
        }
        if (jnn.equals(string)) {
            return this.jnN;
        }
        if (jno.equals(string)) {
            return this.jnN.size() > 0;
        }
        if (jnp.equals(string)) {
            return this.jnO;
        }
        if (jnq.equals(string)) {
            return this.jnO.size() > 0;
        }
        if (jnr.equals(string)) {
            return this.jnP;
        }
        if (jns.equals(string)) {
            return this.jnP.size() > 0;
        }
        if (jnt.equals(string)) {
            return this.jnQ;
        }
        if (jnu.equals(string)) {
            if (!this.jnL.IT()) {
                return null;
            }
            return bof.EK(this.jnL.IU());
        }
        if (jnv.equals(string)) {
            return this.jnL.IT() ? Integer.valueOf(this.jnL.IU()) : null;
        }
        if (jnw.equals(string)) {
            bzq_2 bzq_22 = bzp_2.eqt().mA(this.jnL.TX());
            if (bzq_22 == null || !bzq_22.eqw()) {
                return null;
            }
            fpv fpv2 = cux_0.mjE.eDD();
            if (fpv2 == null) {
                return null;
            }
            return new bfh_0(fpv2.dfF());
        }
        if (jnx.equals(string)) {
            bzq_2 bzq_23 = bzp_2.eqt().mA(this.jnL.TX());
            if (bzq_23 == null || !bzq_23.eqw()) {
                return null;
            }
            fpv fpv3 = cux_0.mjE.eDD();
            if (fpv3 == null) {
                return null;
            }
            fpz_0 fpz_02 = fpv3.ggH();
            return aum_0.cWf().c("stasis.dungeon.level.range", fpz_02.ggS(), fpz_02.ggT());
        }
        if (jny.equals(string)) {
            return this.jnV;
        }
        if (jnz.equals(string)) {
            return this.jnW;
        }
        if (jnC.equals(string)) {
            eUw eUw2 = eUw.Sy(this.jnL.TN());
            if (eUw2 == null) {
                return true;
            }
            return !eUw2.fLg().fLf();
        }
        if (jnA.equals(string)) {
            eUw eUw3 = eUw.Sy(this.jnL.TN());
            if (eUw3 == null) {
                return true;
            }
            return eUw3.fLg().fLf() && eUw3 != eUw.rva;
        }
        if (jnB.equals(string)) {
            eUw eUw4 = eUw.Sy(this.jnL.TN());
            if (eUw4 == null) {
                return true;
            }
            return eUw4 == eUw.rva;
        }
        if (jnD.equals(string)) {
            return aum_0.cWf().c("fight.duration.turnCount", this.jnL.TB(), this.jnL.Tz() / 1000L / 60L, this.jnL.Tz() / 1000L % 60L);
        }
        if (jnE.equals(string)) {
            return this.jnL.TK() ? this.jnL.TL() : 0L;
        }
        if (jnF.equals(string)) {
            return this.jnL.TO() ? Integer.valueOf(this.jnL.TP()) : null;
        }
        if (jnG.equals(string)) {
            return this.jnL.TQ() ? Integer.valueOf(this.jnL.TR()) : null;
        }
        if (jnJ.equals(string)) {
            return this.jnL.TS() ? aum_0.cWf().c("infinite.waves.result.real.count", this.jnL.TT()) : null;
        }
        if (jnK.equals(string)) {
            return this.jnL.TU() ? aum_0.cWf().c("infinite.waves.result.real.monster.count", this.jnL.TV()) : null;
        }
        if (jnH.equals(string)) {
            return this.jnL.TO() ? aum_0.cWf().c("infinite.waves.result.count", this.jnL.TP()) : null;
        }
        if (jnI.equals(string)) {
            return this.jnL.TQ() ? aum_0.cWf().c("infinite.waves.result.monster.count", this.jnL.TR()) : null;
        }
        return null;
    }
}

