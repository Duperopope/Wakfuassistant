/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  aDm$aDp
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  org.apache.log4j.Logger
 */
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.concurrent.TimeUnit;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import org.apache.log4j.Logger;

/*
 * Renamed from aDm
 */
public abstract class adm_1<T>
implements adq_2 {
    private static final Logger dDn = Logger.getLogger(adm_1.class);
    private static final int dDo = 60;
    private static final TimeUnit dDp = TimeUnit.SECONDS;
    protected final aDp dDq = new adn_1(this, null);
    private String awN;
    private LoadingCache<String, aDp> bOH;
    private long dDr;
    private long dDs;
    private boolean dDt;

    protected adm_1(long l, boolean bl) {
        this.dDs = l;
        this.dDt = bl;
        this.bYh();
    }

    public abstract String bLX();

    public abstract FilenameFilter bLY();

    protected abstract aDp dC(byte[] var1);

    private static byte[] by(String string) {
        byte[] byArray;
        try {
            byArray = fo_0.by(string);
        }
        catch (IOException iOException) {
            dDn.error((Object)"Exception during readFile", (Throwable)iOException);
            byArray = Bv.auq;
        }
        return byArray;
    }

    aDp ha(String string) {
        adp_2 adp_22;
        assert (this.awN != null);
        assert (string != null);
        String string2 = this.awN + string;
        byte[] byArray = adm_1.by(string2);
        if (byArray.length == 0) {
            dDn.warn((Object)("Unable to open stream for file " + string2));
            adp_22 = this.dDq;
        } else {
            adp_22 = this.dC(byArray);
            this.dDr += adp_22.bLZ();
            assert (this.dDr >= 0L);
        }
        return adp_22;
    }

    public final T hb(String string) {
        assert (string != null);
        adp_2 adp_22 = this.dDt ? (adp_2)this.bOH.get((Object)string) : this.ha(string);
        return adp_22 != null ? (T)adp_22.bYi() : null;
    }

    public final void hy(long l) {
        this.dDs = l;
        this.bYh();
    }

    public final String bYf() {
        return this.awN;
    }

    public final void hc(String string) {
        assert (string != null);
        this.awN = string;
    }

    public void bYg() {
        this.bOH.cleanUp();
    }

    public void d(long l, float f2) {
        block12: {
            this.hy(l);
            assert (this.awN != null);
            l = (int)((float)this.dDs * f2);
            try {
                URL uRL = fo_0.bA(this.awN);
                if (uRL.getProtocol().equals("file")) {
                    File file = new File(uRL.getPath() + File.separator);
                    String[] stringArray = file.list(this.bLY());
                    for (int i = 0; i < stringArray.length && this.dDr < l; ++i) {
                        this.bOH.get((Object)stringArray[i]);
                    }
                    break block12;
                }
                if (!uRL.getProtocol().equals("jar")) break block12;
                JarFile jarFile = null;
                try {
                    jarFile = new JarFile(uRL.getPath());
                    Enumeration<JarEntry> enumeration = jarFile.entries();
                    while (enumeration.hasMoreElements() && this.dDr < l) {
                        String string = enumeration.nextElement().getName();
                        if (!string.endsWith(this.bLX())) continue;
                        this.bOH.get((Object)string);
                    }
                }
                catch (Exception exception) {
                    dDn.error((Object)"Exception during preload", (Throwable)exception);
                }
                if (jarFile != null) {
                    jarFile.close();
                }
            }
            catch (Exception exception) {
                dDn.error((Object)("Unable to preload content of " + this.awN + " from URL (try from file)"));
                try {
                    File file = new File(this.awN + File.separator);
                    String[] stringArray = file.list(this.bLY());
                    for (int i = 0; i < stringArray.length && this.dDr < l; ++i) {
                        this.bOH.get((Object)stringArray[i]);
                    }
                }
                catch (Exception exception2) {
                    dDn.error((Object)"Exception during preload", (Throwable)exception2);
                }
            }
        }
        dDn.info((Object)("PRELOAD " + String.valueOf(this)));
    }

    public void dB(boolean bl) {
        this.dDt = bl;
    }

    private void bYh() {
        this.bOH = CacheBuilder.newBuilder().expireAfterAccess(60L, dDp).maximumSize(this.dDs).build((CacheLoader)new ado_2(this));
    }

    @Override
    public void a(adr_2 adr_22) {
    }

    @Override
    public void hd(String string) {
    }

    @Override
    public void D(String string, String string2) {
    }

    @Override
    public void he(String string) {
    }

    @Override
    public void b(adr_2 adr_22) {
    }

    public String toString() {
        return this.getClass().getSimpleName() + ": cacheSize=" + this.bOH.size() + "\t size=" + this.dDr + "octets/ " + this.dDs;
    }
}

