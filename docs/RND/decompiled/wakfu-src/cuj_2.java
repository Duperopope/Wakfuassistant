/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cUj
 */
public class cuj_2
implements adi_1 {
    private static final cuj_2 nLB = new cuj_2();
    private static final Set<String> nLC = Set.of("encyclopediaLinkedAchievementsDialog", "encyclopediaLinkedExchangeMachineDialog", "encyclopediaLinkedItemsDialog", "encyclopediaLinkedChallengesDialog", "encyclopediaLinkedWorldLootsDialog");
    private static final alx_2 nLD = string -> {
        if (string.equals("encyclopediaDialog")) {
            aue_0.cVJ().b(nLB);
        } else if (nLC.contains(string)) {
            cuj_2.nLB.nLI.remove(string);
        }
    };
    private static final ewp_0 nLE = (ewr_02, object) -> {
        if (ewr_02 == ewr_0.oGl && !cuj_2.eRF()) {
            cuj_2.eRE();
            aue_0.cVJ().b(nLB);
        }
    };
    @Nullable
    private Runnable nLF;
    private bpw_0 nLG;
    private bqn_1 nLH;
    private final Map<String, Integer> nLI = new HashMap<String, Integer>();

    public static cuj_2 eRB() {
        return nLB;
    }

    private cuj_2() {
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 16212: {
                if (this.nLH.dzY()) {
                    if (!this.nLH.dzZ()) {
                        this.nLH.a(this.nLG.dCW(), false);
                    }
                    this.nLH.dEd();
                }
                return false;
            }
            case 17021: {
                if (this.nLH.dzZ()) {
                    this.nLH.dEe();
                }
                return false;
            }
            case 19747: {
                bpr_1 bpr_12 = (bpr_1)((Object)((dae_0)aam_22).bCv());
                this.A(() -> this.nLG.b(bpr_12));
                return false;
            }
            case 17037: {
                bpq_1 bpq_12 = (bpq_1)((Object)((dae_0)aam_22).bCv());
                this.A(() -> {
                    this.nLG.dCV().a(bpq_12);
                    this.eRD();
                });
                return false;
            }
            case 16192: {
                buh_0 buh_02 = (buh_0)((Object)((dae_0)aam_22).bCv());
                this.nLG.dCV().f(buh_02);
                return false;
            }
            case 18017: {
                bps_0 bps_02 = (bps_0)((Object)((dae_0)aam_22).bCv());
                this.A(() -> this.nLG.dCV().b(bps_02));
                return false;
            }
            case 18925: {
                bug_0 bug_02 = (bug_0)((dae_0)aam_22).bCv();
                this.A(() -> {
                    this.nLG.dCV().a(bug_02);
                    this.eRD();
                });
                return false;
            }
            case 17323: {
                this.A(() -> {
                    this.nLG.dCV().gO(true);
                    this.eRD();
                });
                return false;
            }
            case 18222: {
                daz_0 daz_02 = (daz_0)aam_22;
                this.a(daz_02.dDr(), daz_02.faw());
                return false;
            }
            case 18551: {
                dba_0 dba_02 = (dba_0)aam_22;
                this.A(() -> this.a(dba_02.fax(), dba_02.fay(), dba_02.faz()));
                return false;
            }
        }
        return true;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        if (this.nLG == null) {
            this.eRC();
        }
        fse_1.gFu().f("encyclopedia", this.nLG);
        fse_1.gFu().f("encyclopediaHistory", this.nLH);
        fyw_0.gqw().d("wakfu.encyclopedia", cey_2.class);
        fyw_0.gqw().a(nLD);
        aie_0.cfn().bmE().a(bpo_1.iUY, false);
        ccj_2.g("encyclopediaDialog", 32768L);
        this.nLI.clear();
        cAY.eHc().nP(600012L);
        ewo_0.oBF.a(nLE);
        if (this.nLF != null) {
            this.nLF.run();
            this.nLF = null;
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        fse_1.gFu().f("encyclopedia", (Object)null);
        fse_1.gFu().f("encyclopediaHistory", (Object)null);
        fyw_0.gqw().tc("wakfu.encyclopedia");
        fyw_0.gqw().b(nLD);
        aie_0.cfn().bmE().a(bpo_1.iUY);
        fyw_0.gqw().tl("encyclopediaDialog");
        nLC.forEach(fyw_0.gqw()::tl);
        ewo_0.oBF.b(nLE);
        cAY.eHc().nP(600013L);
    }

    public void eRC() {
        this.nLG = new bpw_0();
        this.nLG.bkZ();
        this.nLH = new bqn_1();
    }

    public void A(Runnable runnable) {
        this.nLH.a(this.nLG.dCW(), true);
        runnable.run();
    }

    public void b(@NotNull bqp_1 bqp_12) {
        this.nLG.a(bqp_12);
    }

    private void eRD() {
        if (this.nLG.dCV().dCY() == bpr_1.iVl) {
            fse_1.gFu().f("encyclopediaOpenMonster", (Object)null);
        }
    }

    private void a(bpr_0 bpr_02, bpe_1 bpe_12) {
        bgv_2 bgv_22 = bpe_12.duo();
        int n = bgv_22.d();
        switch (bpr_02) {
            case iYb: {
                this.a(bpr_1.iVl, new bqb_0(n), "nameFilter", "monsterSearchType");
                break;
            }
            case iYc: {
                this.a("encyclopediaLinkedWorldLootsDialog", n, "encyclopediaLinkedWorldLoots", bqa_1::new);
                break;
            }
            case iYd: {
                dae_0 dae_02 = new dae_0(19505);
                dae_02.sY(n);
                aaw_1.bUq().h(dae_02);
                break;
            }
            case iYe: {
                this.a("encyclopediaLinkedExchangeMachineDialog", n, "encyclopediaLinkedExchangeMachines", bqt_1::new);
                break;
            }
            case iYf: {
                this.a("encyclopediaLinkedAchievementsDialog", n, "encyclopediaLinkedAchievements", bqq_1::new);
                break;
            }
            case iYg: {
                this.a("encyclopediaLinkedChallengesDialog", n, "encyclopediaLinkedChallenges", bqr_1::new);
                break;
            }
            case iYh: {
                cte_2.eQC().MK(n);
                break;
            }
            case iYi: {
                break;
            }
            case iYj: {
                this.a("encyclopediaLinkedItemsDialog", n, "encyclopediaLinkedItems", bqz_2::new);
                break;
            }
            case iYk: {
                String string;
                if (n == 27083) {
                    string = aum_0.cWf().c("encyclopedia.item.acquisition.recycling.shards", new Object[0]);
                } else {
                    if (n != 27093) break;
                    string = aum_0.cWf().c("encyclopedia.item.acquisition.recycling.powder", new Object[0]);
                }
                byj_1.epo().a(byc_1.b(byh_1.lAG, string));
            }
        }
    }

    private void a(String string, int n, String string2, Function<Integer, aef_2> function) {
        if (this.nLI.getOrDefault(string, -1) == n) {
            fyw_0.gqw().tl(string);
            fse_1.gFu().f(string2, (Object)null);
        } else {
            fse_1.gFu().f(string2, function.apply(n));
            if (this.nLI.containsKey(string)) {
                ((fey_2)fyw_0.gqw().th(string)).gvm();
            } else {
                fey_2 fey_22 = (fey_2)ccj_2.g(string, 32768L);
                fhm_1.bH(fey_22);
            }
            this.nLI.put(string, n);
        }
    }

    private void a(@NotNull bpr_1 bpr_12, @NotNull bug_0<bpb_1> bug_02, String ... stringArray) {
        this.nLG.b(bpr_12);
        if (bpr_12 == bpr_1.iVl) {
            fse_1.gFu().f("encyclopediaOpenMonster", (Object)null);
        }
        bpx_0 bpx_02 = this.nLG.dCV();
        bpx_02.c(bug_02);
        fse_1.gFu().a((aef_2)bpx_02, stringArray);
    }

    public void a(@NotNull bek_0 bek_02) {
        bgv_2 bgv_22 = bek_02.duo();
        int n = bgv_22.d();
        this.B(() -> this.a(bpm_1.k(bgv_22), new bpn_0(n, bgv_2.Dm(n)), "nameFilter"));
    }

    public void f(@NotNull bpg_1 bpg_12) {
        this.B(() -> {
            this.a(bpr_1.iVl, new bqa_0(bpg_12.dDw().cqy()), "nameFilter", "monsterSearchType");
            fse_1.gFu().f("encyclopediaOpenMonster", bpg_12);
        });
    }

    public void a(@NotNull bpr_1 bpr_12, @NotNull bug_0<bpb_1> bug_02) {
        String[] stringArray = switch (bpr_12) {
            default -> throw new MatchException(null, null);
            case bpr_1.iVl -> bpz_0.iWv;
            case bpr_1.iVm -> bpy_0.iWl;
            case bpr_1.iVn -> bpa_1.iWA;
        };
        this.B(() -> this.a(bpr_12, bug_02, stringArray));
    }

    private void B(Runnable runnable) {
        if (!cuj_2.eRF()) {
            cuj_2.eRE();
            return;
        }
        if (cuj_2.eQx()) {
            this.A(runnable);
        } else {
            this.nLF = runnable;
            aue_0.cVJ().a(this);
        }
    }

    public static boolean eQx() {
        return aue_0.cVJ().c(nLB);
    }

    public boolean MV(int n) {
        if (!cuj_2.eQx()) {
            return false;
        }
        bpx_0 bpx_02 = this.nLG.dCV();
        if (!bpx_02.dCY().dCO()) {
            return false;
        }
        return bpx_02.b(buh_0.jot).filter(bug_02 -> bug_02 instanceof bpn_0).map(bug_02 -> (bpn_0)bug_02).map(bpn_0::dDF).map(n2 -> n2 == n).orElse(false);
    }

    public boolean MW(int n) {
        if (!cuj_2.eQx()) {
            return false;
        }
        if (this.nLG.dCV().dCY() != bpr_1.iVl) {
            return false;
        }
        bpg_1 bpg_12 = (bpg_1)fse_1.gFu().vY("encyclopediaOpenMonster");
        return bpg_12 != null && bpg_12.dDw().aWP() == n;
    }

    public boolean MX(int n) {
        if (!cuj_2.eQx()) {
            return false;
        }
        bpx_0 bpx_02 = this.nLG.dCV();
        if (!bpx_02.dCY().dCO()) {
            return false;
        }
        return bpx_02.b(buh_0.jot).filter(bug_02 -> bug_02 instanceof bpW).map(bug_02 -> (bpW)bug_02).map(bpW::dDR).map(n2 -> n2 == n).orElse(false);
    }

    public static void eRE() {
        String string = aum_0.cWf().c("encyclopedia.disabled", new Object[0]);
        byj_1.epo().a(byc_1.c(byh_1.lAG, string));
    }

    public static boolean eRF() {
        return ewo_0.oBF.k(ewr_0.oGl);
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

