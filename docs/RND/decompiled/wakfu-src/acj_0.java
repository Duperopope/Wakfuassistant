/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  org.apache.log4j.Logger
 */
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;

/*
 * Renamed from acJ
 */
public class acj_0
implements acv_0 {
    private static final Logger chq = Logger.getLogger(acj_0.class);
    private final Vy chr = new Vy("LightMap loader");
    private final aah_1<ach_0> chs = new aah_1();
    private static final int cht = 30;
    private static final LoadingCache<String, byte[]> chu = CacheBuilder.newBuilder().expireAfterAccess(30L, TimeUnit.SECONDS).build((CacheLoader)new acK());
    private final Object chv = new Object();
    private long brw;
    private String bOv;
    private boolean chw = true;
    private static final acj_0 chx = new acj_0();

    public static acj_0 btR() {
        return chx;
    }

    private acj_0() {
    }

    public void cL(String string) {
        try {
            this.bOv = fq_0.bA(string).toString();
            if (!this.bOv.endsWith("/")) {
                this.bOv = this.bOv + "/";
            }
        }
        catch (IOException iOException) {
            chq.error((Object)("Invalid path : " + string), (Throwable)iOException);
        }
    }

    private static String a(String string, long l, short s, short s2) {
        assert (string != null && string.contains("%d") && string.endsWith("/"));
        return String.format(string, l) + s + "_" + s2;
    }

    public long bhh() {
        return this.brw;
    }

    public acG t(int n, int n2, int n3) {
        ach_0 ach_02 = this.bq(n, n2);
        return ach_02 == null ? null : ach_02.t(n, n2, n3);
    }

    private ach_0 bq(int n, int n2) {
        int n3 = GC.B((float)n / 18.0f);
        int n4 = GC.B((float)n2 / 18.0f);
        return this.chs.vK(GC.t(n3, n4));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void r(short s, short s2) {
        byte[] byArray;
        ach_0 ach_02 = new ach_0();
        String string = acj_0.a(this.bOv, this.brw, s, s2);
        try {
            byArray = (byte[])chu.get((Object)string);
        }
        catch (ExecutionException executionException) {
            chq.error((Object)("Unable to load map (" + s + ", " + s2 + ") in CACHE"));
            return;
        }
        if (byArray == null) {
            chq.error((Object)("Unable to load map (" + string + ")"));
            return;
        }
        apl_1 apl_12 = apl_1.dw(byArray);
        ach_02.d(apl_12);
        assert (vz_0.qd(ach_02.bap) == s && vz_0.qe(ach_02.baq) == s2);
        Object object = this.chv;
        synchronized (object) {
            this.chs.b(GC.d(s, s2), ach_02);
        }
        this.chw = true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void clean() {
        Object object = this.chv;
        synchronized (object) {
            this.chs.clear();
        }
        this.chr.bkv();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void co(float f2) {
        Object object = this.chv;
        synchronized (object) {
            for (int i = this.chs.bTR() - 1; i >= 0; --i) {
                this.chs.vU(i).cm(f2);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void cp(float f2) {
        Object object = this.chv;
        synchronized (object) {
            for (int i = this.chs.bTR() - 1; i >= 0; --i) {
                this.chs.vU(i).cn(f2);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void s(short s, short s2) {
        int n = GC.d(s, s2);
        Object object = this.chv;
        synchronized (object) {
            this.chs.wp(n);
        }
        this.chr.fw(n);
    }

    public boolean btS() {
        return this.chw;
    }

    public void cc(boolean bl) {
        this.chw = bl;
    }

    public void fy(long l) {
        this.brw = l;
    }

    @Override
    public final int bpb() {
        return 400;
    }

    @Override
    public void a(int n, int n2, int n3, int n4, float[] fArray) {
        acG acG2 = this.t(n, n2, n4);
        if (acG2 != null) {
            float[] fArray2 = acG2.btM();
            fArray[0] = fArray[0] * fArray2[0];
            fArray[1] = fArray[1] * fArray2[1];
            fArray[2] = fArray[2] * fArray2[2];
            float[] fArray3 = acG2.btN();
            if (fArray3 != null) {
                fArray[0] = fArray[0] + fArray3[0];
                fArray[1] = fArray[1] + fArray3[1];
                fArray[2] = fArray[2] + fArray3[2];
            }
        }
    }

    @Override
    public void qF(int n) {
    }

    @Override
    public boolean bpa() {
        return false;
    }

    public void i(short s, short s2) {
        int n = GC.d(s, s2);
        this.chr.a(n, () -> this.r(s, s2));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(short s, short s2, ach_0 ach_02) {
        int n = GC.d(s, s2);
        Object object = this.chv;
        synchronized (object) {
            this.chs.b(n, ach_02);
        }
        this.cc(true);
    }
}

