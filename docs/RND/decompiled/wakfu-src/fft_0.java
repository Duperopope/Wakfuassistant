/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TByteIntHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TByteIntHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fft
 */
public abstract class fft_0 {
    private static final Logger sfr = Logger.getLogger(fft_0.class);
    public static final Comparator<ffs_0> sfs = new ffu();
    public static final Comparator<ffs_0> sft = (ffs_02, ffs_03) -> {
        boolean bl = ffs_02.fVf();
        boolean bl2 = ffs_03.fVf();
        if (bl && !bl2) {
            return -1;
        }
        if (!bl && bl2) {
            return 1;
        }
        return sfs.compare((ffs_0)ffs_02, (ffs_0)ffs_03);
    };
    protected final TLongObjectHashMap<ffs_0> sfu = new TLongObjectHashMap();
    protected final ArrayList<ffk_0> sfv = new ArrayList();

    private static Comparator<ffs_0> e(@Nullable ffs_0 ffs_02) {
        if (ffs_02 == null) {
            return sft;
        }
        return Comparator.comparingInt(ffs_03 -> ffs_03.Lx() == ffs_02.Lx() ? 0 : 1).thenComparing(sft);
    }

    public boolean sX(long l) {
        return this.sfu.containsKey(l);
    }

    public ffs_0 sY(long l) {
        return (ffs_0)this.sfu.get(l);
    }

