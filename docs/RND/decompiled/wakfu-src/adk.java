/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.CellParticleSystem;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class adk {
    private static final boolean cjb = false;
    static final Logger cjc = Logger.getLogger(adk.class);
    private long brw = Integer.MIN_VALUE;
    private ahu_1 cjd;
    private agZ cje;
    protected adj cjf;
    protected String awN;
    protected adp cjg;
    private final Vy cjh = new Vy("EnvMap loader");
    protected final TLongObjectHashMap<adh> cji = new TLongObjectHashMap();
    private static final LoadingCache<String, byte[]> cjj = CacheBuilder.newBuilder().expireAfterAccess(30L, TimeUnit.SECONDS).build((CacheLoader)new adl());
    private static final adk cjk = new adk();

    private adk() {
    }

    public static adk buy() {
        return cjk;
    }

    public final void eo(String string) {
        this.awN = string;
    }

    public final void a(adp adp2) {
        this.cjg = adp2;
    }

    protected static long b(long l, long l2, long l3) {
        assert (l > -32768L && l < 32767L) : "faut pas d\u00e9conner non plus un short \u00e7a suffit pour la taille du monde";
        assert (l2 > -32768L && l2 < 32767L) : "faut pas d\u00e9conner non plus un short \u00e7a suffit pour la taille du monde";
        return (l += 32767L) << 48 | (l2 += 32767L) << 32 | (l3 & 0xFFFFL) << 16;
    }

    private static String a(String string, long l, short s, short s2) {
        assert (string != null && string.contains("%d") && string.endsWith("/"));
        return String.format(string, l) + s + "_" + s2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Nullable
    public final adh a(short s, short s2, long l) {
        long l2 = adk.b(s, s2, l);
        this.cjh.fv(l2);
        TLongObjectHashMap<adh> tLongObjectHashMap = this.cji;
        synchronized (tLongObjectHashMap) {
            return (adh)this.cji.get(l2);
        }
    }

    @Nullable
    public final adh a(int n, int n2, long l) {
        short s = (short)vz_0.qd(n);
        short s2 = (short)vz_0.qe(n2);
        return this.a(s, s2, l);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void b(short s, short s2, long l) {
        adh adh2;
        byte[] byArray;
        boolean bl;
        assert (this.cjg != null) : "Il faut d'abord appeler setMapFactory";
        long l2 = adk.b(s, s2, l);
        Object object = this.cji;
        synchronized (object) {
            bl = this.cji.contains(l2);
        }
        if (bl) {
            this.fI(l2);
            return;
        }
        object = adk.a(this.awN, l, s, s2);
        try {
            byArray = (byte[])cjj.get(object);
        }
        catch (ExecutionException executionException) {
            cjc.error((Object)("Unable to load map (" + object + ") in CACHE"));
            return;
        }
        if (byArray == null) {
            cjc.error((Object)("Unable to load map (" + object + ")"));
            return;
        }
        apl_1 apl_12 = apl_1.dw(byArray);
        byte by = apl_12.aIy();
        if (by != (adh2 = this.cjg.createMap()).bur()) {
            cjc.warn((Object)"version de map d'enviornenemt client incorrect");
        }
        this.a(adh2, apl_12);
        TLongObjectHashMap<adh> tLongObjectHashMap = this.cji;
        synchronized (tLongObjectHashMap) {
            this.cji.put(l2, (Object)adh2);
        }
    }

    public void a(@Nullable ahu_1 ahu_12) {
        this.cjd = ahu_12;
    }

    public void a(@Nullable agZ agZ2) {
        this.cje = agZ2;
    }

    public void fy(long l) {
        this.brw = l;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void fI(long l) {
        adh adh2;
        TLongObjectHashMap<adh> tLongObjectHashMap = this.cji;
        synchronized (tLongObjectHashMap) {
            adh2 = (adh)this.cji.get(l);
        }
        if (adh2 != null && !adh2.ciW) {
            this.c(adh2);
        }
    }

    protected void a(@NotNull adh adh2, @NotNull apl_1 apl_12) {
        adh2.a(apl_12);
        this.c(adh2);
    }

    private void c(@NotNull adh adh2) {
        if (adh2.ciW) {
            cjc.error((Object)("chargement d'une map d\u00e9j\u00e0 charg\u00e9e  " + this.g(adh2)));
            return;
        }
        this.e(adh2);
        this.d(adh2);
        adh2.ciW = true;
        if (this.cjf != null) {
            this.cjf.a(adh2);
        }
    }

    private void d(adh adh2) {
        adG[] adGArray = adh2.but();
        if (adGArray == null || this.cjd == null) {
            return;
        }
        for (int i = 0; i < adGArray.length; ++i) {
            try {
                adG adG2 = adGArray[i];
                aeI aeI2 = aeH.bwA().sb(adG2.cip);
                int n = adh2.rM(adG2.bal);
                int n2 = adh2.rN(adG2.bam);
                assert (adG2.cku == null);
                adG2.cku = this.cjd.a(aeI2, n, n2, adG2.ban);
                continue;
            }
            catch (Exception exception) {
                cjc.error((Object)"", (Throwable)exception);
            }
        }
    }

    private void e(adh adh2) {
        adC[] adCArray = adh2.bus();
        if (adCArray == null || this.cje == null) {
            return;
        }
        for (int i = 0; i < adCArray.length; ++i) {
            this.a(adh2, adCArray[i]);
        }
    }

    private void a(adh adh2, adC adC2) {
        try {
            CellParticleSystem cellParticleSystem = agY.bzw().bG(adC2.cjT, adC2.cjU);
            if (cellParticleSystem == null) {
                cjc.warn((Object)("Erreur de cr\u00e9ation du systeme de particule " + String.valueOf(adC2)));
                return;
            }
            float f2 = (float)adh2.rM(adC2.bal) + (float)adC2.cjW / 100.0f;
            float f3 = (float)adh2.rN(adC2.bam) + (float)adC2.cjX / 100.0f;
            float f4 = (float)adC2.ban + (float)adC2.cjY / 10.0f;
            cellParticleSystem.r(f2, f3, f4);
            cellParticleSystem.cX(adC2.cjV);
            cellParticleSystem.au(adC2.cjZ);
            assert (adC2.cjS == null);
            adC2.cjS = cellParticleSystem;
            this.cje.a(cellParticleSystem);
        }
        catch (Exception exception) {
            cjc.error((Object)"", (Throwable)exception);
        }
    }

    public void i(short s, short s2) {
        long l = adk.b(s, s2, this.brw);
        this.cjh.a(l, new adm(this, s, s2));
    }

    public void j(short s, short s2) {
        assert (this.brw != Integer.MIN_VALUE) : "il faut d'abord appler setWorldId";
        this.b(s, s2, this.brw);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void v(short s, short s2) {
        long l = adk.b(s, s2, this.brw);
        this.w(s, s2);
        TLongObjectHashMap<adh> tLongObjectHashMap = this.cji;
        synchronized (tLongObjectHashMap) {
            this.cji.remove(l);
            this.cjh.fw(l);
        }
    }

    protected void f(@NotNull adh adh2) {
        adG[] adGArray;
        if (!adh2.ciW) {
            return;
        }
        adC[] adCArray = adh2.bus();
        if (adCArray != null && this.cje != null) {
            for (int i = 0; i < adCArray.length; ++i) {
                CellParticleSystem cellParticleSystem = adCArray[i].cjS;
                if (cellParticleSystem == null) continue;
                cellParticleSystem.bLI();
                adCArray[i].cjS = null;
            }
        }
        if ((adGArray = adh2.but()) != null && this.cjd != null) {
            for (int i = 0; i < adGArray.length; ++i) {
                agw_1 agw_12 = adGArray[i].cku;
                if (agw_12 == null) continue;
                agw_12.aZp();
                adGArray[i].cku = null;
            }
        }
        adh2.ciW = false;
        if (this.cjf != null) {
            this.cjf.b(adh2);
        }
    }

    private void w(short s, short s2) {
        adh adh2 = this.x(s, s2);
        if (adh2 == null) {
            cjc.warn((Object)("D\u00e9chargement d'une map non charg\u00e9e (" + s + " " + s2 + ")"));
            return;
        }
        this.f(adh2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void buz() {
        TLongObjectHashMap<adh> tLongObjectHashMap = this.cji;
        synchronized (tLongObjectHashMap) {
            this.cji.forEachValue((TObjectProcedure)new adn(this));
        }
    }

    @Nullable
    public final adh x(short s, short s2) {
        assert (this.brw != Integer.MIN_VALUE) : "il faut d'abord appeler setWorldId";
        return this.a(s, s2, this.brw);
    }

    @Nullable
    public final adh bv(int n, int n2) {
        assert (this.brw != Integer.MIN_VALUE) : "il faut d'abord appeler setWorldId";
        return this.a(n, n2, this.brw);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void reset() {
        TLongObjectHashMap<adh> tLongObjectHashMap = this.cji;
        synchronized (tLongObjectHashMap) {
            this.cji.forEachValue((TObjectProcedure)new ado(this));
            this.cji.clear();
        }
        this.brw = Integer.MIN_VALUE;
    }

    private String g(@NotNull adh adh2) {
        return "(" + adh2.bun() + " " + adh2.buo() + " @" + this.brw + ")";
    }

    public void a(adj adj2) {
        this.cjf = adj2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(short s, short s2, adh adh2) {
        long l = adk.b(s, s2, this.brw);
        TLongObjectHashMap<adh> tLongObjectHashMap = this.cji;
        synchronized (tLongObjectHashMap) {
            this.cji.put(l, (Object)adh2);
            this.c(adh2);
        }
    }
}

