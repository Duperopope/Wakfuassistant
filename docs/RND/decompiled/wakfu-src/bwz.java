/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class bwz
extends bwh_0<bwz> {
    private final bwi jyW;
    private final eIj jyX;
    private final boolean jyY;
    private final List<bwB> jyZ = new ArrayList<bwB>();
    private final List<bwA> jza = new ArrayList<bwA>();
    @NotNull
    private final bwd_0 jzb;
    @NotNull
    private final bwi_0 jzc;
    @NotNull
    private final bwx jzd;

    public bwz(bwi bwi2, bfF bfF2, boolean bl) {
        this(bwi2, bfF2.dhd(), bl);
    }

    public bwz(bwi bwi2, eIj eIj2, boolean bl) {
        this.jyW = bwi2;
        this.jyX = eIj2;
        this.jyY = bl;
        this.jzb = this.b(bwi2);
        this.jzc = new bwi_0(this.jyW.dLD(), this.jyX.wp(), () -> this.a(bwB.jzj, 1));
        this.jzd = new bwx(this.jyW.dLD(), this.jyX.wp(), () -> this.a(bwB.jzk, 1));
    }

    private bwd_0 b(bwi bwi2) {
        if (bwi2.aXd()) {
            return new bwC(this.jyW.dLE(), (bhx_0)this.jyW.dcP(), n -> this.a(bwB.jzi, (int)n));
        }
        return new bwg_0(this.jyW.dLD(), this.jyX.wp(), n -> this.a(bwB.jzi, (int)n));
    }

    private void a(bwB bwB2, int n) {
        for (int i = 0; i < n; ++i) {
            this.jyZ.add(bwB2);
        }
    }

    @Override
    public boolean dLQ() {
        if (!this.dMS()) {
            return false;
        }
        return this.jyY || this.dMA();
    }

    public boolean FV(int n) {
        switch (n) {
            case 0: {
                return this.jzb.dLQ();
            }
            case 1: {
                return this.jzc.dLQ();
            }
            case 2: {
                return this.jzd.dLQ();
            }
        }
        return false;
    }

    private boolean dMA() {
        return this.dMB() || this.jzb.dLQ() || this.jzc.dLQ() || this.jzd.dLQ();
    }

    private boolean dMB() {
        if (this.jza.isEmpty()) {
            return false;
        }
        bwA bwA2 = this.jza.get(0);
        return !bwA2.jze.equals(this.jyX.getName()) || bwA2.jzf != this.jyX.tL() || bwA2.jzg != this.jyX.ws();
    }

    public boolean dMC() {
        return !this.jyY || this.dMA();
    }

    public Optional<Integer> dMD() {
        if (this.jyZ.isEmpty()) {
            return Optional.empty();
        }
        switch (this.jyZ.get(this.jyZ.size() - 1).ordinal()) {
            case 0: {
                return Optional.empty();
            }
            case 1: {
                return Optional.of(0);
            }
            case 2: {
                return Optional.of(1);
            }
            case 3: {
                return Optional.of(2);
            }
        }
        return Optional.empty();
    }

    @Override
    public void dMy() {
        if (this.jyZ.isEmpty()) {
            return;
        }
        bwB bwB2 = this.jyZ.remove(this.jyZ.size() - 1);
        switch (bwB2.ordinal()) {
            case 0: {
                if (this.jza.isEmpty()) {
                    return;
                }
                this.a(this.jza.remove(this.jza.size() - 1));
                return;
            }
            case 1: {
                this.jzb.dMy();
                return;
            }
            case 2: {
                this.jzc.dMy();
                return;
            }
            case 3: {
                this.jzd.dMy();
                return;
            }
        }
    }

    @Override
    private void a(@NotNull bwA bwA2) {
        this.jza.remove(bwA2);
        this.p(() -> cvu_2.eTO().b(bwA2.jze, bwA2.jzf, bwA2.jzg));
    }

    @Override
    public void dMz() {
        this.hl(true);
    }

    @Override
    public void hl(boolean bl) {
        this.p(() -> {
            if (this.jyY) {
                bwz.dME();
            } else {
                this.hm(bl);
            }
        });
    }

    private static void dME() {
        cvu_2.eTO().eUd();
    }

    private void hm(boolean bl) {
        if (!this.jza.isEmpty()) {
            this.a(this.jza.get(0));
            this.jza.clear();
        }
        this.jyZ.clear();
        this.jzb.dMz();
        this.jzc.dMz();
        this.jzd.dMz();
        if (bl && this.jyW.dmc()) {
            this.jyW.dLD().e(this.jyW.dLD().dmQ());
        }
    }

    @Override
    public void a(@NotNull bwz bwz2) {
        this.jyZ.clear();
        this.jyZ.addAll(bwz2.jyZ);
        this.jza.clear();
        this.jza.addAll(bwz2.jza);
        this.jzb.a(bwz2.jzb);
        this.jzc.a(bwz2.jzc);
        this.jzd.a(bwz2.jzd);
    }

    public boolean a(@NotNull String string, short s, int n) {
        bwA bwA2 = new bwA(this.jyX.getName(), (short)this.jyX.tL(), this.jyX.ws());
        if (this.jyX.dhe() && s != this.jyX.tL()) {
            return false;
        }
        this.jyX.setName(string);
        this.jyX.PP(s);
        this.jyX.PQ(n);
        this.jzb.dmL().bw(s);
        this.jzc.dMT().PP(s);
        this.jzd.dMx().dz(s);
        cvu_2.eTO().eUg();
        if (this.dMS()) {
            this.jza.add(bwA2);
            this.a(bwB.jzh, 1);
        }
        return true;
    }

    public boolean dMF() {
        if (this.jyW.dmc()) {
            return this.B(this.jyW.dLD());
        }
        return this.m(this.jyW.dLE());
    }

    public boolean FW(int n) {
        if (this.jyW.dmc()) {
            switch (n) {
                case 0: {
                    return eIp.a(this.jyW.dLD(), this.jyX.wp(), this.jzb.dmL()).isEmpty();
                }
                case 1: {
                    return eIp.a((exP)this.jyW.dLD(), this.jzc.dMT()).isEmpty();
                }
                case 2: {
                    return eIp.a((exP)this.jyW.dLD(), this.jzd.dMx()).isEmpty();
                }
            }
            return true;
        }
        if (n == 0) {
            eJS eJS2 = this.jyW.dLE();
            return eJW.a(fcI.so(eJS2.Xi()), this.jzb.dMK(), eJS2.dme()).isEmpty();
        }
        return true;
    }

    private boolean B(bgt_0 bgt_02) {
        List<Long> list = eIp.a(bgt_02, this.jyX.wp(), this.jzb.dmL());
        if (!list.isEmpty()) {
            if (list.get(0) == -1L) {
                byi_1.a(byh_1.lAv, "build.error.save.generic", -1L);
            } else {
                String string = list.stream().map(l -> bgt_02.dnP().B((Long)l)).filter(Optional::isPresent).map(Optional::get).map(ffV::getName).collect(Collectors.joining(", "));
                byi_1.a(byh_1.lAv, "build.error.save.equipments.ui", list.size(), string);
            }
            return false;
        }
        List<Integer> list2 = eIp.a((exP)bgt_02, this.jzc.dMT());
        if (!list2.isEmpty()) {
            if ((long)list2.get(0).intValue() == -1L) {
                byi_1.a(byh_1.lAv, "build.error.save.generic", -1L);
            } else {
                String string = list2.stream().map(n -> aum_0.cWf().a(3, (long)n.intValue(), new Object[0])).collect(Collectors.joining(", "));
                byi_1.a(byh_1.lAv, "build.error.save.spells.ui", list2.size(), string);
            }
            return false;
        }
        List<Integer> list3 = eIp.a((exP)bgt_02, this.jzd.dMx());
        if (!list3.isEmpty()) {
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
            Object object = list3.iterator();
            while (object.hasNext()) {
                int n2 = object.next();
                if (n2 > 0) {
                    arrayList.add(n2);
                    continue;
                }
                arrayList2.add(-n2);
            }
            object = arrayList.stream().map(n -> aum_0.cWf().a(146, (long)n.intValue(), new Object[0])).collect(Collectors.joining(", "));
            if (!arrayList.isEmpty()) {
                byi_1.a(byh_1.lAv, "build.error.save.aptitudes.bonus.ui", arrayList.size(), object);
            }
            String string = arrayList2.stream().map(n -> aum_0.cWf().a(147, (long)n.intValue(), new Object[0])).collect(Collectors.joining(", "));
            if (!arrayList2.isEmpty()) {
                byi_1.a(byh_1.lAv, "build.error.save.aptitudes.category.ui", arrayList2.size(), string);
            }
            return false;
        }
        return true;
    }

    private boolean m(eJS eJS2) {
        List<ffV> list = eJW.a(fcI.so(eJS2.Xi()), this.jzb.dMK(), eJS2.dme());
        if (!list.isEmpty()) {
            String string = list.stream().map(ffV::getName).collect(Collectors.joining(", "));
            byi_1.a(byh_1.lAv, "build.error.save.equipments.ui", list.size(), string);
            return false;
        }
        if (this.jzb.dML() > aue_0.cVJ().cVK().dno().fVd()) {
            byi_1.a(byh_1.lAv, "build.error.not.enough.inventory.space", new Object[0]);
            return false;
        }
        return list.isEmpty();
    }

    public nv_0 hn(boolean bl) {
        if (this.jyW.dmc()) {
            cjq cjq2 = new cjq(this.jyW.Sn(), this.jyX);
            if (bl || this.jzb.dLQ()) {
                cjq2.c(this.jzb.dmL());
            }
            if (bl || this.jzc.dLQ()) {
                cjq2.d(this.jzc.dMT());
            }
            if (bl || this.jzd.dLQ()) {
                cjq2.c(this.jzd.dMx());
            }
            return cjq2;
        }
        List<eJL> list = ((bwC)this.jzb).dMM();
        return new cjr(this.jyW.Sn(), list);
    }

    public Set<Long> dMG() {
        return this.jzb.dMG();
    }

    @Nullable
    public ffV kT(long l) {
        return this.jzb.kT(l);
    }

    public Optional<ffS> c(ffV ffV2, @NotNull ffS ffS2) {
        return this.jzb.c(ffV2, ffS2);
    }

    public Optional<ffS> f(@NotNull ffS ffS2) {
        return this.jzb.f(ffS2);
    }

    public void X(@NotNull ffV ffV2) {
        this.jzb.X(ffV2);
    }

    public boolean a(@NotNull fhk fhk2) {
        return this.jzb.a(fhk2);
    }

    public boolean a(@NotNull bmx_0 bmx_02, @NotNull bmd_0 bmd_02) {
        return this.jzc.a(bmx_02, bmd_02);
    }

    public boolean a(@NotNull bmd_0 bmd_02) {
        return this.jzc.a(bmd_02);
    }

    public boolean a(@NotNull frd frd2) {
        return this.jzc.a(frd2);
    }

    public void b(@NotNull bes_2 bes_22, int n) {
        this.jzd.a(bes_22, n);
    }

    public void b(@NotNull ehy_0 ehy_02) {
        this.jzd.b(ehy_02);
    }

    @Generated
    public boolean dMH() {
        return this.jyY;
    }
}

