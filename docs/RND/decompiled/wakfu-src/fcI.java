/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectObjectProcedure
 *  gnu.trove.procedure.TObjectProcedure
 *  gnu.trove.set.hash.TLongHashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.procedure.TObjectObjectProcedure;
import gnu.trove.procedure.TObjectProcedure;
import gnu.trove.set.hash.TLongHashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class fcI {
    private static final Logger rUd = Logger.getLogger(fcI.class);

    private fcI() {
    }

    public static boolean fSM() {
        return ewo_0.oBF.k(ewr_0.oDy);
    }

    public static boolean fSN() {
        return ewo_0.oBF.k(ewr_0.oDg);
    }

    public static boolean fSO() {
        return ewo_0.oBF.k(ewr_0.oEf);
    }

    public static <T extends exP> T sh(long l) {
        long l2 = fcK.rUe.sq(l);
        if (l2 > 0L) {
            return fcL.rUh.sw(l2);
        }
        return null;
    }

    public static eww aa(long l, long l2) {
        if (fcI.si(l) != eww.oHf) {
            return eww.oHg;
        }
        if (l2 <= 0L) {
            return eww.oHf;
        }
        boolean bl = ewo_0.oBF.k(ewr_0.oCi);
        if (!bl && exc.oTP.contains(l2)) {
            return eww.oHh;
        }
        if (exc.oTT.contains(l2)) {
            return eww.oHh;
        }
        return eww.oHf;
    }

    public static eww si(long l) {
        if (l <= 0L) {
            return eww.oHf;
        }
        boolean bl = ewo_0.oBF.k(ewr_0.oCi);
        if (!bl && exc.oTP.contains(l)) {
            return eww.oHg;
        }
        if (exc.oTS.contains(l)) {
            return eww.oHg;
        }
        return eww.oHf;
    }

    public boolean sj(long l) {
        rUd.error((Object)new Exception("Can't check with common, try with client or server HeroUtils"));
        return false;
    }

    public static acd_1 sk(long l) {
        Object t = fcL.rUh.sw(fcK.rUe.sq(l));
        return t != null ? ((exP)t).aZw() : new acd_1();
    }

    public static int sl(long l) {
        Object t = fcL.rUh.sw(fcK.rUe.sq(l));
        return t != null ? ((exP)t).bcC() : 0;
    }

    public static int sm(long l) {
        Object t = fcL.rUh.sw(fcK.rUe.sq(l));
        return t != null ? ((exP)t).bcD() : 0;
    }

    public static int sn(long l) {
        Object t = fcL.rUh.sw(fcK.rUe.sq(l));
        return t != null ? ((exP)t).bcE() : (short)0;
    }

    public static <T extends exP> T ab(long l, long l2) {
        for (long l3 : fcL.rUh.sx(l)) {
            fft_0 fft_02;
            Object t = fcL.rUh.sw(l3);
            if (t == null || (fft_02 = ((exP)t).dod()) == null || !fft_02.sX(l2)) continue;
            return t;
        }
        return null;
    }

    public static <T extends exP> T ac(long l, long l2) {
        for (long l3 : fcL.rUh.sx(l)) {
            fft_0 fft_02;
            Object t = fcL.rUh.sw(l3);
            if (t == null || (fft_02 = ((exP)t).dod()) == null || !fft_02.fa(l2)) continue;
            return t;
        }
        return null;
    }

    public static <T extends exP> boolean a(long l, TObjectObjectProcedure<T, ffV> tObjectObjectProcedure) {
        for (long l2 : fcL.rUh.sx(l)) {
            Object t = fcL.rUh.sw(l2);
            if (t == null || ((exP)t).dod() == null || ((exP)t).dod().M((TObjectProcedure<ffV>)((TObjectProcedure)ffV2 -> tObjectObjectProcedure.execute(t, ffV2)))) continue;
            return false;
        }
        return true;
    }

    public static <T extends exP> void b(long l, TObjectObjectProcedure<T, ffV> tObjectObjectProcedure) {
        ArrayList arrayList = new ArrayList(fcL.rUh.sA(l));
        fcI.a(l, arrayList::add);
        for (exP exP2 : arrayList) {
            if (exP2 == null || exP2.dod() == null || exP2.dod().M((TObjectProcedure<ffV>)((TObjectProcedure)ffV2 -> tObjectObjectProcedure.execute((Object)exP2, ffV2)))) continue;
            return;
        }
    }

    public static boolean a(long l, fcJ fcJ2) {
        for (long l2 : fcL.rUh.sx(l)) {
            Object t = fcL.rUh.sw(l2);
            if (t == null || ((exP)t).dod() == null) continue;
            if (!((exP)t).dod().M((TObjectProcedure<ffV>)((TObjectProcedure)ffV2 -> fcJ2.apply((exP)t, (ffV)ffV2, false)))) {
                return false;
            }
            fhe fhe2 = ((exP)t).dnP();
            if (fhe2 == null || fhe2.c(ffV2 -> fcJ2.apply((exP)t, (ffV)ffV2, true))) continue;
            return false;
        }
        return true;
    }

    @Nullable
    public static <T extends exP> T ad(long l, long l2) {
        for (long l3 : fcL.rUh.sx(l)) {
            Object t = fcL.rUh.sw(l3);
            if (!((exP)t).dnP().C(l2)) continue;
            return t;
        }
        return null;
    }

    @Nullable
    public static <T extends exP> T ae(long l, long l2) {
        for (long l3 : fcL.rUh.sx(l)) {
            Object t = fcL.rUh.sw(l3);
            fhk fhk2 = ((exP)t).dmL();
            if (fhk2 == null || !fhk2.fa(l2)) continue;
            return t;
        }
        return null;
    }

    @Nullable
    public static <T extends exP> T af(long l, long l2) {
        for (exP exP2 : fcL.rUh.sz(l)) {
            if (!exP2.dnP().D(l2)) continue;
            return (T)exP2;
        }
        return null;
    }

    @Nullable
    public static <T extends exP> T ag(long l, long l2) {
        T t = fcI.ac(l, l2);
        if (t != null) {
            return t;
        }
        return fcI.ad(l, l2);
    }

    @Nullable
    public static <T extends exP> T ah(long l, long l2) {
        T t = fcI.ac(l, l2);
        if (t != null) {
            return t;
        }
        t = fcI.ad(l, l2);
        if (t != null) {
            return t;
        }
        return fcI.ai(l, l2);
    }

    @Nullable
    public static <T extends exP> T ai(long l, long l2) {
        for (long l3 : fcL.rUh.sx(l)) {
            feh_0 feh_02;
            Object t = fcL.rUh.sw(l3);
            if (t == null || (feh_02 = (feh_0)((ffh)t).a(fez_0.seq)) == null || !feh_02.sQ(l2)) continue;
            return t;
        }
        return null;
    }

    @Nullable
    public static ffV aj(long l, long l2) {
        Bu<Long, ffV> bu = fcI.ak(l, l2);
        if (bu != null) {
            return bu.aHI();
        }
        return null;
    }

    public static Optional<Bu<Long, ffV>> af(long l, int n) {
        for (long l2 : fcL.rUh.sx(l)) {
            fft_0 fft_02;
            Object t = fcL.rUh.sw(l2);
            if (t == null || (fft_02 = ((exP)t).dod()) == null) continue;
            for (ffs_0 ffs_02 : fft_02.fVh()) {
                if (!ffs_02.pb(n)) continue;
                return Optional.of(new Bu<Long, ffV>(l2, ffs_02.UH(n)));
            }
        }
        return Optional.empty();
    }

    public static Bu<Long, ffV> ak(long l, long l2) {
        for (long l3 : fcL.rUh.sx(l)) {
            fft_0 fft_02;
            Object t = fcL.rUh.sw(l3);
            if (t == null || (fft_02 = ((exP)t).dod()) == null || !fft_02.fa(l2)) continue;
            return new Bu<Long, ffV>(l3, fft_02.ta(l2).sV(l2));
        }
        return null;
    }

    @Nullable
    public static ffV al(long l, long l2) {
        Bu<Long, ffV> bu = fcI.am(l, l2);
        if (bu != null) {
            return bu.aHI();
        }
        return null;
    }

    public static Optional<Bu<Long, ffV>> ag(long l, int n) {
        for (long l2 : fcL.rUh.sx(l)) {
            fhe fhe2;
            Object t = fcL.rUh.sw(l2);
            if (t == null || (fhe2 = ((exP)t).dnP()) == null || !fhe2.pb(n)) continue;
            return Optional.of(new Bu<Long, ffV>(l2, fhe2.UH(n)));
        }
        return Optional.empty();
    }

    public static Bu<Long, ffV> am(long l, long l2) {
        for (long l3 : fcL.rUh.sx(l)) {
            Optional<ffV> optional;
            fhe fhe2;
            Object t = fcL.rUh.sw(l3);
            if (t == null || (fhe2 = ((exP)t).dnP()) == null || !(optional = fhe2.B(l2)).isPresent()) continue;
            return new Bu<Long, ffV>(l3, optional.get());
        }
        return null;
    }

    public static ffV an(long l, long l2) {
        ffV ffV2 = fcI.aj(l, l2);
        if (ffV2 != null) {
            return ffV2;
        }
        return fcI.al(l, l2);
    }

    @Nullable
    public static Bu<Long, ffV> ao(long l, long l2) {
        Bu<Long, ffV> bu = fcI.ak(l, l2);
        if (bu != null) {
            return bu;
        }
        return fcI.am(l, l2);
    }

    public static ffs_0 ap(long l, long l2) {
        for (long l3 : fcL.rUh.sx(l)) {
            fft_0 fft_02;
            Object t = fcL.rUh.sw(l3);
            if (t == null || (fft_02 = ((exP)t).dod()) == null || !fft_02.sX(l2)) continue;
            return fft_02.td(l2);
        }
        return null;
    }

    public static ffs_0 aq(long l, long l2) {
        for (long l3 : fcL.rUh.sx(l)) {
            fft_0 fft_02;
            Object t = fcL.rUh.sw(l3);
            if (t == null || (fft_02 = ((exP)t).dod()) == null || !fft_02.fa(l2)) continue;
            return fft_02.ta(l2);
        }
        return null;
    }

    public static int a(exP exP2, fdg_0 fdg_02) {
        TLongHashSet tLongHashSet = fcL.rUh.sx(exP2.Xi());
        return tLongHashSet.size() * fdg_02.fTL();
    }

    public static long a(fjm fjm2, fdg_0 fdg_02) {
        TLongHashSet tLongHashSet = fcL.rUh.sx(fjm2.Xi());
        return fdg_02.fTM() * tLongHashSet.size();
    }

    public static <T extends exP> void a(T t, Consumer<T> consumer) {
        if (t == null) {
            return;
        }
        if (consumer == null) {
            return;
        }
        boolean bl = fcK.rUe.aU(t);
        if (bl) {
            fcI.a(t.Xi(), consumer);
        } else {
            consumer.accept(t);
        }
    }

    public static <T extends exP> void a(long l, Consumer<T> consumer) {
        fcI.b(l, consumer);
        fcI.c(l, consumer);
    }

    private static <T extends exP> void b(long l, Consumer<T> consumer) {
        long l2 = fcK.rUe.sq(l);
        Object t = fcL.rUh.sw(l2);
        if (t == null) {
            return;
        }
        try {
            consumer.accept(t);
        }
        catch (RuntimeException runtimeException) {
            rUd.error((Object)"[HERO PROCEDURE] Exception raised when executing procedure on leader", (Throwable)runtimeException);
        }
    }

    private static <T extends exP> void c(long l, Consumer<T> consumer) {
        long l2 = fcK.rUe.sq(l);
        fcL.rUh.b(l, exP2 -> {
            if (exP2.Sn() == l2) {
                return true;
            }
            try {
                consumer.accept(exP2);
            }
            catch (RuntimeException runtimeException) {
                rUd.error((Object)"[HERO PROCEDURE] Exception raised when executing procedure on hero", (Throwable)runtimeException);
            }
            return true;
        });
    }

    public static <T extends exP> T so(long l) {
        return fcL.rUh.sw(fcK.rUe.sq(l));
    }

    public static <T extends exP> List<T> c(TLongHashSet tLongHashSet) {
        LinkedList linkedList = new LinkedList();
        tLongHashSet.forEach(l -> {
            Object t = fcL.rUh.sw(l);
            if (t != null) {
                if (((exP)t).dmc()) {
                    linkedList.add(t);
                } else {
                    linkedList.add(0, t);
                }
            }
            return true;
        });
        return linkedList;
    }

    public static <T extends exP> List<T> N(Collection<? extends exP> collection) {
        LinkedList<exP> linkedList = new LinkedList<exP>();
        for (exP exP2 : collection) {
            if (exP2 == null) continue;
            if (exP2.dmc()) {
                linkedList.add(exP2);
                continue;
            }
            linkedList.add(0, exP2);
        }
        return linkedList;
    }
}

