/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from fqn
 */
public class fqn_0 {
    private final fqm_0 sSB;
    private final exP sSC;

    public fqn_0(fqm_0 fqm_02, exP exP2) {
        this.sSB = fqm_02;
        this.sSC = exP2;
    }

    public @Unmodifiable List<ffV> ghX() {
        Set<exP> set = this.ghZ();
        return this.i(set);
    }

    public int ghY() {
        return this.ghX().stream().mapToInt(ffV::bfd).sum();
    }

    private Set<exP> ghZ() {
        return this.sSB.ghS() ? fcL.rUh.sz(this.sSC.Xi()) : Collections.singleton(this.sSC);
    }

    private @Unmodifiable List<ffV> i(Set<exP> set) {
        Set<Integer> set2 = this.sSB.ghU();
        Set<Long> set3 = this.sSB.ghV();
        return set.stream().flatMap(exP2 -> exP2.dod().fVh().stream()).flatMap(ffs_02 -> ffs_02.b(ffV2 -> !set3.contains(ffV2.LV()) && (set2.isEmpty() || set2.contains(ffV2.avr()))).stream()).filter(ffV2 -> this.sSB.ghT() == null || this.sSB.ghT().test((ffV)ffV2)).sorted(this.sSB.ghW().dcC()).toList();
    }

    public static fqo_0 e(long l, exP exP2) {
        return fqn_0.d(l, exP2.Xi(), exP2.aZj());
    }

    public static fqo_0 d(long l, long l2, long l3) {
        Bu<Long, ffV> bu = fcI.ak(l2, l);
        if (bu != null) {
            return new fqo_0(bu.aHI(), fqp_0.sSH, bu.getFirst());
        }
        bu = fcI.am(l2, l);
        if (bu != null) {
            return new fqo_0(bu.aHI(), fqp_0.sSI, bu.getFirst());
        }
        eJS eJS2 = eJN.qAF.Q(l3, l);
        if (eJS2 != null) {
            ffV ffV2 = (ffV)eJS2.dme().dN(l);
            return new fqo_0(ffV2, fqp_0.sSL, eJS2.Sn());
        }
        return new fqo_0(null, fqp_0.sSM, -1L);
    }

    public static fqo_0 e(int n, long l, long l2) {
        Optional<Bu<Long, ffV>> optional = fcI.af(l, n);
        if (optional.isPresent()) {
            Bu<Long, ffV> bu = optional.get();
            return new fqo_0(bu.aHI(), fqp_0.sSH, bu.getFirst());
        }
        optional = fcI.ag(l, n);
        if (optional.isPresent()) {
            Bu<Long, ffV> bu = optional.get();
            return new fqo_0(bu.aHI(), fqp_0.sSI, bu.getFirst());
        }
        Optional<eJS> optional2 = eJN.qAF.V(l2, n);
        if (optional2.isEmpty()) {
            return new fqo_0(null, fqp_0.sSM, -1L);
        }
        eJS eJS2 = optional2.get();
        ffV ffV2 = (ffV)eJS2.dme().pc(n);
        return new fqo_0(ffV2, fqp_0.sSL, eJS2.Sn());
    }

    public static int f(exP exP2, int n) {
        fqm_0 fqm_02 = new fqm_0().YX(n).nJ(true);
        fqn_0 fqn_02 = new fqn_0(fqm_02, exP2);
        return fqn_02.ghY();
    }
}

