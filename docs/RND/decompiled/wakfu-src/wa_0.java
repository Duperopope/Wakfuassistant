/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  gnu.trove.list.array.TShortArrayList
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import gnu.trove.list.array.TShortArrayList;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from WA
 */
public class wa_0 {
    private static boolean bOt = false;
    private static boolean bOu = false;
    private static long brw;
    private static String bOv;
    private static final wt_0[] bOw;
    private static final sq_0 bOx;
    static final Logger bOy;
    private static final TLongObjectHashMap<wy_0> bOz;
    private static final ThreadLocal<TLongObjectHashMap<wy_0>> bOA;
    private static final TLongObjectHashMap<ww_0> bOB;
    private static final ThreadLocal<TLongObjectHashMap<ww_0>> bOC;
    private static final Object bOD;
    private static boolean bOE;
    protected static Supplier<TLongObjectHashMap<wy_0>> bOF;
    protected static Supplier<TLongObjectHashMap<ww_0>> bOG;
    private static final LoadingCache<String, byte[]> bOH;
    private static Vy bOI;

    public static void i(short s, short s2) {
        assert (bOI != null) : " Appel\u00e9 enableAsyncLoading lors de l'initialisation de l'appli";
        long l = wa_0.a(brw, (long)s, (long)s2, 0);
        bOI.a(l, new WC(s, s2));
    }

    public static void bmq() {
        if (bOI != null) {
            bOy.fatal((Object)"Async loader is already enabled, not compatible with thread local. Are you sure you should be doing this?", (Throwable)new Exception());
        }
        bOF = bOA::get;
        bOG = bOC::get;
        bOE = false;
    }

    public static void bmr() {
        bOF = () -> bOz;
        bOG = () -> bOB;
        bOE = true;
    }

    private wa_0() {
    }

    public static void bms() {
        bOt = true;
    }

    public static void bmt() {
        if (!bOE) {
            bOy.fatal((Object)"Process is not synchronized, if there are multiple threads you may get concurrency issues. Are you sure you should be doing this?", (Throwable)new Exception());
        }
        bOI = new Vy("topology loader");
    }

    public static void bt(boolean bl) {
        bOu = bl;
    }

    public static boolean bmu() {
        return bOt;
    }

    public static void cL(String string) {
        try {
            bOv = fo_0.bA(string).toString();
            if (!bOv.endsWith("/")) {
                bOv = bOv + "/";
            }
        }
        catch (IOException iOException) {
            bOy.error((Object)("Invalid path : " + string), (Throwable)iOException);
        }
    }

    public static long bhh() {
        assert (bOt) : "Can't get worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations";
        return brw;
    }

    public static void fy(long l) {
        assert (bOt) : "Can't set worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations";
        brw = l;
    }