    public ffs_0 sZ(long l) {
        TLongObjectIterator tLongObjectIterator = this.sfu.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ffs_0 ffs_02 = (ffs_0)tLongObjectIterator.value();
            if (ffs_02.Lx() != l) continue;
            return ffs_02;
        }
        return null;
    }

    public TLongObjectIterator<ffs_0> fVg() {
        return this.sfu.iterator();
    }

    public <T extends ffs_0> Collection<T> fVh() {
        return this.sfu.valueCollection();
    }

    public ffs_0 ct(ffV ffV2) {
        return this.a(ffV2, (ffs_0)null);
    }

    public ffs_0 a(ffV ffV2, @Nullable ffs_0 ffs_02) {
        for (ffs_0 ffs_03 : this.d(fft_0.e(ffs_02))) {
            if (ffs_03.sfn.beR().a(ffs_03.sfn, ffV2) < 0) continue;
            return ffs_03;
        }
        return null;
    }

    @Nullable
    public ffs_0 cu(ffV ffV2) {
        ffs_0 ffs_02 = null;
        for (ffs_0 ffs_03 : this.d(sft)) {
            if (ffs_03.sfn.beR().a(ffs_03.sfn, ffV2) < 0) continue;
            if (!ffV2.fWj()) {
                return ffs_03;
            }
            if (ffs_03.pb(ffV2.avr())) {
                return ffs_03;
            }
            if (ffs_02 != null) continue;
            ffs_02 = ffs_03;
        }
        return ffs_02;
    }

    public ffs_0 cv(ffV ffV2) {
        for (ffs_0 ffs_02 : this.d(sft)) {
            if (ffs_02.sfn.beR().a(ffs_02.sfn, ffV2) != 0) continue;
            return ffs_02;
        }
        return null;
    }

    public Bu<ffs_0, Short> e(ffV ffV2, long l) {
        for (ffs_0 ffs_02 : this.d(sft)) {
            if (ffs_02.Lx() == l || ffs_02.sfn.beR().a(ffs_02.sfn, ffV2) < 0) continue;
            return new Bu<ffs_0, Short>(ffs_02, ffs_02.sfn.h(ffV2));
        }
        return null;
    }

    public ffs_0 ta(long l) {
        for (ffs_0 ffs_02 : this.d(sfs)) {
            if (!ffs_02.sfn.dM(l)) continue;
            return ffs_02;
        }
        return null;
    }

    public ffs_0 cw(ffV ffV2) {
        return this.a(ffV2, (sh_0)null);
    }

    public ffs_0 a(ffV ffV2, sh_0 sh_02) {
        return this.a(ffV2, false, (Sp)sh_02);
    }

    public ffs_0 j(ffV ffV2, boolean bl) {
        return this.a(ffV2, bl, (Sp)null);
    }

    public ffs_0 a(ffV ffV2, boolean bl, @Nullable Sp sp) {
        return this.a(ffV2, bl, null, sp);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public ffs_0 a(ffV ffV2, boolean bl, @Nullable ffs_0 ffs_02, @Nullable Sp sp) {
        ffs_0 ffs_03 = null;
        if (ffV2.bfe() > 1) {
            ffs_03 = this.a(ffV2, false, ffs_02);
        }
        if (ffs_03 == null) {
            ffs_03 = this.a(ffV2, ffs_02);
        }
        if (ffs_03 == null) {
            return null;
        }
        RL<ffV, uy_1> rL = ffs_03.sfn;
        try {
            if (sp != null) {
                rL.a(sp);
            }
            if (rL.b(ffV2)) {
                if (bl && !rL.f(ffV2)) {
                    ffV2.aZp();
                }
                ffs_0 ffs_04 = ffs_03;
                return ffs_04;
            }
        }
        catch (sa_0 sa_02) {
            sfr.error((Object)("[Bags] Bags of " + this.dRB() + " are full and cannot receive item " + ffV2.fWz()), (Throwable)sa_02);
        }
        catch (Sz sz) {
            sfr.error((Object)("[Bags] Bags of " + this.dRB() + " already contains item with same UID " + ffV2.fWz()), (Throwable)sz);
        }
        finally {
            if (sp != null) {
                rL.b(sp);
            }
        }
        return null;
    }

    @Nullable
    public ffs_0 a(@NotNull ffx_0 ffx_02) {
        return this.a(ffx_02.dRT(), ffx_02.dRi(), false, null);
    }

    @Nullable
    public ffs_0 j(@NotNull ffV ffV2, short s) {
        return this.a(ffV2, s, false, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Nullable
    public ffs_0 a(@NotNull ffV ffV2, short s, boolean bl, @Nullable fib fib2) {
        Optional<Bu<ffs_0, Short>> optional = this.eT(s);
        if (optional.isEmpty()) {
            return null;
        }
        ffs_0 ffs_02 = optional.get().getFirst();
        short s2 = optional.get().aHI();
        RL<ffV, uy_1> rL = ffs_02.sfn;
        try {
            if (fib2 != null) {
                rL.a(fib2);
            }
            if (rL.a(ffV2, s2)) {
                if (bl && !rL.f(ffV2)) {
                    ffV2.aZp();
                }
                ffs_0 ffs_03 = ffs_02;
                return ffs_03;
            }
        }
        catch (SD | Sz | sa_0 sb_02) {
            sfr.error((Object)("Could not add item " + ffV2.fWz() + " at position " + s + " (bag=" + String.valueOf(ffs_02) + ", bagPosition=" + s2 + ", owner=" + this.dRB() + ")"), (Throwable)sb_02);
        }
        finally {
            if (fib2 != null) {
                rL.b(fib2);
            }
        }
        return null;
    }

    private Optional<Bu<ffs_0, Short>> eT(short s) {
        if (s < 0) {
            return Optional.empty();
        }
        short s2 = s;
        for (ffs_0 ffs_02 : this.fVj()) {
            short s3 = ffs_02.bfa();
            if (s3 == -1 || s2 < s3) {
                return Optional.of(new Bu<ffs_0, Short>(ffs_02, s2));
            }
            s2 = (short)(s2 - s3);
        }
        return Optional.empty();
    }

    public ffs_0 aa(ffV ffV2) {
        return this.a(ffV2, (fib)null);
    }

    public ffs_0 a(ffV ffV2, @Nullable fib fib2) {
        TLongObjectIterator tLongObjectIterator = this.sfu.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ffs_0 ffs_02 = (ffs_0)tLongObjectIterator.value();
            if (fib2 != null) {
                ffs_02.fVb().a(fib2);
            }
            boolean bl = ffs_02.sfn.c(ffV2);
            if (fib2 != null) {
                ffs_02.fVb().b(fib2);
            }
            if (!bl) continue;
            return ffs_02;
        }
        return null;
    }

    public void a(RX<ffV> rX) {
        this.sfu.forEachValue((TObjectProcedure)new ffv_0(this, rX));
    }

    public int UJ(int n) {
        int n2 = 0;
        TLongObjectIterator tLongObjectIterator = this.sfu.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ffs_0 ffs_02 = (ffs_0)tLongObjectIterator.value();
            n2 += ffs_02.sfn.pa(n);
        }
        return n2;
    }

    public int fQ(int n, int n2) {
        return this.a(n, n2, null);
    }

    public int a(int n, int n2, fib fib2) {
        int n3 = this.a(n, n2, fib2, false);
        int n4 = n2 - n3;
        if (n4 > 0) {
            n3 += this.a(n, n4, fib2, true);
        }
        return n3;
    }

    private int a(int n, int n2, fib fib2, boolean bl) {
        int n3 = 0;
        TLongObjectIterator tLongObjectIterator = this.sfu.iterator();
        while (tLongObjectIterator.hasNext() && n2 > 0) {
            tLongObjectIterator.advance();
            ffs_0 ffs_02 = (ffs_0)tLongObjectIterator.value();
            ffs_02.a(fib2);
            n3 += ffs_02.sfn.a(n, n2 - n3, bl);
            ffs_02.b(fib2);
            if (n3 < n2) continue;
            return n3;
        }
        return n3;
    }

    public void fVi() {
        TLongObjectIterator tLongObjectIterator = this.sfu.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ((ffs_0)tLongObjectIterator.value()).sfn.beZ();
        }
    }

    public ffV ld(long l) {
        return this.a(l, null);
    }

    public ffV a(long l, @Nullable fib fib2) {
        TLongObjectIterator tLongObjectIterator = this.sfu.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ffs_0 ffs_02 = (ffs_0)tLongObjectIterator.value();
            if (fib2 != null) {
                ffs_02.fVb().a(fib2);
            }
            ffV ffV2 = ffs_02.sfn.dL(l);
            if (fib2 != null) {
                ffs_02.fVb().b(fib2);
            }
            if (ffV2 == null) continue;
            return ffV2;
        }
        return null;
    }

    public short dJ(long l) {
        TLongObjectIterator tLongObjectIterator = this.sfu.iterator();
        short s = 0;
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            s = (short)(s + ((ffs_0)tLongObjectIterator.value()).sfn.dJ(l));
        }
        return s;
    }

    public boolean b(long l, short s) {
        return this.a(l, s, null);
    }

    public boolean a(long l, short s, @Nullable sh_0 sh_02) {
        boolean bl = false;
        TLongObjectIterator tLongObjectIterator = this.sfu.iterator();
        while (tLongObjectIterator.hasNext() && !bl) {
            tLongObjectIterator.advance();
            bl = ((ffs_0)tLongObjectIterator.value()).a(l, s, sh_02);
        }
        return bl;
    }

    @Nullable
    public ffV UK(int n) {
        ffV ffV2 = null;
        for (ffs_0 ffs_02 : this.d(sfs)) {
            for (ffV ffV3 : ffs_02.fVb()) {
                if (ffV3.avr() != n) continue;
                if (!ffs_02.fVb().dI(ffV3.LV())) {
                    return ffV3;
                }
                if (ffV2 != null) continue;
                ffV2 = ffV3;
            }
        }
        return ffV2;
    }

    @Nullable
    public ffV d(int n, @NotNull RX<ffV> rX) {
        ffV ffV2 = null;
        for (ffs_0 ffs_02 : this.fVj()) {
            for (ffV ffV3 : ffs_02.fVb()) {
                if (ffV3.avr() != n || !rX.isValid(ffV3)) continue;
                if (!ffs_02.fVb().dI(ffV3.LV())) {
                    return ffV3;
                }
                if (ffV2 != null) continue;
                ffV2 = ffV3;
            }
        }
        return ffV2;
    }

    public ffV f(fhy_0 fhy_02) {
        for (ffs_0 ffs_02 : this.d(sfs)) {
            ffV ffV2 = ffs_02.e(fhy_02);
            if (ffV2 == null) continue;
            return ffV2;
        }
        return null;
    }

    public ffV b(fgg_0 fgg_02) {
        for (ffs_0 ffs_02 : this.d(sfs)) {
            ffV ffV2 = ffs_02.a(fgg_02);
            if (ffV2 == null) continue;
            return ffV2;
        }
        return null;
    }

    public ffs_0 UL(int n) {
        for (ffs_0 ffs_02 : this.d(sfs)) {
            ffV ffV2 = ffs_02.sfn.pc(n);
            if (ffV2 == null) continue;
            return ffs_02;
        }
        return null;
    }

    public ffV tb(long l) {
        for (ffs_0 ffs_02 : this.sfu.valueCollection()) {
            ffV ffV2 = ffs_02.sfn.dN(l);
            if (ffV2 == null) continue;
            return ffV2;
        }
        return null;
    }

    public ArrayList<ffV> UM(int n) {
        ArrayList<ffV> arrayList = null;
        TLongObjectIterator tLongObjectIterator = this.sfu.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ArrayList<ffV> arrayList2 = ((ffs_0)tLongObjectIterator.value()).sfn.pd(n);
            if (arrayList == null) {
                arrayList = arrayList2;
                continue;
            }
            int n2 = arrayList2.size();
            for (int i = 0; i < n2; ++i) {
                arrayList.add(arrayList2.get(i));
            }
        }
        return arrayList;
    }

    public ffs_0 a(ffV ffV2, boolean bl, @Nullable ffs_0 ffs_02) {
        for (ffs_0 ffs_03 : this.d(fft_0.e(ffs_02))) {
            ArrayList<ffV> arrayList = ffs_03.sfn.pd(ffV2.avr());
            for (RT rT : arrayList) {
                boolean bl2;
                boolean bl3 = rT.n(ffV2);
                boolean bl4 = bl2 = bl || rT.bfd() + ffV2.bfd() <= ffV2.bfe();
                if (!bl3 || rT.bfd() >= ffV2.bfe() || !bl2) continue;
                return ffs_03;
            }
        }
        return null;
    }

    public ffs_0 k(ffV ffV2, boolean bl) {
        return this.a(ffV2, bl, (ffs_0)null);
    }

    public ffs_0 cx(ffV ffV2) {
        return this.k(ffV2, false);
    }

    public Optional<Bu<ffs_0, Short>> cy(ffV ffV2) {
        TLongObjectIterator tLongObjectIterator = this.sfu.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ffs_0 ffs_02 = (ffs_0)tLongObjectIterator.value();
            short s = ffs_02.beO();
            if (s < 0 || !ffs_02.bq(ffV2)) continue;
            return Optional.of(new Bu<ffs_0, Short>(ffs_02, s));
        }
        return Optional.empty();
    }

    protected final ArrayList<ffs_0> d(Comparator<ffs_0> comparator) {
        ArrayList<ffs_0> arrayList = new ArrayList<ffs_0>();
        this.sfu.forEachValue((TObjectProcedure)new ffw(this, arrayList));
        arrayList.sort(comparator);
        return arrayList;
    }

    public List<ffs_0> fVj() {
        return this.d(sfs);
    }

    public boolean ba(ffV ffV2) {
        TLongObjectIterator tLongObjectIterator = this.sfu.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            RU<ffV> rU = ((ffs_0)tLongObjectIterator.value()).sfn.beR();
            if (rU == null || rU.a(((ffs_0)tLongObjectIterator.value()).sfn, ffV2) < 0) continue;
            return true;
        }
        return false;
    }

    public ffs_0 x(RT rT) {
        TLongObjectIterator tLongObjectIterator = this.sfu.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            if (!((ffs_0)tLongObjectIterator.value()).sfn.dM(rT.LV())) continue;
            return (ffs_0)tLongObjectIterator.value();
        }
        return null;
    }

    public boolean fa(long l) {
        TLongObjectIterator tLongObjectIterator = this.sfu.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            if (!((ffs_0)tLongObjectIterator.value()).sfn.dM(l)) continue;
            return true;
        }
        return false;
    }

    public boolean a(ffk_0 ffk_02) {
        return !this.sfv.contains(ffk_02) && this.sfv.add(ffk_02);
    }

    public boolean b(ffk_0 ffk_02) {
        return this.sfv.remove(ffk_02);
    }

    public void f(ffs_0 ffs_02) {
        this.sfu.put(ffs_02.Lx(), (Object)ffs_02);
        this.a(ffs_02);
        for (int i = 0; i < this.sfv.size(); ++i) {
            this.sfv.get(i).a(ffs_02);
        }
    }

    public ffs_0 tc(long l) {
        ffs_0 ffs_02 = (ffs_0)this.sfu.remove(l);
        this.b(ffs_02);
        for (int i = 0; i < this.sfv.size(); ++i) {
            this.sfv.get(i).b(ffs_02);
        }
        return ffs_02;
    }

    protected abstract void a(ffs_0 var1);

    protected abstract void b(ffs_0 var1);

    public void clean() {
        this.fVk();
        this.sfv.clear();
    }

    public void fVk() {
        TLongObjectIterator tLongObjectIterator = this.sfu.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            for (int i = 0; i < this.sfv.size(); ++i) {
                this.sfv.get(i).b((ffs_0)tLongObjectIterator.value());
            }
        }
        this.sfu.clear();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public List<ffY> a(int n, int n2, @Nullable Sp sp) {
        ArrayList<ffY> arrayList = new ArrayList<ffY>();
        int n3 = 0;
        TLongObjectIterator tLongObjectIterator = this.sfu.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ffs_0 ffs_02 = (ffs_0)tLongObjectIterator.value();
            if (sp != null) {
                ffs_02.sfn.a(sp);
            }
            try {
                ArrayList<ffV> arrayList2 = ffs_02.pd(n);
                if (arrayList2.isEmpty()) continue;
                for (int i = arrayList2.size() - 1; i >= 0; --i) {
                    ffV ffV2 = arrayList2.get(i);
                    short s = (short)Math.min(n2 - n3, ffV2.bfd());
                    arrayList.add(new ffY(ffV2, s));
                    ffs_02.sfn.b(ffV2.LV(), -s);
                    if ((n3 += s) != n2) continue;
                    ArrayList<ffY> arrayList3 = arrayList;
                    return arrayList3;
                }
            }
            finally {
                if (sp == null) continue;
                ffs_02.sfn.b(sp);
            }
        }
        return arrayList;
    }

    public int UN(int n) {
        int n2 = 0;
        TLongObjectIterator tLongObjectIterator = this.sfu.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ffs_0 ffs_02 = (ffs_0)tLongObjectIterator.value();
            ArrayList<ffV> arrayList = ffs_02.sfn.pd(n);
            if (arrayList.isEmpty()) continue;
            for (int i = arrayList.size() - 1; i >= 0; --i) {
                ffV ffV2 = arrayList.get(i);
                n2 += ffV2.bfd();
            }
        }
        return n2;
    }

    public boolean g(ffV ffV2, int n) {
        int n2 = n;
        TLongObjectIterator tLongObjectIterator = this.sfu.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ffs_0 ffs_02 = (ffs_0)tLongObjectIterator.value();
            if ((n2 -= ffs_02.fVd() * ffV2.bfe()) <= 0) {
                return true;
            }
            for (ffV ffV3 : ffs_02) {
                if (ffV3 == null || !ffV2.n(ffV3) || (n2 -= ffV2.bfe() - ffV3.bfd()) > 0) continue;
                return true;
            }
        }
        return n2 <= 0;
    }

    public int b(TLongObjectIterator<ffV> tLongObjectIterator) {
        int n = 0;
        TByteIntHashMap tByteIntHashMap = new TByteIntHashMap();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ffV ffV2 = (ffV)tLongObjectIterator.value();
            for (ffs_0 ffs_02 : this.d(sft)) {
                RU<ffV> rU = ffs_02.beR();
                if (rU != null && rU.a(ffs_02.sfn, ffV2) != 0) continue;
                byte by = ffs_02.eDo();
                if (tByteIntHashMap.containsKey(by)) {
                    int n2 = tByteIntHashMap.get(by);
                    if (n2 == 0) continue;
                    tByteIntHashMap.put(by, n2 - 1);
                } else {
                    tByteIntHashMap.put(by, ffs_02.fVd() - 1);
                }
                ++n;
            }
        }
        return n;
    }

    public ArrayList<Long> cz(ffV ffV2) {
        ArrayList<Long> arrayList = new ArrayList<Long>();
        for (ffs_0 ffs_02 : this.d(sft)) {
            RU<ffV> rU = ffs_02.beR();
            if (rU != null && rU.a(ffs_02.sfn, ffV2) == -3) continue;
            arrayList.add(ffs_02.Lx());
        }
        return arrayList;
    }

    public int fVd() {
        TLongObjectIterator tLongObjectIterator = this.sfu.iterator();
        int n = 0;
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ffs_0 ffs_02 = (ffs_0)tLongObjectIterator.value();
            if (ffs_02.beR() instanceof fgF) continue;
            n += ffs_02.fVd();
        }
        return n;
    }

    public List<azx_1<@Nullable fgF, Integer>> fVl() {
        ArrayList<azx_1<@Nullable fgF, Integer>> arrayList = new ArrayList<azx_1<fgF, Integer>>(this.sfu.size());
        TLongObjectIterator tLongObjectIterator = this.sfu.iterator();
        int n = 0;
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ffs_0 ffs_02 = (ffs_0)tLongObjectIterator.value();
            if (ffs_02.beR() instanceof fgF) {
                if (ffs_02.fVd() <= 0) continue;
                arrayList.add(new azx_1<fgF, Integer>((fgF)ffs_02.beR(), ffs_02.fVd()));
                continue;
            }
            n += ffs_02.fVd();
        }
        arrayList.add(new azx_1<Object, Integer>(null, n));
        return arrayList;
    }

    public short cA(ffV ffV2) {
        short s = 0;
        for (ffs_0 ffs_02 : this.d(sft)) {
            try {
                if (!ffs_02.co(ffV2)) continue;
                s = (short)(s + 1);
            }
            catch (sa_0 sa_02) {
                sfr.warn((Object)"L'inventaire de destination est plein, erreur de simulateAdd", (Throwable)sa_02);
            }
            catch (Sz sz) {
                sfr.error((Object)"l'item test\u00e9 est d\u00e9ja pr\u00e9sent dans l'inventaire cible. Erreur, ID Dupliqu\u00e9 ? ", (Throwable)sz);
            }
        }
        return s;
    }

    public int UO(int n) {
        ffV ffV3 = ffV.k(fgD.fXh().Vd(n));
        if (ffV3 == null) {
            return 0;
        }
        ffV3.ak((short)1);
        LU lU = new LU();
        TLongObjectIterator<ffs_0> tLongObjectIterator = this.fVg();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ffs_0 ffs_02 = (ffs_0)tLongObjectIterator.value();
            if (ffs_02.beR() != null && ffs_02.beR().a(ffs_02.fVb(), ffV3) < 0) continue;
            lU.nt(ffs_02.fVd() * ffV3.bfe());
            ffs_02.M((TObjectProcedure<ffV>)((TObjectProcedure)ffV2 -> {
                if (ffV2.avr() == n) {
                    lU.nt(ffV2.bfe() - ffV2.bfd());
                }
                return true;
            }));
        }
        return lU.aTn();
    }

    public ArrayList<ffV> pd(int n) {
        ArrayList<ffV> arrayList = new ArrayList<ffV>();
        TLongObjectIterator<ffs_0> tLongObjectIterator = this.fVg();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            arrayList.addAll(((ffs_0)tLongObjectIterator.value()).pd(n));
        }
        return arrayList;
    }

    public ArrayList<ffV> b(int n, RX rX) {
        ArrayList<ffV> arrayList = new ArrayList<ffV>();
        TLongObjectIterator<ffs_0> tLongObjectIterator = this.fVg();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            arrayList.addAll(((ffs_0)tLongObjectIterator.value()).b(n, rX));
        }
        return arrayList;
    }

    public ArrayList<ffV> b(RX rX) {
        ArrayList<ffV> arrayList = new ArrayList<ffV>();
        TLongObjectIterator<ffs_0> tLongObjectIterator = this.fVg();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            arrayList.addAll(((ffs_0)tLongObjectIterator.value()).b(rX));
        }
        return arrayList;
    }

    public ffs_0 gh(byte by) {
        TLongObjectIterator tLongObjectIterator = this.sfu.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ffs_0 ffs_02 = (ffs_0)tLongObjectIterator.value();
            if (ffs_02.eDo() != by) continue;
            return ffs_02;
        }
        return null;
    }

    public ffs_0 td(long l) {
        TLongObjectIterator tLongObjectIterator = this.sfu.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ffs_0 ffs_02 = (ffs_0)tLongObjectIterator.value();
            if (ffs_02.Lx() != l) continue;
            return ffs_02;
        }
        return null;
    }

    public Optional<ffs_0> te(long l) {
        TLongObjectIterator tLongObjectIterator = this.sfu.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ffs_0 ffs_02 = (ffs_0)tLongObjectIterator.value();
            if (!ffs_02.dM(l)) continue;
            return Optional.of(ffs_02);
        }
        return Optional.empty();
    }

    public boolean M(TObjectProcedure<ffV> tObjectProcedure) {
        TLongObjectIterator tLongObjectIterator = this.sfu.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            if (((ffs_0)tLongObjectIterator.value()).M(tObjectProcedure)) continue;
            return false;
        }
        return true;
    }

    protected String dRB() {
        return "";
    }

    public String toString() {
        return "AbstractBagContainer{m_bagsById=" + String.valueOf(this.sfu) + "}";
    }
}

