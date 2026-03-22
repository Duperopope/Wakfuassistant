/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bwG
 */
public class bwg_0
extends bwd_0<bwg_0> {
    private final bgt_0 jzz;
    private final fhk jzA;
    private final fhk jzB;
    private final int jzC;
    private final Consumer<Integer> jzD;

    public bwg_0(bgt_0 bgt_02, int n, @NotNull Consumer<Integer> consumer) {
        this.jzz = bgt_02;
        this.jzA = bgt_02.CL(n);
        this.jzB = this.jzA.fXJ();
        this.jzC = n;
        this.jzD = consumer;
    }

    @Override
    fhk dmL() {
        return this.jzA;
    }

    @Override
    bhx_0 dMK() {
        throw new UnsupportedOperationException("Player does not have a companion npc.");
    }

    @Override
    public boolean dLQ() {
        return super.dLQ() && this.jzB.k(this.jzA);
    }

    @Override
    public void a(bwg_0 bwg_02) {
        this.jzq.clear();
        this.jzq.addAll(bwg_02.jzq);
    }

    @Override
    Set<Long> dMG() {
        HashSet<Long> hashSet = new HashSet<Long>();
        this.jzA.fUd().forEach((ffS2, l) -> {
            if (!Objects.equals(this.jzB.t((ffS)ffS2), l)) {
                hashSet.add((Long)l);
            }
        });
        return hashSet;
    }

    @Override
    int dML() {
        LU lU = new LU();
        this.jzB.fUd().forEach((ffS2, l) -> {
            if (!this.jzA.fa((long)l)) {
                lU.aTo();
            }
        });
        return lU.aTn();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public Optional<ffS> c(ffV ffV2, @NotNull ffS ffS2) {
        fhc fhc2;
        fhe fhe2 = this.jzz.dnP();
        if (fhe2 == null) {
            return Optional.empty();
        }
        Set<ffS> set = fgt.e(this.jzz, this.jzA, ffV2, ffS2);
        ArrayList<Bu> arrayList = new ArrayList<Bu>(set.size());
        for (ffS object2 : set) {
            ffV ffV3 = this.jzA.a(fhe2, object2);
            if (ffV3 == null || !ffV3.apo()) continue;
            arrayList.add(new Bu<ffV, ffS>(ffV3, object2));
        }
        ArrayList arrayList2 = new ArrayList();
        if (!arrayList.isEmpty()) {
            arrayList.sort(Comparator.comparing(bu -> bu.aHI() == ffS2 ? 0 : 1));
            Bu bu2 = (Bu)arrayList.get(0);
            for (int i = 1; i < arrayList.size(); ++i) {
                Bu bu3 = (Bu)arrayList.get(i);
                arrayList2.add(new bwE(bwF.jzx, (ffV)bu3.getFirst(), null, (ffS)bu3.aHI()));
            }
        } else {
            Object var7_9 = null;
        }
        if ((fhc2 = fhn.a(this.jzz.Xi(), this.jzz.Sn(), (byte)this.jzC, ffS2, ffV2.LV(), true)) != fhc.snm) {
            byi_1.a(byh_1.lAv, "equipment.build.error." + fhc2.name(), new Object[0]);
            return Optional.empty();
        }
        if (this.dMS()) {
            void var7_10;
            this.jzq.addAll(arrayList2);
            this.a(ffV2, ffS2, Optional.ofNullable(var7_10));
            this.jzD.accept(1 + arrayList2.size());
        }
        return Optional.of(ffS2);
    }

    @Override
    public Optional<ffS> f(@NotNull ffS ffS2) {
        ffV ffV2 = this.jzA.a(this.jzz.dnP(), ffS2);
        if (ffV2 == null) {
            return Optional.empty();
        }
        fhc fhc2 = new bdo_0().a(this.jzz.Xi(), this.jzz.Sn(), (byte)this.jzC, ffV2.LV(), true);
        if (fhc2 == fhc.snm) {
            if (this.dMS()) {
                bwE bwE2 = new bwE(bwF.jzx, ffV2, null, ffS2);
                this.jzq.add(bwE2);
                this.jzD.accept(1);
            }
            return Optional.of(ffS2);
        }
        byi_1.a(byh_1.lAv, "equipment.build.error." + fhc2.name(), new Object[0]);
        return Optional.empty();
    }

    @Override
    void Y(@NotNull ffV ffV2) {
        ffS ffS2 = this.jzA.O(ffV2.LV());
        if (ffS2 != null) {
            this.jzA.a(Sn.e(Sj.bnN, ffV2, ffS2.aJr()));
            cvu_2.eTO().o(ffS2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean a(@NotNull fhk fhk2) {
        Bj<fhc, Boolean> bj;
        fhe fhe2 = this.jzz.dnP();
        if (fhe2 == null) {
            byi_1.a(byh_1.lAv, "build.error.copy.equipments", new Object[0]);
            return false;
        }
        EnumMap<ffS, Long> enumMap = new EnumMap<ffS, Long>(this.jzA.fUd());
        this.jzA.nd(true);
        short s = this.jzA.cmL();
        try {
            bj = fhn.a(this.jzz, (byte)this.jzC, fhk2, null);
        }
        finally {
            this.jzA.nd(false);
            this.jzA.bw(s);
        }
        if (bj.aHz()) {
            byi_1.a(byh_1.lAv, "equipment.build.error." + bj.aHB().name(), new Object[0]);
            return false;
        }
        if (!bj.aHA().booleanValue()) {
            byi_1.a(byh_1.lAv, "build.invalid.items", new Object[0]);
        }
        if (this.dMS()) {
            this.a(fhe2, enumMap);
        }
        return true;
    }

    private void a(fhe fhe2, EnumMap<ffS, Long> enumMap) {
        for (ffS ffS2 : ffS.sha) {
            Optional<ffV> optional;
            Long l = enumMap.get(ffS2);
            Long l2 = this.jzA.t(ffS2);
            if (l != null && l2 == null) {
                optional = fhe2.B(l);
                if (optional.isEmpty()) continue;
                this.jzq.add(new bwE(bwF.jzx, optional.get(), null, ffS2));
                continue;
            }
            if (l2 == null) continue;
            optional = fhe2.B(l2);
            if (l == null) {
                this.jzq.add(new bwE(bwF.jzv, null, optional.orElse(null), ffS2));
                continue;
            }
            Optional<ffV> optional2 = fhe2.B(l);
            if (optional2.isEmpty()) continue;
            this.jzq.add(new bwE(bwF.jzw, optional2.get(), optional.orElse(null), ffS2));
        }
    }
}

