/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  gnu.trove.iterator.TLongObjectIterator
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.collect.Lists;
import gnu.trove.iterator.TLongObjectIterator;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bDL
 */
public class bdl_0
extends fft_0
implements Sp,
aeh_2 {
    private static final Logger jLs = Logger.getLogger(bdl_0.class);
    public static final String jLt = "allItemsView";
    public static final String jLu = "bagListWithoutPockets";
    public static final String jLv = "transferableCharacters";
    public static final String[] jLw = new String[]{"allItemsView", "bagListWithoutPockets", "transferableCharacters"};
    private final ffl jLx = new bdm_0(this);
    private long jLy;
    private bgz_1<bdh_0> jLz;
    bgz_1<beu_0> jLA;

    @Override
    public Object eu(String string) {
        try {
            String string2 = string;
            int n = 0;
            return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{jLt, jLu, jLv}, (Object)string2, n)) {
                case 0 -> new bdb_0(this);
                case 1 -> this.hA(false);
                case 2 -> fcL.rUh.sz(bbs_2.xl()).stream().filter(exP2 -> exP2.Sn() != this.jLy).toList();
                default -> null;
            };
        }
        catch (Exception exception) {
            jLs.error((Object)("An error occurred while getting field value " + string + " of " + this.getClass().getSimpleName()), (Throwable)exception);
            return null;
        }
    }

    @NotNull
    public bgz_1<? extends bDy> hy(boolean bl) {
        if (bl) {
            this.dRr();
            this.dRs();
            return this.jLz;
        }
        this.dRq();
        return this.jLA;
    }

    public void hz(boolean bl) {
        cvo_2.eUK().u(this.jLy, bl);
    }

    private void dRq() {
        if (this.jLA != null && !this.jLA.aJG()) {
            return;
        }
        this.jLA = new bgz_1<beu_0>(this.dRu());
    }

    private void dRr() {
        if (this.jLz != null) {
            return;
        }
        this.jLz = new bgz_1(Lists.newArrayList((Object[])this.dRw()));
    }

    private void dRs() {
        this.jLz.dcb().forEach(bdh_02 -> {
            if (bdh_02 == null) {
                return;
            }
            bdh_02.dRa();
        });
    }

    public void dRt() {
        if (this.jLA == null || this.jLA.aJG()) {
            this.jLA = new bgz_1<beu_0>(this.dRu());
        } else {
            this.jLA.X(this.dRu());
        }
    }

    List<beu_0> dRu() {
        bgt_0 bgt_02 = (bgt_0)fcL.rUh.sw(this.jLy);
        if (bgt_02 == null) {
            return new ArrayList<beu_0>();
        }
        fec_0 fec_02 = (fec_0)bgt_02.a(fez_0.sep);
        Optional<evv_2> optional = bbs_2.a(eva_1.owu);
        beu_0 beu_02 = new beu_0("questInventory");
        beu_0 beu_03 = new beu_0("tokenInventory");
        beu_0 beu_04 = new beu_0("accountInventory");
        ArrayList<bee_0> arrayList = new ArrayList<bee_0>();
        ArrayList<bee_0> arrayList2 = new ArrayList<bee_0>();
        ArrayList<bee_0> arrayList3 = new ArrayList<bee_0>();
        fec_02.r(this.a(arrayList, arrayList2));
        optional.ifPresent(evv_22 -> arrayList3.addAll(this.a((feb_0)evv_22)));
        arrayList2.sort(Comparator.comparing(bee_0::cmL).thenComparing(bee_0::dut).reversed());
        beu_02.W(arrayList);
        beu_03.W(arrayList2);
        beu_04.W(arrayList3);
        ArrayList<beu_0> arrayList4 = new ArrayList<beu_0>();
        arrayList4.add(beu_03);
        arrayList4.add(beu_02);
        arrayList4.add(beu_04);
        return arrayList4;
    }

    private List<bee_0> a(feb_0 feb_02) {
        Map<Integer, Integer> map = feb_02.fUd();
        ArrayList<bee_0> arrayList = new ArrayList<bee_0>(map.size());
        map.forEach((n, n2) -> {
            Optional<bgv_2> optional = bdl_0.Gm(n);
            optional.ifPresent(bgv_22 -> arrayList.addAll(this.a((bgv_2)bgv_22, n2.shortValue())));
        });
        return arrayList;
    }

    @NotNull
    private Consumer<ffm> a(List<bee_0> list, List<bee_0> list2) {
        fhy_0 fhy_02 = bew_1.dSk().Gy(603);
        return ffm2 -> {
            Optional<bgv_2> optional = bdl_0.Gm(ffm2.acs());
            if (optional.isEmpty()) {
                return;
            }
            List<bee_0> list3 = this.a(optional.get(), ffm2.bfd());
            if (list3.isEmpty()) {
                return;
            }
            if (list3.get(0).getItem().fWi().p(fhy_02)) {
                list2.addAll(list3);
            } else {
                list.addAll(list3);
            }
        };
    }

    private List<bee_0> a(bgv_2 bgv_22, short s) {
        ArrayList<bee_0> arrayList = new ArrayList<bee_0>();
        short s2 = bgv_22.bfe();
        while (s > 0) {
            short s3 = (short)Math.min(s, s2);
            ffV ffV2 = new ffV();
            ffV2.l(bgv_22);
            ffV2.ak(s3);
            arrayList.add(new bee_0(ffV2));
            s = (short)(s - s3);
        }
        return arrayList;
    }

    private static Optional<bgv_2> Gm(int n) {
        bgv_2 bgv_22 = (bgv_2)bEm.dSb().Vd(n);
        if (bgv_22 == null) {
            return Optional.empty();
        }
        if (bgv_22.bqp()) {
            return Optional.empty();
        }
        return Optional.of(bgv_22);
    }

    public void dRv() {
        fse_1.gFu().a((aef_2)this, jLu, jLt);
        cvo_2.eUK().oC(this.jLy);
    }

    private bdh_0[] dRw() {
        return this.hA(true);
    }

    private bdh_0[] hA(boolean bl) {
        int n = bl ? 0 : -1;
        bdh_0[] bdh_0Array = new bdh_0[6 + n];
        Object[] objectArray = new ffs_0[this.sfu.size()];
        this.sfu.values(objectArray);
        for (Object object : objectArray) {
            byte by = ((ffs_0)object).eDo();
            if (by == 0) {
                if (!bl) continue;
                bdh_0Array[0] = ((bde_0)object).dRg();
                continue;
            }
            if (by <= 0 || by + n >= bdh_0Array.length) continue;
            bdh_0Array[by + n] = ((bde_0)object).dRg();
        }
        return bdh_0Array;
    }

    public byte hB(boolean bl) {
        byte by;
        bdh_0[] bdh_0Array = this.dRw();
        if (bl) {
            for (by = 0; by < bdh_0Array.length; by = (byte)(by + 1)) {
                if (ffs_0.a(false, by) || bdh_0Array[by] != null || !ffs_0.a(bl, by)) continue;
                return by;
            }
        }
        for (by = 0; by < bdh_0Array.length; by = (byte)(by + 1)) {
            if (bdh_0Array[by] != null || !ffs_0.a(bl, by)) continue;
            return by;
        }
        return -1;
    }

    public int Gn(int n) {
        int n2 = 0;
        for (ffV ffV2 : this.pd(n)) {
            n2 += ffV2.bfd();
        }
        return n2;
    }

    public boolean Go(int n) {
        return !this.pd(n).isEmpty();
    }

    public ffV[] dRx() {
        Object object;
        ArrayList<ffV> arrayList = new ArrayList<ffV>();
        TLongObjectIterator<ffs_0> tLongObjectIterator = this.fVg();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            object = (ffs_0)tLongObjectIterator.value();
            for (short s = 0; s < ((ffs_0)object).bfa(); s = (short)(s + 1)) {
                ffV ffV2 = ((ffs_0)object).fVb().ai(s);
                if (ffV2 == null) continue;
                arrayList.add(ffV2);
            }
        }
        object = new ffV[arrayList.size()];
        return arrayList.toArray((T[])object);
    }

    public List<ffV> dRy() {
        ArrayList<ffV> arrayList = new ArrayList<ffV>();
        for (ffs_0 ffs_02 : this.fVj()) {
            for (ffV ffV2 : ffs_02) {
                if (ffs_02.fVb().a(ffV2)) continue;
                arrayList.add(ffV2);
            }
        }
        return arrayList;
    }

    @Override
    protected void a(ffs_0 ffs_02) {
        this.jLz = new bgz_1(Lists.newArrayList((Object[])this.dRw()));
        ffs_02.a(this);
        ffs_02.pi(bbs_2.xl());
        ffs_02.db(this.jLy);
    }

    @Override
    protected void b(ffs_0 ffs_02) {
        this.jLz.dcb().stream().filter(Objects::nonNull).filter(bdh_02 -> bdh_02.dNO().Lx() == ffs_02.Lx()).findFirst().ifPresent(bDz::dRb);
        this.jLz = new bgz_1(Lists.newArrayList((Object[])this.dRw()));
        ffs_02.b(this);
        ffs_02.pi(-1L);
        ffs_02.db(-1L);
    }

    public void dRz() {
        this.jLz = new bgz_1(Lists.newArrayList((Object[])this.dRw()));
        this.dRv();
    }

    @Override
    @Nullable
    public ffs_0 aa(ffV ffV2) {
        ffs_0 ffs_02 = super.aa(ffV2);
        if (ffs_02 != null) {
            bdq_0.dRC().b(ffV2.LV(), false);
        }
        return ffs_02;
    }

    @Override
    @Nullable
    public ffs_0 a(ffV ffV2, @Nullable fib fib2) {
        ffs_0 ffs_02 = super.a(ffV2, fib2);
        if (ffs_02 != null) {
            bdq_0.dRC().b(ffV2.LV(), false);
        }
        return ffs_02;
    }

    @Override
    @Nullable
    public ffV ld(long l) {
        ffV ffV2 = super.ld(l);
        if (ffV2 != null) {
            bdq_0.dRC().b(l, false);
        }
        return ffV2;
    }

    @Override
    @Nullable
    public ffV a(long l, @Nullable fib fib2) {
        ffV ffV2 = super.a(l, fib2);
        if (ffV2 != null) {
            bdq_0.dRC().b(l, false);
        }
        return ffV2;
    }

    @Override
    public void b(Sl sl) {
        switch (sl.bfB()) {
            case bnZ: 
            case boa: 
            case bob: 
            case boc: {
                this.hz(true);
                fse_1.gFu().a((aef_2)this, jLt);
            }
        }
    }

    public void E(bgt_0 bgt_02) {
        this.jLy = bgt_02.Sn();
        fec_0 fec_02 = (fec_0)bgt_02.a(fez_0.sep);
        fec_02.a(this.jLx);
        fse_1.gFu().a((aef_2)this, jLv);
    }

    public ArrayList<ffs_0> dRA() {
        return this.d(sft);
    }

    public long KU() {
        return this.jLy;
    }

    @Nullable
    public bdh_0 le(long l) {
        return this.jLz.dcb().stream().filter(bdh_02 -> {
            if (bdh_02 == null || bdh_02.dNO() == null) {
                return false;
            }
            return bdh_02.dNO().Lx() == l;
        }).findFirst().orElse(null);
    }

    public Optional<bdg_0> a(dbl_0 dbl_02) {
        return this.a(dbl_02.getItem(), dbl_02.bfd(), dbl_02.getDestinationUniqueId(), dbl_02.getDestinationPosition());
    }

    public Optional<bdg_0> a(@NotNull ffV ffV2, short s, long l, short s2) {
        short s3;
        ffs_0 ffs_02 = this.sY(l);
        ffV ffV3 = ffV2.eU(s);
        if (ffs_02 != null && s2 >= 0 && ffs_02.h(ffV3, s2)) {
            return Optional.of(new bdg_0(ffs_02, s2));
        }
        if (ffs_02 != null && (s3 = ffs_02.cq(ffV3)) >= 0) {
            return Optional.of(new bdg_0(ffs_02, s3));
        }
        ffs_0 ffs_03 = this.ct(ffV3);
        if (ffs_03 == null) {
            return Optional.empty();
        }
        short s4 = ffs_03.cq(ffV3);
        if (s4 >= 0) {
            return Optional.of(new bdg_0(ffs_03, s4));
        }
        return Optional.empty();
    }

    @Override
    public String[] bxk() {
        return jLw;
    }

    public OptionalInt a(@NotNull bdh_0 bdh_02) {
        int n = 0;
        for (ffs_0 ffs_02 : this.fVj()) {
            if (ffs_02.Lx() == bdh_02.dNO().Lx()) {
                return OptionalInt.of(n);
            }
            if (ffs_02.bfa() == -1) {
                return OptionalInt.empty();
            }
            n += ffs_02.bfa();
        }
        return OptionalInt.empty();
    }

    @Override
    protected String dRB() {
        Object t = fcL.rUh.sw(this.jLy);
        if (t != null) {
            return ((exP)t).getName() + " / " + ((exP)t).Sn();
        }
        return String.valueOf(this.jLy);
    }
}

