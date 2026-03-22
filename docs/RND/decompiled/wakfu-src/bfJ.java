/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

class bfJ {
    static final String hVw = ",";
    private final bfF hVx;
    private final List<bfF> hVy = new ArrayList<bfF>();
    private @Unmodifiable @Nullable List<bfF> hVz;
    @Nullable
    private String hVA;
    private boolean hVB = true;
    @NotNull
    private bwh hVC = bwh.jwF;

    public bfJ(bfF bfF2, bgt_0 bgt_02) {
        this.hVx = bfF2;
        this.hVB = bfJ.k(bgt_02);
    }

    private static boolean k(bgt_0 bgt_02) {
        bsz_2 bsz_22 = ((bsg_1)aie_0.cfn().bmH()).M(bgt_02);
        if (!bsz_22.hC(bsn_1.lkD.getKey())) {
            return true;
        }
        return bsz_22.aK(bsn_1.lkD.getKey());
    }

    void b(bfF bfF2) {
        this.hVy.add(bfF2);
    }

    @Unmodifiable List<bfF> dhi() {
        if (this.hVz != null) {
            return this.hVz;
        }
        return Collections.unmodifiableList(this.hVy);
    }

    @Unmodifiable List<bfF> dhj() {
        return Collections.unmodifiableList(this.hVy);
    }

    String dhk() {
        return this.hVy.stream().filter(bfF2 -> bfF2.wp() > 0).map(bfF2 -> String.valueOf(bfF2.wp())).collect(Collectors.joining(hVw));
    }

    @NotNull
    bwh dhl() {
        return this.hVC;
    }

    void a(int n, bfF bfF2) {
        bfF bfF3 = Objects.requireNonNullElse(this.hVz, this.hVy).get(n);
        int n2 = this.hVy.indexOf(bfF2);
        int n3 = GC.a(n2, 0, this.hVy.size() - 1);
        this.hVy.remove(bfF3);
        this.hVy.add(n3, bfF3);
        this.hVC = bwh.jwF;
        if (this.hVz != null) {
            this.cUR();
        }
    }

    void lz(@Nullable String string) {
        this.hVA = string == null || string.isEmpty() ? null : BH.aT(string);
        this.cUR();
    }

    private void cUR() {
        this.hVz = this.hVA == null && this.hVB ? null : this.hVy.stream().filter(this::c).toList();
    }

    private boolean c(bfF bfF2) {
        if (bfF2.wp() == this.hVx.wp()) {
            return true;
        }
        if (bfF2.wp() == cvu_2.eTO().eUs()) {
            return true;
        }
        if (!this.hVB && bfF2.dhe()) {
            return false;
        }
        return this.hVA == null || BH.aT(bfF2.getName()).contains(this.hVA);
    }

    void a(bfJ bfJ2) {
        this.hVA = bfJ2.hVA;
        this.cUR();
    }

    public void a(boolean bl, bgt_0 bgt_02) {
        this.hVB = bl;
        this.cUR();
        String string = bsn_1.lkD.getKey();
        ((bsg_1)aie_0.cfn().bmH()).M(bgt_02).d(string, this.hVB);
        ((bsg_1)aie_0.cfn().bmH()).ev(string);
    }

    boolean b(@NotNull bwh bwh2) {
        if (this.hVC == bwh2) {
            return false;
        }
        this.hVC = bwh2;
        Comparator<bfF> comparator = this.dcC();
        if (comparator == null) {
            return true;
        }
        this.hVy.sort(comparator);
        this.cUR();
        return true;
    }

    Set<Integer> c(Set<Integer> set) {
        HashSet<Integer> hashSet = new HashSet<Integer>(set);
        for (bfF bfF2 : this.hVy) {
            hashSet.remove(bfF2.wp());
        }
        hashSet.remove(0);
        return hashSet;
    }

    void d(Set<Integer> set) {
        if (set.isEmpty()) {
            return;
        }
        this.hVy.sort(Comparator.comparingInt(bfF2 -> set.contains(bfF2.wp()) ? 0 : 1));
    }

    @Nullable
    private Comparator<bfF> dcC() {
        switch (this.hVC) {
            case jwG: {
                return bfF.hVk;
            }
            case jwH: {
                return bfF.hVk.reversed();
            }
            case jwI: {
                return bfF.hVl;
            }
            case jwJ: {
                return bfF.hVl.reversed();
            }
        }
        return null;
    }

    @Generated
    public boolean dhm() {
        return this.hVB;
    }
}

