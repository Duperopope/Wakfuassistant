/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Unmodifiable
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from bpm
 */
public class bpm_1 {
    private static final Logger iUI = Logger.getLogger(bpm_1.class);
    private static final bpm_1 iUJ = new bpm_1();
    private final List<Integer> iUK = new ArrayList<Integer>();
    private final Map<Integer, List<Integer>> iUL = new HashMap<Integer, List<Integer>>();
    private final Map<Integer, Set<Integer>> iUM = new HashMap<Integer, Set<Integer>>();
    private final Map<Integer, Set<Short>> iUN = new HashMap<Integer, Set<Short>>();
    private final Map<Integer, Set<Short>> iUO = new HashMap<Integer, Set<Short>>();
    private final Map<Integer, Set<Integer>> iUP = new HashMap<Integer, Set<Integer>>();
    private final Map<Integer, Set<Integer>> iUQ = new HashMap<Integer, Set<Integer>>();
    private final Map<Integer, Boolean> iUR = new HashMap<Integer, Boolean>();
    private final Map<Short, bpg_1> iUS = new HashMap<Short, bpg_1>();
    private final Set<Integer> iUT = new HashSet<Integer>();
    private final Map<bps_0, TreeSet<bpg_1>> iUU = new EnumMap<bps_0, TreeSet<bpg_1>>(bps_0.class);
    private final Map<bps_0, TreeSet<bpe_1>> iUV = new EnumMap<bps_0, TreeSet<bpe_1>>(bps_0.class);
    private final Map<bps_0, TreeSet<bpe_1>> iUW = new EnumMap<bps_0, TreeSet<bpe_1>>(bps_0.class);

    public static bpm_1 dCG() {
        return iUJ;
    }

    private bpm_1() {
    }

    public void reset() {
        this.iUK.clear();
        this.iUL.clear();
        this.iUM.clear();
        this.iUN.clear();
        this.iUO.clear();
        this.iUP.clear();
        this.iUR.clear();
        this.iUS.clear();
        this.iUT.clear();
        this.iUU.clear();
        this.iUV.clear();
        this.iUW.clear();
        for (bps_0 bps_02 : bps_0.iVy) {
            if (bps_02.a(bpr_1.iVl)) {
                this.iUU.put(bps_02, new TreeSet<bpg_1>(bpc_1.c(bps_02)));
            }
            if (bps_02.a(bpr_1.iVm)) {
                this.iUV.put(bps_02, new TreeSet<bpe_1>(bpc_1.d(bps_02)));
            }
            if (!bps_02.a(bpr_1.iVn)) continue;
            this.iUW.put(bps_02, new TreeSet<bpe_1>(bpc_1.d(bps_02)));
        }
    }

    public void dCH() {
        aqb_1.bGD().a(new aNQ(), (T aNQ2) -> {
            int n2 = aNQ2.ctt();
            if (fpk.sNF.Yn(n2) == null) {
                return;
            }
            if (aNQ2.ctz().length > 0) {
                this.iUK.add(n2);
            }
            for (anr_0 anr_02 : aNQ2.ctz()) {
                this.iUL.computeIfAbsent(anr_02.aHp(), n -> new ArrayList()).add(n2);
            }
        });
    }

    public void dCI() {
        eId.quO.D((TObjectProcedure<eIb>)((TObjectProcedure)eIb2 -> {
            this.c(eIb2.d(), ((bns_0)eIb2).cna());
            return true;
        }));
        bwz_0.jAA.i((bxa_0 bxa_02) -> bwz_0.jAA.Ga(bxa_02.d()).ifPresent(n -> this.c((int)n, bxa_02.cna())));
    }

    private void c(int n2, int[] nArray) {
        for (int n3 : nArray) {
            if (!bpm_1.ET(n3)) continue;
            this.iUM.computeIfAbsent(n3, n -> new HashSet()).add(n2);
        }
    }

