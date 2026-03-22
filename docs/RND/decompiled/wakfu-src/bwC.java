/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;

public class bwC
extends bwd_0<bwC> {
    private final eJS jzm;
    private final bhx_0 jzn;
    private final Map<Integer, Long> jzo;
    private final Consumer<Integer> jzp;

    bwC(eJS eJS2, bhx_0 bhx_02, Consumer<Integer> consumer) {
        this.jzm = eJS2;
        this.jzn = bhx_02;
        this.jzo = eJS2.dme().beU();
        this.jzp = consumer;
    }

    @Override
    public boolean dLQ() {
        return super.dLQ() && !this.jzo.equals(this.jzm.dme().beU());
    }

    @Override
    fhk dmL() {
        throw new UnsupportedOperationException("Companion does not have equipment sheet.");
    }

    @Override
    bhx_0 dMK() {
        return this.jzn;
    }

    @Override
    public void a(bwC bwC2) {
        throw new UnsupportedOperationException("Cannot copy modifications of companion equipment modifications.");
    }

    @Override
    Set<Long> dMG() {
        HashSet<Long> hashSet = new HashSet<Long>();
        this.jzm.dme().c((ffV2, n) -> {
            Long l = this.jzo.get(n);
            if (l == null || l.longValue() != ffV2.LV()) {
                hashSet.add(ffV2.LV());
            }
        });
        return hashSet;
    }

    @Override
    int dML() {
        LU lU = new LU();
        this.jzo.forEach((n, l) -> {
            if (!this.jzm.dme().dM((long)l)) {
                lU.aTo();
            }
        });
        return lU.aTn();
    }

    List<eJL> dMM() {
        LinkedHashMap<ffS, eJL> linkedHashMap = new LinkedHashMap<ffS, eJL>();
        for (bwE bwE2 : this.jzq) {
            if (bwE2.dMN() == bwF.jzx) {
                eJL eJL2 = (eJL)linkedHashMap.get(bwE2.dMQ());
                if (eJL2 != null && eJL2.fxq()) {
                    linkedHashMap.remove(bwE2.dMQ());
                    continue;
                }
                linkedHashMap.put(bwE2.dMQ(), eJL.q(bwE2.dMQ()));
                continue;
            }
            linkedHashMap.put(bwE2.dMQ(), eJL.a(bwE2.dMQ(), bwE2.dMP().LV()));
        }
        return new ArrayList<eJL>(linkedHashMap.values());
    }

    @Override
    public Optional<ffS> c(ffV ffV2, @NotNull ffS ffS2) {
        Object object;
        Optional<eIi> optional = eJW.z(this.jzm);
        Set<ffS> set = fgt.b(this.jzm.dme(), ffV2, ffS2);
        fgd_0 fgd_02 = this.jzm.dme();
        ArrayList<Bu<ffV, ffS>> arrayList = new ArrayList<Bu<ffV, ffS>>(set.size());
        for (ffS object22 : set) {
            object = (ffV)fgd_02.ai(object22.shb);
            if (object == null || !((ffV)object).apo()) continue;
            arrayList.add(new Bu<ffV, ffS>((ffV)object, object22));
        }
        Optional<eJK> optional2 = this.a(ffV2, ffS2, arrayList);
        if (optional2.isPresent()) {
            if (((eJK)((Object)optional2.get())).fxo() != null) {
                byi_1.a(byh_1.lAv, "equipment.build.error." + ((eJK)((Object)optional2.get())).fxo().name(), new Object[0]);
            } else {
                byi_1.a(byh_1.lAv, "build.equipment.companion.error." + ((eJK)((Object)optional2.get())).name(), new Object[0]);
            }
            return Optional.empty();
        }
        ArrayList<bwE> arrayList2 = new ArrayList<bwE>();
        if (!arrayList.isEmpty()) {
            arrayList.sort(Comparator.comparing(bu -> bu.aHI() == ffS2 ? 0 : 1));
            object = (Bu)arrayList.get(0);
            for (int sb_02 = 0; sb_02 < arrayList.size(); ++sb_02) {
                Bu bu2 = (Bu)arrayList.get(sb_02);
                fgd_02.af(((ffS)bu2.aHI()).shb);
                if (sb_02 <= 0) continue;
                arrayList2.add(new bwE(bwF.jzx, (ffV)bu2.getFirst(), null, (ffS)bu2.aHI()));
            }
        } else {
            object = null;
        }
        if (!fgd_02.b(ffV2, (short)ffS2.shb)) {
            byi_1.a(byh_1.lAv, "build.equipment.companion.error." + eJK.qAn.name(), new Object[0]);
            bwC.a(fgd_02, arrayList);
            return Optional.empty();
        }
        try {
            fgd_02.a(ffV2, ffS2.shb);
        }
        catch (sb_0 list) {
            return Optional.empty();
        }
        List<ffV> list = optional.map(bwC::b).orElse(List.of());
        cts_1.a(this.jzm, list);
        if (this.dMS()) {
            this.jzq.addAll(arrayList2);
            this.a(ffV2, ffS2, Optional.ofNullable(object));
            this.jzp.accept(1 + arrayList2.size());
        }
        return Optional.of(ffS2);
    }

    private static List<ffV> b(eIi eIi2) {
        ArrayList<ffV> arrayList = new ArrayList<ffV>();
        Map<ffS, Integer> map = fhs.eW(eIi2.cmL()).fXL();
        for (Map.Entry<ffS, Integer> entry : map.entrySet()) {
            arrayList.add(eJW.d(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    private static void a(fgd_0 fgd_02, List<Bu<ffV, ffS>> list) {
        for (Bu<ffV, ffS> bu : list) {
            bwC.a(fgd_02, bu.getFirst(), bu.aHI());
        }
    }

    private static void a(fgd_0 fgd_02, ffV ffV2, ffS ffS2) {
        try {
            fgd_02.a(ffV2, ffS2.shb);
        }
        catch (sb_0 sb_02) {
            // empty catch block
        }
    }

    private Optional<eJK> a(@NotNull ffV ffV2, @NotNull ffS ffS2, @NotNull List<Bu<ffV, ffS>> list) {
        Optional<eJK> optional = eJW.a(fcI.so(this.jzm.Xi()), this.jzn, ffV2, ffS2.shb);
        if (optional.isPresent()) {
            return optional;
        }
        if (list.isEmpty()) {
            return Optional.empty();
        }
        fgd_0 fgd_02 = this.jzm.dme();
        for (Bu<ffV, ffS> bu : list) {
            if (fgd_02.j(bu.getFirst())) continue;
            return Optional.of(eJK.qAn);
        }
        return Optional.empty();
    }

    @Override
    public Optional<ffS> f(@NotNull ffS ffS2) {
        fgd_0 fgd_02 = this.jzm.dme();
        ffV ffV2 = (ffV)fgd_02.ai(ffS2.shb);
        if (ffV2 == null) {
            return Optional.empty();
        }
        if (!fgd_02.j(ffV2)) {
            return Optional.empty();
        }
        fgd_02.af(ffS2.shb);
        cts_1.a(this.jzm, ffV2);
        if (this.dMS()) {
            bwE bwE2 = new bwE(bwF.jzx, ffV2, null, ffS2);
            this.jzq.add(bwE2);
            this.jzp.accept(1);
        }
        return Optional.of(ffS2);
    }

    @Override
    void Y(@NotNull ffV ffV2) {
        short s = this.jzm.dme().dK(ffV2.LV());
        ffS ffS2 = ffS.gj((byte)s);
        if (s > 0 && ffS2 != null) {
            this.jzm.dme().af(s);
            cts_1.a(this.jzm, ffV2);
            cvu_2.eTO().o(ffS2);
        }
    }

    @Override
    boolean a(@NotNull fhk fhk2) {
        throw new UnsupportedOperationException("Cannot copy equipment sheet to companion equipment.");
    }
}

