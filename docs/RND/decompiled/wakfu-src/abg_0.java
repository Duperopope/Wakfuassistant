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
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;

/*
 * Renamed from abG
 */
public class abg_0
implements abi_0 {
    protected static Logger oO = Logger.getLogger(abg_0.class);
    private static final String cek = arn_2.bIc().bIe() + "textures/";
    private static final int cel = 30;
    private static final LoadingCache<String, axc_2> cem = CacheBuilder.newBuilder().expireAfterAccess(30L, TimeUnit.SECONDS).removalListener(removalNotification -> ((axc_2)removalNotification.getValue()).bsI()).build((CacheLoader)new abh_0());
    private final abw_1 cen;
    private float[] ceo = null;
    private int brs;
    private int brt;

    public abg_0(String string, abw_1 abw_12) {
        this.cen = abw_12;
        String string2 = cek + string;
        this.ei(string2);
    }

    void ei(String string) {
        axc_2 axc_22;
        try {
            axc_22 = (axc_2)cem.get((Object)string);
        }
        catch (ExecutionException executionException) {
            oO.error((Object)("Unable to get image (" + string + ") in CACHE"));
            return;
        }
        if (axc_22 == null) {
            oO.error((Object)("Unable to load image (" + string + ")"));
            return;
        }
        axj_2 axj_22 = axc_22.ve(0);
        this.brs = axj_22.getWidth();
        this.brt = axj_22.getHeight();
        this.ceo = new float[this.brt * this.brs];
        for (int i = 0; i < this.brt; ++i) {
            int n = i * this.brs;
            for (int j = 0; j < this.brs; ++j) {
                axb_2 axb_22 = axj_22.ck(j, i);
                this.ceo[n + j] = axb_22.aIU();
            }
        }
    }

    @Override
    public void a(float[] fArray, int n, int n2, int n3, int n4) {
        int n5;
        if (this.ceo == null) {
            return;
        }
        int n6 = n3 % this.brs;
        if (n6 < 0) {
            n6 += this.brs;
        }
        if ((n5 = n4 % this.brt) < 0) {
            n5 += this.brt;
        }
        if (this.cen == null) {
            for (int i = n5; i < n5 + n2; ++i) {
                int n7 = i % this.brt;
                int n8 = n7 * this.brs;
                int n9 = (i - n5) * n2 - n6;
                for (int j = n6; j < n6 + n; ++j) {
                    int n10 = j % this.brs;
                    fArray[n9 + j] = this.ceo[n8 + n10];
                }
            }
        } else {
            for (int i = n5; i < n5 + n2; ++i) {
                int n11 = i % this.brt;
                int n12 = n11 * this.brs;
                int n13 = (i - n5) * n2 - n6;
                for (int j = n6; j < n6 + n; ++j) {
                    int n14 = j % this.brs;
                    fArray[n13 + j] = this.cen.h(n14, n11, this.ceo[n12 + n14]);
                }
            }
        }
    }
}