    public void s(Collection<bjz_1> collection) {
        for (bjz_1 bjz_12 : collection) {
            if (!bpm_1.c(bjz_12)) continue;
            bpg_1 bpg_12 = new bpg_1(bjz_12);
            this.iUU.values().forEach(treeSet -> treeSet.add(bpg_12));
            bpg_12.g(n2 -> this.iUN.computeIfAbsent((Integer)n2, n -> new HashSet()).add(bjz_12.aWP()));
            bpg_12.h(n2 -> this.iUO.computeIfAbsent((Integer)n2, n -> new HashSet()).add(bjz_12.aWP()));
            this.iUS.put(bjz_12.aWP(), bpg_12);
        }
    }

    private static boolean ET(int n) {
        bjz_1 bjz_12 = bja_1.drJ().bC((short)n);
        if (bjz_12 == null) {
            return false;
        }
        return bpm_1.c(bjz_12);
    }

    private static boolean c(@NotNull bjz_1 bjz_12) {
        if (bjz_12.aWP() == bjz_1.ioB.aWP()) {
            return false;
        }
        if (!bjz_12.wq()) {
            return false;
        }
        if (bjz_12.c(ezj_0.psw)) {
            return false;
        }
        if (bjz_12.c(ezj_0.psQ)) {
            return false;
        }
        if (bjz_12.c(ezj_0.pua)) {
            return false;
        }
        if (bjz_12.c(exe_1.rDS)) {
            return false;
        }
        if (bjz_12.c(ezj_0.psz) && !bpm_1.d(bjz_12)) {
            return false;
        }
        return !eyw.fik().OX(bjz_12.cqy());
    }

    private static boolean d(@NotNull bjz_1 bjz_12) {
        if (bjz_12.drC() != null && bjz_12.drC().aVo() > 0) {
            return true;
        }
        if (bjz_12.fhN().length > 0) {
            return true;
        }
        return !bjz_12.dry().isEmpty();
    }

    public void dCJ() {
        for (bKT bKT2 : bKU.eca().ghF()) {
            HashSet hashSet = new HashSet();
            bKT2.t((TStep bLc2) -> bLc2.u(bmv_22 -> {
                if (bmv_22.cms() == 0 || bmv_22.cms() == 82) {
                    return;
                }
                int[] nArray = bmv_22.csA() == 0 ? bmv_22.dwu() : new int[]{bmv_22.csA()};
                for (int n : nArray) {
                    if (!this.EV(n)) continue;
                    hashSet.add(n);
                }
            }));
            if (hashSet.isEmpty()) continue;
            this.iUP.put(bKT2.d(), Collections.unmodifiableSet(hashSet));
        }
    }

    public void dCK() {
        fda_0.rWI.a(fdv_0.rZi, (T fds_02) -> {
            if (fds_02.fTw()) {
                return;
            }
            Integer n = fds_02.d();
            fds_02.W((TObjectProcedure<fdt_0>)((TObjectProcedure)fdt_02 -> {
                for (int n2 : fdt_02.fTx().keySet()) {
                    if (bEm.dSb().DW(n2)) continue;
                    return true;
                }
                fdt_02.X((TObjectProcedure<fdu>)((TObjectProcedure)fdu2 -> {
                    if (!this.EV(fdu2.azv())) {
                        return true;
                    }
                    this.iUQ.computeIfAbsent(fdu2.azv(), n -> new HashSet()).add(n);
                    return true;
                }));
                return true;
            }));
        });
    }

    public void t(Collection<bgv_2> collection) {
        for (bgv_2 bgv_22 : collection) {
            if (!this.i(bgv_22)) continue;
            Map<bps_0, TreeSet<bpe_1>> map = bpm_1.h(bgv_22) ? this.iUV : this.iUW;
            bpe_1 bpe_12 = new bpe_1(bgv_22);
            this.a(bgv_22, bpe_12);
            map.values().forEach(treeSet -> treeSet.add(bpe_12));
            this.iUT.add(bgv_22.d());
        }
    }

    public static boolean EU(int n) {
        bgv_2 bgv_22 = (bgv_2)bEm.dSb().Vd(n);
        return bgv_22 != null && bpm_1.h(bgv_22);
    }