    private static String a(long l, short s, short s2) {
        assert (bOv != null && bOv.contains("%d") && bOv.endsWith("/"));
        return String.format(bOv, l) + s + "_" + s2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void b(long l, short s, short s2) {
        long l2 = wa_0.a(l, (long)s, (long)s2, 0);
        if (bOE) {
            Object object = bOD;
            synchronized (object) {
                wa_0.a(l, s, s2, l2);
            }
        } else {
            wa_0.a(l, s, s2, l2);
        }
    }

    private static void a(long l, short s, short s2, long l2) {
        byte[] byArray;
        if (bOG.get().contains(l2)) {
            return;
        }
        String string = wa_0.a(l, s, s2);
        try {
            byArray = (byte[])bOH.get((Object)string);
        }
        catch (ExecutionException executionException) {
            bOy.error((Object)("Unable to get map (" + s + "; " + s2 + ";" + l + ") in CACHE"));
            throw new FileNotFoundException("Unable to get map (" + s + "; " + s2 + ";" + l + ") in CACHE");
        }
        apl_1 apl_12 = apl_1.dw(byArray);
        byte by = apl_12.aIy();
        ww_0 ww_02 = wx_0.ak(by);
        if (ww_02 == null) {
            bOy.error((Object)("Unable to create map (" + s + "; " + s2 + ";" + l + ")"));
            return;
        }
        ww_02.a(apl_12);
        assert (vz_0.qd(ww_02.bap) == s && vz_0.qe(ww_02.baq) == s2);
        bOG.get().put(l2, (Object)ww_02);
    }

    public static void j(short s, short s2) {
        assert (bOt) : "Can't loadMap without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations";
        wa_0.b(brw, s, s2);
        wa_0.b(brw, s, s2, (short)0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void k(short s, short s2) {
        assert (bOt) : "Can't loadMap without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations";
        long l = wa_0.a(brw, (long)s, (long)s2, 0);
        if (bOI != null) {
            bOI.fw(l);
        }
        if (bOE) {
            Object object = bOD;
            synchronized (object) {
                bOG.get().remove(l);
                bOF.get().remove(l);
            }
        } else {
            bOG.get().remove(l);
            bOF.get().remove(l);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static wy_0 a(long l, short s, short s2, short s3) {
        long l2 = wa_0.a(l, (long)s, (long)s2, (int)s3);
        if (bOI != null) {
            bOI.fv(l2);
        }
        if (bOE) {
            Object object = bOD;
            synchronized (object) {
                return (wy_0)bOF.get().get(l2);
            }
        }
        return (wy_0)bOF.get().get(l2);
    }

    public static wy_0 l(short s, short s2) {
        assert (bOt) : "Can't getMap without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations";
        return wa_0.a(brw, s, s2, (short)0);
    }

    public static wy_0 a(long l, int n, int n2, short s) {
        short s2 = (short)vz_0.qd(n);
        short s3 = (short)vz_0.qe(n2);
        return wa_0.a(l, s2, s3, s);
    }

    public static wy_0 aQ(int n, int n2) {
        assert (bOt) : "Can't getMapFromCell without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations";
        return wa_0.a(brw, n, n2, (short)0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void reset() {
        if (bOI != null) {
            bOI.bkv();
        }
        if (bOE) {
            Object object = bOD;
            synchronized (object) {
                bOG.get().clear();
                bOF.get().clear();
            }
        } else {
            bOG.get().clear();
            bOF.get().clear();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static wy_0 b(long l, short s, short s2, short s3) {
        long l2 = wa_0.a(l, (long)s, (long)s2, (int)s3);
        if (bOE) {
            Object object = bOD;
            synchronized (object) {
                return wa_0.b(l, s, s2, l2);
            }
        }
        return wa_0.b(l, s, s2, l2);
    }

    @NotNull
    private static wy_0 b(long l, short s, short s2, long l2) {
        wy_0 wy_02 = (wy_0)bOF.get().get(l2);
        if (wy_02 != null) {
            return wy_02;
        }
        long l3 = l2 & 0xFFFFFFFFFFFF0000L;
        ww_0 ww_02 = (ww_0)bOG.get().get(l3);
        assert (ww_02 != null) : "The cell (" + s + "; " + s2 + ") in world " + l + " belongs to a map not loaded";
        wy_02 = new wy_0(ww_02);
        bOF.get().put(l2, (Object)wy_02);
        return wy_02;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void b(long l, int n, int n2, short s) {
        long l2 = wa_0.a(l, (long)n, (long)n2, (int)s);
        if (bOE) {
            Object object = bOD;
            synchronized (object) {
                bOF.get().remove(l2);
            }
        } else {
            bOF.get().remove(l2);
        }
    }

    public static void a(long l, short s, int n, int n2, int n3, int n4, int n5, wz_0 wz_02) {
        int n6;
        wz_02.reset();
        if (n > n3) {
            n6 = n;
            n = n3;
            n3 = n6;
        }
        if (n2 > n4) {
            n6 = n2;
            n2 = n4;
            n4 = n6;
        }
        n6 = vz_0.qd(n -= n5);
        int n7 = vz_0.qe(n2 -= n5);
        int n8 = vz_0.qd(n3 += n5);
        int n9 = vz_0.qe(n4 += n5);
        for (int i = n7; i <= n9; ++i) {
            for (int j = n6; j <= n8; ++j) {
                wy_0 wy_02 = wa_0.a(l, (short)j, (short)i, s);
                wz_02.a(wy_02, j, i);
            }
        }
    }

    public static void a(long l, short s, int n, int n2, int n3, wz_0 wz_02) {
        wa_0.a(l, s, n, n2, n, n2, n3, wz_02);
    }

    public static void a(int n, int n2, int n3, int n4, wz_0 wz_02) {
        assert (bOt) : "Can't getTopologyMapInstances without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations";
        wa_0.a(brw, (short)0, n, n2, n3, n4, 9, wz_02);
    }

    public static void a(short s, byte by, short s2) {
        bOx.a(s, by, s2, true);
    }

    public static boolean g(int n, int n2, int n3) {
        wy_0 wy_02 = wa_0.aQ(n, n2);
        if (wy_02 == null) {
            return false;
        }
        try {
            int n4 = wy_02.bmp().a(n, n2, bOw, 0);
            for (int i = 0; i < n4; ++i) {
                wt_0 wt_02 = bOw[i];
                if (wt_02 == null || wt_02.ban != n3 || !wt_02.bmg()) continue;
                return true;
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            bOy.error((Object)"", (Throwable)arrayIndexOutOfBoundsException);
        }
        return false;
    }

    public static boolean h(int n, int n2, int n3) {
        wy_0 wy_02 = wa_0.aQ(n, n2);
        if (wy_02 == null) {
            return false;
        }
        try {
            int n4 = wy_02.bmp().a(n, n2, bOw, 0);
            for (int i = 0; i < n4; ++i) {
                wt_0 wt_02 = bOw[i];
                if (wt_02 == null || wt_02.ban != n3 || !wt_02.bmj()) continue;
                return true;
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            bOy.error((Object)"", (Throwable)arrayIndexOutOfBoundsException);
        }
        return false;
    }

    public static boolean i(int n, int n2, int n3) {
        wy_0 wy_02 = wa_0.aQ(n, n2);
        if (wy_02 == null) {
            return false;
        }
        try {
            int n4 = wy_02.bmp().a(n, n2, bOw, 0);
            for (int i = 0; i < n4; ++i) {
                wt_0 wt_02 = bOw[i];
                if (wt_02 == null || wt_02.ban != n3 || !wt_02.bmh()) continue;
                return true;
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            bOy.error((Object)"", (Throwable)arrayIndexOutOfBoundsException);
        }
        return false;
    }

    public static boolean l(int n, int n2, int n3) {
        wy_0 wy_02 = wa_0.aQ(n, n2);
        if (wy_02 == null) {
            return false;
        }
        try {
            int n4 = wy_02.bmp().a(n, n2, bOw, 0);
            for (int i = 0; i < n4; ++i) {
                wt_0 wt_02 = bOw[i];
                if (wt_02 == null || wt_02.ban != n3 || !wt_02.bmk()) continue;
                return true;
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            bOy.error((Object)"", (Throwable)arrayIndexOutOfBoundsException);
        }
        return false;
    }

    public static boolean k(int n, int n2, int n3) {
        wy_0 wy_02 = wa_0.aQ(n, n2);
        if (wy_02 == null) {
            return false;
        }
        try {
            int n4 = wy_02.bmp().a(n, n2, bOw, 0);
            for (int i = 0; i < n4; ++i) {
                wt_0 wt_02 = bOw[i];
                if (wt_02 == null || wt_02.ban != n3 || !wt_02.bml()) continue;
                return true;
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            bOy.error((Object)"", (Throwable)arrayIndexOutOfBoundsException);
        }
        return false;
    }

    public static boolean j(int n, int n2, int n3) {
        wy_0 wy_02 = wa_0.aQ(n, n2);
        if (wy_02 == null) {
            return false;
        }
        try {
            int n4 = wy_02.bmp().a(n, n2, bOw, 0);
            for (int i = 0; i < n4; ++i) {
                wt_0 wt_02 = bOw[i];
                if (wt_02 == null || wt_02.ban != n3 || !wt_02.bmk()) continue;
                return true;
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            bOy.error((Object)"", (Throwable)arrayIndexOutOfBoundsException);
        }
        return false;
    }

    public static short v(int n, int n2, short s) {
        int n3;
        assert (bOt) : "Can't getTopologyMapInstances without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations";
        assert (!bOu) : "Can't call getPossibleNearestWalkableZ in a 'thread safe aware' environnement. See TopologyMapManager.setLimitToThreadSafeMethods for more informations";
        wy_0 wy_02 = wa_0.aQ(n, n2);
        if (wy_02 == null || wy_02.aJ(n, n2)) {
            return Short.MIN_VALUE;
        }
        try {
            n3 = wy_02.bmp().a(n, n2, bOw, 0);
            wa_0.b(wy_02, 0, n3);
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            bOy.error((Object)"", (Throwable)arrayIndexOutOfBoundsException);
        }
        n3 = wy_02.bmp().a(n, n2, bOw, 0);
        wa_0.b(wy_02, 0, n3);
        return wv_0.a(0, n3, bOw, (short)(s + bOx.bgb()), bOx.bga());
    }

    public static short aR(int n, int n2) {
        assert (bOt) : "Can't getTopologyMapInstances without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations";
        return wa_0.c(brw, n, n2, (short)0);
    }

    public static short c(long l, int n, int n2, short s) {
        int n3;
        assert (!bOu) : "Can't call getHighestWalkableZ in a 'thread safe aware' environnement. See TopologyMapManager.setLimitToThreadSafeMethods for more informations";
        wy_0 wy_02 = wa_0.a(l, n, n2, s);
        if (wy_02 == null) {
            bOy.error((Object)("The cell (" + n + "; " + n2 + ", instance " + l + ") belongs to a map not loaded"));
            return Short.MIN_VALUE;
        }
        if (wy_02.aJ(n, n2)) {
            return Short.MIN_VALUE;
        }
        try {
            n3 = wy_02.bmp().a(n, n2, bOw, 0);
            wa_0.b(wy_02, 0, n3);
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            bOy.error((Object)"", (Throwable)arrayIndexOutOfBoundsException);
        }
        n3 = wy_02.bmp().a(n, n2, bOw, 0);
        wa_0.b(wy_02, 0, n3);
        return wv_0.a(0, n3, bOw, (short)Short.MAX_VALUE, bOx.bga());
    }

    public static short w(int n, int n2, short s) {
        assert (bOt) : "Can't getTopologyMapInstances without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations";
        return wa_0.a(brw, n, n2, s, (short)0);
    }

    public static boolean x(int n, int n2, short s) {
        assert (bOt) : "Can't getTopologyMapInstances without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations";
        return !wa_0.g(n, n2, s);
    }

    public static short a(long l, int n, int n2, short s, short s2) {
        short s3;
        assert (!bOu) : "Can't call getNearestWalkableZ in a 'thread safe aware' environnement. See TopologyMapManager.setLimitToThreadSafeMethods for more informations";
        wy_0 wy_02 = wa_0.a(l, n, n2, s2);
        if (wy_02 == null) {
            bOy.warn((Object)("MapInstance is null for parameters : worldId=" + l + ", pos=[" + n + ";" + n2 + "], InstanceUid=" + s2));
            return Short.MIN_VALUE;
        }
        if (wy_02.aJ(n, n2)) {
            return Short.MIN_VALUE;
        }
        int n3 = wy_02.bmp().a(n, n2, bOw, 0);
        wa_0.b(wy_02, 0, n3);
        int n4 = Short.MAX_VALUE;
        int s32 = Short.MIN_VALUE;
        for (int i = 0; i < n3; ++i) {
            int n5;
            wt_0 wt_02 = bOw[i];
            if (wt_02.bNP == -1 || wt_02.ban == Short.MIN_VALUE || wt_02.bNr || (n5 = Math.abs(wt_02.ban - s)) >= n4) continue;
            n4 = (short)n5;
            s3 = wt_02.ban;
        }
        return s3;
    }

    @Nullable
    public static acd_1 a(long l, short s, acd_1 acd_12, int n) {
        return wa_0.a(l, s, acd_12.getX(), acd_12.getY(), acd_12.bdi(), n);
    }

    @Nullable
    public static acd_1 a(long l, short s, int n, int n2, short s2, int n3) {
        assert (!bOu) : "Can't call getNearestWalkableZ in a 'thread safe aware' environnement. See TopologyMapManager.setLimitToThreadSafeMethods for more informations";
        wy_0 wy_02 = wa_0.a(l, n, n2, s);
        if (wy_02 == null) {
            return null;
        }
        for (int i = 1; i <= n3; ++i) {
            short s3;
            int n4;
            int n5;
            int n6;
            for (n6 = 0; n6 < i; ++n6) {
                n5 = n + i - n6;
                n4 = n2 - n6;
                s3 = wa_0.a(l, n5, n4, s2, s);
                if (s3 == Short.MIN_VALUE) continue;
                return new acd_1(n5, n4, s3);
            }
            for (n6 = 0; n6 < i; ++n6) {
                n5 = n - n6;
                n4 = n2 - i + n6;
                s3 = wa_0.a(l, n5, n4, s2, s);
                if (s3 == Short.MIN_VALUE) continue;
                return new acd_1(n5, n4, s3);
            }
            for (n6 = 0; n6 < i; ++n6) {
                n5 = n - i + n6;
                n4 = n2 + n6;
                s3 = wa_0.a(l, n5, n4, s2, s);
                if (s3 == Short.MIN_VALUE) continue;
                return new acd_1(n5, n4, s3);
            }
            for (n6 = 0; n6 < i; ++n6) {
                n5 = n + n6;
                n4 = n2 + i - n6;
                s3 = wa_0.a(l, n5, n4, s2, s);
                if (s3 == Short.MIN_VALUE) continue;
                return new acd_1(n5, n4, s3);
            }
        }
        return null;
    }

    public static short y(int n, int n2, short s) {
        assert (bOt) : "Can't getTopologyMapInstances without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations";
        return wa_0.b(brw, n, n2, s, (short)0);
    }

    public static short b(long l, int n, int n2, short s, short s2) {
        assert (!bOu) : "Can't call getNearestZ in a 'thread safe aware' environnement. See TopologyMapManager.setLimitToThreadSafeMethods for more informations";
        wy_0 wy_02 = wa_0.a(l, n, n2, s2);
        if (wy_02 == null) {
            return Short.MIN_VALUE;
        }
        int n3 = wy_02.bmp().a(n, n2, bOw, 0);
        int n4 = Short.MAX_VALUE;
        short s3 = s;
        for (int i = 0; i < n3; ++i) {
            int n5 = Math.abs(wa_0.bOw[i].ban - s);
            if (n5 >= n4) continue;
            n4 = (short)n5;
            s3 = wa_0.bOw[i].ban;
        }
        return s3;
    }

    public static boolean z(int n, int n2, short s) {
        assert (bOt) : "Can't isIndoor without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations";
        return wa_0.c(brw, n, n2, s, (short)0);
    }

    public static boolean c(long l, int n, int n2, short s, short s2) {
        assert (!bOu) : "Can't call isIndoor in a 'thread safe aware' environnement. See TopologyMapManager.setLimitToThreadSafeMethods for more informations";
        wy_0 wy_02 = wa_0.a(l, n, n2, s2);
        assert (wy_02 != null) : "The cell (" + n + "; " + n2 + ") belongs to a map not loaded";
        return wy_02.f(n, n2, s);
    }

    public static boolean A(int n, int n2, short s) {
        assert (bOt) : "Can't isWalkable without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations";
        return wa_0.d(brw, n, n2, s, (short)0);
    }

    public static boolean d(long l, int n, int n2, short s, short s2) {
        assert (!bOu) : "Can't call isMoboSterile in a 'thread safe aware' environnement. See TopologyMapManager.setLimitToThreadSafeMethods for more informations";
        wy_0 wy_02 = wa_0.a(l, n, n2, s2);
        assert (wy_02 != null) : "The cell (" + n + "; " + n2 + ") belongs to a map not loaded";
        wt_0 wt_02 = wa_0.a(wy_02, n, n2, s);
        return wt_02 == null || wt_02.bmd();
    }

    public static boolean B(int n, int n2, short s) {
        assert (bOt) : "Can't isWalkable without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations";
        return wa_0.e(brw, n, n2, s, (short)0);
    }

    public static boolean e(long l, int n, int n2, short s, short s2) {
        assert (!bOu) : "Can't call isMoboSterile in a 'thread safe aware' environnement. See TopologyMapManager.setLimitToThreadSafeMethods for more informations";
        wy_0 wy_02 = wa_0.a(l, n, n2, s2);
        assert (wy_02 != null) : "The cell (" + n + "; " + n2 + ") belongs to a map not loaded";
        wt_0 wt_02 = wa_0.a(wy_02, n, n2, s);
        return wt_02 == null || wt_02.bmf();
    }

    public static boolean C(int n, int n2, short s) {
        assert (bOt) : "Can't isFightoSterile without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations";
        return wa_0.f(brw, n, n2, s, (short)0);
    }

    public static boolean f(long l, int n, int n2, short s, short s2) {
        assert (!bOu) : "Can't call isFightoSterile in a 'thread safe aware' environnement. See TopologyMapManager.setLimitToThreadSafeMethods for more informations";
        wy_0 wy_02 = wa_0.a(l, n, n2, s2);
        if (wy_02 == null) {
            bOy.warn((Object)("On essaye d'acc\u00e9der \u00e0 une cellule dans une map pas charg\u00e9e : (" + n + ", " + n2 + ")@" + l));
            return false;
        }
        wt_0 wt_02 = wa_0.a(wy_02, n, n2, s);
        return wt_02 == null || wt_02.bmc();
    }

    public static boolean D(int n, int n2, short s) {
        assert (bOt) : "Can't isFightoSterile without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations";
        return wa_0.g(brw, n, n2, s, (short)0);
    }

    public static boolean g(long l, int n, int n2, short s, short s2) {
        assert (!bOu) : "Can't call isIESterile in a 'thread safe aware' environnement. See TopologyMapManager.setLimitToThreadSafeMethods for more informations";
        wy_0 wy_02 = wa_0.a(l, n, n2, s2);
        if (wy_02 == null) {
            bOy.warn((Object)("On essaye d'acc\u00e9der \u00e0 une cellule dans une map pas charg\u00e9e : (" + n + ", " + n2 + ")@" + l));
            return false;
        }
        wt_0 wt_02 = wa_0.a(wy_02, n, n2, s);
        return wt_02 == null || wt_02.bme() || wt_02.bmf();
    }

    public static boolean j(int n, int n2, short s) {
        assert (bOt) : "Can't isWalkable without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations";
        return wa_0.h(brw, n, n2, s, (short)0);
    }

    public static boolean h(long l, int n, int n2, short s, short s2) {
        assert (!bOu) : "Can't call isWalkable in a 'thread safe aware' environnement. See TopologyMapManager.setLimitToThreadSafeMethods for more informations";
        wy_0 wy_02 = wa_0.a(l, n, n2, s2);
        if (wy_02 == null) {
            bOy.warn((Object)("[LD] The cell (" + n + "; " + n2 + "; " + s + ")  in map " + l + " belongs to a map not loaded"));
            return false;
        }
        if (wy_02.u(n, n2, s)) {
            return false;
        }
        return wa_0.a(wy_02, n, n2, s) != null;
    }

    public static short[] aS(int n, int n2) {
        assert (bOt) : "Can't getWalkableZ without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations";
        return wa_0.d(brw, n, n2, (short)0);
    }

    public static short[] d(long l, int n, int n2, short s) {
        assert (!bOu) : "Can't call getNearestZ in a 'thread safe aware' environnement. See TopologyMapManager.setLimitToThreadSafeMethods for more informations";
        wy_0 wy_02 = wa_0.a(l, n, n2, s);
        if (wy_02 == null || wy_02.aJ(n, n2)) {
            return Bv.auw;
        }
        int n3 = wy_02.bmp().a(n, n2, bOw, 0);
        TShortArrayList tShortArrayList = new TShortArrayList();
        for (int i = 0; i < n3; ++i) {
            if (wa_0.bOw[i].bNP == -1 || wa_0.bOw[i].bNr || wy_02.u(n, n2, wa_0.bOw[i].ban)) continue;
            tShortArrayList.add(wa_0.bOw[i].ban);
        }
        tShortArrayList.reverse();
        return tShortArrayList.toArray();
    }

    public static short[] aT(int n, int n2) {
        assert (bOt) : "Can't getWalkableZ without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations";
        return wa_0.e(brw, n, n2, (short)0);
    }

    public static short[] e(long l, int n, int n2, short s) {
        assert (!bOu) : "Can't call getNearestZ in a 'thread safe aware' environnement. See TopologyMapManager.setLimitToThreadSafeMethods for more informations";
        wy_0 wy_02 = wa_0.a(l, n, n2, s);
        if (wy_02 == null) {
            return Bv.auw;
        }
        int n3 = wy_02.bmp().a(n, n2, bOw, 0);
        short[] sArray = new short[n3];
        for (int i = 0; i < n3; ++i) {
            sArray[i] = wa_0.bOw[i].ban;
        }
        return sArray;
    }

    public static boolean b(int n, int n2, int n3, int n4, boolean bl) {
        int n5 = Math.abs(n3 - n);
        if (n5 > 1) {
            return false;
        }
        int n6 = Math.abs(n4 - n2);
        if (n6 > 1) {
            return false;
        }
        if (n5 != n6) {
            return true;
        }
        return bl && n5 != 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(long l, short s, short s2, short s3, ww_0 ww_02) {
        long l2 = wa_0.a(l, (long)s, (long)s2, (int)s3);
        if (bOE) {
            Object object = bOD;
            synchronized (object) {
                bOG.get().put(l2, (Object)ww_02);
                bOF.get().put(l2, (Object)new wy_0(ww_02));
            }
        } else {
            bOG.get().put(l2, (Object)ww_02);
            bOF.get().put(l2, (Object)new wy_0(ww_02));
        }
    }

    private static long a(long l, long l2, long l3, int n) {
        return (l2 += 32767L) << 48 | (l3 += 32767L) << 32 | (l & 0xFFFFL) << 16 | (long)(n & 0xFFFF);
    }

    private static wt_0 a(wy_0 wy_02, int n, int n2, short s) {
        if (wy_02.u(n, n2, s)) {
            return null;
        }
        int n3 = wy_02.bmp().a(n, n2, bOw, 0);
        for (int i = 0; i < n3; ++i) {
            if (wa_0.bOw[i].ban != s) continue;
            return wa_0.bOw[i].bNP == -1 ? null : bOw[i];
        }
        return null;
    }

    private static void b(wy_0 wy_02, int n, int n2) {
        for (int i = 0; i < n2; ++i) {
            wt_0 wt_02 = bOw[n + i];
            if (!wy_02.u(wt_02.bap, wt_02.baq, wt_02.ban)) continue;
            wt_02.bNP = (byte)-1;
        }
    }

    public static List<acd_1> a(acd_1 acd_13, boolean bl) {
        return wa_0.a(acd_13, 1, 1, bl, (acd_1 acd_12) -> true);
    }

    public static List<acd_1> a(acd_1 acd_13, int n, int n2, boolean bl) {
        return wa_0.a(acd_13, n, n2, bl, (acd_1 acd_12) -> true);
    }

    public static List<acd_1> a(acd_1 acd_12, int n, int n2, boolean bl, Predicate<acd_1> predicate) {
        abi_1[] abi_1Array;
        ArrayList<acd_1> arrayList = new ArrayList<acd_1>();
        block0: for (abi_1 abi_12 : abi_1Array = bl ? abi_1.bVP() : abi_1.bVQ()) {
            acd_1 acd_13 = new acd_1(acd_12);
            for (int i = n; i <= n2; ++i) {
                acd_13.e(abi_12);
                short s = wa_0.w(acd_13.getX(), acd_13.getY(), acd_13.bdi());
                if (s == Short.MIN_VALUE || !predicate.test(acd_13)) continue;
                acd_13.aM(s);
                arrayList.add(acd_13);
                continue block0;
            }
        }
        return arrayList;
    }

    public static void main(String[] stringArray) {
        long l;
        Object object;
        int n = 527;
        bOv = "jar:file:/C:/Users/nlion/IdeaProjects/wakfu-code/.contents/server/data/maps/tplg/%d.jar!/";
        try {
            wa_0.b(527L, (short)0, (short)0);
            object = wa_0.b(527L, (short)0, (short)0, (short)0);
        }
        catch (IOException iOException) {
            System.err.println("oops");
            iOException.printStackTrace();
            System.exit(1);
        }
        Thread.sleep(100L);
        object = new ArrayList();
        ArrayList<Long> arrayList = new ArrayList<Long>();
        System.out.println("Start sync testing");
        for (int i = 0; i < 20; ++i) {
            l = wa_0.bmv();
            object.add(l);
        }
        System.out.println("Start async testing");
        wa_0.bmq();
        try {
            wa_0.b(527L, (short)0, (short)0);
            wy_0 wy_02 = wa_0.b(527L, (short)0, (short)0, (short)0);
        }
        catch (IOException iOException) {
            System.err.println("oops");
            iOException.printStackTrace();
            System.exit(2);
        }
        for (int i = 0; i < 20; ++i) {
            l = wa_0.bmv();
            arrayList.add(l);
        }
        System.out.println("Synchronized mean time on " + object.size() + " timestamps :" + (float)((Long)object.stream().reduce(Math::addExact).get()).longValue() / (float)object.size() + "ms");
        System.out.println("Async mean time on " + arrayList.size() + " timestamps :" + (float)((Long)arrayList.stream().reduce(Math::addExact).get()).longValue() / (float)arrayList.size() + "ms");
        System.out.println("Timestamps: " + String.valueOf(object));
        System.out.println("Timestamps2: " + String.valueOf(arrayList));
    }

    private static long bmv() {
        long l = System.currentTimeMillis();
        Runnable runnable = () -> {
            try {
                wa_0.b(527L, (short)0, (short)0);
                wy_0 wy_02 = wa_0.b(527L, (short)0, (short)0, (short)0);
            }
            catch (IOException iOException) {
                System.err.println("Failed to load map");
                iOException.printStackTrace();
            }
            int n = 0;
            for (int i = 0; i < 1000; ++i) {
                for (int j = 0; j < 1000; ++j) {
                    wy_0 wy_03 = wa_0.a(527L, (short)0, (short)0, (short)0);
                    boolean bl = wy_03.g(i, j, 0);
                    if (!bl) continue;
                    ++n;
                }
            }
            if (n == 1000) {
                System.out.println("Count: " + n);
            }
        };
        ArrayList<Thread> arrayList = new ArrayList<Thread>();
        for (int i = 0; i < 10; ++i) {
            Thread thread = new Thread(runnable);
            arrayList.add(thread);
            thread.start();
        }
        for (Thread thread : arrayList) {
            thread.join();
        }
        long l2 = System.currentTimeMillis();
        System.out.println("Total time: " + (l2 - l) + "ms");
        return l2 - l;
    }

    static {
        bOw = wt_0.blX();
        bOx = new sq_0(-1, 0, -1, true);
        bOy = Logger.getLogger(wa_0.class);
        bOz = new TLongObjectHashMap();
        bOA = ThreadLocal.withInitial(TLongObjectHashMap::new);
        bOB = new TLongObjectHashMap();
        bOC = ThreadLocal.withInitial(TLongObjectHashMap::new);
        bOD = new Object();
        bOE = true;
        bOF = () -> bOz;
        bOG = () -> bOB;
        bOH = CacheBuilder.newBuilder().expireAfterAccess(30L, TimeUnit.SECONDS).build((CacheLoader)new WB());
    }
}