    public static boolean h(@NotNull bgv_2 bgv_22) {
        return bgv_22.fYw() && !bgl_1.h(bgv_22);
    }

    private void a(@NotNull bgv_2 bgv_22, @NotNull bpe_1 bpe_12) {
        boolean bl;
        int n = bgv_22.d();
        if (this.iUN.containsKey(n)) {
            bpe_12.a(bpr_0.iYb);
        }
        if (bl = this.iUO.containsKey(n)) {
            bpe_12.a(bpr_0.iYb);
        }
        if (bqg_1.dEw().Fg(n)) {
            bpe_12.a(bpr_0.iYc);
        }
        if (bEm.dSb().Gs(n)) {
            bpe_12.a(bpr_0.iYd);
        }
        if (this.iUQ.containsKey(n)) {
            bpe_12.a(bpr_0.iYe);
        }
        if (bcb_1.hDb.AO(n)) {
            bpe_12.a(bpr_0.iYf);
        }
        if (bjt_0.eaK().Hr(n)) {
            bpe_12.a(bpr_0.iYg);
        }
        if (!bl && bmo_2.iEv.Em(n)) {
            bpe_12.a(bpr_0.iYh);
        }
        if (bEm.dSb().Gv(n)) {
            bpe_12.a(bpr_0.iYi);
        }
        if (bEm.dSb().Gu(n)) {
            bpe_12.a(bpr_0.iYj);
        }
        if (fgl.siZ.contains(n)) {
            bpe_12.a(bpr_0.iYk);
        }
    }

    public boolean EV(int n) {
        if (!bEm.dSb().DW(n)) {
            return false;
        }
        bgv_2 bgv_22 = (bgv_2)bEm.dSb().Vd(n);
        if (bgv_22 == null) {
            return false;
        }
        return this.i(bgv_22);
    }

    public boolean i(@NotNull bgv_2 bgv_22) {
        Boolean bl = this.iUR.get(bgv_22.d());
        if (bl != null) {
            return bl;
        }
        boolean bl2 = bpm_1.j(bgv_22);
        this.iUR.put(bgv_22.d(), bl2);
        return bl2;
    }

    private static boolean j(@NotNull bgv_2 bgv_22) {
        if (bgv_22.dwg() == fgj.siI) {
            return false;
        }
        if (!bgv_22.wq()) {
            return false;
        }
        if (!auc_0.cVq().zy(bgv_22.aVt())) {
            return false;
        }
        return !bgv_22.c(fgg_0.siw);
    }

    public @Unmodifiable List<Integer> dCL() {
        return Collections.unmodifiableList(this.iUK);
    }

    public List<Integer> EW(int n) {
        return Collections.unmodifiableList(this.iUL.getOrDefault(n, List.of()));
    }

    @NotNull
    public Set<Integer> EX(int n) {
        return this.iUM.getOrDefault(n, Collections.emptySet());
    }

    public Optional<@Unmodifiable Set<Integer>> EY(int n) {
        return Optional.ofNullable(this.iUP.get(n));
    }

    @NotNull
    public @Unmodifiable Set<Integer> EZ(int n) {
        Set<Integer> set = this.iUQ.get(n);
        return set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
    }

    public Collection<? extends bpb_1> a(bpr_1 bpr_12, bps_0 bps_02) {
        Map<bps_0, TreeSet<bpb_1>> map = switch (bpr_12) {
            default -> throw new MatchException(null, null);
            case bpr_1.iVl -> this.iUU;
            case bpr_1.iVm -> this.iUV;
            case bpr_1.iVn -> this.iUW;
        };
        return Collections.unmodifiableCollection((Collection)map.get((Object)bps_02));
    }

    public Optional<bpg_1> bI(short s) {
        return Optional.ofNullable(this.iUS.get(s));
    }

    public boolean Fa(int n) {
        return this.iUT.contains(n);
    }

    @NotNull
    public static bpr_1 k(@NotNull bgv_2 bgv_22) {
        return bpm_1.h(bgv_22) ? bpr_1.iVm : bpr_1.iVn;
    }
}

